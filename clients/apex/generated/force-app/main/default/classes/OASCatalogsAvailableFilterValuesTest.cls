@isTest
private class OASCatalogsAvailableFilterValuesTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsAvailableFilterValues catalogsAvailableFilterValues1 = OASCatalogsAvailableFilterValues.getExample();
        OASCatalogsAvailableFilterValues catalogsAvailableFilterValues2 = catalogsAvailableFilterValues1;
        OASCatalogsAvailableFilterValues catalogsAvailableFilterValues3 = new OASCatalogsAvailableFilterValues();
        OASCatalogsAvailableFilterValues catalogsAvailableFilterValues4 = catalogsAvailableFilterValues3;

        System.assert(catalogsAvailableFilterValues1.equals(catalogsAvailableFilterValues2));
        System.assert(catalogsAvailableFilterValues2.equals(catalogsAvailableFilterValues1));
        System.assert(catalogsAvailableFilterValues1.equals(catalogsAvailableFilterValues1));
        System.assert(catalogsAvailableFilterValues3.equals(catalogsAvailableFilterValues4));
        System.assert(catalogsAvailableFilterValues4.equals(catalogsAvailableFilterValues3));
        System.assert(catalogsAvailableFilterValues3.equals(catalogsAvailableFilterValues3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsAvailableFilterValues catalogsAvailableFilterValues1 = OASCatalogsAvailableFilterValues.getExample();
        OASCatalogsAvailableFilterValues catalogsAvailableFilterValues2 = OASCatalogsAvailableFilterValues.getExample();
        OASCatalogsAvailableFilterValues catalogsAvailableFilterValues3 = new OASCatalogsAvailableFilterValues();
        OASCatalogsAvailableFilterValues catalogsAvailableFilterValues4 = new OASCatalogsAvailableFilterValues();

        System.assert(catalogsAvailableFilterValues1.equals(catalogsAvailableFilterValues2));
        System.assert(catalogsAvailableFilterValues2.equals(catalogsAvailableFilterValues1));
        System.assert(catalogsAvailableFilterValues3.equals(catalogsAvailableFilterValues4));
        System.assert(catalogsAvailableFilterValues4.equals(catalogsAvailableFilterValues3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsAvailableFilterValues catalogsAvailableFilterValues1 = OASCatalogsAvailableFilterValues.getExample();
        OASCatalogsAvailableFilterValues catalogsAvailableFilterValues2 = new OASCatalogsAvailableFilterValues();

        System.assertEquals(false, catalogsAvailableFilterValues1.equals('foo'));
        System.assertEquals(false, catalogsAvailableFilterValues2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsAvailableFilterValues catalogsAvailableFilterValues1 = OASCatalogsAvailableFilterValues.getExample();
        OASCatalogsAvailableFilterValues catalogsAvailableFilterValues2 = new OASCatalogsAvailableFilterValues();
        OASCatalogsAvailableFilterValues catalogsAvailableFilterValues3;

        System.assertEquals(false, catalogsAvailableFilterValues1.equals(catalogsAvailableFilterValues3));
        System.assertEquals(false, catalogsAvailableFilterValues2.equals(catalogsAvailableFilterValues3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsAvailableFilterValues catalogsAvailableFilterValues1 = OASCatalogsAvailableFilterValues.getExample();
        OASCatalogsAvailableFilterValues catalogsAvailableFilterValues2 = new OASCatalogsAvailableFilterValues();

        System.assertEquals(catalogsAvailableFilterValues1.hashCode(), catalogsAvailableFilterValues1.hashCode());
        System.assertEquals(catalogsAvailableFilterValues2.hashCode(), catalogsAvailableFilterValues2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsAvailableFilterValues catalogsAvailableFilterValues1 = OASCatalogsAvailableFilterValues.getExample();
        OASCatalogsAvailableFilterValues catalogsAvailableFilterValues2 = OASCatalogsAvailableFilterValues.getExample();
        OASCatalogsAvailableFilterValues catalogsAvailableFilterValues3 = new OASCatalogsAvailableFilterValues();
        OASCatalogsAvailableFilterValues catalogsAvailableFilterValues4 = new OASCatalogsAvailableFilterValues();

        System.assert(catalogsAvailableFilterValues1.equals(catalogsAvailableFilterValues2));
        System.assert(catalogsAvailableFilterValues3.equals(catalogsAvailableFilterValues4));
        System.assertEquals(catalogsAvailableFilterValues1.hashCode(), catalogsAvailableFilterValues2.hashCode());
        System.assertEquals(catalogsAvailableFilterValues3.hashCode(), catalogsAvailableFilterValues4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsAvailableFilterValues catalogsAvailableFilterValues = new OASCatalogsAvailableFilterValues();
        Map<String, String> x-property-mappings = catalogsAvailableFilterValues.getx-property-mappings();
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
        System.assertEquals('filterValues', x-property-mappings.get('filter_values'));
    }
}
