@isTest
private class OASBulkUpsertStatusResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASBulkUpsertStatusResponse bulkUpsertStatusResponse1 = OASBulkUpsertStatusResponse.getExample();
        OASBulkUpsertStatusResponse bulkUpsertStatusResponse2 = bulkUpsertStatusResponse1;
        OASBulkUpsertStatusResponse bulkUpsertStatusResponse3 = new OASBulkUpsertStatusResponse();
        OASBulkUpsertStatusResponse bulkUpsertStatusResponse4 = bulkUpsertStatusResponse3;

        System.assert(bulkUpsertStatusResponse1.equals(bulkUpsertStatusResponse2));
        System.assert(bulkUpsertStatusResponse2.equals(bulkUpsertStatusResponse1));
        System.assert(bulkUpsertStatusResponse1.equals(bulkUpsertStatusResponse1));
        System.assert(bulkUpsertStatusResponse3.equals(bulkUpsertStatusResponse4));
        System.assert(bulkUpsertStatusResponse4.equals(bulkUpsertStatusResponse3));
        System.assert(bulkUpsertStatusResponse3.equals(bulkUpsertStatusResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBulkUpsertStatusResponse bulkUpsertStatusResponse1 = OASBulkUpsertStatusResponse.getExample();
        OASBulkUpsertStatusResponse bulkUpsertStatusResponse2 = OASBulkUpsertStatusResponse.getExample();
        OASBulkUpsertStatusResponse bulkUpsertStatusResponse3 = new OASBulkUpsertStatusResponse();
        OASBulkUpsertStatusResponse bulkUpsertStatusResponse4 = new OASBulkUpsertStatusResponse();

        System.assert(bulkUpsertStatusResponse1.equals(bulkUpsertStatusResponse2));
        System.assert(bulkUpsertStatusResponse2.equals(bulkUpsertStatusResponse1));
        System.assert(bulkUpsertStatusResponse3.equals(bulkUpsertStatusResponse4));
        System.assert(bulkUpsertStatusResponse4.equals(bulkUpsertStatusResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBulkUpsertStatusResponse bulkUpsertStatusResponse1 = OASBulkUpsertStatusResponse.getExample();
        OASBulkUpsertStatusResponse bulkUpsertStatusResponse2 = new OASBulkUpsertStatusResponse();

        System.assertEquals(false, bulkUpsertStatusResponse1.equals('foo'));
        System.assertEquals(false, bulkUpsertStatusResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBulkUpsertStatusResponse bulkUpsertStatusResponse1 = OASBulkUpsertStatusResponse.getExample();
        OASBulkUpsertStatusResponse bulkUpsertStatusResponse2 = new OASBulkUpsertStatusResponse();
        OASBulkUpsertStatusResponse bulkUpsertStatusResponse3;

        System.assertEquals(false, bulkUpsertStatusResponse1.equals(bulkUpsertStatusResponse3));
        System.assertEquals(false, bulkUpsertStatusResponse2.equals(bulkUpsertStatusResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBulkUpsertStatusResponse bulkUpsertStatusResponse1 = OASBulkUpsertStatusResponse.getExample();
        OASBulkUpsertStatusResponse bulkUpsertStatusResponse2 = new OASBulkUpsertStatusResponse();

        System.assertEquals(bulkUpsertStatusResponse1.hashCode(), bulkUpsertStatusResponse1.hashCode());
        System.assertEquals(bulkUpsertStatusResponse2.hashCode(), bulkUpsertStatusResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBulkUpsertStatusResponse bulkUpsertStatusResponse1 = OASBulkUpsertStatusResponse.getExample();
        OASBulkUpsertStatusResponse bulkUpsertStatusResponse2 = OASBulkUpsertStatusResponse.getExample();
        OASBulkUpsertStatusResponse bulkUpsertStatusResponse3 = new OASBulkUpsertStatusResponse();
        OASBulkUpsertStatusResponse bulkUpsertStatusResponse4 = new OASBulkUpsertStatusResponse();

        System.assert(bulkUpsertStatusResponse1.equals(bulkUpsertStatusResponse2));
        System.assert(bulkUpsertStatusResponse3.equals(bulkUpsertStatusResponse4));
        System.assertEquals(bulkUpsertStatusResponse1.hashCode(), bulkUpsertStatusResponse2.hashCode());
        System.assertEquals(bulkUpsertStatusResponse3.hashCode(), bulkUpsertStatusResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASBulkUpsertStatusResponse bulkUpsertStatusResponse = new OASBulkUpsertStatusResponse();
        Map<String, String> x-property-mappings = bulkUpsertStatusResponse.getx-property-mappings();
        System.assertEquals('resultUrl', x-property-mappings.get('result_url'));
    }
}
