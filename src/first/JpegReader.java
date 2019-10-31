package first;

public class JpegReader implements ImageReader {
    @Override
    public void read() {
        System.out.println("读取Jpeg图片");
    }
}
