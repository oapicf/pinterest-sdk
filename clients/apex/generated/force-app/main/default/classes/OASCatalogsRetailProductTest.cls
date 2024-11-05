@isTest
private class OASCatalogsRetailProductTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsRetailProduct catalogsRetailProduct1 = OASCatalogsRetailProduct.getExample();
        OASCatalogsRetailProduct catalogsRetailProduct2 = catalogsRetailProduct1;
        OASCatalogsRetailProduct catalogsRetailProduct3 = new OASCatalogsRetailProduct();
        OASCatalogsRetailProduct catalogsRetailProduct4 = catalogsRetailProduct3;

        System.assert(catalogsRetailProduct1.equals(catalogsRetailProduct2));
        System.assert(catalogsRetailProduct2.equals(catalogsRetailProduct1));
        System.assert(catalogsRetailProduct1.equals(catalogsRetailProduct1));
        System.assert(catalogsRetailProduct3.equals(catalogsRetailProduct4));
        System.assert(catalogsRetailProduct4.equals(catalogsRetailProduct3));
        System.assert(catalogsRetailProduct3.equals(catalogsRetailProduct3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsRetailProduct catalogsRetailProduct1 = OASCatalogsRetailProduct.getExample();
        OASCatalogsRetailProduct catalogsRetailProduct2 = OASCatalogsRetailProduct.getExample();
        OASCatalogsRetailProduct catalogsRetailProduct3 = new OASCatalogsRetailProduct();
        OASCatalogsRetailProduct catalogsRetailProduct4 = new OASCatalogsRetailProduct();

        System.assert(catalogsRetailProduct1.equals(catalogsRetailProduct2));
        System.assert(catalogsRetailProduct2.equals(catalogsRetailProduct1));
        System.assert(catalogsRetailProduct3.equals(catalogsRetailProduct4));
        System.assert(catalogsRetailProduct4.equals(catalogsRetailProduct3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsRetailProduct catalogsRetailProduct1 = OASCatalogsRetailProduct.getExample();
        OASCatalogsRetailProduct catalogsRetailProduct2 = new OASCatalogsRetailProduct();

        System.assertEquals(false, catalogsRetailProduct1.equals('foo'));
        System.assertEquals(false, catalogsRetailProduct2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsRetailProduct catalogsRetailProduct1 = OASCatalogsRetailProduct.getExample();
        OASCatalogsRetailProduct catalogsRetailProduct2 = new OASCatalogsRetailProduct();
        OASCatalogsRetailProduct catalogsRetailProduct3;

        System.assertEquals(false, catalogsRetailProduct1.equals(catalogsRetailProduct3));
        System.assertEquals(false, catalogsRetailProduct2.equals(catalogsRetailProduct3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsRetailProduct catalogsRetailProduct1 = OASCatalogsRetailProduct.getExample();
        OASCatalogsRetailProduct catalogsRetailProduct2 = new OASCatalogsRetailProduct();

        System.assertEquals(catalogsRetailProduct1.hashCode(), catalogsRetailProduct1.hashCode());
        System.assertEquals(catalogsRetailProduct2.hashCode(), catalogsRetailProduct2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsRetailProduct catalogsRetailProduct1 = OASCatalogsRetailProduct.getExample();
        OASCatalogsRetailProduct catalogsRetailProduct2 = OASCatalogsRetailProduct.getExample();
        OASCatalogsRetailProduct catalogsRetailProduct3 = new OASCatalogsRetailProduct();
        OASCatalogsRetailProduct catalogsRetailProduct4 = new OASCatalogsRetailProduct();

        System.assert(catalogsRetailProduct1.equals(catalogsRetailProduct2));
        System.assert(catalogsRetailProduct3.equals(catalogsRetailProduct4));
        System.assertEquals(catalogsRetailProduct1.hashCode(), catalogsRetailProduct2.hashCode());
        System.assertEquals(catalogsRetailProduct3.hashCode(), catalogsRetailProduct4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsRetailProduct catalogsRetailProduct = new OASCatalogsRetailProduct();
        Map<String, String> x-property-mappings = catalogsRetailProduct.getx-property-mappings();
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
    }
}
