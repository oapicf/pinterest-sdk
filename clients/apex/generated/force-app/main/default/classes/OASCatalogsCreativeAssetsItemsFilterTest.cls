@isTest
private class OASCatalogsCreativeAssetsItemsFilterTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsCreativeAssetsItemsFilter catalogsCreativeAssetsItemsFilter1 = OASCatalogsCreativeAssetsItemsFilter.getExample();
        OASCatalogsCreativeAssetsItemsFilter catalogsCreativeAssetsItemsFilter2 = catalogsCreativeAssetsItemsFilter1;
        OASCatalogsCreativeAssetsItemsFilter catalogsCreativeAssetsItemsFilter3 = new OASCatalogsCreativeAssetsItemsFilter();
        OASCatalogsCreativeAssetsItemsFilter catalogsCreativeAssetsItemsFilter4 = catalogsCreativeAssetsItemsFilter3;

        System.assert(catalogsCreativeAssetsItemsFilter1.equals(catalogsCreativeAssetsItemsFilter2));
        System.assert(catalogsCreativeAssetsItemsFilter2.equals(catalogsCreativeAssetsItemsFilter1));
        System.assert(catalogsCreativeAssetsItemsFilter1.equals(catalogsCreativeAssetsItemsFilter1));
        System.assert(catalogsCreativeAssetsItemsFilter3.equals(catalogsCreativeAssetsItemsFilter4));
        System.assert(catalogsCreativeAssetsItemsFilter4.equals(catalogsCreativeAssetsItemsFilter3));
        System.assert(catalogsCreativeAssetsItemsFilter3.equals(catalogsCreativeAssetsItemsFilter3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsCreativeAssetsItemsFilter catalogsCreativeAssetsItemsFilter1 = OASCatalogsCreativeAssetsItemsFilter.getExample();
        OASCatalogsCreativeAssetsItemsFilter catalogsCreativeAssetsItemsFilter2 = OASCatalogsCreativeAssetsItemsFilter.getExample();
        OASCatalogsCreativeAssetsItemsFilter catalogsCreativeAssetsItemsFilter3 = new OASCatalogsCreativeAssetsItemsFilter();
        OASCatalogsCreativeAssetsItemsFilter catalogsCreativeAssetsItemsFilter4 = new OASCatalogsCreativeAssetsItemsFilter();

        System.assert(catalogsCreativeAssetsItemsFilter1.equals(catalogsCreativeAssetsItemsFilter2));
        System.assert(catalogsCreativeAssetsItemsFilter2.equals(catalogsCreativeAssetsItemsFilter1));
        System.assert(catalogsCreativeAssetsItemsFilter3.equals(catalogsCreativeAssetsItemsFilter4));
        System.assert(catalogsCreativeAssetsItemsFilter4.equals(catalogsCreativeAssetsItemsFilter3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsCreativeAssetsItemsFilter catalogsCreativeAssetsItemsFilter1 = OASCatalogsCreativeAssetsItemsFilter.getExample();
        OASCatalogsCreativeAssetsItemsFilter catalogsCreativeAssetsItemsFilter2 = new OASCatalogsCreativeAssetsItemsFilter();

        System.assertEquals(false, catalogsCreativeAssetsItemsFilter1.equals('foo'));
        System.assertEquals(false, catalogsCreativeAssetsItemsFilter2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsCreativeAssetsItemsFilter catalogsCreativeAssetsItemsFilter1 = OASCatalogsCreativeAssetsItemsFilter.getExample();
        OASCatalogsCreativeAssetsItemsFilter catalogsCreativeAssetsItemsFilter2 = new OASCatalogsCreativeAssetsItemsFilter();
        OASCatalogsCreativeAssetsItemsFilter catalogsCreativeAssetsItemsFilter3;

        System.assertEquals(false, catalogsCreativeAssetsItemsFilter1.equals(catalogsCreativeAssetsItemsFilter3));
        System.assertEquals(false, catalogsCreativeAssetsItemsFilter2.equals(catalogsCreativeAssetsItemsFilter3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsCreativeAssetsItemsFilter catalogsCreativeAssetsItemsFilter1 = OASCatalogsCreativeAssetsItemsFilter.getExample();
        OASCatalogsCreativeAssetsItemsFilter catalogsCreativeAssetsItemsFilter2 = new OASCatalogsCreativeAssetsItemsFilter();

        System.assertEquals(catalogsCreativeAssetsItemsFilter1.hashCode(), catalogsCreativeAssetsItemsFilter1.hashCode());
        System.assertEquals(catalogsCreativeAssetsItemsFilter2.hashCode(), catalogsCreativeAssetsItemsFilter2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsCreativeAssetsItemsFilter catalogsCreativeAssetsItemsFilter1 = OASCatalogsCreativeAssetsItemsFilter.getExample();
        OASCatalogsCreativeAssetsItemsFilter catalogsCreativeAssetsItemsFilter2 = OASCatalogsCreativeAssetsItemsFilter.getExample();
        OASCatalogsCreativeAssetsItemsFilter catalogsCreativeAssetsItemsFilter3 = new OASCatalogsCreativeAssetsItemsFilter();
        OASCatalogsCreativeAssetsItemsFilter catalogsCreativeAssetsItemsFilter4 = new OASCatalogsCreativeAssetsItemsFilter();

        System.assert(catalogsCreativeAssetsItemsFilter1.equals(catalogsCreativeAssetsItemsFilter2));
        System.assert(catalogsCreativeAssetsItemsFilter3.equals(catalogsCreativeAssetsItemsFilter4));
        System.assertEquals(catalogsCreativeAssetsItemsFilter1.hashCode(), catalogsCreativeAssetsItemsFilter2.hashCode());
        System.assertEquals(catalogsCreativeAssetsItemsFilter3.hashCode(), catalogsCreativeAssetsItemsFilter4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsCreativeAssetsItemsFilter catalogsCreativeAssetsItemsFilter = new OASCatalogsCreativeAssetsItemsFilter();
        Map<String, String> x-property-mappings = catalogsCreativeAssetsItemsFilter.getx-property-mappings();
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
        System.assertEquals('creativeAssetsIds', x-property-mappings.get('creative_assets_ids'));
        System.assertEquals('catalogId', x-property-mappings.get('catalog_id'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCatalogsCreativeAssetsItemsFilter catalogsCreativeAssetsItemsFilter = new OASCatalogsCreativeAssetsItemsFilter();
        System.assertEquals(new List<String>(), catalogsCreativeAssetsItemsFilter.creativeAssetsIds);
        System.assertEquals(null, catalogsCreativeAssetsItemsFilter.catalogType);
        System.assertEquals(null, catalogsCreativeAssetsItemsFilter.catalogId);
    }
}
