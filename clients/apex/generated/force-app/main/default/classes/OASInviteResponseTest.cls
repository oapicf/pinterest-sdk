@isTest
private class OASInviteResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASInviteResponse inviteResponse1 = OASInviteResponse.getExample();
        OASInviteResponse inviteResponse2 = inviteResponse1;
        OASInviteResponse inviteResponse3 = new OASInviteResponse();
        OASInviteResponse inviteResponse4 = inviteResponse3;

        System.assert(inviteResponse1.equals(inviteResponse2));
        System.assert(inviteResponse2.equals(inviteResponse1));
        System.assert(inviteResponse1.equals(inviteResponse1));
        System.assert(inviteResponse3.equals(inviteResponse4));
        System.assert(inviteResponse4.equals(inviteResponse3));
        System.assert(inviteResponse3.equals(inviteResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASInviteResponse inviteResponse1 = OASInviteResponse.getExample();
        OASInviteResponse inviteResponse2 = OASInviteResponse.getExample();
        OASInviteResponse inviteResponse3 = new OASInviteResponse();
        OASInviteResponse inviteResponse4 = new OASInviteResponse();

        System.assert(inviteResponse1.equals(inviteResponse2));
        System.assert(inviteResponse2.equals(inviteResponse1));
        System.assert(inviteResponse3.equals(inviteResponse4));
        System.assert(inviteResponse4.equals(inviteResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASInviteResponse inviteResponse1 = OASInviteResponse.getExample();
        OASInviteResponse inviteResponse2 = new OASInviteResponse();

        System.assertEquals(false, inviteResponse1.equals('foo'));
        System.assertEquals(false, inviteResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASInviteResponse inviteResponse1 = OASInviteResponse.getExample();
        OASInviteResponse inviteResponse2 = new OASInviteResponse();
        OASInviteResponse inviteResponse3;

        System.assertEquals(false, inviteResponse1.equals(inviteResponse3));
        System.assertEquals(false, inviteResponse2.equals(inviteResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASInviteResponse inviteResponse1 = OASInviteResponse.getExample();
        OASInviteResponse inviteResponse2 = new OASInviteResponse();

        System.assertEquals(inviteResponse1.hashCode(), inviteResponse1.hashCode());
        System.assertEquals(inviteResponse2.hashCode(), inviteResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASInviteResponse inviteResponse1 = OASInviteResponse.getExample();
        OASInviteResponse inviteResponse2 = OASInviteResponse.getExample();
        OASInviteResponse inviteResponse3 = new OASInviteResponse();
        OASInviteResponse inviteResponse4 = new OASInviteResponse();

        System.assert(inviteResponse1.equals(inviteResponse2));
        System.assert(inviteResponse3.equals(inviteResponse4));
        System.assertEquals(inviteResponse1.hashCode(), inviteResponse2.hashCode());
        System.assertEquals(inviteResponse3.hashCode(), inviteResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASInviteResponse inviteResponse = new OASInviteResponse();
        Map<String, String> x-property-mappings = inviteResponse.getx-property-mappings();
        System.assertEquals('assetsSummary', x-property-mappings.get('assets_summary'));
        System.assertEquals('businessRoles', x-property-mappings.get('business_roles'));
        System.assertEquals('createdByBusiness', x-property-mappings.get('created_by_business'));
        System.assertEquals('createdByUser', x-property-mappings.get('created_by_user'));
        System.assertEquals('createdTime', x-property-mappings.get('created_time'));
        System.assertEquals('inviteData', x-property-mappings.get('invite_data'));
        System.assertEquals('isReceivedInvite', x-property-mappings.get('is_received_invite'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASInviteResponse inviteResponse = new OASInviteResponse();
        System.assertEquals(new List<String>(), inviteResponse.businessRoles);
        System.assertEquals(null, inviteResponse.assetsSummary);
        System.assertEquals(null, inviteResponse.createdByBusiness);
        System.assertEquals(null, inviteResponse.createdByUser);
        System.assertEquals(null, inviteResponse.createdTime);
        System.assertEquals(null, inviteResponse.id);
        System.assertEquals(null, inviteResponse.inviteData);
        System.assertEquals(null, inviteResponse.isReceivedInvite);
        System.assertEquals(null, inviteResponse.user);
    }
}
