package first;

public class Main {
    public static void main(String[] args) {
        ImageReaderFactory factory = new JpegReaderFactory();
        ImageReader jpegReader = factory.createReader();
        jpegReader.read();
        ImageReaderFactory factory1 = new GifReaderFactory();
        ImageReader gifReader = factory1.createReader();
        gifReader.read();
    }
}
// output:读取Jpeg图片
//        读取Gif图片
