@isTest
private class OASGenderDemographicsTest {
    @isTest
    private static void equalsSameInstance() {
        OASGenderDemographics genderDemographics1 = OASGenderDemographics.getExample();
        OASGenderDemographics genderDemographics2 = genderDemographics1;
        OASGenderDemographics genderDemographics3 = new OASGenderDemographics();
        OASGenderDemographics genderDemographics4 = genderDemographics3;

        System.assert(genderDemographics1.equals(genderDemographics2));
        System.assert(genderDemographics2.equals(genderDemographics1));
        System.assert(genderDemographics1.equals(genderDemographics1));
        System.assert(genderDemographics3.equals(genderDemographics4));
        System.assert(genderDemographics4.equals(genderDemographics3));
        System.assert(genderDemographics3.equals(genderDemographics3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGenderDemographics genderDemographics1 = OASGenderDemographics.getExample();
        OASGenderDemographics genderDemographics2 = OASGenderDemographics.getExample();
        OASGenderDemographics genderDemographics3 = new OASGenderDemographics();
        OASGenderDemographics genderDemographics4 = new OASGenderDemographics();

        System.assert(genderDemographics1.equals(genderDemographics2));
        System.assert(genderDemographics2.equals(genderDemographics1));
        System.assert(genderDemographics3.equals(genderDemographics4));
        System.assert(genderDemographics4.equals(genderDemographics3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGenderDemographics genderDemographics1 = OASGenderDemographics.getExample();
        OASGenderDemographics genderDemographics2 = new OASGenderDemographics();

        System.assertEquals(false, genderDemographics1.equals('foo'));
        System.assertEquals(false, genderDemographics2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGenderDemographics genderDemographics1 = OASGenderDemographics.getExample();
        OASGenderDemographics genderDemographics2 = new OASGenderDemographics();
        OASGenderDemographics genderDemographics3;

        System.assertEquals(false, genderDemographics1.equals(genderDemographics3));
        System.assertEquals(false, genderDemographics2.equals(genderDemographics3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGenderDemographics genderDemographics1 = OASGenderDemographics.getExample();
        OASGenderDemographics genderDemographics2 = new OASGenderDemographics();

        System.assertEquals(genderDemographics1.hashCode(), genderDemographics1.hashCode());
        System.assertEquals(genderDemographics2.hashCode(), genderDemographics2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGenderDemographics genderDemographics1 = OASGenderDemographics.getExample();
        OASGenderDemographics genderDemographics2 = OASGenderDemographics.getExample();
        OASGenderDemographics genderDemographics3 = new OASGenderDemographics();
        OASGenderDemographics genderDemographics4 = new OASGenderDemographics();

        System.assert(genderDemographics1.equals(genderDemographics2));
        System.assert(genderDemographics3.equals(genderDemographics4));
        System.assertEquals(genderDemographics1.hashCode(), genderDemographics2.hashCode());
        System.assertEquals(genderDemographics3.hashCode(), genderDemographics4.hashCode());
    }
}
