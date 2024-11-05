@isTest
private class OASAuthRespondInvitesBodyInvitesInneTest {
    @isTest
    private static void equalsSameInstance() {
        OASAuthRespondInvitesBodyInvitesInne authRespondInvitesBodyInvitesInner1 = OASAuthRespondInvitesBodyInvitesInne.getExample();
        OASAuthRespondInvitesBodyInvitesInne authRespondInvitesBodyInvitesInner2 = authRespondInvitesBodyInvitesInner1;
        OASAuthRespondInvitesBodyInvitesInne authRespondInvitesBodyInvitesInner3 = new OASAuthRespondInvitesBodyInvitesInne();
        OASAuthRespondInvitesBodyInvitesInne authRespondInvitesBodyInvitesInner4 = authRespondInvitesBodyInvitesInner3;

        System.assert(authRespondInvitesBodyInvitesInner1.equals(authRespondInvitesBodyInvitesInner2));
        System.assert(authRespondInvitesBodyInvitesInner2.equals(authRespondInvitesBodyInvitesInner1));
        System.assert(authRespondInvitesBodyInvitesInner1.equals(authRespondInvitesBodyInvitesInner1));
        System.assert(authRespondInvitesBodyInvitesInner3.equals(authRespondInvitesBodyInvitesInner4));
        System.assert(authRespondInvitesBodyInvitesInner4.equals(authRespondInvitesBodyInvitesInner3));
        System.assert(authRespondInvitesBodyInvitesInner3.equals(authRespondInvitesBodyInvitesInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAuthRespondInvitesBodyInvitesInne authRespondInvitesBodyInvitesInner1 = OASAuthRespondInvitesBodyInvitesInne.getExample();
        OASAuthRespondInvitesBodyInvitesInne authRespondInvitesBodyInvitesInner2 = OASAuthRespondInvitesBodyInvitesInne.getExample();
        OASAuthRespondInvitesBodyInvitesInne authRespondInvitesBodyInvitesInner3 = new OASAuthRespondInvitesBodyInvitesInne();
        OASAuthRespondInvitesBodyInvitesInne authRespondInvitesBodyInvitesInner4 = new OASAuthRespondInvitesBodyInvitesInne();

        System.assert(authRespondInvitesBodyInvitesInner1.equals(authRespondInvitesBodyInvitesInner2));
        System.assert(authRespondInvitesBodyInvitesInner2.equals(authRespondInvitesBodyInvitesInner1));
        System.assert(authRespondInvitesBodyInvitesInner3.equals(authRespondInvitesBodyInvitesInner4));
        System.assert(authRespondInvitesBodyInvitesInner4.equals(authRespondInvitesBodyInvitesInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAuthRespondInvitesBodyInvitesInne authRespondInvitesBodyInvitesInner1 = OASAuthRespondInvitesBodyInvitesInne.getExample();
        OASAuthRespondInvitesBodyInvitesInne authRespondInvitesBodyInvitesInner2 = new OASAuthRespondInvitesBodyInvitesInne();

        System.assertEquals(false, authRespondInvitesBodyInvitesInner1.equals('foo'));
        System.assertEquals(false, authRespondInvitesBodyInvitesInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAuthRespondInvitesBodyInvitesInne authRespondInvitesBodyInvitesInner1 = OASAuthRespondInvitesBodyInvitesInne.getExample();
        OASAuthRespondInvitesBodyInvitesInne authRespondInvitesBodyInvitesInner2 = new OASAuthRespondInvitesBodyInvitesInne();
        OASAuthRespondInvitesBodyInvitesInne authRespondInvitesBodyInvitesInner3;

        System.assertEquals(false, authRespondInvitesBodyInvitesInner1.equals(authRespondInvitesBodyInvitesInner3));
        System.assertEquals(false, authRespondInvitesBodyInvitesInner2.equals(authRespondInvitesBodyInvitesInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAuthRespondInvitesBodyInvitesInne authRespondInvitesBodyInvitesInner1 = OASAuthRespondInvitesBodyInvitesInne.getExample();
        OASAuthRespondInvitesBodyInvitesInne authRespondInvitesBodyInvitesInner2 = new OASAuthRespondInvitesBodyInvitesInne();

        System.assertEquals(authRespondInvitesBodyInvitesInner1.hashCode(), authRespondInvitesBodyInvitesInner1.hashCode());
        System.assertEquals(authRespondInvitesBodyInvitesInner2.hashCode(), authRespondInvitesBodyInvitesInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAuthRespondInvitesBodyInvitesInne authRespondInvitesBodyInvitesInner1 = OASAuthRespondInvitesBodyInvitesInne.getExample();
        OASAuthRespondInvitesBodyInvitesInne authRespondInvitesBodyInvitesInner2 = OASAuthRespondInvitesBodyInvitesInne.getExample();
        OASAuthRespondInvitesBodyInvitesInne authRespondInvitesBodyInvitesInner3 = new OASAuthRespondInvitesBodyInvitesInne();
        OASAuthRespondInvitesBodyInvitesInne authRespondInvitesBodyInvitesInner4 = new OASAuthRespondInvitesBodyInvitesInne();

        System.assert(authRespondInvitesBodyInvitesInner1.equals(authRespondInvitesBodyInvitesInner2));
        System.assert(authRespondInvitesBodyInvitesInner3.equals(authRespondInvitesBodyInvitesInner4));
        System.assertEquals(authRespondInvitesBodyInvitesInner1.hashCode(), authRespondInvitesBodyInvitesInner2.hashCode());
        System.assertEquals(authRespondInvitesBodyInvitesInner3.hashCode(), authRespondInvitesBodyInvitesInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAuthRespondInvitesBodyInvitesInne authRespondInvitesBodyInvitesInner = new OASAuthRespondInvitesBodyInvitesInne();
        Map<String, String> x-property-mappings = authRespondInvitesBodyInvitesInner.getx-property-mappings();
        System.assertEquals('inviteId', x-property-mappings.get('invite_id'));
    }
}
