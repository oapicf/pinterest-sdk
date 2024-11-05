@isTest
private class OASCatalogsVerticalsListProductsByCaTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsVerticalsListProductsByCa catalogsVerticalsListProductsByCatalogBasedFilterRequest1 = OASCatalogsVerticalsListProductsByCa.getExample();
        OASCatalogsVerticalsListProductsByCa catalogsVerticalsListProductsByCatalogBasedFilterRequest2 = catalogsVerticalsListProductsByCatalogBasedFilterRequest1;
        OASCatalogsVerticalsListProductsByCa catalogsVerticalsListProductsByCatalogBasedFilterRequest3 = new OASCatalogsVerticalsListProductsByCa();
        OASCatalogsVerticalsListProductsByCa catalogsVerticalsListProductsByCatalogBasedFilterRequest4 = catalogsVerticalsListProductsByCatalogBasedFilterRequest3;

        System.assert(catalogsVerticalsListProductsByCatalogBasedFilterRequest1.equals(catalogsVerticalsListProductsByCatalogBasedFilterRequest2));
        System.assert(catalogsVerticalsListProductsByCatalogBasedFilterRequest2.equals(catalogsVerticalsListProductsByCatalogBasedFilterRequest1));
        System.assert(catalogsVerticalsListProductsByCatalogBasedFilterRequest1.equals(catalogsVerticalsListProductsByCatalogBasedFilterRequest1));
        System.assert(catalogsVerticalsListProductsByCatalogBasedFilterRequest3.equals(catalogsVerticalsListProductsByCatalogBasedFilterRequest4));
        System.assert(catalogsVerticalsListProductsByCatalogBasedFilterRequest4.equals(catalogsVerticalsListProductsByCatalogBasedFilterRequest3));
        System.assert(catalogsVerticalsListProductsByCatalogBasedFilterRequest3.equals(catalogsVerticalsListProductsByCatalogBasedFilterRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsVerticalsListProductsByCa catalogsVerticalsListProductsByCatalogBasedFilterRequest1 = OASCatalogsVerticalsListProductsByCa.getExample();
        OASCatalogsVerticalsListProductsByCa catalogsVerticalsListProductsByCatalogBasedFilterRequest2 = OASCatalogsVerticalsListProductsByCa.getExample();
        OASCatalogsVerticalsListProductsByCa catalogsVerticalsListProductsByCatalogBasedFilterRequest3 = new OASCatalogsVerticalsListProductsByCa();
        OASCatalogsVerticalsListProductsByCa catalogsVerticalsListProductsByCatalogBasedFilterRequest4 = new OASCatalogsVerticalsListProductsByCa();

        System.assert(catalogsVerticalsListProductsByCatalogBasedFilterRequest1.equals(catalogsVerticalsListProductsByCatalogBasedFilterRequest2));
        System.assert(catalogsVerticalsListProductsByCatalogBasedFilterRequest2.equals(catalogsVerticalsListProductsByCatalogBasedFilterRequest1));
        System.assert(catalogsVerticalsListProductsByCatalogBasedFilterRequest3.equals(catalogsVerticalsListProductsByCatalogBasedFilterRequest4));
        System.assert(catalogsVerticalsListProductsByCatalogBasedFilterRequest4.equals(catalogsVerticalsListProductsByCatalogBasedFilterRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsVerticalsListProductsByCa catalogsVerticalsListProductsByCatalogBasedFilterRequest1 = OASCatalogsVerticalsListProductsByCa.getExample();
        OASCatalogsVerticalsListProductsByCa catalogsVerticalsListProductsByCatalogBasedFilterRequest2 = new OASCatalogsVerticalsListProductsByCa();

        System.assertEquals(false, catalogsVerticalsListProductsByCatalogBasedFilterRequest1.equals('foo'));
        System.assertEquals(false, catalogsVerticalsListProductsByCatalogBasedFilterRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsVerticalsListProductsByCa catalogsVerticalsListProductsByCatalogBasedFilterRequest1 = OASCatalogsVerticalsListProductsByCa.getExample();
        OASCatalogsVerticalsListProductsByCa catalogsVerticalsListProductsByCatalogBasedFilterRequest2 = new OASCatalogsVerticalsListProductsByCa();
        OASCatalogsVerticalsListProductsByCa catalogsVerticalsListProductsByCatalogBasedFilterRequest3;

        System.assertEquals(false, catalogsVerticalsListProductsByCatalogBasedFilterRequest1.equals(catalogsVerticalsListProductsByCatalogBasedFilterRequest3));
        System.assertEquals(false, catalogsVerticalsListProductsByCatalogBasedFilterRequest2.equals(catalogsVerticalsListProductsByCatalogBasedFilterRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsVerticalsListProductsByCa catalogsVerticalsListProductsByCatalogBasedFilterRequest1 = OASCatalogsVerticalsListProductsByCa.getExample();
        OASCatalogsVerticalsListProductsByCa catalogsVerticalsListProductsByCatalogBasedFilterRequest2 = new OASCatalogsVerticalsListProductsByCa();

        System.assertEquals(catalogsVerticalsListProductsByCatalogBasedFilterRequest1.hashCode(), catalogsVerticalsListProductsByCatalogBasedFilterRequest1.hashCode());
        System.assertEquals(catalogsVerticalsListProductsByCatalogBasedFilterRequest2.hashCode(), catalogsVerticalsListProductsByCatalogBasedFilterRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsVerticalsListProductsByCa catalogsVerticalsListProductsByCatalogBasedFilterRequest1 = OASCatalogsVerticalsListProductsByCa.getExample();
        OASCatalogsVerticalsListProductsByCa catalogsVerticalsListProductsByCatalogBasedFilterRequest2 = OASCatalogsVerticalsListProductsByCa.getExample();
        OASCatalogsVerticalsListProductsByCa catalogsVerticalsListProductsByCatalogBasedFilterRequest3 = new OASCatalogsVerticalsListProductsByCa();
        OASCatalogsVerticalsListProductsByCa catalogsVerticalsListProductsByCatalogBasedFilterRequest4 = new OASCatalogsVerticalsListProductsByCa();

        System.assert(catalogsVerticalsListProductsByCatalogBasedFilterRequest1.equals(catalogsVerticalsListProductsByCatalogBasedFilterRequest2));
        System.assert(catalogsVerticalsListProductsByCatalogBasedFilterRequest3.equals(catalogsVerticalsListProductsByCatalogBasedFilterRequest4));
        System.assertEquals(catalogsVerticalsListProductsByCatalogBasedFilterRequest1.hashCode(), catalogsVerticalsListProductsByCatalogBasedFilterRequest2.hashCode());
        System.assertEquals(catalogsVerticalsListProductsByCatalogBasedFilterRequest3.hashCode(), catalogsVerticalsListProductsByCatalogBasedFilterRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsVerticalsListProductsByCa catalogsVerticalsListProductsByCatalogBasedFilterRequest = new OASCatalogsVerticalsListProductsByCa();
        Map<String, String> x-property-mappings = catalogsVerticalsListProductsByCatalogBasedFilterRequest.getx-property-mappings();
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
        System.assertEquals('catalogId', x-property-mappings.get('catalog_id'));
    }
}
