@isTest
private class OASKeywordMetricsTest {
    @isTest
    private static void equalsSameInstance() {
        OASKeywordMetrics keywordMetrics1 = OASKeywordMetrics.getExample();
        OASKeywordMetrics keywordMetrics2 = keywordMetrics1;
        OASKeywordMetrics keywordMetrics3 = new OASKeywordMetrics();
        OASKeywordMetrics keywordMetrics4 = keywordMetrics3;

        System.assert(keywordMetrics1.equals(keywordMetrics2));
        System.assert(keywordMetrics2.equals(keywordMetrics1));
        System.assert(keywordMetrics1.equals(keywordMetrics1));
        System.assert(keywordMetrics3.equals(keywordMetrics4));
        System.assert(keywordMetrics4.equals(keywordMetrics3));
        System.assert(keywordMetrics3.equals(keywordMetrics3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASKeywordMetrics keywordMetrics1 = OASKeywordMetrics.getExample();
        OASKeywordMetrics keywordMetrics2 = OASKeywordMetrics.getExample();
        OASKeywordMetrics keywordMetrics3 = new OASKeywordMetrics();
        OASKeywordMetrics keywordMetrics4 = new OASKeywordMetrics();

        System.assert(keywordMetrics1.equals(keywordMetrics2));
        System.assert(keywordMetrics2.equals(keywordMetrics1));
        System.assert(keywordMetrics3.equals(keywordMetrics4));
        System.assert(keywordMetrics4.equals(keywordMetrics3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASKeywordMetrics keywordMetrics1 = OASKeywordMetrics.getExample();
        OASKeywordMetrics keywordMetrics2 = new OASKeywordMetrics();

        System.assertEquals(false, keywordMetrics1.equals('foo'));
        System.assertEquals(false, keywordMetrics2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASKeywordMetrics keywordMetrics1 = OASKeywordMetrics.getExample();
        OASKeywordMetrics keywordMetrics2 = new OASKeywordMetrics();
        OASKeywordMetrics keywordMetrics3;

        System.assertEquals(false, keywordMetrics1.equals(keywordMetrics3));
        System.assertEquals(false, keywordMetrics2.equals(keywordMetrics3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASKeywordMetrics keywordMetrics1 = OASKeywordMetrics.getExample();
        OASKeywordMetrics keywordMetrics2 = new OASKeywordMetrics();

        System.assertEquals(keywordMetrics1.hashCode(), keywordMetrics1.hashCode());
        System.assertEquals(keywordMetrics2.hashCode(), keywordMetrics2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASKeywordMetrics keywordMetrics1 = OASKeywordMetrics.getExample();
        OASKeywordMetrics keywordMetrics2 = OASKeywordMetrics.getExample();
        OASKeywordMetrics keywordMetrics3 = new OASKeywordMetrics();
        OASKeywordMetrics keywordMetrics4 = new OASKeywordMetrics();

        System.assert(keywordMetrics1.equals(keywordMetrics2));
        System.assert(keywordMetrics3.equals(keywordMetrics4));
        System.assertEquals(keywordMetrics1.hashCode(), keywordMetrics2.hashCode());
        System.assertEquals(keywordMetrics3.hashCode(), keywordMetrics4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASKeywordMetrics keywordMetrics = new OASKeywordMetrics();
        Map<String, String> x-property-mappings = keywordMetrics.getx-property-mappings();
        System.assertEquals('avgCpcInMicroCurrency', x-property-mappings.get('avg_cpc_in_micro_currency'));
        System.assertEquals('keywordQueryVolume', x-property-mappings.get('keyword_query_volume'));
    }
}
