@isTest
private class OASBulkUpsertRequestUpdateTest {
    @isTest
    private static void equalsSameInstance() {
        OASBulkUpsertRequestUpdate bulkUpsertRequestUpdate1 = OASBulkUpsertRequestUpdate.getExample();
        OASBulkUpsertRequestUpdate bulkUpsertRequestUpdate2 = bulkUpsertRequestUpdate1;
        OASBulkUpsertRequestUpdate bulkUpsertRequestUpdate3 = new OASBulkUpsertRequestUpdate();
        OASBulkUpsertRequestUpdate bulkUpsertRequestUpdate4 = bulkUpsertRequestUpdate3;

        System.assert(bulkUpsertRequestUpdate1.equals(bulkUpsertRequestUpdate2));
        System.assert(bulkUpsertRequestUpdate2.equals(bulkUpsertRequestUpdate1));
        System.assert(bulkUpsertRequestUpdate1.equals(bulkUpsertRequestUpdate1));
        System.assert(bulkUpsertRequestUpdate3.equals(bulkUpsertRequestUpdate4));
        System.assert(bulkUpsertRequestUpdate4.equals(bulkUpsertRequestUpdate3));
        System.assert(bulkUpsertRequestUpdate3.equals(bulkUpsertRequestUpdate3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBulkUpsertRequestUpdate bulkUpsertRequestUpdate1 = OASBulkUpsertRequestUpdate.getExample();
        OASBulkUpsertRequestUpdate bulkUpsertRequestUpdate2 = OASBulkUpsertRequestUpdate.getExample();
        OASBulkUpsertRequestUpdate bulkUpsertRequestUpdate3 = new OASBulkUpsertRequestUpdate();
        OASBulkUpsertRequestUpdate bulkUpsertRequestUpdate4 = new OASBulkUpsertRequestUpdate();

        System.assert(bulkUpsertRequestUpdate1.equals(bulkUpsertRequestUpdate2));
        System.assert(bulkUpsertRequestUpdate2.equals(bulkUpsertRequestUpdate1));
        System.assert(bulkUpsertRequestUpdate3.equals(bulkUpsertRequestUpdate4));
        System.assert(bulkUpsertRequestUpdate4.equals(bulkUpsertRequestUpdate3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBulkUpsertRequestUpdate bulkUpsertRequestUpdate1 = OASBulkUpsertRequestUpdate.getExample();
        OASBulkUpsertRequestUpdate bulkUpsertRequestUpdate2 = new OASBulkUpsertRequestUpdate();

        System.assertEquals(false, bulkUpsertRequestUpdate1.equals('foo'));
        System.assertEquals(false, bulkUpsertRequestUpdate2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBulkUpsertRequestUpdate bulkUpsertRequestUpdate1 = OASBulkUpsertRequestUpdate.getExample();
        OASBulkUpsertRequestUpdate bulkUpsertRequestUpdate2 = new OASBulkUpsertRequestUpdate();
        OASBulkUpsertRequestUpdate bulkUpsertRequestUpdate3;

        System.assertEquals(false, bulkUpsertRequestUpdate1.equals(bulkUpsertRequestUpdate3));
        System.assertEquals(false, bulkUpsertRequestUpdate2.equals(bulkUpsertRequestUpdate3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBulkUpsertRequestUpdate bulkUpsertRequestUpdate1 = OASBulkUpsertRequestUpdate.getExample();
        OASBulkUpsertRequestUpdate bulkUpsertRequestUpdate2 = new OASBulkUpsertRequestUpdate();

        System.assertEquals(bulkUpsertRequestUpdate1.hashCode(), bulkUpsertRequestUpdate1.hashCode());
        System.assertEquals(bulkUpsertRequestUpdate2.hashCode(), bulkUpsertRequestUpdate2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBulkUpsertRequestUpdate bulkUpsertRequestUpdate1 = OASBulkUpsertRequestUpdate.getExample();
        OASBulkUpsertRequestUpdate bulkUpsertRequestUpdate2 = OASBulkUpsertRequestUpdate.getExample();
        OASBulkUpsertRequestUpdate bulkUpsertRequestUpdate3 = new OASBulkUpsertRequestUpdate();
        OASBulkUpsertRequestUpdate bulkUpsertRequestUpdate4 = new OASBulkUpsertRequestUpdate();

        System.assert(bulkUpsertRequestUpdate1.equals(bulkUpsertRequestUpdate2));
        System.assert(bulkUpsertRequestUpdate3.equals(bulkUpsertRequestUpdate4));
        System.assertEquals(bulkUpsertRequestUpdate1.hashCode(), bulkUpsertRequestUpdate2.hashCode());
        System.assertEquals(bulkUpsertRequestUpdate3.hashCode(), bulkUpsertRequestUpdate4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASBulkUpsertRequestUpdate bulkUpsertRequestUpdate = new OASBulkUpsertRequestUpdate();
        Map<String, String> x-property-mappings = bulkUpsertRequestUpdate.getx-property-mappings();
        System.assertEquals('adGroups', x-property-mappings.get('ad_groups'));
        System.assertEquals('productGroups', x-property-mappings.get('product_groups'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASBulkUpsertRequestUpdate bulkUpsertRequestUpdate = new OASBulkUpsertRequestUpdate();
        System.assertEquals(new List<OASCampaignUpdateRequest>(), bulkUpsertRequestUpdate.campaigns);
        System.assertEquals(new List<OASAdGroupUpdateRequest>(), bulkUpsertRequestUpdate.adGroups);
        System.assertEquals(new List<OASAdUpdateRequest>(), bulkUpsertRequestUpdate.ads);
        System.assertEquals(new List<OASProductGroupPromotionUpdateReques>(), bulkUpsertRequestUpdate.productGroups);
        System.assertEquals(new List<OASKeywordUpdate>(), bulkUpsertRequestUpdate.keywords);
    }
}
