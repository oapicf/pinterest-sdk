@isTest
private class OASFeedsCreateRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASFeedsCreateRequest feedsCreateRequest1 = OASFeedsCreateRequest.getExample();
        OASFeedsCreateRequest feedsCreateRequest2 = feedsCreateRequest1;
        OASFeedsCreateRequest feedsCreateRequest3 = new OASFeedsCreateRequest();
        OASFeedsCreateRequest feedsCreateRequest4 = feedsCreateRequest3;

        System.assert(feedsCreateRequest1.equals(feedsCreateRequest2));
        System.assert(feedsCreateRequest2.equals(feedsCreateRequest1));
        System.assert(feedsCreateRequest1.equals(feedsCreateRequest1));
        System.assert(feedsCreateRequest3.equals(feedsCreateRequest4));
        System.assert(feedsCreateRequest4.equals(feedsCreateRequest3));
        System.assert(feedsCreateRequest3.equals(feedsCreateRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASFeedsCreateRequest feedsCreateRequest1 = OASFeedsCreateRequest.getExample();
        OASFeedsCreateRequest feedsCreateRequest2 = OASFeedsCreateRequest.getExample();
        OASFeedsCreateRequest feedsCreateRequest3 = new OASFeedsCreateRequest();
        OASFeedsCreateRequest feedsCreateRequest4 = new OASFeedsCreateRequest();

        System.assert(feedsCreateRequest1.equals(feedsCreateRequest2));
        System.assert(feedsCreateRequest2.equals(feedsCreateRequest1));
        System.assert(feedsCreateRequest3.equals(feedsCreateRequest4));
        System.assert(feedsCreateRequest4.equals(feedsCreateRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASFeedsCreateRequest feedsCreateRequest1 = OASFeedsCreateRequest.getExample();
        OASFeedsCreateRequest feedsCreateRequest2 = new OASFeedsCreateRequest();

        System.assertEquals(false, feedsCreateRequest1.equals('foo'));
        System.assertEquals(false, feedsCreateRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASFeedsCreateRequest feedsCreateRequest1 = OASFeedsCreateRequest.getExample();
        OASFeedsCreateRequest feedsCreateRequest2 = new OASFeedsCreateRequest();
        OASFeedsCreateRequest feedsCreateRequest3;

        System.assertEquals(false, feedsCreateRequest1.equals(feedsCreateRequest3));
        System.assertEquals(false, feedsCreateRequest2.equals(feedsCreateRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASFeedsCreateRequest feedsCreateRequest1 = OASFeedsCreateRequest.getExample();
        OASFeedsCreateRequest feedsCreateRequest2 = new OASFeedsCreateRequest();

        System.assertEquals(feedsCreateRequest1.hashCode(), feedsCreateRequest1.hashCode());
        System.assertEquals(feedsCreateRequest2.hashCode(), feedsCreateRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASFeedsCreateRequest feedsCreateRequest1 = OASFeedsCreateRequest.getExample();
        OASFeedsCreateRequest feedsCreateRequest2 = OASFeedsCreateRequest.getExample();
        OASFeedsCreateRequest feedsCreateRequest3 = new OASFeedsCreateRequest();
        OASFeedsCreateRequest feedsCreateRequest4 = new OASFeedsCreateRequest();

        System.assert(feedsCreateRequest1.equals(feedsCreateRequest2));
        System.assert(feedsCreateRequest3.equals(feedsCreateRequest4));
        System.assertEquals(feedsCreateRequest1.hashCode(), feedsCreateRequest2.hashCode());
        System.assertEquals(feedsCreateRequest3.hashCode(), feedsCreateRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASFeedsCreateRequest feedsCreateRequest = new OASFeedsCreateRequest();
        Map<String, String> x-property-mappings = feedsCreateRequest.getx-property-mappings();
        System.assertEquals('defaultCurrency', x-property-mappings.get('default_currency'));
        System.assertEquals('defaultLocale', x-property-mappings.get('default_locale'));
        System.assertEquals('preferredProcessingSchedule', x-property-mappings.get('preferred_processing_schedule'));
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
        System.assertEquals('defaultCountry', x-property-mappings.get('default_country'));
        System.assertEquals('defaultAvailability', x-property-mappings.get('default_availability'));
        System.assertEquals('catalogId', x-property-mappings.get('catalog_id'));
    }
}
