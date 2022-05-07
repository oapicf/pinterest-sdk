@isTest
private class OASPinMediaTest {
    @isTest
    private static void equalsSameInstance() {
        OASPinMedia pinMedia1 = OASPinMedia.getExample();
        OASPinMedia pinMedia2 = pinMedia1;
        OASPinMedia pinMedia3 = new OASPinMedia();
        OASPinMedia pinMedia4 = pinMedia3;

        System.assert(pinMedia1.equals(pinMedia2));
        System.assert(pinMedia2.equals(pinMedia1));
        System.assert(pinMedia1.equals(pinMedia1));
        System.assert(pinMedia3.equals(pinMedia4));
        System.assert(pinMedia4.equals(pinMedia3));
        System.assert(pinMedia3.equals(pinMedia3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPinMedia pinMedia1 = OASPinMedia.getExample();
        OASPinMedia pinMedia2 = OASPinMedia.getExample();
        OASPinMedia pinMedia3 = new OASPinMedia();
        OASPinMedia pinMedia4 = new OASPinMedia();

        System.assert(pinMedia1.equals(pinMedia2));
        System.assert(pinMedia2.equals(pinMedia1));
        System.assert(pinMedia3.equals(pinMedia4));
        System.assert(pinMedia4.equals(pinMedia3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPinMedia pinMedia1 = OASPinMedia.getExample();
        OASPinMedia pinMedia2 = new OASPinMedia();

        System.assertEquals(false, pinMedia1.equals('foo'));
        System.assertEquals(false, pinMedia2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPinMedia pinMedia1 = OASPinMedia.getExample();
        OASPinMedia pinMedia2 = new OASPinMedia();
        OASPinMedia pinMedia3;

        System.assertEquals(false, pinMedia1.equals(pinMedia3));
        System.assertEquals(false, pinMedia2.equals(pinMedia3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPinMedia pinMedia1 = OASPinMedia.getExample();
        OASPinMedia pinMedia2 = new OASPinMedia();

        System.assertEquals(pinMedia1.hashCode(), pinMedia1.hashCode());
        System.assertEquals(pinMedia2.hashCode(), pinMedia2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPinMedia pinMedia1 = OASPinMedia.getExample();
        OASPinMedia pinMedia2 = OASPinMedia.getExample();
        OASPinMedia pinMedia3 = new OASPinMedia();
        OASPinMedia pinMedia4 = new OASPinMedia();

        System.assert(pinMedia1.equals(pinMedia2));
        System.assert(pinMedia3.equals(pinMedia4));
        System.assertEquals(pinMedia1.hashCode(), pinMedia2.hashCode());
        System.assertEquals(pinMedia3.hashCode(), pinMedia4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPinMedia pinMedia = new OASPinMedia();
        Map<String, String> x-property-mappings = pinMedia.getx-property-mappings();
        System.assertEquals('mediaType', x-property-mappings.get('media_type'));
    }
}
