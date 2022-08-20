public class DMSConverter implements Converter {

    DMSCoordinate DMSObj;

    DecimalCoordinate convertedObj;

    public DMSConverter() {
        this.DMSObj = new DMSCoordinate();
    }

    public DMSConverter(DMSCoordinate DMSObj) {
        this.DMSObj = DMSObj;
    }

    public DMSConverter(String latAndLong) {
        DMSObj = new DMSCoordinate(latAndLong);
    }

    public DecimalCoordinate getConvertedObj() {
        return convertedObj;
    }

    public void convert() {
        // TODO Student

        double newMinutesLat = DMSObj.getMinutesLat() / 60.0;
        double newSecondLat = DMSObj.getSecondsLat() / 3600.0;
        double newLat = newMinutesLat + newSecondLat + DMSObj.getDegreesLat();

        double newMinutesLong = DMSObj.getMinutesLong() / 60.0;
        double newSecondLong = DMSObj.getSecondsLong() / 3600.0;
        double newLong = newMinutesLong + newSecondLong + DMSObj.getDegreesLong();

        convertedObj = new DecimalCoordinate(newLat, newLong); // This line will also be changed.
    }
}