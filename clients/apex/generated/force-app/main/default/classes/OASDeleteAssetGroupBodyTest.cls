@isTest
private class OASDeleteAssetGroupBodyTest {
    @isTest
    private static void equalsSameInstance() {
        OASDeleteAssetGroupBody deleteAssetGroupBody1 = OASDeleteAssetGroupBody.getExample();
        OASDeleteAssetGroupBody deleteAssetGroupBody2 = deleteAssetGroupBody1;
        OASDeleteAssetGroupBody deleteAssetGroupBody3 = new OASDeleteAssetGroupBody();
        OASDeleteAssetGroupBody deleteAssetGroupBody4 = deleteAssetGroupBody3;

        System.assert(deleteAssetGroupBody1.equals(deleteAssetGroupBody2));
        System.assert(deleteAssetGroupBody2.equals(deleteAssetGroupBody1));
        System.assert(deleteAssetGroupBody1.equals(deleteAssetGroupBody1));
        System.assert(deleteAssetGroupBody3.equals(deleteAssetGroupBody4));
        System.assert(deleteAssetGroupBody4.equals(deleteAssetGroupBody3));
        System.assert(deleteAssetGroupBody3.equals(deleteAssetGroupBody3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDeleteAssetGroupBody deleteAssetGroupBody1 = OASDeleteAssetGroupBody.getExample();
        OASDeleteAssetGroupBody deleteAssetGroupBody2 = OASDeleteAssetGroupBody.getExample();
        OASDeleteAssetGroupBody deleteAssetGroupBody3 = new OASDeleteAssetGroupBody();
        OASDeleteAssetGroupBody deleteAssetGroupBody4 = new OASDeleteAssetGroupBody();

        System.assert(deleteAssetGroupBody1.equals(deleteAssetGroupBody2));
        System.assert(deleteAssetGroupBody2.equals(deleteAssetGroupBody1));
        System.assert(deleteAssetGroupBody3.equals(deleteAssetGroupBody4));
        System.assert(deleteAssetGroupBody4.equals(deleteAssetGroupBody3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDeleteAssetGroupBody deleteAssetGroupBody1 = OASDeleteAssetGroupBody.getExample();
        OASDeleteAssetGroupBody deleteAssetGroupBody2 = new OASDeleteAssetGroupBody();

        System.assertEquals(false, deleteAssetGroupBody1.equals('foo'));
        System.assertEquals(false, deleteAssetGroupBody2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDeleteAssetGroupBody deleteAssetGroupBody1 = OASDeleteAssetGroupBody.getExample();
        OASDeleteAssetGroupBody deleteAssetGroupBody2 = new OASDeleteAssetGroupBody();
        OASDeleteAssetGroupBody deleteAssetGroupBody3;

        System.assertEquals(false, deleteAssetGroupBody1.equals(deleteAssetGroupBody3));
        System.assertEquals(false, deleteAssetGroupBody2.equals(deleteAssetGroupBody3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDeleteAssetGroupBody deleteAssetGroupBody1 = OASDeleteAssetGroupBody.getExample();
        OASDeleteAssetGroupBody deleteAssetGroupBody2 = new OASDeleteAssetGroupBody();

        System.assertEquals(deleteAssetGroupBody1.hashCode(), deleteAssetGroupBody1.hashCode());
        System.assertEquals(deleteAssetGroupBody2.hashCode(), deleteAssetGroupBody2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDeleteAssetGroupBody deleteAssetGroupBody1 = OASDeleteAssetGroupBody.getExample();
        OASDeleteAssetGroupBody deleteAssetGroupBody2 = OASDeleteAssetGroupBody.getExample();
        OASDeleteAssetGroupBody deleteAssetGroupBody3 = new OASDeleteAssetGroupBody();
        OASDeleteAssetGroupBody deleteAssetGroupBody4 = new OASDeleteAssetGroupBody();

        System.assert(deleteAssetGroupBody1.equals(deleteAssetGroupBody2));
        System.assert(deleteAssetGroupBody3.equals(deleteAssetGroupBody4));
        System.assertEquals(deleteAssetGroupBody1.hashCode(), deleteAssetGroupBody2.hashCode());
        System.assertEquals(deleteAssetGroupBody3.hashCode(), deleteAssetGroupBody4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASDeleteAssetGroupBody deleteAssetGroupBody = new OASDeleteAssetGroupBody();
        Map<String, String> x-property-mappings = deleteAssetGroupBody.getx-property-mappings();
        System.assertEquals('assetGroupsToDelete', x-property-mappings.get('asset_groups_to_delete'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASDeleteAssetGroupBody deleteAssetGroupBody = new OASDeleteAssetGroupBody();
        System.assertEquals(new List<String>(), deleteAssetGroupBody.assetGroupsToDelete);
    }
}
