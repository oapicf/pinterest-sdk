@isTest
private class OASSharedAudienceResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASSharedAudienceResponse sharedAudienceResponse1 = OASSharedAudienceResponse.getExample();
        OASSharedAudienceResponse sharedAudienceResponse2 = sharedAudienceResponse1;
        OASSharedAudienceResponse sharedAudienceResponse3 = new OASSharedAudienceResponse();
        OASSharedAudienceResponse sharedAudienceResponse4 = sharedAudienceResponse3;

        System.assert(sharedAudienceResponse1.equals(sharedAudienceResponse2));
        System.assert(sharedAudienceResponse2.equals(sharedAudienceResponse1));
        System.assert(sharedAudienceResponse1.equals(sharedAudienceResponse1));
        System.assert(sharedAudienceResponse3.equals(sharedAudienceResponse4));
        System.assert(sharedAudienceResponse4.equals(sharedAudienceResponse3));
        System.assert(sharedAudienceResponse3.equals(sharedAudienceResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASSharedAudienceResponse sharedAudienceResponse1 = OASSharedAudienceResponse.getExample();
        OASSharedAudienceResponse sharedAudienceResponse2 = OASSharedAudienceResponse.getExample();
        OASSharedAudienceResponse sharedAudienceResponse3 = new OASSharedAudienceResponse();
        OASSharedAudienceResponse sharedAudienceResponse4 = new OASSharedAudienceResponse();

        System.assert(sharedAudienceResponse1.equals(sharedAudienceResponse2));
        System.assert(sharedAudienceResponse2.equals(sharedAudienceResponse1));
        System.assert(sharedAudienceResponse3.equals(sharedAudienceResponse4));
        System.assert(sharedAudienceResponse4.equals(sharedAudienceResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASSharedAudienceResponse sharedAudienceResponse1 = OASSharedAudienceResponse.getExample();
        OASSharedAudienceResponse sharedAudienceResponse2 = new OASSharedAudienceResponse();

        System.assertEquals(false, sharedAudienceResponse1.equals('foo'));
        System.assertEquals(false, sharedAudienceResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASSharedAudienceResponse sharedAudienceResponse1 = OASSharedAudienceResponse.getExample();
        OASSharedAudienceResponse sharedAudienceResponse2 = new OASSharedAudienceResponse();
        OASSharedAudienceResponse sharedAudienceResponse3;

        System.assertEquals(false, sharedAudienceResponse1.equals(sharedAudienceResponse3));
        System.assertEquals(false, sharedAudienceResponse2.equals(sharedAudienceResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASSharedAudienceResponse sharedAudienceResponse1 = OASSharedAudienceResponse.getExample();
        OASSharedAudienceResponse sharedAudienceResponse2 = new OASSharedAudienceResponse();

        System.assertEquals(sharedAudienceResponse1.hashCode(), sharedAudienceResponse1.hashCode());
        System.assertEquals(sharedAudienceResponse2.hashCode(), sharedAudienceResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASSharedAudienceResponse sharedAudienceResponse1 = OASSharedAudienceResponse.getExample();
        OASSharedAudienceResponse sharedAudienceResponse2 = OASSharedAudienceResponse.getExample();
        OASSharedAudienceResponse sharedAudienceResponse3 = new OASSharedAudienceResponse();
        OASSharedAudienceResponse sharedAudienceResponse4 = new OASSharedAudienceResponse();

        System.assert(sharedAudienceResponse1.equals(sharedAudienceResponse2));
        System.assert(sharedAudienceResponse3.equals(sharedAudienceResponse4));
        System.assertEquals(sharedAudienceResponse1.hashCode(), sharedAudienceResponse2.hashCode());
        System.assertEquals(sharedAudienceResponse3.hashCode(), sharedAudienceResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASSharedAudienceResponse sharedAudienceResponse = new OASSharedAudienceResponse();
        Map<String, String> x-property-mappings = sharedAudienceResponse.getx-property-mappings();
        System.assertEquals('audienceId', x-property-mappings.get('audience_id'));
        System.assertEquals('recipientAccountIds', x-property-mappings.get('recipient_account_ids'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASSharedAudienceResponse sharedAudienceResponse = new OASSharedAudienceResponse();
        System.assertEquals(new List<OASRole>(), sharedAudienceResponse.permissions);
        System.assertEquals(new List<String>(), sharedAudienceResponse.recipientAccountIds);
        System.assertEquals(null, sharedAudienceResponse.audienceId);
    }
}
