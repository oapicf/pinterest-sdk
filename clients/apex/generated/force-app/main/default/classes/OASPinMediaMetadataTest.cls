@isTest
private class OASPinMediaMetadataTest {
    @isTest
    private static void equalsSameInstance() {
        OASPinMediaMetadata pinMediaMetadata1 = OASPinMediaMetadata.getExample();
        OASPinMediaMetadata pinMediaMetadata2 = pinMediaMetadata1;
        OASPinMediaMetadata pinMediaMetadata3 = new OASPinMediaMetadata();
        OASPinMediaMetadata pinMediaMetadata4 = pinMediaMetadata3;

        System.assert(pinMediaMetadata1.equals(pinMediaMetadata2));
        System.assert(pinMediaMetadata2.equals(pinMediaMetadata1));
        System.assert(pinMediaMetadata1.equals(pinMediaMetadata1));
        System.assert(pinMediaMetadata3.equals(pinMediaMetadata4));
        System.assert(pinMediaMetadata4.equals(pinMediaMetadata3));
        System.assert(pinMediaMetadata3.equals(pinMediaMetadata3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPinMediaMetadata pinMediaMetadata1 = OASPinMediaMetadata.getExample();
        OASPinMediaMetadata pinMediaMetadata2 = OASPinMediaMetadata.getExample();
        OASPinMediaMetadata pinMediaMetadata3 = new OASPinMediaMetadata();
        OASPinMediaMetadata pinMediaMetadata4 = new OASPinMediaMetadata();

        System.assert(pinMediaMetadata1.equals(pinMediaMetadata2));
        System.assert(pinMediaMetadata2.equals(pinMediaMetadata1));
        System.assert(pinMediaMetadata3.equals(pinMediaMetadata4));
        System.assert(pinMediaMetadata4.equals(pinMediaMetadata3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPinMediaMetadata pinMediaMetadata1 = OASPinMediaMetadata.getExample();
        OASPinMediaMetadata pinMediaMetadata2 = new OASPinMediaMetadata();

        System.assertEquals(false, pinMediaMetadata1.equals('foo'));
        System.assertEquals(false, pinMediaMetadata2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPinMediaMetadata pinMediaMetadata1 = OASPinMediaMetadata.getExample();
        OASPinMediaMetadata pinMediaMetadata2 = new OASPinMediaMetadata();
        OASPinMediaMetadata pinMediaMetadata3;

        System.assertEquals(false, pinMediaMetadata1.equals(pinMediaMetadata3));
        System.assertEquals(false, pinMediaMetadata2.equals(pinMediaMetadata3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPinMediaMetadata pinMediaMetadata1 = OASPinMediaMetadata.getExample();
        OASPinMediaMetadata pinMediaMetadata2 = new OASPinMediaMetadata();

        System.assertEquals(pinMediaMetadata1.hashCode(), pinMediaMetadata1.hashCode());
        System.assertEquals(pinMediaMetadata2.hashCode(), pinMediaMetadata2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPinMediaMetadata pinMediaMetadata1 = OASPinMediaMetadata.getExample();
        OASPinMediaMetadata pinMediaMetadata2 = OASPinMediaMetadata.getExample();
        OASPinMediaMetadata pinMediaMetadata3 = new OASPinMediaMetadata();
        OASPinMediaMetadata pinMediaMetadata4 = new OASPinMediaMetadata();

        System.assert(pinMediaMetadata1.equals(pinMediaMetadata2));
        System.assert(pinMediaMetadata3.equals(pinMediaMetadata4));
        System.assertEquals(pinMediaMetadata1.hashCode(), pinMediaMetadata2.hashCode());
        System.assertEquals(pinMediaMetadata3.hashCode(), pinMediaMetadata4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPinMediaMetadata pinMediaMetadata = new OASPinMediaMetadata();
        Map<String, String> x-property-mappings = pinMediaMetadata.getx-property-mappings();
        System.assertEquals('itemType', x-property-mappings.get('item_type'));
        System.assertEquals('coverImageUrl', x-property-mappings.get('cover_image_url'));
        System.assertEquals('videoUrl', x-property-mappings.get('video_url'));
    }
}
