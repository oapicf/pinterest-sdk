@isTest
private class OASMediaUploadTest {
    @isTest
    private static void equalsSameInstance() {
        OASMediaUpload mediaUpload1 = OASMediaUpload.getExample();
        OASMediaUpload mediaUpload2 = mediaUpload1;
        OASMediaUpload mediaUpload3 = new OASMediaUpload();
        OASMediaUpload mediaUpload4 = mediaUpload3;

        System.assert(mediaUpload1.equals(mediaUpload2));
        System.assert(mediaUpload2.equals(mediaUpload1));
        System.assert(mediaUpload1.equals(mediaUpload1));
        System.assert(mediaUpload3.equals(mediaUpload4));
        System.assert(mediaUpload4.equals(mediaUpload3));
        System.assert(mediaUpload3.equals(mediaUpload3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMediaUpload mediaUpload1 = OASMediaUpload.getExample();
        OASMediaUpload mediaUpload2 = OASMediaUpload.getExample();
        OASMediaUpload mediaUpload3 = new OASMediaUpload();
        OASMediaUpload mediaUpload4 = new OASMediaUpload();

        System.assert(mediaUpload1.equals(mediaUpload2));
        System.assert(mediaUpload2.equals(mediaUpload1));
        System.assert(mediaUpload3.equals(mediaUpload4));
        System.assert(mediaUpload4.equals(mediaUpload3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMediaUpload mediaUpload1 = OASMediaUpload.getExample();
        OASMediaUpload mediaUpload2 = new OASMediaUpload();

        System.assertEquals(false, mediaUpload1.equals('foo'));
        System.assertEquals(false, mediaUpload2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMediaUpload mediaUpload1 = OASMediaUpload.getExample();
        OASMediaUpload mediaUpload2 = new OASMediaUpload();
        OASMediaUpload mediaUpload3;

        System.assertEquals(false, mediaUpload1.equals(mediaUpload3));
        System.assertEquals(false, mediaUpload2.equals(mediaUpload3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMediaUpload mediaUpload1 = OASMediaUpload.getExample();
        OASMediaUpload mediaUpload2 = new OASMediaUpload();

        System.assertEquals(mediaUpload1.hashCode(), mediaUpload1.hashCode());
        System.assertEquals(mediaUpload2.hashCode(), mediaUpload2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMediaUpload mediaUpload1 = OASMediaUpload.getExample();
        OASMediaUpload mediaUpload2 = OASMediaUpload.getExample();
        OASMediaUpload mediaUpload3 = new OASMediaUpload();
        OASMediaUpload mediaUpload4 = new OASMediaUpload();

        System.assert(mediaUpload1.equals(mediaUpload2));
        System.assert(mediaUpload3.equals(mediaUpload4));
        System.assertEquals(mediaUpload1.hashCode(), mediaUpload2.hashCode());
        System.assertEquals(mediaUpload3.hashCode(), mediaUpload4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASMediaUpload mediaUpload = new OASMediaUpload();
        Map<String, String> x-property-mappings = mediaUpload.getx-property-mappings();
        System.assertEquals('mediaId', x-property-mappings.get('media_id'));
        System.assertEquals('mediaType', x-property-mappings.get('media_type'));
        System.assertEquals('uploadUrl', x-property-mappings.get('upload_url'));
        System.assertEquals('uploadParameters', x-property-mappings.get('upload_parameters'));
    }
}
