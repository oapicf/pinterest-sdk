@isTest
private class OASPinMediaSourceImagesBase64ItemTest {
    @isTest
    private static void equalsSameInstance() {
        OASPinMediaSourceImagesBase64Item pinMediaSourceImagesBase64Item1 = OASPinMediaSourceImagesBase64Item.getExample();
        OASPinMediaSourceImagesBase64Item pinMediaSourceImagesBase64Item2 = pinMediaSourceImagesBase64Item1;
        OASPinMediaSourceImagesBase64Item pinMediaSourceImagesBase64Item3 = new OASPinMediaSourceImagesBase64Item();
        OASPinMediaSourceImagesBase64Item pinMediaSourceImagesBase64Item4 = pinMediaSourceImagesBase64Item3;

        System.assert(pinMediaSourceImagesBase64Item1.equals(pinMediaSourceImagesBase64Item2));
        System.assert(pinMediaSourceImagesBase64Item2.equals(pinMediaSourceImagesBase64Item1));
        System.assert(pinMediaSourceImagesBase64Item1.equals(pinMediaSourceImagesBase64Item1));
        System.assert(pinMediaSourceImagesBase64Item3.equals(pinMediaSourceImagesBase64Item4));
        System.assert(pinMediaSourceImagesBase64Item4.equals(pinMediaSourceImagesBase64Item3));
        System.assert(pinMediaSourceImagesBase64Item3.equals(pinMediaSourceImagesBase64Item3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPinMediaSourceImagesBase64Item pinMediaSourceImagesBase64Item1 = OASPinMediaSourceImagesBase64Item.getExample();
        OASPinMediaSourceImagesBase64Item pinMediaSourceImagesBase64Item2 = OASPinMediaSourceImagesBase64Item.getExample();
        OASPinMediaSourceImagesBase64Item pinMediaSourceImagesBase64Item3 = new OASPinMediaSourceImagesBase64Item();
        OASPinMediaSourceImagesBase64Item pinMediaSourceImagesBase64Item4 = new OASPinMediaSourceImagesBase64Item();

        System.assert(pinMediaSourceImagesBase64Item1.equals(pinMediaSourceImagesBase64Item2));
        System.assert(pinMediaSourceImagesBase64Item2.equals(pinMediaSourceImagesBase64Item1));
        System.assert(pinMediaSourceImagesBase64Item3.equals(pinMediaSourceImagesBase64Item4));
        System.assert(pinMediaSourceImagesBase64Item4.equals(pinMediaSourceImagesBase64Item3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPinMediaSourceImagesBase64Item pinMediaSourceImagesBase64Item1 = OASPinMediaSourceImagesBase64Item.getExample();
        OASPinMediaSourceImagesBase64Item pinMediaSourceImagesBase64Item2 = new OASPinMediaSourceImagesBase64Item();

        System.assertEquals(false, pinMediaSourceImagesBase64Item1.equals('foo'));
        System.assertEquals(false, pinMediaSourceImagesBase64Item2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPinMediaSourceImagesBase64Item pinMediaSourceImagesBase64Item1 = OASPinMediaSourceImagesBase64Item.getExample();
        OASPinMediaSourceImagesBase64Item pinMediaSourceImagesBase64Item2 = new OASPinMediaSourceImagesBase64Item();
        OASPinMediaSourceImagesBase64Item pinMediaSourceImagesBase64Item3;

        System.assertEquals(false, pinMediaSourceImagesBase64Item1.equals(pinMediaSourceImagesBase64Item3));
        System.assertEquals(false, pinMediaSourceImagesBase64Item2.equals(pinMediaSourceImagesBase64Item3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPinMediaSourceImagesBase64Item pinMediaSourceImagesBase64Item1 = OASPinMediaSourceImagesBase64Item.getExample();
        OASPinMediaSourceImagesBase64Item pinMediaSourceImagesBase64Item2 = new OASPinMediaSourceImagesBase64Item();

        System.assertEquals(pinMediaSourceImagesBase64Item1.hashCode(), pinMediaSourceImagesBase64Item1.hashCode());
        System.assertEquals(pinMediaSourceImagesBase64Item2.hashCode(), pinMediaSourceImagesBase64Item2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPinMediaSourceImagesBase64Item pinMediaSourceImagesBase64Item1 = OASPinMediaSourceImagesBase64Item.getExample();
        OASPinMediaSourceImagesBase64Item pinMediaSourceImagesBase64Item2 = OASPinMediaSourceImagesBase64Item.getExample();
        OASPinMediaSourceImagesBase64Item pinMediaSourceImagesBase64Item3 = new OASPinMediaSourceImagesBase64Item();
        OASPinMediaSourceImagesBase64Item pinMediaSourceImagesBase64Item4 = new OASPinMediaSourceImagesBase64Item();

        System.assert(pinMediaSourceImagesBase64Item1.equals(pinMediaSourceImagesBase64Item2));
        System.assert(pinMediaSourceImagesBase64Item3.equals(pinMediaSourceImagesBase64Item4));
        System.assertEquals(pinMediaSourceImagesBase64Item1.hashCode(), pinMediaSourceImagesBase64Item2.hashCode());
        System.assertEquals(pinMediaSourceImagesBase64Item3.hashCode(), pinMediaSourceImagesBase64Item4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPinMediaSourceImagesBase64Item pinMediaSourceImagesBase64Item = new OASPinMediaSourceImagesBase64Item();
        Map<String, String> x-property-mappings = pinMediaSourceImagesBase64Item.getx-property-mappings();
        System.assertEquals('contentType', x-property-mappings.get('content_type'));
    }
}
