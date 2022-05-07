@isTest
private class OASCatalogsFeedIngestionDetailsTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsFeedIngestionDetails catalogsFeedIngestionDetails1 = OASCatalogsFeedIngestionDetails.getExample();
        OASCatalogsFeedIngestionDetails catalogsFeedIngestionDetails2 = catalogsFeedIngestionDetails1;
        OASCatalogsFeedIngestionDetails catalogsFeedIngestionDetails3 = new OASCatalogsFeedIngestionDetails();
        OASCatalogsFeedIngestionDetails catalogsFeedIngestionDetails4 = catalogsFeedIngestionDetails3;

        System.assert(catalogsFeedIngestionDetails1.equals(catalogsFeedIngestionDetails2));
        System.assert(catalogsFeedIngestionDetails2.equals(catalogsFeedIngestionDetails1));
        System.assert(catalogsFeedIngestionDetails1.equals(catalogsFeedIngestionDetails1));
        System.assert(catalogsFeedIngestionDetails3.equals(catalogsFeedIngestionDetails4));
        System.assert(catalogsFeedIngestionDetails4.equals(catalogsFeedIngestionDetails3));
        System.assert(catalogsFeedIngestionDetails3.equals(catalogsFeedIngestionDetails3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsFeedIngestionDetails catalogsFeedIngestionDetails1 = OASCatalogsFeedIngestionDetails.getExample();
        OASCatalogsFeedIngestionDetails catalogsFeedIngestionDetails2 = OASCatalogsFeedIngestionDetails.getExample();
        OASCatalogsFeedIngestionDetails catalogsFeedIngestionDetails3 = new OASCatalogsFeedIngestionDetails();
        OASCatalogsFeedIngestionDetails catalogsFeedIngestionDetails4 = new OASCatalogsFeedIngestionDetails();

        System.assert(catalogsFeedIngestionDetails1.equals(catalogsFeedIngestionDetails2));
        System.assert(catalogsFeedIngestionDetails2.equals(catalogsFeedIngestionDetails1));
        System.assert(catalogsFeedIngestionDetails3.equals(catalogsFeedIngestionDetails4));
        System.assert(catalogsFeedIngestionDetails4.equals(catalogsFeedIngestionDetails3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsFeedIngestionDetails catalogsFeedIngestionDetails1 = OASCatalogsFeedIngestionDetails.getExample();
        OASCatalogsFeedIngestionDetails catalogsFeedIngestionDetails2 = new OASCatalogsFeedIngestionDetails();

        System.assertEquals(false, catalogsFeedIngestionDetails1.equals('foo'));
        System.assertEquals(false, catalogsFeedIngestionDetails2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsFeedIngestionDetails catalogsFeedIngestionDetails1 = OASCatalogsFeedIngestionDetails.getExample();
        OASCatalogsFeedIngestionDetails catalogsFeedIngestionDetails2 = new OASCatalogsFeedIngestionDetails();
        OASCatalogsFeedIngestionDetails catalogsFeedIngestionDetails3;

        System.assertEquals(false, catalogsFeedIngestionDetails1.equals(catalogsFeedIngestionDetails3));
        System.assertEquals(false, catalogsFeedIngestionDetails2.equals(catalogsFeedIngestionDetails3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsFeedIngestionDetails catalogsFeedIngestionDetails1 = OASCatalogsFeedIngestionDetails.getExample();
        OASCatalogsFeedIngestionDetails catalogsFeedIngestionDetails2 = new OASCatalogsFeedIngestionDetails();

        System.assertEquals(catalogsFeedIngestionDetails1.hashCode(), catalogsFeedIngestionDetails1.hashCode());
        System.assertEquals(catalogsFeedIngestionDetails2.hashCode(), catalogsFeedIngestionDetails2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsFeedIngestionDetails catalogsFeedIngestionDetails1 = OASCatalogsFeedIngestionDetails.getExample();
        OASCatalogsFeedIngestionDetails catalogsFeedIngestionDetails2 = OASCatalogsFeedIngestionDetails.getExample();
        OASCatalogsFeedIngestionDetails catalogsFeedIngestionDetails3 = new OASCatalogsFeedIngestionDetails();
        OASCatalogsFeedIngestionDetails catalogsFeedIngestionDetails4 = new OASCatalogsFeedIngestionDetails();

        System.assert(catalogsFeedIngestionDetails1.equals(catalogsFeedIngestionDetails2));
        System.assert(catalogsFeedIngestionDetails3.equals(catalogsFeedIngestionDetails4));
        System.assertEquals(catalogsFeedIngestionDetails1.hashCode(), catalogsFeedIngestionDetails2.hashCode());
        System.assertEquals(catalogsFeedIngestionDetails3.hashCode(), catalogsFeedIngestionDetails4.hashCode());
    }
}
