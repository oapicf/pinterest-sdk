@isTest
private class OASTrendingTopicTest {
    @isTest
    private static void equalsSameInstance() {
        OASTrendingTopic trendingTopic1 = OASTrendingTopic.getExample();
        OASTrendingTopic trendingTopic2 = trendingTopic1;
        OASTrendingTopic trendingTopic3 = new OASTrendingTopic();
        OASTrendingTopic trendingTopic4 = trendingTopic3;

        System.assert(trendingTopic1.equals(trendingTopic2));
        System.assert(trendingTopic2.equals(trendingTopic1));
        System.assert(trendingTopic1.equals(trendingTopic1));
        System.assert(trendingTopic3.equals(trendingTopic4));
        System.assert(trendingTopic4.equals(trendingTopic3));
        System.assert(trendingTopic3.equals(trendingTopic3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTrendingTopic trendingTopic1 = OASTrendingTopic.getExample();
        OASTrendingTopic trendingTopic2 = OASTrendingTopic.getExample();
        OASTrendingTopic trendingTopic3 = new OASTrendingTopic();
        OASTrendingTopic trendingTopic4 = new OASTrendingTopic();

        System.assert(trendingTopic1.equals(trendingTopic2));
        System.assert(trendingTopic2.equals(trendingTopic1));
        System.assert(trendingTopic3.equals(trendingTopic4));
        System.assert(trendingTopic4.equals(trendingTopic3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTrendingTopic trendingTopic1 = OASTrendingTopic.getExample();
        OASTrendingTopic trendingTopic2 = new OASTrendingTopic();

        System.assertEquals(false, trendingTopic1.equals('foo'));
        System.assertEquals(false, trendingTopic2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTrendingTopic trendingTopic1 = OASTrendingTopic.getExample();
        OASTrendingTopic trendingTopic2 = new OASTrendingTopic();
        OASTrendingTopic trendingTopic3;

        System.assertEquals(false, trendingTopic1.equals(trendingTopic3));
        System.assertEquals(false, trendingTopic2.equals(trendingTopic3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTrendingTopic trendingTopic1 = OASTrendingTopic.getExample();
        OASTrendingTopic trendingTopic2 = new OASTrendingTopic();

        System.assertEquals(trendingTopic1.hashCode(), trendingTopic1.hashCode());
        System.assertEquals(trendingTopic2.hashCode(), trendingTopic2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTrendingTopic trendingTopic1 = OASTrendingTopic.getExample();
        OASTrendingTopic trendingTopic2 = OASTrendingTopic.getExample();
        OASTrendingTopic trendingTopic3 = new OASTrendingTopic();
        OASTrendingTopic trendingTopic4 = new OASTrendingTopic();

        System.assert(trendingTopic1.equals(trendingTopic2));
        System.assert(trendingTopic3.equals(trendingTopic4));
        System.assertEquals(trendingTopic1.hashCode(), trendingTopic2.hashCode());
        System.assertEquals(trendingTopic3.hashCode(), trendingTopic4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASTrendingTopic trendingTopic = new OASTrendingTopic();
        Map<String, String> x-property-mappings = trendingTopic.getx-property-mappings();
        System.assertEquals('percentGrowthMom', x-property-mappings.get('percent_growth_mom'));
        System.assertEquals('relatedInterests', x-property-mappings.get('related_interests'));
        System.assertEquals('relatedSearches', x-property-mappings.get('related_searches'));
        System.assertEquals('timeSeries', x-property-mappings.get('time_series'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASTrendingTopic trendingTopic = new OASTrendingTopic();
        System.assertEquals(new List<OASTrendingPin>(), trendingTopic.pins);
        System.assertEquals(new List<String>(), trendingTopic.relatedInterests);
        System.assertEquals(new List<String>(), trendingTopic.relatedSearches);
        System.assertEquals(new Map<String, Double>(), trendingTopic.timeSeries);
        System.assertEquals(null, trendingTopic.description);
        System.assertEquals(null, trendingTopic.percentGrowthMom);
        System.assertEquals(null, trendingTopic.title);
    }
}
