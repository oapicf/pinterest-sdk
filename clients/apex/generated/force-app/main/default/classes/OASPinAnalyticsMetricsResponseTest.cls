@isTest
private class OASPinAnalyticsMetricsResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASPinAnalyticsMetricsResponse pinAnalyticsMetricsResponse1 = OASPinAnalyticsMetricsResponse.getExample();
        OASPinAnalyticsMetricsResponse pinAnalyticsMetricsResponse2 = pinAnalyticsMetricsResponse1;
        OASPinAnalyticsMetricsResponse pinAnalyticsMetricsResponse3 = new OASPinAnalyticsMetricsResponse();
        OASPinAnalyticsMetricsResponse pinAnalyticsMetricsResponse4 = pinAnalyticsMetricsResponse3;

        System.assert(pinAnalyticsMetricsResponse1.equals(pinAnalyticsMetricsResponse2));
        System.assert(pinAnalyticsMetricsResponse2.equals(pinAnalyticsMetricsResponse1));
        System.assert(pinAnalyticsMetricsResponse1.equals(pinAnalyticsMetricsResponse1));
        System.assert(pinAnalyticsMetricsResponse3.equals(pinAnalyticsMetricsResponse4));
        System.assert(pinAnalyticsMetricsResponse4.equals(pinAnalyticsMetricsResponse3));
        System.assert(pinAnalyticsMetricsResponse3.equals(pinAnalyticsMetricsResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPinAnalyticsMetricsResponse pinAnalyticsMetricsResponse1 = OASPinAnalyticsMetricsResponse.getExample();
        OASPinAnalyticsMetricsResponse pinAnalyticsMetricsResponse2 = OASPinAnalyticsMetricsResponse.getExample();
        OASPinAnalyticsMetricsResponse pinAnalyticsMetricsResponse3 = new OASPinAnalyticsMetricsResponse();
        OASPinAnalyticsMetricsResponse pinAnalyticsMetricsResponse4 = new OASPinAnalyticsMetricsResponse();

        System.assert(pinAnalyticsMetricsResponse1.equals(pinAnalyticsMetricsResponse2));
        System.assert(pinAnalyticsMetricsResponse2.equals(pinAnalyticsMetricsResponse1));
        System.assert(pinAnalyticsMetricsResponse3.equals(pinAnalyticsMetricsResponse4));
        System.assert(pinAnalyticsMetricsResponse4.equals(pinAnalyticsMetricsResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPinAnalyticsMetricsResponse pinAnalyticsMetricsResponse1 = OASPinAnalyticsMetricsResponse.getExample();
        OASPinAnalyticsMetricsResponse pinAnalyticsMetricsResponse2 = new OASPinAnalyticsMetricsResponse();

        System.assertEquals(false, pinAnalyticsMetricsResponse1.equals('foo'));
        System.assertEquals(false, pinAnalyticsMetricsResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPinAnalyticsMetricsResponse pinAnalyticsMetricsResponse1 = OASPinAnalyticsMetricsResponse.getExample();
        OASPinAnalyticsMetricsResponse pinAnalyticsMetricsResponse2 = new OASPinAnalyticsMetricsResponse();
        OASPinAnalyticsMetricsResponse pinAnalyticsMetricsResponse3;

        System.assertEquals(false, pinAnalyticsMetricsResponse1.equals(pinAnalyticsMetricsResponse3));
        System.assertEquals(false, pinAnalyticsMetricsResponse2.equals(pinAnalyticsMetricsResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPinAnalyticsMetricsResponse pinAnalyticsMetricsResponse1 = OASPinAnalyticsMetricsResponse.getExample();
        OASPinAnalyticsMetricsResponse pinAnalyticsMetricsResponse2 = new OASPinAnalyticsMetricsResponse();

        System.assertEquals(pinAnalyticsMetricsResponse1.hashCode(), pinAnalyticsMetricsResponse1.hashCode());
        System.assertEquals(pinAnalyticsMetricsResponse2.hashCode(), pinAnalyticsMetricsResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPinAnalyticsMetricsResponse pinAnalyticsMetricsResponse1 = OASPinAnalyticsMetricsResponse.getExample();
        OASPinAnalyticsMetricsResponse pinAnalyticsMetricsResponse2 = OASPinAnalyticsMetricsResponse.getExample();
        OASPinAnalyticsMetricsResponse pinAnalyticsMetricsResponse3 = new OASPinAnalyticsMetricsResponse();
        OASPinAnalyticsMetricsResponse pinAnalyticsMetricsResponse4 = new OASPinAnalyticsMetricsResponse();

        System.assert(pinAnalyticsMetricsResponse1.equals(pinAnalyticsMetricsResponse2));
        System.assert(pinAnalyticsMetricsResponse3.equals(pinAnalyticsMetricsResponse4));
        System.assertEquals(pinAnalyticsMetricsResponse1.hashCode(), pinAnalyticsMetricsResponse2.hashCode());
        System.assertEquals(pinAnalyticsMetricsResponse3.hashCode(), pinAnalyticsMetricsResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPinAnalyticsMetricsResponse pinAnalyticsMetricsResponse = new OASPinAnalyticsMetricsResponse();
        Map<String, String> x-property-mappings = pinAnalyticsMetricsResponse.getx-property-mappings();
        System.assertEquals('lifetimeMetrics', x-property-mappings.get('lifetime_metrics'));
        System.assertEquals('dailyMetrics', x-property-mappings.get('daily_metrics'));
        System.assertEquals('summaryMetrics', x-property-mappings.get('summary_metrics'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPinAnalyticsMetricsResponse pinAnalyticsMetricsResponse = new OASPinAnalyticsMetricsResponse();
        System.assertEquals(new Map<String, Integer>(), pinAnalyticsMetricsResponse.lifetimeMetrics);
        System.assertEquals(new List<OASPinAnalyticsMetricsResponseDailyM>(), pinAnalyticsMetricsResponse.dailyMetrics);
        System.assertEquals(new Map<String, Double>(), pinAnalyticsMetricsResponse.summaryMetrics);
    }
}
