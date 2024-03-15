@isTest
private class OASMediaUploadRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASMediaUploadRequest mediaUploadRequest1 = OASMediaUploadRequest.getExample();
        OASMediaUploadRequest mediaUploadRequest2 = mediaUploadRequest1;
        OASMediaUploadRequest mediaUploadRequest3 = new OASMediaUploadRequest();
        OASMediaUploadRequest mediaUploadRequest4 = mediaUploadRequest3;

        System.assert(mediaUploadRequest1.equals(mediaUploadRequest2));
        System.assert(mediaUploadRequest2.equals(mediaUploadRequest1));
        System.assert(mediaUploadRequest1.equals(mediaUploadRequest1));
        System.assert(mediaUploadRequest3.equals(mediaUploadRequest4));
        System.assert(mediaUploadRequest4.equals(mediaUploadRequest3));
        System.assert(mediaUploadRequest3.equals(mediaUploadRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMediaUploadRequest mediaUploadRequest1 = OASMediaUploadRequest.getExample();
        OASMediaUploadRequest mediaUploadRequest2 = OASMediaUploadRequest.getExample();
        OASMediaUploadRequest mediaUploadRequest3 = new OASMediaUploadRequest();
        OASMediaUploadRequest mediaUploadRequest4 = new OASMediaUploadRequest();

        System.assert(mediaUploadRequest1.equals(mediaUploadRequest2));
        System.assert(mediaUploadRequest2.equals(mediaUploadRequest1));
        System.assert(mediaUploadRequest3.equals(mediaUploadRequest4));
        System.assert(mediaUploadRequest4.equals(mediaUploadRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMediaUploadRequest mediaUploadRequest1 = OASMediaUploadRequest.getExample();
        OASMediaUploadRequest mediaUploadRequest2 = new OASMediaUploadRequest();

        System.assertEquals(false, mediaUploadRequest1.equals('foo'));
        System.assertEquals(false, mediaUploadRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMediaUploadRequest mediaUploadRequest1 = OASMediaUploadRequest.getExample();
        OASMediaUploadRequest mediaUploadRequest2 = new OASMediaUploadRequest();
        OASMediaUploadRequest mediaUploadRequest3;

        System.assertEquals(false, mediaUploadRequest1.equals(mediaUploadRequest3));
        System.assertEquals(false, mediaUploadRequest2.equals(mediaUploadRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMediaUploadRequest mediaUploadRequest1 = OASMediaUploadRequest.getExample();
        OASMediaUploadRequest mediaUploadRequest2 = new OASMediaUploadRequest();

        System.assertEquals(mediaUploadRequest1.hashCode(), mediaUploadRequest1.hashCode());
        System.assertEquals(mediaUploadRequest2.hashCode(), mediaUploadRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMediaUploadRequest mediaUploadRequest1 = OASMediaUploadRequest.getExample();
        OASMediaUploadRequest mediaUploadRequest2 = OASMediaUploadRequest.getExample();
        OASMediaUploadRequest mediaUploadRequest3 = new OASMediaUploadRequest();
        OASMediaUploadRequest mediaUploadRequest4 = new OASMediaUploadRequest();

        System.assert(mediaUploadRequest1.equals(mediaUploadRequest2));
        System.assert(mediaUploadRequest3.equals(mediaUploadRequest4));
        System.assertEquals(mediaUploadRequest1.hashCode(), mediaUploadRequest2.hashCode());
        System.assertEquals(mediaUploadRequest3.hashCode(), mediaUploadRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASMediaUploadRequest mediaUploadRequest = new OASMediaUploadRequest();
        Map<String, String> x-property-mappings = mediaUploadRequest.getx-property-mappings();
        System.assertEquals('mediaType', x-property-mappings.get('media_type'));
    }
}
