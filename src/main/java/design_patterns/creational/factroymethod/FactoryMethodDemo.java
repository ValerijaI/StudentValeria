package design_patterns.creational.factroymethod;

class FactoryMethodDemo {
    public static void main(String[] args) {
        DecodedImage decodedImage;
        ImageReader reader = null;
        String image = "kartinka.gif";
        String format = image.substring(image.indexOf('.') +1, (image.length()));
        if (format.equals("gif")) {
            reader = new GifReader(image);
        }
        if (format.equals("jpeg")) {
            reader = new JpegReader(image);
        }
        decodedImage = reader.getDecodedImage();
        System.out.println(decodedImage);
    }
}
