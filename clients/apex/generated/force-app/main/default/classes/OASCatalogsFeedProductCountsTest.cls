@isTest
private class OASCatalogsFeedProductCountsTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsFeedProductCounts catalogsFeedProductCounts1 = OASCatalogsFeedProductCounts.getExample();
        OASCatalogsFeedProductCounts catalogsFeedProductCounts2 = catalogsFeedProductCounts1;
        OASCatalogsFeedProductCounts catalogsFeedProductCounts3 = new OASCatalogsFeedProductCounts();
        OASCatalogsFeedProductCounts catalogsFeedProductCounts4 = catalogsFeedProductCounts3;

        System.assert(catalogsFeedProductCounts1.equals(catalogsFeedProductCounts2));
        System.assert(catalogsFeedProductCounts2.equals(catalogsFeedProductCounts1));
        System.assert(catalogsFeedProductCounts1.equals(catalogsFeedProductCounts1));
        System.assert(catalogsFeedProductCounts3.equals(catalogsFeedProductCounts4));
        System.assert(catalogsFeedProductCounts4.equals(catalogsFeedProductCounts3));
        System.assert(catalogsFeedProductCounts3.equals(catalogsFeedProductCounts3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsFeedProductCounts catalogsFeedProductCounts1 = OASCatalogsFeedProductCounts.getExample();
        OASCatalogsFeedProductCounts catalogsFeedProductCounts2 = OASCatalogsFeedProductCounts.getExample();
        OASCatalogsFeedProductCounts catalogsFeedProductCounts3 = new OASCatalogsFeedProductCounts();
        OASCatalogsFeedProductCounts catalogsFeedProductCounts4 = new OASCatalogsFeedProductCounts();

        System.assert(catalogsFeedProductCounts1.equals(catalogsFeedProductCounts2));
        System.assert(catalogsFeedProductCounts2.equals(catalogsFeedProductCounts1));
        System.assert(catalogsFeedProductCounts3.equals(catalogsFeedProductCounts4));
        System.assert(catalogsFeedProductCounts4.equals(catalogsFeedProductCounts3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsFeedProductCounts catalogsFeedProductCounts1 = OASCatalogsFeedProductCounts.getExample();
        OASCatalogsFeedProductCounts catalogsFeedProductCounts2 = new OASCatalogsFeedProductCounts();

        System.assertEquals(false, catalogsFeedProductCounts1.equals('foo'));
        System.assertEquals(false, catalogsFeedProductCounts2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsFeedProductCounts catalogsFeedProductCounts1 = OASCatalogsFeedProductCounts.getExample();
        OASCatalogsFeedProductCounts catalogsFeedProductCounts2 = new OASCatalogsFeedProductCounts();
        OASCatalogsFeedProductCounts catalogsFeedProductCounts3;

        System.assertEquals(false, catalogsFeedProductCounts1.equals(catalogsFeedProductCounts3));
        System.assertEquals(false, catalogsFeedProductCounts2.equals(catalogsFeedProductCounts3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsFeedProductCounts catalogsFeedProductCounts1 = OASCatalogsFeedProductCounts.getExample();
        OASCatalogsFeedProductCounts catalogsFeedProductCounts2 = new OASCatalogsFeedProductCounts();

        System.assertEquals(catalogsFeedProductCounts1.hashCode(), catalogsFeedProductCounts1.hashCode());
        System.assertEquals(catalogsFeedProductCounts2.hashCode(), catalogsFeedProductCounts2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsFeedProductCounts catalogsFeedProductCounts1 = OASCatalogsFeedProductCounts.getExample();
        OASCatalogsFeedProductCounts catalogsFeedProductCounts2 = OASCatalogsFeedProductCounts.getExample();
        OASCatalogsFeedProductCounts catalogsFeedProductCounts3 = new OASCatalogsFeedProductCounts();
        OASCatalogsFeedProductCounts catalogsFeedProductCounts4 = new OASCatalogsFeedProductCounts();

        System.assert(catalogsFeedProductCounts1.equals(catalogsFeedProductCounts2));
        System.assert(catalogsFeedProductCounts3.equals(catalogsFeedProductCounts4));
        System.assertEquals(catalogsFeedProductCounts1.hashCode(), catalogsFeedProductCounts2.hashCode());
        System.assertEquals(catalogsFeedProductCounts3.hashCode(), catalogsFeedProductCounts4.hashCode());
    }
}
