@isTest
private class OASCancelInvitesBodyTest {
    @isTest
    private static void equalsSameInstance() {
        OASCancelInvitesBody cancelInvitesBody1 = OASCancelInvitesBody.getExample();
        OASCancelInvitesBody cancelInvitesBody2 = cancelInvitesBody1;
        OASCancelInvitesBody cancelInvitesBody3 = new OASCancelInvitesBody();
        OASCancelInvitesBody cancelInvitesBody4 = cancelInvitesBody3;

        System.assert(cancelInvitesBody1.equals(cancelInvitesBody2));
        System.assert(cancelInvitesBody2.equals(cancelInvitesBody1));
        System.assert(cancelInvitesBody1.equals(cancelInvitesBody1));
        System.assert(cancelInvitesBody3.equals(cancelInvitesBody4));
        System.assert(cancelInvitesBody4.equals(cancelInvitesBody3));
        System.assert(cancelInvitesBody3.equals(cancelInvitesBody3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCancelInvitesBody cancelInvitesBody1 = OASCancelInvitesBody.getExample();
        OASCancelInvitesBody cancelInvitesBody2 = OASCancelInvitesBody.getExample();
        OASCancelInvitesBody cancelInvitesBody3 = new OASCancelInvitesBody();
        OASCancelInvitesBody cancelInvitesBody4 = new OASCancelInvitesBody();

        System.assert(cancelInvitesBody1.equals(cancelInvitesBody2));
        System.assert(cancelInvitesBody2.equals(cancelInvitesBody1));
        System.assert(cancelInvitesBody3.equals(cancelInvitesBody4));
        System.assert(cancelInvitesBody4.equals(cancelInvitesBody3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCancelInvitesBody cancelInvitesBody1 = OASCancelInvitesBody.getExample();
        OASCancelInvitesBody cancelInvitesBody2 = new OASCancelInvitesBody();

        System.assertEquals(false, cancelInvitesBody1.equals('foo'));
        System.assertEquals(false, cancelInvitesBody2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCancelInvitesBody cancelInvitesBody1 = OASCancelInvitesBody.getExample();
        OASCancelInvitesBody cancelInvitesBody2 = new OASCancelInvitesBody();
        OASCancelInvitesBody cancelInvitesBody3;

        System.assertEquals(false, cancelInvitesBody1.equals(cancelInvitesBody3));
        System.assertEquals(false, cancelInvitesBody2.equals(cancelInvitesBody3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCancelInvitesBody cancelInvitesBody1 = OASCancelInvitesBody.getExample();
        OASCancelInvitesBody cancelInvitesBody2 = new OASCancelInvitesBody();

        System.assertEquals(cancelInvitesBody1.hashCode(), cancelInvitesBody1.hashCode());
        System.assertEquals(cancelInvitesBody2.hashCode(), cancelInvitesBody2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCancelInvitesBody cancelInvitesBody1 = OASCancelInvitesBody.getExample();
        OASCancelInvitesBody cancelInvitesBody2 = OASCancelInvitesBody.getExample();
        OASCancelInvitesBody cancelInvitesBody3 = new OASCancelInvitesBody();
        OASCancelInvitesBody cancelInvitesBody4 = new OASCancelInvitesBody();

        System.assert(cancelInvitesBody1.equals(cancelInvitesBody2));
        System.assert(cancelInvitesBody3.equals(cancelInvitesBody4));
        System.assertEquals(cancelInvitesBody1.hashCode(), cancelInvitesBody2.hashCode());
        System.assertEquals(cancelInvitesBody3.hashCode(), cancelInvitesBody4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCancelInvitesBody cancelInvitesBody = new OASCancelInvitesBody();
        Map<String, String> x-property-mappings = cancelInvitesBody.getx-property-mappings();
        System.assertEquals('inviteIds', x-property-mappings.get('invite_ids'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCancelInvitesBody cancelInvitesBody = new OASCancelInvitesBody();
        System.assertEquals(new List<String>(), cancelInvitesBody.inviteIds);
    }
}
