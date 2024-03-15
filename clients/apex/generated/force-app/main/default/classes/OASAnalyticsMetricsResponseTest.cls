@isTest
private class OASAnalyticsMetricsResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASAnalyticsMetricsResponse analyticsMetricsResponse1 = OASAnalyticsMetricsResponse.getExample();
        OASAnalyticsMetricsResponse analyticsMetricsResponse2 = analyticsMetricsResponse1;
        OASAnalyticsMetricsResponse analyticsMetricsResponse3 = new OASAnalyticsMetricsResponse();
        OASAnalyticsMetricsResponse analyticsMetricsResponse4 = analyticsMetricsResponse3;

        System.assert(analyticsMetricsResponse1.equals(analyticsMetricsResponse2));
        System.assert(analyticsMetricsResponse2.equals(analyticsMetricsResponse1));
        System.assert(analyticsMetricsResponse1.equals(analyticsMetricsResponse1));
        System.assert(analyticsMetricsResponse3.equals(analyticsMetricsResponse4));
        System.assert(analyticsMetricsResponse4.equals(analyticsMetricsResponse3));
        System.assert(analyticsMetricsResponse3.equals(analyticsMetricsResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAnalyticsMetricsResponse analyticsMetricsResponse1 = OASAnalyticsMetricsResponse.getExample();
        OASAnalyticsMetricsResponse analyticsMetricsResponse2 = OASAnalyticsMetricsResponse.getExample();
        OASAnalyticsMetricsResponse analyticsMetricsResponse3 = new OASAnalyticsMetricsResponse();
        OASAnalyticsMetricsResponse analyticsMetricsResponse4 = new OASAnalyticsMetricsResponse();

        System.assert(analyticsMetricsResponse1.equals(analyticsMetricsResponse2));
        System.assert(analyticsMetricsResponse2.equals(analyticsMetricsResponse1));
        System.assert(analyticsMetricsResponse3.equals(analyticsMetricsResponse4));
        System.assert(analyticsMetricsResponse4.equals(analyticsMetricsResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAnalyticsMetricsResponse analyticsMetricsResponse1 = OASAnalyticsMetricsResponse.getExample();
        OASAnalyticsMetricsResponse analyticsMetricsResponse2 = new OASAnalyticsMetricsResponse();

        System.assertEquals(false, analyticsMetricsResponse1.equals('foo'));
        System.assertEquals(false, analyticsMetricsResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAnalyticsMetricsResponse analyticsMetricsResponse1 = OASAnalyticsMetricsResponse.getExample();
        OASAnalyticsMetricsResponse analyticsMetricsResponse2 = new OASAnalyticsMetricsResponse();
        OASAnalyticsMetricsResponse analyticsMetricsResponse3;

        System.assertEquals(false, analyticsMetricsResponse1.equals(analyticsMetricsResponse3));
        System.assertEquals(false, analyticsMetricsResponse2.equals(analyticsMetricsResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAnalyticsMetricsResponse analyticsMetricsResponse1 = OASAnalyticsMetricsResponse.getExample();
        OASAnalyticsMetricsResponse analyticsMetricsResponse2 = new OASAnalyticsMetricsResponse();

        System.assertEquals(analyticsMetricsResponse1.hashCode(), analyticsMetricsResponse1.hashCode());
        System.assertEquals(analyticsMetricsResponse2.hashCode(), analyticsMetricsResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAnalyticsMetricsResponse analyticsMetricsResponse1 = OASAnalyticsMetricsResponse.getExample();
        OASAnalyticsMetricsResponse analyticsMetricsResponse2 = OASAnalyticsMetricsResponse.getExample();
        OASAnalyticsMetricsResponse analyticsMetricsResponse3 = new OASAnalyticsMetricsResponse();
        OASAnalyticsMetricsResponse analyticsMetricsResponse4 = new OASAnalyticsMetricsResponse();

        System.assert(analyticsMetricsResponse1.equals(analyticsMetricsResponse2));
        System.assert(analyticsMetricsResponse3.equals(analyticsMetricsResponse4));
        System.assertEquals(analyticsMetricsResponse1.hashCode(), analyticsMetricsResponse2.hashCode());
        System.assertEquals(analyticsMetricsResponse3.hashCode(), analyticsMetricsResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAnalyticsMetricsResponse analyticsMetricsResponse = new OASAnalyticsMetricsResponse();
        Map<String, String> x-property-mappings = analyticsMetricsResponse.getx-property-mappings();
        System.assertEquals('summaryMetrics', x-property-mappings.get('summary_metrics'));
        System.assertEquals('dailyMetrics', x-property-mappings.get('daily_metrics'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAnalyticsMetricsResponse analyticsMetricsResponse = new OASAnalyticsMetricsResponse();
        System.assertEquals(new Map<String, Double>(), analyticsMetricsResponse.summaryMetrics);
        System.assertEquals(new List<OASAnalyticsDailyMetrics>(), analyticsMetricsResponse.dailyMetrics);
    }
}
