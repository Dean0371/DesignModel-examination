package first;

public class TiffReaderFactory extends ImageReaderFactory {
    @Override
    public ImageReader createReader() {
        return new TiffReader();
    }
}
