package first;
public class JpegReaderFactory extends ImageReaderFactory{
    @Override
    public ImageReader createReader() {
        return new JpegReader();
    }
}
