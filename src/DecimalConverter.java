import java.lang.Math;

public class DecimalConverter implements Converter {

    DecimalCoordinate decimalObj;

    DMSCoordinate convertedObj;

    public DecimalConverter() {
        this.decimalObj = new DecimalCoordinate();
    }

    public DecimalConverter(DecimalCoordinate decimalObj) {
        this.decimalObj = decimalObj;
    }

    public DMSCoordinate getConvertedObj() {
        return convertedObj;
    }

    public void convert() {
        // TODO Student

        int newDegreeLat = (int) Math.floor(decimalObj.getLatitude());

        double minuteConvertLat = Math.floor((decimalObj.getLatitude() - newDegreeLat) * 60.0);
        double secondConvertLat = (((decimalObj.getLatitude() - newDegreeLat) * 60.0)
                - (Math.floor((decimalObj.getLatitude() - newDegreeLat) * 60.0))) * 60.0;

        int newMinuteLat = (int) minuteConvertLat;
        int newSecondLat = (int) secondConvertLat;

        int newDegreeLong = (int) Math.floor(decimalObj.getLongitude());

        double minuteConvertLong = Math.floor((decimalObj.getLongitude() - newDegreeLong) * 60.0);
        double secondConvertLong = (((decimalObj.getLongitude() - newDegreeLong) * 60.0)
                - (Math.floor((decimalObj.getLongitude() - newDegreeLong) * 60.0))) * 60.0;

        int newMinuteLong = (int) minuteConvertLong;
        int newSecondLong = (int) secondConvertLong;

        convertedObj = new DMSCoordinate(newDegreeLat, newMinuteLat, newSecondLat, newDegreeLong, newMinuteLong,
                newSecondLong); // This line will also be changed.
    }

    public static void main(String[] args) {
        DecimalCoordinate testDecimal = new DecimalCoordinate(39.0, 50.0);
        DecimalConverter testConverter = new DecimalConverter(testDecimal);

        testConverter.convert();

        System.out.println(testConverter.getConvertedObj());
    }
}
