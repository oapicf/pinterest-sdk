@isTest
private class OASCatalogsRetailListProductsByCatalTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsRetailListProductsByCatal catalogsRetailListProductsByCatalogBasedFilterRequest1 = OASCatalogsRetailListProductsByCatal.getExample();
        OASCatalogsRetailListProductsByCatal catalogsRetailListProductsByCatalogBasedFilterRequest2 = catalogsRetailListProductsByCatalogBasedFilterRequest1;
        OASCatalogsRetailListProductsByCatal catalogsRetailListProductsByCatalogBasedFilterRequest3 = new OASCatalogsRetailListProductsByCatal();
        OASCatalogsRetailListProductsByCatal catalogsRetailListProductsByCatalogBasedFilterRequest4 = catalogsRetailListProductsByCatalogBasedFilterRequest3;

        System.assert(catalogsRetailListProductsByCatalogBasedFilterRequest1.equals(catalogsRetailListProductsByCatalogBasedFilterRequest2));
        System.assert(catalogsRetailListProductsByCatalogBasedFilterRequest2.equals(catalogsRetailListProductsByCatalogBasedFilterRequest1));
        System.assert(catalogsRetailListProductsByCatalogBasedFilterRequest1.equals(catalogsRetailListProductsByCatalogBasedFilterRequest1));
        System.assert(catalogsRetailListProductsByCatalogBasedFilterRequest3.equals(catalogsRetailListProductsByCatalogBasedFilterRequest4));
        System.assert(catalogsRetailListProductsByCatalogBasedFilterRequest4.equals(catalogsRetailListProductsByCatalogBasedFilterRequest3));
        System.assert(catalogsRetailListProductsByCatalogBasedFilterRequest3.equals(catalogsRetailListProductsByCatalogBasedFilterRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsRetailListProductsByCatal catalogsRetailListProductsByCatalogBasedFilterRequest1 = OASCatalogsRetailListProductsByCatal.getExample();
        OASCatalogsRetailListProductsByCatal catalogsRetailListProductsByCatalogBasedFilterRequest2 = OASCatalogsRetailListProductsByCatal.getExample();
        OASCatalogsRetailListProductsByCatal catalogsRetailListProductsByCatalogBasedFilterRequest3 = new OASCatalogsRetailListProductsByCatal();
        OASCatalogsRetailListProductsByCatal catalogsRetailListProductsByCatalogBasedFilterRequest4 = new OASCatalogsRetailListProductsByCatal();

        System.assert(catalogsRetailListProductsByCatalogBasedFilterRequest1.equals(catalogsRetailListProductsByCatalogBasedFilterRequest2));
        System.assert(catalogsRetailListProductsByCatalogBasedFilterRequest2.equals(catalogsRetailListProductsByCatalogBasedFilterRequest1));
        System.assert(catalogsRetailListProductsByCatalogBasedFilterRequest3.equals(catalogsRetailListProductsByCatalogBasedFilterRequest4));
        System.assert(catalogsRetailListProductsByCatalogBasedFilterRequest4.equals(catalogsRetailListProductsByCatalogBasedFilterRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsRetailListProductsByCatal catalogsRetailListProductsByCatalogBasedFilterRequest1 = OASCatalogsRetailListProductsByCatal.getExample();
        OASCatalogsRetailListProductsByCatal catalogsRetailListProductsByCatalogBasedFilterRequest2 = new OASCatalogsRetailListProductsByCatal();

        System.assertEquals(false, catalogsRetailListProductsByCatalogBasedFilterRequest1.equals('foo'));
        System.assertEquals(false, catalogsRetailListProductsByCatalogBasedFilterRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsRetailListProductsByCatal catalogsRetailListProductsByCatalogBasedFilterRequest1 = OASCatalogsRetailListProductsByCatal.getExample();
        OASCatalogsRetailListProductsByCatal catalogsRetailListProductsByCatalogBasedFilterRequest2 = new OASCatalogsRetailListProductsByCatal();
        OASCatalogsRetailListProductsByCatal catalogsRetailListProductsByCatalogBasedFilterRequest3;

        System.assertEquals(false, catalogsRetailListProductsByCatalogBasedFilterRequest1.equals(catalogsRetailListProductsByCatalogBasedFilterRequest3));
        System.assertEquals(false, catalogsRetailListProductsByCatalogBasedFilterRequest2.equals(catalogsRetailListProductsByCatalogBasedFilterRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsRetailListProductsByCatal catalogsRetailListProductsByCatalogBasedFilterRequest1 = OASCatalogsRetailListProductsByCatal.getExample();
        OASCatalogsRetailListProductsByCatal catalogsRetailListProductsByCatalogBasedFilterRequest2 = new OASCatalogsRetailListProductsByCatal();

        System.assertEquals(catalogsRetailListProductsByCatalogBasedFilterRequest1.hashCode(), catalogsRetailListProductsByCatalogBasedFilterRequest1.hashCode());
        System.assertEquals(catalogsRetailListProductsByCatalogBasedFilterRequest2.hashCode(), catalogsRetailListProductsByCatalogBasedFilterRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsRetailListProductsByCatal catalogsRetailListProductsByCatalogBasedFilterRequest1 = OASCatalogsRetailListProductsByCatal.getExample();
        OASCatalogsRetailListProductsByCatal catalogsRetailListProductsByCatalogBasedFilterRequest2 = OASCatalogsRetailListProductsByCatal.getExample();
        OASCatalogsRetailListProductsByCatal catalogsRetailListProductsByCatalogBasedFilterRequest3 = new OASCatalogsRetailListProductsByCatal();
        OASCatalogsRetailListProductsByCatal catalogsRetailListProductsByCatalogBasedFilterRequest4 = new OASCatalogsRetailListProductsByCatal();

        System.assert(catalogsRetailListProductsByCatalogBasedFilterRequest1.equals(catalogsRetailListProductsByCatalogBasedFilterRequest2));
        System.assert(catalogsRetailListProductsByCatalogBasedFilterRequest3.equals(catalogsRetailListProductsByCatalogBasedFilterRequest4));
        System.assertEquals(catalogsRetailListProductsByCatalogBasedFilterRequest1.hashCode(), catalogsRetailListProductsByCatalogBasedFilterRequest2.hashCode());
        System.assertEquals(catalogsRetailListProductsByCatalogBasedFilterRequest3.hashCode(), catalogsRetailListProductsByCatalogBasedFilterRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsRetailListProductsByCatal catalogsRetailListProductsByCatalogBasedFilterRequest = new OASCatalogsRetailListProductsByCatal();
        Map<String, String> x-property-mappings = catalogsRetailListProductsByCatalogBasedFilterRequest.getx-property-mappings();
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
        System.assertEquals('catalogId', x-property-mappings.get('catalog_id'));
    }
}
