@isTest
private class OASCatalogsRetailFeedsCreateRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsRetailFeedsCreateRequest catalogsRetailFeedsCreateRequest1 = OASCatalogsRetailFeedsCreateRequest.getExample();
        OASCatalogsRetailFeedsCreateRequest catalogsRetailFeedsCreateRequest2 = catalogsRetailFeedsCreateRequest1;
        OASCatalogsRetailFeedsCreateRequest catalogsRetailFeedsCreateRequest3 = new OASCatalogsRetailFeedsCreateRequest();
        OASCatalogsRetailFeedsCreateRequest catalogsRetailFeedsCreateRequest4 = catalogsRetailFeedsCreateRequest3;

        System.assert(catalogsRetailFeedsCreateRequest1.equals(catalogsRetailFeedsCreateRequest2));
        System.assert(catalogsRetailFeedsCreateRequest2.equals(catalogsRetailFeedsCreateRequest1));
        System.assert(catalogsRetailFeedsCreateRequest1.equals(catalogsRetailFeedsCreateRequest1));
        System.assert(catalogsRetailFeedsCreateRequest3.equals(catalogsRetailFeedsCreateRequest4));
        System.assert(catalogsRetailFeedsCreateRequest4.equals(catalogsRetailFeedsCreateRequest3));
        System.assert(catalogsRetailFeedsCreateRequest3.equals(catalogsRetailFeedsCreateRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsRetailFeedsCreateRequest catalogsRetailFeedsCreateRequest1 = OASCatalogsRetailFeedsCreateRequest.getExample();
        OASCatalogsRetailFeedsCreateRequest catalogsRetailFeedsCreateRequest2 = OASCatalogsRetailFeedsCreateRequest.getExample();
        OASCatalogsRetailFeedsCreateRequest catalogsRetailFeedsCreateRequest3 = new OASCatalogsRetailFeedsCreateRequest();
        OASCatalogsRetailFeedsCreateRequest catalogsRetailFeedsCreateRequest4 = new OASCatalogsRetailFeedsCreateRequest();

        System.assert(catalogsRetailFeedsCreateRequest1.equals(catalogsRetailFeedsCreateRequest2));
        System.assert(catalogsRetailFeedsCreateRequest2.equals(catalogsRetailFeedsCreateRequest1));
        System.assert(catalogsRetailFeedsCreateRequest3.equals(catalogsRetailFeedsCreateRequest4));
        System.assert(catalogsRetailFeedsCreateRequest4.equals(catalogsRetailFeedsCreateRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsRetailFeedsCreateRequest catalogsRetailFeedsCreateRequest1 = OASCatalogsRetailFeedsCreateRequest.getExample();
        OASCatalogsRetailFeedsCreateRequest catalogsRetailFeedsCreateRequest2 = new OASCatalogsRetailFeedsCreateRequest();

        System.assertEquals(false, catalogsRetailFeedsCreateRequest1.equals('foo'));
        System.assertEquals(false, catalogsRetailFeedsCreateRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsRetailFeedsCreateRequest catalogsRetailFeedsCreateRequest1 = OASCatalogsRetailFeedsCreateRequest.getExample();
        OASCatalogsRetailFeedsCreateRequest catalogsRetailFeedsCreateRequest2 = new OASCatalogsRetailFeedsCreateRequest();
        OASCatalogsRetailFeedsCreateRequest catalogsRetailFeedsCreateRequest3;

        System.assertEquals(false, catalogsRetailFeedsCreateRequest1.equals(catalogsRetailFeedsCreateRequest3));
        System.assertEquals(false, catalogsRetailFeedsCreateRequest2.equals(catalogsRetailFeedsCreateRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsRetailFeedsCreateRequest catalogsRetailFeedsCreateRequest1 = OASCatalogsRetailFeedsCreateRequest.getExample();
        OASCatalogsRetailFeedsCreateRequest catalogsRetailFeedsCreateRequest2 = new OASCatalogsRetailFeedsCreateRequest();

        System.assertEquals(catalogsRetailFeedsCreateRequest1.hashCode(), catalogsRetailFeedsCreateRequest1.hashCode());
        System.assertEquals(catalogsRetailFeedsCreateRequest2.hashCode(), catalogsRetailFeedsCreateRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsRetailFeedsCreateRequest catalogsRetailFeedsCreateRequest1 = OASCatalogsRetailFeedsCreateRequest.getExample();
        OASCatalogsRetailFeedsCreateRequest catalogsRetailFeedsCreateRequest2 = OASCatalogsRetailFeedsCreateRequest.getExample();
        OASCatalogsRetailFeedsCreateRequest catalogsRetailFeedsCreateRequest3 = new OASCatalogsRetailFeedsCreateRequest();
        OASCatalogsRetailFeedsCreateRequest catalogsRetailFeedsCreateRequest4 = new OASCatalogsRetailFeedsCreateRequest();

        System.assert(catalogsRetailFeedsCreateRequest1.equals(catalogsRetailFeedsCreateRequest2));
        System.assert(catalogsRetailFeedsCreateRequest3.equals(catalogsRetailFeedsCreateRequest4));
        System.assertEquals(catalogsRetailFeedsCreateRequest1.hashCode(), catalogsRetailFeedsCreateRequest2.hashCode());
        System.assertEquals(catalogsRetailFeedsCreateRequest3.hashCode(), catalogsRetailFeedsCreateRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsRetailFeedsCreateRequest catalogsRetailFeedsCreateRequest = new OASCatalogsRetailFeedsCreateRequest();
        Map<String, String> x-property-mappings = catalogsRetailFeedsCreateRequest.getx-property-mappings();
        System.assertEquals('defaultCurrency', x-property-mappings.get('default_currency'));
        System.assertEquals('defaultLocale', x-property-mappings.get('default_locale'));
        System.assertEquals('preferredProcessingSchedule', x-property-mappings.get('preferred_processing_schedule'));
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
        System.assertEquals('defaultCountry', x-property-mappings.get('default_country'));
        System.assertEquals('defaultAvailability', x-property-mappings.get('default_availability'));
    }
}
