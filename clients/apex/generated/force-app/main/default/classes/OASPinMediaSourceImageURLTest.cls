@isTest
private class OASPinMediaSourceImageURLTest {
    @isTest
    private static void equalsSameInstance() {
        OASPinMediaSourceImageURL pinMediaSourceImageURL1 = OASPinMediaSourceImageURL.getExample();
        OASPinMediaSourceImageURL pinMediaSourceImageURL2 = pinMediaSourceImageURL1;
        OASPinMediaSourceImageURL pinMediaSourceImageURL3 = new OASPinMediaSourceImageURL();
        OASPinMediaSourceImageURL pinMediaSourceImageURL4 = pinMediaSourceImageURL3;

        System.assert(pinMediaSourceImageURL1.equals(pinMediaSourceImageURL2));
        System.assert(pinMediaSourceImageURL2.equals(pinMediaSourceImageURL1));
        System.assert(pinMediaSourceImageURL1.equals(pinMediaSourceImageURL1));
        System.assert(pinMediaSourceImageURL3.equals(pinMediaSourceImageURL4));
        System.assert(pinMediaSourceImageURL4.equals(pinMediaSourceImageURL3));
        System.assert(pinMediaSourceImageURL3.equals(pinMediaSourceImageURL3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPinMediaSourceImageURL pinMediaSourceImageURL1 = OASPinMediaSourceImageURL.getExample();
        OASPinMediaSourceImageURL pinMediaSourceImageURL2 = OASPinMediaSourceImageURL.getExample();
        OASPinMediaSourceImageURL pinMediaSourceImageURL3 = new OASPinMediaSourceImageURL();
        OASPinMediaSourceImageURL pinMediaSourceImageURL4 = new OASPinMediaSourceImageURL();

        System.assert(pinMediaSourceImageURL1.equals(pinMediaSourceImageURL2));
        System.assert(pinMediaSourceImageURL2.equals(pinMediaSourceImageURL1));
        System.assert(pinMediaSourceImageURL3.equals(pinMediaSourceImageURL4));
        System.assert(pinMediaSourceImageURL4.equals(pinMediaSourceImageURL3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPinMediaSourceImageURL pinMediaSourceImageURL1 = OASPinMediaSourceImageURL.getExample();
        OASPinMediaSourceImageURL pinMediaSourceImageURL2 = new OASPinMediaSourceImageURL();

        System.assertEquals(false, pinMediaSourceImageURL1.equals('foo'));
        System.assertEquals(false, pinMediaSourceImageURL2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPinMediaSourceImageURL pinMediaSourceImageURL1 = OASPinMediaSourceImageURL.getExample();
        OASPinMediaSourceImageURL pinMediaSourceImageURL2 = new OASPinMediaSourceImageURL();
        OASPinMediaSourceImageURL pinMediaSourceImageURL3;

        System.assertEquals(false, pinMediaSourceImageURL1.equals(pinMediaSourceImageURL3));
        System.assertEquals(false, pinMediaSourceImageURL2.equals(pinMediaSourceImageURL3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPinMediaSourceImageURL pinMediaSourceImageURL1 = OASPinMediaSourceImageURL.getExample();
        OASPinMediaSourceImageURL pinMediaSourceImageURL2 = new OASPinMediaSourceImageURL();

        System.assertEquals(pinMediaSourceImageURL1.hashCode(), pinMediaSourceImageURL1.hashCode());
        System.assertEquals(pinMediaSourceImageURL2.hashCode(), pinMediaSourceImageURL2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPinMediaSourceImageURL pinMediaSourceImageURL1 = OASPinMediaSourceImageURL.getExample();
        OASPinMediaSourceImageURL pinMediaSourceImageURL2 = OASPinMediaSourceImageURL.getExample();
        OASPinMediaSourceImageURL pinMediaSourceImageURL3 = new OASPinMediaSourceImageURL();
        OASPinMediaSourceImageURL pinMediaSourceImageURL4 = new OASPinMediaSourceImageURL();

        System.assert(pinMediaSourceImageURL1.equals(pinMediaSourceImageURL2));
        System.assert(pinMediaSourceImageURL3.equals(pinMediaSourceImageURL4));
        System.assertEquals(pinMediaSourceImageURL1.hashCode(), pinMediaSourceImageURL2.hashCode());
        System.assertEquals(pinMediaSourceImageURL3.hashCode(), pinMediaSourceImageURL4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPinMediaSourceImageURL pinMediaSourceImageURL = new OASPinMediaSourceImageURL();
        Map<String, String> x-property-mappings = pinMediaSourceImageURL.getx-property-mappings();
        System.assertEquals('sourceType', x-property-mappings.get('source_type'));
    }
}
