@isTest
private class OASTrendingKeywordDemographicsGenderTest {
    @isTest
    private static void equalsSameInstance() {
        OASTrendingKeywordDemographicsGender trendingKeywordDemographicsGenderDistribution1 = OASTrendingKeywordDemographicsGender.getExample();
        OASTrendingKeywordDemographicsGender trendingKeywordDemographicsGenderDistribution2 = trendingKeywordDemographicsGenderDistribution1;
        OASTrendingKeywordDemographicsGender trendingKeywordDemographicsGenderDistribution3 = new OASTrendingKeywordDemographicsGender();
        OASTrendingKeywordDemographicsGender trendingKeywordDemographicsGenderDistribution4 = trendingKeywordDemographicsGenderDistribution3;

        System.assert(trendingKeywordDemographicsGenderDistribution1.equals(trendingKeywordDemographicsGenderDistribution2));
        System.assert(trendingKeywordDemographicsGenderDistribution2.equals(trendingKeywordDemographicsGenderDistribution1));
        System.assert(trendingKeywordDemographicsGenderDistribution1.equals(trendingKeywordDemographicsGenderDistribution1));
        System.assert(trendingKeywordDemographicsGenderDistribution3.equals(trendingKeywordDemographicsGenderDistribution4));
        System.assert(trendingKeywordDemographicsGenderDistribution4.equals(trendingKeywordDemographicsGenderDistribution3));
        System.assert(trendingKeywordDemographicsGenderDistribution3.equals(trendingKeywordDemographicsGenderDistribution3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTrendingKeywordDemographicsGender trendingKeywordDemographicsGenderDistribution1 = OASTrendingKeywordDemographicsGender.getExample();
        OASTrendingKeywordDemographicsGender trendingKeywordDemographicsGenderDistribution2 = OASTrendingKeywordDemographicsGender.getExample();
        OASTrendingKeywordDemographicsGender trendingKeywordDemographicsGenderDistribution3 = new OASTrendingKeywordDemographicsGender();
        OASTrendingKeywordDemographicsGender trendingKeywordDemographicsGenderDistribution4 = new OASTrendingKeywordDemographicsGender();

        System.assert(trendingKeywordDemographicsGenderDistribution1.equals(trendingKeywordDemographicsGenderDistribution2));
        System.assert(trendingKeywordDemographicsGenderDistribution2.equals(trendingKeywordDemographicsGenderDistribution1));
        System.assert(trendingKeywordDemographicsGenderDistribution3.equals(trendingKeywordDemographicsGenderDistribution4));
        System.assert(trendingKeywordDemographicsGenderDistribution4.equals(trendingKeywordDemographicsGenderDistribution3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTrendingKeywordDemographicsGender trendingKeywordDemographicsGenderDistribution1 = OASTrendingKeywordDemographicsGender.getExample();
        OASTrendingKeywordDemographicsGender trendingKeywordDemographicsGenderDistribution2 = new OASTrendingKeywordDemographicsGender();

        System.assertEquals(false, trendingKeywordDemographicsGenderDistribution1.equals('foo'));
        System.assertEquals(false, trendingKeywordDemographicsGenderDistribution2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTrendingKeywordDemographicsGender trendingKeywordDemographicsGenderDistribution1 = OASTrendingKeywordDemographicsGender.getExample();
        OASTrendingKeywordDemographicsGender trendingKeywordDemographicsGenderDistribution2 = new OASTrendingKeywordDemographicsGender();
        OASTrendingKeywordDemographicsGender trendingKeywordDemographicsGenderDistribution3;

        System.assertEquals(false, trendingKeywordDemographicsGenderDistribution1.equals(trendingKeywordDemographicsGenderDistribution3));
        System.assertEquals(false, trendingKeywordDemographicsGenderDistribution2.equals(trendingKeywordDemographicsGenderDistribution3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTrendingKeywordDemographicsGender trendingKeywordDemographicsGenderDistribution1 = OASTrendingKeywordDemographicsGender.getExample();
        OASTrendingKeywordDemographicsGender trendingKeywordDemographicsGenderDistribution2 = new OASTrendingKeywordDemographicsGender();

        System.assertEquals(trendingKeywordDemographicsGenderDistribution1.hashCode(), trendingKeywordDemographicsGenderDistribution1.hashCode());
        System.assertEquals(trendingKeywordDemographicsGenderDistribution2.hashCode(), trendingKeywordDemographicsGenderDistribution2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTrendingKeywordDemographicsGender trendingKeywordDemographicsGenderDistribution1 = OASTrendingKeywordDemographicsGender.getExample();
        OASTrendingKeywordDemographicsGender trendingKeywordDemographicsGenderDistribution2 = OASTrendingKeywordDemographicsGender.getExample();
        OASTrendingKeywordDemographicsGender trendingKeywordDemographicsGenderDistribution3 = new OASTrendingKeywordDemographicsGender();
        OASTrendingKeywordDemographicsGender trendingKeywordDemographicsGenderDistribution4 = new OASTrendingKeywordDemographicsGender();

        System.assert(trendingKeywordDemographicsGenderDistribution1.equals(trendingKeywordDemographicsGenderDistribution2));
        System.assert(trendingKeywordDemographicsGenderDistribution3.equals(trendingKeywordDemographicsGenderDistribution4));
        System.assertEquals(trendingKeywordDemographicsGenderDistribution1.hashCode(), trendingKeywordDemographicsGenderDistribution2.hashCode());
        System.assertEquals(trendingKeywordDemographicsGenderDistribution3.hashCode(), trendingKeywordDemographicsGenderDistribution4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASTrendingKeywordDemographicsGender trendingKeywordDemographicsGenderDistribution = new OASTrendingKeywordDemographicsGender();
        Map<String, String> x-property-mappings = trendingKeywordDemographicsGenderDistribution.getx-property-mappings();
        System.assertEquals('genderDistribution', x-property-mappings.get('gender_distribution'));
    }
}
