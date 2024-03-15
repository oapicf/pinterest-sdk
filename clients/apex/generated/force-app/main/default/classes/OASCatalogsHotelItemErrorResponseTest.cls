@isTest
private class OASCatalogsHotelItemErrorResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsHotelItemErrorResponse catalogsHotelItemErrorResponse1 = OASCatalogsHotelItemErrorResponse.getExample();
        OASCatalogsHotelItemErrorResponse catalogsHotelItemErrorResponse2 = catalogsHotelItemErrorResponse1;
        OASCatalogsHotelItemErrorResponse catalogsHotelItemErrorResponse3 = new OASCatalogsHotelItemErrorResponse();
        OASCatalogsHotelItemErrorResponse catalogsHotelItemErrorResponse4 = catalogsHotelItemErrorResponse3;

        System.assert(catalogsHotelItemErrorResponse1.equals(catalogsHotelItemErrorResponse2));
        System.assert(catalogsHotelItemErrorResponse2.equals(catalogsHotelItemErrorResponse1));
        System.assert(catalogsHotelItemErrorResponse1.equals(catalogsHotelItemErrorResponse1));
        System.assert(catalogsHotelItemErrorResponse3.equals(catalogsHotelItemErrorResponse4));
        System.assert(catalogsHotelItemErrorResponse4.equals(catalogsHotelItemErrorResponse3));
        System.assert(catalogsHotelItemErrorResponse3.equals(catalogsHotelItemErrorResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsHotelItemErrorResponse catalogsHotelItemErrorResponse1 = OASCatalogsHotelItemErrorResponse.getExample();
        OASCatalogsHotelItemErrorResponse catalogsHotelItemErrorResponse2 = OASCatalogsHotelItemErrorResponse.getExample();
        OASCatalogsHotelItemErrorResponse catalogsHotelItemErrorResponse3 = new OASCatalogsHotelItemErrorResponse();
        OASCatalogsHotelItemErrorResponse catalogsHotelItemErrorResponse4 = new OASCatalogsHotelItemErrorResponse();

        System.assert(catalogsHotelItemErrorResponse1.equals(catalogsHotelItemErrorResponse2));
        System.assert(catalogsHotelItemErrorResponse2.equals(catalogsHotelItemErrorResponse1));
        System.assert(catalogsHotelItemErrorResponse3.equals(catalogsHotelItemErrorResponse4));
        System.assert(catalogsHotelItemErrorResponse4.equals(catalogsHotelItemErrorResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsHotelItemErrorResponse catalogsHotelItemErrorResponse1 = OASCatalogsHotelItemErrorResponse.getExample();
        OASCatalogsHotelItemErrorResponse catalogsHotelItemErrorResponse2 = new OASCatalogsHotelItemErrorResponse();

        System.assertEquals(false, catalogsHotelItemErrorResponse1.equals('foo'));
        System.assertEquals(false, catalogsHotelItemErrorResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsHotelItemErrorResponse catalogsHotelItemErrorResponse1 = OASCatalogsHotelItemErrorResponse.getExample();
        OASCatalogsHotelItemErrorResponse catalogsHotelItemErrorResponse2 = new OASCatalogsHotelItemErrorResponse();
        OASCatalogsHotelItemErrorResponse catalogsHotelItemErrorResponse3;

        System.assertEquals(false, catalogsHotelItemErrorResponse1.equals(catalogsHotelItemErrorResponse3));
        System.assertEquals(false, catalogsHotelItemErrorResponse2.equals(catalogsHotelItemErrorResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsHotelItemErrorResponse catalogsHotelItemErrorResponse1 = OASCatalogsHotelItemErrorResponse.getExample();
        OASCatalogsHotelItemErrorResponse catalogsHotelItemErrorResponse2 = new OASCatalogsHotelItemErrorResponse();

        System.assertEquals(catalogsHotelItemErrorResponse1.hashCode(), catalogsHotelItemErrorResponse1.hashCode());
        System.assertEquals(catalogsHotelItemErrorResponse2.hashCode(), catalogsHotelItemErrorResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsHotelItemErrorResponse catalogsHotelItemErrorResponse1 = OASCatalogsHotelItemErrorResponse.getExample();
        OASCatalogsHotelItemErrorResponse catalogsHotelItemErrorResponse2 = OASCatalogsHotelItemErrorResponse.getExample();
        OASCatalogsHotelItemErrorResponse catalogsHotelItemErrorResponse3 = new OASCatalogsHotelItemErrorResponse();
        OASCatalogsHotelItemErrorResponse catalogsHotelItemErrorResponse4 = new OASCatalogsHotelItemErrorResponse();

        System.assert(catalogsHotelItemErrorResponse1.equals(catalogsHotelItemErrorResponse2));
        System.assert(catalogsHotelItemErrorResponse3.equals(catalogsHotelItemErrorResponse4));
        System.assertEquals(catalogsHotelItemErrorResponse1.hashCode(), catalogsHotelItemErrorResponse2.hashCode());
        System.assertEquals(catalogsHotelItemErrorResponse3.hashCode(), catalogsHotelItemErrorResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsHotelItemErrorResponse catalogsHotelItemErrorResponse = new OASCatalogsHotelItemErrorResponse();
        Map<String, String> x-property-mappings = catalogsHotelItemErrorResponse.getx-property-mappings();
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
        System.assertEquals('hotelId', x-property-mappings.get('hotel_id'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCatalogsHotelItemErrorResponse catalogsHotelItemErrorResponse = new OASCatalogsHotelItemErrorResponse();
        System.assertEquals(new List<OASItemValidationEvent>(), catalogsHotelItemErrorResponse.errors);
        System.assertEquals(null, catalogsHotelItemErrorResponse.catalogType);
        System.assertEquals(null, catalogsHotelItemErrorResponse.hotelId);
    }
}
