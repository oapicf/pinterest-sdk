@isTest
private class OASAudienceCreateCustomRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASAudienceCreateCustomRequest audienceCreateCustomRequest1 = OASAudienceCreateCustomRequest.getExample();
        OASAudienceCreateCustomRequest audienceCreateCustomRequest2 = audienceCreateCustomRequest1;
        OASAudienceCreateCustomRequest audienceCreateCustomRequest3 = new OASAudienceCreateCustomRequest();
        OASAudienceCreateCustomRequest audienceCreateCustomRequest4 = audienceCreateCustomRequest3;

        System.assert(audienceCreateCustomRequest1.equals(audienceCreateCustomRequest2));
        System.assert(audienceCreateCustomRequest2.equals(audienceCreateCustomRequest1));
        System.assert(audienceCreateCustomRequest1.equals(audienceCreateCustomRequest1));
        System.assert(audienceCreateCustomRequest3.equals(audienceCreateCustomRequest4));
        System.assert(audienceCreateCustomRequest4.equals(audienceCreateCustomRequest3));
        System.assert(audienceCreateCustomRequest3.equals(audienceCreateCustomRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAudienceCreateCustomRequest audienceCreateCustomRequest1 = OASAudienceCreateCustomRequest.getExample();
        OASAudienceCreateCustomRequest audienceCreateCustomRequest2 = OASAudienceCreateCustomRequest.getExample();
        OASAudienceCreateCustomRequest audienceCreateCustomRequest3 = new OASAudienceCreateCustomRequest();
        OASAudienceCreateCustomRequest audienceCreateCustomRequest4 = new OASAudienceCreateCustomRequest();

        System.assert(audienceCreateCustomRequest1.equals(audienceCreateCustomRequest2));
        System.assert(audienceCreateCustomRequest2.equals(audienceCreateCustomRequest1));
        System.assert(audienceCreateCustomRequest3.equals(audienceCreateCustomRequest4));
        System.assert(audienceCreateCustomRequest4.equals(audienceCreateCustomRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAudienceCreateCustomRequest audienceCreateCustomRequest1 = OASAudienceCreateCustomRequest.getExample();
        OASAudienceCreateCustomRequest audienceCreateCustomRequest2 = new OASAudienceCreateCustomRequest();

        System.assertEquals(false, audienceCreateCustomRequest1.equals('foo'));
        System.assertEquals(false, audienceCreateCustomRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAudienceCreateCustomRequest audienceCreateCustomRequest1 = OASAudienceCreateCustomRequest.getExample();
        OASAudienceCreateCustomRequest audienceCreateCustomRequest2 = new OASAudienceCreateCustomRequest();
        OASAudienceCreateCustomRequest audienceCreateCustomRequest3;

        System.assertEquals(false, audienceCreateCustomRequest1.equals(audienceCreateCustomRequest3));
        System.assertEquals(false, audienceCreateCustomRequest2.equals(audienceCreateCustomRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAudienceCreateCustomRequest audienceCreateCustomRequest1 = OASAudienceCreateCustomRequest.getExample();
        OASAudienceCreateCustomRequest audienceCreateCustomRequest2 = new OASAudienceCreateCustomRequest();

        System.assertEquals(audienceCreateCustomRequest1.hashCode(), audienceCreateCustomRequest1.hashCode());
        System.assertEquals(audienceCreateCustomRequest2.hashCode(), audienceCreateCustomRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAudienceCreateCustomRequest audienceCreateCustomRequest1 = OASAudienceCreateCustomRequest.getExample();
        OASAudienceCreateCustomRequest audienceCreateCustomRequest2 = OASAudienceCreateCustomRequest.getExample();
        OASAudienceCreateCustomRequest audienceCreateCustomRequest3 = new OASAudienceCreateCustomRequest();
        OASAudienceCreateCustomRequest audienceCreateCustomRequest4 = new OASAudienceCreateCustomRequest();

        System.assert(audienceCreateCustomRequest1.equals(audienceCreateCustomRequest2));
        System.assert(audienceCreateCustomRequest3.equals(audienceCreateCustomRequest4));
        System.assertEquals(audienceCreateCustomRequest1.hashCode(), audienceCreateCustomRequest2.hashCode());
        System.assertEquals(audienceCreateCustomRequest3.hashCode(), audienceCreateCustomRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAudienceCreateCustomRequest audienceCreateCustomRequest = new OASAudienceCreateCustomRequest();
        Map<String, String> x-property-mappings = audienceCreateCustomRequest.getx-property-mappings();
        System.assertEquals('adAccountId', x-property-mappings.get('ad_account_id'));
        System.assertEquals('sharingType', x-property-mappings.get('sharing_type'));
        System.assertEquals('dataParty', x-property-mappings.get('data_party'));
    }
}
