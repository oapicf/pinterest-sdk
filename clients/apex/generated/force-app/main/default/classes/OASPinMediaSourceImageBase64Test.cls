@isTest
private class OASPinMediaSourceImageBase64Test {
    @isTest
    private static void equalsSameInstance() {
        OASPinMediaSourceImageBase64 pinMediaSourceImageBase641 = OASPinMediaSourceImageBase64.getExample();
        OASPinMediaSourceImageBase64 pinMediaSourceImageBase642 = pinMediaSourceImageBase641;
        OASPinMediaSourceImageBase64 pinMediaSourceImageBase643 = new OASPinMediaSourceImageBase64();
        OASPinMediaSourceImageBase64 pinMediaSourceImageBase644 = pinMediaSourceImageBase643;

        System.assert(pinMediaSourceImageBase641.equals(pinMediaSourceImageBase642));
        System.assert(pinMediaSourceImageBase642.equals(pinMediaSourceImageBase641));
        System.assert(pinMediaSourceImageBase641.equals(pinMediaSourceImageBase641));
        System.assert(pinMediaSourceImageBase643.equals(pinMediaSourceImageBase644));
        System.assert(pinMediaSourceImageBase644.equals(pinMediaSourceImageBase643));
        System.assert(pinMediaSourceImageBase643.equals(pinMediaSourceImageBase643));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPinMediaSourceImageBase64 pinMediaSourceImageBase641 = OASPinMediaSourceImageBase64.getExample();
        OASPinMediaSourceImageBase64 pinMediaSourceImageBase642 = OASPinMediaSourceImageBase64.getExample();
        OASPinMediaSourceImageBase64 pinMediaSourceImageBase643 = new OASPinMediaSourceImageBase64();
        OASPinMediaSourceImageBase64 pinMediaSourceImageBase644 = new OASPinMediaSourceImageBase64();

        System.assert(pinMediaSourceImageBase641.equals(pinMediaSourceImageBase642));
        System.assert(pinMediaSourceImageBase642.equals(pinMediaSourceImageBase641));
        System.assert(pinMediaSourceImageBase643.equals(pinMediaSourceImageBase644));
        System.assert(pinMediaSourceImageBase644.equals(pinMediaSourceImageBase643));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPinMediaSourceImageBase64 pinMediaSourceImageBase641 = OASPinMediaSourceImageBase64.getExample();
        OASPinMediaSourceImageBase64 pinMediaSourceImageBase642 = new OASPinMediaSourceImageBase64();

        System.assertEquals(false, pinMediaSourceImageBase641.equals('foo'));
        System.assertEquals(false, pinMediaSourceImageBase642.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPinMediaSourceImageBase64 pinMediaSourceImageBase641 = OASPinMediaSourceImageBase64.getExample();
        OASPinMediaSourceImageBase64 pinMediaSourceImageBase642 = new OASPinMediaSourceImageBase64();
        OASPinMediaSourceImageBase64 pinMediaSourceImageBase643;

        System.assertEquals(false, pinMediaSourceImageBase641.equals(pinMediaSourceImageBase643));
        System.assertEquals(false, pinMediaSourceImageBase642.equals(pinMediaSourceImageBase643));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPinMediaSourceImageBase64 pinMediaSourceImageBase641 = OASPinMediaSourceImageBase64.getExample();
        OASPinMediaSourceImageBase64 pinMediaSourceImageBase642 = new OASPinMediaSourceImageBase64();

        System.assertEquals(pinMediaSourceImageBase641.hashCode(), pinMediaSourceImageBase641.hashCode());
        System.assertEquals(pinMediaSourceImageBase642.hashCode(), pinMediaSourceImageBase642.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPinMediaSourceImageBase64 pinMediaSourceImageBase641 = OASPinMediaSourceImageBase64.getExample();
        OASPinMediaSourceImageBase64 pinMediaSourceImageBase642 = OASPinMediaSourceImageBase64.getExample();
        OASPinMediaSourceImageBase64 pinMediaSourceImageBase643 = new OASPinMediaSourceImageBase64();
        OASPinMediaSourceImageBase64 pinMediaSourceImageBase644 = new OASPinMediaSourceImageBase64();

        System.assert(pinMediaSourceImageBase641.equals(pinMediaSourceImageBase642));
        System.assert(pinMediaSourceImageBase643.equals(pinMediaSourceImageBase644));
        System.assertEquals(pinMediaSourceImageBase641.hashCode(), pinMediaSourceImageBase642.hashCode());
        System.assertEquals(pinMediaSourceImageBase643.hashCode(), pinMediaSourceImageBase644.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPinMediaSourceImageBase64 pinMediaSourceImageBase64 = new OASPinMediaSourceImageBase64();
        Map<String, String> x-property-mappings = pinMediaSourceImageBase64.getx-property-mappings();
        System.assertEquals('sourceType', x-property-mappings.get('source_type'));
        System.assertEquals('contentType', x-property-mappings.get('content_type'));
    }
}
