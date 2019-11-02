package first;

public class TiffReader implements ImageReader {
    @Override
    public void read() {
        System.out.println("读取Tiff图片");
    }
}
