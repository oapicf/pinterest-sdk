@isTest
private class OASCatalogsHotelItemsFilterTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsHotelItemsFilter catalogsHotelItemsFilter1 = OASCatalogsHotelItemsFilter.getExample();
        OASCatalogsHotelItemsFilter catalogsHotelItemsFilter2 = catalogsHotelItemsFilter1;
        OASCatalogsHotelItemsFilter catalogsHotelItemsFilter3 = new OASCatalogsHotelItemsFilter();
        OASCatalogsHotelItemsFilter catalogsHotelItemsFilter4 = catalogsHotelItemsFilter3;

        System.assert(catalogsHotelItemsFilter1.equals(catalogsHotelItemsFilter2));
        System.assert(catalogsHotelItemsFilter2.equals(catalogsHotelItemsFilter1));
        System.assert(catalogsHotelItemsFilter1.equals(catalogsHotelItemsFilter1));
        System.assert(catalogsHotelItemsFilter3.equals(catalogsHotelItemsFilter4));
        System.assert(catalogsHotelItemsFilter4.equals(catalogsHotelItemsFilter3));
        System.assert(catalogsHotelItemsFilter3.equals(catalogsHotelItemsFilter3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsHotelItemsFilter catalogsHotelItemsFilter1 = OASCatalogsHotelItemsFilter.getExample();
        OASCatalogsHotelItemsFilter catalogsHotelItemsFilter2 = OASCatalogsHotelItemsFilter.getExample();
        OASCatalogsHotelItemsFilter catalogsHotelItemsFilter3 = new OASCatalogsHotelItemsFilter();
        OASCatalogsHotelItemsFilter catalogsHotelItemsFilter4 = new OASCatalogsHotelItemsFilter();

        System.assert(catalogsHotelItemsFilter1.equals(catalogsHotelItemsFilter2));
        System.assert(catalogsHotelItemsFilter2.equals(catalogsHotelItemsFilter1));
        System.assert(catalogsHotelItemsFilter3.equals(catalogsHotelItemsFilter4));
        System.assert(catalogsHotelItemsFilter4.equals(catalogsHotelItemsFilter3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsHotelItemsFilter catalogsHotelItemsFilter1 = OASCatalogsHotelItemsFilter.getExample();
        OASCatalogsHotelItemsFilter catalogsHotelItemsFilter2 = new OASCatalogsHotelItemsFilter();

        System.assertEquals(false, catalogsHotelItemsFilter1.equals('foo'));
        System.assertEquals(false, catalogsHotelItemsFilter2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsHotelItemsFilter catalogsHotelItemsFilter1 = OASCatalogsHotelItemsFilter.getExample();
        OASCatalogsHotelItemsFilter catalogsHotelItemsFilter2 = new OASCatalogsHotelItemsFilter();
        OASCatalogsHotelItemsFilter catalogsHotelItemsFilter3;

        System.assertEquals(false, catalogsHotelItemsFilter1.equals(catalogsHotelItemsFilter3));
        System.assertEquals(false, catalogsHotelItemsFilter2.equals(catalogsHotelItemsFilter3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsHotelItemsFilter catalogsHotelItemsFilter1 = OASCatalogsHotelItemsFilter.getExample();
        OASCatalogsHotelItemsFilter catalogsHotelItemsFilter2 = new OASCatalogsHotelItemsFilter();

        System.assertEquals(catalogsHotelItemsFilter1.hashCode(), catalogsHotelItemsFilter1.hashCode());
        System.assertEquals(catalogsHotelItemsFilter2.hashCode(), catalogsHotelItemsFilter2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsHotelItemsFilter catalogsHotelItemsFilter1 = OASCatalogsHotelItemsFilter.getExample();
        OASCatalogsHotelItemsFilter catalogsHotelItemsFilter2 = OASCatalogsHotelItemsFilter.getExample();
        OASCatalogsHotelItemsFilter catalogsHotelItemsFilter3 = new OASCatalogsHotelItemsFilter();
        OASCatalogsHotelItemsFilter catalogsHotelItemsFilter4 = new OASCatalogsHotelItemsFilter();

        System.assert(catalogsHotelItemsFilter1.equals(catalogsHotelItemsFilter2));
        System.assert(catalogsHotelItemsFilter3.equals(catalogsHotelItemsFilter4));
        System.assertEquals(catalogsHotelItemsFilter1.hashCode(), catalogsHotelItemsFilter2.hashCode());
        System.assertEquals(catalogsHotelItemsFilter3.hashCode(), catalogsHotelItemsFilter4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsHotelItemsFilter catalogsHotelItemsFilter = new OASCatalogsHotelItemsFilter();
        Map<String, String> x-property-mappings = catalogsHotelItemsFilter.getx-property-mappings();
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
        System.assertEquals('hotelIds', x-property-mappings.get('hotel_ids'));
        System.assertEquals('catalogId', x-property-mappings.get('catalog_id'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCatalogsHotelItemsFilter catalogsHotelItemsFilter = new OASCatalogsHotelItemsFilter();
        System.assertEquals(new List<String>(), catalogsHotelItemsFilter.hotelIds);
        System.assertEquals(null, catalogsHotelItemsFilter.catalogType);
        System.assertEquals(null, catalogsHotelItemsFilter.catalogId);
    }
}
