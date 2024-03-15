@isTest
private class OASAdGroupCommonTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdGroupCommon adGroupCommon1 = OASAdGroupCommon.getExample();
        OASAdGroupCommon adGroupCommon2 = adGroupCommon1;
        OASAdGroupCommon adGroupCommon3 = new OASAdGroupCommon();
        OASAdGroupCommon adGroupCommon4 = adGroupCommon3;

        System.assert(adGroupCommon1.equals(adGroupCommon2));
        System.assert(adGroupCommon2.equals(adGroupCommon1));
        System.assert(adGroupCommon1.equals(adGroupCommon1));
        System.assert(adGroupCommon3.equals(adGroupCommon4));
        System.assert(adGroupCommon4.equals(adGroupCommon3));
        System.assert(adGroupCommon3.equals(adGroupCommon3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdGroupCommon adGroupCommon1 = OASAdGroupCommon.getExample();
        OASAdGroupCommon adGroupCommon2 = OASAdGroupCommon.getExample();
        OASAdGroupCommon adGroupCommon3 = new OASAdGroupCommon();
        OASAdGroupCommon adGroupCommon4 = new OASAdGroupCommon();

        System.assert(adGroupCommon1.equals(adGroupCommon2));
        System.assert(adGroupCommon2.equals(adGroupCommon1));
        System.assert(adGroupCommon3.equals(adGroupCommon4));
        System.assert(adGroupCommon4.equals(adGroupCommon3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdGroupCommon adGroupCommon1 = OASAdGroupCommon.getExample();
        OASAdGroupCommon adGroupCommon2 = new OASAdGroupCommon();

        System.assertEquals(false, adGroupCommon1.equals('foo'));
        System.assertEquals(false, adGroupCommon2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdGroupCommon adGroupCommon1 = OASAdGroupCommon.getExample();
        OASAdGroupCommon adGroupCommon2 = new OASAdGroupCommon();
        OASAdGroupCommon adGroupCommon3;

        System.assertEquals(false, adGroupCommon1.equals(adGroupCommon3));
        System.assertEquals(false, adGroupCommon2.equals(adGroupCommon3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdGroupCommon adGroupCommon1 = OASAdGroupCommon.getExample();
        OASAdGroupCommon adGroupCommon2 = new OASAdGroupCommon();

        System.assertEquals(adGroupCommon1.hashCode(), adGroupCommon1.hashCode());
        System.assertEquals(adGroupCommon2.hashCode(), adGroupCommon2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdGroupCommon adGroupCommon1 = OASAdGroupCommon.getExample();
        OASAdGroupCommon adGroupCommon2 = OASAdGroupCommon.getExample();
        OASAdGroupCommon adGroupCommon3 = new OASAdGroupCommon();
        OASAdGroupCommon adGroupCommon4 = new OASAdGroupCommon();

        System.assert(adGroupCommon1.equals(adGroupCommon2));
        System.assert(adGroupCommon3.equals(adGroupCommon4));
        System.assertEquals(adGroupCommon1.hashCode(), adGroupCommon2.hashCode());
        System.assertEquals(adGroupCommon3.hashCode(), adGroupCommon4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAdGroupCommon adGroupCommon = new OASAdGroupCommon();
        Map<String, String> x-property-mappings = adGroupCommon.getx-property-mappings();
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
