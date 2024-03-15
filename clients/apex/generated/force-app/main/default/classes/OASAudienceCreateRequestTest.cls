@isTest
private class OASAudienceCreateRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASAudienceCreateRequest audienceCreateRequest1 = OASAudienceCreateRequest.getExample();
        OASAudienceCreateRequest audienceCreateRequest2 = audienceCreateRequest1;
        OASAudienceCreateRequest audienceCreateRequest3 = new OASAudienceCreateRequest();
        OASAudienceCreateRequest audienceCreateRequest4 = audienceCreateRequest3;

        System.assert(audienceCreateRequest1.equals(audienceCreateRequest2));
        System.assert(audienceCreateRequest2.equals(audienceCreateRequest1));
        System.assert(audienceCreateRequest1.equals(audienceCreateRequest1));
        System.assert(audienceCreateRequest3.equals(audienceCreateRequest4));
        System.assert(audienceCreateRequest4.equals(audienceCreateRequest3));
        System.assert(audienceCreateRequest3.equals(audienceCreateRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAudienceCreateRequest audienceCreateRequest1 = OASAudienceCreateRequest.getExample();
        OASAudienceCreateRequest audienceCreateRequest2 = OASAudienceCreateRequest.getExample();
        OASAudienceCreateRequest audienceCreateRequest3 = new OASAudienceCreateRequest();
        OASAudienceCreateRequest audienceCreateRequest4 = new OASAudienceCreateRequest();

        System.assert(audienceCreateRequest1.equals(audienceCreateRequest2));
        System.assert(audienceCreateRequest2.equals(audienceCreateRequest1));
        System.assert(audienceCreateRequest3.equals(audienceCreateRequest4));
        System.assert(audienceCreateRequest4.equals(audienceCreateRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAudienceCreateRequest audienceCreateRequest1 = OASAudienceCreateRequest.getExample();
        OASAudienceCreateRequest audienceCreateRequest2 = new OASAudienceCreateRequest();

        System.assertEquals(false, audienceCreateRequest1.equals('foo'));
        System.assertEquals(false, audienceCreateRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAudienceCreateRequest audienceCreateRequest1 = OASAudienceCreateRequest.getExample();
        OASAudienceCreateRequest audienceCreateRequest2 = new OASAudienceCreateRequest();
        OASAudienceCreateRequest audienceCreateRequest3;

        System.assertEquals(false, audienceCreateRequest1.equals(audienceCreateRequest3));
        System.assertEquals(false, audienceCreateRequest2.equals(audienceCreateRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAudienceCreateRequest audienceCreateRequest1 = OASAudienceCreateRequest.getExample();
        OASAudienceCreateRequest audienceCreateRequest2 = new OASAudienceCreateRequest();

        System.assertEquals(audienceCreateRequest1.hashCode(), audienceCreateRequest1.hashCode());
        System.assertEquals(audienceCreateRequest2.hashCode(), audienceCreateRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAudienceCreateRequest audienceCreateRequest1 = OASAudienceCreateRequest.getExample();
        OASAudienceCreateRequest audienceCreateRequest2 = OASAudienceCreateRequest.getExample();
        OASAudienceCreateRequest audienceCreateRequest3 = new OASAudienceCreateRequest();
        OASAudienceCreateRequest audienceCreateRequest4 = new OASAudienceCreateRequest();

        System.assert(audienceCreateRequest1.equals(audienceCreateRequest2));
        System.assert(audienceCreateRequest3.equals(audienceCreateRequest4));
        System.assertEquals(audienceCreateRequest1.hashCode(), audienceCreateRequest2.hashCode());
        System.assertEquals(audienceCreateRequest3.hashCode(), audienceCreateRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAudienceCreateRequest audienceCreateRequest = new OASAudienceCreateRequest();
        Map<String, String> x-property-mappings = audienceCreateRequest.getx-property-mappings();
        System.assertEquals('adAccountId', x-property-mappings.get('ad_account_id'));
        System.assertEquals('audienceType', x-property-mappings.get('audience_type'));
    }
}
