@isTest
private class OASCatalogsHotelItemResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsHotelItemResponse catalogsHotelItemResponse1 = OASCatalogsHotelItemResponse.getExample();
        OASCatalogsHotelItemResponse catalogsHotelItemResponse2 = catalogsHotelItemResponse1;
        OASCatalogsHotelItemResponse catalogsHotelItemResponse3 = new OASCatalogsHotelItemResponse();
        OASCatalogsHotelItemResponse catalogsHotelItemResponse4 = catalogsHotelItemResponse3;

        System.assert(catalogsHotelItemResponse1.equals(catalogsHotelItemResponse2));
        System.assert(catalogsHotelItemResponse2.equals(catalogsHotelItemResponse1));
        System.assert(catalogsHotelItemResponse1.equals(catalogsHotelItemResponse1));
        System.assert(catalogsHotelItemResponse3.equals(catalogsHotelItemResponse4));
        System.assert(catalogsHotelItemResponse4.equals(catalogsHotelItemResponse3));
        System.assert(catalogsHotelItemResponse3.equals(catalogsHotelItemResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsHotelItemResponse catalogsHotelItemResponse1 = OASCatalogsHotelItemResponse.getExample();
        OASCatalogsHotelItemResponse catalogsHotelItemResponse2 = OASCatalogsHotelItemResponse.getExample();
        OASCatalogsHotelItemResponse catalogsHotelItemResponse3 = new OASCatalogsHotelItemResponse();
        OASCatalogsHotelItemResponse catalogsHotelItemResponse4 = new OASCatalogsHotelItemResponse();

        System.assert(catalogsHotelItemResponse1.equals(catalogsHotelItemResponse2));
        System.assert(catalogsHotelItemResponse2.equals(catalogsHotelItemResponse1));
        System.assert(catalogsHotelItemResponse3.equals(catalogsHotelItemResponse4));
        System.assert(catalogsHotelItemResponse4.equals(catalogsHotelItemResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsHotelItemResponse catalogsHotelItemResponse1 = OASCatalogsHotelItemResponse.getExample();
        OASCatalogsHotelItemResponse catalogsHotelItemResponse2 = new OASCatalogsHotelItemResponse();

        System.assertEquals(false, catalogsHotelItemResponse1.equals('foo'));
        System.assertEquals(false, catalogsHotelItemResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsHotelItemResponse catalogsHotelItemResponse1 = OASCatalogsHotelItemResponse.getExample();
        OASCatalogsHotelItemResponse catalogsHotelItemResponse2 = new OASCatalogsHotelItemResponse();
        OASCatalogsHotelItemResponse catalogsHotelItemResponse3;

        System.assertEquals(false, catalogsHotelItemResponse1.equals(catalogsHotelItemResponse3));
        System.assertEquals(false, catalogsHotelItemResponse2.equals(catalogsHotelItemResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsHotelItemResponse catalogsHotelItemResponse1 = OASCatalogsHotelItemResponse.getExample();
        OASCatalogsHotelItemResponse catalogsHotelItemResponse2 = new OASCatalogsHotelItemResponse();

        System.assertEquals(catalogsHotelItemResponse1.hashCode(), catalogsHotelItemResponse1.hashCode());
        System.assertEquals(catalogsHotelItemResponse2.hashCode(), catalogsHotelItemResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsHotelItemResponse catalogsHotelItemResponse1 = OASCatalogsHotelItemResponse.getExample();
        OASCatalogsHotelItemResponse catalogsHotelItemResponse2 = OASCatalogsHotelItemResponse.getExample();
        OASCatalogsHotelItemResponse catalogsHotelItemResponse3 = new OASCatalogsHotelItemResponse();
        OASCatalogsHotelItemResponse catalogsHotelItemResponse4 = new OASCatalogsHotelItemResponse();

        System.assert(catalogsHotelItemResponse1.equals(catalogsHotelItemResponse2));
        System.assert(catalogsHotelItemResponse3.equals(catalogsHotelItemResponse4));
        System.assertEquals(catalogsHotelItemResponse1.hashCode(), catalogsHotelItemResponse2.hashCode());
        System.assertEquals(catalogsHotelItemResponse3.hashCode(), catalogsHotelItemResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsHotelItemResponse catalogsHotelItemResponse = new OASCatalogsHotelItemResponse();
        Map<String, String> x-property-mappings = catalogsHotelItemResponse.getx-property-mappings();
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
        System.assertEquals('hotelId', x-property-mappings.get('hotel_id'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCatalogsHotelItemResponse catalogsHotelItemResponse = new OASCatalogsHotelItemResponse();
        System.assertEquals(new List<OASPin>(), catalogsHotelItemResponse.pins);
        System.assertEquals(null, catalogsHotelItemResponse.catalogType);
        System.assertEquals(null, catalogsHotelItemResponse.hotelId);
        System.assertEquals(null, catalogsHotelItemResponse.attributes);
    }
}
