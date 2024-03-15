@isTest
private class OASAudienceDemographicsTest {
    @isTest
    private static void equalsSameInstance() {
        OASAudienceDemographics audienceDemographics1 = OASAudienceDemographics.getExample();
        OASAudienceDemographics audienceDemographics2 = audienceDemographics1;
        OASAudienceDemographics audienceDemographics3 = new OASAudienceDemographics();
        OASAudienceDemographics audienceDemographics4 = audienceDemographics3;

        System.assert(audienceDemographics1.equals(audienceDemographics2));
        System.assert(audienceDemographics2.equals(audienceDemographics1));
        System.assert(audienceDemographics1.equals(audienceDemographics1));
        System.assert(audienceDemographics3.equals(audienceDemographics4));
        System.assert(audienceDemographics4.equals(audienceDemographics3));
        System.assert(audienceDemographics3.equals(audienceDemographics3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAudienceDemographics audienceDemographics1 = OASAudienceDemographics.getExample();
        OASAudienceDemographics audienceDemographics2 = OASAudienceDemographics.getExample();
        OASAudienceDemographics audienceDemographics3 = new OASAudienceDemographics();
        OASAudienceDemographics audienceDemographics4 = new OASAudienceDemographics();

        System.assert(audienceDemographics1.equals(audienceDemographics2));
        System.assert(audienceDemographics2.equals(audienceDemographics1));
        System.assert(audienceDemographics3.equals(audienceDemographics4));
        System.assert(audienceDemographics4.equals(audienceDemographics3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAudienceDemographics audienceDemographics1 = OASAudienceDemographics.getExample();
        OASAudienceDemographics audienceDemographics2 = new OASAudienceDemographics();

        System.assertEquals(false, audienceDemographics1.equals('foo'));
        System.assertEquals(false, audienceDemographics2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAudienceDemographics audienceDemographics1 = OASAudienceDemographics.getExample();
        OASAudienceDemographics audienceDemographics2 = new OASAudienceDemographics();
        OASAudienceDemographics audienceDemographics3;

        System.assertEquals(false, audienceDemographics1.equals(audienceDemographics3));
        System.assertEquals(false, audienceDemographics2.equals(audienceDemographics3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAudienceDemographics audienceDemographics1 = OASAudienceDemographics.getExample();
        OASAudienceDemographics audienceDemographics2 = new OASAudienceDemographics();

        System.assertEquals(audienceDemographics1.hashCode(), audienceDemographics1.hashCode());
        System.assertEquals(audienceDemographics2.hashCode(), audienceDemographics2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAudienceDemographics audienceDemographics1 = OASAudienceDemographics.getExample();
        OASAudienceDemographics audienceDemographics2 = OASAudienceDemographics.getExample();
        OASAudienceDemographics audienceDemographics3 = new OASAudienceDemographics();
        OASAudienceDemographics audienceDemographics4 = new OASAudienceDemographics();

        System.assert(audienceDemographics1.equals(audienceDemographics2));
        System.assert(audienceDemographics3.equals(audienceDemographics4));
        System.assertEquals(audienceDemographics1.hashCode(), audienceDemographics2.hashCode());
        System.assertEquals(audienceDemographics3.hashCode(), audienceDemographics4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAudienceDemographics audienceDemographics = new OASAudienceDemographics();
        System.assertEquals(new List<OASAudienceDemographicValue>(), audienceDemographics.ages);
        System.assertEquals(new List<OASAudienceDemographicValue>(), audienceDemographics.genders);
        System.assertEquals(new List<OASAudienceDemographicValue>(), audienceDemographics.devices);
        System.assertEquals(new List<OASAudienceDemographicValue>(), audienceDemographics.metros);
        System.assertEquals(new List<OASAudienceDemographicValue>(), audienceDemographics.countries);
    }
}
