@isTest
private class OASBusinessSharedAudienceResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASBusinessSharedAudienceResponse businessSharedAudienceResponse1 = OASBusinessSharedAudienceResponse.getExample();
        OASBusinessSharedAudienceResponse businessSharedAudienceResponse2 = businessSharedAudienceResponse1;
        OASBusinessSharedAudienceResponse businessSharedAudienceResponse3 = new OASBusinessSharedAudienceResponse();
        OASBusinessSharedAudienceResponse businessSharedAudienceResponse4 = businessSharedAudienceResponse3;

        System.assert(businessSharedAudienceResponse1.equals(businessSharedAudienceResponse2));
        System.assert(businessSharedAudienceResponse2.equals(businessSharedAudienceResponse1));
        System.assert(businessSharedAudienceResponse1.equals(businessSharedAudienceResponse1));
        System.assert(businessSharedAudienceResponse3.equals(businessSharedAudienceResponse4));
        System.assert(businessSharedAudienceResponse4.equals(businessSharedAudienceResponse3));
        System.assert(businessSharedAudienceResponse3.equals(businessSharedAudienceResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBusinessSharedAudienceResponse businessSharedAudienceResponse1 = OASBusinessSharedAudienceResponse.getExample();
        OASBusinessSharedAudienceResponse businessSharedAudienceResponse2 = OASBusinessSharedAudienceResponse.getExample();
        OASBusinessSharedAudienceResponse businessSharedAudienceResponse3 = new OASBusinessSharedAudienceResponse();
        OASBusinessSharedAudienceResponse businessSharedAudienceResponse4 = new OASBusinessSharedAudienceResponse();

        System.assert(businessSharedAudienceResponse1.equals(businessSharedAudienceResponse2));
        System.assert(businessSharedAudienceResponse2.equals(businessSharedAudienceResponse1));
        System.assert(businessSharedAudienceResponse3.equals(businessSharedAudienceResponse4));
        System.assert(businessSharedAudienceResponse4.equals(businessSharedAudienceResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBusinessSharedAudienceResponse businessSharedAudienceResponse1 = OASBusinessSharedAudienceResponse.getExample();
        OASBusinessSharedAudienceResponse businessSharedAudienceResponse2 = new OASBusinessSharedAudienceResponse();

        System.assertEquals(false, businessSharedAudienceResponse1.equals('foo'));
        System.assertEquals(false, businessSharedAudienceResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBusinessSharedAudienceResponse businessSharedAudienceResponse1 = OASBusinessSharedAudienceResponse.getExample();
        OASBusinessSharedAudienceResponse businessSharedAudienceResponse2 = new OASBusinessSharedAudienceResponse();
        OASBusinessSharedAudienceResponse businessSharedAudienceResponse3;

        System.assertEquals(false, businessSharedAudienceResponse1.equals(businessSharedAudienceResponse3));
        System.assertEquals(false, businessSharedAudienceResponse2.equals(businessSharedAudienceResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBusinessSharedAudienceResponse businessSharedAudienceResponse1 = OASBusinessSharedAudienceResponse.getExample();
        OASBusinessSharedAudienceResponse businessSharedAudienceResponse2 = new OASBusinessSharedAudienceResponse();

        System.assertEquals(businessSharedAudienceResponse1.hashCode(), businessSharedAudienceResponse1.hashCode());
        System.assertEquals(businessSharedAudienceResponse2.hashCode(), businessSharedAudienceResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBusinessSharedAudienceResponse businessSharedAudienceResponse1 = OASBusinessSharedAudienceResponse.getExample();
        OASBusinessSharedAudienceResponse businessSharedAudienceResponse2 = OASBusinessSharedAudienceResponse.getExample();
        OASBusinessSharedAudienceResponse businessSharedAudienceResponse3 = new OASBusinessSharedAudienceResponse();
        OASBusinessSharedAudienceResponse businessSharedAudienceResponse4 = new OASBusinessSharedAudienceResponse();

        System.assert(businessSharedAudienceResponse1.equals(businessSharedAudienceResponse2));
        System.assert(businessSharedAudienceResponse3.equals(businessSharedAudienceResponse4));
        System.assertEquals(businessSharedAudienceResponse1.hashCode(), businessSharedAudienceResponse2.hashCode());
        System.assertEquals(businessSharedAudienceResponse3.hashCode(), businessSharedAudienceResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASBusinessSharedAudienceResponse businessSharedAudienceResponse = new OASBusinessSharedAudienceResponse();
        Map<String, String> x-property-mappings = businessSharedAudienceResponse.getx-property-mappings();
        System.assertEquals('audienceId', x-property-mappings.get('audience_id'));
        System.assertEquals('recipientBusinessIds', x-property-mappings.get('recipient_business_ids'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASBusinessSharedAudienceResponse businessSharedAudienceResponse = new OASBusinessSharedAudienceResponse();
        System.assertEquals(new List<OASRole>(), businessSharedAudienceResponse.permissions);
        System.assertEquals(new List<String>(), businessSharedAudienceResponse.recipientBusinessIds);
        System.assertEquals(null, businessSharedAudienceResponse.audienceId);
    }
}
