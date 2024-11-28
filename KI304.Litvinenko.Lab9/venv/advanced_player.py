from base_player import BasePlayer

class AdvancedPlayer(BasePlayer):
    def __init__(self, video_file, quality='HD'):
        super().__init__(video_file)
        self.quality = quality
        self.volume = 50  # Default volume is 50%

    def change_quality(self, quality):
        self.quality = quality
        print(f"Changed video quality to {self.quality}")

    def adjust_volume(self, volume):
        if 0 <= volume <= 100:
            self.volume = volume
            print(f"Volume set to {self.volume}%")
        else:
            print("Volume must be between 0 and 100")
