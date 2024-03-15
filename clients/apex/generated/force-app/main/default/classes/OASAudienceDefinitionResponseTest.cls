@isTest
private class OASAudienceDefinitionResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASAudienceDefinitionResponse audienceDefinitionResponse1 = OASAudienceDefinitionResponse.getExample();
        OASAudienceDefinitionResponse audienceDefinitionResponse2 = audienceDefinitionResponse1;
        OASAudienceDefinitionResponse audienceDefinitionResponse3 = new OASAudienceDefinitionResponse();
        OASAudienceDefinitionResponse audienceDefinitionResponse4 = audienceDefinitionResponse3;

        System.assert(audienceDefinitionResponse1.equals(audienceDefinitionResponse2));
        System.assert(audienceDefinitionResponse2.equals(audienceDefinitionResponse1));
        System.assert(audienceDefinitionResponse1.equals(audienceDefinitionResponse1));
        System.assert(audienceDefinitionResponse3.equals(audienceDefinitionResponse4));
        System.assert(audienceDefinitionResponse4.equals(audienceDefinitionResponse3));
        System.assert(audienceDefinitionResponse3.equals(audienceDefinitionResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAudienceDefinitionResponse audienceDefinitionResponse1 = OASAudienceDefinitionResponse.getExample();
        OASAudienceDefinitionResponse audienceDefinitionResponse2 = OASAudienceDefinitionResponse.getExample();
        OASAudienceDefinitionResponse audienceDefinitionResponse3 = new OASAudienceDefinitionResponse();
        OASAudienceDefinitionResponse audienceDefinitionResponse4 = new OASAudienceDefinitionResponse();

        System.assert(audienceDefinitionResponse1.equals(audienceDefinitionResponse2));
        System.assert(audienceDefinitionResponse2.equals(audienceDefinitionResponse1));
        System.assert(audienceDefinitionResponse3.equals(audienceDefinitionResponse4));
        System.assert(audienceDefinitionResponse4.equals(audienceDefinitionResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAudienceDefinitionResponse audienceDefinitionResponse1 = OASAudienceDefinitionResponse.getExample();
        OASAudienceDefinitionResponse audienceDefinitionResponse2 = new OASAudienceDefinitionResponse();

        System.assertEquals(false, audienceDefinitionResponse1.equals('foo'));
        System.assertEquals(false, audienceDefinitionResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAudienceDefinitionResponse audienceDefinitionResponse1 = OASAudienceDefinitionResponse.getExample();
        OASAudienceDefinitionResponse audienceDefinitionResponse2 = new OASAudienceDefinitionResponse();
        OASAudienceDefinitionResponse audienceDefinitionResponse3;

        System.assertEquals(false, audienceDefinitionResponse1.equals(audienceDefinitionResponse3));
        System.assertEquals(false, audienceDefinitionResponse2.equals(audienceDefinitionResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAudienceDefinitionResponse audienceDefinitionResponse1 = OASAudienceDefinitionResponse.getExample();
        OASAudienceDefinitionResponse audienceDefinitionResponse2 = new OASAudienceDefinitionResponse();

        System.assertEquals(audienceDefinitionResponse1.hashCode(), audienceDefinitionResponse1.hashCode());
        System.assertEquals(audienceDefinitionResponse2.hashCode(), audienceDefinitionResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAudienceDefinitionResponse audienceDefinitionResponse1 = OASAudienceDefinitionResponse.getExample();
        OASAudienceDefinitionResponse audienceDefinitionResponse2 = OASAudienceDefinitionResponse.getExample();
        OASAudienceDefinitionResponse audienceDefinitionResponse3 = new OASAudienceDefinitionResponse();
        OASAudienceDefinitionResponse audienceDefinitionResponse4 = new OASAudienceDefinitionResponse();

        System.assert(audienceDefinitionResponse1.equals(audienceDefinitionResponse2));
        System.assert(audienceDefinitionResponse3.equals(audienceDefinitionResponse4));
        System.assertEquals(audienceDefinitionResponse1.hashCode(), audienceDefinitionResponse2.hashCode());
        System.assertEquals(audienceDefinitionResponse3.hashCode(), audienceDefinitionResponse4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAudienceDefinitionResponse audienceDefinitionResponse = new OASAudienceDefinitionResponse();
        System.assertEquals(new List<OASAudienceDefinition>(), audienceDefinitionResponse.items);
    }
}
