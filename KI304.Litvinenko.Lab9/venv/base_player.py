class BasePlayer:
    def __init__(self, video_file):
        self.video_file = video_file
        self.is_playing = False
        self.current_time = 0

    def play(self):
        if not self.is_playing:
            print(f"Playing {self.video_file}")
            self.is_playing = True
        else:
            print("Video is already playing")

    def pause(self):
        if self.is_playing:
            print("Pausing video")
            self.is_playing = False
        else:
            print("Video is already paused")

    def stop(self):
        print("Stopping video")
        self.is_playing = False
        self.current_time = 0
