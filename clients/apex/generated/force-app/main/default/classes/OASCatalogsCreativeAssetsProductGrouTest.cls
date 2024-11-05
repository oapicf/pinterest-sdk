@isTest
private class OASCatalogsCreativeAssetsProductGrouTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsCreativeAssetsProductGrou catalogsCreativeAssetsProductGroupProductCounts1 = OASCatalogsCreativeAssetsProductGrou.getExample();
        OASCatalogsCreativeAssetsProductGrou catalogsCreativeAssetsProductGroupProductCounts2 = catalogsCreativeAssetsProductGroupProductCounts1;
        OASCatalogsCreativeAssetsProductGrou catalogsCreativeAssetsProductGroupProductCounts3 = new OASCatalogsCreativeAssetsProductGrou();
        OASCatalogsCreativeAssetsProductGrou catalogsCreativeAssetsProductGroupProductCounts4 = catalogsCreativeAssetsProductGroupProductCounts3;

        System.assert(catalogsCreativeAssetsProductGroupProductCounts1.equals(catalogsCreativeAssetsProductGroupProductCounts2));
        System.assert(catalogsCreativeAssetsProductGroupProductCounts2.equals(catalogsCreativeAssetsProductGroupProductCounts1));
        System.assert(catalogsCreativeAssetsProductGroupProductCounts1.equals(catalogsCreativeAssetsProductGroupProductCounts1));
        System.assert(catalogsCreativeAssetsProductGroupProductCounts3.equals(catalogsCreativeAssetsProductGroupProductCounts4));
        System.assert(catalogsCreativeAssetsProductGroupProductCounts4.equals(catalogsCreativeAssetsProductGroupProductCounts3));
        System.assert(catalogsCreativeAssetsProductGroupProductCounts3.equals(catalogsCreativeAssetsProductGroupProductCounts3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsCreativeAssetsProductGrou catalogsCreativeAssetsProductGroupProductCounts1 = OASCatalogsCreativeAssetsProductGrou.getExample();
        OASCatalogsCreativeAssetsProductGrou catalogsCreativeAssetsProductGroupProductCounts2 = OASCatalogsCreativeAssetsProductGrou.getExample();
        OASCatalogsCreativeAssetsProductGrou catalogsCreativeAssetsProductGroupProductCounts3 = new OASCatalogsCreativeAssetsProductGrou();
        OASCatalogsCreativeAssetsProductGrou catalogsCreativeAssetsProductGroupProductCounts4 = new OASCatalogsCreativeAssetsProductGrou();

        System.assert(catalogsCreativeAssetsProductGroupProductCounts1.equals(catalogsCreativeAssetsProductGroupProductCounts2));
        System.assert(catalogsCreativeAssetsProductGroupProductCounts2.equals(catalogsCreativeAssetsProductGroupProductCounts1));
        System.assert(catalogsCreativeAssetsProductGroupProductCounts3.equals(catalogsCreativeAssetsProductGroupProductCounts4));
        System.assert(catalogsCreativeAssetsProductGroupProductCounts4.equals(catalogsCreativeAssetsProductGroupProductCounts3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsCreativeAssetsProductGrou catalogsCreativeAssetsProductGroupProductCounts1 = OASCatalogsCreativeAssetsProductGrou.getExample();
        OASCatalogsCreativeAssetsProductGrou catalogsCreativeAssetsProductGroupProductCounts2 = new OASCatalogsCreativeAssetsProductGrou();

        System.assertEquals(false, catalogsCreativeAssetsProductGroupProductCounts1.equals('foo'));
        System.assertEquals(false, catalogsCreativeAssetsProductGroupProductCounts2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsCreativeAssetsProductGrou catalogsCreativeAssetsProductGroupProductCounts1 = OASCatalogsCreativeAssetsProductGrou.getExample();
        OASCatalogsCreativeAssetsProductGrou catalogsCreativeAssetsProductGroupProductCounts2 = new OASCatalogsCreativeAssetsProductGrou();
        OASCatalogsCreativeAssetsProductGrou catalogsCreativeAssetsProductGroupProductCounts3;

        System.assertEquals(false, catalogsCreativeAssetsProductGroupProductCounts1.equals(catalogsCreativeAssetsProductGroupProductCounts3));
        System.assertEquals(false, catalogsCreativeAssetsProductGroupProductCounts2.equals(catalogsCreativeAssetsProductGroupProductCounts3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsCreativeAssetsProductGrou catalogsCreativeAssetsProductGroupProductCounts1 = OASCatalogsCreativeAssetsProductGrou.getExample();
        OASCatalogsCreativeAssetsProductGrou catalogsCreativeAssetsProductGroupProductCounts2 = new OASCatalogsCreativeAssetsProductGrou();

        System.assertEquals(catalogsCreativeAssetsProductGroupProductCounts1.hashCode(), catalogsCreativeAssetsProductGroupProductCounts1.hashCode());
        System.assertEquals(catalogsCreativeAssetsProductGroupProductCounts2.hashCode(), catalogsCreativeAssetsProductGroupProductCounts2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsCreativeAssetsProductGrou catalogsCreativeAssetsProductGroupProductCounts1 = OASCatalogsCreativeAssetsProductGrou.getExample();
        OASCatalogsCreativeAssetsProductGrou catalogsCreativeAssetsProductGroupProductCounts2 = OASCatalogsCreativeAssetsProductGrou.getExample();
        OASCatalogsCreativeAssetsProductGrou catalogsCreativeAssetsProductGroupProductCounts3 = new OASCatalogsCreativeAssetsProductGrou();
        OASCatalogsCreativeAssetsProductGrou catalogsCreativeAssetsProductGroupProductCounts4 = new OASCatalogsCreativeAssetsProductGrou();

        System.assert(catalogsCreativeAssetsProductGroupProductCounts1.equals(catalogsCreativeAssetsProductGroupProductCounts2));
        System.assert(catalogsCreativeAssetsProductGroupProductCounts3.equals(catalogsCreativeAssetsProductGroupProductCounts4));
        System.assertEquals(catalogsCreativeAssetsProductGroupProductCounts1.hashCode(), catalogsCreativeAssetsProductGroupProductCounts2.hashCode());
        System.assertEquals(catalogsCreativeAssetsProductGroupProductCounts3.hashCode(), catalogsCreativeAssetsProductGroupProductCounts4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsCreativeAssetsProductGrou catalogsCreativeAssetsProductGroupProductCounts = new OASCatalogsCreativeAssetsProductGrou();
        Map<String, String> x-property-mappings = catalogsCreativeAssetsProductGroupProductCounts.getx-property-mappings();
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
    }
}
