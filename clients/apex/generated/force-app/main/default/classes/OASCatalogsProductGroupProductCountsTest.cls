@isTest
private class OASCatalogsProductGroupProductCountsTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsProductGroupProductCounts catalogsProductGroupProductCounts1 = OASCatalogsProductGroupProductCounts.getExample();
        OASCatalogsProductGroupProductCounts catalogsProductGroupProductCounts2 = catalogsProductGroupProductCounts1;
        OASCatalogsProductGroupProductCounts catalogsProductGroupProductCounts3 = new OASCatalogsProductGroupProductCounts();
        OASCatalogsProductGroupProductCounts catalogsProductGroupProductCounts4 = catalogsProductGroupProductCounts3;

        System.assert(catalogsProductGroupProductCounts1.equals(catalogsProductGroupProductCounts2));
        System.assert(catalogsProductGroupProductCounts2.equals(catalogsProductGroupProductCounts1));
        System.assert(catalogsProductGroupProductCounts1.equals(catalogsProductGroupProductCounts1));
        System.assert(catalogsProductGroupProductCounts3.equals(catalogsProductGroupProductCounts4));
        System.assert(catalogsProductGroupProductCounts4.equals(catalogsProductGroupProductCounts3));
        System.assert(catalogsProductGroupProductCounts3.equals(catalogsProductGroupProductCounts3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsProductGroupProductCounts catalogsProductGroupProductCounts1 = OASCatalogsProductGroupProductCounts.getExample();
        OASCatalogsProductGroupProductCounts catalogsProductGroupProductCounts2 = OASCatalogsProductGroupProductCounts.getExample();
        OASCatalogsProductGroupProductCounts catalogsProductGroupProductCounts3 = new OASCatalogsProductGroupProductCounts();
        OASCatalogsProductGroupProductCounts catalogsProductGroupProductCounts4 = new OASCatalogsProductGroupProductCounts();

        System.assert(catalogsProductGroupProductCounts1.equals(catalogsProductGroupProductCounts2));
        System.assert(catalogsProductGroupProductCounts2.equals(catalogsProductGroupProductCounts1));
        System.assert(catalogsProductGroupProductCounts3.equals(catalogsProductGroupProductCounts4));
        System.assert(catalogsProductGroupProductCounts4.equals(catalogsProductGroupProductCounts3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsProductGroupProductCounts catalogsProductGroupProductCounts1 = OASCatalogsProductGroupProductCounts.getExample();
        OASCatalogsProductGroupProductCounts catalogsProductGroupProductCounts2 = new OASCatalogsProductGroupProductCounts();

        System.assertEquals(false, catalogsProductGroupProductCounts1.equals('foo'));
        System.assertEquals(false, catalogsProductGroupProductCounts2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsProductGroupProductCounts catalogsProductGroupProductCounts1 = OASCatalogsProductGroupProductCounts.getExample();
        OASCatalogsProductGroupProductCounts catalogsProductGroupProductCounts2 = new OASCatalogsProductGroupProductCounts();
        OASCatalogsProductGroupProductCounts catalogsProductGroupProductCounts3;

        System.assertEquals(false, catalogsProductGroupProductCounts1.equals(catalogsProductGroupProductCounts3));
        System.assertEquals(false, catalogsProductGroupProductCounts2.equals(catalogsProductGroupProductCounts3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsProductGroupProductCounts catalogsProductGroupProductCounts1 = OASCatalogsProductGroupProductCounts.getExample();
        OASCatalogsProductGroupProductCounts catalogsProductGroupProductCounts2 = new OASCatalogsProductGroupProductCounts();

        System.assertEquals(catalogsProductGroupProductCounts1.hashCode(), catalogsProductGroupProductCounts1.hashCode());
        System.assertEquals(catalogsProductGroupProductCounts2.hashCode(), catalogsProductGroupProductCounts2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsProductGroupProductCounts catalogsProductGroupProductCounts1 = OASCatalogsProductGroupProductCounts.getExample();
        OASCatalogsProductGroupProductCounts catalogsProductGroupProductCounts2 = OASCatalogsProductGroupProductCounts.getExample();
        OASCatalogsProductGroupProductCounts catalogsProductGroupProductCounts3 = new OASCatalogsProductGroupProductCounts();
        OASCatalogsProductGroupProductCounts catalogsProductGroupProductCounts4 = new OASCatalogsProductGroupProductCounts();

        System.assert(catalogsProductGroupProductCounts1.equals(catalogsProductGroupProductCounts2));
        System.assert(catalogsProductGroupProductCounts3.equals(catalogsProductGroupProductCounts4));
        System.assertEquals(catalogsProductGroupProductCounts1.hashCode(), catalogsProductGroupProductCounts2.hashCode());
        System.assertEquals(catalogsProductGroupProductCounts3.hashCode(), catalogsProductGroupProductCounts4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsProductGroupProductCounts catalogsProductGroupProductCounts = new OASCatalogsProductGroupProductCounts();
        Map<String, String> x-property-mappings = catalogsProductGroupProductCounts.getx-property-mappings();
        System.assertEquals('inStock', x-property-mappings.get('in_stock'));
        System.assertEquals('outOfStock', x-property-mappings.get('out_of_stock'));
    }
}
