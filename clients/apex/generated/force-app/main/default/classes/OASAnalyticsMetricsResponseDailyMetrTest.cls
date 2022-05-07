@isTest
private class OASAnalyticsMetricsResponseDailyMetrTest {
    @isTest
    private static void equalsSameInstance() {
        OASAnalyticsMetricsResponseDailyMetr analyticsMetricsResponseDailyMetrics1 = OASAnalyticsMetricsResponseDailyMetr.getExample();
        OASAnalyticsMetricsResponseDailyMetr analyticsMetricsResponseDailyMetrics2 = analyticsMetricsResponseDailyMetrics1;
        OASAnalyticsMetricsResponseDailyMetr analyticsMetricsResponseDailyMetrics3 = new OASAnalyticsMetricsResponseDailyMetr();
        OASAnalyticsMetricsResponseDailyMetr analyticsMetricsResponseDailyMetrics4 = analyticsMetricsResponseDailyMetrics3;

        System.assert(analyticsMetricsResponseDailyMetrics1.equals(analyticsMetricsResponseDailyMetrics2));
        System.assert(analyticsMetricsResponseDailyMetrics2.equals(analyticsMetricsResponseDailyMetrics1));
        System.assert(analyticsMetricsResponseDailyMetrics1.equals(analyticsMetricsResponseDailyMetrics1));
        System.assert(analyticsMetricsResponseDailyMetrics3.equals(analyticsMetricsResponseDailyMetrics4));
        System.assert(analyticsMetricsResponseDailyMetrics4.equals(analyticsMetricsResponseDailyMetrics3));
        System.assert(analyticsMetricsResponseDailyMetrics3.equals(analyticsMetricsResponseDailyMetrics3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAnalyticsMetricsResponseDailyMetr analyticsMetricsResponseDailyMetrics1 = OASAnalyticsMetricsResponseDailyMetr.getExample();
        OASAnalyticsMetricsResponseDailyMetr analyticsMetricsResponseDailyMetrics2 = OASAnalyticsMetricsResponseDailyMetr.getExample();
        OASAnalyticsMetricsResponseDailyMetr analyticsMetricsResponseDailyMetrics3 = new OASAnalyticsMetricsResponseDailyMetr();
        OASAnalyticsMetricsResponseDailyMetr analyticsMetricsResponseDailyMetrics4 = new OASAnalyticsMetricsResponseDailyMetr();

        System.assert(analyticsMetricsResponseDailyMetrics1.equals(analyticsMetricsResponseDailyMetrics2));
        System.assert(analyticsMetricsResponseDailyMetrics2.equals(analyticsMetricsResponseDailyMetrics1));
        System.assert(analyticsMetricsResponseDailyMetrics3.equals(analyticsMetricsResponseDailyMetrics4));
        System.assert(analyticsMetricsResponseDailyMetrics4.equals(analyticsMetricsResponseDailyMetrics3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAnalyticsMetricsResponseDailyMetr analyticsMetricsResponseDailyMetrics1 = OASAnalyticsMetricsResponseDailyMetr.getExample();
        OASAnalyticsMetricsResponseDailyMetr analyticsMetricsResponseDailyMetrics2 = new OASAnalyticsMetricsResponseDailyMetr();

        System.assertEquals(false, analyticsMetricsResponseDailyMetrics1.equals('foo'));
        System.assertEquals(false, analyticsMetricsResponseDailyMetrics2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAnalyticsMetricsResponseDailyMetr analyticsMetricsResponseDailyMetrics1 = OASAnalyticsMetricsResponseDailyMetr.getExample();
        OASAnalyticsMetricsResponseDailyMetr analyticsMetricsResponseDailyMetrics2 = new OASAnalyticsMetricsResponseDailyMetr();
        OASAnalyticsMetricsResponseDailyMetr analyticsMetricsResponseDailyMetrics3;

        System.assertEquals(false, analyticsMetricsResponseDailyMetrics1.equals(analyticsMetricsResponseDailyMetrics3));
        System.assertEquals(false, analyticsMetricsResponseDailyMetrics2.equals(analyticsMetricsResponseDailyMetrics3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAnalyticsMetricsResponseDailyMetr analyticsMetricsResponseDailyMetrics1 = OASAnalyticsMetricsResponseDailyMetr.getExample();
        OASAnalyticsMetricsResponseDailyMetr analyticsMetricsResponseDailyMetrics2 = new OASAnalyticsMetricsResponseDailyMetr();

        System.assertEquals(analyticsMetricsResponseDailyMetrics1.hashCode(), analyticsMetricsResponseDailyMetrics1.hashCode());
        System.assertEquals(analyticsMetricsResponseDailyMetrics2.hashCode(), analyticsMetricsResponseDailyMetrics2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAnalyticsMetricsResponseDailyMetr analyticsMetricsResponseDailyMetrics1 = OASAnalyticsMetricsResponseDailyMetr.getExample();
        OASAnalyticsMetricsResponseDailyMetr analyticsMetricsResponseDailyMetrics2 = OASAnalyticsMetricsResponseDailyMetr.getExample();
        OASAnalyticsMetricsResponseDailyMetr analyticsMetricsResponseDailyMetrics3 = new OASAnalyticsMetricsResponseDailyMetr();
        OASAnalyticsMetricsResponseDailyMetr analyticsMetricsResponseDailyMetrics4 = new OASAnalyticsMetricsResponseDailyMetr();

        System.assert(analyticsMetricsResponseDailyMetrics1.equals(analyticsMetricsResponseDailyMetrics2));
        System.assert(analyticsMetricsResponseDailyMetrics3.equals(analyticsMetricsResponseDailyMetrics4));
        System.assertEquals(analyticsMetricsResponseDailyMetrics1.hashCode(), analyticsMetricsResponseDailyMetrics2.hashCode());
        System.assertEquals(analyticsMetricsResponseDailyMetrics3.hashCode(), analyticsMetricsResponseDailyMetrics4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAnalyticsMetricsResponseDailyMetr analyticsMetricsResponseDailyMetrics = new OASAnalyticsMetricsResponseDailyMetr();
        Map<String, String> x-property-mappings = analyticsMetricsResponseDailyMetrics.getx-property-mappings();
        System.assertEquals('dataStatus', x-property-mappings.get('data_status'));
        System.assertEquals('r_date', x-property-mappings.get('date'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAnalyticsMetricsResponseDailyMetr analyticsMetricsResponseDailyMetrics = new OASAnalyticsMetricsResponseDailyMetr();
        System.assertEquals(new Map<String, Double>(), analyticsMetricsResponseDailyMetrics.metrics);
        System.assertEquals(null, analyticsMetricsResponseDailyMetrics.dataStatus);
        System.assertEquals(null, analyticsMetricsResponseDailyMetrics.r_date);
    }
}
