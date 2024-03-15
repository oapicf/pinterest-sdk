@isTest
private class OASCatalogsProductGroupPinsList200ReTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsProductGroupPinsList200Re catalogsProductGroupPinsList200Response1 = OASCatalogsProductGroupPinsList200Re.getExample();
        OASCatalogsProductGroupPinsList200Re catalogsProductGroupPinsList200Response2 = catalogsProductGroupPinsList200Response1;
        OASCatalogsProductGroupPinsList200Re catalogsProductGroupPinsList200Response3 = new OASCatalogsProductGroupPinsList200Re();
        OASCatalogsProductGroupPinsList200Re catalogsProductGroupPinsList200Response4 = catalogsProductGroupPinsList200Response3;

        System.assert(catalogsProductGroupPinsList200Response1.equals(catalogsProductGroupPinsList200Response2));
        System.assert(catalogsProductGroupPinsList200Response2.equals(catalogsProductGroupPinsList200Response1));
        System.assert(catalogsProductGroupPinsList200Response1.equals(catalogsProductGroupPinsList200Response1));
        System.assert(catalogsProductGroupPinsList200Response3.equals(catalogsProductGroupPinsList200Response4));
        System.assert(catalogsProductGroupPinsList200Response4.equals(catalogsProductGroupPinsList200Response3));
        System.assert(catalogsProductGroupPinsList200Response3.equals(catalogsProductGroupPinsList200Response3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsProductGroupPinsList200Re catalogsProductGroupPinsList200Response1 = OASCatalogsProductGroupPinsList200Re.getExample();
        OASCatalogsProductGroupPinsList200Re catalogsProductGroupPinsList200Response2 = OASCatalogsProductGroupPinsList200Re.getExample();
        OASCatalogsProductGroupPinsList200Re catalogsProductGroupPinsList200Response3 = new OASCatalogsProductGroupPinsList200Re();
        OASCatalogsProductGroupPinsList200Re catalogsProductGroupPinsList200Response4 = new OASCatalogsProductGroupPinsList200Re();

        System.assert(catalogsProductGroupPinsList200Response1.equals(catalogsProductGroupPinsList200Response2));
        System.assert(catalogsProductGroupPinsList200Response2.equals(catalogsProductGroupPinsList200Response1));
        System.assert(catalogsProductGroupPinsList200Response3.equals(catalogsProductGroupPinsList200Response4));
        System.assert(catalogsProductGroupPinsList200Response4.equals(catalogsProductGroupPinsList200Response3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsProductGroupPinsList200Re catalogsProductGroupPinsList200Response1 = OASCatalogsProductGroupPinsList200Re.getExample();
        OASCatalogsProductGroupPinsList200Re catalogsProductGroupPinsList200Response2 = new OASCatalogsProductGroupPinsList200Re();

        System.assertEquals(false, catalogsProductGroupPinsList200Response1.equals('foo'));
        System.assertEquals(false, catalogsProductGroupPinsList200Response2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsProductGroupPinsList200Re catalogsProductGroupPinsList200Response1 = OASCatalogsProductGroupPinsList200Re.getExample();
        OASCatalogsProductGroupPinsList200Re catalogsProductGroupPinsList200Response2 = new OASCatalogsProductGroupPinsList200Re();
        OASCatalogsProductGroupPinsList200Re catalogsProductGroupPinsList200Response3;

        System.assertEquals(false, catalogsProductGroupPinsList200Response1.equals(catalogsProductGroupPinsList200Response3));
        System.assertEquals(false, catalogsProductGroupPinsList200Response2.equals(catalogsProductGroupPinsList200Response3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsProductGroupPinsList200Re catalogsProductGroupPinsList200Response1 = OASCatalogsProductGroupPinsList200Re.getExample();
        OASCatalogsProductGroupPinsList200Re catalogsProductGroupPinsList200Response2 = new OASCatalogsProductGroupPinsList200Re();

        System.assertEquals(catalogsProductGroupPinsList200Response1.hashCode(), catalogsProductGroupPinsList200Response1.hashCode());
        System.assertEquals(catalogsProductGroupPinsList200Response2.hashCode(), catalogsProductGroupPinsList200Response2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsProductGroupPinsList200Re catalogsProductGroupPinsList200Response1 = OASCatalogsProductGroupPinsList200Re.getExample();
        OASCatalogsProductGroupPinsList200Re catalogsProductGroupPinsList200Response2 = OASCatalogsProductGroupPinsList200Re.getExample();
        OASCatalogsProductGroupPinsList200Re catalogsProductGroupPinsList200Response3 = new OASCatalogsProductGroupPinsList200Re();
        OASCatalogsProductGroupPinsList200Re catalogsProductGroupPinsList200Response4 = new OASCatalogsProductGroupPinsList200Re();

        System.assert(catalogsProductGroupPinsList200Response1.equals(catalogsProductGroupPinsList200Response2));
        System.assert(catalogsProductGroupPinsList200Response3.equals(catalogsProductGroupPinsList200Response4));
        System.assertEquals(catalogsProductGroupPinsList200Response1.hashCode(), catalogsProductGroupPinsList200Response2.hashCode());
        System.assertEquals(catalogsProductGroupPinsList200Response3.hashCode(), catalogsProductGroupPinsList200Response4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCatalogsProductGroupPinsList200Re catalogsProductGroupPinsList200Response = new OASCatalogsProductGroupPinsList200Re();
        System.assertEquals(new List<OASCatalogsProduct>(), catalogsProductGroupPinsList200Response.items);
        System.assertEquals(null, catalogsProductGroupPinsList200Response.bookmark);
    }
}
