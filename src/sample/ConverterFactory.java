package sample;

public class ConverterFactory {
    public static final double POUNDS_IN_OUNCES = 16;
    public static final double OUNCES_TO_POUNDS = 0.0625;
    public static final double GRAMS_IN_OUNCES = 0.035274;
    public static final double OUNCES_IN_GRAMS = 28.3495;

    public static Converter createConverter(ConversionType type) {
        switch(type) {
            //parameter pounds is assumed to be a double
            case POUNDS_TO_OUNCES: return   pounds -> pounds * POUNDS_IN_OUNCES;
            case OUNCES_TO_POUNDS: return ounces -> ounces * OUNCES_TO_POUNDS;
            case GRAMS_TO_OUNCES : return grams -> grams * GRAMS_IN_OUNCES;
            case OUNCES_TO_GRAMS: return ounces -> ounces * OUNCES_IN_GRAMS;
        }
        return null;
    }
}
