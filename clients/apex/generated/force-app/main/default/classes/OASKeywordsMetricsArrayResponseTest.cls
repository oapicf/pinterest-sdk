@isTest
private class OASKeywordsMetricsArrayResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASKeywordsMetricsArrayResponse keywordsMetricsArrayResponse1 = OASKeywordsMetricsArrayResponse.getExample();
        OASKeywordsMetricsArrayResponse keywordsMetricsArrayResponse2 = keywordsMetricsArrayResponse1;
        OASKeywordsMetricsArrayResponse keywordsMetricsArrayResponse3 = new OASKeywordsMetricsArrayResponse();
        OASKeywordsMetricsArrayResponse keywordsMetricsArrayResponse4 = keywordsMetricsArrayResponse3;

        System.assert(keywordsMetricsArrayResponse1.equals(keywordsMetricsArrayResponse2));
        System.assert(keywordsMetricsArrayResponse2.equals(keywordsMetricsArrayResponse1));
        System.assert(keywordsMetricsArrayResponse1.equals(keywordsMetricsArrayResponse1));
        System.assert(keywordsMetricsArrayResponse3.equals(keywordsMetricsArrayResponse4));
        System.assert(keywordsMetricsArrayResponse4.equals(keywordsMetricsArrayResponse3));
        System.assert(keywordsMetricsArrayResponse3.equals(keywordsMetricsArrayResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASKeywordsMetricsArrayResponse keywordsMetricsArrayResponse1 = OASKeywordsMetricsArrayResponse.getExample();
        OASKeywordsMetricsArrayResponse keywordsMetricsArrayResponse2 = OASKeywordsMetricsArrayResponse.getExample();
        OASKeywordsMetricsArrayResponse keywordsMetricsArrayResponse3 = new OASKeywordsMetricsArrayResponse();
        OASKeywordsMetricsArrayResponse keywordsMetricsArrayResponse4 = new OASKeywordsMetricsArrayResponse();

        System.assert(keywordsMetricsArrayResponse1.equals(keywordsMetricsArrayResponse2));
        System.assert(keywordsMetricsArrayResponse2.equals(keywordsMetricsArrayResponse1));
        System.assert(keywordsMetricsArrayResponse3.equals(keywordsMetricsArrayResponse4));
        System.assert(keywordsMetricsArrayResponse4.equals(keywordsMetricsArrayResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASKeywordsMetricsArrayResponse keywordsMetricsArrayResponse1 = OASKeywordsMetricsArrayResponse.getExample();
        OASKeywordsMetricsArrayResponse keywordsMetricsArrayResponse2 = new OASKeywordsMetricsArrayResponse();

        System.assertEquals(false, keywordsMetricsArrayResponse1.equals('foo'));
        System.assertEquals(false, keywordsMetricsArrayResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASKeywordsMetricsArrayResponse keywordsMetricsArrayResponse1 = OASKeywordsMetricsArrayResponse.getExample();
        OASKeywordsMetricsArrayResponse keywordsMetricsArrayResponse2 = new OASKeywordsMetricsArrayResponse();
        OASKeywordsMetricsArrayResponse keywordsMetricsArrayResponse3;

        System.assertEquals(false, keywordsMetricsArrayResponse1.equals(keywordsMetricsArrayResponse3));
        System.assertEquals(false, keywordsMetricsArrayResponse2.equals(keywordsMetricsArrayResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASKeywordsMetricsArrayResponse keywordsMetricsArrayResponse1 = OASKeywordsMetricsArrayResponse.getExample();
        OASKeywordsMetricsArrayResponse keywordsMetricsArrayResponse2 = new OASKeywordsMetricsArrayResponse();

        System.assertEquals(keywordsMetricsArrayResponse1.hashCode(), keywordsMetricsArrayResponse1.hashCode());
        System.assertEquals(keywordsMetricsArrayResponse2.hashCode(), keywordsMetricsArrayResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASKeywordsMetricsArrayResponse keywordsMetricsArrayResponse1 = OASKeywordsMetricsArrayResponse.getExample();
        OASKeywordsMetricsArrayResponse keywordsMetricsArrayResponse2 = OASKeywordsMetricsArrayResponse.getExample();
        OASKeywordsMetricsArrayResponse keywordsMetricsArrayResponse3 = new OASKeywordsMetricsArrayResponse();
        OASKeywordsMetricsArrayResponse keywordsMetricsArrayResponse4 = new OASKeywordsMetricsArrayResponse();

        System.assert(keywordsMetricsArrayResponse1.equals(keywordsMetricsArrayResponse2));
        System.assert(keywordsMetricsArrayResponse3.equals(keywordsMetricsArrayResponse4));
        System.assertEquals(keywordsMetricsArrayResponse1.hashCode(), keywordsMetricsArrayResponse2.hashCode());
        System.assertEquals(keywordsMetricsArrayResponse3.hashCode(), keywordsMetricsArrayResponse4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASKeywordsMetricsArrayResponse keywordsMetricsArrayResponse = new OASKeywordsMetricsArrayResponse();
        System.assertEquals(new List<OASKeywordMetricsResponse>(), keywordsMetricsArrayResponse.data);
    }
}
