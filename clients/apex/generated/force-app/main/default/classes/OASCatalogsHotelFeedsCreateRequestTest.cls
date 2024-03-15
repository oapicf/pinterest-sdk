@isTest
private class OASCatalogsHotelFeedsCreateRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsHotelFeedsCreateRequest catalogsHotelFeedsCreateRequest1 = OASCatalogsHotelFeedsCreateRequest.getExample();
        OASCatalogsHotelFeedsCreateRequest catalogsHotelFeedsCreateRequest2 = catalogsHotelFeedsCreateRequest1;
        OASCatalogsHotelFeedsCreateRequest catalogsHotelFeedsCreateRequest3 = new OASCatalogsHotelFeedsCreateRequest();
        OASCatalogsHotelFeedsCreateRequest catalogsHotelFeedsCreateRequest4 = catalogsHotelFeedsCreateRequest3;

        System.assert(catalogsHotelFeedsCreateRequest1.equals(catalogsHotelFeedsCreateRequest2));
        System.assert(catalogsHotelFeedsCreateRequest2.equals(catalogsHotelFeedsCreateRequest1));
        System.assert(catalogsHotelFeedsCreateRequest1.equals(catalogsHotelFeedsCreateRequest1));
        System.assert(catalogsHotelFeedsCreateRequest3.equals(catalogsHotelFeedsCreateRequest4));
        System.assert(catalogsHotelFeedsCreateRequest4.equals(catalogsHotelFeedsCreateRequest3));
        System.assert(catalogsHotelFeedsCreateRequest3.equals(catalogsHotelFeedsCreateRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsHotelFeedsCreateRequest catalogsHotelFeedsCreateRequest1 = OASCatalogsHotelFeedsCreateRequest.getExample();
        OASCatalogsHotelFeedsCreateRequest catalogsHotelFeedsCreateRequest2 = OASCatalogsHotelFeedsCreateRequest.getExample();
        OASCatalogsHotelFeedsCreateRequest catalogsHotelFeedsCreateRequest3 = new OASCatalogsHotelFeedsCreateRequest();
        OASCatalogsHotelFeedsCreateRequest catalogsHotelFeedsCreateRequest4 = new OASCatalogsHotelFeedsCreateRequest();

        System.assert(catalogsHotelFeedsCreateRequest1.equals(catalogsHotelFeedsCreateRequest2));
        System.assert(catalogsHotelFeedsCreateRequest2.equals(catalogsHotelFeedsCreateRequest1));
        System.assert(catalogsHotelFeedsCreateRequest3.equals(catalogsHotelFeedsCreateRequest4));
        System.assert(catalogsHotelFeedsCreateRequest4.equals(catalogsHotelFeedsCreateRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsHotelFeedsCreateRequest catalogsHotelFeedsCreateRequest1 = OASCatalogsHotelFeedsCreateRequest.getExample();
        OASCatalogsHotelFeedsCreateRequest catalogsHotelFeedsCreateRequest2 = new OASCatalogsHotelFeedsCreateRequest();

        System.assertEquals(false, catalogsHotelFeedsCreateRequest1.equals('foo'));
        System.assertEquals(false, catalogsHotelFeedsCreateRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsHotelFeedsCreateRequest catalogsHotelFeedsCreateRequest1 = OASCatalogsHotelFeedsCreateRequest.getExample();
        OASCatalogsHotelFeedsCreateRequest catalogsHotelFeedsCreateRequest2 = new OASCatalogsHotelFeedsCreateRequest();
        OASCatalogsHotelFeedsCreateRequest catalogsHotelFeedsCreateRequest3;

        System.assertEquals(false, catalogsHotelFeedsCreateRequest1.equals(catalogsHotelFeedsCreateRequest3));
        System.assertEquals(false, catalogsHotelFeedsCreateRequest2.equals(catalogsHotelFeedsCreateRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsHotelFeedsCreateRequest catalogsHotelFeedsCreateRequest1 = OASCatalogsHotelFeedsCreateRequest.getExample();
        OASCatalogsHotelFeedsCreateRequest catalogsHotelFeedsCreateRequest2 = new OASCatalogsHotelFeedsCreateRequest();

        System.assertEquals(catalogsHotelFeedsCreateRequest1.hashCode(), catalogsHotelFeedsCreateRequest1.hashCode());
        System.assertEquals(catalogsHotelFeedsCreateRequest2.hashCode(), catalogsHotelFeedsCreateRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsHotelFeedsCreateRequest catalogsHotelFeedsCreateRequest1 = OASCatalogsHotelFeedsCreateRequest.getExample();
        OASCatalogsHotelFeedsCreateRequest catalogsHotelFeedsCreateRequest2 = OASCatalogsHotelFeedsCreateRequest.getExample();
        OASCatalogsHotelFeedsCreateRequest catalogsHotelFeedsCreateRequest3 = new OASCatalogsHotelFeedsCreateRequest();
        OASCatalogsHotelFeedsCreateRequest catalogsHotelFeedsCreateRequest4 = new OASCatalogsHotelFeedsCreateRequest();

        System.assert(catalogsHotelFeedsCreateRequest1.equals(catalogsHotelFeedsCreateRequest2));
        System.assert(catalogsHotelFeedsCreateRequest3.equals(catalogsHotelFeedsCreateRequest4));
        System.assertEquals(catalogsHotelFeedsCreateRequest1.hashCode(), catalogsHotelFeedsCreateRequest2.hashCode());
        System.assertEquals(catalogsHotelFeedsCreateRequest3.hashCode(), catalogsHotelFeedsCreateRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsHotelFeedsCreateRequest catalogsHotelFeedsCreateRequest = new OASCatalogsHotelFeedsCreateRequest();
        Map<String, String> x-property-mappings = catalogsHotelFeedsCreateRequest.getx-property-mappings();
        System.assertEquals('defaultCurrency', x-property-mappings.get('default_currency'));
        System.assertEquals('defaultLocale', x-property-mappings.get('default_locale'));
        System.assertEquals('preferredProcessingSchedule', x-property-mappings.get('preferred_processing_schedule'));
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
        System.assertEquals('catalogId', x-property-mappings.get('catalog_id'));
    }
}
