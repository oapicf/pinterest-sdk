@isTest
private class OASAudienceUpdateRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASAudienceUpdateRequest audienceUpdateRequest1 = OASAudienceUpdateRequest.getExample();
        OASAudienceUpdateRequest audienceUpdateRequest2 = audienceUpdateRequest1;
        OASAudienceUpdateRequest audienceUpdateRequest3 = new OASAudienceUpdateRequest();
        OASAudienceUpdateRequest audienceUpdateRequest4 = audienceUpdateRequest3;

        System.assert(audienceUpdateRequest1.equals(audienceUpdateRequest2));
        System.assert(audienceUpdateRequest2.equals(audienceUpdateRequest1));
        System.assert(audienceUpdateRequest1.equals(audienceUpdateRequest1));
        System.assert(audienceUpdateRequest3.equals(audienceUpdateRequest4));
        System.assert(audienceUpdateRequest4.equals(audienceUpdateRequest3));
        System.assert(audienceUpdateRequest3.equals(audienceUpdateRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAudienceUpdateRequest audienceUpdateRequest1 = OASAudienceUpdateRequest.getExample();
        OASAudienceUpdateRequest audienceUpdateRequest2 = OASAudienceUpdateRequest.getExample();
        OASAudienceUpdateRequest audienceUpdateRequest3 = new OASAudienceUpdateRequest();
        OASAudienceUpdateRequest audienceUpdateRequest4 = new OASAudienceUpdateRequest();

        System.assert(audienceUpdateRequest1.equals(audienceUpdateRequest2));
        System.assert(audienceUpdateRequest2.equals(audienceUpdateRequest1));
        System.assert(audienceUpdateRequest3.equals(audienceUpdateRequest4));
        System.assert(audienceUpdateRequest4.equals(audienceUpdateRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAudienceUpdateRequest audienceUpdateRequest1 = OASAudienceUpdateRequest.getExample();
        OASAudienceUpdateRequest audienceUpdateRequest2 = new OASAudienceUpdateRequest();

        System.assertEquals(false, audienceUpdateRequest1.equals('foo'));
        System.assertEquals(false, audienceUpdateRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAudienceUpdateRequest audienceUpdateRequest1 = OASAudienceUpdateRequest.getExample();
        OASAudienceUpdateRequest audienceUpdateRequest2 = new OASAudienceUpdateRequest();
        OASAudienceUpdateRequest audienceUpdateRequest3;

        System.assertEquals(false, audienceUpdateRequest1.equals(audienceUpdateRequest3));
        System.assertEquals(false, audienceUpdateRequest2.equals(audienceUpdateRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAudienceUpdateRequest audienceUpdateRequest1 = OASAudienceUpdateRequest.getExample();
        OASAudienceUpdateRequest audienceUpdateRequest2 = new OASAudienceUpdateRequest();

        System.assertEquals(audienceUpdateRequest1.hashCode(), audienceUpdateRequest1.hashCode());
        System.assertEquals(audienceUpdateRequest2.hashCode(), audienceUpdateRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAudienceUpdateRequest audienceUpdateRequest1 = OASAudienceUpdateRequest.getExample();
        OASAudienceUpdateRequest audienceUpdateRequest2 = OASAudienceUpdateRequest.getExample();
        OASAudienceUpdateRequest audienceUpdateRequest3 = new OASAudienceUpdateRequest();
        OASAudienceUpdateRequest audienceUpdateRequest4 = new OASAudienceUpdateRequest();

        System.assert(audienceUpdateRequest1.equals(audienceUpdateRequest2));
        System.assert(audienceUpdateRequest3.equals(audienceUpdateRequest4));
        System.assertEquals(audienceUpdateRequest1.hashCode(), audienceUpdateRequest2.hashCode());
        System.assertEquals(audienceUpdateRequest3.hashCode(), audienceUpdateRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAudienceUpdateRequest audienceUpdateRequest = new OASAudienceUpdateRequest();
        Map<String, String> x-property-mappings = audienceUpdateRequest.getx-property-mappings();
        System.assertEquals('adAccountId', x-property-mappings.get('ad_account_id'));
        System.assertEquals('operationType', x-property-mappings.get('operation_type'));
    }
}
