@isTest
private class OASInviteAssetsSummaryProfilesInnerTest {
    @isTest
    private static void equalsSameInstance() {
        OASInviteAssetsSummaryProfilesInner inviteAssetsSummaryProfilesInner1 = OASInviteAssetsSummaryProfilesInner.getExample();
        OASInviteAssetsSummaryProfilesInner inviteAssetsSummaryProfilesInner2 = inviteAssetsSummaryProfilesInner1;
        OASInviteAssetsSummaryProfilesInner inviteAssetsSummaryProfilesInner3 = new OASInviteAssetsSummaryProfilesInner();
        OASInviteAssetsSummaryProfilesInner inviteAssetsSummaryProfilesInner4 = inviteAssetsSummaryProfilesInner3;

        System.assert(inviteAssetsSummaryProfilesInner1.equals(inviteAssetsSummaryProfilesInner2));
        System.assert(inviteAssetsSummaryProfilesInner2.equals(inviteAssetsSummaryProfilesInner1));
        System.assert(inviteAssetsSummaryProfilesInner1.equals(inviteAssetsSummaryProfilesInner1));
        System.assert(inviteAssetsSummaryProfilesInner3.equals(inviteAssetsSummaryProfilesInner4));
        System.assert(inviteAssetsSummaryProfilesInner4.equals(inviteAssetsSummaryProfilesInner3));
        System.assert(inviteAssetsSummaryProfilesInner3.equals(inviteAssetsSummaryProfilesInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASInviteAssetsSummaryProfilesInner inviteAssetsSummaryProfilesInner1 = OASInviteAssetsSummaryProfilesInner.getExample();
        OASInviteAssetsSummaryProfilesInner inviteAssetsSummaryProfilesInner2 = OASInviteAssetsSummaryProfilesInner.getExample();
        OASInviteAssetsSummaryProfilesInner inviteAssetsSummaryProfilesInner3 = new OASInviteAssetsSummaryProfilesInner();
        OASInviteAssetsSummaryProfilesInner inviteAssetsSummaryProfilesInner4 = new OASInviteAssetsSummaryProfilesInner();

        System.assert(inviteAssetsSummaryProfilesInner1.equals(inviteAssetsSummaryProfilesInner2));
        System.assert(inviteAssetsSummaryProfilesInner2.equals(inviteAssetsSummaryProfilesInner1));
        System.assert(inviteAssetsSummaryProfilesInner3.equals(inviteAssetsSummaryProfilesInner4));
        System.assert(inviteAssetsSummaryProfilesInner4.equals(inviteAssetsSummaryProfilesInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASInviteAssetsSummaryProfilesInner inviteAssetsSummaryProfilesInner1 = OASInviteAssetsSummaryProfilesInner.getExample();
        OASInviteAssetsSummaryProfilesInner inviteAssetsSummaryProfilesInner2 = new OASInviteAssetsSummaryProfilesInner();

        System.assertEquals(false, inviteAssetsSummaryProfilesInner1.equals('foo'));
        System.assertEquals(false, inviteAssetsSummaryProfilesInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASInviteAssetsSummaryProfilesInner inviteAssetsSummaryProfilesInner1 = OASInviteAssetsSummaryProfilesInner.getExample();
        OASInviteAssetsSummaryProfilesInner inviteAssetsSummaryProfilesInner2 = new OASInviteAssetsSummaryProfilesInner();
        OASInviteAssetsSummaryProfilesInner inviteAssetsSummaryProfilesInner3;

        System.assertEquals(false, inviteAssetsSummaryProfilesInner1.equals(inviteAssetsSummaryProfilesInner3));
        System.assertEquals(false, inviteAssetsSummaryProfilesInner2.equals(inviteAssetsSummaryProfilesInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASInviteAssetsSummaryProfilesInner inviteAssetsSummaryProfilesInner1 = OASInviteAssetsSummaryProfilesInner.getExample();
        OASInviteAssetsSummaryProfilesInner inviteAssetsSummaryProfilesInner2 = new OASInviteAssetsSummaryProfilesInner();

        System.assertEquals(inviteAssetsSummaryProfilesInner1.hashCode(), inviteAssetsSummaryProfilesInner1.hashCode());
        System.assertEquals(inviteAssetsSummaryProfilesInner2.hashCode(), inviteAssetsSummaryProfilesInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASInviteAssetsSummaryProfilesInner inviteAssetsSummaryProfilesInner1 = OASInviteAssetsSummaryProfilesInner.getExample();
        OASInviteAssetsSummaryProfilesInner inviteAssetsSummaryProfilesInner2 = OASInviteAssetsSummaryProfilesInner.getExample();
        OASInviteAssetsSummaryProfilesInner inviteAssetsSummaryProfilesInner3 = new OASInviteAssetsSummaryProfilesInner();
        OASInviteAssetsSummaryProfilesInner inviteAssetsSummaryProfilesInner4 = new OASInviteAssetsSummaryProfilesInner();

        System.assert(inviteAssetsSummaryProfilesInner1.equals(inviteAssetsSummaryProfilesInner2));
        System.assert(inviteAssetsSummaryProfilesInner3.equals(inviteAssetsSummaryProfilesInner4));
        System.assertEquals(inviteAssetsSummaryProfilesInner1.hashCode(), inviteAssetsSummaryProfilesInner2.hashCode());
        System.assertEquals(inviteAssetsSummaryProfilesInner3.hashCode(), inviteAssetsSummaryProfilesInner4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASInviteAssetsSummaryProfilesInner inviteAssetsSummaryProfilesInner = new OASInviteAssetsSummaryProfilesInner();
        System.assertEquals(new List<String>(), inviteAssetsSummaryProfilesInner.permissions);
        System.assertEquals(null, inviteAssetsSummaryProfilesInner.id);
    }
}
