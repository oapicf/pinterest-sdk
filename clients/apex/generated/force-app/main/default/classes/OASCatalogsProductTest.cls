@isTest
private class OASCatalogsProductTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsProduct catalogsProduct1 = OASCatalogsProduct.getExample();
        OASCatalogsProduct catalogsProduct2 = catalogsProduct1;
        OASCatalogsProduct catalogsProduct3 = new OASCatalogsProduct();
        OASCatalogsProduct catalogsProduct4 = catalogsProduct3;

        System.assert(catalogsProduct1.equals(catalogsProduct2));
        System.assert(catalogsProduct2.equals(catalogsProduct1));
        System.assert(catalogsProduct1.equals(catalogsProduct1));
        System.assert(catalogsProduct3.equals(catalogsProduct4));
        System.assert(catalogsProduct4.equals(catalogsProduct3));
        System.assert(catalogsProduct3.equals(catalogsProduct3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsProduct catalogsProduct1 = OASCatalogsProduct.getExample();
        OASCatalogsProduct catalogsProduct2 = OASCatalogsProduct.getExample();
        OASCatalogsProduct catalogsProduct3 = new OASCatalogsProduct();
        OASCatalogsProduct catalogsProduct4 = new OASCatalogsProduct();

        System.assert(catalogsProduct1.equals(catalogsProduct2));
        System.assert(catalogsProduct2.equals(catalogsProduct1));
        System.assert(catalogsProduct3.equals(catalogsProduct4));
        System.assert(catalogsProduct4.equals(catalogsProduct3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsProduct catalogsProduct1 = OASCatalogsProduct.getExample();
        OASCatalogsProduct catalogsProduct2 = new OASCatalogsProduct();

        System.assertEquals(false, catalogsProduct1.equals('foo'));
        System.assertEquals(false, catalogsProduct2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsProduct catalogsProduct1 = OASCatalogsProduct.getExample();
        OASCatalogsProduct catalogsProduct2 = new OASCatalogsProduct();
        OASCatalogsProduct catalogsProduct3;

        System.assertEquals(false, catalogsProduct1.equals(catalogsProduct3));
        System.assertEquals(false, catalogsProduct2.equals(catalogsProduct3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsProduct catalogsProduct1 = OASCatalogsProduct.getExample();
        OASCatalogsProduct catalogsProduct2 = new OASCatalogsProduct();

        System.assertEquals(catalogsProduct1.hashCode(), catalogsProduct1.hashCode());
        System.assertEquals(catalogsProduct2.hashCode(), catalogsProduct2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsProduct catalogsProduct1 = OASCatalogsProduct.getExample();
        OASCatalogsProduct catalogsProduct2 = OASCatalogsProduct.getExample();
        OASCatalogsProduct catalogsProduct3 = new OASCatalogsProduct();
        OASCatalogsProduct catalogsProduct4 = new OASCatalogsProduct();

        System.assert(catalogsProduct1.equals(catalogsProduct2));
        System.assert(catalogsProduct3.equals(catalogsProduct4));
        System.assertEquals(catalogsProduct1.hashCode(), catalogsProduct2.hashCode());
        System.assertEquals(catalogsProduct3.hashCode(), catalogsProduct4.hashCode());
    }
}
