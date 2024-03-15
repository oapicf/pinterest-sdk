@isTest
private class OASCatalogsFeedValidationErrorsTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsFeedValidationErrors catalogsFeedValidationErrors1 = OASCatalogsFeedValidationErrors.getExample();
        OASCatalogsFeedValidationErrors catalogsFeedValidationErrors2 = catalogsFeedValidationErrors1;
        OASCatalogsFeedValidationErrors catalogsFeedValidationErrors3 = new OASCatalogsFeedValidationErrors();
        OASCatalogsFeedValidationErrors catalogsFeedValidationErrors4 = catalogsFeedValidationErrors3;

        System.assert(catalogsFeedValidationErrors1.equals(catalogsFeedValidationErrors2));
        System.assert(catalogsFeedValidationErrors2.equals(catalogsFeedValidationErrors1));
        System.assert(catalogsFeedValidationErrors1.equals(catalogsFeedValidationErrors1));
        System.assert(catalogsFeedValidationErrors3.equals(catalogsFeedValidationErrors4));
        System.assert(catalogsFeedValidationErrors4.equals(catalogsFeedValidationErrors3));
        System.assert(catalogsFeedValidationErrors3.equals(catalogsFeedValidationErrors3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsFeedValidationErrors catalogsFeedValidationErrors1 = OASCatalogsFeedValidationErrors.getExample();
        OASCatalogsFeedValidationErrors catalogsFeedValidationErrors2 = OASCatalogsFeedValidationErrors.getExample();
        OASCatalogsFeedValidationErrors catalogsFeedValidationErrors3 = new OASCatalogsFeedValidationErrors();
        OASCatalogsFeedValidationErrors catalogsFeedValidationErrors4 = new OASCatalogsFeedValidationErrors();

        System.assert(catalogsFeedValidationErrors1.equals(catalogsFeedValidationErrors2));
        System.assert(catalogsFeedValidationErrors2.equals(catalogsFeedValidationErrors1));
        System.assert(catalogsFeedValidationErrors3.equals(catalogsFeedValidationErrors4));
        System.assert(catalogsFeedValidationErrors4.equals(catalogsFeedValidationErrors3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsFeedValidationErrors catalogsFeedValidationErrors1 = OASCatalogsFeedValidationErrors.getExample();
        OASCatalogsFeedValidationErrors catalogsFeedValidationErrors2 = new OASCatalogsFeedValidationErrors();

        System.assertEquals(false, catalogsFeedValidationErrors1.equals('foo'));
        System.assertEquals(false, catalogsFeedValidationErrors2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsFeedValidationErrors catalogsFeedValidationErrors1 = OASCatalogsFeedValidationErrors.getExample();
        OASCatalogsFeedValidationErrors catalogsFeedValidationErrors2 = new OASCatalogsFeedValidationErrors();
        OASCatalogsFeedValidationErrors catalogsFeedValidationErrors3;

        System.assertEquals(false, catalogsFeedValidationErrors1.equals(catalogsFeedValidationErrors3));
        System.assertEquals(false, catalogsFeedValidationErrors2.equals(catalogsFeedValidationErrors3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsFeedValidationErrors catalogsFeedValidationErrors1 = OASCatalogsFeedValidationErrors.getExample();
        OASCatalogsFeedValidationErrors catalogsFeedValidationErrors2 = new OASCatalogsFeedValidationErrors();

        System.assertEquals(catalogsFeedValidationErrors1.hashCode(), catalogsFeedValidationErrors1.hashCode());
        System.assertEquals(catalogsFeedValidationErrors2.hashCode(), catalogsFeedValidationErrors2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsFeedValidationErrors catalogsFeedValidationErrors1 = OASCatalogsFeedValidationErrors.getExample();
        OASCatalogsFeedValidationErrors catalogsFeedValidationErrors2 = OASCatalogsFeedValidationErrors.getExample();
        OASCatalogsFeedValidationErrors catalogsFeedValidationErrors3 = new OASCatalogsFeedValidationErrors();
        OASCatalogsFeedValidationErrors catalogsFeedValidationErrors4 = new OASCatalogsFeedValidationErrors();

        System.assert(catalogsFeedValidationErrors1.equals(catalogsFeedValidationErrors2));
        System.assert(catalogsFeedValidationErrors3.equals(catalogsFeedValidationErrors4));
        System.assertEquals(catalogsFeedValidationErrors1.hashCode(), catalogsFeedValidationErrors2.hashCode());
        System.assertEquals(catalogsFeedValidationErrors3.hashCode(), catalogsFeedValidationErrors4.hashCode());
    }
}
