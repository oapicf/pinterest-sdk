@isTest
private class OASAuthRespondInvitesBodyTest {
    @isTest
    private static void equalsSameInstance() {
        OASAuthRespondInvitesBody authRespondInvitesBody1 = OASAuthRespondInvitesBody.getExample();
        OASAuthRespondInvitesBody authRespondInvitesBody2 = authRespondInvitesBody1;
        OASAuthRespondInvitesBody authRespondInvitesBody3 = new OASAuthRespondInvitesBody();
        OASAuthRespondInvitesBody authRespondInvitesBody4 = authRespondInvitesBody3;

        System.assert(authRespondInvitesBody1.equals(authRespondInvitesBody2));
        System.assert(authRespondInvitesBody2.equals(authRespondInvitesBody1));
        System.assert(authRespondInvitesBody1.equals(authRespondInvitesBody1));
        System.assert(authRespondInvitesBody3.equals(authRespondInvitesBody4));
        System.assert(authRespondInvitesBody4.equals(authRespondInvitesBody3));
        System.assert(authRespondInvitesBody3.equals(authRespondInvitesBody3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAuthRespondInvitesBody authRespondInvitesBody1 = OASAuthRespondInvitesBody.getExample();
        OASAuthRespondInvitesBody authRespondInvitesBody2 = OASAuthRespondInvitesBody.getExample();
        OASAuthRespondInvitesBody authRespondInvitesBody3 = new OASAuthRespondInvitesBody();
        OASAuthRespondInvitesBody authRespondInvitesBody4 = new OASAuthRespondInvitesBody();

        System.assert(authRespondInvitesBody1.equals(authRespondInvitesBody2));
        System.assert(authRespondInvitesBody2.equals(authRespondInvitesBody1));
        System.assert(authRespondInvitesBody3.equals(authRespondInvitesBody4));
        System.assert(authRespondInvitesBody4.equals(authRespondInvitesBody3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAuthRespondInvitesBody authRespondInvitesBody1 = OASAuthRespondInvitesBody.getExample();
        OASAuthRespondInvitesBody authRespondInvitesBody2 = new OASAuthRespondInvitesBody();

        System.assertEquals(false, authRespondInvitesBody1.equals('foo'));
        System.assertEquals(false, authRespondInvitesBody2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAuthRespondInvitesBody authRespondInvitesBody1 = OASAuthRespondInvitesBody.getExample();
        OASAuthRespondInvitesBody authRespondInvitesBody2 = new OASAuthRespondInvitesBody();
        OASAuthRespondInvitesBody authRespondInvitesBody3;

        System.assertEquals(false, authRespondInvitesBody1.equals(authRespondInvitesBody3));
        System.assertEquals(false, authRespondInvitesBody2.equals(authRespondInvitesBody3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAuthRespondInvitesBody authRespondInvitesBody1 = OASAuthRespondInvitesBody.getExample();
        OASAuthRespondInvitesBody authRespondInvitesBody2 = new OASAuthRespondInvitesBody();

        System.assertEquals(authRespondInvitesBody1.hashCode(), authRespondInvitesBody1.hashCode());
        System.assertEquals(authRespondInvitesBody2.hashCode(), authRespondInvitesBody2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAuthRespondInvitesBody authRespondInvitesBody1 = OASAuthRespondInvitesBody.getExample();
        OASAuthRespondInvitesBody authRespondInvitesBody2 = OASAuthRespondInvitesBody.getExample();
        OASAuthRespondInvitesBody authRespondInvitesBody3 = new OASAuthRespondInvitesBody();
        OASAuthRespondInvitesBody authRespondInvitesBody4 = new OASAuthRespondInvitesBody();

        System.assert(authRespondInvitesBody1.equals(authRespondInvitesBody2));
        System.assert(authRespondInvitesBody3.equals(authRespondInvitesBody4));
        System.assertEquals(authRespondInvitesBody1.hashCode(), authRespondInvitesBody2.hashCode());
        System.assertEquals(authRespondInvitesBody3.hashCode(), authRespondInvitesBody4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAuthRespondInvitesBody authRespondInvitesBody = new OASAuthRespondInvitesBody();
        System.assertEquals(new List<OASAuthRespondInvitesBodyInvitesInne>(), authRespondInvitesBody.invites);
    }
}
