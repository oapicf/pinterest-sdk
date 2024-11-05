@isTest
private class OASAdGroupResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdGroupResponse adGroupResponse1 = OASAdGroupResponse.getExample();
        OASAdGroupResponse adGroupResponse2 = adGroupResponse1;
        OASAdGroupResponse adGroupResponse3 = new OASAdGroupResponse();
        OASAdGroupResponse adGroupResponse4 = adGroupResponse3;

        System.assert(adGroupResponse1.equals(adGroupResponse2));
        System.assert(adGroupResponse2.equals(adGroupResponse1));
        System.assert(adGroupResponse1.equals(adGroupResponse1));
        System.assert(adGroupResponse3.equals(adGroupResponse4));
        System.assert(adGroupResponse4.equals(adGroupResponse3));
        System.assert(adGroupResponse3.equals(adGroupResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdGroupResponse adGroupResponse1 = OASAdGroupResponse.getExample();
        OASAdGroupResponse adGroupResponse2 = OASAdGroupResponse.getExample();
        OASAdGroupResponse adGroupResponse3 = new OASAdGroupResponse();
        OASAdGroupResponse adGroupResponse4 = new OASAdGroupResponse();

        System.assert(adGroupResponse1.equals(adGroupResponse2));
        System.assert(adGroupResponse2.equals(adGroupResponse1));
        System.assert(adGroupResponse3.equals(adGroupResponse4));
        System.assert(adGroupResponse4.equals(adGroupResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdGroupResponse adGroupResponse1 = OASAdGroupResponse.getExample();
        OASAdGroupResponse adGroupResponse2 = new OASAdGroupResponse();

        System.assertEquals(false, adGroupResponse1.equals('foo'));
        System.assertEquals(false, adGroupResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdGroupResponse adGroupResponse1 = OASAdGroupResponse.getExample();
        OASAdGroupResponse adGroupResponse2 = new OASAdGroupResponse();
        OASAdGroupResponse adGroupResponse3;

        System.assertEquals(false, adGroupResponse1.equals(adGroupResponse3));
        System.assertEquals(false, adGroupResponse2.equals(adGroupResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdGroupResponse adGroupResponse1 = OASAdGroupResponse.getExample();
        OASAdGroupResponse adGroupResponse2 = new OASAdGroupResponse();

        System.assertEquals(adGroupResponse1.hashCode(), adGroupResponse1.hashCode());
        System.assertEquals(adGroupResponse2.hashCode(), adGroupResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdGroupResponse adGroupResponse1 = OASAdGroupResponse.getExample();
        OASAdGroupResponse adGroupResponse2 = OASAdGroupResponse.getExample();
        OASAdGroupResponse adGroupResponse3 = new OASAdGroupResponse();
        OASAdGroupResponse adGroupResponse4 = new OASAdGroupResponse();

        System.assert(adGroupResponse1.equals(adGroupResponse2));
        System.assert(adGroupResponse3.equals(adGroupResponse4));
        System.assertEquals(adGroupResponse1.hashCode(), adGroupResponse2.hashCode());
        System.assertEquals(adGroupResponse3.hashCode(), adGroupResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAdGroupResponse adGroupResponse = new OASAdGroupResponse();
        Map<String, String> x-property-mappings = adGroupResponse.getx-property-mappings();
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
        System.assertEquals('adAccountId', x-property-mappings.get('ad_account_id'));
        System.assertEquals('createdTime', x-property-mappings.get('created_time'));
        System.assertEquals('updatedTime', x-property-mappings.get('updated_time'));
        System.assertEquals('conversionLearningModeType', x-property-mappings.get('conversion_learning_mode_type'));
        System.assertEquals('summaryStatus', x-property-mappings.get('summary_status'));
        System.assertEquals('feedProfileId', x-property-mappings.get('feed_profile_id'));
        System.assertEquals('dcaAssets', x-property-mappings.get('dca_assets'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAdGroupResponse adGroupResponse = new OASAdGroupResponse();
        System.assertEquals(new List<String>(), adGroupResponse.targetingTemplateIds);
        System.assertEquals('adgroup', adGroupResponse.type);
        System.assertEquals(null, adGroupResponse.name);
        System.assertEquals(null, adGroupResponse.status);
        System.assertEquals(null, adGroupResponse.budgetInMicroCurrency);
        System.assertEquals(null, adGroupResponse.bidInMicroCurrency);
        System.assertEquals(null, adGroupResponse.optimizationGoalMetadata);
        System.assertEquals(null, adGroupResponse.budgetType);
        System.assertEquals(null, adGroupResponse.startTime);
        System.assertEquals(null, adGroupResponse.endTime);
        System.assertEquals(null, adGroupResponse.targetingSpec);
        System.assertEquals(null, adGroupResponse.lifetimeFrequencyCap);
        System.assertEquals(null, adGroupResponse.trackingUrls);
        System.assertEquals(null, adGroupResponse.autoTargetingEnabled);
        System.assertEquals(null, adGroupResponse.placementGroup);
        System.assertEquals(null, adGroupResponse.pacingDeliveryType);
        System.assertEquals(null, adGroupResponse.campaignId);
        System.assertEquals(null, adGroupResponse.billableEvent);
        System.assertEquals(null, adGroupResponse.bidStrategyType);
        System.assertEquals(null, adGroupResponse.id);
        System.assertEquals(null, adGroupResponse.adAccountId);
        System.assertEquals(null, adGroupResponse.createdTime);
        System.assertEquals(null, adGroupResponse.updatedTime);
        System.assertEquals(null, adGroupResponse.conversionLearningModeType);
        System.assertEquals(null, adGroupResponse.summaryStatus);
        System.assertEquals(null, adGroupResponse.feedProfileId);
        System.assertEquals(null, adGroupResponse.dcaAssets);
    }
}
