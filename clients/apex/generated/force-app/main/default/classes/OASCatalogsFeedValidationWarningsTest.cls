@isTest
private class OASCatalogsFeedValidationWarningsTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsFeedValidationWarnings catalogsFeedValidationWarnings1 = OASCatalogsFeedValidationWarnings.getExample();
        OASCatalogsFeedValidationWarnings catalogsFeedValidationWarnings2 = catalogsFeedValidationWarnings1;
        OASCatalogsFeedValidationWarnings catalogsFeedValidationWarnings3 = new OASCatalogsFeedValidationWarnings();
        OASCatalogsFeedValidationWarnings catalogsFeedValidationWarnings4 = catalogsFeedValidationWarnings3;

        System.assert(catalogsFeedValidationWarnings1.equals(catalogsFeedValidationWarnings2));
        System.assert(catalogsFeedValidationWarnings2.equals(catalogsFeedValidationWarnings1));
        System.assert(catalogsFeedValidationWarnings1.equals(catalogsFeedValidationWarnings1));
        System.assert(catalogsFeedValidationWarnings3.equals(catalogsFeedValidationWarnings4));
        System.assert(catalogsFeedValidationWarnings4.equals(catalogsFeedValidationWarnings3));
        System.assert(catalogsFeedValidationWarnings3.equals(catalogsFeedValidationWarnings3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsFeedValidationWarnings catalogsFeedValidationWarnings1 = OASCatalogsFeedValidationWarnings.getExample();
        OASCatalogsFeedValidationWarnings catalogsFeedValidationWarnings2 = OASCatalogsFeedValidationWarnings.getExample();
        OASCatalogsFeedValidationWarnings catalogsFeedValidationWarnings3 = new OASCatalogsFeedValidationWarnings();
        OASCatalogsFeedValidationWarnings catalogsFeedValidationWarnings4 = new OASCatalogsFeedValidationWarnings();

        System.assert(catalogsFeedValidationWarnings1.equals(catalogsFeedValidationWarnings2));
        System.assert(catalogsFeedValidationWarnings2.equals(catalogsFeedValidationWarnings1));
        System.assert(catalogsFeedValidationWarnings3.equals(catalogsFeedValidationWarnings4));
        System.assert(catalogsFeedValidationWarnings4.equals(catalogsFeedValidationWarnings3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsFeedValidationWarnings catalogsFeedValidationWarnings1 = OASCatalogsFeedValidationWarnings.getExample();
        OASCatalogsFeedValidationWarnings catalogsFeedValidationWarnings2 = new OASCatalogsFeedValidationWarnings();

        System.assertEquals(false, catalogsFeedValidationWarnings1.equals('foo'));
        System.assertEquals(false, catalogsFeedValidationWarnings2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsFeedValidationWarnings catalogsFeedValidationWarnings1 = OASCatalogsFeedValidationWarnings.getExample();
        OASCatalogsFeedValidationWarnings catalogsFeedValidationWarnings2 = new OASCatalogsFeedValidationWarnings();
        OASCatalogsFeedValidationWarnings catalogsFeedValidationWarnings3;

        System.assertEquals(false, catalogsFeedValidationWarnings1.equals(catalogsFeedValidationWarnings3));
        System.assertEquals(false, catalogsFeedValidationWarnings2.equals(catalogsFeedValidationWarnings3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsFeedValidationWarnings catalogsFeedValidationWarnings1 = OASCatalogsFeedValidationWarnings.getExample();
        OASCatalogsFeedValidationWarnings catalogsFeedValidationWarnings2 = new OASCatalogsFeedValidationWarnings();

        System.assertEquals(catalogsFeedValidationWarnings1.hashCode(), catalogsFeedValidationWarnings1.hashCode());
        System.assertEquals(catalogsFeedValidationWarnings2.hashCode(), catalogsFeedValidationWarnings2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsFeedValidationWarnings catalogsFeedValidationWarnings1 = OASCatalogsFeedValidationWarnings.getExample();
        OASCatalogsFeedValidationWarnings catalogsFeedValidationWarnings2 = OASCatalogsFeedValidationWarnings.getExample();
        OASCatalogsFeedValidationWarnings catalogsFeedValidationWarnings3 = new OASCatalogsFeedValidationWarnings();
        OASCatalogsFeedValidationWarnings catalogsFeedValidationWarnings4 = new OASCatalogsFeedValidationWarnings();

        System.assert(catalogsFeedValidationWarnings1.equals(catalogsFeedValidationWarnings2));
        System.assert(catalogsFeedValidationWarnings3.equals(catalogsFeedValidationWarnings4));
        System.assertEquals(catalogsFeedValidationWarnings1.hashCode(), catalogsFeedValidationWarnings2.hashCode());
        System.assertEquals(catalogsFeedValidationWarnings3.hashCode(), catalogsFeedValidationWarnings4.hashCode());
    }
}
