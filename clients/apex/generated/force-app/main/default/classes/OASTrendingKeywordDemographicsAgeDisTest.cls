@isTest
private class OASTrendingKeywordDemographicsAgeDisTest {
    @isTest
    private static void equalsSameInstance() {
        OASTrendingKeywordDemographicsAgeDis trendingKeywordDemographicsAgeDistribution1 = OASTrendingKeywordDemographicsAgeDis.getExample();
        OASTrendingKeywordDemographicsAgeDis trendingKeywordDemographicsAgeDistribution2 = trendingKeywordDemographicsAgeDistribution1;
        OASTrendingKeywordDemographicsAgeDis trendingKeywordDemographicsAgeDistribution3 = new OASTrendingKeywordDemographicsAgeDis();
        OASTrendingKeywordDemographicsAgeDis trendingKeywordDemographicsAgeDistribution4 = trendingKeywordDemographicsAgeDistribution3;

        System.assert(trendingKeywordDemographicsAgeDistribution1.equals(trendingKeywordDemographicsAgeDistribution2));
        System.assert(trendingKeywordDemographicsAgeDistribution2.equals(trendingKeywordDemographicsAgeDistribution1));
        System.assert(trendingKeywordDemographicsAgeDistribution1.equals(trendingKeywordDemographicsAgeDistribution1));
        System.assert(trendingKeywordDemographicsAgeDistribution3.equals(trendingKeywordDemographicsAgeDistribution4));
        System.assert(trendingKeywordDemographicsAgeDistribution4.equals(trendingKeywordDemographicsAgeDistribution3));
        System.assert(trendingKeywordDemographicsAgeDistribution3.equals(trendingKeywordDemographicsAgeDistribution3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTrendingKeywordDemographicsAgeDis trendingKeywordDemographicsAgeDistribution1 = OASTrendingKeywordDemographicsAgeDis.getExample();
        OASTrendingKeywordDemographicsAgeDis trendingKeywordDemographicsAgeDistribution2 = OASTrendingKeywordDemographicsAgeDis.getExample();
        OASTrendingKeywordDemographicsAgeDis trendingKeywordDemographicsAgeDistribution3 = new OASTrendingKeywordDemographicsAgeDis();
        OASTrendingKeywordDemographicsAgeDis trendingKeywordDemographicsAgeDistribution4 = new OASTrendingKeywordDemographicsAgeDis();

        System.assert(trendingKeywordDemographicsAgeDistribution1.equals(trendingKeywordDemographicsAgeDistribution2));
        System.assert(trendingKeywordDemographicsAgeDistribution2.equals(trendingKeywordDemographicsAgeDistribution1));
        System.assert(trendingKeywordDemographicsAgeDistribution3.equals(trendingKeywordDemographicsAgeDistribution4));
        System.assert(trendingKeywordDemographicsAgeDistribution4.equals(trendingKeywordDemographicsAgeDistribution3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTrendingKeywordDemographicsAgeDis trendingKeywordDemographicsAgeDistribution1 = OASTrendingKeywordDemographicsAgeDis.getExample();
        OASTrendingKeywordDemographicsAgeDis trendingKeywordDemographicsAgeDistribution2 = new OASTrendingKeywordDemographicsAgeDis();

        System.assertEquals(false, trendingKeywordDemographicsAgeDistribution1.equals('foo'));
        System.assertEquals(false, trendingKeywordDemographicsAgeDistribution2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTrendingKeywordDemographicsAgeDis trendingKeywordDemographicsAgeDistribution1 = OASTrendingKeywordDemographicsAgeDis.getExample();
        OASTrendingKeywordDemographicsAgeDis trendingKeywordDemographicsAgeDistribution2 = new OASTrendingKeywordDemographicsAgeDis();
        OASTrendingKeywordDemographicsAgeDis trendingKeywordDemographicsAgeDistribution3;

        System.assertEquals(false, trendingKeywordDemographicsAgeDistribution1.equals(trendingKeywordDemographicsAgeDistribution3));
        System.assertEquals(false, trendingKeywordDemographicsAgeDistribution2.equals(trendingKeywordDemographicsAgeDistribution3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTrendingKeywordDemographicsAgeDis trendingKeywordDemographicsAgeDistribution1 = OASTrendingKeywordDemographicsAgeDis.getExample();
        OASTrendingKeywordDemographicsAgeDis trendingKeywordDemographicsAgeDistribution2 = new OASTrendingKeywordDemographicsAgeDis();

        System.assertEquals(trendingKeywordDemographicsAgeDistribution1.hashCode(), trendingKeywordDemographicsAgeDistribution1.hashCode());
        System.assertEquals(trendingKeywordDemographicsAgeDistribution2.hashCode(), trendingKeywordDemographicsAgeDistribution2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTrendingKeywordDemographicsAgeDis trendingKeywordDemographicsAgeDistribution1 = OASTrendingKeywordDemographicsAgeDis.getExample();
        OASTrendingKeywordDemographicsAgeDis trendingKeywordDemographicsAgeDistribution2 = OASTrendingKeywordDemographicsAgeDis.getExample();
        OASTrendingKeywordDemographicsAgeDis trendingKeywordDemographicsAgeDistribution3 = new OASTrendingKeywordDemographicsAgeDis();
        OASTrendingKeywordDemographicsAgeDis trendingKeywordDemographicsAgeDistribution4 = new OASTrendingKeywordDemographicsAgeDis();

        System.assert(trendingKeywordDemographicsAgeDistribution1.equals(trendingKeywordDemographicsAgeDistribution2));
        System.assert(trendingKeywordDemographicsAgeDistribution3.equals(trendingKeywordDemographicsAgeDistribution4));
        System.assertEquals(trendingKeywordDemographicsAgeDistribution1.hashCode(), trendingKeywordDemographicsAgeDistribution2.hashCode());
        System.assertEquals(trendingKeywordDemographicsAgeDistribution3.hashCode(), trendingKeywordDemographicsAgeDistribution4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASTrendingKeywordDemographicsAgeDis trendingKeywordDemographicsAgeDistribution = new OASTrendingKeywordDemographicsAgeDis();
        Map<String, String> x-property-mappings = trendingKeywordDemographicsAgeDistribution.getx-property-mappings();
        System.assertEquals('ageDistribution', x-property-mappings.get('age_distribution'));
    }
}
