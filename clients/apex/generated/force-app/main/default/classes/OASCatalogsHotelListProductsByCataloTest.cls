@isTest
private class OASCatalogsHotelListProductsByCataloTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsHotelListProductsByCatalo catalogsHotelListProductsByCatalogBasedFilterRequest1 = OASCatalogsHotelListProductsByCatalo.getExample();
        OASCatalogsHotelListProductsByCatalo catalogsHotelListProductsByCatalogBasedFilterRequest2 = catalogsHotelListProductsByCatalogBasedFilterRequest1;
        OASCatalogsHotelListProductsByCatalo catalogsHotelListProductsByCatalogBasedFilterRequest3 = new OASCatalogsHotelListProductsByCatalo();
        OASCatalogsHotelListProductsByCatalo catalogsHotelListProductsByCatalogBasedFilterRequest4 = catalogsHotelListProductsByCatalogBasedFilterRequest3;

        System.assert(catalogsHotelListProductsByCatalogBasedFilterRequest1.equals(catalogsHotelListProductsByCatalogBasedFilterRequest2));
        System.assert(catalogsHotelListProductsByCatalogBasedFilterRequest2.equals(catalogsHotelListProductsByCatalogBasedFilterRequest1));
        System.assert(catalogsHotelListProductsByCatalogBasedFilterRequest1.equals(catalogsHotelListProductsByCatalogBasedFilterRequest1));
        System.assert(catalogsHotelListProductsByCatalogBasedFilterRequest3.equals(catalogsHotelListProductsByCatalogBasedFilterRequest4));
        System.assert(catalogsHotelListProductsByCatalogBasedFilterRequest4.equals(catalogsHotelListProductsByCatalogBasedFilterRequest3));
        System.assert(catalogsHotelListProductsByCatalogBasedFilterRequest3.equals(catalogsHotelListProductsByCatalogBasedFilterRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsHotelListProductsByCatalo catalogsHotelListProductsByCatalogBasedFilterRequest1 = OASCatalogsHotelListProductsByCatalo.getExample();
        OASCatalogsHotelListProductsByCatalo catalogsHotelListProductsByCatalogBasedFilterRequest2 = OASCatalogsHotelListProductsByCatalo.getExample();
        OASCatalogsHotelListProductsByCatalo catalogsHotelListProductsByCatalogBasedFilterRequest3 = new OASCatalogsHotelListProductsByCatalo();
        OASCatalogsHotelListProductsByCatalo catalogsHotelListProductsByCatalogBasedFilterRequest4 = new OASCatalogsHotelListProductsByCatalo();

        System.assert(catalogsHotelListProductsByCatalogBasedFilterRequest1.equals(catalogsHotelListProductsByCatalogBasedFilterRequest2));
        System.assert(catalogsHotelListProductsByCatalogBasedFilterRequest2.equals(catalogsHotelListProductsByCatalogBasedFilterRequest1));
        System.assert(catalogsHotelListProductsByCatalogBasedFilterRequest3.equals(catalogsHotelListProductsByCatalogBasedFilterRequest4));
        System.assert(catalogsHotelListProductsByCatalogBasedFilterRequest4.equals(catalogsHotelListProductsByCatalogBasedFilterRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsHotelListProductsByCatalo catalogsHotelListProductsByCatalogBasedFilterRequest1 = OASCatalogsHotelListProductsByCatalo.getExample();
        OASCatalogsHotelListProductsByCatalo catalogsHotelListProductsByCatalogBasedFilterRequest2 = new OASCatalogsHotelListProductsByCatalo();

        System.assertEquals(false, catalogsHotelListProductsByCatalogBasedFilterRequest1.equals('foo'));
        System.assertEquals(false, catalogsHotelListProductsByCatalogBasedFilterRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsHotelListProductsByCatalo catalogsHotelListProductsByCatalogBasedFilterRequest1 = OASCatalogsHotelListProductsByCatalo.getExample();
        OASCatalogsHotelListProductsByCatalo catalogsHotelListProductsByCatalogBasedFilterRequest2 = new OASCatalogsHotelListProductsByCatalo();
        OASCatalogsHotelListProductsByCatalo catalogsHotelListProductsByCatalogBasedFilterRequest3;

        System.assertEquals(false, catalogsHotelListProductsByCatalogBasedFilterRequest1.equals(catalogsHotelListProductsByCatalogBasedFilterRequest3));
        System.assertEquals(false, catalogsHotelListProductsByCatalogBasedFilterRequest2.equals(catalogsHotelListProductsByCatalogBasedFilterRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsHotelListProductsByCatalo catalogsHotelListProductsByCatalogBasedFilterRequest1 = OASCatalogsHotelListProductsByCatalo.getExample();
        OASCatalogsHotelListProductsByCatalo catalogsHotelListProductsByCatalogBasedFilterRequest2 = new OASCatalogsHotelListProductsByCatalo();

        System.assertEquals(catalogsHotelListProductsByCatalogBasedFilterRequest1.hashCode(), catalogsHotelListProductsByCatalogBasedFilterRequest1.hashCode());
        System.assertEquals(catalogsHotelListProductsByCatalogBasedFilterRequest2.hashCode(), catalogsHotelListProductsByCatalogBasedFilterRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsHotelListProductsByCatalo catalogsHotelListProductsByCatalogBasedFilterRequest1 = OASCatalogsHotelListProductsByCatalo.getExample();
        OASCatalogsHotelListProductsByCatalo catalogsHotelListProductsByCatalogBasedFilterRequest2 = OASCatalogsHotelListProductsByCatalo.getExample();
        OASCatalogsHotelListProductsByCatalo catalogsHotelListProductsByCatalogBasedFilterRequest3 = new OASCatalogsHotelListProductsByCatalo();
        OASCatalogsHotelListProductsByCatalo catalogsHotelListProductsByCatalogBasedFilterRequest4 = new OASCatalogsHotelListProductsByCatalo();

        System.assert(catalogsHotelListProductsByCatalogBasedFilterRequest1.equals(catalogsHotelListProductsByCatalogBasedFilterRequest2));
        System.assert(catalogsHotelListProductsByCatalogBasedFilterRequest3.equals(catalogsHotelListProductsByCatalogBasedFilterRequest4));
        System.assertEquals(catalogsHotelListProductsByCatalogBasedFilterRequest1.hashCode(), catalogsHotelListProductsByCatalogBasedFilterRequest2.hashCode());
        System.assertEquals(catalogsHotelListProductsByCatalogBasedFilterRequest3.hashCode(), catalogsHotelListProductsByCatalogBasedFilterRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsHotelListProductsByCatalo catalogsHotelListProductsByCatalogBasedFilterRequest = new OASCatalogsHotelListProductsByCatalo();
        Map<String, String> x-property-mappings = catalogsHotelListProductsByCatalogBasedFilterRequest.getx-property-mappings();
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
        System.assertEquals('catalogId', x-property-mappings.get('catalog_id'));
    }
}
