package KI304.Litvinenko.Lab3;

class VCR extends VideoPlayer implements Rewindable {

    @Override
    public void play() {
        System.out.println("Відео почало відтворюватись на відеомагнітофоні.");
    }

    @Override
    public void pause() {
        System.out.println("Відео поставлено на паузу на відеомагнітофоні.");
    }

    @Override
    public void stop() {
        System.out.println("Відео зупинено на відеомагнітофоні.");
    }

    @Override
    public void rewind() {
        System.out.println("Відео перемотано назад.");
    }
}
 