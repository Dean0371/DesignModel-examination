package first;

public class GifReaderFactory extends ImageReaderFactory {
    @Override
    public ImageReader createReader() {
        return new GifReader();
    }
}
