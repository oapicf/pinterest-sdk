@isTest
private class OASBusinessMemberAssetsSummaryProfilTest {
    @isTest
    private static void equalsSameInstance() {
        OASBusinessMemberAssetsSummaryProfil businessMemberAssetsSummaryProfilesInner1 = OASBusinessMemberAssetsSummaryProfil.getExample();
        OASBusinessMemberAssetsSummaryProfil businessMemberAssetsSummaryProfilesInner2 = businessMemberAssetsSummaryProfilesInner1;
        OASBusinessMemberAssetsSummaryProfil businessMemberAssetsSummaryProfilesInner3 = new OASBusinessMemberAssetsSummaryProfil();
        OASBusinessMemberAssetsSummaryProfil businessMemberAssetsSummaryProfilesInner4 = businessMemberAssetsSummaryProfilesInner3;

        System.assert(businessMemberAssetsSummaryProfilesInner1.equals(businessMemberAssetsSummaryProfilesInner2));
        System.assert(businessMemberAssetsSummaryProfilesInner2.equals(businessMemberAssetsSummaryProfilesInner1));
        System.assert(businessMemberAssetsSummaryProfilesInner1.equals(businessMemberAssetsSummaryProfilesInner1));
        System.assert(businessMemberAssetsSummaryProfilesInner3.equals(businessMemberAssetsSummaryProfilesInner4));
        System.assert(businessMemberAssetsSummaryProfilesInner4.equals(businessMemberAssetsSummaryProfilesInner3));
        System.assert(businessMemberAssetsSummaryProfilesInner3.equals(businessMemberAssetsSummaryProfilesInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBusinessMemberAssetsSummaryProfil businessMemberAssetsSummaryProfilesInner1 = OASBusinessMemberAssetsSummaryProfil.getExample();
        OASBusinessMemberAssetsSummaryProfil businessMemberAssetsSummaryProfilesInner2 = OASBusinessMemberAssetsSummaryProfil.getExample();
        OASBusinessMemberAssetsSummaryProfil businessMemberAssetsSummaryProfilesInner3 = new OASBusinessMemberAssetsSummaryProfil();
        OASBusinessMemberAssetsSummaryProfil businessMemberAssetsSummaryProfilesInner4 = new OASBusinessMemberAssetsSummaryProfil();

        System.assert(businessMemberAssetsSummaryProfilesInner1.equals(businessMemberAssetsSummaryProfilesInner2));
        System.assert(businessMemberAssetsSummaryProfilesInner2.equals(businessMemberAssetsSummaryProfilesInner1));
        System.assert(businessMemberAssetsSummaryProfilesInner3.equals(businessMemberAssetsSummaryProfilesInner4));
        System.assert(businessMemberAssetsSummaryProfilesInner4.equals(businessMemberAssetsSummaryProfilesInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBusinessMemberAssetsSummaryProfil businessMemberAssetsSummaryProfilesInner1 = OASBusinessMemberAssetsSummaryProfil.getExample();
        OASBusinessMemberAssetsSummaryProfil businessMemberAssetsSummaryProfilesInner2 = new OASBusinessMemberAssetsSummaryProfil();

        System.assertEquals(false, businessMemberAssetsSummaryProfilesInner1.equals('foo'));
        System.assertEquals(false, businessMemberAssetsSummaryProfilesInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBusinessMemberAssetsSummaryProfil businessMemberAssetsSummaryProfilesInner1 = OASBusinessMemberAssetsSummaryProfil.getExample();
        OASBusinessMemberAssetsSummaryProfil businessMemberAssetsSummaryProfilesInner2 = new OASBusinessMemberAssetsSummaryProfil();
        OASBusinessMemberAssetsSummaryProfil businessMemberAssetsSummaryProfilesInner3;

        System.assertEquals(false, businessMemberAssetsSummaryProfilesInner1.equals(businessMemberAssetsSummaryProfilesInner3));
        System.assertEquals(false, businessMemberAssetsSummaryProfilesInner2.equals(businessMemberAssetsSummaryProfilesInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBusinessMemberAssetsSummaryProfil businessMemberAssetsSummaryProfilesInner1 = OASBusinessMemberAssetsSummaryProfil.getExample();
        OASBusinessMemberAssetsSummaryProfil businessMemberAssetsSummaryProfilesInner2 = new OASBusinessMemberAssetsSummaryProfil();

        System.assertEquals(businessMemberAssetsSummaryProfilesInner1.hashCode(), businessMemberAssetsSummaryProfilesInner1.hashCode());
        System.assertEquals(businessMemberAssetsSummaryProfilesInner2.hashCode(), businessMemberAssetsSummaryProfilesInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBusinessMemberAssetsSummaryProfil businessMemberAssetsSummaryProfilesInner1 = OASBusinessMemberAssetsSummaryProfil.getExample();
        OASBusinessMemberAssetsSummaryProfil businessMemberAssetsSummaryProfilesInner2 = OASBusinessMemberAssetsSummaryProfil.getExample();
        OASBusinessMemberAssetsSummaryProfil businessMemberAssetsSummaryProfilesInner3 = new OASBusinessMemberAssetsSummaryProfil();
        OASBusinessMemberAssetsSummaryProfil businessMemberAssetsSummaryProfilesInner4 = new OASBusinessMemberAssetsSummaryProfil();

        System.assert(businessMemberAssetsSummaryProfilesInner1.equals(businessMemberAssetsSummaryProfilesInner2));
        System.assert(businessMemberAssetsSummaryProfilesInner3.equals(businessMemberAssetsSummaryProfilesInner4));
        System.assertEquals(businessMemberAssetsSummaryProfilesInner1.hashCode(), businessMemberAssetsSummaryProfilesInner2.hashCode());
        System.assertEquals(businessMemberAssetsSummaryProfilesInner3.hashCode(), businessMemberAssetsSummaryProfilesInner4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASBusinessMemberAssetsSummaryProfil businessMemberAssetsSummaryProfilesInner = new OASBusinessMemberAssetsSummaryProfil();
        System.assertEquals(new List<String>(), businessMemberAssetsSummaryProfilesInner.permissions);
        System.assertEquals(null, businessMemberAssetsSummaryProfilesInner.id);
    }
}
