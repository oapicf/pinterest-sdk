@isTest
private class OASFeedsUpdateRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASFeedsUpdateRequest feedsUpdateRequest1 = OASFeedsUpdateRequest.getExample();
        OASFeedsUpdateRequest feedsUpdateRequest2 = feedsUpdateRequest1;
        OASFeedsUpdateRequest feedsUpdateRequest3 = new OASFeedsUpdateRequest();
        OASFeedsUpdateRequest feedsUpdateRequest4 = feedsUpdateRequest3;

        System.assert(feedsUpdateRequest1.equals(feedsUpdateRequest2));
        System.assert(feedsUpdateRequest2.equals(feedsUpdateRequest1));
        System.assert(feedsUpdateRequest1.equals(feedsUpdateRequest1));
        System.assert(feedsUpdateRequest3.equals(feedsUpdateRequest4));
        System.assert(feedsUpdateRequest4.equals(feedsUpdateRequest3));
        System.assert(feedsUpdateRequest3.equals(feedsUpdateRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASFeedsUpdateRequest feedsUpdateRequest1 = OASFeedsUpdateRequest.getExample();
        OASFeedsUpdateRequest feedsUpdateRequest2 = OASFeedsUpdateRequest.getExample();
        OASFeedsUpdateRequest feedsUpdateRequest3 = new OASFeedsUpdateRequest();
        OASFeedsUpdateRequest feedsUpdateRequest4 = new OASFeedsUpdateRequest();

        System.assert(feedsUpdateRequest1.equals(feedsUpdateRequest2));
        System.assert(feedsUpdateRequest2.equals(feedsUpdateRequest1));
        System.assert(feedsUpdateRequest3.equals(feedsUpdateRequest4));
        System.assert(feedsUpdateRequest4.equals(feedsUpdateRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASFeedsUpdateRequest feedsUpdateRequest1 = OASFeedsUpdateRequest.getExample();
        OASFeedsUpdateRequest feedsUpdateRequest2 = new OASFeedsUpdateRequest();

        System.assertEquals(false, feedsUpdateRequest1.equals('foo'));
        System.assertEquals(false, feedsUpdateRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASFeedsUpdateRequest feedsUpdateRequest1 = OASFeedsUpdateRequest.getExample();
        OASFeedsUpdateRequest feedsUpdateRequest2 = new OASFeedsUpdateRequest();
        OASFeedsUpdateRequest feedsUpdateRequest3;

        System.assertEquals(false, feedsUpdateRequest1.equals(feedsUpdateRequest3));
        System.assertEquals(false, feedsUpdateRequest2.equals(feedsUpdateRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASFeedsUpdateRequest feedsUpdateRequest1 = OASFeedsUpdateRequest.getExample();
        OASFeedsUpdateRequest feedsUpdateRequest2 = new OASFeedsUpdateRequest();

        System.assertEquals(feedsUpdateRequest1.hashCode(), feedsUpdateRequest1.hashCode());
        System.assertEquals(feedsUpdateRequest2.hashCode(), feedsUpdateRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASFeedsUpdateRequest feedsUpdateRequest1 = OASFeedsUpdateRequest.getExample();
        OASFeedsUpdateRequest feedsUpdateRequest2 = OASFeedsUpdateRequest.getExample();
        OASFeedsUpdateRequest feedsUpdateRequest3 = new OASFeedsUpdateRequest();
        OASFeedsUpdateRequest feedsUpdateRequest4 = new OASFeedsUpdateRequest();

        System.assert(feedsUpdateRequest1.equals(feedsUpdateRequest2));
        System.assert(feedsUpdateRequest3.equals(feedsUpdateRequest4));
        System.assertEquals(feedsUpdateRequest1.hashCode(), feedsUpdateRequest2.hashCode());
        System.assertEquals(feedsUpdateRequest3.hashCode(), feedsUpdateRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASFeedsUpdateRequest feedsUpdateRequest = new OASFeedsUpdateRequest();
        Map<String, String> x-property-mappings = feedsUpdateRequest.getx-property-mappings();
        System.assertEquals('defaultCurrency', x-property-mappings.get('default_currency'));
        System.assertEquals('preferredProcessingSchedule', x-property-mappings.get('preferred_processing_schedule'));
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
        System.assertEquals('defaultAvailability', x-property-mappings.get('default_availability'));
    }
}
