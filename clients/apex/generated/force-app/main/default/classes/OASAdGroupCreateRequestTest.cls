@isTest
private class OASAdGroupCreateRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdGroupCreateRequest adGroupCreateRequest1 = OASAdGroupCreateRequest.getExample();
        OASAdGroupCreateRequest adGroupCreateRequest2 = adGroupCreateRequest1;
        OASAdGroupCreateRequest adGroupCreateRequest3 = new OASAdGroupCreateRequest();
        OASAdGroupCreateRequest adGroupCreateRequest4 = adGroupCreateRequest3;

        System.assert(adGroupCreateRequest1.equals(adGroupCreateRequest2));
        System.assert(adGroupCreateRequest2.equals(adGroupCreateRequest1));
        System.assert(adGroupCreateRequest1.equals(adGroupCreateRequest1));
        System.assert(adGroupCreateRequest3.equals(adGroupCreateRequest4));
        System.assert(adGroupCreateRequest4.equals(adGroupCreateRequest3));
        System.assert(adGroupCreateRequest3.equals(adGroupCreateRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdGroupCreateRequest adGroupCreateRequest1 = OASAdGroupCreateRequest.getExample();
        OASAdGroupCreateRequest adGroupCreateRequest2 = OASAdGroupCreateRequest.getExample();
        OASAdGroupCreateRequest adGroupCreateRequest3 = new OASAdGroupCreateRequest();
        OASAdGroupCreateRequest adGroupCreateRequest4 = new OASAdGroupCreateRequest();

        System.assert(adGroupCreateRequest1.equals(adGroupCreateRequest2));
        System.assert(adGroupCreateRequest2.equals(adGroupCreateRequest1));
        System.assert(adGroupCreateRequest3.equals(adGroupCreateRequest4));
        System.assert(adGroupCreateRequest4.equals(adGroupCreateRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdGroupCreateRequest adGroupCreateRequest1 = OASAdGroupCreateRequest.getExample();
        OASAdGroupCreateRequest adGroupCreateRequest2 = new OASAdGroupCreateRequest();

        System.assertEquals(false, adGroupCreateRequest1.equals('foo'));
        System.assertEquals(false, adGroupCreateRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdGroupCreateRequest adGroupCreateRequest1 = OASAdGroupCreateRequest.getExample();
        OASAdGroupCreateRequest adGroupCreateRequest2 = new OASAdGroupCreateRequest();
        OASAdGroupCreateRequest adGroupCreateRequest3;

        System.assertEquals(false, adGroupCreateRequest1.equals(adGroupCreateRequest3));
        System.assertEquals(false, adGroupCreateRequest2.equals(adGroupCreateRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdGroupCreateRequest adGroupCreateRequest1 = OASAdGroupCreateRequest.getExample();
        OASAdGroupCreateRequest adGroupCreateRequest2 = new OASAdGroupCreateRequest();

        System.assertEquals(adGroupCreateRequest1.hashCode(), adGroupCreateRequest1.hashCode());
        System.assertEquals(adGroupCreateRequest2.hashCode(), adGroupCreateRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdGroupCreateRequest adGroupCreateRequest1 = OASAdGroupCreateRequest.getExample();
        OASAdGroupCreateRequest adGroupCreateRequest2 = OASAdGroupCreateRequest.getExample();
        OASAdGroupCreateRequest adGroupCreateRequest3 = new OASAdGroupCreateRequest();
        OASAdGroupCreateRequest adGroupCreateRequest4 = new OASAdGroupCreateRequest();

        System.assert(adGroupCreateRequest1.equals(adGroupCreateRequest2));
        System.assert(adGroupCreateRequest3.equals(adGroupCreateRequest4));
        System.assertEquals(adGroupCreateRequest1.hashCode(), adGroupCreateRequest2.hashCode());
        System.assertEquals(adGroupCreateRequest3.hashCode(), adGroupCreateRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAdGroupCreateRequest adGroupCreateRequest = new OASAdGroupCreateRequest();
        Map<String, String> x-property-mappings = adGroupCreateRequest.getx-property-mappings();
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
        System.assertEquals('targetingTemplateIds', x-property-mappings.get('targeting_template_ids'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAdGroupCreateRequest adGroupCreateRequest = new OASAdGroupCreateRequest();
        System.assertEquals('DAILY', adGroupCreateRequest.budgetType);
        System.assertEquals('STANDARD', adGroupCreateRequest.pacingDeliveryType);
        System.assertEquals(new List<String>(), adGroupCreateRequest.targetingTemplateIds);
        System.assertEquals(null, adGroupCreateRequest.name);
        System.assertEquals(null, adGroupCreateRequest.status);
        System.assertEquals(null, adGroupCreateRequest.budgetInMicroCurrency);
        System.assertEquals(null, adGroupCreateRequest.bidInMicroCurrency);
        System.assertEquals(null, adGroupCreateRequest.optimizationGoalMetadata);
        System.assertEquals(null, adGroupCreateRequest.startTime);
        System.assertEquals(null, adGroupCreateRequest.endTime);
        System.assertEquals(null, adGroupCreateRequest.targetingSpec);
        System.assertEquals(null, adGroupCreateRequest.lifetimeFrequencyCap);
        System.assertEquals(null, adGroupCreateRequest.trackingUrls);
        System.assertEquals(null, adGroupCreateRequest.autoTargetingEnabled);
        System.assertEquals(null, adGroupCreateRequest.placementGroup);
        System.assertEquals(null, adGroupCreateRequest.campaignId);
        System.assertEquals(null, adGroupCreateRequest.billableEvent);
        System.assertEquals(null, adGroupCreateRequest.bidStrategyType);
    }
}
