@isTest
private class OASAudienceDemographicValueTest {
    @isTest
    private static void equalsSameInstance() {
        OASAudienceDemographicValue audienceDemographicValue1 = OASAudienceDemographicValue.getExample();
        OASAudienceDemographicValue audienceDemographicValue2 = audienceDemographicValue1;
        OASAudienceDemographicValue audienceDemographicValue3 = new OASAudienceDemographicValue();
        OASAudienceDemographicValue audienceDemographicValue4 = audienceDemographicValue3;

        System.assert(audienceDemographicValue1.equals(audienceDemographicValue2));
        System.assert(audienceDemographicValue2.equals(audienceDemographicValue1));
        System.assert(audienceDemographicValue1.equals(audienceDemographicValue1));
        System.assert(audienceDemographicValue3.equals(audienceDemographicValue4));
        System.assert(audienceDemographicValue4.equals(audienceDemographicValue3));
        System.assert(audienceDemographicValue3.equals(audienceDemographicValue3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAudienceDemographicValue audienceDemographicValue1 = OASAudienceDemographicValue.getExample();
        OASAudienceDemographicValue audienceDemographicValue2 = OASAudienceDemographicValue.getExample();
        OASAudienceDemographicValue audienceDemographicValue3 = new OASAudienceDemographicValue();
        OASAudienceDemographicValue audienceDemographicValue4 = new OASAudienceDemographicValue();

        System.assert(audienceDemographicValue1.equals(audienceDemographicValue2));
        System.assert(audienceDemographicValue2.equals(audienceDemographicValue1));
        System.assert(audienceDemographicValue3.equals(audienceDemographicValue4));
        System.assert(audienceDemographicValue4.equals(audienceDemographicValue3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAudienceDemographicValue audienceDemographicValue1 = OASAudienceDemographicValue.getExample();
        OASAudienceDemographicValue audienceDemographicValue2 = new OASAudienceDemographicValue();

        System.assertEquals(false, audienceDemographicValue1.equals('foo'));
        System.assertEquals(false, audienceDemographicValue2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAudienceDemographicValue audienceDemographicValue1 = OASAudienceDemographicValue.getExample();
        OASAudienceDemographicValue audienceDemographicValue2 = new OASAudienceDemographicValue();
        OASAudienceDemographicValue audienceDemographicValue3;

        System.assertEquals(false, audienceDemographicValue1.equals(audienceDemographicValue3));
        System.assertEquals(false, audienceDemographicValue2.equals(audienceDemographicValue3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAudienceDemographicValue audienceDemographicValue1 = OASAudienceDemographicValue.getExample();
        OASAudienceDemographicValue audienceDemographicValue2 = new OASAudienceDemographicValue();

        System.assertEquals(audienceDemographicValue1.hashCode(), audienceDemographicValue1.hashCode());
        System.assertEquals(audienceDemographicValue2.hashCode(), audienceDemographicValue2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAudienceDemographicValue audienceDemographicValue1 = OASAudienceDemographicValue.getExample();
        OASAudienceDemographicValue audienceDemographicValue2 = OASAudienceDemographicValue.getExample();
        OASAudienceDemographicValue audienceDemographicValue3 = new OASAudienceDemographicValue();
        OASAudienceDemographicValue audienceDemographicValue4 = new OASAudienceDemographicValue();

        System.assert(audienceDemographicValue1.equals(audienceDemographicValue2));
        System.assert(audienceDemographicValue3.equals(audienceDemographicValue4));
        System.assertEquals(audienceDemographicValue1.hashCode(), audienceDemographicValue2.hashCode());
        System.assertEquals(audienceDemographicValue3.hashCode(), audienceDemographicValue4.hashCode());
    }
}
