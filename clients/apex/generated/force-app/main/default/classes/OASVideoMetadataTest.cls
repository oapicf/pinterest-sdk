@isTest
private class OASVideoMetadataTest {
    @isTest
    private static void equalsSameInstance() {
        OASVideoMetadata videoMetadata1 = OASVideoMetadata.getExample();
        OASVideoMetadata videoMetadata2 = videoMetadata1;
        OASVideoMetadata videoMetadata3 = new OASVideoMetadata();
        OASVideoMetadata videoMetadata4 = videoMetadata3;

        System.assert(videoMetadata1.equals(videoMetadata2));
        System.assert(videoMetadata2.equals(videoMetadata1));
        System.assert(videoMetadata1.equals(videoMetadata1));
        System.assert(videoMetadata3.equals(videoMetadata4));
        System.assert(videoMetadata4.equals(videoMetadata3));
        System.assert(videoMetadata3.equals(videoMetadata3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASVideoMetadata videoMetadata1 = OASVideoMetadata.getExample();
        OASVideoMetadata videoMetadata2 = OASVideoMetadata.getExample();
        OASVideoMetadata videoMetadata3 = new OASVideoMetadata();
        OASVideoMetadata videoMetadata4 = new OASVideoMetadata();

        System.assert(videoMetadata1.equals(videoMetadata2));
        System.assert(videoMetadata2.equals(videoMetadata1));
        System.assert(videoMetadata3.equals(videoMetadata4));
        System.assert(videoMetadata4.equals(videoMetadata3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASVideoMetadata videoMetadata1 = OASVideoMetadata.getExample();
        OASVideoMetadata videoMetadata2 = new OASVideoMetadata();

        System.assertEquals(false, videoMetadata1.equals('foo'));
        System.assertEquals(false, videoMetadata2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASVideoMetadata videoMetadata1 = OASVideoMetadata.getExample();
        OASVideoMetadata videoMetadata2 = new OASVideoMetadata();
        OASVideoMetadata videoMetadata3;

        System.assertEquals(false, videoMetadata1.equals(videoMetadata3));
        System.assertEquals(false, videoMetadata2.equals(videoMetadata3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASVideoMetadata videoMetadata1 = OASVideoMetadata.getExample();
        OASVideoMetadata videoMetadata2 = new OASVideoMetadata();

        System.assertEquals(videoMetadata1.hashCode(), videoMetadata1.hashCode());
        System.assertEquals(videoMetadata2.hashCode(), videoMetadata2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASVideoMetadata videoMetadata1 = OASVideoMetadata.getExample();
        OASVideoMetadata videoMetadata2 = OASVideoMetadata.getExample();
        OASVideoMetadata videoMetadata3 = new OASVideoMetadata();
        OASVideoMetadata videoMetadata4 = new OASVideoMetadata();

        System.assert(videoMetadata1.equals(videoMetadata2));
        System.assert(videoMetadata3.equals(videoMetadata4));
        System.assertEquals(videoMetadata1.hashCode(), videoMetadata2.hashCode());
        System.assertEquals(videoMetadata3.hashCode(), videoMetadata4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASVideoMetadata videoMetadata = new OASVideoMetadata();
        Map<String, String> x-property-mappings = videoMetadata.getx-property-mappings();
        System.assertEquals('itemType', x-property-mappings.get('item_type'));
        System.assertEquals('coverImageUrl', x-property-mappings.get('cover_image_url'));
        System.assertEquals('videoUrl', x-property-mappings.get('video_url'));
    }
}
