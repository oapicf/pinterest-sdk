@isTest
private class OASVideoMetadataWithItemTypeTest {
    @isTest
    private static void equalsSameInstance() {
        OASVideoMetadataWithItemType videoMetadataWithItemType1 = OASVideoMetadataWithItemType.getExample();
        OASVideoMetadataWithItemType videoMetadataWithItemType2 = videoMetadataWithItemType1;
        OASVideoMetadataWithItemType videoMetadataWithItemType3 = new OASVideoMetadataWithItemType();
        OASVideoMetadataWithItemType videoMetadataWithItemType4 = videoMetadataWithItemType3;

        System.assert(videoMetadataWithItemType1.equals(videoMetadataWithItemType2));
        System.assert(videoMetadataWithItemType2.equals(videoMetadataWithItemType1));
        System.assert(videoMetadataWithItemType1.equals(videoMetadataWithItemType1));
        System.assert(videoMetadataWithItemType3.equals(videoMetadataWithItemType4));
        System.assert(videoMetadataWithItemType4.equals(videoMetadataWithItemType3));
        System.assert(videoMetadataWithItemType3.equals(videoMetadataWithItemType3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASVideoMetadataWithItemType videoMetadataWithItemType1 = OASVideoMetadataWithItemType.getExample();
        OASVideoMetadataWithItemType videoMetadataWithItemType2 = OASVideoMetadataWithItemType.getExample();
        OASVideoMetadataWithItemType videoMetadataWithItemType3 = new OASVideoMetadataWithItemType();
        OASVideoMetadataWithItemType videoMetadataWithItemType4 = new OASVideoMetadataWithItemType();

        System.assert(videoMetadataWithItemType1.equals(videoMetadataWithItemType2));
        System.assert(videoMetadataWithItemType2.equals(videoMetadataWithItemType1));
        System.assert(videoMetadataWithItemType3.equals(videoMetadataWithItemType4));
        System.assert(videoMetadataWithItemType4.equals(videoMetadataWithItemType3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASVideoMetadataWithItemType videoMetadataWithItemType1 = OASVideoMetadataWithItemType.getExample();
        OASVideoMetadataWithItemType videoMetadataWithItemType2 = new OASVideoMetadataWithItemType();

        System.assertEquals(false, videoMetadataWithItemType1.equals('foo'));
        System.assertEquals(false, videoMetadataWithItemType2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASVideoMetadataWithItemType videoMetadataWithItemType1 = OASVideoMetadataWithItemType.getExample();
        OASVideoMetadataWithItemType videoMetadataWithItemType2 = new OASVideoMetadataWithItemType();
        OASVideoMetadataWithItemType videoMetadataWithItemType3;

        System.assertEquals(false, videoMetadataWithItemType1.equals(videoMetadataWithItemType3));
        System.assertEquals(false, videoMetadataWithItemType2.equals(videoMetadataWithItemType3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASVideoMetadataWithItemType videoMetadataWithItemType1 = OASVideoMetadataWithItemType.getExample();
        OASVideoMetadataWithItemType videoMetadataWithItemType2 = new OASVideoMetadataWithItemType();

        System.assertEquals(videoMetadataWithItemType1.hashCode(), videoMetadataWithItemType1.hashCode());
        System.assertEquals(videoMetadataWithItemType2.hashCode(), videoMetadataWithItemType2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASVideoMetadataWithItemType videoMetadataWithItemType1 = OASVideoMetadataWithItemType.getExample();
        OASVideoMetadataWithItemType videoMetadataWithItemType2 = OASVideoMetadataWithItemType.getExample();
        OASVideoMetadataWithItemType videoMetadataWithItemType3 = new OASVideoMetadataWithItemType();
        OASVideoMetadataWithItemType videoMetadataWithItemType4 = new OASVideoMetadataWithItemType();

        System.assert(videoMetadataWithItemType1.equals(videoMetadataWithItemType2));
        System.assert(videoMetadataWithItemType3.equals(videoMetadataWithItemType4));
        System.assertEquals(videoMetadataWithItemType1.hashCode(), videoMetadataWithItemType2.hashCode());
        System.assertEquals(videoMetadataWithItemType3.hashCode(), videoMetadataWithItemType4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASVideoMetadataWithItemType videoMetadataWithItemType = new OASVideoMetadataWithItemType();
        Map<String, String> x-property-mappings = videoMetadataWithItemType.getx-property-mappings();
        System.assertEquals('coverImageUrl', x-property-mappings.get('cover_image_url'));
        System.assertEquals('itemType', x-property-mappings.get('item_type'));
        System.assertEquals('videoUrl', x-property-mappings.get('video_url'));
    }
}
