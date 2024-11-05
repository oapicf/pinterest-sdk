@isTest
private class OASDeletePartnerAssetAccessBodyTest {
    @isTest
    private static void equalsSameInstance() {
        OASDeletePartnerAssetAccessBody deletePartnerAssetAccessBody1 = OASDeletePartnerAssetAccessBody.getExample();
        OASDeletePartnerAssetAccessBody deletePartnerAssetAccessBody2 = deletePartnerAssetAccessBody1;
        OASDeletePartnerAssetAccessBody deletePartnerAssetAccessBody3 = new OASDeletePartnerAssetAccessBody();
        OASDeletePartnerAssetAccessBody deletePartnerAssetAccessBody4 = deletePartnerAssetAccessBody3;

        System.assert(deletePartnerAssetAccessBody1.equals(deletePartnerAssetAccessBody2));
        System.assert(deletePartnerAssetAccessBody2.equals(deletePartnerAssetAccessBody1));
        System.assert(deletePartnerAssetAccessBody1.equals(deletePartnerAssetAccessBody1));
        System.assert(deletePartnerAssetAccessBody3.equals(deletePartnerAssetAccessBody4));
        System.assert(deletePartnerAssetAccessBody4.equals(deletePartnerAssetAccessBody3));
        System.assert(deletePartnerAssetAccessBody3.equals(deletePartnerAssetAccessBody3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDeletePartnerAssetAccessBody deletePartnerAssetAccessBody1 = OASDeletePartnerAssetAccessBody.getExample();
        OASDeletePartnerAssetAccessBody deletePartnerAssetAccessBody2 = OASDeletePartnerAssetAccessBody.getExample();
        OASDeletePartnerAssetAccessBody deletePartnerAssetAccessBody3 = new OASDeletePartnerAssetAccessBody();
        OASDeletePartnerAssetAccessBody deletePartnerAssetAccessBody4 = new OASDeletePartnerAssetAccessBody();

        System.assert(deletePartnerAssetAccessBody1.equals(deletePartnerAssetAccessBody2));
        System.assert(deletePartnerAssetAccessBody2.equals(deletePartnerAssetAccessBody1));
        System.assert(deletePartnerAssetAccessBody3.equals(deletePartnerAssetAccessBody4));
        System.assert(deletePartnerAssetAccessBody4.equals(deletePartnerAssetAccessBody3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDeletePartnerAssetAccessBody deletePartnerAssetAccessBody1 = OASDeletePartnerAssetAccessBody.getExample();
        OASDeletePartnerAssetAccessBody deletePartnerAssetAccessBody2 = new OASDeletePartnerAssetAccessBody();

        System.assertEquals(false, deletePartnerAssetAccessBody1.equals('foo'));
        System.assertEquals(false, deletePartnerAssetAccessBody2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDeletePartnerAssetAccessBody deletePartnerAssetAccessBody1 = OASDeletePartnerAssetAccessBody.getExample();
        OASDeletePartnerAssetAccessBody deletePartnerAssetAccessBody2 = new OASDeletePartnerAssetAccessBody();
        OASDeletePartnerAssetAccessBody deletePartnerAssetAccessBody3;

        System.assertEquals(false, deletePartnerAssetAccessBody1.equals(deletePartnerAssetAccessBody3));
        System.assertEquals(false, deletePartnerAssetAccessBody2.equals(deletePartnerAssetAccessBody3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDeletePartnerAssetAccessBody deletePartnerAssetAccessBody1 = OASDeletePartnerAssetAccessBody.getExample();
        OASDeletePartnerAssetAccessBody deletePartnerAssetAccessBody2 = new OASDeletePartnerAssetAccessBody();

        System.assertEquals(deletePartnerAssetAccessBody1.hashCode(), deletePartnerAssetAccessBody1.hashCode());
        System.assertEquals(deletePartnerAssetAccessBody2.hashCode(), deletePartnerAssetAccessBody2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDeletePartnerAssetAccessBody deletePartnerAssetAccessBody1 = OASDeletePartnerAssetAccessBody.getExample();
        OASDeletePartnerAssetAccessBody deletePartnerAssetAccessBody2 = OASDeletePartnerAssetAccessBody.getExample();
        OASDeletePartnerAssetAccessBody deletePartnerAssetAccessBody3 = new OASDeletePartnerAssetAccessBody();
        OASDeletePartnerAssetAccessBody deletePartnerAssetAccessBody4 = new OASDeletePartnerAssetAccessBody();

        System.assert(deletePartnerAssetAccessBody1.equals(deletePartnerAssetAccessBody2));
        System.assert(deletePartnerAssetAccessBody3.equals(deletePartnerAssetAccessBody4));
        System.assertEquals(deletePartnerAssetAccessBody1.hashCode(), deletePartnerAssetAccessBody2.hashCode());
        System.assertEquals(deletePartnerAssetAccessBody3.hashCode(), deletePartnerAssetAccessBody4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASDeletePartnerAssetAccessBody deletePartnerAssetAccessBody = new OASDeletePartnerAssetAccessBody();
        System.assertEquals(new List<OASDeletePartnerAssetAccessBodyAcces>(), deletePartnerAssetAccessBody.accesses);
    }
}
