@isTest
private class OASCatalogsHotelFeedsUpdateRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsHotelFeedsUpdateRequest catalogsHotelFeedsUpdateRequest1 = OASCatalogsHotelFeedsUpdateRequest.getExample();
        OASCatalogsHotelFeedsUpdateRequest catalogsHotelFeedsUpdateRequest2 = catalogsHotelFeedsUpdateRequest1;
        OASCatalogsHotelFeedsUpdateRequest catalogsHotelFeedsUpdateRequest3 = new OASCatalogsHotelFeedsUpdateRequest();
        OASCatalogsHotelFeedsUpdateRequest catalogsHotelFeedsUpdateRequest4 = catalogsHotelFeedsUpdateRequest3;

        System.assert(catalogsHotelFeedsUpdateRequest1.equals(catalogsHotelFeedsUpdateRequest2));
        System.assert(catalogsHotelFeedsUpdateRequest2.equals(catalogsHotelFeedsUpdateRequest1));
        System.assert(catalogsHotelFeedsUpdateRequest1.equals(catalogsHotelFeedsUpdateRequest1));
        System.assert(catalogsHotelFeedsUpdateRequest3.equals(catalogsHotelFeedsUpdateRequest4));
        System.assert(catalogsHotelFeedsUpdateRequest4.equals(catalogsHotelFeedsUpdateRequest3));
        System.assert(catalogsHotelFeedsUpdateRequest3.equals(catalogsHotelFeedsUpdateRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsHotelFeedsUpdateRequest catalogsHotelFeedsUpdateRequest1 = OASCatalogsHotelFeedsUpdateRequest.getExample();
        OASCatalogsHotelFeedsUpdateRequest catalogsHotelFeedsUpdateRequest2 = OASCatalogsHotelFeedsUpdateRequest.getExample();
        OASCatalogsHotelFeedsUpdateRequest catalogsHotelFeedsUpdateRequest3 = new OASCatalogsHotelFeedsUpdateRequest();
        OASCatalogsHotelFeedsUpdateRequest catalogsHotelFeedsUpdateRequest4 = new OASCatalogsHotelFeedsUpdateRequest();

        System.assert(catalogsHotelFeedsUpdateRequest1.equals(catalogsHotelFeedsUpdateRequest2));
        System.assert(catalogsHotelFeedsUpdateRequest2.equals(catalogsHotelFeedsUpdateRequest1));
        System.assert(catalogsHotelFeedsUpdateRequest3.equals(catalogsHotelFeedsUpdateRequest4));
        System.assert(catalogsHotelFeedsUpdateRequest4.equals(catalogsHotelFeedsUpdateRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsHotelFeedsUpdateRequest catalogsHotelFeedsUpdateRequest1 = OASCatalogsHotelFeedsUpdateRequest.getExample();
        OASCatalogsHotelFeedsUpdateRequest catalogsHotelFeedsUpdateRequest2 = new OASCatalogsHotelFeedsUpdateRequest();

        System.assertEquals(false, catalogsHotelFeedsUpdateRequest1.equals('foo'));
        System.assertEquals(false, catalogsHotelFeedsUpdateRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsHotelFeedsUpdateRequest catalogsHotelFeedsUpdateRequest1 = OASCatalogsHotelFeedsUpdateRequest.getExample();
        OASCatalogsHotelFeedsUpdateRequest catalogsHotelFeedsUpdateRequest2 = new OASCatalogsHotelFeedsUpdateRequest();
        OASCatalogsHotelFeedsUpdateRequest catalogsHotelFeedsUpdateRequest3;

        System.assertEquals(false, catalogsHotelFeedsUpdateRequest1.equals(catalogsHotelFeedsUpdateRequest3));
        System.assertEquals(false, catalogsHotelFeedsUpdateRequest2.equals(catalogsHotelFeedsUpdateRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsHotelFeedsUpdateRequest catalogsHotelFeedsUpdateRequest1 = OASCatalogsHotelFeedsUpdateRequest.getExample();
        OASCatalogsHotelFeedsUpdateRequest catalogsHotelFeedsUpdateRequest2 = new OASCatalogsHotelFeedsUpdateRequest();

        System.assertEquals(catalogsHotelFeedsUpdateRequest1.hashCode(), catalogsHotelFeedsUpdateRequest1.hashCode());
        System.assertEquals(catalogsHotelFeedsUpdateRequest2.hashCode(), catalogsHotelFeedsUpdateRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsHotelFeedsUpdateRequest catalogsHotelFeedsUpdateRequest1 = OASCatalogsHotelFeedsUpdateRequest.getExample();
        OASCatalogsHotelFeedsUpdateRequest catalogsHotelFeedsUpdateRequest2 = OASCatalogsHotelFeedsUpdateRequest.getExample();
        OASCatalogsHotelFeedsUpdateRequest catalogsHotelFeedsUpdateRequest3 = new OASCatalogsHotelFeedsUpdateRequest();
        OASCatalogsHotelFeedsUpdateRequest catalogsHotelFeedsUpdateRequest4 = new OASCatalogsHotelFeedsUpdateRequest();

        System.assert(catalogsHotelFeedsUpdateRequest1.equals(catalogsHotelFeedsUpdateRequest2));
        System.assert(catalogsHotelFeedsUpdateRequest3.equals(catalogsHotelFeedsUpdateRequest4));
        System.assertEquals(catalogsHotelFeedsUpdateRequest1.hashCode(), catalogsHotelFeedsUpdateRequest2.hashCode());
        System.assertEquals(catalogsHotelFeedsUpdateRequest3.hashCode(), catalogsHotelFeedsUpdateRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsHotelFeedsUpdateRequest catalogsHotelFeedsUpdateRequest = new OASCatalogsHotelFeedsUpdateRequest();
        Map<String, String> x-property-mappings = catalogsHotelFeedsUpdateRequest.getx-property-mappings();
        System.assertEquals('defaultCurrency', x-property-mappings.get('default_currency'));
        System.assertEquals('preferredProcessingSchedule', x-property-mappings.get('preferred_processing_schedule'));
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
    }
}
