@isTest
private class OASBulkUpsertRequestCreateTest {
    @isTest
    private static void equalsSameInstance() {
        OASBulkUpsertRequestCreate bulkUpsertRequestCreate1 = OASBulkUpsertRequestCreate.getExample();
        OASBulkUpsertRequestCreate bulkUpsertRequestCreate2 = bulkUpsertRequestCreate1;
        OASBulkUpsertRequestCreate bulkUpsertRequestCreate3 = new OASBulkUpsertRequestCreate();
        OASBulkUpsertRequestCreate bulkUpsertRequestCreate4 = bulkUpsertRequestCreate3;

        System.assert(bulkUpsertRequestCreate1.equals(bulkUpsertRequestCreate2));
        System.assert(bulkUpsertRequestCreate2.equals(bulkUpsertRequestCreate1));
        System.assert(bulkUpsertRequestCreate1.equals(bulkUpsertRequestCreate1));
        System.assert(bulkUpsertRequestCreate3.equals(bulkUpsertRequestCreate4));
        System.assert(bulkUpsertRequestCreate4.equals(bulkUpsertRequestCreate3));
        System.assert(bulkUpsertRequestCreate3.equals(bulkUpsertRequestCreate3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBulkUpsertRequestCreate bulkUpsertRequestCreate1 = OASBulkUpsertRequestCreate.getExample();
        OASBulkUpsertRequestCreate bulkUpsertRequestCreate2 = OASBulkUpsertRequestCreate.getExample();
        OASBulkUpsertRequestCreate bulkUpsertRequestCreate3 = new OASBulkUpsertRequestCreate();
        OASBulkUpsertRequestCreate bulkUpsertRequestCreate4 = new OASBulkUpsertRequestCreate();

        System.assert(bulkUpsertRequestCreate1.equals(bulkUpsertRequestCreate2));
        System.assert(bulkUpsertRequestCreate2.equals(bulkUpsertRequestCreate1));
        System.assert(bulkUpsertRequestCreate3.equals(bulkUpsertRequestCreate4));
        System.assert(bulkUpsertRequestCreate4.equals(bulkUpsertRequestCreate3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBulkUpsertRequestCreate bulkUpsertRequestCreate1 = OASBulkUpsertRequestCreate.getExample();
        OASBulkUpsertRequestCreate bulkUpsertRequestCreate2 = new OASBulkUpsertRequestCreate();

        System.assertEquals(false, bulkUpsertRequestCreate1.equals('foo'));
        System.assertEquals(false, bulkUpsertRequestCreate2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBulkUpsertRequestCreate bulkUpsertRequestCreate1 = OASBulkUpsertRequestCreate.getExample();
        OASBulkUpsertRequestCreate bulkUpsertRequestCreate2 = new OASBulkUpsertRequestCreate();
        OASBulkUpsertRequestCreate bulkUpsertRequestCreate3;

        System.assertEquals(false, bulkUpsertRequestCreate1.equals(bulkUpsertRequestCreate3));
        System.assertEquals(false, bulkUpsertRequestCreate2.equals(bulkUpsertRequestCreate3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBulkUpsertRequestCreate bulkUpsertRequestCreate1 = OASBulkUpsertRequestCreate.getExample();
        OASBulkUpsertRequestCreate bulkUpsertRequestCreate2 = new OASBulkUpsertRequestCreate();

        System.assertEquals(bulkUpsertRequestCreate1.hashCode(), bulkUpsertRequestCreate1.hashCode());
        System.assertEquals(bulkUpsertRequestCreate2.hashCode(), bulkUpsertRequestCreate2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBulkUpsertRequestCreate bulkUpsertRequestCreate1 = OASBulkUpsertRequestCreate.getExample();
        OASBulkUpsertRequestCreate bulkUpsertRequestCreate2 = OASBulkUpsertRequestCreate.getExample();
        OASBulkUpsertRequestCreate bulkUpsertRequestCreate3 = new OASBulkUpsertRequestCreate();
        OASBulkUpsertRequestCreate bulkUpsertRequestCreate4 = new OASBulkUpsertRequestCreate();

        System.assert(bulkUpsertRequestCreate1.equals(bulkUpsertRequestCreate2));
        System.assert(bulkUpsertRequestCreate3.equals(bulkUpsertRequestCreate4));
        System.assertEquals(bulkUpsertRequestCreate1.hashCode(), bulkUpsertRequestCreate2.hashCode());
        System.assertEquals(bulkUpsertRequestCreate3.hashCode(), bulkUpsertRequestCreate4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASBulkUpsertRequestCreate bulkUpsertRequestCreate = new OASBulkUpsertRequestCreate();
        Map<String, String> x-property-mappings = bulkUpsertRequestCreate.getx-property-mappings();
        System.assertEquals('adGroups', x-property-mappings.get('ad_groups'));
        System.assertEquals('productGroups', x-property-mappings.get('product_groups'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASBulkUpsertRequestCreate bulkUpsertRequestCreate = new OASBulkUpsertRequestCreate();
        System.assertEquals(new List<OASCampaignCreateRequest>(), bulkUpsertRequestCreate.campaigns);
        System.assertEquals(new List<OASAdGroupCreateRequest>(), bulkUpsertRequestCreate.adGroups);
        System.assertEquals(new List<OASAdCreateRequest>(), bulkUpsertRequestCreate.ads);
        System.assertEquals(new List<OASProductGroupPromotionCreateReques>(), bulkUpsertRequestCreate.productGroups);
        System.assertEquals(new List<OASKeywordsRequest>(), bulkUpsertRequestCreate.keywords);
    }
}
