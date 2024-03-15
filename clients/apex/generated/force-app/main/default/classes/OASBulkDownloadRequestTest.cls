@isTest
private class OASBulkDownloadRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASBulkDownloadRequest bulkDownloadRequest1 = OASBulkDownloadRequest.getExample();
        OASBulkDownloadRequest bulkDownloadRequest2 = bulkDownloadRequest1;
        OASBulkDownloadRequest bulkDownloadRequest3 = new OASBulkDownloadRequest();
        OASBulkDownloadRequest bulkDownloadRequest4 = bulkDownloadRequest3;

        System.assert(bulkDownloadRequest1.equals(bulkDownloadRequest2));
        System.assert(bulkDownloadRequest2.equals(bulkDownloadRequest1));
        System.assert(bulkDownloadRequest1.equals(bulkDownloadRequest1));
        System.assert(bulkDownloadRequest3.equals(bulkDownloadRequest4));
        System.assert(bulkDownloadRequest4.equals(bulkDownloadRequest3));
        System.assert(bulkDownloadRequest3.equals(bulkDownloadRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBulkDownloadRequest bulkDownloadRequest1 = OASBulkDownloadRequest.getExample();
        OASBulkDownloadRequest bulkDownloadRequest2 = OASBulkDownloadRequest.getExample();
        OASBulkDownloadRequest bulkDownloadRequest3 = new OASBulkDownloadRequest();
        OASBulkDownloadRequest bulkDownloadRequest4 = new OASBulkDownloadRequest();

        System.assert(bulkDownloadRequest1.equals(bulkDownloadRequest2));
        System.assert(bulkDownloadRequest2.equals(bulkDownloadRequest1));
        System.assert(bulkDownloadRequest3.equals(bulkDownloadRequest4));
        System.assert(bulkDownloadRequest4.equals(bulkDownloadRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBulkDownloadRequest bulkDownloadRequest1 = OASBulkDownloadRequest.getExample();
        OASBulkDownloadRequest bulkDownloadRequest2 = new OASBulkDownloadRequest();

        System.assertEquals(false, bulkDownloadRequest1.equals('foo'));
        System.assertEquals(false, bulkDownloadRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBulkDownloadRequest bulkDownloadRequest1 = OASBulkDownloadRequest.getExample();
        OASBulkDownloadRequest bulkDownloadRequest2 = new OASBulkDownloadRequest();
        OASBulkDownloadRequest bulkDownloadRequest3;

        System.assertEquals(false, bulkDownloadRequest1.equals(bulkDownloadRequest3));
        System.assertEquals(false, bulkDownloadRequest2.equals(bulkDownloadRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBulkDownloadRequest bulkDownloadRequest1 = OASBulkDownloadRequest.getExample();
        OASBulkDownloadRequest bulkDownloadRequest2 = new OASBulkDownloadRequest();

        System.assertEquals(bulkDownloadRequest1.hashCode(), bulkDownloadRequest1.hashCode());
        System.assertEquals(bulkDownloadRequest2.hashCode(), bulkDownloadRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBulkDownloadRequest bulkDownloadRequest1 = OASBulkDownloadRequest.getExample();
        OASBulkDownloadRequest bulkDownloadRequest2 = OASBulkDownloadRequest.getExample();
        OASBulkDownloadRequest bulkDownloadRequest3 = new OASBulkDownloadRequest();
        OASBulkDownloadRequest bulkDownloadRequest4 = new OASBulkDownloadRequest();

        System.assert(bulkDownloadRequest1.equals(bulkDownloadRequest2));
        System.assert(bulkDownloadRequest3.equals(bulkDownloadRequest4));
        System.assertEquals(bulkDownloadRequest1.hashCode(), bulkDownloadRequest2.hashCode());
        System.assertEquals(bulkDownloadRequest3.hashCode(), bulkDownloadRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASBulkDownloadRequest bulkDownloadRequest = new OASBulkDownloadRequest();
        Map<String, String> x-property-mappings = bulkDownloadRequest.getx-property-mappings();
        System.assertEquals('entityTypes', x-property-mappings.get('entity_types'));
        System.assertEquals('entityIds', x-property-mappings.get('entity_ids'));
        System.assertEquals('updatedSince', x-property-mappings.get('updated_since'));
        System.assertEquals('campaignFilter', x-property-mappings.get('campaign_filter'));
        System.assertEquals('outputFormat', x-property-mappings.get('output_format'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASBulkDownloadRequest bulkDownloadRequest = new OASBulkDownloadRequest();
        System.assertEquals(new List<OASBulkEntityType>(), bulkDownloadRequest.entityTypes);
        System.assertEquals(new List<String>(), bulkDownloadRequest.entityIds);
        System.assertEquals('JSON', bulkDownloadRequest.outputFormat);
        System.assertEquals(null, bulkDownloadRequest.updatedSince);
        System.assertEquals(null, bulkDownloadRequest.campaignFilter);
    }
}
