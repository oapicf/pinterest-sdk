@isTest
private class OASCatalogsFeedsUpdateRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsFeedsUpdateRequest catalogsFeedsUpdateRequest1 = OASCatalogsFeedsUpdateRequest.getExample();
        OASCatalogsFeedsUpdateRequest catalogsFeedsUpdateRequest2 = catalogsFeedsUpdateRequest1;
        OASCatalogsFeedsUpdateRequest catalogsFeedsUpdateRequest3 = new OASCatalogsFeedsUpdateRequest();
        OASCatalogsFeedsUpdateRequest catalogsFeedsUpdateRequest4 = catalogsFeedsUpdateRequest3;

        System.assert(catalogsFeedsUpdateRequest1.equals(catalogsFeedsUpdateRequest2));
        System.assert(catalogsFeedsUpdateRequest2.equals(catalogsFeedsUpdateRequest1));
        System.assert(catalogsFeedsUpdateRequest1.equals(catalogsFeedsUpdateRequest1));
        System.assert(catalogsFeedsUpdateRequest3.equals(catalogsFeedsUpdateRequest4));
        System.assert(catalogsFeedsUpdateRequest4.equals(catalogsFeedsUpdateRequest3));
        System.assert(catalogsFeedsUpdateRequest3.equals(catalogsFeedsUpdateRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsFeedsUpdateRequest catalogsFeedsUpdateRequest1 = OASCatalogsFeedsUpdateRequest.getExample();
        OASCatalogsFeedsUpdateRequest catalogsFeedsUpdateRequest2 = OASCatalogsFeedsUpdateRequest.getExample();
        OASCatalogsFeedsUpdateRequest catalogsFeedsUpdateRequest3 = new OASCatalogsFeedsUpdateRequest();
        OASCatalogsFeedsUpdateRequest catalogsFeedsUpdateRequest4 = new OASCatalogsFeedsUpdateRequest();

        System.assert(catalogsFeedsUpdateRequest1.equals(catalogsFeedsUpdateRequest2));
        System.assert(catalogsFeedsUpdateRequest2.equals(catalogsFeedsUpdateRequest1));
        System.assert(catalogsFeedsUpdateRequest3.equals(catalogsFeedsUpdateRequest4));
        System.assert(catalogsFeedsUpdateRequest4.equals(catalogsFeedsUpdateRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsFeedsUpdateRequest catalogsFeedsUpdateRequest1 = OASCatalogsFeedsUpdateRequest.getExample();
        OASCatalogsFeedsUpdateRequest catalogsFeedsUpdateRequest2 = new OASCatalogsFeedsUpdateRequest();

        System.assertEquals(false, catalogsFeedsUpdateRequest1.equals('foo'));
        System.assertEquals(false, catalogsFeedsUpdateRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsFeedsUpdateRequest catalogsFeedsUpdateRequest1 = OASCatalogsFeedsUpdateRequest.getExample();
        OASCatalogsFeedsUpdateRequest catalogsFeedsUpdateRequest2 = new OASCatalogsFeedsUpdateRequest();
        OASCatalogsFeedsUpdateRequest catalogsFeedsUpdateRequest3;

        System.assertEquals(false, catalogsFeedsUpdateRequest1.equals(catalogsFeedsUpdateRequest3));
        System.assertEquals(false, catalogsFeedsUpdateRequest2.equals(catalogsFeedsUpdateRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsFeedsUpdateRequest catalogsFeedsUpdateRequest1 = OASCatalogsFeedsUpdateRequest.getExample();
        OASCatalogsFeedsUpdateRequest catalogsFeedsUpdateRequest2 = new OASCatalogsFeedsUpdateRequest();

        System.assertEquals(catalogsFeedsUpdateRequest1.hashCode(), catalogsFeedsUpdateRequest1.hashCode());
        System.assertEquals(catalogsFeedsUpdateRequest2.hashCode(), catalogsFeedsUpdateRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsFeedsUpdateRequest catalogsFeedsUpdateRequest1 = OASCatalogsFeedsUpdateRequest.getExample();
        OASCatalogsFeedsUpdateRequest catalogsFeedsUpdateRequest2 = OASCatalogsFeedsUpdateRequest.getExample();
        OASCatalogsFeedsUpdateRequest catalogsFeedsUpdateRequest3 = new OASCatalogsFeedsUpdateRequest();
        OASCatalogsFeedsUpdateRequest catalogsFeedsUpdateRequest4 = new OASCatalogsFeedsUpdateRequest();

        System.assert(catalogsFeedsUpdateRequest1.equals(catalogsFeedsUpdateRequest2));
        System.assert(catalogsFeedsUpdateRequest3.equals(catalogsFeedsUpdateRequest4));
        System.assertEquals(catalogsFeedsUpdateRequest1.hashCode(), catalogsFeedsUpdateRequest2.hashCode());
        System.assertEquals(catalogsFeedsUpdateRequest3.hashCode(), catalogsFeedsUpdateRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsFeedsUpdateRequest catalogsFeedsUpdateRequest = new OASCatalogsFeedsUpdateRequest();
        Map<String, String> x-property-mappings = catalogsFeedsUpdateRequest.getx-property-mappings();
        System.assertEquals('defaultAvailability', x-property-mappings.get('default_availability'));
        System.assertEquals('defaultCurrency', x-property-mappings.get('default_currency'));
        System.assertEquals('preferredProcessingSchedule', x-property-mappings.get('preferred_processing_schedule'));
    }
}
