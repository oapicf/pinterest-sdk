@isTest
private class OASBusinessMemberAssetsSummaryAdAccoTest {
    @isTest
    private static void equalsSameInstance() {
        OASBusinessMemberAssetsSummaryAdAcco businessMemberAssetsSummaryAdAccountsInner1 = OASBusinessMemberAssetsSummaryAdAcco.getExample();
        OASBusinessMemberAssetsSummaryAdAcco businessMemberAssetsSummaryAdAccountsInner2 = businessMemberAssetsSummaryAdAccountsInner1;
        OASBusinessMemberAssetsSummaryAdAcco businessMemberAssetsSummaryAdAccountsInner3 = new OASBusinessMemberAssetsSummaryAdAcco();
        OASBusinessMemberAssetsSummaryAdAcco businessMemberAssetsSummaryAdAccountsInner4 = businessMemberAssetsSummaryAdAccountsInner3;

        System.assert(businessMemberAssetsSummaryAdAccountsInner1.equals(businessMemberAssetsSummaryAdAccountsInner2));
        System.assert(businessMemberAssetsSummaryAdAccountsInner2.equals(businessMemberAssetsSummaryAdAccountsInner1));
        System.assert(businessMemberAssetsSummaryAdAccountsInner1.equals(businessMemberAssetsSummaryAdAccountsInner1));
        System.assert(businessMemberAssetsSummaryAdAccountsInner3.equals(businessMemberAssetsSummaryAdAccountsInner4));
        System.assert(businessMemberAssetsSummaryAdAccountsInner4.equals(businessMemberAssetsSummaryAdAccountsInner3));
        System.assert(businessMemberAssetsSummaryAdAccountsInner3.equals(businessMemberAssetsSummaryAdAccountsInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBusinessMemberAssetsSummaryAdAcco businessMemberAssetsSummaryAdAccountsInner1 = OASBusinessMemberAssetsSummaryAdAcco.getExample();
        OASBusinessMemberAssetsSummaryAdAcco businessMemberAssetsSummaryAdAccountsInner2 = OASBusinessMemberAssetsSummaryAdAcco.getExample();
        OASBusinessMemberAssetsSummaryAdAcco businessMemberAssetsSummaryAdAccountsInner3 = new OASBusinessMemberAssetsSummaryAdAcco();
        OASBusinessMemberAssetsSummaryAdAcco businessMemberAssetsSummaryAdAccountsInner4 = new OASBusinessMemberAssetsSummaryAdAcco();

        System.assert(businessMemberAssetsSummaryAdAccountsInner1.equals(businessMemberAssetsSummaryAdAccountsInner2));
        System.assert(businessMemberAssetsSummaryAdAccountsInner2.equals(businessMemberAssetsSummaryAdAccountsInner1));
        System.assert(businessMemberAssetsSummaryAdAccountsInner3.equals(businessMemberAssetsSummaryAdAccountsInner4));
        System.assert(businessMemberAssetsSummaryAdAccountsInner4.equals(businessMemberAssetsSummaryAdAccountsInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBusinessMemberAssetsSummaryAdAcco businessMemberAssetsSummaryAdAccountsInner1 = OASBusinessMemberAssetsSummaryAdAcco.getExample();
        OASBusinessMemberAssetsSummaryAdAcco businessMemberAssetsSummaryAdAccountsInner2 = new OASBusinessMemberAssetsSummaryAdAcco();

        System.assertEquals(false, businessMemberAssetsSummaryAdAccountsInner1.equals('foo'));
        System.assertEquals(false, businessMemberAssetsSummaryAdAccountsInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBusinessMemberAssetsSummaryAdAcco businessMemberAssetsSummaryAdAccountsInner1 = OASBusinessMemberAssetsSummaryAdAcco.getExample();
        OASBusinessMemberAssetsSummaryAdAcco businessMemberAssetsSummaryAdAccountsInner2 = new OASBusinessMemberAssetsSummaryAdAcco();
        OASBusinessMemberAssetsSummaryAdAcco businessMemberAssetsSummaryAdAccountsInner3;

        System.assertEquals(false, businessMemberAssetsSummaryAdAccountsInner1.equals(businessMemberAssetsSummaryAdAccountsInner3));
        System.assertEquals(false, businessMemberAssetsSummaryAdAccountsInner2.equals(businessMemberAssetsSummaryAdAccountsInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBusinessMemberAssetsSummaryAdAcco businessMemberAssetsSummaryAdAccountsInner1 = OASBusinessMemberAssetsSummaryAdAcco.getExample();
        OASBusinessMemberAssetsSummaryAdAcco businessMemberAssetsSummaryAdAccountsInner2 = new OASBusinessMemberAssetsSummaryAdAcco();

        System.assertEquals(businessMemberAssetsSummaryAdAccountsInner1.hashCode(), businessMemberAssetsSummaryAdAccountsInner1.hashCode());
        System.assertEquals(businessMemberAssetsSummaryAdAccountsInner2.hashCode(), businessMemberAssetsSummaryAdAccountsInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBusinessMemberAssetsSummaryAdAcco businessMemberAssetsSummaryAdAccountsInner1 = OASBusinessMemberAssetsSummaryAdAcco.getExample();
        OASBusinessMemberAssetsSummaryAdAcco businessMemberAssetsSummaryAdAccountsInner2 = OASBusinessMemberAssetsSummaryAdAcco.getExample();
        OASBusinessMemberAssetsSummaryAdAcco businessMemberAssetsSummaryAdAccountsInner3 = new OASBusinessMemberAssetsSummaryAdAcco();
        OASBusinessMemberAssetsSummaryAdAcco businessMemberAssetsSummaryAdAccountsInner4 = new OASBusinessMemberAssetsSummaryAdAcco();

        System.assert(businessMemberAssetsSummaryAdAccountsInner1.equals(businessMemberAssetsSummaryAdAccountsInner2));
        System.assert(businessMemberAssetsSummaryAdAccountsInner3.equals(businessMemberAssetsSummaryAdAccountsInner4));
        System.assertEquals(businessMemberAssetsSummaryAdAccountsInner1.hashCode(), businessMemberAssetsSummaryAdAccountsInner2.hashCode());
        System.assertEquals(businessMemberAssetsSummaryAdAccountsInner3.hashCode(), businessMemberAssetsSummaryAdAccountsInner4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASBusinessMemberAssetsSummaryAdAcco businessMemberAssetsSummaryAdAccountsInner = new OASBusinessMemberAssetsSummaryAdAcco();
        System.assertEquals(new List<String>(), businessMemberAssetsSummaryAdAccountsInner.permissions);
        System.assertEquals(null, businessMemberAssetsSummaryAdAccountsInner.id);
    }
}
