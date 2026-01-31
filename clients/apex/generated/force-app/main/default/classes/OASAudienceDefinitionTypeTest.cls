@isTest
private class OASAudienceDefinitionTypeTest {
    @isTest
    private static void equalsSameInstance() {
        OASAudienceDefinitionType audienceDefinitionType1 = OASAudienceDefinitionType.getExample();
        OASAudienceDefinitionType audienceDefinitionType2 = audienceDefinitionType1;
        OASAudienceDefinitionType audienceDefinitionType3 = new OASAudienceDefinitionType();
        OASAudienceDefinitionType audienceDefinitionType4 = audienceDefinitionType3;

        System.assert(audienceDefinitionType1.equals(audienceDefinitionType2));
        System.assert(audienceDefinitionType2.equals(audienceDefinitionType1));
        System.assert(audienceDefinitionType1.equals(audienceDefinitionType1));
        System.assert(audienceDefinitionType3.equals(audienceDefinitionType4));
        System.assert(audienceDefinitionType4.equals(audienceDefinitionType3));
        System.assert(audienceDefinitionType3.equals(audienceDefinitionType3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAudienceDefinitionType audienceDefinitionType1 = OASAudienceDefinitionType.getExample();
        OASAudienceDefinitionType audienceDefinitionType2 = OASAudienceDefinitionType.getExample();
        OASAudienceDefinitionType audienceDefinitionType3 = new OASAudienceDefinitionType();
        OASAudienceDefinitionType audienceDefinitionType4 = new OASAudienceDefinitionType();

        System.assert(audienceDefinitionType1.equals(audienceDefinitionType2));
        System.assert(audienceDefinitionType2.equals(audienceDefinitionType1));
        System.assert(audienceDefinitionType3.equals(audienceDefinitionType4));
        System.assert(audienceDefinitionType4.equals(audienceDefinitionType3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAudienceDefinitionType audienceDefinitionType1 = OASAudienceDefinitionType.getExample();
        OASAudienceDefinitionType audienceDefinitionType2 = new OASAudienceDefinitionType();

        System.assertEquals(false, audienceDefinitionType1.equals('foo'));
        System.assertEquals(false, audienceDefinitionType2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAudienceDefinitionType audienceDefinitionType1 = OASAudienceDefinitionType.getExample();
        OASAudienceDefinitionType audienceDefinitionType2 = new OASAudienceDefinitionType();
        OASAudienceDefinitionType audienceDefinitionType3;

        System.assertEquals(false, audienceDefinitionType1.equals(audienceDefinitionType3));
        System.assertEquals(false, audienceDefinitionType2.equals(audienceDefinitionType3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAudienceDefinitionType audienceDefinitionType1 = OASAudienceDefinitionType.getExample();
        OASAudienceDefinitionType audienceDefinitionType2 = new OASAudienceDefinitionType();

        System.assertEquals(audienceDefinitionType1.hashCode(), audienceDefinitionType1.hashCode());
        System.assertEquals(audienceDefinitionType2.hashCode(), audienceDefinitionType2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAudienceDefinitionType audienceDefinitionType1 = OASAudienceDefinitionType.getExample();
        OASAudienceDefinitionType audienceDefinitionType2 = OASAudienceDefinitionType.getExample();
        OASAudienceDefinitionType audienceDefinitionType3 = new OASAudienceDefinitionType();
        OASAudienceDefinitionType audienceDefinitionType4 = new OASAudienceDefinitionType();

        System.assert(audienceDefinitionType1.equals(audienceDefinitionType2));
        System.assert(audienceDefinitionType3.equals(audienceDefinitionType4));
        System.assertEquals(audienceDefinitionType1.hashCode(), audienceDefinitionType2.hashCode());
        System.assertEquals(audienceDefinitionType3.hashCode(), audienceDefinitionType4.hashCode());
    }
}
