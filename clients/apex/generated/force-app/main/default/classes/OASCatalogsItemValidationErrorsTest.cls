@isTest
private class OASCatalogsItemValidationErrorsTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsItemValidationErrors catalogsItemValidationErrors1 = OASCatalogsItemValidationErrors.getExample();
        OASCatalogsItemValidationErrors catalogsItemValidationErrors2 = catalogsItemValidationErrors1;
        OASCatalogsItemValidationErrors catalogsItemValidationErrors3 = new OASCatalogsItemValidationErrors();
        OASCatalogsItemValidationErrors catalogsItemValidationErrors4 = catalogsItemValidationErrors3;

        System.assert(catalogsItemValidationErrors1.equals(catalogsItemValidationErrors2));
        System.assert(catalogsItemValidationErrors2.equals(catalogsItemValidationErrors1));
        System.assert(catalogsItemValidationErrors1.equals(catalogsItemValidationErrors1));
        System.assert(catalogsItemValidationErrors3.equals(catalogsItemValidationErrors4));
        System.assert(catalogsItemValidationErrors4.equals(catalogsItemValidationErrors3));
        System.assert(catalogsItemValidationErrors3.equals(catalogsItemValidationErrors3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsItemValidationErrors catalogsItemValidationErrors1 = OASCatalogsItemValidationErrors.getExample();
        OASCatalogsItemValidationErrors catalogsItemValidationErrors2 = OASCatalogsItemValidationErrors.getExample();
        OASCatalogsItemValidationErrors catalogsItemValidationErrors3 = new OASCatalogsItemValidationErrors();
        OASCatalogsItemValidationErrors catalogsItemValidationErrors4 = new OASCatalogsItemValidationErrors();

        System.assert(catalogsItemValidationErrors1.equals(catalogsItemValidationErrors2));
        System.assert(catalogsItemValidationErrors2.equals(catalogsItemValidationErrors1));
        System.assert(catalogsItemValidationErrors3.equals(catalogsItemValidationErrors4));
        System.assert(catalogsItemValidationErrors4.equals(catalogsItemValidationErrors3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsItemValidationErrors catalogsItemValidationErrors1 = OASCatalogsItemValidationErrors.getExample();
        OASCatalogsItemValidationErrors catalogsItemValidationErrors2 = new OASCatalogsItemValidationErrors();

        System.assertEquals(false, catalogsItemValidationErrors1.equals('foo'));
        System.assertEquals(false, catalogsItemValidationErrors2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsItemValidationErrors catalogsItemValidationErrors1 = OASCatalogsItemValidationErrors.getExample();
        OASCatalogsItemValidationErrors catalogsItemValidationErrors2 = new OASCatalogsItemValidationErrors();
        OASCatalogsItemValidationErrors catalogsItemValidationErrors3;

        System.assertEquals(false, catalogsItemValidationErrors1.equals(catalogsItemValidationErrors3));
        System.assertEquals(false, catalogsItemValidationErrors2.equals(catalogsItemValidationErrors3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsItemValidationErrors catalogsItemValidationErrors1 = OASCatalogsItemValidationErrors.getExample();
        OASCatalogsItemValidationErrors catalogsItemValidationErrors2 = new OASCatalogsItemValidationErrors();

        System.assertEquals(catalogsItemValidationErrors1.hashCode(), catalogsItemValidationErrors1.hashCode());
        System.assertEquals(catalogsItemValidationErrors2.hashCode(), catalogsItemValidationErrors2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsItemValidationErrors catalogsItemValidationErrors1 = OASCatalogsItemValidationErrors.getExample();
        OASCatalogsItemValidationErrors catalogsItemValidationErrors2 = OASCatalogsItemValidationErrors.getExample();
        OASCatalogsItemValidationErrors catalogsItemValidationErrors3 = new OASCatalogsItemValidationErrors();
        OASCatalogsItemValidationErrors catalogsItemValidationErrors4 = new OASCatalogsItemValidationErrors();

        System.assert(catalogsItemValidationErrors1.equals(catalogsItemValidationErrors2));
        System.assert(catalogsItemValidationErrors3.equals(catalogsItemValidationErrors4));
        System.assertEquals(catalogsItemValidationErrors1.hashCode(), catalogsItemValidationErrors2.hashCode());
        System.assertEquals(catalogsItemValidationErrors3.hashCode(), catalogsItemValidationErrors4.hashCode());
    }
}
