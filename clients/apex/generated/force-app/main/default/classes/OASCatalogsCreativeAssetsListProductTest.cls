@isTest
private class OASCatalogsCreativeAssetsListProductTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsCreativeAssetsListProduct catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest1 = OASCatalogsCreativeAssetsListProduct.getExample();
        OASCatalogsCreativeAssetsListProduct catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest2 = catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest1;
        OASCatalogsCreativeAssetsListProduct catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest3 = new OASCatalogsCreativeAssetsListProduct();
        OASCatalogsCreativeAssetsListProduct catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest4 = catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest3;

        System.assert(catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest1.equals(catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest2));
        System.assert(catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest2.equals(catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest1));
        System.assert(catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest1.equals(catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest1));
        System.assert(catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest3.equals(catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest4));
        System.assert(catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest4.equals(catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest3));
        System.assert(catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest3.equals(catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsCreativeAssetsListProduct catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest1 = OASCatalogsCreativeAssetsListProduct.getExample();
        OASCatalogsCreativeAssetsListProduct catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest2 = OASCatalogsCreativeAssetsListProduct.getExample();
        OASCatalogsCreativeAssetsListProduct catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest3 = new OASCatalogsCreativeAssetsListProduct();
        OASCatalogsCreativeAssetsListProduct catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest4 = new OASCatalogsCreativeAssetsListProduct();

        System.assert(catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest1.equals(catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest2));
        System.assert(catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest2.equals(catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest1));
        System.assert(catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest3.equals(catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest4));
        System.assert(catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest4.equals(catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsCreativeAssetsListProduct catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest1 = OASCatalogsCreativeAssetsListProduct.getExample();
        OASCatalogsCreativeAssetsListProduct catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest2 = new OASCatalogsCreativeAssetsListProduct();

        System.assertEquals(false, catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest1.equals('foo'));
        System.assertEquals(false, catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsCreativeAssetsListProduct catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest1 = OASCatalogsCreativeAssetsListProduct.getExample();
        OASCatalogsCreativeAssetsListProduct catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest2 = new OASCatalogsCreativeAssetsListProduct();
        OASCatalogsCreativeAssetsListProduct catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest3;

        System.assertEquals(false, catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest1.equals(catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest3));
        System.assertEquals(false, catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest2.equals(catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsCreativeAssetsListProduct catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest1 = OASCatalogsCreativeAssetsListProduct.getExample();
        OASCatalogsCreativeAssetsListProduct catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest2 = new OASCatalogsCreativeAssetsListProduct();

        System.assertEquals(catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest1.hashCode(), catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest1.hashCode());
        System.assertEquals(catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest2.hashCode(), catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsCreativeAssetsListProduct catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest1 = OASCatalogsCreativeAssetsListProduct.getExample();
        OASCatalogsCreativeAssetsListProduct catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest2 = OASCatalogsCreativeAssetsListProduct.getExample();
        OASCatalogsCreativeAssetsListProduct catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest3 = new OASCatalogsCreativeAssetsListProduct();
        OASCatalogsCreativeAssetsListProduct catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest4 = new OASCatalogsCreativeAssetsListProduct();

        System.assert(catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest1.equals(catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest2));
        System.assert(catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest3.equals(catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest4));
        System.assertEquals(catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest1.hashCode(), catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest2.hashCode());
        System.assertEquals(catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest3.hashCode(), catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsCreativeAssetsListProduct catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest = new OASCatalogsCreativeAssetsListProduct();
        Map<String, String> x-property-mappings = catalogsCreativeAssetsListProductsByCatalogBasedFilterRequest.getx-property-mappings();
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
        System.assertEquals('catalogId', x-property-mappings.get('catalog_id'));
    }
}
