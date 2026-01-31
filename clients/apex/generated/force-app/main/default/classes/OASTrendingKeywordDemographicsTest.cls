@isTest
private class OASTrendingKeywordDemographicsTest {
    @isTest
    private static void equalsSameInstance() {
        OASTrendingKeywordDemographics trendingKeywordDemographics1 = OASTrendingKeywordDemographics.getExample();
        OASTrendingKeywordDemographics trendingKeywordDemographics2 = trendingKeywordDemographics1;
        OASTrendingKeywordDemographics trendingKeywordDemographics3 = new OASTrendingKeywordDemographics();
        OASTrendingKeywordDemographics trendingKeywordDemographics4 = trendingKeywordDemographics3;

        System.assert(trendingKeywordDemographics1.equals(trendingKeywordDemographics2));
        System.assert(trendingKeywordDemographics2.equals(trendingKeywordDemographics1));
        System.assert(trendingKeywordDemographics1.equals(trendingKeywordDemographics1));
        System.assert(trendingKeywordDemographics3.equals(trendingKeywordDemographics4));
        System.assert(trendingKeywordDemographics4.equals(trendingKeywordDemographics3));
        System.assert(trendingKeywordDemographics3.equals(trendingKeywordDemographics3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTrendingKeywordDemographics trendingKeywordDemographics1 = OASTrendingKeywordDemographics.getExample();
        OASTrendingKeywordDemographics trendingKeywordDemographics2 = OASTrendingKeywordDemographics.getExample();
        OASTrendingKeywordDemographics trendingKeywordDemographics3 = new OASTrendingKeywordDemographics();
        OASTrendingKeywordDemographics trendingKeywordDemographics4 = new OASTrendingKeywordDemographics();

        System.assert(trendingKeywordDemographics1.equals(trendingKeywordDemographics2));
        System.assert(trendingKeywordDemographics2.equals(trendingKeywordDemographics1));
        System.assert(trendingKeywordDemographics3.equals(trendingKeywordDemographics4));
        System.assert(trendingKeywordDemographics4.equals(trendingKeywordDemographics3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTrendingKeywordDemographics trendingKeywordDemographics1 = OASTrendingKeywordDemographics.getExample();
        OASTrendingKeywordDemographics trendingKeywordDemographics2 = new OASTrendingKeywordDemographics();

        System.assertEquals(false, trendingKeywordDemographics1.equals('foo'));
        System.assertEquals(false, trendingKeywordDemographics2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTrendingKeywordDemographics trendingKeywordDemographics1 = OASTrendingKeywordDemographics.getExample();
        OASTrendingKeywordDemographics trendingKeywordDemographics2 = new OASTrendingKeywordDemographics();
        OASTrendingKeywordDemographics trendingKeywordDemographics3;

        System.assertEquals(false, trendingKeywordDemographics1.equals(trendingKeywordDemographics3));
        System.assertEquals(false, trendingKeywordDemographics2.equals(trendingKeywordDemographics3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTrendingKeywordDemographics trendingKeywordDemographics1 = OASTrendingKeywordDemographics.getExample();
        OASTrendingKeywordDemographics trendingKeywordDemographics2 = new OASTrendingKeywordDemographics();

        System.assertEquals(trendingKeywordDemographics1.hashCode(), trendingKeywordDemographics1.hashCode());
        System.assertEquals(trendingKeywordDemographics2.hashCode(), trendingKeywordDemographics2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTrendingKeywordDemographics trendingKeywordDemographics1 = OASTrendingKeywordDemographics.getExample();
        OASTrendingKeywordDemographics trendingKeywordDemographics2 = OASTrendingKeywordDemographics.getExample();
        OASTrendingKeywordDemographics trendingKeywordDemographics3 = new OASTrendingKeywordDemographics();
        OASTrendingKeywordDemographics trendingKeywordDemographics4 = new OASTrendingKeywordDemographics();

        System.assert(trendingKeywordDemographics1.equals(trendingKeywordDemographics2));
        System.assert(trendingKeywordDemographics3.equals(trendingKeywordDemographics4));
        System.assertEquals(trendingKeywordDemographics1.hashCode(), trendingKeywordDemographics2.hashCode());
        System.assertEquals(trendingKeywordDemographics3.hashCode(), trendingKeywordDemographics4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASTrendingKeywordDemographics trendingKeywordDemographics = new OASTrendingKeywordDemographics();
        Map<String, String> x-property-mappings = trendingKeywordDemographics.getx-property-mappings();
        System.assertEquals('ageDistribution', x-property-mappings.get('age_distribution'));
        System.assertEquals('genderDistribution', x-property-mappings.get('gender_distribution'));
    }
}
