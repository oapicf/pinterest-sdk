@isTest
private class OASCatalogsHotelItemsPostFilterTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsHotelItemsPostFilter catalogsHotelItemsPostFilter1 = OASCatalogsHotelItemsPostFilter.getExample();
        OASCatalogsHotelItemsPostFilter catalogsHotelItemsPostFilter2 = catalogsHotelItemsPostFilter1;
        OASCatalogsHotelItemsPostFilter catalogsHotelItemsPostFilter3 = new OASCatalogsHotelItemsPostFilter();
        OASCatalogsHotelItemsPostFilter catalogsHotelItemsPostFilter4 = catalogsHotelItemsPostFilter3;

        System.assert(catalogsHotelItemsPostFilter1.equals(catalogsHotelItemsPostFilter2));
        System.assert(catalogsHotelItemsPostFilter2.equals(catalogsHotelItemsPostFilter1));
        System.assert(catalogsHotelItemsPostFilter1.equals(catalogsHotelItemsPostFilter1));
        System.assert(catalogsHotelItemsPostFilter3.equals(catalogsHotelItemsPostFilter4));
        System.assert(catalogsHotelItemsPostFilter4.equals(catalogsHotelItemsPostFilter3));
        System.assert(catalogsHotelItemsPostFilter3.equals(catalogsHotelItemsPostFilter3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsHotelItemsPostFilter catalogsHotelItemsPostFilter1 = OASCatalogsHotelItemsPostFilter.getExample();
        OASCatalogsHotelItemsPostFilter catalogsHotelItemsPostFilter2 = OASCatalogsHotelItemsPostFilter.getExample();
        OASCatalogsHotelItemsPostFilter catalogsHotelItemsPostFilter3 = new OASCatalogsHotelItemsPostFilter();
        OASCatalogsHotelItemsPostFilter catalogsHotelItemsPostFilter4 = new OASCatalogsHotelItemsPostFilter();

        System.assert(catalogsHotelItemsPostFilter1.equals(catalogsHotelItemsPostFilter2));
        System.assert(catalogsHotelItemsPostFilter2.equals(catalogsHotelItemsPostFilter1));
        System.assert(catalogsHotelItemsPostFilter3.equals(catalogsHotelItemsPostFilter4));
        System.assert(catalogsHotelItemsPostFilter4.equals(catalogsHotelItemsPostFilter3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsHotelItemsPostFilter catalogsHotelItemsPostFilter1 = OASCatalogsHotelItemsPostFilter.getExample();
        OASCatalogsHotelItemsPostFilter catalogsHotelItemsPostFilter2 = new OASCatalogsHotelItemsPostFilter();

        System.assertEquals(false, catalogsHotelItemsPostFilter1.equals('foo'));
        System.assertEquals(false, catalogsHotelItemsPostFilter2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsHotelItemsPostFilter catalogsHotelItemsPostFilter1 = OASCatalogsHotelItemsPostFilter.getExample();
        OASCatalogsHotelItemsPostFilter catalogsHotelItemsPostFilter2 = new OASCatalogsHotelItemsPostFilter();
        OASCatalogsHotelItemsPostFilter catalogsHotelItemsPostFilter3;

        System.assertEquals(false, catalogsHotelItemsPostFilter1.equals(catalogsHotelItemsPostFilter3));
        System.assertEquals(false, catalogsHotelItemsPostFilter2.equals(catalogsHotelItemsPostFilter3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsHotelItemsPostFilter catalogsHotelItemsPostFilter1 = OASCatalogsHotelItemsPostFilter.getExample();
        OASCatalogsHotelItemsPostFilter catalogsHotelItemsPostFilter2 = new OASCatalogsHotelItemsPostFilter();

        System.assertEquals(catalogsHotelItemsPostFilter1.hashCode(), catalogsHotelItemsPostFilter1.hashCode());
        System.assertEquals(catalogsHotelItemsPostFilter2.hashCode(), catalogsHotelItemsPostFilter2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsHotelItemsPostFilter catalogsHotelItemsPostFilter1 = OASCatalogsHotelItemsPostFilter.getExample();
        OASCatalogsHotelItemsPostFilter catalogsHotelItemsPostFilter2 = OASCatalogsHotelItemsPostFilter.getExample();
        OASCatalogsHotelItemsPostFilter catalogsHotelItemsPostFilter3 = new OASCatalogsHotelItemsPostFilter();
        OASCatalogsHotelItemsPostFilter catalogsHotelItemsPostFilter4 = new OASCatalogsHotelItemsPostFilter();

        System.assert(catalogsHotelItemsPostFilter1.equals(catalogsHotelItemsPostFilter2));
        System.assert(catalogsHotelItemsPostFilter3.equals(catalogsHotelItemsPostFilter4));
        System.assertEquals(catalogsHotelItemsPostFilter1.hashCode(), catalogsHotelItemsPostFilter2.hashCode());
        System.assertEquals(catalogsHotelItemsPostFilter3.hashCode(), catalogsHotelItemsPostFilter4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsHotelItemsPostFilter catalogsHotelItemsPostFilter = new OASCatalogsHotelItemsPostFilter();
        Map<String, String> x-property-mappings = catalogsHotelItemsPostFilter.getx-property-mappings();
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
        System.assertEquals('hotelIds', x-property-mappings.get('hotel_ids'));
        System.assertEquals('catalogId', x-property-mappings.get('catalog_id'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCatalogsHotelItemsPostFilter catalogsHotelItemsPostFilter = new OASCatalogsHotelItemsPostFilter();
        System.assertEquals(new List<String>(), catalogsHotelItemsPostFilter.hotelIds);
        System.assertEquals(null, catalogsHotelItemsPostFilter.catalogType);
        System.assertEquals(null, catalogsHotelItemsPostFilter.catalogId);
    }
}
