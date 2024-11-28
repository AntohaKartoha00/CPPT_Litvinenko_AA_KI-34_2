import math
import struct


# Функція для обчислення виразу y = (x - 4) / sin(3x - 1)
def calculate_expression(x):
    try:
        result = (x - 4) / math.sin(3 * x - 1)
        return result
    except ZeroDivisionError:
        error_message = "Помилка: Синус виразу sin(3x - 1) дорівнює нулю, неможливо поділити на нуль."
        print(error_message)
        save_error_to_files(error_message)
        return None
    except Exception as e:
        error_message = f"Неочікувана помилка під час обчислення: {e}"
        print(error_message)
        save_error_to_files(error_message)
        return None


# Функція для запису результату у текстовий файл
def write_to_text_file(content, filename="result.txt"):
    try:
        with open(filename, "w") as file:
            file.write(content)
    except Exception as e:
        print(f"Помилка при запису в текстовий файл: {e}")


# Функція для запису результату у бінарний файл
def write_to_binary_file(content, filename="result.bin"):
    try:
        with open(filename, "wb") as file:
            # Записуємо як рядок, закодований в бінарний формат
            file.write(content.encode('utf-8'))
    except Exception as e:
        print(f"Помилка при запису в бінарний файл: {e}")


# Функція для зчитування результату з текстового файлу
def read_from_text_file(filename="result.txt"):
    try:
        with open(filename, "r") as file:
            return file.read().strip()
    except FileNotFoundError:
        print("Помилка: Текстовий файл не знайдено.")
        return None
    except Exception as e:
        print(f"Неочікувана помилка при зчитуванні з текстового файлу: {e}")
        return None


# Функція для зчитування результату з бінарного файлу
def read_from_binary_file(filename="result.bin"):
    try:
        with open(filename, "rb") as file:
            return file.read().decode('utf-8').strip()
    except FileNotFoundError:
        print("Помилка: Бінарний файл не знайдено.")
        return None
    except Exception as e:
        print(f"Неочікувана помилка при зчитуванні з бінарного файлу: {e}")
        return None


# Функція для збереження повідомлення про помилку у текстовий та бінарний файли
def save_error_to_files(error_message):
    write_to_text_file(error_message)
    write_to_binary_file(error_message)


# Головна функція
def main():
    try:
        # Вхідне значення x
        x = float(input("Введіть значення x: "))

        # Обчислюємо вираз
        result = calculate_expression(x)

        # Якщо результат None, це означає, що була помилка, і обробка вже виконана
        if result is None:
            return

        # Якщо обчислення успішне, конвертуємо результат у рядок для запису у файли
        result_str = str(result)
        print(f"Обчислений результат: {result_str}")

        # Записуємо результат у файли
        write_to_text_file(result_str)
        write_to_binary_file(result_str)

        # Зчитуємо результат з файлів і виводимо
        text_result = read_from_text_file()
        binary_result = read_from_binary_file()

        if text_result is not None:
            print(f"Результат з текстового файлу: {text_result}")
        if binary_result is not None:
            print(f"Результат з бінарного файлу: {binary_result}")

    except ValueError:
        error_message = "Помилка: введено нечислове значення для x."
        print(error_message)
        save_error_to_files(error_message)
    except Exception as e:
        error_message = f"Неочікувана помилка: {e}"
        print(error_message)
        save_error_to_files(error_message)


if __name__ == "__main__":
    main()
