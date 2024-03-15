@isTest
private class OASPinMediaSourceImagesBase64ItemsInTest {
    @isTest
    private static void equalsSameInstance() {
        OASPinMediaSourceImagesBase64ItemsIn pinMediaSourceImagesBase64ItemsInner1 = OASPinMediaSourceImagesBase64ItemsIn.getExample();
        OASPinMediaSourceImagesBase64ItemsIn pinMediaSourceImagesBase64ItemsInner2 = pinMediaSourceImagesBase64ItemsInner1;
        OASPinMediaSourceImagesBase64ItemsIn pinMediaSourceImagesBase64ItemsInner3 = new OASPinMediaSourceImagesBase64ItemsIn();
        OASPinMediaSourceImagesBase64ItemsIn pinMediaSourceImagesBase64ItemsInner4 = pinMediaSourceImagesBase64ItemsInner3;

        System.assert(pinMediaSourceImagesBase64ItemsInner1.equals(pinMediaSourceImagesBase64ItemsInner2));
        System.assert(pinMediaSourceImagesBase64ItemsInner2.equals(pinMediaSourceImagesBase64ItemsInner1));
        System.assert(pinMediaSourceImagesBase64ItemsInner1.equals(pinMediaSourceImagesBase64ItemsInner1));
        System.assert(pinMediaSourceImagesBase64ItemsInner3.equals(pinMediaSourceImagesBase64ItemsInner4));
        System.assert(pinMediaSourceImagesBase64ItemsInner4.equals(pinMediaSourceImagesBase64ItemsInner3));
        System.assert(pinMediaSourceImagesBase64ItemsInner3.equals(pinMediaSourceImagesBase64ItemsInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPinMediaSourceImagesBase64ItemsIn pinMediaSourceImagesBase64ItemsInner1 = OASPinMediaSourceImagesBase64ItemsIn.getExample();
        OASPinMediaSourceImagesBase64ItemsIn pinMediaSourceImagesBase64ItemsInner2 = OASPinMediaSourceImagesBase64ItemsIn.getExample();
        OASPinMediaSourceImagesBase64ItemsIn pinMediaSourceImagesBase64ItemsInner3 = new OASPinMediaSourceImagesBase64ItemsIn();
        OASPinMediaSourceImagesBase64ItemsIn pinMediaSourceImagesBase64ItemsInner4 = new OASPinMediaSourceImagesBase64ItemsIn();

        System.assert(pinMediaSourceImagesBase64ItemsInner1.equals(pinMediaSourceImagesBase64ItemsInner2));
        System.assert(pinMediaSourceImagesBase64ItemsInner2.equals(pinMediaSourceImagesBase64ItemsInner1));
        System.assert(pinMediaSourceImagesBase64ItemsInner3.equals(pinMediaSourceImagesBase64ItemsInner4));
        System.assert(pinMediaSourceImagesBase64ItemsInner4.equals(pinMediaSourceImagesBase64ItemsInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPinMediaSourceImagesBase64ItemsIn pinMediaSourceImagesBase64ItemsInner1 = OASPinMediaSourceImagesBase64ItemsIn.getExample();
        OASPinMediaSourceImagesBase64ItemsIn pinMediaSourceImagesBase64ItemsInner2 = new OASPinMediaSourceImagesBase64ItemsIn();

        System.assertEquals(false, pinMediaSourceImagesBase64ItemsInner1.equals('foo'));
        System.assertEquals(false, pinMediaSourceImagesBase64ItemsInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPinMediaSourceImagesBase64ItemsIn pinMediaSourceImagesBase64ItemsInner1 = OASPinMediaSourceImagesBase64ItemsIn.getExample();
        OASPinMediaSourceImagesBase64ItemsIn pinMediaSourceImagesBase64ItemsInner2 = new OASPinMediaSourceImagesBase64ItemsIn();
        OASPinMediaSourceImagesBase64ItemsIn pinMediaSourceImagesBase64ItemsInner3;

        System.assertEquals(false, pinMediaSourceImagesBase64ItemsInner1.equals(pinMediaSourceImagesBase64ItemsInner3));
        System.assertEquals(false, pinMediaSourceImagesBase64ItemsInner2.equals(pinMediaSourceImagesBase64ItemsInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPinMediaSourceImagesBase64ItemsIn pinMediaSourceImagesBase64ItemsInner1 = OASPinMediaSourceImagesBase64ItemsIn.getExample();
        OASPinMediaSourceImagesBase64ItemsIn pinMediaSourceImagesBase64ItemsInner2 = new OASPinMediaSourceImagesBase64ItemsIn();

        System.assertEquals(pinMediaSourceImagesBase64ItemsInner1.hashCode(), pinMediaSourceImagesBase64ItemsInner1.hashCode());
        System.assertEquals(pinMediaSourceImagesBase64ItemsInner2.hashCode(), pinMediaSourceImagesBase64ItemsInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPinMediaSourceImagesBase64ItemsIn pinMediaSourceImagesBase64ItemsInner1 = OASPinMediaSourceImagesBase64ItemsIn.getExample();
        OASPinMediaSourceImagesBase64ItemsIn pinMediaSourceImagesBase64ItemsInner2 = OASPinMediaSourceImagesBase64ItemsIn.getExample();
        OASPinMediaSourceImagesBase64ItemsIn pinMediaSourceImagesBase64ItemsInner3 = new OASPinMediaSourceImagesBase64ItemsIn();
        OASPinMediaSourceImagesBase64ItemsIn pinMediaSourceImagesBase64ItemsInner4 = new OASPinMediaSourceImagesBase64ItemsIn();

        System.assert(pinMediaSourceImagesBase64ItemsInner1.equals(pinMediaSourceImagesBase64ItemsInner2));
        System.assert(pinMediaSourceImagesBase64ItemsInner3.equals(pinMediaSourceImagesBase64ItemsInner4));
        System.assertEquals(pinMediaSourceImagesBase64ItemsInner1.hashCode(), pinMediaSourceImagesBase64ItemsInner2.hashCode());
        System.assertEquals(pinMediaSourceImagesBase64ItemsInner3.hashCode(), pinMediaSourceImagesBase64ItemsInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPinMediaSourceImagesBase64ItemsIn pinMediaSourceImagesBase64ItemsInner = new OASPinMediaSourceImagesBase64ItemsIn();
        Map<String, String> x-property-mappings = pinMediaSourceImagesBase64ItemsInner.getx-property-mappings();
        System.assertEquals('contentType', x-property-mappings.get('content_type'));
    }
}
