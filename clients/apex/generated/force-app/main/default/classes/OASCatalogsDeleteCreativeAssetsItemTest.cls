@isTest
private class OASCatalogsDeleteCreativeAssetsItemTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsDeleteCreativeAssetsItem catalogsDeleteCreativeAssetsItem1 = OASCatalogsDeleteCreativeAssetsItem.getExample();
        OASCatalogsDeleteCreativeAssetsItem catalogsDeleteCreativeAssetsItem2 = catalogsDeleteCreativeAssetsItem1;
        OASCatalogsDeleteCreativeAssetsItem catalogsDeleteCreativeAssetsItem3 = new OASCatalogsDeleteCreativeAssetsItem();
        OASCatalogsDeleteCreativeAssetsItem catalogsDeleteCreativeAssetsItem4 = catalogsDeleteCreativeAssetsItem3;

        System.assert(catalogsDeleteCreativeAssetsItem1.equals(catalogsDeleteCreativeAssetsItem2));
        System.assert(catalogsDeleteCreativeAssetsItem2.equals(catalogsDeleteCreativeAssetsItem1));
        System.assert(catalogsDeleteCreativeAssetsItem1.equals(catalogsDeleteCreativeAssetsItem1));
        System.assert(catalogsDeleteCreativeAssetsItem3.equals(catalogsDeleteCreativeAssetsItem4));
        System.assert(catalogsDeleteCreativeAssetsItem4.equals(catalogsDeleteCreativeAssetsItem3));
        System.assert(catalogsDeleteCreativeAssetsItem3.equals(catalogsDeleteCreativeAssetsItem3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsDeleteCreativeAssetsItem catalogsDeleteCreativeAssetsItem1 = OASCatalogsDeleteCreativeAssetsItem.getExample();
        OASCatalogsDeleteCreativeAssetsItem catalogsDeleteCreativeAssetsItem2 = OASCatalogsDeleteCreativeAssetsItem.getExample();
        OASCatalogsDeleteCreativeAssetsItem catalogsDeleteCreativeAssetsItem3 = new OASCatalogsDeleteCreativeAssetsItem();
        OASCatalogsDeleteCreativeAssetsItem catalogsDeleteCreativeAssetsItem4 = new OASCatalogsDeleteCreativeAssetsItem();

        System.assert(catalogsDeleteCreativeAssetsItem1.equals(catalogsDeleteCreativeAssetsItem2));
        System.assert(catalogsDeleteCreativeAssetsItem2.equals(catalogsDeleteCreativeAssetsItem1));
        System.assert(catalogsDeleteCreativeAssetsItem3.equals(catalogsDeleteCreativeAssetsItem4));
        System.assert(catalogsDeleteCreativeAssetsItem4.equals(catalogsDeleteCreativeAssetsItem3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsDeleteCreativeAssetsItem catalogsDeleteCreativeAssetsItem1 = OASCatalogsDeleteCreativeAssetsItem.getExample();
        OASCatalogsDeleteCreativeAssetsItem catalogsDeleteCreativeAssetsItem2 = new OASCatalogsDeleteCreativeAssetsItem();

        System.assertEquals(false, catalogsDeleteCreativeAssetsItem1.equals('foo'));
        System.assertEquals(false, catalogsDeleteCreativeAssetsItem2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsDeleteCreativeAssetsItem catalogsDeleteCreativeAssetsItem1 = OASCatalogsDeleteCreativeAssetsItem.getExample();
        OASCatalogsDeleteCreativeAssetsItem catalogsDeleteCreativeAssetsItem2 = new OASCatalogsDeleteCreativeAssetsItem();
        OASCatalogsDeleteCreativeAssetsItem catalogsDeleteCreativeAssetsItem3;

        System.assertEquals(false, catalogsDeleteCreativeAssetsItem1.equals(catalogsDeleteCreativeAssetsItem3));
        System.assertEquals(false, catalogsDeleteCreativeAssetsItem2.equals(catalogsDeleteCreativeAssetsItem3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsDeleteCreativeAssetsItem catalogsDeleteCreativeAssetsItem1 = OASCatalogsDeleteCreativeAssetsItem.getExample();
        OASCatalogsDeleteCreativeAssetsItem catalogsDeleteCreativeAssetsItem2 = new OASCatalogsDeleteCreativeAssetsItem();

        System.assertEquals(catalogsDeleteCreativeAssetsItem1.hashCode(), catalogsDeleteCreativeAssetsItem1.hashCode());
        System.assertEquals(catalogsDeleteCreativeAssetsItem2.hashCode(), catalogsDeleteCreativeAssetsItem2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsDeleteCreativeAssetsItem catalogsDeleteCreativeAssetsItem1 = OASCatalogsDeleteCreativeAssetsItem.getExample();
        OASCatalogsDeleteCreativeAssetsItem catalogsDeleteCreativeAssetsItem2 = OASCatalogsDeleteCreativeAssetsItem.getExample();
        OASCatalogsDeleteCreativeAssetsItem catalogsDeleteCreativeAssetsItem3 = new OASCatalogsDeleteCreativeAssetsItem();
        OASCatalogsDeleteCreativeAssetsItem catalogsDeleteCreativeAssetsItem4 = new OASCatalogsDeleteCreativeAssetsItem();

        System.assert(catalogsDeleteCreativeAssetsItem1.equals(catalogsDeleteCreativeAssetsItem2));
        System.assert(catalogsDeleteCreativeAssetsItem3.equals(catalogsDeleteCreativeAssetsItem4));
        System.assertEquals(catalogsDeleteCreativeAssetsItem1.hashCode(), catalogsDeleteCreativeAssetsItem2.hashCode());
        System.assertEquals(catalogsDeleteCreativeAssetsItem3.hashCode(), catalogsDeleteCreativeAssetsItem4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsDeleteCreativeAssetsItem catalogsDeleteCreativeAssetsItem = new OASCatalogsDeleteCreativeAssetsItem();
        Map<String, String> x-property-mappings = catalogsDeleteCreativeAssetsItem.getx-property-mappings();
        System.assertEquals('creativeAssetsId', x-property-mappings.get('creative_assets_id'));
    }
}
