@isTest
private class OASCatalogsProductGroupsList200RespoTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsProductGroupsList200Respo catalogsProductGroupsList200Response1 = OASCatalogsProductGroupsList200Respo.getExample();
        OASCatalogsProductGroupsList200Respo catalogsProductGroupsList200Response2 = catalogsProductGroupsList200Response1;
        OASCatalogsProductGroupsList200Respo catalogsProductGroupsList200Response3 = new OASCatalogsProductGroupsList200Respo();
        OASCatalogsProductGroupsList200Respo catalogsProductGroupsList200Response4 = catalogsProductGroupsList200Response3;

        System.assert(catalogsProductGroupsList200Response1.equals(catalogsProductGroupsList200Response2));
        System.assert(catalogsProductGroupsList200Response2.equals(catalogsProductGroupsList200Response1));
        System.assert(catalogsProductGroupsList200Response1.equals(catalogsProductGroupsList200Response1));
        System.assert(catalogsProductGroupsList200Response3.equals(catalogsProductGroupsList200Response4));
        System.assert(catalogsProductGroupsList200Response4.equals(catalogsProductGroupsList200Response3));
        System.assert(catalogsProductGroupsList200Response3.equals(catalogsProductGroupsList200Response3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsProductGroupsList200Respo catalogsProductGroupsList200Response1 = OASCatalogsProductGroupsList200Respo.getExample();
        OASCatalogsProductGroupsList200Respo catalogsProductGroupsList200Response2 = OASCatalogsProductGroupsList200Respo.getExample();
        OASCatalogsProductGroupsList200Respo catalogsProductGroupsList200Response3 = new OASCatalogsProductGroupsList200Respo();
        OASCatalogsProductGroupsList200Respo catalogsProductGroupsList200Response4 = new OASCatalogsProductGroupsList200Respo();

        System.assert(catalogsProductGroupsList200Response1.equals(catalogsProductGroupsList200Response2));
        System.assert(catalogsProductGroupsList200Response2.equals(catalogsProductGroupsList200Response1));
        System.assert(catalogsProductGroupsList200Response3.equals(catalogsProductGroupsList200Response4));
        System.assert(catalogsProductGroupsList200Response4.equals(catalogsProductGroupsList200Response3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsProductGroupsList200Respo catalogsProductGroupsList200Response1 = OASCatalogsProductGroupsList200Respo.getExample();
        OASCatalogsProductGroupsList200Respo catalogsProductGroupsList200Response2 = new OASCatalogsProductGroupsList200Respo();

        System.assertEquals(false, catalogsProductGroupsList200Response1.equals('foo'));
        System.assertEquals(false, catalogsProductGroupsList200Response2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsProductGroupsList200Respo catalogsProductGroupsList200Response1 = OASCatalogsProductGroupsList200Respo.getExample();
        OASCatalogsProductGroupsList200Respo catalogsProductGroupsList200Response2 = new OASCatalogsProductGroupsList200Respo();
        OASCatalogsProductGroupsList200Respo catalogsProductGroupsList200Response3;

        System.assertEquals(false, catalogsProductGroupsList200Response1.equals(catalogsProductGroupsList200Response3));
        System.assertEquals(false, catalogsProductGroupsList200Response2.equals(catalogsProductGroupsList200Response3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsProductGroupsList200Respo catalogsProductGroupsList200Response1 = OASCatalogsProductGroupsList200Respo.getExample();
        OASCatalogsProductGroupsList200Respo catalogsProductGroupsList200Response2 = new OASCatalogsProductGroupsList200Respo();

        System.assertEquals(catalogsProductGroupsList200Response1.hashCode(), catalogsProductGroupsList200Response1.hashCode());
        System.assertEquals(catalogsProductGroupsList200Response2.hashCode(), catalogsProductGroupsList200Response2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsProductGroupsList200Respo catalogsProductGroupsList200Response1 = OASCatalogsProductGroupsList200Respo.getExample();
        OASCatalogsProductGroupsList200Respo catalogsProductGroupsList200Response2 = OASCatalogsProductGroupsList200Respo.getExample();
        OASCatalogsProductGroupsList200Respo catalogsProductGroupsList200Response3 = new OASCatalogsProductGroupsList200Respo();
        OASCatalogsProductGroupsList200Respo catalogsProductGroupsList200Response4 = new OASCatalogsProductGroupsList200Respo();

        System.assert(catalogsProductGroupsList200Response1.equals(catalogsProductGroupsList200Response2));
        System.assert(catalogsProductGroupsList200Response3.equals(catalogsProductGroupsList200Response4));
        System.assertEquals(catalogsProductGroupsList200Response1.hashCode(), catalogsProductGroupsList200Response2.hashCode());
        System.assertEquals(catalogsProductGroupsList200Response3.hashCode(), catalogsProductGroupsList200Response4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCatalogsProductGroupsList200Respo catalogsProductGroupsList200Response = new OASCatalogsProductGroupsList200Respo();
        System.assertEquals(new List<OASCatalogsProductGroupsList200Respo>(), catalogsProductGroupsList200Response.items);
        System.assertEquals(null, catalogsProductGroupsList200Response.bookmark);
    }
}
