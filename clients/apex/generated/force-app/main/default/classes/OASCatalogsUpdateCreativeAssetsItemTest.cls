@isTest
private class OASCatalogsUpdateCreativeAssetsItemTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsUpdateCreativeAssetsItem catalogsUpdateCreativeAssetsItem1 = OASCatalogsUpdateCreativeAssetsItem.getExample();
        OASCatalogsUpdateCreativeAssetsItem catalogsUpdateCreativeAssetsItem2 = catalogsUpdateCreativeAssetsItem1;
        OASCatalogsUpdateCreativeAssetsItem catalogsUpdateCreativeAssetsItem3 = new OASCatalogsUpdateCreativeAssetsItem();
        OASCatalogsUpdateCreativeAssetsItem catalogsUpdateCreativeAssetsItem4 = catalogsUpdateCreativeAssetsItem3;

        System.assert(catalogsUpdateCreativeAssetsItem1.equals(catalogsUpdateCreativeAssetsItem2));
        System.assert(catalogsUpdateCreativeAssetsItem2.equals(catalogsUpdateCreativeAssetsItem1));
        System.assert(catalogsUpdateCreativeAssetsItem1.equals(catalogsUpdateCreativeAssetsItem1));
        System.assert(catalogsUpdateCreativeAssetsItem3.equals(catalogsUpdateCreativeAssetsItem4));
        System.assert(catalogsUpdateCreativeAssetsItem4.equals(catalogsUpdateCreativeAssetsItem3));
        System.assert(catalogsUpdateCreativeAssetsItem3.equals(catalogsUpdateCreativeAssetsItem3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsUpdateCreativeAssetsItem catalogsUpdateCreativeAssetsItem1 = OASCatalogsUpdateCreativeAssetsItem.getExample();
        OASCatalogsUpdateCreativeAssetsItem catalogsUpdateCreativeAssetsItem2 = OASCatalogsUpdateCreativeAssetsItem.getExample();
        OASCatalogsUpdateCreativeAssetsItem catalogsUpdateCreativeAssetsItem3 = new OASCatalogsUpdateCreativeAssetsItem();
        OASCatalogsUpdateCreativeAssetsItem catalogsUpdateCreativeAssetsItem4 = new OASCatalogsUpdateCreativeAssetsItem();

        System.assert(catalogsUpdateCreativeAssetsItem1.equals(catalogsUpdateCreativeAssetsItem2));
        System.assert(catalogsUpdateCreativeAssetsItem2.equals(catalogsUpdateCreativeAssetsItem1));
        System.assert(catalogsUpdateCreativeAssetsItem3.equals(catalogsUpdateCreativeAssetsItem4));
        System.assert(catalogsUpdateCreativeAssetsItem4.equals(catalogsUpdateCreativeAssetsItem3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsUpdateCreativeAssetsItem catalogsUpdateCreativeAssetsItem1 = OASCatalogsUpdateCreativeAssetsItem.getExample();
        OASCatalogsUpdateCreativeAssetsItem catalogsUpdateCreativeAssetsItem2 = new OASCatalogsUpdateCreativeAssetsItem();

        System.assertEquals(false, catalogsUpdateCreativeAssetsItem1.equals('foo'));
        System.assertEquals(false, catalogsUpdateCreativeAssetsItem2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsUpdateCreativeAssetsItem catalogsUpdateCreativeAssetsItem1 = OASCatalogsUpdateCreativeAssetsItem.getExample();
        OASCatalogsUpdateCreativeAssetsItem catalogsUpdateCreativeAssetsItem2 = new OASCatalogsUpdateCreativeAssetsItem();
        OASCatalogsUpdateCreativeAssetsItem catalogsUpdateCreativeAssetsItem3;

        System.assertEquals(false, catalogsUpdateCreativeAssetsItem1.equals(catalogsUpdateCreativeAssetsItem3));
        System.assertEquals(false, catalogsUpdateCreativeAssetsItem2.equals(catalogsUpdateCreativeAssetsItem3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsUpdateCreativeAssetsItem catalogsUpdateCreativeAssetsItem1 = OASCatalogsUpdateCreativeAssetsItem.getExample();
        OASCatalogsUpdateCreativeAssetsItem catalogsUpdateCreativeAssetsItem2 = new OASCatalogsUpdateCreativeAssetsItem();

        System.assertEquals(catalogsUpdateCreativeAssetsItem1.hashCode(), catalogsUpdateCreativeAssetsItem1.hashCode());
        System.assertEquals(catalogsUpdateCreativeAssetsItem2.hashCode(), catalogsUpdateCreativeAssetsItem2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsUpdateCreativeAssetsItem catalogsUpdateCreativeAssetsItem1 = OASCatalogsUpdateCreativeAssetsItem.getExample();
        OASCatalogsUpdateCreativeAssetsItem catalogsUpdateCreativeAssetsItem2 = OASCatalogsUpdateCreativeAssetsItem.getExample();
        OASCatalogsUpdateCreativeAssetsItem catalogsUpdateCreativeAssetsItem3 = new OASCatalogsUpdateCreativeAssetsItem();
        OASCatalogsUpdateCreativeAssetsItem catalogsUpdateCreativeAssetsItem4 = new OASCatalogsUpdateCreativeAssetsItem();

        System.assert(catalogsUpdateCreativeAssetsItem1.equals(catalogsUpdateCreativeAssetsItem2));
        System.assert(catalogsUpdateCreativeAssetsItem3.equals(catalogsUpdateCreativeAssetsItem4));
        System.assertEquals(catalogsUpdateCreativeAssetsItem1.hashCode(), catalogsUpdateCreativeAssetsItem2.hashCode());
        System.assertEquals(catalogsUpdateCreativeAssetsItem3.hashCode(), catalogsUpdateCreativeAssetsItem4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsUpdateCreativeAssetsItem catalogsUpdateCreativeAssetsItem = new OASCatalogsUpdateCreativeAssetsItem();
        Map<String, String> x-property-mappings = catalogsUpdateCreativeAssetsItem.getx-property-mappings();
        System.assertEquals('creativeAssetsId', x-property-mappings.get('creative_assets_id'));
    }
}
