@isTest
private class OASBusinessMembersAssetAccessDeleteRTest {
    @isTest
    private static void equalsSameInstance() {
        OASBusinessMembersAssetAccessDeleteR businessMembersAssetAccessDeleteRequest1 = OASBusinessMembersAssetAccessDeleteR.getExample();
        OASBusinessMembersAssetAccessDeleteR businessMembersAssetAccessDeleteRequest2 = businessMembersAssetAccessDeleteRequest1;
        OASBusinessMembersAssetAccessDeleteR businessMembersAssetAccessDeleteRequest3 = new OASBusinessMembersAssetAccessDeleteR();
        OASBusinessMembersAssetAccessDeleteR businessMembersAssetAccessDeleteRequest4 = businessMembersAssetAccessDeleteRequest3;

        System.assert(businessMembersAssetAccessDeleteRequest1.equals(businessMembersAssetAccessDeleteRequest2));
        System.assert(businessMembersAssetAccessDeleteRequest2.equals(businessMembersAssetAccessDeleteRequest1));
        System.assert(businessMembersAssetAccessDeleteRequest1.equals(businessMembersAssetAccessDeleteRequest1));
        System.assert(businessMembersAssetAccessDeleteRequest3.equals(businessMembersAssetAccessDeleteRequest4));
        System.assert(businessMembersAssetAccessDeleteRequest4.equals(businessMembersAssetAccessDeleteRequest3));
        System.assert(businessMembersAssetAccessDeleteRequest3.equals(businessMembersAssetAccessDeleteRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBusinessMembersAssetAccessDeleteR businessMembersAssetAccessDeleteRequest1 = OASBusinessMembersAssetAccessDeleteR.getExample();
        OASBusinessMembersAssetAccessDeleteR businessMembersAssetAccessDeleteRequest2 = OASBusinessMembersAssetAccessDeleteR.getExample();
        OASBusinessMembersAssetAccessDeleteR businessMembersAssetAccessDeleteRequest3 = new OASBusinessMembersAssetAccessDeleteR();
        OASBusinessMembersAssetAccessDeleteR businessMembersAssetAccessDeleteRequest4 = new OASBusinessMembersAssetAccessDeleteR();

        System.assert(businessMembersAssetAccessDeleteRequest1.equals(businessMembersAssetAccessDeleteRequest2));
        System.assert(businessMembersAssetAccessDeleteRequest2.equals(businessMembersAssetAccessDeleteRequest1));
        System.assert(businessMembersAssetAccessDeleteRequest3.equals(businessMembersAssetAccessDeleteRequest4));
        System.assert(businessMembersAssetAccessDeleteRequest4.equals(businessMembersAssetAccessDeleteRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBusinessMembersAssetAccessDeleteR businessMembersAssetAccessDeleteRequest1 = OASBusinessMembersAssetAccessDeleteR.getExample();
        OASBusinessMembersAssetAccessDeleteR businessMembersAssetAccessDeleteRequest2 = new OASBusinessMembersAssetAccessDeleteR();

        System.assertEquals(false, businessMembersAssetAccessDeleteRequest1.equals('foo'));
        System.assertEquals(false, businessMembersAssetAccessDeleteRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBusinessMembersAssetAccessDeleteR businessMembersAssetAccessDeleteRequest1 = OASBusinessMembersAssetAccessDeleteR.getExample();
        OASBusinessMembersAssetAccessDeleteR businessMembersAssetAccessDeleteRequest2 = new OASBusinessMembersAssetAccessDeleteR();
        OASBusinessMembersAssetAccessDeleteR businessMembersAssetAccessDeleteRequest3;

        System.assertEquals(false, businessMembersAssetAccessDeleteRequest1.equals(businessMembersAssetAccessDeleteRequest3));
        System.assertEquals(false, businessMembersAssetAccessDeleteRequest2.equals(businessMembersAssetAccessDeleteRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBusinessMembersAssetAccessDeleteR businessMembersAssetAccessDeleteRequest1 = OASBusinessMembersAssetAccessDeleteR.getExample();
        OASBusinessMembersAssetAccessDeleteR businessMembersAssetAccessDeleteRequest2 = new OASBusinessMembersAssetAccessDeleteR();

        System.assertEquals(businessMembersAssetAccessDeleteRequest1.hashCode(), businessMembersAssetAccessDeleteRequest1.hashCode());
        System.assertEquals(businessMembersAssetAccessDeleteRequest2.hashCode(), businessMembersAssetAccessDeleteRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBusinessMembersAssetAccessDeleteR businessMembersAssetAccessDeleteRequest1 = OASBusinessMembersAssetAccessDeleteR.getExample();
        OASBusinessMembersAssetAccessDeleteR businessMembersAssetAccessDeleteRequest2 = OASBusinessMembersAssetAccessDeleteR.getExample();
        OASBusinessMembersAssetAccessDeleteR businessMembersAssetAccessDeleteRequest3 = new OASBusinessMembersAssetAccessDeleteR();
        OASBusinessMembersAssetAccessDeleteR businessMembersAssetAccessDeleteRequest4 = new OASBusinessMembersAssetAccessDeleteR();

        System.assert(businessMembersAssetAccessDeleteRequest1.equals(businessMembersAssetAccessDeleteRequest2));
        System.assert(businessMembersAssetAccessDeleteRequest3.equals(businessMembersAssetAccessDeleteRequest4));
        System.assertEquals(businessMembersAssetAccessDeleteRequest1.hashCode(), businessMembersAssetAccessDeleteRequest2.hashCode());
        System.assertEquals(businessMembersAssetAccessDeleteRequest3.hashCode(), businessMembersAssetAccessDeleteRequest4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASBusinessMembersAssetAccessDeleteR businessMembersAssetAccessDeleteRequest = new OASBusinessMembersAssetAccessDeleteR();
        System.assertEquals(new List<OASBusinessMembersAssetAccessDeleteR>(), businessMembersAssetAccessDeleteRequest.accesses);
    }
}
