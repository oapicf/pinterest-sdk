@isTest
private class OASPinMediaSourceImagesBase64Test {
    @isTest
    private static void equalsSameInstance() {
        OASPinMediaSourceImagesBase64 pinMediaSourceImagesBase641 = OASPinMediaSourceImagesBase64.getExample();
        OASPinMediaSourceImagesBase64 pinMediaSourceImagesBase642 = pinMediaSourceImagesBase641;
        OASPinMediaSourceImagesBase64 pinMediaSourceImagesBase643 = new OASPinMediaSourceImagesBase64();
        OASPinMediaSourceImagesBase64 pinMediaSourceImagesBase644 = pinMediaSourceImagesBase643;

        System.assert(pinMediaSourceImagesBase641.equals(pinMediaSourceImagesBase642));
        System.assert(pinMediaSourceImagesBase642.equals(pinMediaSourceImagesBase641));
        System.assert(pinMediaSourceImagesBase641.equals(pinMediaSourceImagesBase641));
        System.assert(pinMediaSourceImagesBase643.equals(pinMediaSourceImagesBase644));
        System.assert(pinMediaSourceImagesBase644.equals(pinMediaSourceImagesBase643));
        System.assert(pinMediaSourceImagesBase643.equals(pinMediaSourceImagesBase643));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPinMediaSourceImagesBase64 pinMediaSourceImagesBase641 = OASPinMediaSourceImagesBase64.getExample();
        OASPinMediaSourceImagesBase64 pinMediaSourceImagesBase642 = OASPinMediaSourceImagesBase64.getExample();
        OASPinMediaSourceImagesBase64 pinMediaSourceImagesBase643 = new OASPinMediaSourceImagesBase64();
        OASPinMediaSourceImagesBase64 pinMediaSourceImagesBase644 = new OASPinMediaSourceImagesBase64();

        System.assert(pinMediaSourceImagesBase641.equals(pinMediaSourceImagesBase642));
        System.assert(pinMediaSourceImagesBase642.equals(pinMediaSourceImagesBase641));
        System.assert(pinMediaSourceImagesBase643.equals(pinMediaSourceImagesBase644));
        System.assert(pinMediaSourceImagesBase644.equals(pinMediaSourceImagesBase643));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPinMediaSourceImagesBase64 pinMediaSourceImagesBase641 = OASPinMediaSourceImagesBase64.getExample();
        OASPinMediaSourceImagesBase64 pinMediaSourceImagesBase642 = new OASPinMediaSourceImagesBase64();

        System.assertEquals(false, pinMediaSourceImagesBase641.equals('foo'));
        System.assertEquals(false, pinMediaSourceImagesBase642.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPinMediaSourceImagesBase64 pinMediaSourceImagesBase641 = OASPinMediaSourceImagesBase64.getExample();
        OASPinMediaSourceImagesBase64 pinMediaSourceImagesBase642 = new OASPinMediaSourceImagesBase64();
        OASPinMediaSourceImagesBase64 pinMediaSourceImagesBase643;

        System.assertEquals(false, pinMediaSourceImagesBase641.equals(pinMediaSourceImagesBase643));
        System.assertEquals(false, pinMediaSourceImagesBase642.equals(pinMediaSourceImagesBase643));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPinMediaSourceImagesBase64 pinMediaSourceImagesBase641 = OASPinMediaSourceImagesBase64.getExample();
        OASPinMediaSourceImagesBase64 pinMediaSourceImagesBase642 = new OASPinMediaSourceImagesBase64();

        System.assertEquals(pinMediaSourceImagesBase641.hashCode(), pinMediaSourceImagesBase641.hashCode());
        System.assertEquals(pinMediaSourceImagesBase642.hashCode(), pinMediaSourceImagesBase642.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPinMediaSourceImagesBase64 pinMediaSourceImagesBase641 = OASPinMediaSourceImagesBase64.getExample();
        OASPinMediaSourceImagesBase64 pinMediaSourceImagesBase642 = OASPinMediaSourceImagesBase64.getExample();
        OASPinMediaSourceImagesBase64 pinMediaSourceImagesBase643 = new OASPinMediaSourceImagesBase64();
        OASPinMediaSourceImagesBase64 pinMediaSourceImagesBase644 = new OASPinMediaSourceImagesBase64();

        System.assert(pinMediaSourceImagesBase641.equals(pinMediaSourceImagesBase642));
        System.assert(pinMediaSourceImagesBase643.equals(pinMediaSourceImagesBase644));
        System.assertEquals(pinMediaSourceImagesBase641.hashCode(), pinMediaSourceImagesBase642.hashCode());
        System.assertEquals(pinMediaSourceImagesBase643.hashCode(), pinMediaSourceImagesBase644.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPinMediaSourceImagesBase64 pinMediaSourceImagesBase64 = new OASPinMediaSourceImagesBase64();
        Map<String, String> x-property-mappings = pinMediaSourceImagesBase64.getx-property-mappings();
        System.assertEquals('sourceType', x-property-mappings.get('source_type'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPinMediaSourceImagesBase64 pinMediaSourceImagesBase64 = new OASPinMediaSourceImagesBase64();
        System.assertEquals(new List<OASPinMediaSourceImagesBase64ItemsIn>(), pinMediaSourceImagesBase64.items);
        System.assertEquals(null, pinMediaSourceImagesBase64.sourceType);
        System.assertEquals(null, pinMediaSourceImagesBase64.index);
    }
}
