@isTest
private class OASUpdateMemberAssetAccessBodyTest {
    @isTest
    private static void equalsSameInstance() {
        OASUpdateMemberAssetAccessBody updateMemberAssetAccessBody1 = OASUpdateMemberAssetAccessBody.getExample();
        OASUpdateMemberAssetAccessBody updateMemberAssetAccessBody2 = updateMemberAssetAccessBody1;
        OASUpdateMemberAssetAccessBody updateMemberAssetAccessBody3 = new OASUpdateMemberAssetAccessBody();
        OASUpdateMemberAssetAccessBody updateMemberAssetAccessBody4 = updateMemberAssetAccessBody3;

        System.assert(updateMemberAssetAccessBody1.equals(updateMemberAssetAccessBody2));
        System.assert(updateMemberAssetAccessBody2.equals(updateMemberAssetAccessBody1));
        System.assert(updateMemberAssetAccessBody1.equals(updateMemberAssetAccessBody1));
        System.assert(updateMemberAssetAccessBody3.equals(updateMemberAssetAccessBody4));
        System.assert(updateMemberAssetAccessBody4.equals(updateMemberAssetAccessBody3));
        System.assert(updateMemberAssetAccessBody3.equals(updateMemberAssetAccessBody3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUpdateMemberAssetAccessBody updateMemberAssetAccessBody1 = OASUpdateMemberAssetAccessBody.getExample();
        OASUpdateMemberAssetAccessBody updateMemberAssetAccessBody2 = OASUpdateMemberAssetAccessBody.getExample();
        OASUpdateMemberAssetAccessBody updateMemberAssetAccessBody3 = new OASUpdateMemberAssetAccessBody();
        OASUpdateMemberAssetAccessBody updateMemberAssetAccessBody4 = new OASUpdateMemberAssetAccessBody();

        System.assert(updateMemberAssetAccessBody1.equals(updateMemberAssetAccessBody2));
        System.assert(updateMemberAssetAccessBody2.equals(updateMemberAssetAccessBody1));
        System.assert(updateMemberAssetAccessBody3.equals(updateMemberAssetAccessBody4));
        System.assert(updateMemberAssetAccessBody4.equals(updateMemberAssetAccessBody3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUpdateMemberAssetAccessBody updateMemberAssetAccessBody1 = OASUpdateMemberAssetAccessBody.getExample();
        OASUpdateMemberAssetAccessBody updateMemberAssetAccessBody2 = new OASUpdateMemberAssetAccessBody();

        System.assertEquals(false, updateMemberAssetAccessBody1.equals('foo'));
        System.assertEquals(false, updateMemberAssetAccessBody2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUpdateMemberAssetAccessBody updateMemberAssetAccessBody1 = OASUpdateMemberAssetAccessBody.getExample();
        OASUpdateMemberAssetAccessBody updateMemberAssetAccessBody2 = new OASUpdateMemberAssetAccessBody();
        OASUpdateMemberAssetAccessBody updateMemberAssetAccessBody3;

        System.assertEquals(false, updateMemberAssetAccessBody1.equals(updateMemberAssetAccessBody3));
        System.assertEquals(false, updateMemberAssetAccessBody2.equals(updateMemberAssetAccessBody3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUpdateMemberAssetAccessBody updateMemberAssetAccessBody1 = OASUpdateMemberAssetAccessBody.getExample();
        OASUpdateMemberAssetAccessBody updateMemberAssetAccessBody2 = new OASUpdateMemberAssetAccessBody();

        System.assertEquals(updateMemberAssetAccessBody1.hashCode(), updateMemberAssetAccessBody1.hashCode());
        System.assertEquals(updateMemberAssetAccessBody2.hashCode(), updateMemberAssetAccessBody2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUpdateMemberAssetAccessBody updateMemberAssetAccessBody1 = OASUpdateMemberAssetAccessBody.getExample();
        OASUpdateMemberAssetAccessBody updateMemberAssetAccessBody2 = OASUpdateMemberAssetAccessBody.getExample();
        OASUpdateMemberAssetAccessBody updateMemberAssetAccessBody3 = new OASUpdateMemberAssetAccessBody();
        OASUpdateMemberAssetAccessBody updateMemberAssetAccessBody4 = new OASUpdateMemberAssetAccessBody();

        System.assert(updateMemberAssetAccessBody1.equals(updateMemberAssetAccessBody2));
        System.assert(updateMemberAssetAccessBody3.equals(updateMemberAssetAccessBody4));
        System.assertEquals(updateMemberAssetAccessBody1.hashCode(), updateMemberAssetAccessBody2.hashCode());
        System.assertEquals(updateMemberAssetAccessBody3.hashCode(), updateMemberAssetAccessBody4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASUpdateMemberAssetAccessBody updateMemberAssetAccessBody = new OASUpdateMemberAssetAccessBody();
        System.assertEquals(new List<OASUpdateMemberAssetAccessBodyAccess>(), updateMemberAssetAccessBody.accesses);
    }
}
