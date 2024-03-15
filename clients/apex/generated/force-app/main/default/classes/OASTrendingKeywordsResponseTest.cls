@isTest
private class OASTrendingKeywordsResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASTrendingKeywordsResponse trendingKeywordsResponse1 = OASTrendingKeywordsResponse.getExample();
        OASTrendingKeywordsResponse trendingKeywordsResponse2 = trendingKeywordsResponse1;
        OASTrendingKeywordsResponse trendingKeywordsResponse3 = new OASTrendingKeywordsResponse();
        OASTrendingKeywordsResponse trendingKeywordsResponse4 = trendingKeywordsResponse3;

        System.assert(trendingKeywordsResponse1.equals(trendingKeywordsResponse2));
        System.assert(trendingKeywordsResponse2.equals(trendingKeywordsResponse1));
        System.assert(trendingKeywordsResponse1.equals(trendingKeywordsResponse1));
        System.assert(trendingKeywordsResponse3.equals(trendingKeywordsResponse4));
        System.assert(trendingKeywordsResponse4.equals(trendingKeywordsResponse3));
        System.assert(trendingKeywordsResponse3.equals(trendingKeywordsResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTrendingKeywordsResponse trendingKeywordsResponse1 = OASTrendingKeywordsResponse.getExample();
        OASTrendingKeywordsResponse trendingKeywordsResponse2 = OASTrendingKeywordsResponse.getExample();
        OASTrendingKeywordsResponse trendingKeywordsResponse3 = new OASTrendingKeywordsResponse();
        OASTrendingKeywordsResponse trendingKeywordsResponse4 = new OASTrendingKeywordsResponse();

        System.assert(trendingKeywordsResponse1.equals(trendingKeywordsResponse2));
        System.assert(trendingKeywordsResponse2.equals(trendingKeywordsResponse1));
        System.assert(trendingKeywordsResponse3.equals(trendingKeywordsResponse4));
        System.assert(trendingKeywordsResponse4.equals(trendingKeywordsResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTrendingKeywordsResponse trendingKeywordsResponse1 = OASTrendingKeywordsResponse.getExample();
        OASTrendingKeywordsResponse trendingKeywordsResponse2 = new OASTrendingKeywordsResponse();

        System.assertEquals(false, trendingKeywordsResponse1.equals('foo'));
        System.assertEquals(false, trendingKeywordsResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTrendingKeywordsResponse trendingKeywordsResponse1 = OASTrendingKeywordsResponse.getExample();
        OASTrendingKeywordsResponse trendingKeywordsResponse2 = new OASTrendingKeywordsResponse();
        OASTrendingKeywordsResponse trendingKeywordsResponse3;

        System.assertEquals(false, trendingKeywordsResponse1.equals(trendingKeywordsResponse3));
        System.assertEquals(false, trendingKeywordsResponse2.equals(trendingKeywordsResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTrendingKeywordsResponse trendingKeywordsResponse1 = OASTrendingKeywordsResponse.getExample();
        OASTrendingKeywordsResponse trendingKeywordsResponse2 = new OASTrendingKeywordsResponse();

        System.assertEquals(trendingKeywordsResponse1.hashCode(), trendingKeywordsResponse1.hashCode());
        System.assertEquals(trendingKeywordsResponse2.hashCode(), trendingKeywordsResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTrendingKeywordsResponse trendingKeywordsResponse1 = OASTrendingKeywordsResponse.getExample();
        OASTrendingKeywordsResponse trendingKeywordsResponse2 = OASTrendingKeywordsResponse.getExample();
        OASTrendingKeywordsResponse trendingKeywordsResponse3 = new OASTrendingKeywordsResponse();
        OASTrendingKeywordsResponse trendingKeywordsResponse4 = new OASTrendingKeywordsResponse();

        System.assert(trendingKeywordsResponse1.equals(trendingKeywordsResponse2));
        System.assert(trendingKeywordsResponse3.equals(trendingKeywordsResponse4));
        System.assertEquals(trendingKeywordsResponse1.hashCode(), trendingKeywordsResponse2.hashCode());
        System.assertEquals(trendingKeywordsResponse3.hashCode(), trendingKeywordsResponse4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASTrendingKeywordsResponse trendingKeywordsResponse = new OASTrendingKeywordsResponse();
        System.assertEquals(new List<OASTrendingKeywordsResponseTrendsInn>(), trendingKeywordsResponse.trends);
    }
}
