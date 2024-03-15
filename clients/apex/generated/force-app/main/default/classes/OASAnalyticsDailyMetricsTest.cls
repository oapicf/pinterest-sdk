@isTest
private class OASAnalyticsDailyMetricsTest {
    @isTest
    private static void equalsSameInstance() {
        OASAnalyticsDailyMetrics analyticsDailyMetrics1 = OASAnalyticsDailyMetrics.getExample();
        OASAnalyticsDailyMetrics analyticsDailyMetrics2 = analyticsDailyMetrics1;
        OASAnalyticsDailyMetrics analyticsDailyMetrics3 = new OASAnalyticsDailyMetrics();
        OASAnalyticsDailyMetrics analyticsDailyMetrics4 = analyticsDailyMetrics3;

        System.assert(analyticsDailyMetrics1.equals(analyticsDailyMetrics2));
        System.assert(analyticsDailyMetrics2.equals(analyticsDailyMetrics1));
        System.assert(analyticsDailyMetrics1.equals(analyticsDailyMetrics1));
        System.assert(analyticsDailyMetrics3.equals(analyticsDailyMetrics4));
        System.assert(analyticsDailyMetrics4.equals(analyticsDailyMetrics3));
        System.assert(analyticsDailyMetrics3.equals(analyticsDailyMetrics3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAnalyticsDailyMetrics analyticsDailyMetrics1 = OASAnalyticsDailyMetrics.getExample();
        OASAnalyticsDailyMetrics analyticsDailyMetrics2 = OASAnalyticsDailyMetrics.getExample();
        OASAnalyticsDailyMetrics analyticsDailyMetrics3 = new OASAnalyticsDailyMetrics();
        OASAnalyticsDailyMetrics analyticsDailyMetrics4 = new OASAnalyticsDailyMetrics();

        System.assert(analyticsDailyMetrics1.equals(analyticsDailyMetrics2));
        System.assert(analyticsDailyMetrics2.equals(analyticsDailyMetrics1));
        System.assert(analyticsDailyMetrics3.equals(analyticsDailyMetrics4));
        System.assert(analyticsDailyMetrics4.equals(analyticsDailyMetrics3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAnalyticsDailyMetrics analyticsDailyMetrics1 = OASAnalyticsDailyMetrics.getExample();
        OASAnalyticsDailyMetrics analyticsDailyMetrics2 = new OASAnalyticsDailyMetrics();

        System.assertEquals(false, analyticsDailyMetrics1.equals('foo'));
        System.assertEquals(false, analyticsDailyMetrics2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAnalyticsDailyMetrics analyticsDailyMetrics1 = OASAnalyticsDailyMetrics.getExample();
        OASAnalyticsDailyMetrics analyticsDailyMetrics2 = new OASAnalyticsDailyMetrics();
        OASAnalyticsDailyMetrics analyticsDailyMetrics3;

        System.assertEquals(false, analyticsDailyMetrics1.equals(analyticsDailyMetrics3));
        System.assertEquals(false, analyticsDailyMetrics2.equals(analyticsDailyMetrics3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAnalyticsDailyMetrics analyticsDailyMetrics1 = OASAnalyticsDailyMetrics.getExample();
        OASAnalyticsDailyMetrics analyticsDailyMetrics2 = new OASAnalyticsDailyMetrics();

        System.assertEquals(analyticsDailyMetrics1.hashCode(), analyticsDailyMetrics1.hashCode());
        System.assertEquals(analyticsDailyMetrics2.hashCode(), analyticsDailyMetrics2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAnalyticsDailyMetrics analyticsDailyMetrics1 = OASAnalyticsDailyMetrics.getExample();
        OASAnalyticsDailyMetrics analyticsDailyMetrics2 = OASAnalyticsDailyMetrics.getExample();
        OASAnalyticsDailyMetrics analyticsDailyMetrics3 = new OASAnalyticsDailyMetrics();
        OASAnalyticsDailyMetrics analyticsDailyMetrics4 = new OASAnalyticsDailyMetrics();

        System.assert(analyticsDailyMetrics1.equals(analyticsDailyMetrics2));
        System.assert(analyticsDailyMetrics3.equals(analyticsDailyMetrics4));
        System.assertEquals(analyticsDailyMetrics1.hashCode(), analyticsDailyMetrics2.hashCode());
        System.assertEquals(analyticsDailyMetrics3.hashCode(), analyticsDailyMetrics4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAnalyticsDailyMetrics analyticsDailyMetrics = new OASAnalyticsDailyMetrics();
        Map<String, String> x-property-mappings = analyticsDailyMetrics.getx-property-mappings();
        System.assertEquals('dataStatus', x-property-mappings.get('data_status'));
        System.assertEquals('r_date', x-property-mappings.get('date'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAnalyticsDailyMetrics analyticsDailyMetrics = new OASAnalyticsDailyMetrics();
        System.assertEquals(new Map<String, Double>(), analyticsDailyMetrics.metrics);
        System.assertEquals(null, analyticsDailyMetrics.dataStatus);
        System.assertEquals(null, analyticsDailyMetrics.r_date);
    }
}
