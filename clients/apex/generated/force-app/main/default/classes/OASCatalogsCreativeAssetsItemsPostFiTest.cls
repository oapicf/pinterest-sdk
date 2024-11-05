@isTest
private class OASCatalogsCreativeAssetsItemsPostFiTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsCreativeAssetsItemsPostFi catalogsCreativeAssetsItemsPostFilter1 = OASCatalogsCreativeAssetsItemsPostFi.getExample();
        OASCatalogsCreativeAssetsItemsPostFi catalogsCreativeAssetsItemsPostFilter2 = catalogsCreativeAssetsItemsPostFilter1;
        OASCatalogsCreativeAssetsItemsPostFi catalogsCreativeAssetsItemsPostFilter3 = new OASCatalogsCreativeAssetsItemsPostFi();
        OASCatalogsCreativeAssetsItemsPostFi catalogsCreativeAssetsItemsPostFilter4 = catalogsCreativeAssetsItemsPostFilter3;

        System.assert(catalogsCreativeAssetsItemsPostFilter1.equals(catalogsCreativeAssetsItemsPostFilter2));
        System.assert(catalogsCreativeAssetsItemsPostFilter2.equals(catalogsCreativeAssetsItemsPostFilter1));
        System.assert(catalogsCreativeAssetsItemsPostFilter1.equals(catalogsCreativeAssetsItemsPostFilter1));
        System.assert(catalogsCreativeAssetsItemsPostFilter3.equals(catalogsCreativeAssetsItemsPostFilter4));
        System.assert(catalogsCreativeAssetsItemsPostFilter4.equals(catalogsCreativeAssetsItemsPostFilter3));
        System.assert(catalogsCreativeAssetsItemsPostFilter3.equals(catalogsCreativeAssetsItemsPostFilter3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsCreativeAssetsItemsPostFi catalogsCreativeAssetsItemsPostFilter1 = OASCatalogsCreativeAssetsItemsPostFi.getExample();
        OASCatalogsCreativeAssetsItemsPostFi catalogsCreativeAssetsItemsPostFilter2 = OASCatalogsCreativeAssetsItemsPostFi.getExample();
        OASCatalogsCreativeAssetsItemsPostFi catalogsCreativeAssetsItemsPostFilter3 = new OASCatalogsCreativeAssetsItemsPostFi();
        OASCatalogsCreativeAssetsItemsPostFi catalogsCreativeAssetsItemsPostFilter4 = new OASCatalogsCreativeAssetsItemsPostFi();

        System.assert(catalogsCreativeAssetsItemsPostFilter1.equals(catalogsCreativeAssetsItemsPostFilter2));
        System.assert(catalogsCreativeAssetsItemsPostFilter2.equals(catalogsCreativeAssetsItemsPostFilter1));
        System.assert(catalogsCreativeAssetsItemsPostFilter3.equals(catalogsCreativeAssetsItemsPostFilter4));
        System.assert(catalogsCreativeAssetsItemsPostFilter4.equals(catalogsCreativeAssetsItemsPostFilter3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsCreativeAssetsItemsPostFi catalogsCreativeAssetsItemsPostFilter1 = OASCatalogsCreativeAssetsItemsPostFi.getExample();
        OASCatalogsCreativeAssetsItemsPostFi catalogsCreativeAssetsItemsPostFilter2 = new OASCatalogsCreativeAssetsItemsPostFi();

        System.assertEquals(false, catalogsCreativeAssetsItemsPostFilter1.equals('foo'));
        System.assertEquals(false, catalogsCreativeAssetsItemsPostFilter2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsCreativeAssetsItemsPostFi catalogsCreativeAssetsItemsPostFilter1 = OASCatalogsCreativeAssetsItemsPostFi.getExample();
        OASCatalogsCreativeAssetsItemsPostFi catalogsCreativeAssetsItemsPostFilter2 = new OASCatalogsCreativeAssetsItemsPostFi();
        OASCatalogsCreativeAssetsItemsPostFi catalogsCreativeAssetsItemsPostFilter3;

        System.assertEquals(false, catalogsCreativeAssetsItemsPostFilter1.equals(catalogsCreativeAssetsItemsPostFilter3));
        System.assertEquals(false, catalogsCreativeAssetsItemsPostFilter2.equals(catalogsCreativeAssetsItemsPostFilter3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsCreativeAssetsItemsPostFi catalogsCreativeAssetsItemsPostFilter1 = OASCatalogsCreativeAssetsItemsPostFi.getExample();
        OASCatalogsCreativeAssetsItemsPostFi catalogsCreativeAssetsItemsPostFilter2 = new OASCatalogsCreativeAssetsItemsPostFi();

        System.assertEquals(catalogsCreativeAssetsItemsPostFilter1.hashCode(), catalogsCreativeAssetsItemsPostFilter1.hashCode());
        System.assertEquals(catalogsCreativeAssetsItemsPostFilter2.hashCode(), catalogsCreativeAssetsItemsPostFilter2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsCreativeAssetsItemsPostFi catalogsCreativeAssetsItemsPostFilter1 = OASCatalogsCreativeAssetsItemsPostFi.getExample();
        OASCatalogsCreativeAssetsItemsPostFi catalogsCreativeAssetsItemsPostFilter2 = OASCatalogsCreativeAssetsItemsPostFi.getExample();
        OASCatalogsCreativeAssetsItemsPostFi catalogsCreativeAssetsItemsPostFilter3 = new OASCatalogsCreativeAssetsItemsPostFi();
        OASCatalogsCreativeAssetsItemsPostFi catalogsCreativeAssetsItemsPostFilter4 = new OASCatalogsCreativeAssetsItemsPostFi();

        System.assert(catalogsCreativeAssetsItemsPostFilter1.equals(catalogsCreativeAssetsItemsPostFilter2));
        System.assert(catalogsCreativeAssetsItemsPostFilter3.equals(catalogsCreativeAssetsItemsPostFilter4));
        System.assertEquals(catalogsCreativeAssetsItemsPostFilter1.hashCode(), catalogsCreativeAssetsItemsPostFilter2.hashCode());
        System.assertEquals(catalogsCreativeAssetsItemsPostFilter3.hashCode(), catalogsCreativeAssetsItemsPostFilter4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsCreativeAssetsItemsPostFi catalogsCreativeAssetsItemsPostFilter = new OASCatalogsCreativeAssetsItemsPostFi();
        Map<String, String> x-property-mappings = catalogsCreativeAssetsItemsPostFilter.getx-property-mappings();
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
        System.assertEquals('creativeAssetsIds', x-property-mappings.get('creative_assets_ids'));
        System.assertEquals('catalogId', x-property-mappings.get('catalog_id'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCatalogsCreativeAssetsItemsPostFi catalogsCreativeAssetsItemsPostFilter = new OASCatalogsCreativeAssetsItemsPostFi();
        System.assertEquals(new List<String>(), catalogsCreativeAssetsItemsPostFilter.creativeAssetsIds);
        System.assertEquals(null, catalogsCreativeAssetsItemsPostFilter.catalogType);
        System.assertEquals(null, catalogsCreativeAssetsItemsPostFilter.catalogId);
    }
}
