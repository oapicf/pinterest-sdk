@isTest
private class OASCatalogsFeedValidationDetailsTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsFeedValidationDetails catalogsFeedValidationDetails1 = OASCatalogsFeedValidationDetails.getExample();
        OASCatalogsFeedValidationDetails catalogsFeedValidationDetails2 = catalogsFeedValidationDetails1;
        OASCatalogsFeedValidationDetails catalogsFeedValidationDetails3 = new OASCatalogsFeedValidationDetails();
        OASCatalogsFeedValidationDetails catalogsFeedValidationDetails4 = catalogsFeedValidationDetails3;

        System.assert(catalogsFeedValidationDetails1.equals(catalogsFeedValidationDetails2));
        System.assert(catalogsFeedValidationDetails2.equals(catalogsFeedValidationDetails1));
        System.assert(catalogsFeedValidationDetails1.equals(catalogsFeedValidationDetails1));
        System.assert(catalogsFeedValidationDetails3.equals(catalogsFeedValidationDetails4));
        System.assert(catalogsFeedValidationDetails4.equals(catalogsFeedValidationDetails3));
        System.assert(catalogsFeedValidationDetails3.equals(catalogsFeedValidationDetails3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsFeedValidationDetails catalogsFeedValidationDetails1 = OASCatalogsFeedValidationDetails.getExample();
        OASCatalogsFeedValidationDetails catalogsFeedValidationDetails2 = OASCatalogsFeedValidationDetails.getExample();
        OASCatalogsFeedValidationDetails catalogsFeedValidationDetails3 = new OASCatalogsFeedValidationDetails();
        OASCatalogsFeedValidationDetails catalogsFeedValidationDetails4 = new OASCatalogsFeedValidationDetails();

        System.assert(catalogsFeedValidationDetails1.equals(catalogsFeedValidationDetails2));
        System.assert(catalogsFeedValidationDetails2.equals(catalogsFeedValidationDetails1));
        System.assert(catalogsFeedValidationDetails3.equals(catalogsFeedValidationDetails4));
        System.assert(catalogsFeedValidationDetails4.equals(catalogsFeedValidationDetails3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsFeedValidationDetails catalogsFeedValidationDetails1 = OASCatalogsFeedValidationDetails.getExample();
        OASCatalogsFeedValidationDetails catalogsFeedValidationDetails2 = new OASCatalogsFeedValidationDetails();

        System.assertEquals(false, catalogsFeedValidationDetails1.equals('foo'));
        System.assertEquals(false, catalogsFeedValidationDetails2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsFeedValidationDetails catalogsFeedValidationDetails1 = OASCatalogsFeedValidationDetails.getExample();
        OASCatalogsFeedValidationDetails catalogsFeedValidationDetails2 = new OASCatalogsFeedValidationDetails();
        OASCatalogsFeedValidationDetails catalogsFeedValidationDetails3;

        System.assertEquals(false, catalogsFeedValidationDetails1.equals(catalogsFeedValidationDetails3));
        System.assertEquals(false, catalogsFeedValidationDetails2.equals(catalogsFeedValidationDetails3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsFeedValidationDetails catalogsFeedValidationDetails1 = OASCatalogsFeedValidationDetails.getExample();
        OASCatalogsFeedValidationDetails catalogsFeedValidationDetails2 = new OASCatalogsFeedValidationDetails();

        System.assertEquals(catalogsFeedValidationDetails1.hashCode(), catalogsFeedValidationDetails1.hashCode());
        System.assertEquals(catalogsFeedValidationDetails2.hashCode(), catalogsFeedValidationDetails2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsFeedValidationDetails catalogsFeedValidationDetails1 = OASCatalogsFeedValidationDetails.getExample();
        OASCatalogsFeedValidationDetails catalogsFeedValidationDetails2 = OASCatalogsFeedValidationDetails.getExample();
        OASCatalogsFeedValidationDetails catalogsFeedValidationDetails3 = new OASCatalogsFeedValidationDetails();
        OASCatalogsFeedValidationDetails catalogsFeedValidationDetails4 = new OASCatalogsFeedValidationDetails();

        System.assert(catalogsFeedValidationDetails1.equals(catalogsFeedValidationDetails2));
        System.assert(catalogsFeedValidationDetails3.equals(catalogsFeedValidationDetails4));
        System.assertEquals(catalogsFeedValidationDetails1.hashCode(), catalogsFeedValidationDetails2.hashCode());
        System.assertEquals(catalogsFeedValidationDetails3.hashCode(), catalogsFeedValidationDetails4.hashCode());
    }
}
