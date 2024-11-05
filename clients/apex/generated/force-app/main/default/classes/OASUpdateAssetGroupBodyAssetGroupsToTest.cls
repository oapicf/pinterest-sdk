@isTest
private class OASUpdateAssetGroupBodyAssetGroupsToTest {
    @isTest
    private static void equalsSameInstance() {
        OASUpdateAssetGroupBodyAssetGroupsTo updateAssetGroupBodyAssetGroupsToUpdateInner1 = OASUpdateAssetGroupBodyAssetGroupsTo.getExample();
        OASUpdateAssetGroupBodyAssetGroupsTo updateAssetGroupBodyAssetGroupsToUpdateInner2 = updateAssetGroupBodyAssetGroupsToUpdateInner1;
        OASUpdateAssetGroupBodyAssetGroupsTo updateAssetGroupBodyAssetGroupsToUpdateInner3 = new OASUpdateAssetGroupBodyAssetGroupsTo();
        OASUpdateAssetGroupBodyAssetGroupsTo updateAssetGroupBodyAssetGroupsToUpdateInner4 = updateAssetGroupBodyAssetGroupsToUpdateInner3;

        System.assert(updateAssetGroupBodyAssetGroupsToUpdateInner1.equals(updateAssetGroupBodyAssetGroupsToUpdateInner2));
        System.assert(updateAssetGroupBodyAssetGroupsToUpdateInner2.equals(updateAssetGroupBodyAssetGroupsToUpdateInner1));
        System.assert(updateAssetGroupBodyAssetGroupsToUpdateInner1.equals(updateAssetGroupBodyAssetGroupsToUpdateInner1));
        System.assert(updateAssetGroupBodyAssetGroupsToUpdateInner3.equals(updateAssetGroupBodyAssetGroupsToUpdateInner4));
        System.assert(updateAssetGroupBodyAssetGroupsToUpdateInner4.equals(updateAssetGroupBodyAssetGroupsToUpdateInner3));
        System.assert(updateAssetGroupBodyAssetGroupsToUpdateInner3.equals(updateAssetGroupBodyAssetGroupsToUpdateInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUpdateAssetGroupBodyAssetGroupsTo updateAssetGroupBodyAssetGroupsToUpdateInner1 = OASUpdateAssetGroupBodyAssetGroupsTo.getExample();
        OASUpdateAssetGroupBodyAssetGroupsTo updateAssetGroupBodyAssetGroupsToUpdateInner2 = OASUpdateAssetGroupBodyAssetGroupsTo.getExample();
        OASUpdateAssetGroupBodyAssetGroupsTo updateAssetGroupBodyAssetGroupsToUpdateInner3 = new OASUpdateAssetGroupBodyAssetGroupsTo();
        OASUpdateAssetGroupBodyAssetGroupsTo updateAssetGroupBodyAssetGroupsToUpdateInner4 = new OASUpdateAssetGroupBodyAssetGroupsTo();

        System.assert(updateAssetGroupBodyAssetGroupsToUpdateInner1.equals(updateAssetGroupBodyAssetGroupsToUpdateInner2));
        System.assert(updateAssetGroupBodyAssetGroupsToUpdateInner2.equals(updateAssetGroupBodyAssetGroupsToUpdateInner1));
        System.assert(updateAssetGroupBodyAssetGroupsToUpdateInner3.equals(updateAssetGroupBodyAssetGroupsToUpdateInner4));
        System.assert(updateAssetGroupBodyAssetGroupsToUpdateInner4.equals(updateAssetGroupBodyAssetGroupsToUpdateInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUpdateAssetGroupBodyAssetGroupsTo updateAssetGroupBodyAssetGroupsToUpdateInner1 = OASUpdateAssetGroupBodyAssetGroupsTo.getExample();
        OASUpdateAssetGroupBodyAssetGroupsTo updateAssetGroupBodyAssetGroupsToUpdateInner2 = new OASUpdateAssetGroupBodyAssetGroupsTo();

        System.assertEquals(false, updateAssetGroupBodyAssetGroupsToUpdateInner1.equals('foo'));
        System.assertEquals(false, updateAssetGroupBodyAssetGroupsToUpdateInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUpdateAssetGroupBodyAssetGroupsTo updateAssetGroupBodyAssetGroupsToUpdateInner1 = OASUpdateAssetGroupBodyAssetGroupsTo.getExample();
        OASUpdateAssetGroupBodyAssetGroupsTo updateAssetGroupBodyAssetGroupsToUpdateInner2 = new OASUpdateAssetGroupBodyAssetGroupsTo();
        OASUpdateAssetGroupBodyAssetGroupsTo updateAssetGroupBodyAssetGroupsToUpdateInner3;

        System.assertEquals(false, updateAssetGroupBodyAssetGroupsToUpdateInner1.equals(updateAssetGroupBodyAssetGroupsToUpdateInner3));
        System.assertEquals(false, updateAssetGroupBodyAssetGroupsToUpdateInner2.equals(updateAssetGroupBodyAssetGroupsToUpdateInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUpdateAssetGroupBodyAssetGroupsTo updateAssetGroupBodyAssetGroupsToUpdateInner1 = OASUpdateAssetGroupBodyAssetGroupsTo.getExample();
        OASUpdateAssetGroupBodyAssetGroupsTo updateAssetGroupBodyAssetGroupsToUpdateInner2 = new OASUpdateAssetGroupBodyAssetGroupsTo();

        System.assertEquals(updateAssetGroupBodyAssetGroupsToUpdateInner1.hashCode(), updateAssetGroupBodyAssetGroupsToUpdateInner1.hashCode());
        System.assertEquals(updateAssetGroupBodyAssetGroupsToUpdateInner2.hashCode(), updateAssetGroupBodyAssetGroupsToUpdateInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUpdateAssetGroupBodyAssetGroupsTo updateAssetGroupBodyAssetGroupsToUpdateInner1 = OASUpdateAssetGroupBodyAssetGroupsTo.getExample();
        OASUpdateAssetGroupBodyAssetGroupsTo updateAssetGroupBodyAssetGroupsToUpdateInner2 = OASUpdateAssetGroupBodyAssetGroupsTo.getExample();
        OASUpdateAssetGroupBodyAssetGroupsTo updateAssetGroupBodyAssetGroupsToUpdateInner3 = new OASUpdateAssetGroupBodyAssetGroupsTo();
        OASUpdateAssetGroupBodyAssetGroupsTo updateAssetGroupBodyAssetGroupsToUpdateInner4 = new OASUpdateAssetGroupBodyAssetGroupsTo();

        System.assert(updateAssetGroupBodyAssetGroupsToUpdateInner1.equals(updateAssetGroupBodyAssetGroupsToUpdateInner2));
        System.assert(updateAssetGroupBodyAssetGroupsToUpdateInner3.equals(updateAssetGroupBodyAssetGroupsToUpdateInner4));
        System.assertEquals(updateAssetGroupBodyAssetGroupsToUpdateInner1.hashCode(), updateAssetGroupBodyAssetGroupsToUpdateInner2.hashCode());
        System.assertEquals(updateAssetGroupBodyAssetGroupsToUpdateInner3.hashCode(), updateAssetGroupBodyAssetGroupsToUpdateInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASUpdateAssetGroupBodyAssetGroupsTo updateAssetGroupBodyAssetGroupsToUpdateInner = new OASUpdateAssetGroupBodyAssetGroupsTo();
        Map<String, String> x-property-mappings = updateAssetGroupBodyAssetGroupsToUpdateInner.getx-property-mappings();
        System.assertEquals('assetGroupId', x-property-mappings.get('asset_group_id'));
        System.assertEquals('assetGroupTypes', x-property-mappings.get('asset_group_types'));
        System.assertEquals('assetsToAdd', x-property-mappings.get('assets_to_add'));
        System.assertEquals('assetsToRemove', x-property-mappings.get('assets_to_remove'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASUpdateAssetGroupBodyAssetGroupsTo updateAssetGroupBodyAssetGroupsToUpdateInner = new OASUpdateAssetGroupBodyAssetGroupsTo();
        System.assertEquals(new List<OASAssetGroupType>(), updateAssetGroupBodyAssetGroupsToUpdateInner.assetGroupTypes);
        System.assertEquals(new List<String>(), updateAssetGroupBodyAssetGroupsToUpdateInner.assetsToAdd);
        System.assertEquals(new List<String>(), updateAssetGroupBodyAssetGroupsToUpdateInner.assetsToRemove);
        System.assertEquals(null, updateAssetGroupBodyAssetGroupsToUpdateInner.assetGroupId);
        System.assertEquals(null, updateAssetGroupBodyAssetGroupsToUpdateInner.name);
        System.assertEquals(null, updateAssetGroupBodyAssetGroupsToUpdateInner.description);
    }
}
