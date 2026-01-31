@isTest
private class OASCatalogsHotelAvailableFilterValueTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsHotelAvailableFilterValue catalogsHotelAvailableFilterValues1 = OASCatalogsHotelAvailableFilterValue.getExample();
        OASCatalogsHotelAvailableFilterValue catalogsHotelAvailableFilterValues2 = catalogsHotelAvailableFilterValues1;
        OASCatalogsHotelAvailableFilterValue catalogsHotelAvailableFilterValues3 = new OASCatalogsHotelAvailableFilterValue();
        OASCatalogsHotelAvailableFilterValue catalogsHotelAvailableFilterValues4 = catalogsHotelAvailableFilterValues3;

        System.assert(catalogsHotelAvailableFilterValues1.equals(catalogsHotelAvailableFilterValues2));
        System.assert(catalogsHotelAvailableFilterValues2.equals(catalogsHotelAvailableFilterValues1));
        System.assert(catalogsHotelAvailableFilterValues1.equals(catalogsHotelAvailableFilterValues1));
        System.assert(catalogsHotelAvailableFilterValues3.equals(catalogsHotelAvailableFilterValues4));
        System.assert(catalogsHotelAvailableFilterValues4.equals(catalogsHotelAvailableFilterValues3));
        System.assert(catalogsHotelAvailableFilterValues3.equals(catalogsHotelAvailableFilterValues3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsHotelAvailableFilterValue catalogsHotelAvailableFilterValues1 = OASCatalogsHotelAvailableFilterValue.getExample();
        OASCatalogsHotelAvailableFilterValue catalogsHotelAvailableFilterValues2 = OASCatalogsHotelAvailableFilterValue.getExample();
        OASCatalogsHotelAvailableFilterValue catalogsHotelAvailableFilterValues3 = new OASCatalogsHotelAvailableFilterValue();
        OASCatalogsHotelAvailableFilterValue catalogsHotelAvailableFilterValues4 = new OASCatalogsHotelAvailableFilterValue();

        System.assert(catalogsHotelAvailableFilterValues1.equals(catalogsHotelAvailableFilterValues2));
        System.assert(catalogsHotelAvailableFilterValues2.equals(catalogsHotelAvailableFilterValues1));
        System.assert(catalogsHotelAvailableFilterValues3.equals(catalogsHotelAvailableFilterValues4));
        System.assert(catalogsHotelAvailableFilterValues4.equals(catalogsHotelAvailableFilterValues3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsHotelAvailableFilterValue catalogsHotelAvailableFilterValues1 = OASCatalogsHotelAvailableFilterValue.getExample();
        OASCatalogsHotelAvailableFilterValue catalogsHotelAvailableFilterValues2 = new OASCatalogsHotelAvailableFilterValue();

        System.assertEquals(false, catalogsHotelAvailableFilterValues1.equals('foo'));
        System.assertEquals(false, catalogsHotelAvailableFilterValues2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsHotelAvailableFilterValue catalogsHotelAvailableFilterValues1 = OASCatalogsHotelAvailableFilterValue.getExample();
        OASCatalogsHotelAvailableFilterValue catalogsHotelAvailableFilterValues2 = new OASCatalogsHotelAvailableFilterValue();
        OASCatalogsHotelAvailableFilterValue catalogsHotelAvailableFilterValues3;

        System.assertEquals(false, catalogsHotelAvailableFilterValues1.equals(catalogsHotelAvailableFilterValues3));
        System.assertEquals(false, catalogsHotelAvailableFilterValues2.equals(catalogsHotelAvailableFilterValues3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsHotelAvailableFilterValue catalogsHotelAvailableFilterValues1 = OASCatalogsHotelAvailableFilterValue.getExample();
        OASCatalogsHotelAvailableFilterValue catalogsHotelAvailableFilterValues2 = new OASCatalogsHotelAvailableFilterValue();

        System.assertEquals(catalogsHotelAvailableFilterValues1.hashCode(), catalogsHotelAvailableFilterValues1.hashCode());
        System.assertEquals(catalogsHotelAvailableFilterValues2.hashCode(), catalogsHotelAvailableFilterValues2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsHotelAvailableFilterValue catalogsHotelAvailableFilterValues1 = OASCatalogsHotelAvailableFilterValue.getExample();
        OASCatalogsHotelAvailableFilterValue catalogsHotelAvailableFilterValues2 = OASCatalogsHotelAvailableFilterValue.getExample();
        OASCatalogsHotelAvailableFilterValue catalogsHotelAvailableFilterValues3 = new OASCatalogsHotelAvailableFilterValue();
        OASCatalogsHotelAvailableFilterValue catalogsHotelAvailableFilterValues4 = new OASCatalogsHotelAvailableFilterValue();

        System.assert(catalogsHotelAvailableFilterValues1.equals(catalogsHotelAvailableFilterValues2));
        System.assert(catalogsHotelAvailableFilterValues3.equals(catalogsHotelAvailableFilterValues4));
        System.assertEquals(catalogsHotelAvailableFilterValues1.hashCode(), catalogsHotelAvailableFilterValues2.hashCode());
        System.assertEquals(catalogsHotelAvailableFilterValues3.hashCode(), catalogsHotelAvailableFilterValues4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsHotelAvailableFilterValue catalogsHotelAvailableFilterValues = new OASCatalogsHotelAvailableFilterValue();
        Map<String, String> x-property-mappings = catalogsHotelAvailableFilterValues.getx-property-mappings();
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
        System.assertEquals('filterValues', x-property-mappings.get('filter_values'));
    }
}
