@isTest
private class OASBulkUpsertResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASBulkUpsertResponse bulkUpsertResponse1 = OASBulkUpsertResponse.getExample();
        OASBulkUpsertResponse bulkUpsertResponse2 = bulkUpsertResponse1;
        OASBulkUpsertResponse bulkUpsertResponse3 = new OASBulkUpsertResponse();
        OASBulkUpsertResponse bulkUpsertResponse4 = bulkUpsertResponse3;

        System.assert(bulkUpsertResponse1.equals(bulkUpsertResponse2));
        System.assert(bulkUpsertResponse2.equals(bulkUpsertResponse1));
        System.assert(bulkUpsertResponse1.equals(bulkUpsertResponse1));
        System.assert(bulkUpsertResponse3.equals(bulkUpsertResponse4));
        System.assert(bulkUpsertResponse4.equals(bulkUpsertResponse3));
        System.assert(bulkUpsertResponse3.equals(bulkUpsertResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBulkUpsertResponse bulkUpsertResponse1 = OASBulkUpsertResponse.getExample();
        OASBulkUpsertResponse bulkUpsertResponse2 = OASBulkUpsertResponse.getExample();
        OASBulkUpsertResponse bulkUpsertResponse3 = new OASBulkUpsertResponse();
        OASBulkUpsertResponse bulkUpsertResponse4 = new OASBulkUpsertResponse();

        System.assert(bulkUpsertResponse1.equals(bulkUpsertResponse2));
        System.assert(bulkUpsertResponse2.equals(bulkUpsertResponse1));
        System.assert(bulkUpsertResponse3.equals(bulkUpsertResponse4));
        System.assert(bulkUpsertResponse4.equals(bulkUpsertResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBulkUpsertResponse bulkUpsertResponse1 = OASBulkUpsertResponse.getExample();
        OASBulkUpsertResponse bulkUpsertResponse2 = new OASBulkUpsertResponse();

        System.assertEquals(false, bulkUpsertResponse1.equals('foo'));
        System.assertEquals(false, bulkUpsertResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBulkUpsertResponse bulkUpsertResponse1 = OASBulkUpsertResponse.getExample();
        OASBulkUpsertResponse bulkUpsertResponse2 = new OASBulkUpsertResponse();
        OASBulkUpsertResponse bulkUpsertResponse3;

        System.assertEquals(false, bulkUpsertResponse1.equals(bulkUpsertResponse3));
        System.assertEquals(false, bulkUpsertResponse2.equals(bulkUpsertResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBulkUpsertResponse bulkUpsertResponse1 = OASBulkUpsertResponse.getExample();
        OASBulkUpsertResponse bulkUpsertResponse2 = new OASBulkUpsertResponse();

        System.assertEquals(bulkUpsertResponse1.hashCode(), bulkUpsertResponse1.hashCode());
        System.assertEquals(bulkUpsertResponse2.hashCode(), bulkUpsertResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBulkUpsertResponse bulkUpsertResponse1 = OASBulkUpsertResponse.getExample();
        OASBulkUpsertResponse bulkUpsertResponse2 = OASBulkUpsertResponse.getExample();
        OASBulkUpsertResponse bulkUpsertResponse3 = new OASBulkUpsertResponse();
        OASBulkUpsertResponse bulkUpsertResponse4 = new OASBulkUpsertResponse();

        System.assert(bulkUpsertResponse1.equals(bulkUpsertResponse2));
        System.assert(bulkUpsertResponse3.equals(bulkUpsertResponse4));
        System.assertEquals(bulkUpsertResponse1.hashCode(), bulkUpsertResponse2.hashCode());
        System.assertEquals(bulkUpsertResponse3.hashCode(), bulkUpsertResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASBulkUpsertResponse bulkUpsertResponse = new OASBulkUpsertResponse();
        Map<String, String> x-property-mappings = bulkUpsertResponse.getx-property-mappings();
        System.assertEquals('requestId', x-property-mappings.get('request_id'));
    }
}
