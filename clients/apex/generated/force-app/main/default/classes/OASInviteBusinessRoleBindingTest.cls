@isTest
private class OASInviteBusinessRoleBindingTest {
    @isTest
    private static void equalsSameInstance() {
        OASInviteBusinessRoleBinding inviteBusinessRoleBinding1 = OASInviteBusinessRoleBinding.getExample();
        OASInviteBusinessRoleBinding inviteBusinessRoleBinding2 = inviteBusinessRoleBinding1;
        OASInviteBusinessRoleBinding inviteBusinessRoleBinding3 = new OASInviteBusinessRoleBinding();
        OASInviteBusinessRoleBinding inviteBusinessRoleBinding4 = inviteBusinessRoleBinding3;

        System.assert(inviteBusinessRoleBinding1.equals(inviteBusinessRoleBinding2));
        System.assert(inviteBusinessRoleBinding2.equals(inviteBusinessRoleBinding1));
        System.assert(inviteBusinessRoleBinding1.equals(inviteBusinessRoleBinding1));
        System.assert(inviteBusinessRoleBinding3.equals(inviteBusinessRoleBinding4));
        System.assert(inviteBusinessRoleBinding4.equals(inviteBusinessRoleBinding3));
        System.assert(inviteBusinessRoleBinding3.equals(inviteBusinessRoleBinding3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASInviteBusinessRoleBinding inviteBusinessRoleBinding1 = OASInviteBusinessRoleBinding.getExample();
        OASInviteBusinessRoleBinding inviteBusinessRoleBinding2 = OASInviteBusinessRoleBinding.getExample();
        OASInviteBusinessRoleBinding inviteBusinessRoleBinding3 = new OASInviteBusinessRoleBinding();
        OASInviteBusinessRoleBinding inviteBusinessRoleBinding4 = new OASInviteBusinessRoleBinding();

        System.assert(inviteBusinessRoleBinding1.equals(inviteBusinessRoleBinding2));
        System.assert(inviteBusinessRoleBinding2.equals(inviteBusinessRoleBinding1));
        System.assert(inviteBusinessRoleBinding3.equals(inviteBusinessRoleBinding4));
        System.assert(inviteBusinessRoleBinding4.equals(inviteBusinessRoleBinding3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASInviteBusinessRoleBinding inviteBusinessRoleBinding1 = OASInviteBusinessRoleBinding.getExample();
        OASInviteBusinessRoleBinding inviteBusinessRoleBinding2 = new OASInviteBusinessRoleBinding();

        System.assertEquals(false, inviteBusinessRoleBinding1.equals('foo'));
        System.assertEquals(false, inviteBusinessRoleBinding2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASInviteBusinessRoleBinding inviteBusinessRoleBinding1 = OASInviteBusinessRoleBinding.getExample();
        OASInviteBusinessRoleBinding inviteBusinessRoleBinding2 = new OASInviteBusinessRoleBinding();
        OASInviteBusinessRoleBinding inviteBusinessRoleBinding3;

        System.assertEquals(false, inviteBusinessRoleBinding1.equals(inviteBusinessRoleBinding3));
        System.assertEquals(false, inviteBusinessRoleBinding2.equals(inviteBusinessRoleBinding3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASInviteBusinessRoleBinding inviteBusinessRoleBinding1 = OASInviteBusinessRoleBinding.getExample();
        OASInviteBusinessRoleBinding inviteBusinessRoleBinding2 = new OASInviteBusinessRoleBinding();

        System.assertEquals(inviteBusinessRoleBinding1.hashCode(), inviteBusinessRoleBinding1.hashCode());
        System.assertEquals(inviteBusinessRoleBinding2.hashCode(), inviteBusinessRoleBinding2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASInviteBusinessRoleBinding inviteBusinessRoleBinding1 = OASInviteBusinessRoleBinding.getExample();
        OASInviteBusinessRoleBinding inviteBusinessRoleBinding2 = OASInviteBusinessRoleBinding.getExample();
        OASInviteBusinessRoleBinding inviteBusinessRoleBinding3 = new OASInviteBusinessRoleBinding();
        OASInviteBusinessRoleBinding inviteBusinessRoleBinding4 = new OASInviteBusinessRoleBinding();

        System.assert(inviteBusinessRoleBinding1.equals(inviteBusinessRoleBinding2));
        System.assert(inviteBusinessRoleBinding3.equals(inviteBusinessRoleBinding4));
        System.assertEquals(inviteBusinessRoleBinding1.hashCode(), inviteBusinessRoleBinding2.hashCode());
        System.assertEquals(inviteBusinessRoleBinding3.hashCode(), inviteBusinessRoleBinding4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASInviteBusinessRoleBinding inviteBusinessRoleBinding = new OASInviteBusinessRoleBinding();
        Map<String, String> x-property-mappings = inviteBusinessRoleBinding.getx-property-mappings();
        System.assertEquals('createdByBusinessId', x-property-mappings.get('created_by_business_id'));
        System.assertEquals('createdByUserId', x-property-mappings.get('created_by_user_id'));
        System.assertEquals('inviteData', x-property-mappings.get('invite_data'));
        System.assertEquals('isReceivedInvite', x-property-mappings.get('is_received_invite'));
    }
}
