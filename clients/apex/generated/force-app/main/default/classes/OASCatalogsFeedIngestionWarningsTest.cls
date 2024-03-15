@isTest
private class OASCatalogsFeedIngestionWarningsTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsFeedIngestionWarnings catalogsFeedIngestionWarnings1 = OASCatalogsFeedIngestionWarnings.getExample();
        OASCatalogsFeedIngestionWarnings catalogsFeedIngestionWarnings2 = catalogsFeedIngestionWarnings1;
        OASCatalogsFeedIngestionWarnings catalogsFeedIngestionWarnings3 = new OASCatalogsFeedIngestionWarnings();
        OASCatalogsFeedIngestionWarnings catalogsFeedIngestionWarnings4 = catalogsFeedIngestionWarnings3;

        System.assert(catalogsFeedIngestionWarnings1.equals(catalogsFeedIngestionWarnings2));
        System.assert(catalogsFeedIngestionWarnings2.equals(catalogsFeedIngestionWarnings1));
        System.assert(catalogsFeedIngestionWarnings1.equals(catalogsFeedIngestionWarnings1));
        System.assert(catalogsFeedIngestionWarnings3.equals(catalogsFeedIngestionWarnings4));
        System.assert(catalogsFeedIngestionWarnings4.equals(catalogsFeedIngestionWarnings3));
        System.assert(catalogsFeedIngestionWarnings3.equals(catalogsFeedIngestionWarnings3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsFeedIngestionWarnings catalogsFeedIngestionWarnings1 = OASCatalogsFeedIngestionWarnings.getExample();
        OASCatalogsFeedIngestionWarnings catalogsFeedIngestionWarnings2 = OASCatalogsFeedIngestionWarnings.getExample();
        OASCatalogsFeedIngestionWarnings catalogsFeedIngestionWarnings3 = new OASCatalogsFeedIngestionWarnings();
        OASCatalogsFeedIngestionWarnings catalogsFeedIngestionWarnings4 = new OASCatalogsFeedIngestionWarnings();

        System.assert(catalogsFeedIngestionWarnings1.equals(catalogsFeedIngestionWarnings2));
        System.assert(catalogsFeedIngestionWarnings2.equals(catalogsFeedIngestionWarnings1));
        System.assert(catalogsFeedIngestionWarnings3.equals(catalogsFeedIngestionWarnings4));
        System.assert(catalogsFeedIngestionWarnings4.equals(catalogsFeedIngestionWarnings3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsFeedIngestionWarnings catalogsFeedIngestionWarnings1 = OASCatalogsFeedIngestionWarnings.getExample();
        OASCatalogsFeedIngestionWarnings catalogsFeedIngestionWarnings2 = new OASCatalogsFeedIngestionWarnings();

        System.assertEquals(false, catalogsFeedIngestionWarnings1.equals('foo'));
        System.assertEquals(false, catalogsFeedIngestionWarnings2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsFeedIngestionWarnings catalogsFeedIngestionWarnings1 = OASCatalogsFeedIngestionWarnings.getExample();
        OASCatalogsFeedIngestionWarnings catalogsFeedIngestionWarnings2 = new OASCatalogsFeedIngestionWarnings();
        OASCatalogsFeedIngestionWarnings catalogsFeedIngestionWarnings3;

        System.assertEquals(false, catalogsFeedIngestionWarnings1.equals(catalogsFeedIngestionWarnings3));
        System.assertEquals(false, catalogsFeedIngestionWarnings2.equals(catalogsFeedIngestionWarnings3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsFeedIngestionWarnings catalogsFeedIngestionWarnings1 = OASCatalogsFeedIngestionWarnings.getExample();
        OASCatalogsFeedIngestionWarnings catalogsFeedIngestionWarnings2 = new OASCatalogsFeedIngestionWarnings();

        System.assertEquals(catalogsFeedIngestionWarnings1.hashCode(), catalogsFeedIngestionWarnings1.hashCode());
        System.assertEquals(catalogsFeedIngestionWarnings2.hashCode(), catalogsFeedIngestionWarnings2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsFeedIngestionWarnings catalogsFeedIngestionWarnings1 = OASCatalogsFeedIngestionWarnings.getExample();
        OASCatalogsFeedIngestionWarnings catalogsFeedIngestionWarnings2 = OASCatalogsFeedIngestionWarnings.getExample();
        OASCatalogsFeedIngestionWarnings catalogsFeedIngestionWarnings3 = new OASCatalogsFeedIngestionWarnings();
        OASCatalogsFeedIngestionWarnings catalogsFeedIngestionWarnings4 = new OASCatalogsFeedIngestionWarnings();

        System.assert(catalogsFeedIngestionWarnings1.equals(catalogsFeedIngestionWarnings2));
        System.assert(catalogsFeedIngestionWarnings3.equals(catalogsFeedIngestionWarnings4));
        System.assertEquals(catalogsFeedIngestionWarnings1.hashCode(), catalogsFeedIngestionWarnings2.hashCode());
        System.assertEquals(catalogsFeedIngestionWarnings3.hashCode(), catalogsFeedIngestionWarnings4.hashCode());
    }
}
