@isTest
private class OASTrendingKeywordTest {
    @isTest
    private static void equalsSameInstance() {
        OASTrendingKeyword trendingKeyword1 = OASTrendingKeyword.getExample();
        OASTrendingKeyword trendingKeyword2 = trendingKeyword1;
        OASTrendingKeyword trendingKeyword3 = new OASTrendingKeyword();
        OASTrendingKeyword trendingKeyword4 = trendingKeyword3;

        System.assert(trendingKeyword1.equals(trendingKeyword2));
        System.assert(trendingKeyword2.equals(trendingKeyword1));
        System.assert(trendingKeyword1.equals(trendingKeyword1));
        System.assert(trendingKeyword3.equals(trendingKeyword4));
        System.assert(trendingKeyword4.equals(trendingKeyword3));
        System.assert(trendingKeyword3.equals(trendingKeyword3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTrendingKeyword trendingKeyword1 = OASTrendingKeyword.getExample();
        OASTrendingKeyword trendingKeyword2 = OASTrendingKeyword.getExample();
        OASTrendingKeyword trendingKeyword3 = new OASTrendingKeyword();
        OASTrendingKeyword trendingKeyword4 = new OASTrendingKeyword();

        System.assert(trendingKeyword1.equals(trendingKeyword2));
        System.assert(trendingKeyword2.equals(trendingKeyword1));
        System.assert(trendingKeyword3.equals(trendingKeyword4));
        System.assert(trendingKeyword4.equals(trendingKeyword3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTrendingKeyword trendingKeyword1 = OASTrendingKeyword.getExample();
        OASTrendingKeyword trendingKeyword2 = new OASTrendingKeyword();

        System.assertEquals(false, trendingKeyword1.equals('foo'));
        System.assertEquals(false, trendingKeyword2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTrendingKeyword trendingKeyword1 = OASTrendingKeyword.getExample();
        OASTrendingKeyword trendingKeyword2 = new OASTrendingKeyword();
        OASTrendingKeyword trendingKeyword3;

        System.assertEquals(false, trendingKeyword1.equals(trendingKeyword3));
        System.assertEquals(false, trendingKeyword2.equals(trendingKeyword3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTrendingKeyword trendingKeyword1 = OASTrendingKeyword.getExample();
        OASTrendingKeyword trendingKeyword2 = new OASTrendingKeyword();

        System.assertEquals(trendingKeyword1.hashCode(), trendingKeyword1.hashCode());
        System.assertEquals(trendingKeyword2.hashCode(), trendingKeyword2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTrendingKeyword trendingKeyword1 = OASTrendingKeyword.getExample();
        OASTrendingKeyword trendingKeyword2 = OASTrendingKeyword.getExample();
        OASTrendingKeyword trendingKeyword3 = new OASTrendingKeyword();
        OASTrendingKeyword trendingKeyword4 = new OASTrendingKeyword();

        System.assert(trendingKeyword1.equals(trendingKeyword2));
        System.assert(trendingKeyword3.equals(trendingKeyword4));
        System.assertEquals(trendingKeyword1.hashCode(), trendingKeyword2.hashCode());
        System.assertEquals(trendingKeyword3.hashCode(), trendingKeyword4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASTrendingKeyword trendingKeyword = new OASTrendingKeyword();
        Map<String, String> x-property-mappings = trendingKeyword.getx-property-mappings();
        System.assertEquals('hasPrediction', x-property-mappings.get('has_prediction'));
        System.assertEquals('pctGrowthMom', x-property-mappings.get('pct_growth_mom'));
        System.assertEquals('pctGrowthWow', x-property-mappings.get('pct_growth_wow'));
        System.assertEquals('pctGrowthYoy', x-property-mappings.get('pct_growth_yoy'));
        System.assertEquals('predictedTimeSeries', x-property-mappings.get('predicted_time_series'));
        System.assertEquals('timeSeries', x-property-mappings.get('time_series'));
    }
}
