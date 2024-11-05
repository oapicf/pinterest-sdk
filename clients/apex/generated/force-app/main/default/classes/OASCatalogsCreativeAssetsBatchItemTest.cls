@isTest
private class OASCatalogsCreativeAssetsBatchItemTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsCreativeAssetsBatchItem catalogsCreativeAssetsBatchItem1 = OASCatalogsCreativeAssetsBatchItem.getExample();
        OASCatalogsCreativeAssetsBatchItem catalogsCreativeAssetsBatchItem2 = catalogsCreativeAssetsBatchItem1;
        OASCatalogsCreativeAssetsBatchItem catalogsCreativeAssetsBatchItem3 = new OASCatalogsCreativeAssetsBatchItem();
        OASCatalogsCreativeAssetsBatchItem catalogsCreativeAssetsBatchItem4 = catalogsCreativeAssetsBatchItem3;

        System.assert(catalogsCreativeAssetsBatchItem1.equals(catalogsCreativeAssetsBatchItem2));
        System.assert(catalogsCreativeAssetsBatchItem2.equals(catalogsCreativeAssetsBatchItem1));
        System.assert(catalogsCreativeAssetsBatchItem1.equals(catalogsCreativeAssetsBatchItem1));
        System.assert(catalogsCreativeAssetsBatchItem3.equals(catalogsCreativeAssetsBatchItem4));
        System.assert(catalogsCreativeAssetsBatchItem4.equals(catalogsCreativeAssetsBatchItem3));
        System.assert(catalogsCreativeAssetsBatchItem3.equals(catalogsCreativeAssetsBatchItem3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsCreativeAssetsBatchItem catalogsCreativeAssetsBatchItem1 = OASCatalogsCreativeAssetsBatchItem.getExample();
        OASCatalogsCreativeAssetsBatchItem catalogsCreativeAssetsBatchItem2 = OASCatalogsCreativeAssetsBatchItem.getExample();
        OASCatalogsCreativeAssetsBatchItem catalogsCreativeAssetsBatchItem3 = new OASCatalogsCreativeAssetsBatchItem();
        OASCatalogsCreativeAssetsBatchItem catalogsCreativeAssetsBatchItem4 = new OASCatalogsCreativeAssetsBatchItem();

        System.assert(catalogsCreativeAssetsBatchItem1.equals(catalogsCreativeAssetsBatchItem2));
        System.assert(catalogsCreativeAssetsBatchItem2.equals(catalogsCreativeAssetsBatchItem1));
        System.assert(catalogsCreativeAssetsBatchItem3.equals(catalogsCreativeAssetsBatchItem4));
        System.assert(catalogsCreativeAssetsBatchItem4.equals(catalogsCreativeAssetsBatchItem3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsCreativeAssetsBatchItem catalogsCreativeAssetsBatchItem1 = OASCatalogsCreativeAssetsBatchItem.getExample();
        OASCatalogsCreativeAssetsBatchItem catalogsCreativeAssetsBatchItem2 = new OASCatalogsCreativeAssetsBatchItem();

        System.assertEquals(false, catalogsCreativeAssetsBatchItem1.equals('foo'));
        System.assertEquals(false, catalogsCreativeAssetsBatchItem2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsCreativeAssetsBatchItem catalogsCreativeAssetsBatchItem1 = OASCatalogsCreativeAssetsBatchItem.getExample();
        OASCatalogsCreativeAssetsBatchItem catalogsCreativeAssetsBatchItem2 = new OASCatalogsCreativeAssetsBatchItem();
        OASCatalogsCreativeAssetsBatchItem catalogsCreativeAssetsBatchItem3;

        System.assertEquals(false, catalogsCreativeAssetsBatchItem1.equals(catalogsCreativeAssetsBatchItem3));
        System.assertEquals(false, catalogsCreativeAssetsBatchItem2.equals(catalogsCreativeAssetsBatchItem3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsCreativeAssetsBatchItem catalogsCreativeAssetsBatchItem1 = OASCatalogsCreativeAssetsBatchItem.getExample();
        OASCatalogsCreativeAssetsBatchItem catalogsCreativeAssetsBatchItem2 = new OASCatalogsCreativeAssetsBatchItem();

        System.assertEquals(catalogsCreativeAssetsBatchItem1.hashCode(), catalogsCreativeAssetsBatchItem1.hashCode());
        System.assertEquals(catalogsCreativeAssetsBatchItem2.hashCode(), catalogsCreativeAssetsBatchItem2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsCreativeAssetsBatchItem catalogsCreativeAssetsBatchItem1 = OASCatalogsCreativeAssetsBatchItem.getExample();
        OASCatalogsCreativeAssetsBatchItem catalogsCreativeAssetsBatchItem2 = OASCatalogsCreativeAssetsBatchItem.getExample();
        OASCatalogsCreativeAssetsBatchItem catalogsCreativeAssetsBatchItem3 = new OASCatalogsCreativeAssetsBatchItem();
        OASCatalogsCreativeAssetsBatchItem catalogsCreativeAssetsBatchItem4 = new OASCatalogsCreativeAssetsBatchItem();

        System.assert(catalogsCreativeAssetsBatchItem1.equals(catalogsCreativeAssetsBatchItem2));
        System.assert(catalogsCreativeAssetsBatchItem3.equals(catalogsCreativeAssetsBatchItem4));
        System.assertEquals(catalogsCreativeAssetsBatchItem1.hashCode(), catalogsCreativeAssetsBatchItem2.hashCode());
        System.assertEquals(catalogsCreativeAssetsBatchItem3.hashCode(), catalogsCreativeAssetsBatchItem4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsCreativeAssetsBatchItem catalogsCreativeAssetsBatchItem = new OASCatalogsCreativeAssetsBatchItem();
        Map<String, String> x-property-mappings = catalogsCreativeAssetsBatchItem.getx-property-mappings();
        System.assertEquals('creativeAssetsId', x-property-mappings.get('creative_assets_id'));
    }
}
