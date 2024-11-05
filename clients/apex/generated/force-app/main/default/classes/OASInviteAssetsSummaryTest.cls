@isTest
private class OASInviteAssetsSummaryTest {
    @isTest
    private static void equalsSameInstance() {
        OASInviteAssetsSummary inviteAssetsSummary1 = OASInviteAssetsSummary.getExample();
        OASInviteAssetsSummary inviteAssetsSummary2 = inviteAssetsSummary1;
        OASInviteAssetsSummary inviteAssetsSummary3 = new OASInviteAssetsSummary();
        OASInviteAssetsSummary inviteAssetsSummary4 = inviteAssetsSummary3;

        System.assert(inviteAssetsSummary1.equals(inviteAssetsSummary2));
        System.assert(inviteAssetsSummary2.equals(inviteAssetsSummary1));
        System.assert(inviteAssetsSummary1.equals(inviteAssetsSummary1));
        System.assert(inviteAssetsSummary3.equals(inviteAssetsSummary4));
        System.assert(inviteAssetsSummary4.equals(inviteAssetsSummary3));
        System.assert(inviteAssetsSummary3.equals(inviteAssetsSummary3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASInviteAssetsSummary inviteAssetsSummary1 = OASInviteAssetsSummary.getExample();
        OASInviteAssetsSummary inviteAssetsSummary2 = OASInviteAssetsSummary.getExample();
        OASInviteAssetsSummary inviteAssetsSummary3 = new OASInviteAssetsSummary();
        OASInviteAssetsSummary inviteAssetsSummary4 = new OASInviteAssetsSummary();

        System.assert(inviteAssetsSummary1.equals(inviteAssetsSummary2));
        System.assert(inviteAssetsSummary2.equals(inviteAssetsSummary1));
        System.assert(inviteAssetsSummary3.equals(inviteAssetsSummary4));
        System.assert(inviteAssetsSummary4.equals(inviteAssetsSummary3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASInviteAssetsSummary inviteAssetsSummary1 = OASInviteAssetsSummary.getExample();
        OASInviteAssetsSummary inviteAssetsSummary2 = new OASInviteAssetsSummary();

        System.assertEquals(false, inviteAssetsSummary1.equals('foo'));
        System.assertEquals(false, inviteAssetsSummary2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASInviteAssetsSummary inviteAssetsSummary1 = OASInviteAssetsSummary.getExample();
        OASInviteAssetsSummary inviteAssetsSummary2 = new OASInviteAssetsSummary();
        OASInviteAssetsSummary inviteAssetsSummary3;

        System.assertEquals(false, inviteAssetsSummary1.equals(inviteAssetsSummary3));
        System.assertEquals(false, inviteAssetsSummary2.equals(inviteAssetsSummary3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASInviteAssetsSummary inviteAssetsSummary1 = OASInviteAssetsSummary.getExample();
        OASInviteAssetsSummary inviteAssetsSummary2 = new OASInviteAssetsSummary();

        System.assertEquals(inviteAssetsSummary1.hashCode(), inviteAssetsSummary1.hashCode());
        System.assertEquals(inviteAssetsSummary2.hashCode(), inviteAssetsSummary2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASInviteAssetsSummary inviteAssetsSummary1 = OASInviteAssetsSummary.getExample();
        OASInviteAssetsSummary inviteAssetsSummary2 = OASInviteAssetsSummary.getExample();
        OASInviteAssetsSummary inviteAssetsSummary3 = new OASInviteAssetsSummary();
        OASInviteAssetsSummary inviteAssetsSummary4 = new OASInviteAssetsSummary();

        System.assert(inviteAssetsSummary1.equals(inviteAssetsSummary2));
        System.assert(inviteAssetsSummary3.equals(inviteAssetsSummary4));
        System.assertEquals(inviteAssetsSummary1.hashCode(), inviteAssetsSummary2.hashCode());
        System.assertEquals(inviteAssetsSummary3.hashCode(), inviteAssetsSummary4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASInviteAssetsSummary inviteAssetsSummary = new OASInviteAssetsSummary();
        Map<String, String> x-property-mappings = inviteAssetsSummary.getx-property-mappings();
        System.assertEquals('adAccounts', x-property-mappings.get('ad_accounts'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASInviteAssetsSummary inviteAssetsSummary = new OASInviteAssetsSummary();
        System.assertEquals(new List<OASInviteAssetsSummaryAdAccountsInne>(), inviteAssetsSummary.adAccounts);
        System.assertEquals(new List<OASInviteAssetsSummaryProfilesInner>(), inviteAssetsSummary.profiles);
    }
}
