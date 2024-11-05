@isTest
private class OASInviteAssetsSummaryAdAccountsInneTest {
    @isTest
    private static void equalsSameInstance() {
        OASInviteAssetsSummaryAdAccountsInne inviteAssetsSummaryAdAccountsInner1 = OASInviteAssetsSummaryAdAccountsInne.getExample();
        OASInviteAssetsSummaryAdAccountsInne inviteAssetsSummaryAdAccountsInner2 = inviteAssetsSummaryAdAccountsInner1;
        OASInviteAssetsSummaryAdAccountsInne inviteAssetsSummaryAdAccountsInner3 = new OASInviteAssetsSummaryAdAccountsInne();
        OASInviteAssetsSummaryAdAccountsInne inviteAssetsSummaryAdAccountsInner4 = inviteAssetsSummaryAdAccountsInner3;

        System.assert(inviteAssetsSummaryAdAccountsInner1.equals(inviteAssetsSummaryAdAccountsInner2));
        System.assert(inviteAssetsSummaryAdAccountsInner2.equals(inviteAssetsSummaryAdAccountsInner1));
        System.assert(inviteAssetsSummaryAdAccountsInner1.equals(inviteAssetsSummaryAdAccountsInner1));
        System.assert(inviteAssetsSummaryAdAccountsInner3.equals(inviteAssetsSummaryAdAccountsInner4));
        System.assert(inviteAssetsSummaryAdAccountsInner4.equals(inviteAssetsSummaryAdAccountsInner3));
        System.assert(inviteAssetsSummaryAdAccountsInner3.equals(inviteAssetsSummaryAdAccountsInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASInviteAssetsSummaryAdAccountsInne inviteAssetsSummaryAdAccountsInner1 = OASInviteAssetsSummaryAdAccountsInne.getExample();
        OASInviteAssetsSummaryAdAccountsInne inviteAssetsSummaryAdAccountsInner2 = OASInviteAssetsSummaryAdAccountsInne.getExample();
        OASInviteAssetsSummaryAdAccountsInne inviteAssetsSummaryAdAccountsInner3 = new OASInviteAssetsSummaryAdAccountsInne();
        OASInviteAssetsSummaryAdAccountsInne inviteAssetsSummaryAdAccountsInner4 = new OASInviteAssetsSummaryAdAccountsInne();

        System.assert(inviteAssetsSummaryAdAccountsInner1.equals(inviteAssetsSummaryAdAccountsInner2));
        System.assert(inviteAssetsSummaryAdAccountsInner2.equals(inviteAssetsSummaryAdAccountsInner1));
        System.assert(inviteAssetsSummaryAdAccountsInner3.equals(inviteAssetsSummaryAdAccountsInner4));
        System.assert(inviteAssetsSummaryAdAccountsInner4.equals(inviteAssetsSummaryAdAccountsInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASInviteAssetsSummaryAdAccountsInne inviteAssetsSummaryAdAccountsInner1 = OASInviteAssetsSummaryAdAccountsInne.getExample();
        OASInviteAssetsSummaryAdAccountsInne inviteAssetsSummaryAdAccountsInner2 = new OASInviteAssetsSummaryAdAccountsInne();

        System.assertEquals(false, inviteAssetsSummaryAdAccountsInner1.equals('foo'));
        System.assertEquals(false, inviteAssetsSummaryAdAccountsInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASInviteAssetsSummaryAdAccountsInne inviteAssetsSummaryAdAccountsInner1 = OASInviteAssetsSummaryAdAccountsInne.getExample();
        OASInviteAssetsSummaryAdAccountsInne inviteAssetsSummaryAdAccountsInner2 = new OASInviteAssetsSummaryAdAccountsInne();
        OASInviteAssetsSummaryAdAccountsInne inviteAssetsSummaryAdAccountsInner3;

        System.assertEquals(false, inviteAssetsSummaryAdAccountsInner1.equals(inviteAssetsSummaryAdAccountsInner3));
        System.assertEquals(false, inviteAssetsSummaryAdAccountsInner2.equals(inviteAssetsSummaryAdAccountsInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASInviteAssetsSummaryAdAccountsInne inviteAssetsSummaryAdAccountsInner1 = OASInviteAssetsSummaryAdAccountsInne.getExample();
        OASInviteAssetsSummaryAdAccountsInne inviteAssetsSummaryAdAccountsInner2 = new OASInviteAssetsSummaryAdAccountsInne();

        System.assertEquals(inviteAssetsSummaryAdAccountsInner1.hashCode(), inviteAssetsSummaryAdAccountsInner1.hashCode());
        System.assertEquals(inviteAssetsSummaryAdAccountsInner2.hashCode(), inviteAssetsSummaryAdAccountsInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASInviteAssetsSummaryAdAccountsInne inviteAssetsSummaryAdAccountsInner1 = OASInviteAssetsSummaryAdAccountsInne.getExample();
        OASInviteAssetsSummaryAdAccountsInne inviteAssetsSummaryAdAccountsInner2 = OASInviteAssetsSummaryAdAccountsInne.getExample();
        OASInviteAssetsSummaryAdAccountsInne inviteAssetsSummaryAdAccountsInner3 = new OASInviteAssetsSummaryAdAccountsInne();
        OASInviteAssetsSummaryAdAccountsInne inviteAssetsSummaryAdAccountsInner4 = new OASInviteAssetsSummaryAdAccountsInne();

        System.assert(inviteAssetsSummaryAdAccountsInner1.equals(inviteAssetsSummaryAdAccountsInner2));
        System.assert(inviteAssetsSummaryAdAccountsInner3.equals(inviteAssetsSummaryAdAccountsInner4));
        System.assertEquals(inviteAssetsSummaryAdAccountsInner1.hashCode(), inviteAssetsSummaryAdAccountsInner2.hashCode());
        System.assertEquals(inviteAssetsSummaryAdAccountsInner3.hashCode(), inviteAssetsSummaryAdAccountsInner4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASInviteAssetsSummaryAdAccountsInne inviteAssetsSummaryAdAccountsInner = new OASInviteAssetsSummaryAdAccountsInne();
        System.assertEquals(new List<String>(), inviteAssetsSummaryAdAccountsInner.permissions);
        System.assertEquals(null, inviteAssetsSummaryAdAccountsInner.id);
    }
}
