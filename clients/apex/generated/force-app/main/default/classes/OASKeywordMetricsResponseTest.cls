@isTest
private class OASKeywordMetricsResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASKeywordMetricsResponse keywordMetricsResponse1 = OASKeywordMetricsResponse.getExample();
        OASKeywordMetricsResponse keywordMetricsResponse2 = keywordMetricsResponse1;
        OASKeywordMetricsResponse keywordMetricsResponse3 = new OASKeywordMetricsResponse();
        OASKeywordMetricsResponse keywordMetricsResponse4 = keywordMetricsResponse3;

        System.assert(keywordMetricsResponse1.equals(keywordMetricsResponse2));
        System.assert(keywordMetricsResponse2.equals(keywordMetricsResponse1));
        System.assert(keywordMetricsResponse1.equals(keywordMetricsResponse1));
        System.assert(keywordMetricsResponse3.equals(keywordMetricsResponse4));
        System.assert(keywordMetricsResponse4.equals(keywordMetricsResponse3));
        System.assert(keywordMetricsResponse3.equals(keywordMetricsResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASKeywordMetricsResponse keywordMetricsResponse1 = OASKeywordMetricsResponse.getExample();
        OASKeywordMetricsResponse keywordMetricsResponse2 = OASKeywordMetricsResponse.getExample();
        OASKeywordMetricsResponse keywordMetricsResponse3 = new OASKeywordMetricsResponse();
        OASKeywordMetricsResponse keywordMetricsResponse4 = new OASKeywordMetricsResponse();

        System.assert(keywordMetricsResponse1.equals(keywordMetricsResponse2));
        System.assert(keywordMetricsResponse2.equals(keywordMetricsResponse1));
        System.assert(keywordMetricsResponse3.equals(keywordMetricsResponse4));
        System.assert(keywordMetricsResponse4.equals(keywordMetricsResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASKeywordMetricsResponse keywordMetricsResponse1 = OASKeywordMetricsResponse.getExample();
        OASKeywordMetricsResponse keywordMetricsResponse2 = new OASKeywordMetricsResponse();

        System.assertEquals(false, keywordMetricsResponse1.equals('foo'));
        System.assertEquals(false, keywordMetricsResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASKeywordMetricsResponse keywordMetricsResponse1 = OASKeywordMetricsResponse.getExample();
        OASKeywordMetricsResponse keywordMetricsResponse2 = new OASKeywordMetricsResponse();
        OASKeywordMetricsResponse keywordMetricsResponse3;

        System.assertEquals(false, keywordMetricsResponse1.equals(keywordMetricsResponse3));
        System.assertEquals(false, keywordMetricsResponse2.equals(keywordMetricsResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASKeywordMetricsResponse keywordMetricsResponse1 = OASKeywordMetricsResponse.getExample();
        OASKeywordMetricsResponse keywordMetricsResponse2 = new OASKeywordMetricsResponse();

        System.assertEquals(keywordMetricsResponse1.hashCode(), keywordMetricsResponse1.hashCode());
        System.assertEquals(keywordMetricsResponse2.hashCode(), keywordMetricsResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASKeywordMetricsResponse keywordMetricsResponse1 = OASKeywordMetricsResponse.getExample();
        OASKeywordMetricsResponse keywordMetricsResponse2 = OASKeywordMetricsResponse.getExample();
        OASKeywordMetricsResponse keywordMetricsResponse3 = new OASKeywordMetricsResponse();
        OASKeywordMetricsResponse keywordMetricsResponse4 = new OASKeywordMetricsResponse();

        System.assert(keywordMetricsResponse1.equals(keywordMetricsResponse2));
        System.assert(keywordMetricsResponse3.equals(keywordMetricsResponse4));
        System.assertEquals(keywordMetricsResponse1.hashCode(), keywordMetricsResponse2.hashCode());
        System.assertEquals(keywordMetricsResponse3.hashCode(), keywordMetricsResponse4.hashCode());
    }
}
