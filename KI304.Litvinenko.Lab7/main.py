import sys

def generate_jagged_matrix(rows_num, filler):
    # Перевірка на довжину символу-заповнювача
    if len(filler) != 1:
        print("Помилка: будь ласка, введіть тільки один символ як заповнювач.")
        sys.exit(1)

    matrix = []

    for i in range(rows_num):
        row = []
        for j in range(rows_num):
            # Заштрихована область (рамка): верхній рядок, нижній рядок, перший стовпець, останній стовпець
            if i == 0 or i == rows_num - 1 or j == 0 or j == rows_num - 1:
                row.append(filler)
            else:
                row.append(" ")
        matrix.append(row)


    return matrix

def print_matrix(matrix):
    for row in matrix:
        print(" ".join(row))

if __name__ == "__main__":
    try:
        rows_num = int(input("Введіть розмір квадратної матриці: "))
        filler = input("Введіть символ-заповнювач: ")
        matrix = generate_jagged_matrix(rows_num, filler)
        print("Згенерована матриця:")
        print_matrix(matrix)
    except ValueError:
        print("Помилка: введено некоректний розмір матриці.")
        sys.exit(1)
