@isTest
private class OASBusinessMemberAssetsSummaryTest {
    @isTest
    private static void equalsSameInstance() {
        OASBusinessMemberAssetsSummary businessMemberAssetsSummary1 = OASBusinessMemberAssetsSummary.getExample();
        OASBusinessMemberAssetsSummary businessMemberAssetsSummary2 = businessMemberAssetsSummary1;
        OASBusinessMemberAssetsSummary businessMemberAssetsSummary3 = new OASBusinessMemberAssetsSummary();
        OASBusinessMemberAssetsSummary businessMemberAssetsSummary4 = businessMemberAssetsSummary3;

        System.assert(businessMemberAssetsSummary1.equals(businessMemberAssetsSummary2));
        System.assert(businessMemberAssetsSummary2.equals(businessMemberAssetsSummary1));
        System.assert(businessMemberAssetsSummary1.equals(businessMemberAssetsSummary1));
        System.assert(businessMemberAssetsSummary3.equals(businessMemberAssetsSummary4));
        System.assert(businessMemberAssetsSummary4.equals(businessMemberAssetsSummary3));
        System.assert(businessMemberAssetsSummary3.equals(businessMemberAssetsSummary3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBusinessMemberAssetsSummary businessMemberAssetsSummary1 = OASBusinessMemberAssetsSummary.getExample();
        OASBusinessMemberAssetsSummary businessMemberAssetsSummary2 = OASBusinessMemberAssetsSummary.getExample();
        OASBusinessMemberAssetsSummary businessMemberAssetsSummary3 = new OASBusinessMemberAssetsSummary();
        OASBusinessMemberAssetsSummary businessMemberAssetsSummary4 = new OASBusinessMemberAssetsSummary();

        System.assert(businessMemberAssetsSummary1.equals(businessMemberAssetsSummary2));
        System.assert(businessMemberAssetsSummary2.equals(businessMemberAssetsSummary1));
        System.assert(businessMemberAssetsSummary3.equals(businessMemberAssetsSummary4));
        System.assert(businessMemberAssetsSummary4.equals(businessMemberAssetsSummary3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBusinessMemberAssetsSummary businessMemberAssetsSummary1 = OASBusinessMemberAssetsSummary.getExample();
        OASBusinessMemberAssetsSummary businessMemberAssetsSummary2 = new OASBusinessMemberAssetsSummary();

        System.assertEquals(false, businessMemberAssetsSummary1.equals('foo'));
        System.assertEquals(false, businessMemberAssetsSummary2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBusinessMemberAssetsSummary businessMemberAssetsSummary1 = OASBusinessMemberAssetsSummary.getExample();
        OASBusinessMemberAssetsSummary businessMemberAssetsSummary2 = new OASBusinessMemberAssetsSummary();
        OASBusinessMemberAssetsSummary businessMemberAssetsSummary3;

        System.assertEquals(false, businessMemberAssetsSummary1.equals(businessMemberAssetsSummary3));
        System.assertEquals(false, businessMemberAssetsSummary2.equals(businessMemberAssetsSummary3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBusinessMemberAssetsSummary businessMemberAssetsSummary1 = OASBusinessMemberAssetsSummary.getExample();
        OASBusinessMemberAssetsSummary businessMemberAssetsSummary2 = new OASBusinessMemberAssetsSummary();

        System.assertEquals(businessMemberAssetsSummary1.hashCode(), businessMemberAssetsSummary1.hashCode());
        System.assertEquals(businessMemberAssetsSummary2.hashCode(), businessMemberAssetsSummary2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBusinessMemberAssetsSummary businessMemberAssetsSummary1 = OASBusinessMemberAssetsSummary.getExample();
        OASBusinessMemberAssetsSummary businessMemberAssetsSummary2 = OASBusinessMemberAssetsSummary.getExample();
        OASBusinessMemberAssetsSummary businessMemberAssetsSummary3 = new OASBusinessMemberAssetsSummary();
        OASBusinessMemberAssetsSummary businessMemberAssetsSummary4 = new OASBusinessMemberAssetsSummary();

        System.assert(businessMemberAssetsSummary1.equals(businessMemberAssetsSummary2));
        System.assert(businessMemberAssetsSummary3.equals(businessMemberAssetsSummary4));
        System.assertEquals(businessMemberAssetsSummary1.hashCode(), businessMemberAssetsSummary2.hashCode());
        System.assertEquals(businessMemberAssetsSummary3.hashCode(), businessMemberAssetsSummary4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASBusinessMemberAssetsSummary businessMemberAssetsSummary = new OASBusinessMemberAssetsSummary();
        Map<String, String> x-property-mappings = businessMemberAssetsSummary.getx-property-mappings();
        System.assertEquals('adAccounts', x-property-mappings.get('ad_accounts'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASBusinessMemberAssetsSummary businessMemberAssetsSummary = new OASBusinessMemberAssetsSummary();
        System.assertEquals(new List<OASBusinessMemberAssetsSummaryAdAcco>(), businessMemberAssetsSummary.adAccounts);
        System.assertEquals(new List<OASBusinessMemberAssetsSummaryProfil>(), businessMemberAssetsSummary.profiles);
    }
}
