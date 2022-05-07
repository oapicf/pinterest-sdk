@isTest
private class OASCatalogsFeedIngestionInfoTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsFeedIngestionInfo catalogsFeedIngestionInfo1 = OASCatalogsFeedIngestionInfo.getExample();
        OASCatalogsFeedIngestionInfo catalogsFeedIngestionInfo2 = catalogsFeedIngestionInfo1;
        OASCatalogsFeedIngestionInfo catalogsFeedIngestionInfo3 = new OASCatalogsFeedIngestionInfo();
        OASCatalogsFeedIngestionInfo catalogsFeedIngestionInfo4 = catalogsFeedIngestionInfo3;

        System.assert(catalogsFeedIngestionInfo1.equals(catalogsFeedIngestionInfo2));
        System.assert(catalogsFeedIngestionInfo2.equals(catalogsFeedIngestionInfo1));
        System.assert(catalogsFeedIngestionInfo1.equals(catalogsFeedIngestionInfo1));
        System.assert(catalogsFeedIngestionInfo3.equals(catalogsFeedIngestionInfo4));
        System.assert(catalogsFeedIngestionInfo4.equals(catalogsFeedIngestionInfo3));
        System.assert(catalogsFeedIngestionInfo3.equals(catalogsFeedIngestionInfo3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsFeedIngestionInfo catalogsFeedIngestionInfo1 = OASCatalogsFeedIngestionInfo.getExample();
        OASCatalogsFeedIngestionInfo catalogsFeedIngestionInfo2 = OASCatalogsFeedIngestionInfo.getExample();
        OASCatalogsFeedIngestionInfo catalogsFeedIngestionInfo3 = new OASCatalogsFeedIngestionInfo();
        OASCatalogsFeedIngestionInfo catalogsFeedIngestionInfo4 = new OASCatalogsFeedIngestionInfo();

        System.assert(catalogsFeedIngestionInfo1.equals(catalogsFeedIngestionInfo2));
        System.assert(catalogsFeedIngestionInfo2.equals(catalogsFeedIngestionInfo1));
        System.assert(catalogsFeedIngestionInfo3.equals(catalogsFeedIngestionInfo4));
        System.assert(catalogsFeedIngestionInfo4.equals(catalogsFeedIngestionInfo3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsFeedIngestionInfo catalogsFeedIngestionInfo1 = OASCatalogsFeedIngestionInfo.getExample();
        OASCatalogsFeedIngestionInfo catalogsFeedIngestionInfo2 = new OASCatalogsFeedIngestionInfo();

        System.assertEquals(false, catalogsFeedIngestionInfo1.equals('foo'));
        System.assertEquals(false, catalogsFeedIngestionInfo2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsFeedIngestionInfo catalogsFeedIngestionInfo1 = OASCatalogsFeedIngestionInfo.getExample();
        OASCatalogsFeedIngestionInfo catalogsFeedIngestionInfo2 = new OASCatalogsFeedIngestionInfo();
        OASCatalogsFeedIngestionInfo catalogsFeedIngestionInfo3;

        System.assertEquals(false, catalogsFeedIngestionInfo1.equals(catalogsFeedIngestionInfo3));
        System.assertEquals(false, catalogsFeedIngestionInfo2.equals(catalogsFeedIngestionInfo3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsFeedIngestionInfo catalogsFeedIngestionInfo1 = OASCatalogsFeedIngestionInfo.getExample();
        OASCatalogsFeedIngestionInfo catalogsFeedIngestionInfo2 = new OASCatalogsFeedIngestionInfo();

        System.assertEquals(catalogsFeedIngestionInfo1.hashCode(), catalogsFeedIngestionInfo1.hashCode());
        System.assertEquals(catalogsFeedIngestionInfo2.hashCode(), catalogsFeedIngestionInfo2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsFeedIngestionInfo catalogsFeedIngestionInfo1 = OASCatalogsFeedIngestionInfo.getExample();
        OASCatalogsFeedIngestionInfo catalogsFeedIngestionInfo2 = OASCatalogsFeedIngestionInfo.getExample();
        OASCatalogsFeedIngestionInfo catalogsFeedIngestionInfo3 = new OASCatalogsFeedIngestionInfo();
        OASCatalogsFeedIngestionInfo catalogsFeedIngestionInfo4 = new OASCatalogsFeedIngestionInfo();

        System.assert(catalogsFeedIngestionInfo1.equals(catalogsFeedIngestionInfo2));
        System.assert(catalogsFeedIngestionInfo3.equals(catalogsFeedIngestionInfo4));
        System.assertEquals(catalogsFeedIngestionInfo1.hashCode(), catalogsFeedIngestionInfo2.hashCode());
        System.assertEquals(catalogsFeedIngestionInfo3.hashCode(), catalogsFeedIngestionInfo4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsFeedIngestionInfo catalogsFeedIngestionInfo = new OASCatalogsFeedIngestionInfo();
        Map<String, String> x-property-mappings = catalogsFeedIngestionInfo.getx-property-mappings();
        System.assertEquals('inStock', x-property-mappings.get('in_stock'));
        System.assertEquals('outOfStock', x-property-mappings.get('out_of_stock'));
    }
}
