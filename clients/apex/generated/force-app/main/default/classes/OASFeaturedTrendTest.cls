@isTest
private class OASFeaturedTrendTest {
    @isTest
    private static void equalsSameInstance() {
        OASFeaturedTrend featuredTrend1 = OASFeaturedTrend.getExample();
        OASFeaturedTrend featuredTrend2 = featuredTrend1;
        OASFeaturedTrend featuredTrend3 = new OASFeaturedTrend();
        OASFeaturedTrend featuredTrend4 = featuredTrend3;

        System.assert(featuredTrend1.equals(featuredTrend2));
        System.assert(featuredTrend2.equals(featuredTrend1));
        System.assert(featuredTrend1.equals(featuredTrend1));
        System.assert(featuredTrend3.equals(featuredTrend4));
        System.assert(featuredTrend4.equals(featuredTrend3));
        System.assert(featuredTrend3.equals(featuredTrend3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASFeaturedTrend featuredTrend1 = OASFeaturedTrend.getExample();
        OASFeaturedTrend featuredTrend2 = OASFeaturedTrend.getExample();
        OASFeaturedTrend featuredTrend3 = new OASFeaturedTrend();
        OASFeaturedTrend featuredTrend4 = new OASFeaturedTrend();

        System.assert(featuredTrend1.equals(featuredTrend2));
        System.assert(featuredTrend2.equals(featuredTrend1));
        System.assert(featuredTrend3.equals(featuredTrend4));
        System.assert(featuredTrend4.equals(featuredTrend3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASFeaturedTrend featuredTrend1 = OASFeaturedTrend.getExample();
        OASFeaturedTrend featuredTrend2 = new OASFeaturedTrend();

        System.assertEquals(false, featuredTrend1.equals('foo'));
        System.assertEquals(false, featuredTrend2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASFeaturedTrend featuredTrend1 = OASFeaturedTrend.getExample();
        OASFeaturedTrend featuredTrend2 = new OASFeaturedTrend();
        OASFeaturedTrend featuredTrend3;

        System.assertEquals(false, featuredTrend1.equals(featuredTrend3));
        System.assertEquals(false, featuredTrend2.equals(featuredTrend3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASFeaturedTrend featuredTrend1 = OASFeaturedTrend.getExample();
        OASFeaturedTrend featuredTrend2 = new OASFeaturedTrend();

        System.assertEquals(featuredTrend1.hashCode(), featuredTrend1.hashCode());
        System.assertEquals(featuredTrend2.hashCode(), featuredTrend2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASFeaturedTrend featuredTrend1 = OASFeaturedTrend.getExample();
        OASFeaturedTrend featuredTrend2 = OASFeaturedTrend.getExample();
        OASFeaturedTrend featuredTrend3 = new OASFeaturedTrend();
        OASFeaturedTrend featuredTrend4 = new OASFeaturedTrend();

        System.assert(featuredTrend1.equals(featuredTrend2));
        System.assert(featuredTrend3.equals(featuredTrend4));
        System.assertEquals(featuredTrend1.hashCode(), featuredTrend2.hashCode());
        System.assertEquals(featuredTrend3.hashCode(), featuredTrend4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASFeaturedTrend featuredTrend = new OASFeaturedTrend();
        System.assertEquals(new List<OASTrendingTopic>(), featuredTrend.trends);
        System.assertEquals(null, featuredTrend.interest);
        System.assertEquals(null, featuredTrend.market);
    }
}
