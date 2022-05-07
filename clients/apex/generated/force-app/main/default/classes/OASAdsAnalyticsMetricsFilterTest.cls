@isTest
private class OASAdsAnalyticsMetricsFilterTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdsAnalyticsMetricsFilter adsAnalyticsMetricsFilter1 = OASAdsAnalyticsMetricsFilter.getExample();
        OASAdsAnalyticsMetricsFilter adsAnalyticsMetricsFilter2 = adsAnalyticsMetricsFilter1;
        OASAdsAnalyticsMetricsFilter adsAnalyticsMetricsFilter3 = new OASAdsAnalyticsMetricsFilter();
        OASAdsAnalyticsMetricsFilter adsAnalyticsMetricsFilter4 = adsAnalyticsMetricsFilter3;

        System.assert(adsAnalyticsMetricsFilter1.equals(adsAnalyticsMetricsFilter2));
        System.assert(adsAnalyticsMetricsFilter2.equals(adsAnalyticsMetricsFilter1));
        System.assert(adsAnalyticsMetricsFilter1.equals(adsAnalyticsMetricsFilter1));
        System.assert(adsAnalyticsMetricsFilter3.equals(adsAnalyticsMetricsFilter4));
        System.assert(adsAnalyticsMetricsFilter4.equals(adsAnalyticsMetricsFilter3));
        System.assert(adsAnalyticsMetricsFilter3.equals(adsAnalyticsMetricsFilter3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdsAnalyticsMetricsFilter adsAnalyticsMetricsFilter1 = OASAdsAnalyticsMetricsFilter.getExample();
        OASAdsAnalyticsMetricsFilter adsAnalyticsMetricsFilter2 = OASAdsAnalyticsMetricsFilter.getExample();
        OASAdsAnalyticsMetricsFilter adsAnalyticsMetricsFilter3 = new OASAdsAnalyticsMetricsFilter();
        OASAdsAnalyticsMetricsFilter adsAnalyticsMetricsFilter4 = new OASAdsAnalyticsMetricsFilter();

        System.assert(adsAnalyticsMetricsFilter1.equals(adsAnalyticsMetricsFilter2));
        System.assert(adsAnalyticsMetricsFilter2.equals(adsAnalyticsMetricsFilter1));
        System.assert(adsAnalyticsMetricsFilter3.equals(adsAnalyticsMetricsFilter4));
        System.assert(adsAnalyticsMetricsFilter4.equals(adsAnalyticsMetricsFilter3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdsAnalyticsMetricsFilter adsAnalyticsMetricsFilter1 = OASAdsAnalyticsMetricsFilter.getExample();
        OASAdsAnalyticsMetricsFilter adsAnalyticsMetricsFilter2 = new OASAdsAnalyticsMetricsFilter();

        System.assertEquals(false, adsAnalyticsMetricsFilter1.equals('foo'));
        System.assertEquals(false, adsAnalyticsMetricsFilter2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdsAnalyticsMetricsFilter adsAnalyticsMetricsFilter1 = OASAdsAnalyticsMetricsFilter.getExample();
        OASAdsAnalyticsMetricsFilter adsAnalyticsMetricsFilter2 = new OASAdsAnalyticsMetricsFilter();
        OASAdsAnalyticsMetricsFilter adsAnalyticsMetricsFilter3;

        System.assertEquals(false, adsAnalyticsMetricsFilter1.equals(adsAnalyticsMetricsFilter3));
        System.assertEquals(false, adsAnalyticsMetricsFilter2.equals(adsAnalyticsMetricsFilter3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdsAnalyticsMetricsFilter adsAnalyticsMetricsFilter1 = OASAdsAnalyticsMetricsFilter.getExample();
        OASAdsAnalyticsMetricsFilter adsAnalyticsMetricsFilter2 = new OASAdsAnalyticsMetricsFilter();

        System.assertEquals(adsAnalyticsMetricsFilter1.hashCode(), adsAnalyticsMetricsFilter1.hashCode());
        System.assertEquals(adsAnalyticsMetricsFilter2.hashCode(), adsAnalyticsMetricsFilter2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdsAnalyticsMetricsFilter adsAnalyticsMetricsFilter1 = OASAdsAnalyticsMetricsFilter.getExample();
        OASAdsAnalyticsMetricsFilter adsAnalyticsMetricsFilter2 = OASAdsAnalyticsMetricsFilter.getExample();
        OASAdsAnalyticsMetricsFilter adsAnalyticsMetricsFilter3 = new OASAdsAnalyticsMetricsFilter();
        OASAdsAnalyticsMetricsFilter adsAnalyticsMetricsFilter4 = new OASAdsAnalyticsMetricsFilter();

        System.assert(adsAnalyticsMetricsFilter1.equals(adsAnalyticsMetricsFilter2));
        System.assert(adsAnalyticsMetricsFilter3.equals(adsAnalyticsMetricsFilter4));
        System.assertEquals(adsAnalyticsMetricsFilter1.hashCode(), adsAnalyticsMetricsFilter2.hashCode());
        System.assertEquals(adsAnalyticsMetricsFilter3.hashCode(), adsAnalyticsMetricsFilter4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAdsAnalyticsMetricsFilter adsAnalyticsMetricsFilter = new OASAdsAnalyticsMetricsFilter();
        System.assertEquals(new List<Double>(), adsAnalyticsMetricsFilter.values);
        System.assertEquals(null, adsAnalyticsMetricsFilter.field);
        System.assertEquals(null, adsAnalyticsMetricsFilter.operator);
    }
}
