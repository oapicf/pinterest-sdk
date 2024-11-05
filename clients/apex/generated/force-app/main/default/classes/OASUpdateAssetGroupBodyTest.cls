@isTest
private class OASUpdateAssetGroupBodyTest {
    @isTest
    private static void equalsSameInstance() {
        OASUpdateAssetGroupBody updateAssetGroupBody1 = OASUpdateAssetGroupBody.getExample();
        OASUpdateAssetGroupBody updateAssetGroupBody2 = updateAssetGroupBody1;
        OASUpdateAssetGroupBody updateAssetGroupBody3 = new OASUpdateAssetGroupBody();
        OASUpdateAssetGroupBody updateAssetGroupBody4 = updateAssetGroupBody3;

        System.assert(updateAssetGroupBody1.equals(updateAssetGroupBody2));
        System.assert(updateAssetGroupBody2.equals(updateAssetGroupBody1));
        System.assert(updateAssetGroupBody1.equals(updateAssetGroupBody1));
        System.assert(updateAssetGroupBody3.equals(updateAssetGroupBody4));
        System.assert(updateAssetGroupBody4.equals(updateAssetGroupBody3));
        System.assert(updateAssetGroupBody3.equals(updateAssetGroupBody3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUpdateAssetGroupBody updateAssetGroupBody1 = OASUpdateAssetGroupBody.getExample();
        OASUpdateAssetGroupBody updateAssetGroupBody2 = OASUpdateAssetGroupBody.getExample();
        OASUpdateAssetGroupBody updateAssetGroupBody3 = new OASUpdateAssetGroupBody();
        OASUpdateAssetGroupBody updateAssetGroupBody4 = new OASUpdateAssetGroupBody();

        System.assert(updateAssetGroupBody1.equals(updateAssetGroupBody2));
        System.assert(updateAssetGroupBody2.equals(updateAssetGroupBody1));
        System.assert(updateAssetGroupBody3.equals(updateAssetGroupBody4));
        System.assert(updateAssetGroupBody4.equals(updateAssetGroupBody3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUpdateAssetGroupBody updateAssetGroupBody1 = OASUpdateAssetGroupBody.getExample();
        OASUpdateAssetGroupBody updateAssetGroupBody2 = new OASUpdateAssetGroupBody();

        System.assertEquals(false, updateAssetGroupBody1.equals('foo'));
        System.assertEquals(false, updateAssetGroupBody2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUpdateAssetGroupBody updateAssetGroupBody1 = OASUpdateAssetGroupBody.getExample();
        OASUpdateAssetGroupBody updateAssetGroupBody2 = new OASUpdateAssetGroupBody();
        OASUpdateAssetGroupBody updateAssetGroupBody3;

        System.assertEquals(false, updateAssetGroupBody1.equals(updateAssetGroupBody3));
        System.assertEquals(false, updateAssetGroupBody2.equals(updateAssetGroupBody3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUpdateAssetGroupBody updateAssetGroupBody1 = OASUpdateAssetGroupBody.getExample();
        OASUpdateAssetGroupBody updateAssetGroupBody2 = new OASUpdateAssetGroupBody();

        System.assertEquals(updateAssetGroupBody1.hashCode(), updateAssetGroupBody1.hashCode());
        System.assertEquals(updateAssetGroupBody2.hashCode(), updateAssetGroupBody2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUpdateAssetGroupBody updateAssetGroupBody1 = OASUpdateAssetGroupBody.getExample();
        OASUpdateAssetGroupBody updateAssetGroupBody2 = OASUpdateAssetGroupBody.getExample();
        OASUpdateAssetGroupBody updateAssetGroupBody3 = new OASUpdateAssetGroupBody();
        OASUpdateAssetGroupBody updateAssetGroupBody4 = new OASUpdateAssetGroupBody();

        System.assert(updateAssetGroupBody1.equals(updateAssetGroupBody2));
        System.assert(updateAssetGroupBody3.equals(updateAssetGroupBody4));
        System.assertEquals(updateAssetGroupBody1.hashCode(), updateAssetGroupBody2.hashCode());
        System.assertEquals(updateAssetGroupBody3.hashCode(), updateAssetGroupBody4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASUpdateAssetGroupBody updateAssetGroupBody = new OASUpdateAssetGroupBody();
        Map<String, String> x-property-mappings = updateAssetGroupBody.getx-property-mappings();
        System.assertEquals('assetGroupsToUpdate', x-property-mappings.get('asset_groups_to_update'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASUpdateAssetGroupBody updateAssetGroupBody = new OASUpdateAssetGroupBody();
        System.assertEquals(new List<OASUpdateAssetGroupBodyAssetGroupsTo>(), updateAssetGroupBody.assetGroupsToUpdate);
    }
}
