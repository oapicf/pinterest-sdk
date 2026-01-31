@isTest
private class OASAdsAnalyticsCreateAsyncRequestAllTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdsAnalyticsCreateAsyncRequestAll adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics1 = OASAdsAnalyticsCreateAsyncRequestAll.getExample();
        OASAdsAnalyticsCreateAsyncRequestAll adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics2 = adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics1;
        OASAdsAnalyticsCreateAsyncRequestAll adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics3 = new OASAdsAnalyticsCreateAsyncRequestAll();
        OASAdsAnalyticsCreateAsyncRequestAll adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics4 = adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics3;

        System.assert(adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics1.equals(adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics2));
        System.assert(adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics2.equals(adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics1));
        System.assert(adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics1.equals(adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics1));
        System.assert(adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics3.equals(adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics4));
        System.assert(adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics4.equals(adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics3));
        System.assert(adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics3.equals(adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdsAnalyticsCreateAsyncRequestAll adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics1 = OASAdsAnalyticsCreateAsyncRequestAll.getExample();
        OASAdsAnalyticsCreateAsyncRequestAll adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics2 = OASAdsAnalyticsCreateAsyncRequestAll.getExample();
        OASAdsAnalyticsCreateAsyncRequestAll adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics3 = new OASAdsAnalyticsCreateAsyncRequestAll();
        OASAdsAnalyticsCreateAsyncRequestAll adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics4 = new OASAdsAnalyticsCreateAsyncRequestAll();

        System.assert(adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics1.equals(adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics2));
        System.assert(adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics2.equals(adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics1));
        System.assert(adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics3.equals(adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics4));
        System.assert(adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics4.equals(adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdsAnalyticsCreateAsyncRequestAll adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics1 = OASAdsAnalyticsCreateAsyncRequestAll.getExample();
        OASAdsAnalyticsCreateAsyncRequestAll adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics2 = new OASAdsAnalyticsCreateAsyncRequestAll();

        System.assertEquals(false, adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics1.equals('foo'));
        System.assertEquals(false, adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdsAnalyticsCreateAsyncRequestAll adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics1 = OASAdsAnalyticsCreateAsyncRequestAll.getExample();
        OASAdsAnalyticsCreateAsyncRequestAll adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics2 = new OASAdsAnalyticsCreateAsyncRequestAll();
        OASAdsAnalyticsCreateAsyncRequestAll adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics3;

        System.assertEquals(false, adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics1.equals(adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics3));
        System.assertEquals(false, adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics2.equals(adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdsAnalyticsCreateAsyncRequestAll adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics1 = OASAdsAnalyticsCreateAsyncRequestAll.getExample();
        OASAdsAnalyticsCreateAsyncRequestAll adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics2 = new OASAdsAnalyticsCreateAsyncRequestAll();

        System.assertEquals(adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics1.hashCode(), adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics1.hashCode());
        System.assertEquals(adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics2.hashCode(), adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdsAnalyticsCreateAsyncRequestAll adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics1 = OASAdsAnalyticsCreateAsyncRequestAll.getExample();
        OASAdsAnalyticsCreateAsyncRequestAll adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics2 = OASAdsAnalyticsCreateAsyncRequestAll.getExample();
        OASAdsAnalyticsCreateAsyncRequestAll adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics3 = new OASAdsAnalyticsCreateAsyncRequestAll();
        OASAdsAnalyticsCreateAsyncRequestAll adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics4 = new OASAdsAnalyticsCreateAsyncRequestAll();

        System.assert(adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics1.equals(adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics2));
        System.assert(adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics3.equals(adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics4));
        System.assertEquals(adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics1.hashCode(), adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics2.hashCode());
        System.assertEquals(adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics3.hashCode(), adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAdsAnalyticsCreateAsyncRequestAll adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics = new OASAdsAnalyticsCreateAsyncRequestAll();
        Map<String, String> x-property-mappings = adsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics.getx-property-mappings();
        System.assertEquals('customEventMetricsType', x-property-mappings.get('custom_event_metrics_type'));
        System.assertEquals('customEventName', x-property-mappings.get('custom_event_name'));
    }
}
