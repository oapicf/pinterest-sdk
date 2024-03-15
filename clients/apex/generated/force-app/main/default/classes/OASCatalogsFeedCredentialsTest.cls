@isTest
private class OASCatalogsFeedCredentialsTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsFeedCredentials catalogsFeedCredentials1 = OASCatalogsFeedCredentials.getExample();
        OASCatalogsFeedCredentials catalogsFeedCredentials2 = catalogsFeedCredentials1;
        OASCatalogsFeedCredentials catalogsFeedCredentials3 = new OASCatalogsFeedCredentials();
        OASCatalogsFeedCredentials catalogsFeedCredentials4 = catalogsFeedCredentials3;

        System.assert(catalogsFeedCredentials1.equals(catalogsFeedCredentials2));
        System.assert(catalogsFeedCredentials2.equals(catalogsFeedCredentials1));
        System.assert(catalogsFeedCredentials1.equals(catalogsFeedCredentials1));
        System.assert(catalogsFeedCredentials3.equals(catalogsFeedCredentials4));
        System.assert(catalogsFeedCredentials4.equals(catalogsFeedCredentials3));
        System.assert(catalogsFeedCredentials3.equals(catalogsFeedCredentials3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsFeedCredentials catalogsFeedCredentials1 = OASCatalogsFeedCredentials.getExample();
        OASCatalogsFeedCredentials catalogsFeedCredentials2 = OASCatalogsFeedCredentials.getExample();
        OASCatalogsFeedCredentials catalogsFeedCredentials3 = new OASCatalogsFeedCredentials();
        OASCatalogsFeedCredentials catalogsFeedCredentials4 = new OASCatalogsFeedCredentials();

        System.assert(catalogsFeedCredentials1.equals(catalogsFeedCredentials2));
        System.assert(catalogsFeedCredentials2.equals(catalogsFeedCredentials1));
        System.assert(catalogsFeedCredentials3.equals(catalogsFeedCredentials4));
        System.assert(catalogsFeedCredentials4.equals(catalogsFeedCredentials3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsFeedCredentials catalogsFeedCredentials1 = OASCatalogsFeedCredentials.getExample();
        OASCatalogsFeedCredentials catalogsFeedCredentials2 = new OASCatalogsFeedCredentials();

        System.assertEquals(false, catalogsFeedCredentials1.equals('foo'));
        System.assertEquals(false, catalogsFeedCredentials2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsFeedCredentials catalogsFeedCredentials1 = OASCatalogsFeedCredentials.getExample();
        OASCatalogsFeedCredentials catalogsFeedCredentials2 = new OASCatalogsFeedCredentials();
        OASCatalogsFeedCredentials catalogsFeedCredentials3;

        System.assertEquals(false, catalogsFeedCredentials1.equals(catalogsFeedCredentials3));
        System.assertEquals(false, catalogsFeedCredentials2.equals(catalogsFeedCredentials3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsFeedCredentials catalogsFeedCredentials1 = OASCatalogsFeedCredentials.getExample();
        OASCatalogsFeedCredentials catalogsFeedCredentials2 = new OASCatalogsFeedCredentials();

        System.assertEquals(catalogsFeedCredentials1.hashCode(), catalogsFeedCredentials1.hashCode());
        System.assertEquals(catalogsFeedCredentials2.hashCode(), catalogsFeedCredentials2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsFeedCredentials catalogsFeedCredentials1 = OASCatalogsFeedCredentials.getExample();
        OASCatalogsFeedCredentials catalogsFeedCredentials2 = OASCatalogsFeedCredentials.getExample();
        OASCatalogsFeedCredentials catalogsFeedCredentials3 = new OASCatalogsFeedCredentials();
        OASCatalogsFeedCredentials catalogsFeedCredentials4 = new OASCatalogsFeedCredentials();

        System.assert(catalogsFeedCredentials1.equals(catalogsFeedCredentials2));
        System.assert(catalogsFeedCredentials3.equals(catalogsFeedCredentials4));
        System.assertEquals(catalogsFeedCredentials1.hashCode(), catalogsFeedCredentials2.hashCode());
        System.assertEquals(catalogsFeedCredentials3.hashCode(), catalogsFeedCredentials4.hashCode());
    }
}
