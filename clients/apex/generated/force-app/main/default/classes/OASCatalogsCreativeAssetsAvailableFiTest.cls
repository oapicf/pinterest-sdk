@isTest
private class OASCatalogsCreativeAssetsAvailableFiTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsCreativeAssetsAvailableFi catalogsCreativeAssetsAvailableFilterValues1 = OASCatalogsCreativeAssetsAvailableFi.getExample();
        OASCatalogsCreativeAssetsAvailableFi catalogsCreativeAssetsAvailableFilterValues2 = catalogsCreativeAssetsAvailableFilterValues1;
        OASCatalogsCreativeAssetsAvailableFi catalogsCreativeAssetsAvailableFilterValues3 = new OASCatalogsCreativeAssetsAvailableFi();
        OASCatalogsCreativeAssetsAvailableFi catalogsCreativeAssetsAvailableFilterValues4 = catalogsCreativeAssetsAvailableFilterValues3;

        System.assert(catalogsCreativeAssetsAvailableFilterValues1.equals(catalogsCreativeAssetsAvailableFilterValues2));
        System.assert(catalogsCreativeAssetsAvailableFilterValues2.equals(catalogsCreativeAssetsAvailableFilterValues1));
        System.assert(catalogsCreativeAssetsAvailableFilterValues1.equals(catalogsCreativeAssetsAvailableFilterValues1));
        System.assert(catalogsCreativeAssetsAvailableFilterValues3.equals(catalogsCreativeAssetsAvailableFilterValues4));
        System.assert(catalogsCreativeAssetsAvailableFilterValues4.equals(catalogsCreativeAssetsAvailableFilterValues3));
        System.assert(catalogsCreativeAssetsAvailableFilterValues3.equals(catalogsCreativeAssetsAvailableFilterValues3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsCreativeAssetsAvailableFi catalogsCreativeAssetsAvailableFilterValues1 = OASCatalogsCreativeAssetsAvailableFi.getExample();
        OASCatalogsCreativeAssetsAvailableFi catalogsCreativeAssetsAvailableFilterValues2 = OASCatalogsCreativeAssetsAvailableFi.getExample();
        OASCatalogsCreativeAssetsAvailableFi catalogsCreativeAssetsAvailableFilterValues3 = new OASCatalogsCreativeAssetsAvailableFi();
        OASCatalogsCreativeAssetsAvailableFi catalogsCreativeAssetsAvailableFilterValues4 = new OASCatalogsCreativeAssetsAvailableFi();

        System.assert(catalogsCreativeAssetsAvailableFilterValues1.equals(catalogsCreativeAssetsAvailableFilterValues2));
        System.assert(catalogsCreativeAssetsAvailableFilterValues2.equals(catalogsCreativeAssetsAvailableFilterValues1));
        System.assert(catalogsCreativeAssetsAvailableFilterValues3.equals(catalogsCreativeAssetsAvailableFilterValues4));
        System.assert(catalogsCreativeAssetsAvailableFilterValues4.equals(catalogsCreativeAssetsAvailableFilterValues3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsCreativeAssetsAvailableFi catalogsCreativeAssetsAvailableFilterValues1 = OASCatalogsCreativeAssetsAvailableFi.getExample();
        OASCatalogsCreativeAssetsAvailableFi catalogsCreativeAssetsAvailableFilterValues2 = new OASCatalogsCreativeAssetsAvailableFi();

        System.assertEquals(false, catalogsCreativeAssetsAvailableFilterValues1.equals('foo'));
        System.assertEquals(false, catalogsCreativeAssetsAvailableFilterValues2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsCreativeAssetsAvailableFi catalogsCreativeAssetsAvailableFilterValues1 = OASCatalogsCreativeAssetsAvailableFi.getExample();
        OASCatalogsCreativeAssetsAvailableFi catalogsCreativeAssetsAvailableFilterValues2 = new OASCatalogsCreativeAssetsAvailableFi();
        OASCatalogsCreativeAssetsAvailableFi catalogsCreativeAssetsAvailableFilterValues3;

        System.assertEquals(false, catalogsCreativeAssetsAvailableFilterValues1.equals(catalogsCreativeAssetsAvailableFilterValues3));
        System.assertEquals(false, catalogsCreativeAssetsAvailableFilterValues2.equals(catalogsCreativeAssetsAvailableFilterValues3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsCreativeAssetsAvailableFi catalogsCreativeAssetsAvailableFilterValues1 = OASCatalogsCreativeAssetsAvailableFi.getExample();
        OASCatalogsCreativeAssetsAvailableFi catalogsCreativeAssetsAvailableFilterValues2 = new OASCatalogsCreativeAssetsAvailableFi();

        System.assertEquals(catalogsCreativeAssetsAvailableFilterValues1.hashCode(), catalogsCreativeAssetsAvailableFilterValues1.hashCode());
        System.assertEquals(catalogsCreativeAssetsAvailableFilterValues2.hashCode(), catalogsCreativeAssetsAvailableFilterValues2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsCreativeAssetsAvailableFi catalogsCreativeAssetsAvailableFilterValues1 = OASCatalogsCreativeAssetsAvailableFi.getExample();
        OASCatalogsCreativeAssetsAvailableFi catalogsCreativeAssetsAvailableFilterValues2 = OASCatalogsCreativeAssetsAvailableFi.getExample();
        OASCatalogsCreativeAssetsAvailableFi catalogsCreativeAssetsAvailableFilterValues3 = new OASCatalogsCreativeAssetsAvailableFi();
        OASCatalogsCreativeAssetsAvailableFi catalogsCreativeAssetsAvailableFilterValues4 = new OASCatalogsCreativeAssetsAvailableFi();

        System.assert(catalogsCreativeAssetsAvailableFilterValues1.equals(catalogsCreativeAssetsAvailableFilterValues2));
        System.assert(catalogsCreativeAssetsAvailableFilterValues3.equals(catalogsCreativeAssetsAvailableFilterValues4));
        System.assertEquals(catalogsCreativeAssetsAvailableFilterValues1.hashCode(), catalogsCreativeAssetsAvailableFilterValues2.hashCode());
        System.assertEquals(catalogsCreativeAssetsAvailableFilterValues3.hashCode(), catalogsCreativeAssetsAvailableFilterValues4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsCreativeAssetsAvailableFi catalogsCreativeAssetsAvailableFilterValues = new OASCatalogsCreativeAssetsAvailableFi();
        Map<String, String> x-property-mappings = catalogsCreativeAssetsAvailableFilterValues.getx-property-mappings();
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
        System.assertEquals('filterValues', x-property-mappings.get('filter_values'));
    }
}
