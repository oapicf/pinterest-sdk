@isTest
private class OASAdGroupResponseAllOfTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdGroupResponseAllOf adGroupResponseAllOf1 = OASAdGroupResponseAllOf.getExample();
        OASAdGroupResponseAllOf adGroupResponseAllOf2 = adGroupResponseAllOf1;
        OASAdGroupResponseAllOf adGroupResponseAllOf3 = new OASAdGroupResponseAllOf();
        OASAdGroupResponseAllOf adGroupResponseAllOf4 = adGroupResponseAllOf3;

        System.assert(adGroupResponseAllOf1.equals(adGroupResponseAllOf2));
        System.assert(adGroupResponseAllOf2.equals(adGroupResponseAllOf1));
        System.assert(adGroupResponseAllOf1.equals(adGroupResponseAllOf1));
        System.assert(adGroupResponseAllOf3.equals(adGroupResponseAllOf4));
        System.assert(adGroupResponseAllOf4.equals(adGroupResponseAllOf3));
        System.assert(adGroupResponseAllOf3.equals(adGroupResponseAllOf3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdGroupResponseAllOf adGroupResponseAllOf1 = OASAdGroupResponseAllOf.getExample();
        OASAdGroupResponseAllOf adGroupResponseAllOf2 = OASAdGroupResponseAllOf.getExample();
        OASAdGroupResponseAllOf adGroupResponseAllOf3 = new OASAdGroupResponseAllOf();
        OASAdGroupResponseAllOf adGroupResponseAllOf4 = new OASAdGroupResponseAllOf();

        System.assert(adGroupResponseAllOf1.equals(adGroupResponseAllOf2));
        System.assert(adGroupResponseAllOf2.equals(adGroupResponseAllOf1));
        System.assert(adGroupResponseAllOf3.equals(adGroupResponseAllOf4));
        System.assert(adGroupResponseAllOf4.equals(adGroupResponseAllOf3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdGroupResponseAllOf adGroupResponseAllOf1 = OASAdGroupResponseAllOf.getExample();
        OASAdGroupResponseAllOf adGroupResponseAllOf2 = new OASAdGroupResponseAllOf();

        System.assertEquals(false, adGroupResponseAllOf1.equals('foo'));
        System.assertEquals(false, adGroupResponseAllOf2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdGroupResponseAllOf adGroupResponseAllOf1 = OASAdGroupResponseAllOf.getExample();
        OASAdGroupResponseAllOf adGroupResponseAllOf2 = new OASAdGroupResponseAllOf();
        OASAdGroupResponseAllOf adGroupResponseAllOf3;

        System.assertEquals(false, adGroupResponseAllOf1.equals(adGroupResponseAllOf3));
        System.assertEquals(false, adGroupResponseAllOf2.equals(adGroupResponseAllOf3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdGroupResponseAllOf adGroupResponseAllOf1 = OASAdGroupResponseAllOf.getExample();
        OASAdGroupResponseAllOf adGroupResponseAllOf2 = new OASAdGroupResponseAllOf();

        System.assertEquals(adGroupResponseAllOf1.hashCode(), adGroupResponseAllOf1.hashCode());
        System.assertEquals(adGroupResponseAllOf2.hashCode(), adGroupResponseAllOf2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdGroupResponseAllOf adGroupResponseAllOf1 = OASAdGroupResponseAllOf.getExample();
        OASAdGroupResponseAllOf adGroupResponseAllOf2 = OASAdGroupResponseAllOf.getExample();
        OASAdGroupResponseAllOf adGroupResponseAllOf3 = new OASAdGroupResponseAllOf();
        OASAdGroupResponseAllOf adGroupResponseAllOf4 = new OASAdGroupResponseAllOf();

        System.assert(adGroupResponseAllOf1.equals(adGroupResponseAllOf2));
        System.assert(adGroupResponseAllOf3.equals(adGroupResponseAllOf4));
        System.assertEquals(adGroupResponseAllOf1.hashCode(), adGroupResponseAllOf2.hashCode());
        System.assertEquals(adGroupResponseAllOf3.hashCode(), adGroupResponseAllOf4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAdGroupResponseAllOf adGroupResponseAllOf = new OASAdGroupResponseAllOf();
        Map<String, String> x-property-mappings = adGroupResponseAllOf.getx-property-mappings();
        System.assertEquals('budgetInMicroCurrency', x-property-mappings.get('budget_in_micro_currency'));
        System.assertEquals('bidInMicroCurrency', x-property-mappings.get('bid_in_micro_currency'));
        System.assertEquals('budgetType', x-property-mappings.get('budget_type'));
        System.assertEquals('startTime', x-property-mappings.get('start_time'));
        System.assertEquals('endTime', x-property-mappings.get('end_time'));
        System.assertEquals('targetingSpec', x-property-mappings.get('targeting_spec'));
        System.assertEquals('lifetimeFrequencyCap', x-property-mappings.get('lifetime_frequency_cap'));
        System.assertEquals('trackingUrls', x-property-mappings.get('tracking_urls'));
        System.assertEquals('autoTargetingEnabled', x-property-mappings.get('auto_targeting_enabled'));
        System.assertEquals('placementGroup', x-property-mappings.get('placement_group'));
        System.assertEquals('pacingDeliveryType', x-property-mappings.get('pacing_delivery_type'));
        System.assertEquals('conversionLearningModeType', x-property-mappings.get('conversion_learning_mode_type'));
        System.assertEquals('summaryStatus', x-property-mappings.get('summary_status'));
        System.assertEquals('feedProfileId', x-property-mappings.get('feed_profile_id'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAdGroupResponseAllOf adGroupResponseAllOf = new OASAdGroupResponseAllOf();
        System.assertEquals(new Map<String, List<String>>(), adGroupResponseAllOf.targetingSpec);
        System.assertEquals(null, adGroupResponseAllOf.name);
        System.assertEquals(null, adGroupResponseAllOf.status);
        System.assertEquals(null, adGroupResponseAllOf.budgetInMicroCurrency);
        System.assertEquals(null, adGroupResponseAllOf.bidInMicroCurrency);
        System.assertEquals(null, adGroupResponseAllOf.budgetType);
        System.assertEquals(null, adGroupResponseAllOf.startTime);
        System.assertEquals(null, adGroupResponseAllOf.endTime);
        System.assertEquals(null, adGroupResponseAllOf.lifetimeFrequencyCap);
        System.assertEquals(null, adGroupResponseAllOf.trackingUrls);
        System.assertEquals(null, adGroupResponseAllOf.autoTargetingEnabled);
        System.assertEquals(null, adGroupResponseAllOf.placementGroup);
        System.assertEquals(null, adGroupResponseAllOf.pacingDeliveryType);
        System.assertEquals(null, adGroupResponseAllOf.conversionLearningModeType);
        System.assertEquals(null, adGroupResponseAllOf.summaryStatus);
        System.assertEquals(null, adGroupResponseAllOf.feedProfileId);
    }
}
