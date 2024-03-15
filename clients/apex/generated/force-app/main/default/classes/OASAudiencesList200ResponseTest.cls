@isTest
private class OASAudiencesList200ResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASAudiencesList200Response audiencesList200Response1 = OASAudiencesList200Response.getExample();
        OASAudiencesList200Response audiencesList200Response2 = audiencesList200Response1;
        OASAudiencesList200Response audiencesList200Response3 = new OASAudiencesList200Response();
        OASAudiencesList200Response audiencesList200Response4 = audiencesList200Response3;

        System.assert(audiencesList200Response1.equals(audiencesList200Response2));
        System.assert(audiencesList200Response2.equals(audiencesList200Response1));
        System.assert(audiencesList200Response1.equals(audiencesList200Response1));
        System.assert(audiencesList200Response3.equals(audiencesList200Response4));
        System.assert(audiencesList200Response4.equals(audiencesList200Response3));
        System.assert(audiencesList200Response3.equals(audiencesList200Response3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAudiencesList200Response audiencesList200Response1 = OASAudiencesList200Response.getExample();
        OASAudiencesList200Response audiencesList200Response2 = OASAudiencesList200Response.getExample();
        OASAudiencesList200Response audiencesList200Response3 = new OASAudiencesList200Response();
        OASAudiencesList200Response audiencesList200Response4 = new OASAudiencesList200Response();

        System.assert(audiencesList200Response1.equals(audiencesList200Response2));
        System.assert(audiencesList200Response2.equals(audiencesList200Response1));
        System.assert(audiencesList200Response3.equals(audiencesList200Response4));
        System.assert(audiencesList200Response4.equals(audiencesList200Response3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAudiencesList200Response audiencesList200Response1 = OASAudiencesList200Response.getExample();
        OASAudiencesList200Response audiencesList200Response2 = new OASAudiencesList200Response();

        System.assertEquals(false, audiencesList200Response1.equals('foo'));
        System.assertEquals(false, audiencesList200Response2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAudiencesList200Response audiencesList200Response1 = OASAudiencesList200Response.getExample();
        OASAudiencesList200Response audiencesList200Response2 = new OASAudiencesList200Response();
        OASAudiencesList200Response audiencesList200Response3;

        System.assertEquals(false, audiencesList200Response1.equals(audiencesList200Response3));
        System.assertEquals(false, audiencesList200Response2.equals(audiencesList200Response3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAudiencesList200Response audiencesList200Response1 = OASAudiencesList200Response.getExample();
        OASAudiencesList200Response audiencesList200Response2 = new OASAudiencesList200Response();

        System.assertEquals(audiencesList200Response1.hashCode(), audiencesList200Response1.hashCode());
        System.assertEquals(audiencesList200Response2.hashCode(), audiencesList200Response2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAudiencesList200Response audiencesList200Response1 = OASAudiencesList200Response.getExample();
        OASAudiencesList200Response audiencesList200Response2 = OASAudiencesList200Response.getExample();
        OASAudiencesList200Response audiencesList200Response3 = new OASAudiencesList200Response();
        OASAudiencesList200Response audiencesList200Response4 = new OASAudiencesList200Response();

        System.assert(audiencesList200Response1.equals(audiencesList200Response2));
        System.assert(audiencesList200Response3.equals(audiencesList200Response4));
        System.assertEquals(audiencesList200Response1.hashCode(), audiencesList200Response2.hashCode());
        System.assertEquals(audiencesList200Response3.hashCode(), audiencesList200Response4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAudiencesList200Response audiencesList200Response = new OASAudiencesList200Response();
        System.assertEquals(new List<OASAudience>(), audiencesList200Response.items);
        System.assertEquals(null, audiencesList200Response.bookmark);
    }
}
