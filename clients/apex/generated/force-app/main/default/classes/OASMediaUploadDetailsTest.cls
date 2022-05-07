@isTest
private class OASMediaUploadDetailsTest {
    @isTest
    private static void equalsSameInstance() {
        OASMediaUploadDetails mediaUploadDetails1 = OASMediaUploadDetails.getExample();
        OASMediaUploadDetails mediaUploadDetails2 = mediaUploadDetails1;
        OASMediaUploadDetails mediaUploadDetails3 = new OASMediaUploadDetails();
        OASMediaUploadDetails mediaUploadDetails4 = mediaUploadDetails3;

        System.assert(mediaUploadDetails1.equals(mediaUploadDetails2));
        System.assert(mediaUploadDetails2.equals(mediaUploadDetails1));
        System.assert(mediaUploadDetails1.equals(mediaUploadDetails1));
        System.assert(mediaUploadDetails3.equals(mediaUploadDetails4));
        System.assert(mediaUploadDetails4.equals(mediaUploadDetails3));
        System.assert(mediaUploadDetails3.equals(mediaUploadDetails3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMediaUploadDetails mediaUploadDetails1 = OASMediaUploadDetails.getExample();
        OASMediaUploadDetails mediaUploadDetails2 = OASMediaUploadDetails.getExample();
        OASMediaUploadDetails mediaUploadDetails3 = new OASMediaUploadDetails();
        OASMediaUploadDetails mediaUploadDetails4 = new OASMediaUploadDetails();

        System.assert(mediaUploadDetails1.equals(mediaUploadDetails2));
        System.assert(mediaUploadDetails2.equals(mediaUploadDetails1));
        System.assert(mediaUploadDetails3.equals(mediaUploadDetails4));
        System.assert(mediaUploadDetails4.equals(mediaUploadDetails3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMediaUploadDetails mediaUploadDetails1 = OASMediaUploadDetails.getExample();
        OASMediaUploadDetails mediaUploadDetails2 = new OASMediaUploadDetails();

        System.assertEquals(false, mediaUploadDetails1.equals('foo'));
        System.assertEquals(false, mediaUploadDetails2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMediaUploadDetails mediaUploadDetails1 = OASMediaUploadDetails.getExample();
        OASMediaUploadDetails mediaUploadDetails2 = new OASMediaUploadDetails();
        OASMediaUploadDetails mediaUploadDetails3;

        System.assertEquals(false, mediaUploadDetails1.equals(mediaUploadDetails3));
        System.assertEquals(false, mediaUploadDetails2.equals(mediaUploadDetails3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMediaUploadDetails mediaUploadDetails1 = OASMediaUploadDetails.getExample();
        OASMediaUploadDetails mediaUploadDetails2 = new OASMediaUploadDetails();

        System.assertEquals(mediaUploadDetails1.hashCode(), mediaUploadDetails1.hashCode());
        System.assertEquals(mediaUploadDetails2.hashCode(), mediaUploadDetails2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMediaUploadDetails mediaUploadDetails1 = OASMediaUploadDetails.getExample();
        OASMediaUploadDetails mediaUploadDetails2 = OASMediaUploadDetails.getExample();
        OASMediaUploadDetails mediaUploadDetails3 = new OASMediaUploadDetails();
        OASMediaUploadDetails mediaUploadDetails4 = new OASMediaUploadDetails();

        System.assert(mediaUploadDetails1.equals(mediaUploadDetails2));
        System.assert(mediaUploadDetails3.equals(mediaUploadDetails4));
        System.assertEquals(mediaUploadDetails1.hashCode(), mediaUploadDetails2.hashCode());
        System.assertEquals(mediaUploadDetails3.hashCode(), mediaUploadDetails4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASMediaUploadDetails mediaUploadDetails = new OASMediaUploadDetails();
        Map<String, String> x-property-mappings = mediaUploadDetails.getx-property-mappings();
        System.assertEquals('mediaId', x-property-mappings.get('media_id'));
        System.assertEquals('mediaType', x-property-mappings.get('media_type'));
    }
}
