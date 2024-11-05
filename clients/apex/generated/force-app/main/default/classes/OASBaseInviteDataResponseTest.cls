@isTest
private class OASBaseInviteDataResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASBaseInviteDataResponse baseInviteDataResponse1 = OASBaseInviteDataResponse.getExample();
        OASBaseInviteDataResponse baseInviteDataResponse2 = baseInviteDataResponse1;
        OASBaseInviteDataResponse baseInviteDataResponse3 = new OASBaseInviteDataResponse();
        OASBaseInviteDataResponse baseInviteDataResponse4 = baseInviteDataResponse3;

        System.assert(baseInviteDataResponse1.equals(baseInviteDataResponse2));
        System.assert(baseInviteDataResponse2.equals(baseInviteDataResponse1));
        System.assert(baseInviteDataResponse1.equals(baseInviteDataResponse1));
        System.assert(baseInviteDataResponse3.equals(baseInviteDataResponse4));
        System.assert(baseInviteDataResponse4.equals(baseInviteDataResponse3));
        System.assert(baseInviteDataResponse3.equals(baseInviteDataResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBaseInviteDataResponse baseInviteDataResponse1 = OASBaseInviteDataResponse.getExample();
        OASBaseInviteDataResponse baseInviteDataResponse2 = OASBaseInviteDataResponse.getExample();
        OASBaseInviteDataResponse baseInviteDataResponse3 = new OASBaseInviteDataResponse();
        OASBaseInviteDataResponse baseInviteDataResponse4 = new OASBaseInviteDataResponse();

        System.assert(baseInviteDataResponse1.equals(baseInviteDataResponse2));
        System.assert(baseInviteDataResponse2.equals(baseInviteDataResponse1));
        System.assert(baseInviteDataResponse3.equals(baseInviteDataResponse4));
        System.assert(baseInviteDataResponse4.equals(baseInviteDataResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBaseInviteDataResponse baseInviteDataResponse1 = OASBaseInviteDataResponse.getExample();
        OASBaseInviteDataResponse baseInviteDataResponse2 = new OASBaseInviteDataResponse();

        System.assertEquals(false, baseInviteDataResponse1.equals('foo'));
        System.assertEquals(false, baseInviteDataResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBaseInviteDataResponse baseInviteDataResponse1 = OASBaseInviteDataResponse.getExample();
        OASBaseInviteDataResponse baseInviteDataResponse2 = new OASBaseInviteDataResponse();
        OASBaseInviteDataResponse baseInviteDataResponse3;

        System.assertEquals(false, baseInviteDataResponse1.equals(baseInviteDataResponse3));
        System.assertEquals(false, baseInviteDataResponse2.equals(baseInviteDataResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBaseInviteDataResponse baseInviteDataResponse1 = OASBaseInviteDataResponse.getExample();
        OASBaseInviteDataResponse baseInviteDataResponse2 = new OASBaseInviteDataResponse();

        System.assertEquals(baseInviteDataResponse1.hashCode(), baseInviteDataResponse1.hashCode());
        System.assertEquals(baseInviteDataResponse2.hashCode(), baseInviteDataResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBaseInviteDataResponse baseInviteDataResponse1 = OASBaseInviteDataResponse.getExample();
        OASBaseInviteDataResponse baseInviteDataResponse2 = OASBaseInviteDataResponse.getExample();
        OASBaseInviteDataResponse baseInviteDataResponse3 = new OASBaseInviteDataResponse();
        OASBaseInviteDataResponse baseInviteDataResponse4 = new OASBaseInviteDataResponse();

        System.assert(baseInviteDataResponse1.equals(baseInviteDataResponse2));
        System.assert(baseInviteDataResponse3.equals(baseInviteDataResponse4));
        System.assertEquals(baseInviteDataResponse1.hashCode(), baseInviteDataResponse2.hashCode());
        System.assertEquals(baseInviteDataResponse3.hashCode(), baseInviteDataResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASBaseInviteDataResponse baseInviteDataResponse = new OASBaseInviteDataResponse();
        Map<String, String> x-property-mappings = baseInviteDataResponse.getx-property-mappings();
        System.assertEquals('inviteData', x-property-mappings.get('invite_data'));
        System.assertEquals('isReceivedInvite', x-property-mappings.get('is_received_invite'));
    }
}
