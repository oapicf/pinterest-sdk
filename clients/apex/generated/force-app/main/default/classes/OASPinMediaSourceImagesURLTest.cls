@isTest
private class OASPinMediaSourceImagesURLTest {
    @isTest
    private static void equalsSameInstance() {
        OASPinMediaSourceImagesURL pinMediaSourceImagesURL1 = OASPinMediaSourceImagesURL.getExample();
        OASPinMediaSourceImagesURL pinMediaSourceImagesURL2 = pinMediaSourceImagesURL1;
        OASPinMediaSourceImagesURL pinMediaSourceImagesURL3 = new OASPinMediaSourceImagesURL();
        OASPinMediaSourceImagesURL pinMediaSourceImagesURL4 = pinMediaSourceImagesURL3;

        System.assert(pinMediaSourceImagesURL1.equals(pinMediaSourceImagesURL2));
        System.assert(pinMediaSourceImagesURL2.equals(pinMediaSourceImagesURL1));
        System.assert(pinMediaSourceImagesURL1.equals(pinMediaSourceImagesURL1));
        System.assert(pinMediaSourceImagesURL3.equals(pinMediaSourceImagesURL4));
        System.assert(pinMediaSourceImagesURL4.equals(pinMediaSourceImagesURL3));
        System.assert(pinMediaSourceImagesURL3.equals(pinMediaSourceImagesURL3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPinMediaSourceImagesURL pinMediaSourceImagesURL1 = OASPinMediaSourceImagesURL.getExample();
        OASPinMediaSourceImagesURL pinMediaSourceImagesURL2 = OASPinMediaSourceImagesURL.getExample();
        OASPinMediaSourceImagesURL pinMediaSourceImagesURL3 = new OASPinMediaSourceImagesURL();
        OASPinMediaSourceImagesURL pinMediaSourceImagesURL4 = new OASPinMediaSourceImagesURL();

        System.assert(pinMediaSourceImagesURL1.equals(pinMediaSourceImagesURL2));
        System.assert(pinMediaSourceImagesURL2.equals(pinMediaSourceImagesURL1));
        System.assert(pinMediaSourceImagesURL3.equals(pinMediaSourceImagesURL4));
        System.assert(pinMediaSourceImagesURL4.equals(pinMediaSourceImagesURL3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPinMediaSourceImagesURL pinMediaSourceImagesURL1 = OASPinMediaSourceImagesURL.getExample();
        OASPinMediaSourceImagesURL pinMediaSourceImagesURL2 = new OASPinMediaSourceImagesURL();

        System.assertEquals(false, pinMediaSourceImagesURL1.equals('foo'));
        System.assertEquals(false, pinMediaSourceImagesURL2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPinMediaSourceImagesURL pinMediaSourceImagesURL1 = OASPinMediaSourceImagesURL.getExample();
        OASPinMediaSourceImagesURL pinMediaSourceImagesURL2 = new OASPinMediaSourceImagesURL();
        OASPinMediaSourceImagesURL pinMediaSourceImagesURL3;

        System.assertEquals(false, pinMediaSourceImagesURL1.equals(pinMediaSourceImagesURL3));
        System.assertEquals(false, pinMediaSourceImagesURL2.equals(pinMediaSourceImagesURL3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPinMediaSourceImagesURL pinMediaSourceImagesURL1 = OASPinMediaSourceImagesURL.getExample();
        OASPinMediaSourceImagesURL pinMediaSourceImagesURL2 = new OASPinMediaSourceImagesURL();

        System.assertEquals(pinMediaSourceImagesURL1.hashCode(), pinMediaSourceImagesURL1.hashCode());
        System.assertEquals(pinMediaSourceImagesURL2.hashCode(), pinMediaSourceImagesURL2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPinMediaSourceImagesURL pinMediaSourceImagesURL1 = OASPinMediaSourceImagesURL.getExample();
        OASPinMediaSourceImagesURL pinMediaSourceImagesURL2 = OASPinMediaSourceImagesURL.getExample();
        OASPinMediaSourceImagesURL pinMediaSourceImagesURL3 = new OASPinMediaSourceImagesURL();
        OASPinMediaSourceImagesURL pinMediaSourceImagesURL4 = new OASPinMediaSourceImagesURL();

        System.assert(pinMediaSourceImagesURL1.equals(pinMediaSourceImagesURL2));
        System.assert(pinMediaSourceImagesURL3.equals(pinMediaSourceImagesURL4));
        System.assertEquals(pinMediaSourceImagesURL1.hashCode(), pinMediaSourceImagesURL2.hashCode());
        System.assertEquals(pinMediaSourceImagesURL3.hashCode(), pinMediaSourceImagesURL4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPinMediaSourceImagesURL pinMediaSourceImagesURL = new OASPinMediaSourceImagesURL();
        Map<String, String> x-property-mappings = pinMediaSourceImagesURL.getx-property-mappings();
        System.assertEquals('sourceType', x-property-mappings.get('source_type'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPinMediaSourceImagesURL pinMediaSourceImagesURL = new OASPinMediaSourceImagesURL();
        System.assertEquals(new List<OASPinMediaSourceImagesURLItemsInner>(), pinMediaSourceImagesURL.items);
        System.assertEquals(null, pinMediaSourceImagesURL.sourceType);
        System.assertEquals(null, pinMediaSourceImagesURL.index);
    }
}
