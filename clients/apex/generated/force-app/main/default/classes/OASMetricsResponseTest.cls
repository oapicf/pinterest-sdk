@isTest
private class OASMetricsResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASMetricsResponse metricsResponse1 = OASMetricsResponse.getExample();
        OASMetricsResponse metricsResponse2 = metricsResponse1;
        OASMetricsResponse metricsResponse3 = new OASMetricsResponse();
        OASMetricsResponse metricsResponse4 = metricsResponse3;

        System.assert(metricsResponse1.equals(metricsResponse2));
        System.assert(metricsResponse2.equals(metricsResponse1));
        System.assert(metricsResponse1.equals(metricsResponse1));
        System.assert(metricsResponse3.equals(metricsResponse4));
        System.assert(metricsResponse4.equals(metricsResponse3));
        System.assert(metricsResponse3.equals(metricsResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMetricsResponse metricsResponse1 = OASMetricsResponse.getExample();
        OASMetricsResponse metricsResponse2 = OASMetricsResponse.getExample();
        OASMetricsResponse metricsResponse3 = new OASMetricsResponse();
        OASMetricsResponse metricsResponse4 = new OASMetricsResponse();

        System.assert(metricsResponse1.equals(metricsResponse2));
        System.assert(metricsResponse2.equals(metricsResponse1));
        System.assert(metricsResponse3.equals(metricsResponse4));
        System.assert(metricsResponse4.equals(metricsResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMetricsResponse metricsResponse1 = OASMetricsResponse.getExample();
        OASMetricsResponse metricsResponse2 = new OASMetricsResponse();

        System.assertEquals(false, metricsResponse1.equals('foo'));
        System.assertEquals(false, metricsResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMetricsResponse metricsResponse1 = OASMetricsResponse.getExample();
        OASMetricsResponse metricsResponse2 = new OASMetricsResponse();
        OASMetricsResponse metricsResponse3;

        System.assertEquals(false, metricsResponse1.equals(metricsResponse3));
        System.assertEquals(false, metricsResponse2.equals(metricsResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMetricsResponse metricsResponse1 = OASMetricsResponse.getExample();
        OASMetricsResponse metricsResponse2 = new OASMetricsResponse();

        System.assertEquals(metricsResponse1.hashCode(), metricsResponse1.hashCode());
        System.assertEquals(metricsResponse2.hashCode(), metricsResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMetricsResponse metricsResponse1 = OASMetricsResponse.getExample();
        OASMetricsResponse metricsResponse2 = OASMetricsResponse.getExample();
        OASMetricsResponse metricsResponse3 = new OASMetricsResponse();
        OASMetricsResponse metricsResponse4 = new OASMetricsResponse();

        System.assert(metricsResponse1.equals(metricsResponse2));
        System.assert(metricsResponse3.equals(metricsResponse4));
        System.assertEquals(metricsResponse1.hashCode(), metricsResponse2.hashCode());
        System.assertEquals(metricsResponse3.hashCode(), metricsResponse4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASMetricsResponse metricsResponse = new OASMetricsResponse();
        System.assertEquals(new List<Object>(), metricsResponse.data);
    }
}
