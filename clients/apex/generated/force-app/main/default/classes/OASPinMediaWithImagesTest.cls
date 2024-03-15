@isTest
private class OASPinMediaWithImagesTest {
    @isTest
    private static void equalsSameInstance() {
        OASPinMediaWithImages pinMediaWithImages1 = OASPinMediaWithImages.getExample();
        OASPinMediaWithImages pinMediaWithImages2 = pinMediaWithImages1;
        OASPinMediaWithImages pinMediaWithImages3 = new OASPinMediaWithImages();
        OASPinMediaWithImages pinMediaWithImages4 = pinMediaWithImages3;

        System.assert(pinMediaWithImages1.equals(pinMediaWithImages2));
        System.assert(pinMediaWithImages2.equals(pinMediaWithImages1));
        System.assert(pinMediaWithImages1.equals(pinMediaWithImages1));
        System.assert(pinMediaWithImages3.equals(pinMediaWithImages4));
        System.assert(pinMediaWithImages4.equals(pinMediaWithImages3));
        System.assert(pinMediaWithImages3.equals(pinMediaWithImages3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPinMediaWithImages pinMediaWithImages1 = OASPinMediaWithImages.getExample();
        OASPinMediaWithImages pinMediaWithImages2 = OASPinMediaWithImages.getExample();
        OASPinMediaWithImages pinMediaWithImages3 = new OASPinMediaWithImages();
        OASPinMediaWithImages pinMediaWithImages4 = new OASPinMediaWithImages();

        System.assert(pinMediaWithImages1.equals(pinMediaWithImages2));
        System.assert(pinMediaWithImages2.equals(pinMediaWithImages1));
        System.assert(pinMediaWithImages3.equals(pinMediaWithImages4));
        System.assert(pinMediaWithImages4.equals(pinMediaWithImages3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPinMediaWithImages pinMediaWithImages1 = OASPinMediaWithImages.getExample();
        OASPinMediaWithImages pinMediaWithImages2 = new OASPinMediaWithImages();

        System.assertEquals(false, pinMediaWithImages1.equals('foo'));
        System.assertEquals(false, pinMediaWithImages2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPinMediaWithImages pinMediaWithImages1 = OASPinMediaWithImages.getExample();
        OASPinMediaWithImages pinMediaWithImages2 = new OASPinMediaWithImages();
        OASPinMediaWithImages pinMediaWithImages3;

        System.assertEquals(false, pinMediaWithImages1.equals(pinMediaWithImages3));
        System.assertEquals(false, pinMediaWithImages2.equals(pinMediaWithImages3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPinMediaWithImages pinMediaWithImages1 = OASPinMediaWithImages.getExample();
        OASPinMediaWithImages pinMediaWithImages2 = new OASPinMediaWithImages();

        System.assertEquals(pinMediaWithImages1.hashCode(), pinMediaWithImages1.hashCode());
        System.assertEquals(pinMediaWithImages2.hashCode(), pinMediaWithImages2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPinMediaWithImages pinMediaWithImages1 = OASPinMediaWithImages.getExample();
        OASPinMediaWithImages pinMediaWithImages2 = OASPinMediaWithImages.getExample();
        OASPinMediaWithImages pinMediaWithImages3 = new OASPinMediaWithImages();
        OASPinMediaWithImages pinMediaWithImages4 = new OASPinMediaWithImages();

        System.assert(pinMediaWithImages1.equals(pinMediaWithImages2));
        System.assert(pinMediaWithImages3.equals(pinMediaWithImages4));
        System.assertEquals(pinMediaWithImages1.hashCode(), pinMediaWithImages2.hashCode());
        System.assertEquals(pinMediaWithImages3.hashCode(), pinMediaWithImages4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPinMediaWithImages pinMediaWithImages = new OASPinMediaWithImages();
        Map<String, String> x-property-mappings = pinMediaWithImages.getx-property-mappings();
        System.assertEquals('mediaType', x-property-mappings.get('media_type'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPinMediaWithImages pinMediaWithImages = new OASPinMediaWithImages();
        System.assertEquals(new List<OASImageMetadata>(), pinMediaWithImages.items);
        System.assertEquals(null, pinMediaWithImages.mediaType);
    }
}
