@isTest
private class OASCatalogsRetailAvailableFilterValuTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsRetailAvailableFilterValu catalogsRetailAvailableFilterValues1 = OASCatalogsRetailAvailableFilterValu.getExample();
        OASCatalogsRetailAvailableFilterValu catalogsRetailAvailableFilterValues2 = catalogsRetailAvailableFilterValues1;
        OASCatalogsRetailAvailableFilterValu catalogsRetailAvailableFilterValues3 = new OASCatalogsRetailAvailableFilterValu();
        OASCatalogsRetailAvailableFilterValu catalogsRetailAvailableFilterValues4 = catalogsRetailAvailableFilterValues3;

        System.assert(catalogsRetailAvailableFilterValues1.equals(catalogsRetailAvailableFilterValues2));
        System.assert(catalogsRetailAvailableFilterValues2.equals(catalogsRetailAvailableFilterValues1));
        System.assert(catalogsRetailAvailableFilterValues1.equals(catalogsRetailAvailableFilterValues1));
        System.assert(catalogsRetailAvailableFilterValues3.equals(catalogsRetailAvailableFilterValues4));
        System.assert(catalogsRetailAvailableFilterValues4.equals(catalogsRetailAvailableFilterValues3));
        System.assert(catalogsRetailAvailableFilterValues3.equals(catalogsRetailAvailableFilterValues3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsRetailAvailableFilterValu catalogsRetailAvailableFilterValues1 = OASCatalogsRetailAvailableFilterValu.getExample();
        OASCatalogsRetailAvailableFilterValu catalogsRetailAvailableFilterValues2 = OASCatalogsRetailAvailableFilterValu.getExample();
        OASCatalogsRetailAvailableFilterValu catalogsRetailAvailableFilterValues3 = new OASCatalogsRetailAvailableFilterValu();
        OASCatalogsRetailAvailableFilterValu catalogsRetailAvailableFilterValues4 = new OASCatalogsRetailAvailableFilterValu();

        System.assert(catalogsRetailAvailableFilterValues1.equals(catalogsRetailAvailableFilterValues2));
        System.assert(catalogsRetailAvailableFilterValues2.equals(catalogsRetailAvailableFilterValues1));
        System.assert(catalogsRetailAvailableFilterValues3.equals(catalogsRetailAvailableFilterValues4));
        System.assert(catalogsRetailAvailableFilterValues4.equals(catalogsRetailAvailableFilterValues3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsRetailAvailableFilterValu catalogsRetailAvailableFilterValues1 = OASCatalogsRetailAvailableFilterValu.getExample();
        OASCatalogsRetailAvailableFilterValu catalogsRetailAvailableFilterValues2 = new OASCatalogsRetailAvailableFilterValu();

        System.assertEquals(false, catalogsRetailAvailableFilterValues1.equals('foo'));
        System.assertEquals(false, catalogsRetailAvailableFilterValues2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsRetailAvailableFilterValu catalogsRetailAvailableFilterValues1 = OASCatalogsRetailAvailableFilterValu.getExample();
        OASCatalogsRetailAvailableFilterValu catalogsRetailAvailableFilterValues2 = new OASCatalogsRetailAvailableFilterValu();
        OASCatalogsRetailAvailableFilterValu catalogsRetailAvailableFilterValues3;

        System.assertEquals(false, catalogsRetailAvailableFilterValues1.equals(catalogsRetailAvailableFilterValues3));
        System.assertEquals(false, catalogsRetailAvailableFilterValues2.equals(catalogsRetailAvailableFilterValues3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsRetailAvailableFilterValu catalogsRetailAvailableFilterValues1 = OASCatalogsRetailAvailableFilterValu.getExample();
        OASCatalogsRetailAvailableFilterValu catalogsRetailAvailableFilterValues2 = new OASCatalogsRetailAvailableFilterValu();

        System.assertEquals(catalogsRetailAvailableFilterValues1.hashCode(), catalogsRetailAvailableFilterValues1.hashCode());
        System.assertEquals(catalogsRetailAvailableFilterValues2.hashCode(), catalogsRetailAvailableFilterValues2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsRetailAvailableFilterValu catalogsRetailAvailableFilterValues1 = OASCatalogsRetailAvailableFilterValu.getExample();
        OASCatalogsRetailAvailableFilterValu catalogsRetailAvailableFilterValues2 = OASCatalogsRetailAvailableFilterValu.getExample();
        OASCatalogsRetailAvailableFilterValu catalogsRetailAvailableFilterValues3 = new OASCatalogsRetailAvailableFilterValu();
        OASCatalogsRetailAvailableFilterValu catalogsRetailAvailableFilterValues4 = new OASCatalogsRetailAvailableFilterValu();

        System.assert(catalogsRetailAvailableFilterValues1.equals(catalogsRetailAvailableFilterValues2));
        System.assert(catalogsRetailAvailableFilterValues3.equals(catalogsRetailAvailableFilterValues4));
        System.assertEquals(catalogsRetailAvailableFilterValues1.hashCode(), catalogsRetailAvailableFilterValues2.hashCode());
        System.assertEquals(catalogsRetailAvailableFilterValues3.hashCode(), catalogsRetailAvailableFilterValues4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsRetailAvailableFilterValu catalogsRetailAvailableFilterValues = new OASCatalogsRetailAvailableFilterValu();
        Map<String, String> x-property-mappings = catalogsRetailAvailableFilterValues.getx-property-mappings();
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
        System.assertEquals('filterValues', x-property-mappings.get('filter_values'));
    }
}
