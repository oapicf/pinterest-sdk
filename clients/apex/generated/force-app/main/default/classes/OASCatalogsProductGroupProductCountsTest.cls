@isTest
private class OASCatalogsProductGroupProductCountsTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsProductGroupProductCounts catalogsProductGroupProductCountsVertical1 = OASCatalogsProductGroupProductCounts.getExample();
        OASCatalogsProductGroupProductCounts catalogsProductGroupProductCountsVertical2 = catalogsProductGroupProductCountsVertical1;
        OASCatalogsProductGroupProductCounts catalogsProductGroupProductCountsVertical3 = new OASCatalogsProductGroupProductCounts();
        OASCatalogsProductGroupProductCounts catalogsProductGroupProductCountsVertical4 = catalogsProductGroupProductCountsVertical3;

        System.assert(catalogsProductGroupProductCountsVertical1.equals(catalogsProductGroupProductCountsVertical2));
        System.assert(catalogsProductGroupProductCountsVertical2.equals(catalogsProductGroupProductCountsVertical1));
        System.assert(catalogsProductGroupProductCountsVertical1.equals(catalogsProductGroupProductCountsVertical1));
        System.assert(catalogsProductGroupProductCountsVertical3.equals(catalogsProductGroupProductCountsVertical4));
        System.assert(catalogsProductGroupProductCountsVertical4.equals(catalogsProductGroupProductCountsVertical3));
        System.assert(catalogsProductGroupProductCountsVertical3.equals(catalogsProductGroupProductCountsVertical3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsProductGroupProductCounts catalogsProductGroupProductCountsVertical1 = OASCatalogsProductGroupProductCounts.getExample();
        OASCatalogsProductGroupProductCounts catalogsProductGroupProductCountsVertical2 = OASCatalogsProductGroupProductCounts.getExample();
        OASCatalogsProductGroupProductCounts catalogsProductGroupProductCountsVertical3 = new OASCatalogsProductGroupProductCounts();
        OASCatalogsProductGroupProductCounts catalogsProductGroupProductCountsVertical4 = new OASCatalogsProductGroupProductCounts();

        System.assert(catalogsProductGroupProductCountsVertical1.equals(catalogsProductGroupProductCountsVertical2));
        System.assert(catalogsProductGroupProductCountsVertical2.equals(catalogsProductGroupProductCountsVertical1));
        System.assert(catalogsProductGroupProductCountsVertical3.equals(catalogsProductGroupProductCountsVertical4));
        System.assert(catalogsProductGroupProductCountsVertical4.equals(catalogsProductGroupProductCountsVertical3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsProductGroupProductCounts catalogsProductGroupProductCountsVertical1 = OASCatalogsProductGroupProductCounts.getExample();
        OASCatalogsProductGroupProductCounts catalogsProductGroupProductCountsVertical2 = new OASCatalogsProductGroupProductCounts();

        System.assertEquals(false, catalogsProductGroupProductCountsVertical1.equals('foo'));
        System.assertEquals(false, catalogsProductGroupProductCountsVertical2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsProductGroupProductCounts catalogsProductGroupProductCountsVertical1 = OASCatalogsProductGroupProductCounts.getExample();
        OASCatalogsProductGroupProductCounts catalogsProductGroupProductCountsVertical2 = new OASCatalogsProductGroupProductCounts();
        OASCatalogsProductGroupProductCounts catalogsProductGroupProductCountsVertical3;

        System.assertEquals(false, catalogsProductGroupProductCountsVertical1.equals(catalogsProductGroupProductCountsVertical3));
        System.assertEquals(false, catalogsProductGroupProductCountsVertical2.equals(catalogsProductGroupProductCountsVertical3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsProductGroupProductCounts catalogsProductGroupProductCountsVertical1 = OASCatalogsProductGroupProductCounts.getExample();
        OASCatalogsProductGroupProductCounts catalogsProductGroupProductCountsVertical2 = new OASCatalogsProductGroupProductCounts();

        System.assertEquals(catalogsProductGroupProductCountsVertical1.hashCode(), catalogsProductGroupProductCountsVertical1.hashCode());
        System.assertEquals(catalogsProductGroupProductCountsVertical2.hashCode(), catalogsProductGroupProductCountsVertical2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsProductGroupProductCounts catalogsProductGroupProductCountsVertical1 = OASCatalogsProductGroupProductCounts.getExample();
        OASCatalogsProductGroupProductCounts catalogsProductGroupProductCountsVertical2 = OASCatalogsProductGroupProductCounts.getExample();
        OASCatalogsProductGroupProductCounts catalogsProductGroupProductCountsVertical3 = new OASCatalogsProductGroupProductCounts();
        OASCatalogsProductGroupProductCounts catalogsProductGroupProductCountsVertical4 = new OASCatalogsProductGroupProductCounts();

        System.assert(catalogsProductGroupProductCountsVertical1.equals(catalogsProductGroupProductCountsVertical2));
        System.assert(catalogsProductGroupProductCountsVertical3.equals(catalogsProductGroupProductCountsVertical4));
        System.assertEquals(catalogsProductGroupProductCountsVertical1.hashCode(), catalogsProductGroupProductCountsVertical2.hashCode());
        System.assertEquals(catalogsProductGroupProductCountsVertical3.hashCode(), catalogsProductGroupProductCountsVertical4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsProductGroupProductCounts catalogsProductGroupProductCountsVertical = new OASCatalogsProductGroupProductCounts();
        Map<String, String> x-property-mappings = catalogsProductGroupProductCountsVertical.getx-property-mappings();
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
        System.assertEquals('inStock', x-property-mappings.get('in_stock'));
        System.assertEquals('outOfStock', x-property-mappings.get('out_of_stock'));
    }
}
