@isTest
private class OASPinAnalyticsMetricsResponseDailyMTest {
    @isTest
    private static void equalsSameInstance() {
        OASPinAnalyticsMetricsResponseDailyM pinAnalyticsMetricsResponseDailyMetricsInner1 = OASPinAnalyticsMetricsResponseDailyM.getExample();
        OASPinAnalyticsMetricsResponseDailyM pinAnalyticsMetricsResponseDailyMetricsInner2 = pinAnalyticsMetricsResponseDailyMetricsInner1;
        OASPinAnalyticsMetricsResponseDailyM pinAnalyticsMetricsResponseDailyMetricsInner3 = new OASPinAnalyticsMetricsResponseDailyM();
        OASPinAnalyticsMetricsResponseDailyM pinAnalyticsMetricsResponseDailyMetricsInner4 = pinAnalyticsMetricsResponseDailyMetricsInner3;

        System.assert(pinAnalyticsMetricsResponseDailyMetricsInner1.equals(pinAnalyticsMetricsResponseDailyMetricsInner2));
        System.assert(pinAnalyticsMetricsResponseDailyMetricsInner2.equals(pinAnalyticsMetricsResponseDailyMetricsInner1));
        System.assert(pinAnalyticsMetricsResponseDailyMetricsInner1.equals(pinAnalyticsMetricsResponseDailyMetricsInner1));
        System.assert(pinAnalyticsMetricsResponseDailyMetricsInner3.equals(pinAnalyticsMetricsResponseDailyMetricsInner4));
        System.assert(pinAnalyticsMetricsResponseDailyMetricsInner4.equals(pinAnalyticsMetricsResponseDailyMetricsInner3));
        System.assert(pinAnalyticsMetricsResponseDailyMetricsInner3.equals(pinAnalyticsMetricsResponseDailyMetricsInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPinAnalyticsMetricsResponseDailyM pinAnalyticsMetricsResponseDailyMetricsInner1 = OASPinAnalyticsMetricsResponseDailyM.getExample();
        OASPinAnalyticsMetricsResponseDailyM pinAnalyticsMetricsResponseDailyMetricsInner2 = OASPinAnalyticsMetricsResponseDailyM.getExample();
        OASPinAnalyticsMetricsResponseDailyM pinAnalyticsMetricsResponseDailyMetricsInner3 = new OASPinAnalyticsMetricsResponseDailyM();
        OASPinAnalyticsMetricsResponseDailyM pinAnalyticsMetricsResponseDailyMetricsInner4 = new OASPinAnalyticsMetricsResponseDailyM();

        System.assert(pinAnalyticsMetricsResponseDailyMetricsInner1.equals(pinAnalyticsMetricsResponseDailyMetricsInner2));
        System.assert(pinAnalyticsMetricsResponseDailyMetricsInner2.equals(pinAnalyticsMetricsResponseDailyMetricsInner1));
        System.assert(pinAnalyticsMetricsResponseDailyMetricsInner3.equals(pinAnalyticsMetricsResponseDailyMetricsInner4));
        System.assert(pinAnalyticsMetricsResponseDailyMetricsInner4.equals(pinAnalyticsMetricsResponseDailyMetricsInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPinAnalyticsMetricsResponseDailyM pinAnalyticsMetricsResponseDailyMetricsInner1 = OASPinAnalyticsMetricsResponseDailyM.getExample();
        OASPinAnalyticsMetricsResponseDailyM pinAnalyticsMetricsResponseDailyMetricsInner2 = new OASPinAnalyticsMetricsResponseDailyM();

        System.assertEquals(false, pinAnalyticsMetricsResponseDailyMetricsInner1.equals('foo'));
        System.assertEquals(false, pinAnalyticsMetricsResponseDailyMetricsInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPinAnalyticsMetricsResponseDailyM pinAnalyticsMetricsResponseDailyMetricsInner1 = OASPinAnalyticsMetricsResponseDailyM.getExample();
        OASPinAnalyticsMetricsResponseDailyM pinAnalyticsMetricsResponseDailyMetricsInner2 = new OASPinAnalyticsMetricsResponseDailyM();
        OASPinAnalyticsMetricsResponseDailyM pinAnalyticsMetricsResponseDailyMetricsInner3;

        System.assertEquals(false, pinAnalyticsMetricsResponseDailyMetricsInner1.equals(pinAnalyticsMetricsResponseDailyMetricsInner3));
        System.assertEquals(false, pinAnalyticsMetricsResponseDailyMetricsInner2.equals(pinAnalyticsMetricsResponseDailyMetricsInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPinAnalyticsMetricsResponseDailyM pinAnalyticsMetricsResponseDailyMetricsInner1 = OASPinAnalyticsMetricsResponseDailyM.getExample();
        OASPinAnalyticsMetricsResponseDailyM pinAnalyticsMetricsResponseDailyMetricsInner2 = new OASPinAnalyticsMetricsResponseDailyM();

        System.assertEquals(pinAnalyticsMetricsResponseDailyMetricsInner1.hashCode(), pinAnalyticsMetricsResponseDailyMetricsInner1.hashCode());
        System.assertEquals(pinAnalyticsMetricsResponseDailyMetricsInner2.hashCode(), pinAnalyticsMetricsResponseDailyMetricsInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPinAnalyticsMetricsResponseDailyM pinAnalyticsMetricsResponseDailyMetricsInner1 = OASPinAnalyticsMetricsResponseDailyM.getExample();
        OASPinAnalyticsMetricsResponseDailyM pinAnalyticsMetricsResponseDailyMetricsInner2 = OASPinAnalyticsMetricsResponseDailyM.getExample();
        OASPinAnalyticsMetricsResponseDailyM pinAnalyticsMetricsResponseDailyMetricsInner3 = new OASPinAnalyticsMetricsResponseDailyM();
        OASPinAnalyticsMetricsResponseDailyM pinAnalyticsMetricsResponseDailyMetricsInner4 = new OASPinAnalyticsMetricsResponseDailyM();

        System.assert(pinAnalyticsMetricsResponseDailyMetricsInner1.equals(pinAnalyticsMetricsResponseDailyMetricsInner2));
        System.assert(pinAnalyticsMetricsResponseDailyMetricsInner3.equals(pinAnalyticsMetricsResponseDailyMetricsInner4));
        System.assertEquals(pinAnalyticsMetricsResponseDailyMetricsInner1.hashCode(), pinAnalyticsMetricsResponseDailyMetricsInner2.hashCode());
        System.assertEquals(pinAnalyticsMetricsResponseDailyMetricsInner3.hashCode(), pinAnalyticsMetricsResponseDailyMetricsInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPinAnalyticsMetricsResponseDailyM pinAnalyticsMetricsResponseDailyMetricsInner = new OASPinAnalyticsMetricsResponseDailyM();
        Map<String, String> x-property-mappings = pinAnalyticsMetricsResponseDailyMetricsInner.getx-property-mappings();
        System.assertEquals('dataStatus', x-property-mappings.get('data_status'));
        System.assertEquals('r_date', x-property-mappings.get('date'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPinAnalyticsMetricsResponseDailyM pinAnalyticsMetricsResponseDailyMetricsInner = new OASPinAnalyticsMetricsResponseDailyM();
        System.assertEquals(new Map<String, Double>(), pinAnalyticsMetricsResponseDailyMetricsInner.metrics);
        System.assertEquals(null, pinAnalyticsMetricsResponseDailyMetricsInner.dataStatus);
        System.assertEquals(null, pinAnalyticsMetricsResponseDailyMetricsInner.r_date);
    }
}
