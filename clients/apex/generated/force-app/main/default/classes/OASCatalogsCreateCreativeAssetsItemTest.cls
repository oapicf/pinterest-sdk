@isTest
private class OASCatalogsCreateCreativeAssetsItemTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsCreateCreativeAssetsItem catalogsCreateCreativeAssetsItem1 = OASCatalogsCreateCreativeAssetsItem.getExample();
        OASCatalogsCreateCreativeAssetsItem catalogsCreateCreativeAssetsItem2 = catalogsCreateCreativeAssetsItem1;
        OASCatalogsCreateCreativeAssetsItem catalogsCreateCreativeAssetsItem3 = new OASCatalogsCreateCreativeAssetsItem();
        OASCatalogsCreateCreativeAssetsItem catalogsCreateCreativeAssetsItem4 = catalogsCreateCreativeAssetsItem3;

        System.assert(catalogsCreateCreativeAssetsItem1.equals(catalogsCreateCreativeAssetsItem2));
        System.assert(catalogsCreateCreativeAssetsItem2.equals(catalogsCreateCreativeAssetsItem1));
        System.assert(catalogsCreateCreativeAssetsItem1.equals(catalogsCreateCreativeAssetsItem1));
        System.assert(catalogsCreateCreativeAssetsItem3.equals(catalogsCreateCreativeAssetsItem4));
        System.assert(catalogsCreateCreativeAssetsItem4.equals(catalogsCreateCreativeAssetsItem3));
        System.assert(catalogsCreateCreativeAssetsItem3.equals(catalogsCreateCreativeAssetsItem3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsCreateCreativeAssetsItem catalogsCreateCreativeAssetsItem1 = OASCatalogsCreateCreativeAssetsItem.getExample();
        OASCatalogsCreateCreativeAssetsItem catalogsCreateCreativeAssetsItem2 = OASCatalogsCreateCreativeAssetsItem.getExample();
        OASCatalogsCreateCreativeAssetsItem catalogsCreateCreativeAssetsItem3 = new OASCatalogsCreateCreativeAssetsItem();
        OASCatalogsCreateCreativeAssetsItem catalogsCreateCreativeAssetsItem4 = new OASCatalogsCreateCreativeAssetsItem();

        System.assert(catalogsCreateCreativeAssetsItem1.equals(catalogsCreateCreativeAssetsItem2));
        System.assert(catalogsCreateCreativeAssetsItem2.equals(catalogsCreateCreativeAssetsItem1));
        System.assert(catalogsCreateCreativeAssetsItem3.equals(catalogsCreateCreativeAssetsItem4));
        System.assert(catalogsCreateCreativeAssetsItem4.equals(catalogsCreateCreativeAssetsItem3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsCreateCreativeAssetsItem catalogsCreateCreativeAssetsItem1 = OASCatalogsCreateCreativeAssetsItem.getExample();
        OASCatalogsCreateCreativeAssetsItem catalogsCreateCreativeAssetsItem2 = new OASCatalogsCreateCreativeAssetsItem();

        System.assertEquals(false, catalogsCreateCreativeAssetsItem1.equals('foo'));
        System.assertEquals(false, catalogsCreateCreativeAssetsItem2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsCreateCreativeAssetsItem catalogsCreateCreativeAssetsItem1 = OASCatalogsCreateCreativeAssetsItem.getExample();
        OASCatalogsCreateCreativeAssetsItem catalogsCreateCreativeAssetsItem2 = new OASCatalogsCreateCreativeAssetsItem();
        OASCatalogsCreateCreativeAssetsItem catalogsCreateCreativeAssetsItem3;

        System.assertEquals(false, catalogsCreateCreativeAssetsItem1.equals(catalogsCreateCreativeAssetsItem3));
        System.assertEquals(false, catalogsCreateCreativeAssetsItem2.equals(catalogsCreateCreativeAssetsItem3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsCreateCreativeAssetsItem catalogsCreateCreativeAssetsItem1 = OASCatalogsCreateCreativeAssetsItem.getExample();
        OASCatalogsCreateCreativeAssetsItem catalogsCreateCreativeAssetsItem2 = new OASCatalogsCreateCreativeAssetsItem();

        System.assertEquals(catalogsCreateCreativeAssetsItem1.hashCode(), catalogsCreateCreativeAssetsItem1.hashCode());
        System.assertEquals(catalogsCreateCreativeAssetsItem2.hashCode(), catalogsCreateCreativeAssetsItem2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsCreateCreativeAssetsItem catalogsCreateCreativeAssetsItem1 = OASCatalogsCreateCreativeAssetsItem.getExample();
        OASCatalogsCreateCreativeAssetsItem catalogsCreateCreativeAssetsItem2 = OASCatalogsCreateCreativeAssetsItem.getExample();
        OASCatalogsCreateCreativeAssetsItem catalogsCreateCreativeAssetsItem3 = new OASCatalogsCreateCreativeAssetsItem();
        OASCatalogsCreateCreativeAssetsItem catalogsCreateCreativeAssetsItem4 = new OASCatalogsCreateCreativeAssetsItem();

        System.assert(catalogsCreateCreativeAssetsItem1.equals(catalogsCreateCreativeAssetsItem2));
        System.assert(catalogsCreateCreativeAssetsItem3.equals(catalogsCreateCreativeAssetsItem4));
        System.assertEquals(catalogsCreateCreativeAssetsItem1.hashCode(), catalogsCreateCreativeAssetsItem2.hashCode());
        System.assertEquals(catalogsCreateCreativeAssetsItem3.hashCode(), catalogsCreateCreativeAssetsItem4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsCreateCreativeAssetsItem catalogsCreateCreativeAssetsItem = new OASCatalogsCreateCreativeAssetsItem();
        Map<String, String> x-property-mappings = catalogsCreateCreativeAssetsItem.getx-property-mappings();
        System.assertEquals('creativeAssetsId', x-property-mappings.get('creative_assets_id'));
    }
}
