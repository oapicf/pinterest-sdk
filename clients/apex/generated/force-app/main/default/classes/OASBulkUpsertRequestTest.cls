@isTest
private class OASBulkUpsertRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASBulkUpsertRequest bulkUpsertRequest1 = OASBulkUpsertRequest.getExample();
        OASBulkUpsertRequest bulkUpsertRequest2 = bulkUpsertRequest1;
        OASBulkUpsertRequest bulkUpsertRequest3 = new OASBulkUpsertRequest();
        OASBulkUpsertRequest bulkUpsertRequest4 = bulkUpsertRequest3;

        System.assert(bulkUpsertRequest1.equals(bulkUpsertRequest2));
        System.assert(bulkUpsertRequest2.equals(bulkUpsertRequest1));
        System.assert(bulkUpsertRequest1.equals(bulkUpsertRequest1));
        System.assert(bulkUpsertRequest3.equals(bulkUpsertRequest4));
        System.assert(bulkUpsertRequest4.equals(bulkUpsertRequest3));
        System.assert(bulkUpsertRequest3.equals(bulkUpsertRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBulkUpsertRequest bulkUpsertRequest1 = OASBulkUpsertRequest.getExample();
        OASBulkUpsertRequest bulkUpsertRequest2 = OASBulkUpsertRequest.getExample();
        OASBulkUpsertRequest bulkUpsertRequest3 = new OASBulkUpsertRequest();
        OASBulkUpsertRequest bulkUpsertRequest4 = new OASBulkUpsertRequest();

        System.assert(bulkUpsertRequest1.equals(bulkUpsertRequest2));
        System.assert(bulkUpsertRequest2.equals(bulkUpsertRequest1));
        System.assert(bulkUpsertRequest3.equals(bulkUpsertRequest4));
        System.assert(bulkUpsertRequest4.equals(bulkUpsertRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBulkUpsertRequest bulkUpsertRequest1 = OASBulkUpsertRequest.getExample();
        OASBulkUpsertRequest bulkUpsertRequest2 = new OASBulkUpsertRequest();

        System.assertEquals(false, bulkUpsertRequest1.equals('foo'));
        System.assertEquals(false, bulkUpsertRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBulkUpsertRequest bulkUpsertRequest1 = OASBulkUpsertRequest.getExample();
        OASBulkUpsertRequest bulkUpsertRequest2 = new OASBulkUpsertRequest();
        OASBulkUpsertRequest bulkUpsertRequest3;

        System.assertEquals(false, bulkUpsertRequest1.equals(bulkUpsertRequest3));
        System.assertEquals(false, bulkUpsertRequest2.equals(bulkUpsertRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBulkUpsertRequest bulkUpsertRequest1 = OASBulkUpsertRequest.getExample();
        OASBulkUpsertRequest bulkUpsertRequest2 = new OASBulkUpsertRequest();

        System.assertEquals(bulkUpsertRequest1.hashCode(), bulkUpsertRequest1.hashCode());
        System.assertEquals(bulkUpsertRequest2.hashCode(), bulkUpsertRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBulkUpsertRequest bulkUpsertRequest1 = OASBulkUpsertRequest.getExample();
        OASBulkUpsertRequest bulkUpsertRequest2 = OASBulkUpsertRequest.getExample();
        OASBulkUpsertRequest bulkUpsertRequest3 = new OASBulkUpsertRequest();
        OASBulkUpsertRequest bulkUpsertRequest4 = new OASBulkUpsertRequest();

        System.assert(bulkUpsertRequest1.equals(bulkUpsertRequest2));
        System.assert(bulkUpsertRequest3.equals(bulkUpsertRequest4));
        System.assertEquals(bulkUpsertRequest1.hashCode(), bulkUpsertRequest2.hashCode());
        System.assertEquals(bulkUpsertRequest3.hashCode(), bulkUpsertRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASBulkUpsertRequest bulkUpsertRequest = new OASBulkUpsertRequest();
        Map<String, String> x-property-mappings = bulkUpsertRequest.getx-property-mappings();
        System.assertEquals('r_update', x-property-mappings.get('update'));
    }
}
