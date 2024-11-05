@isTest
private class OASCatalogsUpsertCreativeAssetsItemTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsUpsertCreativeAssetsItem catalogsUpsertCreativeAssetsItem1 = OASCatalogsUpsertCreativeAssetsItem.getExample();
        OASCatalogsUpsertCreativeAssetsItem catalogsUpsertCreativeAssetsItem2 = catalogsUpsertCreativeAssetsItem1;
        OASCatalogsUpsertCreativeAssetsItem catalogsUpsertCreativeAssetsItem3 = new OASCatalogsUpsertCreativeAssetsItem();
        OASCatalogsUpsertCreativeAssetsItem catalogsUpsertCreativeAssetsItem4 = catalogsUpsertCreativeAssetsItem3;

        System.assert(catalogsUpsertCreativeAssetsItem1.equals(catalogsUpsertCreativeAssetsItem2));
        System.assert(catalogsUpsertCreativeAssetsItem2.equals(catalogsUpsertCreativeAssetsItem1));
        System.assert(catalogsUpsertCreativeAssetsItem1.equals(catalogsUpsertCreativeAssetsItem1));
        System.assert(catalogsUpsertCreativeAssetsItem3.equals(catalogsUpsertCreativeAssetsItem4));
        System.assert(catalogsUpsertCreativeAssetsItem4.equals(catalogsUpsertCreativeAssetsItem3));
        System.assert(catalogsUpsertCreativeAssetsItem3.equals(catalogsUpsertCreativeAssetsItem3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsUpsertCreativeAssetsItem catalogsUpsertCreativeAssetsItem1 = OASCatalogsUpsertCreativeAssetsItem.getExample();
        OASCatalogsUpsertCreativeAssetsItem catalogsUpsertCreativeAssetsItem2 = OASCatalogsUpsertCreativeAssetsItem.getExample();
        OASCatalogsUpsertCreativeAssetsItem catalogsUpsertCreativeAssetsItem3 = new OASCatalogsUpsertCreativeAssetsItem();
        OASCatalogsUpsertCreativeAssetsItem catalogsUpsertCreativeAssetsItem4 = new OASCatalogsUpsertCreativeAssetsItem();

        System.assert(catalogsUpsertCreativeAssetsItem1.equals(catalogsUpsertCreativeAssetsItem2));
        System.assert(catalogsUpsertCreativeAssetsItem2.equals(catalogsUpsertCreativeAssetsItem1));
        System.assert(catalogsUpsertCreativeAssetsItem3.equals(catalogsUpsertCreativeAssetsItem4));
        System.assert(catalogsUpsertCreativeAssetsItem4.equals(catalogsUpsertCreativeAssetsItem3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsUpsertCreativeAssetsItem catalogsUpsertCreativeAssetsItem1 = OASCatalogsUpsertCreativeAssetsItem.getExample();
        OASCatalogsUpsertCreativeAssetsItem catalogsUpsertCreativeAssetsItem2 = new OASCatalogsUpsertCreativeAssetsItem();

        System.assertEquals(false, catalogsUpsertCreativeAssetsItem1.equals('foo'));
        System.assertEquals(false, catalogsUpsertCreativeAssetsItem2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsUpsertCreativeAssetsItem catalogsUpsertCreativeAssetsItem1 = OASCatalogsUpsertCreativeAssetsItem.getExample();
        OASCatalogsUpsertCreativeAssetsItem catalogsUpsertCreativeAssetsItem2 = new OASCatalogsUpsertCreativeAssetsItem();
        OASCatalogsUpsertCreativeAssetsItem catalogsUpsertCreativeAssetsItem3;

        System.assertEquals(false, catalogsUpsertCreativeAssetsItem1.equals(catalogsUpsertCreativeAssetsItem3));
        System.assertEquals(false, catalogsUpsertCreativeAssetsItem2.equals(catalogsUpsertCreativeAssetsItem3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsUpsertCreativeAssetsItem catalogsUpsertCreativeAssetsItem1 = OASCatalogsUpsertCreativeAssetsItem.getExample();
        OASCatalogsUpsertCreativeAssetsItem catalogsUpsertCreativeAssetsItem2 = new OASCatalogsUpsertCreativeAssetsItem();

        System.assertEquals(catalogsUpsertCreativeAssetsItem1.hashCode(), catalogsUpsertCreativeAssetsItem1.hashCode());
        System.assertEquals(catalogsUpsertCreativeAssetsItem2.hashCode(), catalogsUpsertCreativeAssetsItem2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsUpsertCreativeAssetsItem catalogsUpsertCreativeAssetsItem1 = OASCatalogsUpsertCreativeAssetsItem.getExample();
        OASCatalogsUpsertCreativeAssetsItem catalogsUpsertCreativeAssetsItem2 = OASCatalogsUpsertCreativeAssetsItem.getExample();
        OASCatalogsUpsertCreativeAssetsItem catalogsUpsertCreativeAssetsItem3 = new OASCatalogsUpsertCreativeAssetsItem();
        OASCatalogsUpsertCreativeAssetsItem catalogsUpsertCreativeAssetsItem4 = new OASCatalogsUpsertCreativeAssetsItem();

        System.assert(catalogsUpsertCreativeAssetsItem1.equals(catalogsUpsertCreativeAssetsItem2));
        System.assert(catalogsUpsertCreativeAssetsItem3.equals(catalogsUpsertCreativeAssetsItem4));
        System.assertEquals(catalogsUpsertCreativeAssetsItem1.hashCode(), catalogsUpsertCreativeAssetsItem2.hashCode());
        System.assertEquals(catalogsUpsertCreativeAssetsItem3.hashCode(), catalogsUpsertCreativeAssetsItem4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsUpsertCreativeAssetsItem catalogsUpsertCreativeAssetsItem = new OASCatalogsUpsertCreativeAssetsItem();
        Map<String, String> x-property-mappings = catalogsUpsertCreativeAssetsItem.getx-property-mappings();
        System.assertEquals('creativeAssetsId', x-property-mappings.get('creative_assets_id'));
    }
}
