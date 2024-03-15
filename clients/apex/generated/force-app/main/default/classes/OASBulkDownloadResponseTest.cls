@isTest
private class OASBulkDownloadResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASBulkDownloadResponse bulkDownloadResponse1 = OASBulkDownloadResponse.getExample();
        OASBulkDownloadResponse bulkDownloadResponse2 = bulkDownloadResponse1;
        OASBulkDownloadResponse bulkDownloadResponse3 = new OASBulkDownloadResponse();
        OASBulkDownloadResponse bulkDownloadResponse4 = bulkDownloadResponse3;

        System.assert(bulkDownloadResponse1.equals(bulkDownloadResponse2));
        System.assert(bulkDownloadResponse2.equals(bulkDownloadResponse1));
        System.assert(bulkDownloadResponse1.equals(bulkDownloadResponse1));
        System.assert(bulkDownloadResponse3.equals(bulkDownloadResponse4));
        System.assert(bulkDownloadResponse4.equals(bulkDownloadResponse3));
        System.assert(bulkDownloadResponse3.equals(bulkDownloadResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBulkDownloadResponse bulkDownloadResponse1 = OASBulkDownloadResponse.getExample();
        OASBulkDownloadResponse bulkDownloadResponse2 = OASBulkDownloadResponse.getExample();
        OASBulkDownloadResponse bulkDownloadResponse3 = new OASBulkDownloadResponse();
        OASBulkDownloadResponse bulkDownloadResponse4 = new OASBulkDownloadResponse();

        System.assert(bulkDownloadResponse1.equals(bulkDownloadResponse2));
        System.assert(bulkDownloadResponse2.equals(bulkDownloadResponse1));
        System.assert(bulkDownloadResponse3.equals(bulkDownloadResponse4));
        System.assert(bulkDownloadResponse4.equals(bulkDownloadResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBulkDownloadResponse bulkDownloadResponse1 = OASBulkDownloadResponse.getExample();
        OASBulkDownloadResponse bulkDownloadResponse2 = new OASBulkDownloadResponse();

        System.assertEquals(false, bulkDownloadResponse1.equals('foo'));
        System.assertEquals(false, bulkDownloadResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBulkDownloadResponse bulkDownloadResponse1 = OASBulkDownloadResponse.getExample();
        OASBulkDownloadResponse bulkDownloadResponse2 = new OASBulkDownloadResponse();
        OASBulkDownloadResponse bulkDownloadResponse3;

        System.assertEquals(false, bulkDownloadResponse1.equals(bulkDownloadResponse3));
        System.assertEquals(false, bulkDownloadResponse2.equals(bulkDownloadResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBulkDownloadResponse bulkDownloadResponse1 = OASBulkDownloadResponse.getExample();
        OASBulkDownloadResponse bulkDownloadResponse2 = new OASBulkDownloadResponse();

        System.assertEquals(bulkDownloadResponse1.hashCode(), bulkDownloadResponse1.hashCode());
        System.assertEquals(bulkDownloadResponse2.hashCode(), bulkDownloadResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBulkDownloadResponse bulkDownloadResponse1 = OASBulkDownloadResponse.getExample();
        OASBulkDownloadResponse bulkDownloadResponse2 = OASBulkDownloadResponse.getExample();
        OASBulkDownloadResponse bulkDownloadResponse3 = new OASBulkDownloadResponse();
        OASBulkDownloadResponse bulkDownloadResponse4 = new OASBulkDownloadResponse();

        System.assert(bulkDownloadResponse1.equals(bulkDownloadResponse2));
        System.assert(bulkDownloadResponse3.equals(bulkDownloadResponse4));
        System.assertEquals(bulkDownloadResponse1.hashCode(), bulkDownloadResponse2.hashCode());
        System.assertEquals(bulkDownloadResponse3.hashCode(), bulkDownloadResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASBulkDownloadResponse bulkDownloadResponse = new OASBulkDownloadResponse();
        Map<String, String> x-property-mappings = bulkDownloadResponse.getx-property-mappings();
        System.assertEquals('requestId', x-property-mappings.get('request_id'));
    }
}
