@isTest
private class OASUpdatePartnerAssetAccessBodyTest {
    @isTest
    private static void equalsSameInstance() {
        OASUpdatePartnerAssetAccessBody updatePartnerAssetAccessBody1 = OASUpdatePartnerAssetAccessBody.getExample();
        OASUpdatePartnerAssetAccessBody updatePartnerAssetAccessBody2 = updatePartnerAssetAccessBody1;
        OASUpdatePartnerAssetAccessBody updatePartnerAssetAccessBody3 = new OASUpdatePartnerAssetAccessBody();
        OASUpdatePartnerAssetAccessBody updatePartnerAssetAccessBody4 = updatePartnerAssetAccessBody3;

        System.assert(updatePartnerAssetAccessBody1.equals(updatePartnerAssetAccessBody2));
        System.assert(updatePartnerAssetAccessBody2.equals(updatePartnerAssetAccessBody1));
        System.assert(updatePartnerAssetAccessBody1.equals(updatePartnerAssetAccessBody1));
        System.assert(updatePartnerAssetAccessBody3.equals(updatePartnerAssetAccessBody4));
        System.assert(updatePartnerAssetAccessBody4.equals(updatePartnerAssetAccessBody3));
        System.assert(updatePartnerAssetAccessBody3.equals(updatePartnerAssetAccessBody3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUpdatePartnerAssetAccessBody updatePartnerAssetAccessBody1 = OASUpdatePartnerAssetAccessBody.getExample();
        OASUpdatePartnerAssetAccessBody updatePartnerAssetAccessBody2 = OASUpdatePartnerAssetAccessBody.getExample();
        OASUpdatePartnerAssetAccessBody updatePartnerAssetAccessBody3 = new OASUpdatePartnerAssetAccessBody();
        OASUpdatePartnerAssetAccessBody updatePartnerAssetAccessBody4 = new OASUpdatePartnerAssetAccessBody();

        System.assert(updatePartnerAssetAccessBody1.equals(updatePartnerAssetAccessBody2));
        System.assert(updatePartnerAssetAccessBody2.equals(updatePartnerAssetAccessBody1));
        System.assert(updatePartnerAssetAccessBody3.equals(updatePartnerAssetAccessBody4));
        System.assert(updatePartnerAssetAccessBody4.equals(updatePartnerAssetAccessBody3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUpdatePartnerAssetAccessBody updatePartnerAssetAccessBody1 = OASUpdatePartnerAssetAccessBody.getExample();
        OASUpdatePartnerAssetAccessBody updatePartnerAssetAccessBody2 = new OASUpdatePartnerAssetAccessBody();

        System.assertEquals(false, updatePartnerAssetAccessBody1.equals('foo'));
        System.assertEquals(false, updatePartnerAssetAccessBody2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUpdatePartnerAssetAccessBody updatePartnerAssetAccessBody1 = OASUpdatePartnerAssetAccessBody.getExample();
        OASUpdatePartnerAssetAccessBody updatePartnerAssetAccessBody2 = new OASUpdatePartnerAssetAccessBody();
        OASUpdatePartnerAssetAccessBody updatePartnerAssetAccessBody3;

        System.assertEquals(false, updatePartnerAssetAccessBody1.equals(updatePartnerAssetAccessBody3));
        System.assertEquals(false, updatePartnerAssetAccessBody2.equals(updatePartnerAssetAccessBody3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUpdatePartnerAssetAccessBody updatePartnerAssetAccessBody1 = OASUpdatePartnerAssetAccessBody.getExample();
        OASUpdatePartnerAssetAccessBody updatePartnerAssetAccessBody2 = new OASUpdatePartnerAssetAccessBody();

        System.assertEquals(updatePartnerAssetAccessBody1.hashCode(), updatePartnerAssetAccessBody1.hashCode());
        System.assertEquals(updatePartnerAssetAccessBody2.hashCode(), updatePartnerAssetAccessBody2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUpdatePartnerAssetAccessBody updatePartnerAssetAccessBody1 = OASUpdatePartnerAssetAccessBody.getExample();
        OASUpdatePartnerAssetAccessBody updatePartnerAssetAccessBody2 = OASUpdatePartnerAssetAccessBody.getExample();
        OASUpdatePartnerAssetAccessBody updatePartnerAssetAccessBody3 = new OASUpdatePartnerAssetAccessBody();
        OASUpdatePartnerAssetAccessBody updatePartnerAssetAccessBody4 = new OASUpdatePartnerAssetAccessBody();

        System.assert(updatePartnerAssetAccessBody1.equals(updatePartnerAssetAccessBody2));
        System.assert(updatePartnerAssetAccessBody3.equals(updatePartnerAssetAccessBody4));
        System.assertEquals(updatePartnerAssetAccessBody1.hashCode(), updatePartnerAssetAccessBody2.hashCode());
        System.assertEquals(updatePartnerAssetAccessBody3.hashCode(), updatePartnerAssetAccessBody4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASUpdatePartnerAssetAccessBody updatePartnerAssetAccessBody = new OASUpdatePartnerAssetAccessBody();
        System.assertEquals(new List<OASUpdatePartnerAssetAccessBodyAcces>(), updatePartnerAssetAccessBody.accesses);
    }
}
