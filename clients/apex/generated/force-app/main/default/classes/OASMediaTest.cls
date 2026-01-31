@isTest
private class OASMediaTest {
    @isTest
    private static void equalsSameInstance() {
        OASMedia media1 = OASMedia.getExample();
        OASMedia media2 = media1;
        OASMedia media3 = new OASMedia();
        OASMedia media4 = media3;

        System.assert(media1.equals(media2));
        System.assert(media2.equals(media1));
        System.assert(media1.equals(media1));
        System.assert(media3.equals(media4));
        System.assert(media4.equals(media3));
        System.assert(media3.equals(media3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMedia media1 = OASMedia.getExample();
        OASMedia media2 = OASMedia.getExample();
        OASMedia media3 = new OASMedia();
        OASMedia media4 = new OASMedia();

        System.assert(media1.equals(media2));
        System.assert(media2.equals(media1));
        System.assert(media3.equals(media4));
        System.assert(media4.equals(media3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMedia media1 = OASMedia.getExample();
        OASMedia media2 = new OASMedia();

        System.assertEquals(false, media1.equals('foo'));
        System.assertEquals(false, media2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMedia media1 = OASMedia.getExample();
        OASMedia media2 = new OASMedia();
        OASMedia media3;

        System.assertEquals(false, media1.equals(media3));
        System.assertEquals(false, media2.equals(media3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMedia media1 = OASMedia.getExample();
        OASMedia media2 = new OASMedia();

        System.assertEquals(media1.hashCode(), media1.hashCode());
        System.assertEquals(media2.hashCode(), media2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMedia media1 = OASMedia.getExample();
        OASMedia media2 = OASMedia.getExample();
        OASMedia media3 = new OASMedia();
        OASMedia media4 = new OASMedia();

        System.assert(media1.equals(media2));
        System.assert(media3.equals(media4));
        System.assertEquals(media1.hashCode(), media2.hashCode());
        System.assertEquals(media3.hashCode(), media4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASMedia media = new OASMedia();
        Map<String, String> x-property-mappings = media.getx-property-mappings();
        System.assertEquals('mediaId', x-property-mappings.get('media_id'));
        System.assertEquals('mediaType', x-property-mappings.get('media_type'));
    }
}
