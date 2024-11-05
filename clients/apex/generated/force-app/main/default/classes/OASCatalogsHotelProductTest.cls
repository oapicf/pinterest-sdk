@isTest
private class OASCatalogsHotelProductTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsHotelProduct catalogsHotelProduct1 = OASCatalogsHotelProduct.getExample();
        OASCatalogsHotelProduct catalogsHotelProduct2 = catalogsHotelProduct1;
        OASCatalogsHotelProduct catalogsHotelProduct3 = new OASCatalogsHotelProduct();
        OASCatalogsHotelProduct catalogsHotelProduct4 = catalogsHotelProduct3;

        System.assert(catalogsHotelProduct1.equals(catalogsHotelProduct2));
        System.assert(catalogsHotelProduct2.equals(catalogsHotelProduct1));
        System.assert(catalogsHotelProduct1.equals(catalogsHotelProduct1));
        System.assert(catalogsHotelProduct3.equals(catalogsHotelProduct4));
        System.assert(catalogsHotelProduct4.equals(catalogsHotelProduct3));
        System.assert(catalogsHotelProduct3.equals(catalogsHotelProduct3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsHotelProduct catalogsHotelProduct1 = OASCatalogsHotelProduct.getExample();
        OASCatalogsHotelProduct catalogsHotelProduct2 = OASCatalogsHotelProduct.getExample();
        OASCatalogsHotelProduct catalogsHotelProduct3 = new OASCatalogsHotelProduct();
        OASCatalogsHotelProduct catalogsHotelProduct4 = new OASCatalogsHotelProduct();

        System.assert(catalogsHotelProduct1.equals(catalogsHotelProduct2));
        System.assert(catalogsHotelProduct2.equals(catalogsHotelProduct1));
        System.assert(catalogsHotelProduct3.equals(catalogsHotelProduct4));
        System.assert(catalogsHotelProduct4.equals(catalogsHotelProduct3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsHotelProduct catalogsHotelProduct1 = OASCatalogsHotelProduct.getExample();
        OASCatalogsHotelProduct catalogsHotelProduct2 = new OASCatalogsHotelProduct();

        System.assertEquals(false, catalogsHotelProduct1.equals('foo'));
        System.assertEquals(false, catalogsHotelProduct2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsHotelProduct catalogsHotelProduct1 = OASCatalogsHotelProduct.getExample();
        OASCatalogsHotelProduct catalogsHotelProduct2 = new OASCatalogsHotelProduct();
        OASCatalogsHotelProduct catalogsHotelProduct3;

        System.assertEquals(false, catalogsHotelProduct1.equals(catalogsHotelProduct3));
        System.assertEquals(false, catalogsHotelProduct2.equals(catalogsHotelProduct3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsHotelProduct catalogsHotelProduct1 = OASCatalogsHotelProduct.getExample();
        OASCatalogsHotelProduct catalogsHotelProduct2 = new OASCatalogsHotelProduct();

        System.assertEquals(catalogsHotelProduct1.hashCode(), catalogsHotelProduct1.hashCode());
        System.assertEquals(catalogsHotelProduct2.hashCode(), catalogsHotelProduct2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsHotelProduct catalogsHotelProduct1 = OASCatalogsHotelProduct.getExample();
        OASCatalogsHotelProduct catalogsHotelProduct2 = OASCatalogsHotelProduct.getExample();
        OASCatalogsHotelProduct catalogsHotelProduct3 = new OASCatalogsHotelProduct();
        OASCatalogsHotelProduct catalogsHotelProduct4 = new OASCatalogsHotelProduct();

        System.assert(catalogsHotelProduct1.equals(catalogsHotelProduct2));
        System.assert(catalogsHotelProduct3.equals(catalogsHotelProduct4));
        System.assertEquals(catalogsHotelProduct1.hashCode(), catalogsHotelProduct2.hashCode());
        System.assertEquals(catalogsHotelProduct3.hashCode(), catalogsHotelProduct4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsHotelProduct catalogsHotelProduct = new OASCatalogsHotelProduct();
        Map<String, String> x-property-mappings = catalogsHotelProduct.getx-property-mappings();
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
    }
}
