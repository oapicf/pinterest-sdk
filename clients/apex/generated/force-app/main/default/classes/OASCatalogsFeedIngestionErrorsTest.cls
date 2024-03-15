@isTest
private class OASCatalogsFeedIngestionErrorsTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsFeedIngestionErrors catalogsFeedIngestionErrors1 = OASCatalogsFeedIngestionErrors.getExample();
        OASCatalogsFeedIngestionErrors catalogsFeedIngestionErrors2 = catalogsFeedIngestionErrors1;
        OASCatalogsFeedIngestionErrors catalogsFeedIngestionErrors3 = new OASCatalogsFeedIngestionErrors();
        OASCatalogsFeedIngestionErrors catalogsFeedIngestionErrors4 = catalogsFeedIngestionErrors3;

        System.assert(catalogsFeedIngestionErrors1.equals(catalogsFeedIngestionErrors2));
        System.assert(catalogsFeedIngestionErrors2.equals(catalogsFeedIngestionErrors1));
        System.assert(catalogsFeedIngestionErrors1.equals(catalogsFeedIngestionErrors1));
        System.assert(catalogsFeedIngestionErrors3.equals(catalogsFeedIngestionErrors4));
        System.assert(catalogsFeedIngestionErrors4.equals(catalogsFeedIngestionErrors3));
        System.assert(catalogsFeedIngestionErrors3.equals(catalogsFeedIngestionErrors3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsFeedIngestionErrors catalogsFeedIngestionErrors1 = OASCatalogsFeedIngestionErrors.getExample();
        OASCatalogsFeedIngestionErrors catalogsFeedIngestionErrors2 = OASCatalogsFeedIngestionErrors.getExample();
        OASCatalogsFeedIngestionErrors catalogsFeedIngestionErrors3 = new OASCatalogsFeedIngestionErrors();
        OASCatalogsFeedIngestionErrors catalogsFeedIngestionErrors4 = new OASCatalogsFeedIngestionErrors();

        System.assert(catalogsFeedIngestionErrors1.equals(catalogsFeedIngestionErrors2));
        System.assert(catalogsFeedIngestionErrors2.equals(catalogsFeedIngestionErrors1));
        System.assert(catalogsFeedIngestionErrors3.equals(catalogsFeedIngestionErrors4));
        System.assert(catalogsFeedIngestionErrors4.equals(catalogsFeedIngestionErrors3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsFeedIngestionErrors catalogsFeedIngestionErrors1 = OASCatalogsFeedIngestionErrors.getExample();
        OASCatalogsFeedIngestionErrors catalogsFeedIngestionErrors2 = new OASCatalogsFeedIngestionErrors();

        System.assertEquals(false, catalogsFeedIngestionErrors1.equals('foo'));
        System.assertEquals(false, catalogsFeedIngestionErrors2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsFeedIngestionErrors catalogsFeedIngestionErrors1 = OASCatalogsFeedIngestionErrors.getExample();
        OASCatalogsFeedIngestionErrors catalogsFeedIngestionErrors2 = new OASCatalogsFeedIngestionErrors();
        OASCatalogsFeedIngestionErrors catalogsFeedIngestionErrors3;

        System.assertEquals(false, catalogsFeedIngestionErrors1.equals(catalogsFeedIngestionErrors3));
        System.assertEquals(false, catalogsFeedIngestionErrors2.equals(catalogsFeedIngestionErrors3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsFeedIngestionErrors catalogsFeedIngestionErrors1 = OASCatalogsFeedIngestionErrors.getExample();
        OASCatalogsFeedIngestionErrors catalogsFeedIngestionErrors2 = new OASCatalogsFeedIngestionErrors();

        System.assertEquals(catalogsFeedIngestionErrors1.hashCode(), catalogsFeedIngestionErrors1.hashCode());
        System.assertEquals(catalogsFeedIngestionErrors2.hashCode(), catalogsFeedIngestionErrors2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsFeedIngestionErrors catalogsFeedIngestionErrors1 = OASCatalogsFeedIngestionErrors.getExample();
        OASCatalogsFeedIngestionErrors catalogsFeedIngestionErrors2 = OASCatalogsFeedIngestionErrors.getExample();
        OASCatalogsFeedIngestionErrors catalogsFeedIngestionErrors3 = new OASCatalogsFeedIngestionErrors();
        OASCatalogsFeedIngestionErrors catalogsFeedIngestionErrors4 = new OASCatalogsFeedIngestionErrors();

        System.assert(catalogsFeedIngestionErrors1.equals(catalogsFeedIngestionErrors2));
        System.assert(catalogsFeedIngestionErrors3.equals(catalogsFeedIngestionErrors4));
        System.assertEquals(catalogsFeedIngestionErrors1.hashCode(), catalogsFeedIngestionErrors2.hashCode());
        System.assertEquals(catalogsFeedIngestionErrors3.hashCode(), catalogsFeedIngestionErrors4.hashCode());
    }
}
