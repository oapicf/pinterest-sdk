@isTest
private class OASAssetGroupBindingTest {
    @isTest
    private static void equalsSameInstance() {
        OASAssetGroupBinding assetGroupBinding1 = OASAssetGroupBinding.getExample();
        OASAssetGroupBinding assetGroupBinding2 = assetGroupBinding1;
        OASAssetGroupBinding assetGroupBinding3 = new OASAssetGroupBinding();
        OASAssetGroupBinding assetGroupBinding4 = assetGroupBinding3;

        System.assert(assetGroupBinding1.equals(assetGroupBinding2));
        System.assert(assetGroupBinding2.equals(assetGroupBinding1));
        System.assert(assetGroupBinding1.equals(assetGroupBinding1));
        System.assert(assetGroupBinding3.equals(assetGroupBinding4));
        System.assert(assetGroupBinding4.equals(assetGroupBinding3));
        System.assert(assetGroupBinding3.equals(assetGroupBinding3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAssetGroupBinding assetGroupBinding1 = OASAssetGroupBinding.getExample();
        OASAssetGroupBinding assetGroupBinding2 = OASAssetGroupBinding.getExample();
        OASAssetGroupBinding assetGroupBinding3 = new OASAssetGroupBinding();
        OASAssetGroupBinding assetGroupBinding4 = new OASAssetGroupBinding();

        System.assert(assetGroupBinding1.equals(assetGroupBinding2));
        System.assert(assetGroupBinding2.equals(assetGroupBinding1));
        System.assert(assetGroupBinding3.equals(assetGroupBinding4));
        System.assert(assetGroupBinding4.equals(assetGroupBinding3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAssetGroupBinding assetGroupBinding1 = OASAssetGroupBinding.getExample();
        OASAssetGroupBinding assetGroupBinding2 = new OASAssetGroupBinding();

        System.assertEquals(false, assetGroupBinding1.equals('foo'));
        System.assertEquals(false, assetGroupBinding2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAssetGroupBinding assetGroupBinding1 = OASAssetGroupBinding.getExample();
        OASAssetGroupBinding assetGroupBinding2 = new OASAssetGroupBinding();
        OASAssetGroupBinding assetGroupBinding3;

        System.assertEquals(false, assetGroupBinding1.equals(assetGroupBinding3));
        System.assertEquals(false, assetGroupBinding2.equals(assetGroupBinding3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAssetGroupBinding assetGroupBinding1 = OASAssetGroupBinding.getExample();
        OASAssetGroupBinding assetGroupBinding2 = new OASAssetGroupBinding();

        System.assertEquals(assetGroupBinding1.hashCode(), assetGroupBinding1.hashCode());
        System.assertEquals(assetGroupBinding2.hashCode(), assetGroupBinding2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAssetGroupBinding assetGroupBinding1 = OASAssetGroupBinding.getExample();
        OASAssetGroupBinding assetGroupBinding2 = OASAssetGroupBinding.getExample();
        OASAssetGroupBinding assetGroupBinding3 = new OASAssetGroupBinding();
        OASAssetGroupBinding assetGroupBinding4 = new OASAssetGroupBinding();

        System.assert(assetGroupBinding1.equals(assetGroupBinding2));
        System.assert(assetGroupBinding3.equals(assetGroupBinding4));
        System.assertEquals(assetGroupBinding1.hashCode(), assetGroupBinding2.hashCode());
        System.assertEquals(assetGroupBinding3.hashCode(), assetGroupBinding4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAssetGroupBinding assetGroupBinding = new OASAssetGroupBinding();
        Map<String, String> x-property-mappings = assetGroupBinding.getx-property-mappings();
        System.assertEquals('assetGroupName', x-property-mappings.get('asset_group_name'));
        System.assertEquals('assetGroupDescription', x-property-mappings.get('asset_group_description'));
        System.assertEquals('assetGroupTypes', x-property-mappings.get('asset_group_types'));
        System.assertEquals('adAccountsIds', x-property-mappings.get('ad_accounts_ids'));
        System.assertEquals('profilesIds', x-property-mappings.get('profiles_ids'));
        System.assertEquals('createdTime', x-property-mappings.get('created_time'));
        System.assertEquals('updatedTime', x-property-mappings.get('updated_time'));
        System.assertEquals('createdBy', x-property-mappings.get('created_by'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAssetGroupBinding assetGroupBinding = new OASAssetGroupBinding();
        System.assertEquals(new List<String>(), assetGroupBinding.assetGroupTypes);
        System.assertEquals(new List<String>(), assetGroupBinding.adAccountsIds);
        System.assertEquals(new List<String>(), assetGroupBinding.profilesIds);
        System.assertEquals(null, assetGroupBinding.id);
        System.assertEquals(null, assetGroupBinding.assetGroupName);
        System.assertEquals(null, assetGroupBinding.assetGroupDescription);
        System.assertEquals(null, assetGroupBinding.createdTime);
        System.assertEquals(null, assetGroupBinding.updatedTime);
        System.assertEquals(null, assetGroupBinding.owner);
        System.assertEquals(null, assetGroupBinding.createdBy);
    }
}
