@isTest
private class OASAudienceDefinitionTest {
    @isTest
    private static void equalsSameInstance() {
        OASAudienceDefinition audienceDefinition1 = OASAudienceDefinition.getExample();
        OASAudienceDefinition audienceDefinition2 = audienceDefinition1;
        OASAudienceDefinition audienceDefinition3 = new OASAudienceDefinition();
        OASAudienceDefinition audienceDefinition4 = audienceDefinition3;

        System.assert(audienceDefinition1.equals(audienceDefinition2));
        System.assert(audienceDefinition2.equals(audienceDefinition1));
        System.assert(audienceDefinition1.equals(audienceDefinition1));
        System.assert(audienceDefinition3.equals(audienceDefinition4));
        System.assert(audienceDefinition4.equals(audienceDefinition3));
        System.assert(audienceDefinition3.equals(audienceDefinition3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAudienceDefinition audienceDefinition1 = OASAudienceDefinition.getExample();
        OASAudienceDefinition audienceDefinition2 = OASAudienceDefinition.getExample();
        OASAudienceDefinition audienceDefinition3 = new OASAudienceDefinition();
        OASAudienceDefinition audienceDefinition4 = new OASAudienceDefinition();

        System.assert(audienceDefinition1.equals(audienceDefinition2));
        System.assert(audienceDefinition2.equals(audienceDefinition1));
        System.assert(audienceDefinition3.equals(audienceDefinition4));
        System.assert(audienceDefinition4.equals(audienceDefinition3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAudienceDefinition audienceDefinition1 = OASAudienceDefinition.getExample();
        OASAudienceDefinition audienceDefinition2 = new OASAudienceDefinition();

        System.assertEquals(false, audienceDefinition1.equals('foo'));
        System.assertEquals(false, audienceDefinition2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAudienceDefinition audienceDefinition1 = OASAudienceDefinition.getExample();
        OASAudienceDefinition audienceDefinition2 = new OASAudienceDefinition();
        OASAudienceDefinition audienceDefinition3;

        System.assertEquals(false, audienceDefinition1.equals(audienceDefinition3));
        System.assertEquals(false, audienceDefinition2.equals(audienceDefinition3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAudienceDefinition audienceDefinition1 = OASAudienceDefinition.getExample();
        OASAudienceDefinition audienceDefinition2 = new OASAudienceDefinition();

        System.assertEquals(audienceDefinition1.hashCode(), audienceDefinition1.hashCode());
        System.assertEquals(audienceDefinition2.hashCode(), audienceDefinition2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAudienceDefinition audienceDefinition1 = OASAudienceDefinition.getExample();
        OASAudienceDefinition audienceDefinition2 = OASAudienceDefinition.getExample();
        OASAudienceDefinition audienceDefinition3 = new OASAudienceDefinition();
        OASAudienceDefinition audienceDefinition4 = new OASAudienceDefinition();

        System.assert(audienceDefinition1.equals(audienceDefinition2));
        System.assert(audienceDefinition3.equals(audienceDefinition4));
        System.assertEquals(audienceDefinition1.hashCode(), audienceDefinition2.hashCode());
        System.assertEquals(audienceDefinition3.hashCode(), audienceDefinition4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAudienceDefinition audienceDefinition = new OASAudienceDefinition();
        Map<String, String> x-property-mappings = audienceDefinition.getx-property-mappings();
        System.assertEquals('r_date', x-property-mappings.get('date'));
    }
}
