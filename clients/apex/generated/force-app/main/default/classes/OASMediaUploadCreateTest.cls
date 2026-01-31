@isTest
private class OASMediaUploadCreateTest {
    @isTest
    private static void equalsSameInstance() {
        OASMediaUploadCreate mediaUploadCreate1 = OASMediaUploadCreate.getExample();
        OASMediaUploadCreate mediaUploadCreate2 = mediaUploadCreate1;
        OASMediaUploadCreate mediaUploadCreate3 = new OASMediaUploadCreate();
        OASMediaUploadCreate mediaUploadCreate4 = mediaUploadCreate3;

        System.assert(mediaUploadCreate1.equals(mediaUploadCreate2));
        System.assert(mediaUploadCreate2.equals(mediaUploadCreate1));
        System.assert(mediaUploadCreate1.equals(mediaUploadCreate1));
        System.assert(mediaUploadCreate3.equals(mediaUploadCreate4));
        System.assert(mediaUploadCreate4.equals(mediaUploadCreate3));
        System.assert(mediaUploadCreate3.equals(mediaUploadCreate3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMediaUploadCreate mediaUploadCreate1 = OASMediaUploadCreate.getExample();
        OASMediaUploadCreate mediaUploadCreate2 = OASMediaUploadCreate.getExample();
        OASMediaUploadCreate mediaUploadCreate3 = new OASMediaUploadCreate();
        OASMediaUploadCreate mediaUploadCreate4 = new OASMediaUploadCreate();

        System.assert(mediaUploadCreate1.equals(mediaUploadCreate2));
        System.assert(mediaUploadCreate2.equals(mediaUploadCreate1));
        System.assert(mediaUploadCreate3.equals(mediaUploadCreate4));
        System.assert(mediaUploadCreate4.equals(mediaUploadCreate3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMediaUploadCreate mediaUploadCreate1 = OASMediaUploadCreate.getExample();
        OASMediaUploadCreate mediaUploadCreate2 = new OASMediaUploadCreate();

        System.assertEquals(false, mediaUploadCreate1.equals('foo'));
        System.assertEquals(false, mediaUploadCreate2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMediaUploadCreate mediaUploadCreate1 = OASMediaUploadCreate.getExample();
        OASMediaUploadCreate mediaUploadCreate2 = new OASMediaUploadCreate();
        OASMediaUploadCreate mediaUploadCreate3;

        System.assertEquals(false, mediaUploadCreate1.equals(mediaUploadCreate3));
        System.assertEquals(false, mediaUploadCreate2.equals(mediaUploadCreate3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMediaUploadCreate mediaUploadCreate1 = OASMediaUploadCreate.getExample();
        OASMediaUploadCreate mediaUploadCreate2 = new OASMediaUploadCreate();

        System.assertEquals(mediaUploadCreate1.hashCode(), mediaUploadCreate1.hashCode());
        System.assertEquals(mediaUploadCreate2.hashCode(), mediaUploadCreate2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMediaUploadCreate mediaUploadCreate1 = OASMediaUploadCreate.getExample();
        OASMediaUploadCreate mediaUploadCreate2 = OASMediaUploadCreate.getExample();
        OASMediaUploadCreate mediaUploadCreate3 = new OASMediaUploadCreate();
        OASMediaUploadCreate mediaUploadCreate4 = new OASMediaUploadCreate();

        System.assert(mediaUploadCreate1.equals(mediaUploadCreate2));
        System.assert(mediaUploadCreate3.equals(mediaUploadCreate4));
        System.assertEquals(mediaUploadCreate1.hashCode(), mediaUploadCreate2.hashCode());
        System.assertEquals(mediaUploadCreate3.hashCode(), mediaUploadCreate4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASMediaUploadCreate mediaUploadCreate = new OASMediaUploadCreate();
        Map<String, String> x-property-mappings = mediaUploadCreate.getx-property-mappings();
        System.assertEquals('mediaType', x-property-mappings.get('media_type'));
    }
}
