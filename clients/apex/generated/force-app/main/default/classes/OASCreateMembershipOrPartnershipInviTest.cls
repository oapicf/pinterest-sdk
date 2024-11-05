@isTest
private class OASCreateMembershipOrPartnershipInviTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateMembershipOrPartnershipInvi createMembershipOrPartnershipInvitesBody1 = OASCreateMembershipOrPartnershipInvi.getExample();
        OASCreateMembershipOrPartnershipInvi createMembershipOrPartnershipInvitesBody2 = createMembershipOrPartnershipInvitesBody1;
        OASCreateMembershipOrPartnershipInvi createMembershipOrPartnershipInvitesBody3 = new OASCreateMembershipOrPartnershipInvi();
        OASCreateMembershipOrPartnershipInvi createMembershipOrPartnershipInvitesBody4 = createMembershipOrPartnershipInvitesBody3;

        System.assert(createMembershipOrPartnershipInvitesBody1.equals(createMembershipOrPartnershipInvitesBody2));
        System.assert(createMembershipOrPartnershipInvitesBody2.equals(createMembershipOrPartnershipInvitesBody1));
        System.assert(createMembershipOrPartnershipInvitesBody1.equals(createMembershipOrPartnershipInvitesBody1));
        System.assert(createMembershipOrPartnershipInvitesBody3.equals(createMembershipOrPartnershipInvitesBody4));
        System.assert(createMembershipOrPartnershipInvitesBody4.equals(createMembershipOrPartnershipInvitesBody3));
        System.assert(createMembershipOrPartnershipInvitesBody3.equals(createMembershipOrPartnershipInvitesBody3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateMembershipOrPartnershipInvi createMembershipOrPartnershipInvitesBody1 = OASCreateMembershipOrPartnershipInvi.getExample();
        OASCreateMembershipOrPartnershipInvi createMembershipOrPartnershipInvitesBody2 = OASCreateMembershipOrPartnershipInvi.getExample();
        OASCreateMembershipOrPartnershipInvi createMembershipOrPartnershipInvitesBody3 = new OASCreateMembershipOrPartnershipInvi();
        OASCreateMembershipOrPartnershipInvi createMembershipOrPartnershipInvitesBody4 = new OASCreateMembershipOrPartnershipInvi();

        System.assert(createMembershipOrPartnershipInvitesBody1.equals(createMembershipOrPartnershipInvitesBody2));
        System.assert(createMembershipOrPartnershipInvitesBody2.equals(createMembershipOrPartnershipInvitesBody1));
        System.assert(createMembershipOrPartnershipInvitesBody3.equals(createMembershipOrPartnershipInvitesBody4));
        System.assert(createMembershipOrPartnershipInvitesBody4.equals(createMembershipOrPartnershipInvitesBody3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateMembershipOrPartnershipInvi createMembershipOrPartnershipInvitesBody1 = OASCreateMembershipOrPartnershipInvi.getExample();
        OASCreateMembershipOrPartnershipInvi createMembershipOrPartnershipInvitesBody2 = new OASCreateMembershipOrPartnershipInvi();

        System.assertEquals(false, createMembershipOrPartnershipInvitesBody1.equals('foo'));
        System.assertEquals(false, createMembershipOrPartnershipInvitesBody2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateMembershipOrPartnershipInvi createMembershipOrPartnershipInvitesBody1 = OASCreateMembershipOrPartnershipInvi.getExample();
        OASCreateMembershipOrPartnershipInvi createMembershipOrPartnershipInvitesBody2 = new OASCreateMembershipOrPartnershipInvi();
        OASCreateMembershipOrPartnershipInvi createMembershipOrPartnershipInvitesBody3;

        System.assertEquals(false, createMembershipOrPartnershipInvitesBody1.equals(createMembershipOrPartnershipInvitesBody3));
        System.assertEquals(false, createMembershipOrPartnershipInvitesBody2.equals(createMembershipOrPartnershipInvitesBody3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateMembershipOrPartnershipInvi createMembershipOrPartnershipInvitesBody1 = OASCreateMembershipOrPartnershipInvi.getExample();
        OASCreateMembershipOrPartnershipInvi createMembershipOrPartnershipInvitesBody2 = new OASCreateMembershipOrPartnershipInvi();

        System.assertEquals(createMembershipOrPartnershipInvitesBody1.hashCode(), createMembershipOrPartnershipInvitesBody1.hashCode());
        System.assertEquals(createMembershipOrPartnershipInvitesBody2.hashCode(), createMembershipOrPartnershipInvitesBody2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateMembershipOrPartnershipInvi createMembershipOrPartnershipInvitesBody1 = OASCreateMembershipOrPartnershipInvi.getExample();
        OASCreateMembershipOrPartnershipInvi createMembershipOrPartnershipInvitesBody2 = OASCreateMembershipOrPartnershipInvi.getExample();
        OASCreateMembershipOrPartnershipInvi createMembershipOrPartnershipInvitesBody3 = new OASCreateMembershipOrPartnershipInvi();
        OASCreateMembershipOrPartnershipInvi createMembershipOrPartnershipInvitesBody4 = new OASCreateMembershipOrPartnershipInvi();

        System.assert(createMembershipOrPartnershipInvitesBody1.equals(createMembershipOrPartnershipInvitesBody2));
        System.assert(createMembershipOrPartnershipInvitesBody3.equals(createMembershipOrPartnershipInvitesBody4));
        System.assertEquals(createMembershipOrPartnershipInvitesBody1.hashCode(), createMembershipOrPartnershipInvitesBody2.hashCode());
        System.assertEquals(createMembershipOrPartnershipInvitesBody3.hashCode(), createMembershipOrPartnershipInvitesBody4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCreateMembershipOrPartnershipInvi createMembershipOrPartnershipInvitesBody = new OASCreateMembershipOrPartnershipInvi();
        Map<String, String> x-property-mappings = createMembershipOrPartnershipInvitesBody.getx-property-mappings();
        System.assertEquals('businessRole', x-property-mappings.get('business_role'));
        System.assertEquals('inviteType', x-property-mappings.get('invite_type'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCreateMembershipOrPartnershipInvi createMembershipOrPartnershipInvitesBody = new OASCreateMembershipOrPartnershipInvi();
        System.assertEquals(new List<String>(), createMembershipOrPartnershipInvitesBody.members);
        System.assertEquals(new List<String>(), createMembershipOrPartnershipInvitesBody.partners);
        System.assertEquals(null, createMembershipOrPartnershipInvitesBody.businessRole);
        System.assertEquals(null, createMembershipOrPartnershipInvitesBody.inviteType);
    }
}
