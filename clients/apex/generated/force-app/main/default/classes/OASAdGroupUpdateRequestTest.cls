@isTest
private class OASAdGroupUpdateRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdGroupUpdateRequest adGroupUpdateRequest1 = OASAdGroupUpdateRequest.getExample();
        OASAdGroupUpdateRequest adGroupUpdateRequest2 = adGroupUpdateRequest1;
        OASAdGroupUpdateRequest adGroupUpdateRequest3 = new OASAdGroupUpdateRequest();
        OASAdGroupUpdateRequest adGroupUpdateRequest4 = adGroupUpdateRequest3;

        System.assert(adGroupUpdateRequest1.equals(adGroupUpdateRequest2));
        System.assert(adGroupUpdateRequest2.equals(adGroupUpdateRequest1));
        System.assert(adGroupUpdateRequest1.equals(adGroupUpdateRequest1));
        System.assert(adGroupUpdateRequest3.equals(adGroupUpdateRequest4));
        System.assert(adGroupUpdateRequest4.equals(adGroupUpdateRequest3));
        System.assert(adGroupUpdateRequest3.equals(adGroupUpdateRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdGroupUpdateRequest adGroupUpdateRequest1 = OASAdGroupUpdateRequest.getExample();
        OASAdGroupUpdateRequest adGroupUpdateRequest2 = OASAdGroupUpdateRequest.getExample();
        OASAdGroupUpdateRequest adGroupUpdateRequest3 = new OASAdGroupUpdateRequest();
        OASAdGroupUpdateRequest adGroupUpdateRequest4 = new OASAdGroupUpdateRequest();

        System.assert(adGroupUpdateRequest1.equals(adGroupUpdateRequest2));
        System.assert(adGroupUpdateRequest2.equals(adGroupUpdateRequest1));
        System.assert(adGroupUpdateRequest3.equals(adGroupUpdateRequest4));
        System.assert(adGroupUpdateRequest4.equals(adGroupUpdateRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdGroupUpdateRequest adGroupUpdateRequest1 = OASAdGroupUpdateRequest.getExample();
        OASAdGroupUpdateRequest adGroupUpdateRequest2 = new OASAdGroupUpdateRequest();

        System.assertEquals(false, adGroupUpdateRequest1.equals('foo'));
        System.assertEquals(false, adGroupUpdateRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdGroupUpdateRequest adGroupUpdateRequest1 = OASAdGroupUpdateRequest.getExample();
        OASAdGroupUpdateRequest adGroupUpdateRequest2 = new OASAdGroupUpdateRequest();
        OASAdGroupUpdateRequest adGroupUpdateRequest3;

        System.assertEquals(false, adGroupUpdateRequest1.equals(adGroupUpdateRequest3));
        System.assertEquals(false, adGroupUpdateRequest2.equals(adGroupUpdateRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdGroupUpdateRequest adGroupUpdateRequest1 = OASAdGroupUpdateRequest.getExample();
        OASAdGroupUpdateRequest adGroupUpdateRequest2 = new OASAdGroupUpdateRequest();

        System.assertEquals(adGroupUpdateRequest1.hashCode(), adGroupUpdateRequest1.hashCode());
        System.assertEquals(adGroupUpdateRequest2.hashCode(), adGroupUpdateRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdGroupUpdateRequest adGroupUpdateRequest1 = OASAdGroupUpdateRequest.getExample();
        OASAdGroupUpdateRequest adGroupUpdateRequest2 = OASAdGroupUpdateRequest.getExample();
        OASAdGroupUpdateRequest adGroupUpdateRequest3 = new OASAdGroupUpdateRequest();
        OASAdGroupUpdateRequest adGroupUpdateRequest4 = new OASAdGroupUpdateRequest();

        System.assert(adGroupUpdateRequest1.equals(adGroupUpdateRequest2));
        System.assert(adGroupUpdateRequest3.equals(adGroupUpdateRequest4));
        System.assertEquals(adGroupUpdateRequest1.hashCode(), adGroupUpdateRequest2.hashCode());
        System.assertEquals(adGroupUpdateRequest3.hashCode(), adGroupUpdateRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAdGroupUpdateRequest adGroupUpdateRequest = new OASAdGroupUpdateRequest();
        Map<String, String> x-property-mappings = adGroupUpdateRequest.getx-property-mappings();
        System.assertEquals('budgetInMicroCurrency', x-property-mappings.get('budget_in_micro_currency'));
        System.assertEquals('bidInMicroCurrency', x-property-mappings.get('bid_in_micro_currency'));
        System.assertEquals('optimizationGoalMetadata', x-property-mappings.get('optimization_goal_metadata'));
        System.assertEquals('budgetType', x-property-mappings.get('budget_type'));
        System.assertEquals('startTime', x-property-mappings.get('start_time'));
        System.assertEquals('endTime', x-property-mappings.get('end_time'));
        System.assertEquals('targetingSpec', x-property-mappings.get('targeting_spec'));
        System.assertEquals('lifetimeFrequencyCap', x-property-mappings.get('lifetime_frequency_cap'));
        System.assertEquals('trackingUrls', x-property-mappings.get('tracking_urls'));
        System.assertEquals('autoTargetingEnabled', x-property-mappings.get('auto_targeting_enabled'));
        System.assertEquals('placementGroup', x-property-mappings.get('placement_group'));
        System.assertEquals('pacingDeliveryType', x-property-mappings.get('pacing_delivery_type'));
        System.assertEquals('campaignId', x-property-mappings.get('campaign_id'));
        System.assertEquals('billableEvent', x-property-mappings.get('billable_event'));
        System.assertEquals('bidStrategyType', x-property-mappings.get('bid_strategy_type'));
    }
}
