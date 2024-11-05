@isTest
private class OASInviteExceptionResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASInviteExceptionResponse inviteExceptionResponse1 = OASInviteExceptionResponse.getExample();
        OASInviteExceptionResponse inviteExceptionResponse2 = inviteExceptionResponse1;
        OASInviteExceptionResponse inviteExceptionResponse3 = new OASInviteExceptionResponse();
        OASInviteExceptionResponse inviteExceptionResponse4 = inviteExceptionResponse3;

        System.assert(inviteExceptionResponse1.equals(inviteExceptionResponse2));
        System.assert(inviteExceptionResponse2.equals(inviteExceptionResponse1));
        System.assert(inviteExceptionResponse1.equals(inviteExceptionResponse1));
        System.assert(inviteExceptionResponse3.equals(inviteExceptionResponse4));
        System.assert(inviteExceptionResponse4.equals(inviteExceptionResponse3));
        System.assert(inviteExceptionResponse3.equals(inviteExceptionResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASInviteExceptionResponse inviteExceptionResponse1 = OASInviteExceptionResponse.getExample();
        OASInviteExceptionResponse inviteExceptionResponse2 = OASInviteExceptionResponse.getExample();
        OASInviteExceptionResponse inviteExceptionResponse3 = new OASInviteExceptionResponse();
        OASInviteExceptionResponse inviteExceptionResponse4 = new OASInviteExceptionResponse();

        System.assert(inviteExceptionResponse1.equals(inviteExceptionResponse2));
        System.assert(inviteExceptionResponse2.equals(inviteExceptionResponse1));
        System.assert(inviteExceptionResponse3.equals(inviteExceptionResponse4));
        System.assert(inviteExceptionResponse4.equals(inviteExceptionResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASInviteExceptionResponse inviteExceptionResponse1 = OASInviteExceptionResponse.getExample();
        OASInviteExceptionResponse inviteExceptionResponse2 = new OASInviteExceptionResponse();

        System.assertEquals(false, inviteExceptionResponse1.equals('foo'));
        System.assertEquals(false, inviteExceptionResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASInviteExceptionResponse inviteExceptionResponse1 = OASInviteExceptionResponse.getExample();
        OASInviteExceptionResponse inviteExceptionResponse2 = new OASInviteExceptionResponse();
        OASInviteExceptionResponse inviteExceptionResponse3;

        System.assertEquals(false, inviteExceptionResponse1.equals(inviteExceptionResponse3));
        System.assertEquals(false, inviteExceptionResponse2.equals(inviteExceptionResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASInviteExceptionResponse inviteExceptionResponse1 = OASInviteExceptionResponse.getExample();
        OASInviteExceptionResponse inviteExceptionResponse2 = new OASInviteExceptionResponse();

        System.assertEquals(inviteExceptionResponse1.hashCode(), inviteExceptionResponse1.hashCode());
        System.assertEquals(inviteExceptionResponse2.hashCode(), inviteExceptionResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASInviteExceptionResponse inviteExceptionResponse1 = OASInviteExceptionResponse.getExample();
        OASInviteExceptionResponse inviteExceptionResponse2 = OASInviteExceptionResponse.getExample();
        OASInviteExceptionResponse inviteExceptionResponse3 = new OASInviteExceptionResponse();
        OASInviteExceptionResponse inviteExceptionResponse4 = new OASInviteExceptionResponse();

        System.assert(inviteExceptionResponse1.equals(inviteExceptionResponse2));
        System.assert(inviteExceptionResponse3.equals(inviteExceptionResponse4));
        System.assertEquals(inviteExceptionResponse1.hashCode(), inviteExceptionResponse2.hashCode());
        System.assertEquals(inviteExceptionResponse3.hashCode(), inviteExceptionResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASInviteExceptionResponse inviteExceptionResponse = new OASInviteExceptionResponse();
        Map<String, String> x-property-mappings = inviteExceptionResponse.getx-property-mappings();
        System.assertEquals('inviteOrRequestId', x-property-mappings.get('invite_or_request_id'));
        System.assertEquals('usersOrPartnerIds', x-property-mappings.get('users_or_partner_ids'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASInviteExceptionResponse inviteExceptionResponse = new OASInviteExceptionResponse();
        System.assertEquals(new List<String>(), inviteExceptionResponse.usersOrPartnerIds);
        System.assertEquals(null, inviteExceptionResponse.inviteOrRequestId);
        System.assertEquals(null, inviteExceptionResponse.code);
        System.assertEquals(null, inviteExceptionResponse.message);
    }
}
