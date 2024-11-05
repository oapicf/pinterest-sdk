@isTest
private class OASCatalogsCreativeAssetsProductTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsCreativeAssetsProduct catalogsCreativeAssetsProduct1 = OASCatalogsCreativeAssetsProduct.getExample();
        OASCatalogsCreativeAssetsProduct catalogsCreativeAssetsProduct2 = catalogsCreativeAssetsProduct1;
        OASCatalogsCreativeAssetsProduct catalogsCreativeAssetsProduct3 = new OASCatalogsCreativeAssetsProduct();
        OASCatalogsCreativeAssetsProduct catalogsCreativeAssetsProduct4 = catalogsCreativeAssetsProduct3;

        System.assert(catalogsCreativeAssetsProduct1.equals(catalogsCreativeAssetsProduct2));
        System.assert(catalogsCreativeAssetsProduct2.equals(catalogsCreativeAssetsProduct1));
        System.assert(catalogsCreativeAssetsProduct1.equals(catalogsCreativeAssetsProduct1));
        System.assert(catalogsCreativeAssetsProduct3.equals(catalogsCreativeAssetsProduct4));
        System.assert(catalogsCreativeAssetsProduct4.equals(catalogsCreativeAssetsProduct3));
        System.assert(catalogsCreativeAssetsProduct3.equals(catalogsCreativeAssetsProduct3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsCreativeAssetsProduct catalogsCreativeAssetsProduct1 = OASCatalogsCreativeAssetsProduct.getExample();
        OASCatalogsCreativeAssetsProduct catalogsCreativeAssetsProduct2 = OASCatalogsCreativeAssetsProduct.getExample();
        OASCatalogsCreativeAssetsProduct catalogsCreativeAssetsProduct3 = new OASCatalogsCreativeAssetsProduct();
        OASCatalogsCreativeAssetsProduct catalogsCreativeAssetsProduct4 = new OASCatalogsCreativeAssetsProduct();

        System.assert(catalogsCreativeAssetsProduct1.equals(catalogsCreativeAssetsProduct2));
        System.assert(catalogsCreativeAssetsProduct2.equals(catalogsCreativeAssetsProduct1));
        System.assert(catalogsCreativeAssetsProduct3.equals(catalogsCreativeAssetsProduct4));
        System.assert(catalogsCreativeAssetsProduct4.equals(catalogsCreativeAssetsProduct3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsCreativeAssetsProduct catalogsCreativeAssetsProduct1 = OASCatalogsCreativeAssetsProduct.getExample();
        OASCatalogsCreativeAssetsProduct catalogsCreativeAssetsProduct2 = new OASCatalogsCreativeAssetsProduct();

        System.assertEquals(false, catalogsCreativeAssetsProduct1.equals('foo'));
        System.assertEquals(false, catalogsCreativeAssetsProduct2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsCreativeAssetsProduct catalogsCreativeAssetsProduct1 = OASCatalogsCreativeAssetsProduct.getExample();
        OASCatalogsCreativeAssetsProduct catalogsCreativeAssetsProduct2 = new OASCatalogsCreativeAssetsProduct();
        OASCatalogsCreativeAssetsProduct catalogsCreativeAssetsProduct3;

        System.assertEquals(false, catalogsCreativeAssetsProduct1.equals(catalogsCreativeAssetsProduct3));
        System.assertEquals(false, catalogsCreativeAssetsProduct2.equals(catalogsCreativeAssetsProduct3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsCreativeAssetsProduct catalogsCreativeAssetsProduct1 = OASCatalogsCreativeAssetsProduct.getExample();
        OASCatalogsCreativeAssetsProduct catalogsCreativeAssetsProduct2 = new OASCatalogsCreativeAssetsProduct();

        System.assertEquals(catalogsCreativeAssetsProduct1.hashCode(), catalogsCreativeAssetsProduct1.hashCode());
        System.assertEquals(catalogsCreativeAssetsProduct2.hashCode(), catalogsCreativeAssetsProduct2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsCreativeAssetsProduct catalogsCreativeAssetsProduct1 = OASCatalogsCreativeAssetsProduct.getExample();
        OASCatalogsCreativeAssetsProduct catalogsCreativeAssetsProduct2 = OASCatalogsCreativeAssetsProduct.getExample();
        OASCatalogsCreativeAssetsProduct catalogsCreativeAssetsProduct3 = new OASCatalogsCreativeAssetsProduct();
        OASCatalogsCreativeAssetsProduct catalogsCreativeAssetsProduct4 = new OASCatalogsCreativeAssetsProduct();

        System.assert(catalogsCreativeAssetsProduct1.equals(catalogsCreativeAssetsProduct2));
        System.assert(catalogsCreativeAssetsProduct3.equals(catalogsCreativeAssetsProduct4));
        System.assertEquals(catalogsCreativeAssetsProduct1.hashCode(), catalogsCreativeAssetsProduct2.hashCode());
        System.assertEquals(catalogsCreativeAssetsProduct3.hashCode(), catalogsCreativeAssetsProduct4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsCreativeAssetsProduct catalogsCreativeAssetsProduct = new OASCatalogsCreativeAssetsProduct();
        Map<String, String> x-property-mappings = catalogsCreativeAssetsProduct.getx-property-mappings();
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
    }
}
