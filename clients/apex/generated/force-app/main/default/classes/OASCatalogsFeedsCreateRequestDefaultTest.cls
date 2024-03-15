@isTest
private class OASCatalogsFeedsCreateRequestDefaultTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsFeedsCreateRequestDefault catalogsFeedsCreateRequestDefaultLocale1 = OASCatalogsFeedsCreateRequestDefault.getExample();
        OASCatalogsFeedsCreateRequestDefault catalogsFeedsCreateRequestDefaultLocale2 = catalogsFeedsCreateRequestDefaultLocale1;
        OASCatalogsFeedsCreateRequestDefault catalogsFeedsCreateRequestDefaultLocale3 = new OASCatalogsFeedsCreateRequestDefault();
        OASCatalogsFeedsCreateRequestDefault catalogsFeedsCreateRequestDefaultLocale4 = catalogsFeedsCreateRequestDefaultLocale3;

        System.assert(catalogsFeedsCreateRequestDefaultLocale1.equals(catalogsFeedsCreateRequestDefaultLocale2));
        System.assert(catalogsFeedsCreateRequestDefaultLocale2.equals(catalogsFeedsCreateRequestDefaultLocale1));
        System.assert(catalogsFeedsCreateRequestDefaultLocale1.equals(catalogsFeedsCreateRequestDefaultLocale1));
        System.assert(catalogsFeedsCreateRequestDefaultLocale3.equals(catalogsFeedsCreateRequestDefaultLocale4));
        System.assert(catalogsFeedsCreateRequestDefaultLocale4.equals(catalogsFeedsCreateRequestDefaultLocale3));
        System.assert(catalogsFeedsCreateRequestDefaultLocale3.equals(catalogsFeedsCreateRequestDefaultLocale3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsFeedsCreateRequestDefault catalogsFeedsCreateRequestDefaultLocale1 = OASCatalogsFeedsCreateRequestDefault.getExample();
        OASCatalogsFeedsCreateRequestDefault catalogsFeedsCreateRequestDefaultLocale2 = OASCatalogsFeedsCreateRequestDefault.getExample();
        OASCatalogsFeedsCreateRequestDefault catalogsFeedsCreateRequestDefaultLocale3 = new OASCatalogsFeedsCreateRequestDefault();
        OASCatalogsFeedsCreateRequestDefault catalogsFeedsCreateRequestDefaultLocale4 = new OASCatalogsFeedsCreateRequestDefault();

        System.assert(catalogsFeedsCreateRequestDefaultLocale1.equals(catalogsFeedsCreateRequestDefaultLocale2));
        System.assert(catalogsFeedsCreateRequestDefaultLocale2.equals(catalogsFeedsCreateRequestDefaultLocale1));
        System.assert(catalogsFeedsCreateRequestDefaultLocale3.equals(catalogsFeedsCreateRequestDefaultLocale4));
        System.assert(catalogsFeedsCreateRequestDefaultLocale4.equals(catalogsFeedsCreateRequestDefaultLocale3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsFeedsCreateRequestDefault catalogsFeedsCreateRequestDefaultLocale1 = OASCatalogsFeedsCreateRequestDefault.getExample();
        OASCatalogsFeedsCreateRequestDefault catalogsFeedsCreateRequestDefaultLocale2 = new OASCatalogsFeedsCreateRequestDefault();

        System.assertEquals(false, catalogsFeedsCreateRequestDefaultLocale1.equals('foo'));
        System.assertEquals(false, catalogsFeedsCreateRequestDefaultLocale2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsFeedsCreateRequestDefault catalogsFeedsCreateRequestDefaultLocale1 = OASCatalogsFeedsCreateRequestDefault.getExample();
        OASCatalogsFeedsCreateRequestDefault catalogsFeedsCreateRequestDefaultLocale2 = new OASCatalogsFeedsCreateRequestDefault();
        OASCatalogsFeedsCreateRequestDefault catalogsFeedsCreateRequestDefaultLocale3;

        System.assertEquals(false, catalogsFeedsCreateRequestDefaultLocale1.equals(catalogsFeedsCreateRequestDefaultLocale3));
        System.assertEquals(false, catalogsFeedsCreateRequestDefaultLocale2.equals(catalogsFeedsCreateRequestDefaultLocale3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsFeedsCreateRequestDefault catalogsFeedsCreateRequestDefaultLocale1 = OASCatalogsFeedsCreateRequestDefault.getExample();
        OASCatalogsFeedsCreateRequestDefault catalogsFeedsCreateRequestDefaultLocale2 = new OASCatalogsFeedsCreateRequestDefault();

        System.assertEquals(catalogsFeedsCreateRequestDefaultLocale1.hashCode(), catalogsFeedsCreateRequestDefaultLocale1.hashCode());
        System.assertEquals(catalogsFeedsCreateRequestDefaultLocale2.hashCode(), catalogsFeedsCreateRequestDefaultLocale2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsFeedsCreateRequestDefault catalogsFeedsCreateRequestDefaultLocale1 = OASCatalogsFeedsCreateRequestDefault.getExample();
        OASCatalogsFeedsCreateRequestDefault catalogsFeedsCreateRequestDefaultLocale2 = OASCatalogsFeedsCreateRequestDefault.getExample();
        OASCatalogsFeedsCreateRequestDefault catalogsFeedsCreateRequestDefaultLocale3 = new OASCatalogsFeedsCreateRequestDefault();
        OASCatalogsFeedsCreateRequestDefault catalogsFeedsCreateRequestDefaultLocale4 = new OASCatalogsFeedsCreateRequestDefault();

        System.assert(catalogsFeedsCreateRequestDefaultLocale1.equals(catalogsFeedsCreateRequestDefaultLocale2));
        System.assert(catalogsFeedsCreateRequestDefaultLocale3.equals(catalogsFeedsCreateRequestDefaultLocale4));
        System.assertEquals(catalogsFeedsCreateRequestDefaultLocale1.hashCode(), catalogsFeedsCreateRequestDefaultLocale2.hashCode());
        System.assertEquals(catalogsFeedsCreateRequestDefaultLocale3.hashCode(), catalogsFeedsCreateRequestDefaultLocale4.hashCode());
    }
}
