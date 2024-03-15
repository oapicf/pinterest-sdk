@isTest
private class OASCatalogsList200ResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsList200Response catalogsList200Response1 = OASCatalogsList200Response.getExample();
        OASCatalogsList200Response catalogsList200Response2 = catalogsList200Response1;
        OASCatalogsList200Response catalogsList200Response3 = new OASCatalogsList200Response();
        OASCatalogsList200Response catalogsList200Response4 = catalogsList200Response3;

        System.assert(catalogsList200Response1.equals(catalogsList200Response2));
        System.assert(catalogsList200Response2.equals(catalogsList200Response1));
        System.assert(catalogsList200Response1.equals(catalogsList200Response1));
        System.assert(catalogsList200Response3.equals(catalogsList200Response4));
        System.assert(catalogsList200Response4.equals(catalogsList200Response3));
        System.assert(catalogsList200Response3.equals(catalogsList200Response3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsList200Response catalogsList200Response1 = OASCatalogsList200Response.getExample();
        OASCatalogsList200Response catalogsList200Response2 = OASCatalogsList200Response.getExample();
        OASCatalogsList200Response catalogsList200Response3 = new OASCatalogsList200Response();
        OASCatalogsList200Response catalogsList200Response4 = new OASCatalogsList200Response();

        System.assert(catalogsList200Response1.equals(catalogsList200Response2));
        System.assert(catalogsList200Response2.equals(catalogsList200Response1));
        System.assert(catalogsList200Response3.equals(catalogsList200Response4));
        System.assert(catalogsList200Response4.equals(catalogsList200Response3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsList200Response catalogsList200Response1 = OASCatalogsList200Response.getExample();
        OASCatalogsList200Response catalogsList200Response2 = new OASCatalogsList200Response();

        System.assertEquals(false, catalogsList200Response1.equals('foo'));
        System.assertEquals(false, catalogsList200Response2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsList200Response catalogsList200Response1 = OASCatalogsList200Response.getExample();
        OASCatalogsList200Response catalogsList200Response2 = new OASCatalogsList200Response();
        OASCatalogsList200Response catalogsList200Response3;

        System.assertEquals(false, catalogsList200Response1.equals(catalogsList200Response3));
        System.assertEquals(false, catalogsList200Response2.equals(catalogsList200Response3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsList200Response catalogsList200Response1 = OASCatalogsList200Response.getExample();
        OASCatalogsList200Response catalogsList200Response2 = new OASCatalogsList200Response();

        System.assertEquals(catalogsList200Response1.hashCode(), catalogsList200Response1.hashCode());
        System.assertEquals(catalogsList200Response2.hashCode(), catalogsList200Response2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsList200Response catalogsList200Response1 = OASCatalogsList200Response.getExample();
        OASCatalogsList200Response catalogsList200Response2 = OASCatalogsList200Response.getExample();
        OASCatalogsList200Response catalogsList200Response3 = new OASCatalogsList200Response();
        OASCatalogsList200Response catalogsList200Response4 = new OASCatalogsList200Response();

        System.assert(catalogsList200Response1.equals(catalogsList200Response2));
        System.assert(catalogsList200Response3.equals(catalogsList200Response4));
        System.assertEquals(catalogsList200Response1.hashCode(), catalogsList200Response2.hashCode());
        System.assertEquals(catalogsList200Response3.hashCode(), catalogsList200Response4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCatalogsList200Response catalogsList200Response = new OASCatalogsList200Response();
        System.assertEquals(new List<OASCatalog>(), catalogsList200Response.items);
        System.assertEquals(null, catalogsList200Response.bookmark);
    }
}
