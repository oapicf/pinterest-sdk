@isTest
private class OASCatalogsItemValidationDetailsTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsItemValidationDetails catalogsItemValidationDetails1 = OASCatalogsItemValidationDetails.getExample();
        OASCatalogsItemValidationDetails catalogsItemValidationDetails2 = catalogsItemValidationDetails1;
        OASCatalogsItemValidationDetails catalogsItemValidationDetails3 = new OASCatalogsItemValidationDetails();
        OASCatalogsItemValidationDetails catalogsItemValidationDetails4 = catalogsItemValidationDetails3;

        System.assert(catalogsItemValidationDetails1.equals(catalogsItemValidationDetails2));
        System.assert(catalogsItemValidationDetails2.equals(catalogsItemValidationDetails1));
        System.assert(catalogsItemValidationDetails1.equals(catalogsItemValidationDetails1));
        System.assert(catalogsItemValidationDetails3.equals(catalogsItemValidationDetails4));
        System.assert(catalogsItemValidationDetails4.equals(catalogsItemValidationDetails3));
        System.assert(catalogsItemValidationDetails3.equals(catalogsItemValidationDetails3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsItemValidationDetails catalogsItemValidationDetails1 = OASCatalogsItemValidationDetails.getExample();
        OASCatalogsItemValidationDetails catalogsItemValidationDetails2 = OASCatalogsItemValidationDetails.getExample();
        OASCatalogsItemValidationDetails catalogsItemValidationDetails3 = new OASCatalogsItemValidationDetails();
        OASCatalogsItemValidationDetails catalogsItemValidationDetails4 = new OASCatalogsItemValidationDetails();

        System.assert(catalogsItemValidationDetails1.equals(catalogsItemValidationDetails2));
        System.assert(catalogsItemValidationDetails2.equals(catalogsItemValidationDetails1));
        System.assert(catalogsItemValidationDetails3.equals(catalogsItemValidationDetails4));
        System.assert(catalogsItemValidationDetails4.equals(catalogsItemValidationDetails3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsItemValidationDetails catalogsItemValidationDetails1 = OASCatalogsItemValidationDetails.getExample();
        OASCatalogsItemValidationDetails catalogsItemValidationDetails2 = new OASCatalogsItemValidationDetails();

        System.assertEquals(false, catalogsItemValidationDetails1.equals('foo'));
        System.assertEquals(false, catalogsItemValidationDetails2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsItemValidationDetails catalogsItemValidationDetails1 = OASCatalogsItemValidationDetails.getExample();
        OASCatalogsItemValidationDetails catalogsItemValidationDetails2 = new OASCatalogsItemValidationDetails();
        OASCatalogsItemValidationDetails catalogsItemValidationDetails3;

        System.assertEquals(false, catalogsItemValidationDetails1.equals(catalogsItemValidationDetails3));
        System.assertEquals(false, catalogsItemValidationDetails2.equals(catalogsItemValidationDetails3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsItemValidationDetails catalogsItemValidationDetails1 = OASCatalogsItemValidationDetails.getExample();
        OASCatalogsItemValidationDetails catalogsItemValidationDetails2 = new OASCatalogsItemValidationDetails();

        System.assertEquals(catalogsItemValidationDetails1.hashCode(), catalogsItemValidationDetails1.hashCode());
        System.assertEquals(catalogsItemValidationDetails2.hashCode(), catalogsItemValidationDetails2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsItemValidationDetails catalogsItemValidationDetails1 = OASCatalogsItemValidationDetails.getExample();
        OASCatalogsItemValidationDetails catalogsItemValidationDetails2 = OASCatalogsItemValidationDetails.getExample();
        OASCatalogsItemValidationDetails catalogsItemValidationDetails3 = new OASCatalogsItemValidationDetails();
        OASCatalogsItemValidationDetails catalogsItemValidationDetails4 = new OASCatalogsItemValidationDetails();

        System.assert(catalogsItemValidationDetails1.equals(catalogsItemValidationDetails2));
        System.assert(catalogsItemValidationDetails3.equals(catalogsItemValidationDetails4));
        System.assertEquals(catalogsItemValidationDetails1.hashCode(), catalogsItemValidationDetails2.hashCode());
        System.assertEquals(catalogsItemValidationDetails3.hashCode(), catalogsItemValidationDetails4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsItemValidationDetails catalogsItemValidationDetails = new OASCatalogsItemValidationDetails();
        Map<String, String> x-property-mappings = catalogsItemValidationDetails.getx-property-mappings();
        System.assertEquals('attributeName', x-property-mappings.get('attribute_name'));
        System.assertEquals('providedValue', x-property-mappings.get('provided_value'));
    }
}
