from advanced_player import AdvancedPlayer


def main():
    video = AdvancedPlayer("example_video.mp4")

    video.play()
    video.change_quality("4K")
    video.adjust_volume(75)
    video.pause()
    video.stop()


if __name__ == "__main__":
    main()
