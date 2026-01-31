@isTest
private class OASAudienceDefinitionScopeTest {
    @isTest
    private static void equalsSameInstance() {
        OASAudienceDefinitionScope audienceDefinitionScope1 = OASAudienceDefinitionScope.getExample();
        OASAudienceDefinitionScope audienceDefinitionScope2 = audienceDefinitionScope1;
        OASAudienceDefinitionScope audienceDefinitionScope3 = new OASAudienceDefinitionScope();
        OASAudienceDefinitionScope audienceDefinitionScope4 = audienceDefinitionScope3;

        System.assert(audienceDefinitionScope1.equals(audienceDefinitionScope2));
        System.assert(audienceDefinitionScope2.equals(audienceDefinitionScope1));
        System.assert(audienceDefinitionScope1.equals(audienceDefinitionScope1));
        System.assert(audienceDefinitionScope3.equals(audienceDefinitionScope4));
        System.assert(audienceDefinitionScope4.equals(audienceDefinitionScope3));
        System.assert(audienceDefinitionScope3.equals(audienceDefinitionScope3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAudienceDefinitionScope audienceDefinitionScope1 = OASAudienceDefinitionScope.getExample();
        OASAudienceDefinitionScope audienceDefinitionScope2 = OASAudienceDefinitionScope.getExample();
        OASAudienceDefinitionScope audienceDefinitionScope3 = new OASAudienceDefinitionScope();
        OASAudienceDefinitionScope audienceDefinitionScope4 = new OASAudienceDefinitionScope();

        System.assert(audienceDefinitionScope1.equals(audienceDefinitionScope2));
        System.assert(audienceDefinitionScope2.equals(audienceDefinitionScope1));
        System.assert(audienceDefinitionScope3.equals(audienceDefinitionScope4));
        System.assert(audienceDefinitionScope4.equals(audienceDefinitionScope3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAudienceDefinitionScope audienceDefinitionScope1 = OASAudienceDefinitionScope.getExample();
        OASAudienceDefinitionScope audienceDefinitionScope2 = new OASAudienceDefinitionScope();

        System.assertEquals(false, audienceDefinitionScope1.equals('foo'));
        System.assertEquals(false, audienceDefinitionScope2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAudienceDefinitionScope audienceDefinitionScope1 = OASAudienceDefinitionScope.getExample();
        OASAudienceDefinitionScope audienceDefinitionScope2 = new OASAudienceDefinitionScope();
        OASAudienceDefinitionScope audienceDefinitionScope3;

        System.assertEquals(false, audienceDefinitionScope1.equals(audienceDefinitionScope3));
        System.assertEquals(false, audienceDefinitionScope2.equals(audienceDefinitionScope3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAudienceDefinitionScope audienceDefinitionScope1 = OASAudienceDefinitionScope.getExample();
        OASAudienceDefinitionScope audienceDefinitionScope2 = new OASAudienceDefinitionScope();

        System.assertEquals(audienceDefinitionScope1.hashCode(), audienceDefinitionScope1.hashCode());
        System.assertEquals(audienceDefinitionScope2.hashCode(), audienceDefinitionScope2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAudienceDefinitionScope audienceDefinitionScope1 = OASAudienceDefinitionScope.getExample();
        OASAudienceDefinitionScope audienceDefinitionScope2 = OASAudienceDefinitionScope.getExample();
        OASAudienceDefinitionScope audienceDefinitionScope3 = new OASAudienceDefinitionScope();
        OASAudienceDefinitionScope audienceDefinitionScope4 = new OASAudienceDefinitionScope();

        System.assert(audienceDefinitionScope1.equals(audienceDefinitionScope2));
        System.assert(audienceDefinitionScope3.equals(audienceDefinitionScope4));
        System.assertEquals(audienceDefinitionScope1.hashCode(), audienceDefinitionScope2.hashCode());
        System.assertEquals(audienceDefinitionScope3.hashCode(), audienceDefinitionScope4.hashCode());
    }
}
