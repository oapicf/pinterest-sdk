@isTest
private class OASTrendingKeywordsResponseTrendsInnTest {
    @isTest
    private static void equalsSameInstance() {
        OASTrendingKeywordsResponseTrendsInn trendingKeywordsResponseTrendsInner1 = OASTrendingKeywordsResponseTrendsInn.getExample();
        OASTrendingKeywordsResponseTrendsInn trendingKeywordsResponseTrendsInner2 = trendingKeywordsResponseTrendsInner1;
        OASTrendingKeywordsResponseTrendsInn trendingKeywordsResponseTrendsInner3 = new OASTrendingKeywordsResponseTrendsInn();
        OASTrendingKeywordsResponseTrendsInn trendingKeywordsResponseTrendsInner4 = trendingKeywordsResponseTrendsInner3;

        System.assert(trendingKeywordsResponseTrendsInner1.equals(trendingKeywordsResponseTrendsInner2));
        System.assert(trendingKeywordsResponseTrendsInner2.equals(trendingKeywordsResponseTrendsInner1));
        System.assert(trendingKeywordsResponseTrendsInner1.equals(trendingKeywordsResponseTrendsInner1));
        System.assert(trendingKeywordsResponseTrendsInner3.equals(trendingKeywordsResponseTrendsInner4));
        System.assert(trendingKeywordsResponseTrendsInner4.equals(trendingKeywordsResponseTrendsInner3));
        System.assert(trendingKeywordsResponseTrendsInner3.equals(trendingKeywordsResponseTrendsInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTrendingKeywordsResponseTrendsInn trendingKeywordsResponseTrendsInner1 = OASTrendingKeywordsResponseTrendsInn.getExample();
        OASTrendingKeywordsResponseTrendsInn trendingKeywordsResponseTrendsInner2 = OASTrendingKeywordsResponseTrendsInn.getExample();
        OASTrendingKeywordsResponseTrendsInn trendingKeywordsResponseTrendsInner3 = new OASTrendingKeywordsResponseTrendsInn();
        OASTrendingKeywordsResponseTrendsInn trendingKeywordsResponseTrendsInner4 = new OASTrendingKeywordsResponseTrendsInn();

        System.assert(trendingKeywordsResponseTrendsInner1.equals(trendingKeywordsResponseTrendsInner2));
        System.assert(trendingKeywordsResponseTrendsInner2.equals(trendingKeywordsResponseTrendsInner1));
        System.assert(trendingKeywordsResponseTrendsInner3.equals(trendingKeywordsResponseTrendsInner4));
        System.assert(trendingKeywordsResponseTrendsInner4.equals(trendingKeywordsResponseTrendsInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTrendingKeywordsResponseTrendsInn trendingKeywordsResponseTrendsInner1 = OASTrendingKeywordsResponseTrendsInn.getExample();
        OASTrendingKeywordsResponseTrendsInn trendingKeywordsResponseTrendsInner2 = new OASTrendingKeywordsResponseTrendsInn();

        System.assertEquals(false, trendingKeywordsResponseTrendsInner1.equals('foo'));
        System.assertEquals(false, trendingKeywordsResponseTrendsInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTrendingKeywordsResponseTrendsInn trendingKeywordsResponseTrendsInner1 = OASTrendingKeywordsResponseTrendsInn.getExample();
        OASTrendingKeywordsResponseTrendsInn trendingKeywordsResponseTrendsInner2 = new OASTrendingKeywordsResponseTrendsInn();
        OASTrendingKeywordsResponseTrendsInn trendingKeywordsResponseTrendsInner3;

        System.assertEquals(false, trendingKeywordsResponseTrendsInner1.equals(trendingKeywordsResponseTrendsInner3));
        System.assertEquals(false, trendingKeywordsResponseTrendsInner2.equals(trendingKeywordsResponseTrendsInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTrendingKeywordsResponseTrendsInn trendingKeywordsResponseTrendsInner1 = OASTrendingKeywordsResponseTrendsInn.getExample();
        OASTrendingKeywordsResponseTrendsInn trendingKeywordsResponseTrendsInner2 = new OASTrendingKeywordsResponseTrendsInn();

        System.assertEquals(trendingKeywordsResponseTrendsInner1.hashCode(), trendingKeywordsResponseTrendsInner1.hashCode());
        System.assertEquals(trendingKeywordsResponseTrendsInner2.hashCode(), trendingKeywordsResponseTrendsInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTrendingKeywordsResponseTrendsInn trendingKeywordsResponseTrendsInner1 = OASTrendingKeywordsResponseTrendsInn.getExample();
        OASTrendingKeywordsResponseTrendsInn trendingKeywordsResponseTrendsInner2 = OASTrendingKeywordsResponseTrendsInn.getExample();
        OASTrendingKeywordsResponseTrendsInn trendingKeywordsResponseTrendsInner3 = new OASTrendingKeywordsResponseTrendsInn();
        OASTrendingKeywordsResponseTrendsInn trendingKeywordsResponseTrendsInner4 = new OASTrendingKeywordsResponseTrendsInn();

        System.assert(trendingKeywordsResponseTrendsInner1.equals(trendingKeywordsResponseTrendsInner2));
        System.assert(trendingKeywordsResponseTrendsInner3.equals(trendingKeywordsResponseTrendsInner4));
        System.assertEquals(trendingKeywordsResponseTrendsInner1.hashCode(), trendingKeywordsResponseTrendsInner2.hashCode());
        System.assertEquals(trendingKeywordsResponseTrendsInner3.hashCode(), trendingKeywordsResponseTrendsInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASTrendingKeywordsResponseTrendsInn trendingKeywordsResponseTrendsInner = new OASTrendingKeywordsResponseTrendsInn();
        Map<String, String> x-property-mappings = trendingKeywordsResponseTrendsInner.getx-property-mappings();
        System.assertEquals('pctGrowthWow', x-property-mappings.get('pct_growth_wow'));
        System.assertEquals('pctGrowthMom', x-property-mappings.get('pct_growth_mom'));
        System.assertEquals('pctGrowthYoy', x-property-mappings.get('pct_growth_yoy'));
        System.assertEquals('timeSeries', x-property-mappings.get('time_series'));
    }
}
