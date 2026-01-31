@isTest
private class OASCatalogsFeedsCreateRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsFeedsCreateRequest catalogsFeedsCreateRequest1 = OASCatalogsFeedsCreateRequest.getExample();
        OASCatalogsFeedsCreateRequest catalogsFeedsCreateRequest2 = catalogsFeedsCreateRequest1;
        OASCatalogsFeedsCreateRequest catalogsFeedsCreateRequest3 = new OASCatalogsFeedsCreateRequest();
        OASCatalogsFeedsCreateRequest catalogsFeedsCreateRequest4 = catalogsFeedsCreateRequest3;

        System.assert(catalogsFeedsCreateRequest1.equals(catalogsFeedsCreateRequest2));
        System.assert(catalogsFeedsCreateRequest2.equals(catalogsFeedsCreateRequest1));
        System.assert(catalogsFeedsCreateRequest1.equals(catalogsFeedsCreateRequest1));
        System.assert(catalogsFeedsCreateRequest3.equals(catalogsFeedsCreateRequest4));
        System.assert(catalogsFeedsCreateRequest4.equals(catalogsFeedsCreateRequest3));
        System.assert(catalogsFeedsCreateRequest3.equals(catalogsFeedsCreateRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsFeedsCreateRequest catalogsFeedsCreateRequest1 = OASCatalogsFeedsCreateRequest.getExample();
        OASCatalogsFeedsCreateRequest catalogsFeedsCreateRequest2 = OASCatalogsFeedsCreateRequest.getExample();
        OASCatalogsFeedsCreateRequest catalogsFeedsCreateRequest3 = new OASCatalogsFeedsCreateRequest();
        OASCatalogsFeedsCreateRequest catalogsFeedsCreateRequest4 = new OASCatalogsFeedsCreateRequest();

        System.assert(catalogsFeedsCreateRequest1.equals(catalogsFeedsCreateRequest2));
        System.assert(catalogsFeedsCreateRequest2.equals(catalogsFeedsCreateRequest1));
        System.assert(catalogsFeedsCreateRequest3.equals(catalogsFeedsCreateRequest4));
        System.assert(catalogsFeedsCreateRequest4.equals(catalogsFeedsCreateRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsFeedsCreateRequest catalogsFeedsCreateRequest1 = OASCatalogsFeedsCreateRequest.getExample();
        OASCatalogsFeedsCreateRequest catalogsFeedsCreateRequest2 = new OASCatalogsFeedsCreateRequest();

        System.assertEquals(false, catalogsFeedsCreateRequest1.equals('foo'));
        System.assertEquals(false, catalogsFeedsCreateRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsFeedsCreateRequest catalogsFeedsCreateRequest1 = OASCatalogsFeedsCreateRequest.getExample();
        OASCatalogsFeedsCreateRequest catalogsFeedsCreateRequest2 = new OASCatalogsFeedsCreateRequest();
        OASCatalogsFeedsCreateRequest catalogsFeedsCreateRequest3;

        System.assertEquals(false, catalogsFeedsCreateRequest1.equals(catalogsFeedsCreateRequest3));
        System.assertEquals(false, catalogsFeedsCreateRequest2.equals(catalogsFeedsCreateRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsFeedsCreateRequest catalogsFeedsCreateRequest1 = OASCatalogsFeedsCreateRequest.getExample();
        OASCatalogsFeedsCreateRequest catalogsFeedsCreateRequest2 = new OASCatalogsFeedsCreateRequest();

        System.assertEquals(catalogsFeedsCreateRequest1.hashCode(), catalogsFeedsCreateRequest1.hashCode());
        System.assertEquals(catalogsFeedsCreateRequest2.hashCode(), catalogsFeedsCreateRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsFeedsCreateRequest catalogsFeedsCreateRequest1 = OASCatalogsFeedsCreateRequest.getExample();
        OASCatalogsFeedsCreateRequest catalogsFeedsCreateRequest2 = OASCatalogsFeedsCreateRequest.getExample();
        OASCatalogsFeedsCreateRequest catalogsFeedsCreateRequest3 = new OASCatalogsFeedsCreateRequest();
        OASCatalogsFeedsCreateRequest catalogsFeedsCreateRequest4 = new OASCatalogsFeedsCreateRequest();

        System.assert(catalogsFeedsCreateRequest1.equals(catalogsFeedsCreateRequest2));
        System.assert(catalogsFeedsCreateRequest3.equals(catalogsFeedsCreateRequest4));
        System.assertEquals(catalogsFeedsCreateRequest1.hashCode(), catalogsFeedsCreateRequest2.hashCode());
        System.assertEquals(catalogsFeedsCreateRequest3.hashCode(), catalogsFeedsCreateRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsFeedsCreateRequest catalogsFeedsCreateRequest = new OASCatalogsFeedsCreateRequest();
        Map<String, String> x-property-mappings = catalogsFeedsCreateRequest.getx-property-mappings();
        System.assertEquals('defaultCurrency', x-property-mappings.get('default_currency'));
        System.assertEquals('defaultLocale', x-property-mappings.get('default_locale'));
        System.assertEquals('preferredProcessingSchedule', x-property-mappings.get('preferred_processing_schedule'));
        System.assertEquals('defaultCountry', x-property-mappings.get('default_country'));
        System.assertEquals('defaultAvailability', x-property-mappings.get('default_availability'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCatalogsFeedsCreateRequest catalogsFeedsCreateRequest = new OASCatalogsFeedsCreateRequest();
        System.assertEquals('ACTIVE', catalogsFeedsCreateRequest.status);
        System.assertEquals(null, catalogsFeedsCreateRequest.defaultCurrency);
        System.assertEquals(null, catalogsFeedsCreateRequest.name);
        System.assertEquals(null, catalogsFeedsCreateRequest.format);
        System.assertEquals(null, catalogsFeedsCreateRequest.defaultLocale);
        System.assertEquals(null, catalogsFeedsCreateRequest.credentials);
        System.assertEquals(null, catalogsFeedsCreateRequest.location);
        System.assertEquals(null, catalogsFeedsCreateRequest.preferredProcessingSchedule);
        System.assertEquals(null, catalogsFeedsCreateRequest.defaultCountry);
        System.assertEquals(null, catalogsFeedsCreateRequest.defaultAvailability);
    }
}
