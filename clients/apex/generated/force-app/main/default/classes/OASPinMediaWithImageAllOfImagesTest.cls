@isTest
private class OASPinMediaWithImageAllOfImagesTest {
    @isTest
    private static void equalsSameInstance() {
        OASPinMediaWithImageAllOfImages pinMediaWithImageAllOfImages1 = OASPinMediaWithImageAllOfImages.getExample();
        OASPinMediaWithImageAllOfImages pinMediaWithImageAllOfImages2 = pinMediaWithImageAllOfImages1;
        OASPinMediaWithImageAllOfImages pinMediaWithImageAllOfImages3 = new OASPinMediaWithImageAllOfImages();
        OASPinMediaWithImageAllOfImages pinMediaWithImageAllOfImages4 = pinMediaWithImageAllOfImages3;

        System.assert(pinMediaWithImageAllOfImages1.equals(pinMediaWithImageAllOfImages2));
        System.assert(pinMediaWithImageAllOfImages2.equals(pinMediaWithImageAllOfImages1));
        System.assert(pinMediaWithImageAllOfImages1.equals(pinMediaWithImageAllOfImages1));
        System.assert(pinMediaWithImageAllOfImages3.equals(pinMediaWithImageAllOfImages4));
        System.assert(pinMediaWithImageAllOfImages4.equals(pinMediaWithImageAllOfImages3));
        System.assert(pinMediaWithImageAllOfImages3.equals(pinMediaWithImageAllOfImages3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPinMediaWithImageAllOfImages pinMediaWithImageAllOfImages1 = OASPinMediaWithImageAllOfImages.getExample();
        OASPinMediaWithImageAllOfImages pinMediaWithImageAllOfImages2 = OASPinMediaWithImageAllOfImages.getExample();
        OASPinMediaWithImageAllOfImages pinMediaWithImageAllOfImages3 = new OASPinMediaWithImageAllOfImages();
        OASPinMediaWithImageAllOfImages pinMediaWithImageAllOfImages4 = new OASPinMediaWithImageAllOfImages();

        System.assert(pinMediaWithImageAllOfImages1.equals(pinMediaWithImageAllOfImages2));
        System.assert(pinMediaWithImageAllOfImages2.equals(pinMediaWithImageAllOfImages1));
        System.assert(pinMediaWithImageAllOfImages3.equals(pinMediaWithImageAllOfImages4));
        System.assert(pinMediaWithImageAllOfImages4.equals(pinMediaWithImageAllOfImages3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPinMediaWithImageAllOfImages pinMediaWithImageAllOfImages1 = OASPinMediaWithImageAllOfImages.getExample();
        OASPinMediaWithImageAllOfImages pinMediaWithImageAllOfImages2 = new OASPinMediaWithImageAllOfImages();

        System.assertEquals(false, pinMediaWithImageAllOfImages1.equals('foo'));
        System.assertEquals(false, pinMediaWithImageAllOfImages2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPinMediaWithImageAllOfImages pinMediaWithImageAllOfImages1 = OASPinMediaWithImageAllOfImages.getExample();
        OASPinMediaWithImageAllOfImages pinMediaWithImageAllOfImages2 = new OASPinMediaWithImageAllOfImages();
        OASPinMediaWithImageAllOfImages pinMediaWithImageAllOfImages3;

        System.assertEquals(false, pinMediaWithImageAllOfImages1.equals(pinMediaWithImageAllOfImages3));
        System.assertEquals(false, pinMediaWithImageAllOfImages2.equals(pinMediaWithImageAllOfImages3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPinMediaWithImageAllOfImages pinMediaWithImageAllOfImages1 = OASPinMediaWithImageAllOfImages.getExample();
        OASPinMediaWithImageAllOfImages pinMediaWithImageAllOfImages2 = new OASPinMediaWithImageAllOfImages();

        System.assertEquals(pinMediaWithImageAllOfImages1.hashCode(), pinMediaWithImageAllOfImages1.hashCode());
        System.assertEquals(pinMediaWithImageAllOfImages2.hashCode(), pinMediaWithImageAllOfImages2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPinMediaWithImageAllOfImages pinMediaWithImageAllOfImages1 = OASPinMediaWithImageAllOfImages.getExample();
        OASPinMediaWithImageAllOfImages pinMediaWithImageAllOfImages2 = OASPinMediaWithImageAllOfImages.getExample();
        OASPinMediaWithImageAllOfImages pinMediaWithImageAllOfImages3 = new OASPinMediaWithImageAllOfImages();
        OASPinMediaWithImageAllOfImages pinMediaWithImageAllOfImages4 = new OASPinMediaWithImageAllOfImages();

        System.assert(pinMediaWithImageAllOfImages1.equals(pinMediaWithImageAllOfImages2));
        System.assert(pinMediaWithImageAllOfImages3.equals(pinMediaWithImageAllOfImages4));
        System.assertEquals(pinMediaWithImageAllOfImages1.hashCode(), pinMediaWithImageAllOfImages2.hashCode());
        System.assertEquals(pinMediaWithImageAllOfImages3.hashCode(), pinMediaWithImageAllOfImages4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPinMediaWithImageAllOfImages pinMediaWithImageAllOfImages = new OASPinMediaWithImageAllOfImages();
        Map<String, String> x-property-mappings = pinMediaWithImageAllOfImages.getx-property-mappings();
        System.assertEquals('', x-property-mappings.get('150x150'));
        System.assertEquals('', x-property-mappings.get('400x300'));
        System.assertEquals('', x-property-mappings.get('600x'));
        System.assertEquals('', x-property-mappings.get('1200x'));
    }
}
