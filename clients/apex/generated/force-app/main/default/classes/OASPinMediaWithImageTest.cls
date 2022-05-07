@isTest
private class OASPinMediaWithImageTest {
    @isTest
    private static void equalsSameInstance() {
        OASPinMediaWithImage pinMediaWithImage1 = OASPinMediaWithImage.getExample();
        OASPinMediaWithImage pinMediaWithImage2 = pinMediaWithImage1;
        OASPinMediaWithImage pinMediaWithImage3 = new OASPinMediaWithImage();
        OASPinMediaWithImage pinMediaWithImage4 = pinMediaWithImage3;

        System.assert(pinMediaWithImage1.equals(pinMediaWithImage2));
        System.assert(pinMediaWithImage2.equals(pinMediaWithImage1));
        System.assert(pinMediaWithImage1.equals(pinMediaWithImage1));
        System.assert(pinMediaWithImage3.equals(pinMediaWithImage4));
        System.assert(pinMediaWithImage4.equals(pinMediaWithImage3));
        System.assert(pinMediaWithImage3.equals(pinMediaWithImage3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPinMediaWithImage pinMediaWithImage1 = OASPinMediaWithImage.getExample();
        OASPinMediaWithImage pinMediaWithImage2 = OASPinMediaWithImage.getExample();
        OASPinMediaWithImage pinMediaWithImage3 = new OASPinMediaWithImage();
        OASPinMediaWithImage pinMediaWithImage4 = new OASPinMediaWithImage();

        System.assert(pinMediaWithImage1.equals(pinMediaWithImage2));
        System.assert(pinMediaWithImage2.equals(pinMediaWithImage1));
        System.assert(pinMediaWithImage3.equals(pinMediaWithImage4));
        System.assert(pinMediaWithImage4.equals(pinMediaWithImage3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPinMediaWithImage pinMediaWithImage1 = OASPinMediaWithImage.getExample();
        OASPinMediaWithImage pinMediaWithImage2 = new OASPinMediaWithImage();

        System.assertEquals(false, pinMediaWithImage1.equals('foo'));
        System.assertEquals(false, pinMediaWithImage2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPinMediaWithImage pinMediaWithImage1 = OASPinMediaWithImage.getExample();
        OASPinMediaWithImage pinMediaWithImage2 = new OASPinMediaWithImage();
        OASPinMediaWithImage pinMediaWithImage3;

        System.assertEquals(false, pinMediaWithImage1.equals(pinMediaWithImage3));
        System.assertEquals(false, pinMediaWithImage2.equals(pinMediaWithImage3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPinMediaWithImage pinMediaWithImage1 = OASPinMediaWithImage.getExample();
        OASPinMediaWithImage pinMediaWithImage2 = new OASPinMediaWithImage();

        System.assertEquals(pinMediaWithImage1.hashCode(), pinMediaWithImage1.hashCode());
        System.assertEquals(pinMediaWithImage2.hashCode(), pinMediaWithImage2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPinMediaWithImage pinMediaWithImage1 = OASPinMediaWithImage.getExample();
        OASPinMediaWithImage pinMediaWithImage2 = OASPinMediaWithImage.getExample();
        OASPinMediaWithImage pinMediaWithImage3 = new OASPinMediaWithImage();
        OASPinMediaWithImage pinMediaWithImage4 = new OASPinMediaWithImage();

        System.assert(pinMediaWithImage1.equals(pinMediaWithImage2));
        System.assert(pinMediaWithImage3.equals(pinMediaWithImage4));
        System.assertEquals(pinMediaWithImage1.hashCode(), pinMediaWithImage2.hashCode());
        System.assertEquals(pinMediaWithImage3.hashCode(), pinMediaWithImage4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPinMediaWithImage pinMediaWithImage = new OASPinMediaWithImage();
        Map<String, String> x-property-mappings = pinMediaWithImage.getx-property-mappings();
        System.assertEquals('mediaType', x-property-mappings.get('media_type'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPinMediaWithImage pinMediaWithImage = new OASPinMediaWithImage();
        System.assertEquals(new Map<String, OASImageDetails>(), pinMediaWithImage.images);
        System.assertEquals(null, pinMediaWithImage.mediaType);
    }
}
