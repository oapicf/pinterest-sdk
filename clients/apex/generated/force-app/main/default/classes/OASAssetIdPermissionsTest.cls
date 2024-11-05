@isTest
private class OASAssetIdPermissionsTest {
    @isTest
    private static void equalsSameInstance() {
        OASAssetIdPermissions assetIdPermissions1 = OASAssetIdPermissions.getExample();
        OASAssetIdPermissions assetIdPermissions2 = assetIdPermissions1;
        OASAssetIdPermissions assetIdPermissions3 = new OASAssetIdPermissions();
        OASAssetIdPermissions assetIdPermissions4 = assetIdPermissions3;

        System.assert(assetIdPermissions1.equals(assetIdPermissions2));
        System.assert(assetIdPermissions2.equals(assetIdPermissions1));
        System.assert(assetIdPermissions1.equals(assetIdPermissions1));
        System.assert(assetIdPermissions3.equals(assetIdPermissions4));
        System.assert(assetIdPermissions4.equals(assetIdPermissions3));
        System.assert(assetIdPermissions3.equals(assetIdPermissions3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAssetIdPermissions assetIdPermissions1 = OASAssetIdPermissions.getExample();
        OASAssetIdPermissions assetIdPermissions2 = OASAssetIdPermissions.getExample();
        OASAssetIdPermissions assetIdPermissions3 = new OASAssetIdPermissions();
        OASAssetIdPermissions assetIdPermissions4 = new OASAssetIdPermissions();

        System.assert(assetIdPermissions1.equals(assetIdPermissions2));
        System.assert(assetIdPermissions2.equals(assetIdPermissions1));
        System.assert(assetIdPermissions3.equals(assetIdPermissions4));
        System.assert(assetIdPermissions4.equals(assetIdPermissions3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAssetIdPermissions assetIdPermissions1 = OASAssetIdPermissions.getExample();
        OASAssetIdPermissions assetIdPermissions2 = new OASAssetIdPermissions();

        System.assertEquals(false, assetIdPermissions1.equals('foo'));
        System.assertEquals(false, assetIdPermissions2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAssetIdPermissions assetIdPermissions1 = OASAssetIdPermissions.getExample();
        OASAssetIdPermissions assetIdPermissions2 = new OASAssetIdPermissions();
        OASAssetIdPermissions assetIdPermissions3;

        System.assertEquals(false, assetIdPermissions1.equals(assetIdPermissions3));
        System.assertEquals(false, assetIdPermissions2.equals(assetIdPermissions3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAssetIdPermissions assetIdPermissions1 = OASAssetIdPermissions.getExample();
        OASAssetIdPermissions assetIdPermissions2 = new OASAssetIdPermissions();

        System.assertEquals(assetIdPermissions1.hashCode(), assetIdPermissions1.hashCode());
        System.assertEquals(assetIdPermissions2.hashCode(), assetIdPermissions2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAssetIdPermissions assetIdPermissions1 = OASAssetIdPermissions.getExample();
        OASAssetIdPermissions assetIdPermissions2 = OASAssetIdPermissions.getExample();
        OASAssetIdPermissions assetIdPermissions3 = new OASAssetIdPermissions();
        OASAssetIdPermissions assetIdPermissions4 = new OASAssetIdPermissions();

        System.assert(assetIdPermissions1.equals(assetIdPermissions2));
        System.assert(assetIdPermissions3.equals(assetIdPermissions4));
        System.assertEquals(assetIdPermissions1.hashCode(), assetIdPermissions2.hashCode());
        System.assertEquals(assetIdPermissions3.hashCode(), assetIdPermissions4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAssetIdPermissions assetIdPermissions = new OASAssetIdPermissions();
        Map<String, String> x-property-mappings = assetIdPermissions.getx-property-mappings();
        System.assertEquals('assetId', x-property-mappings.get('asset_id'));
        System.assertEquals('assetType', x-property-mappings.get('asset_type'));
        System.assertEquals('assetGroupInfo', x-property-mappings.get('asset_group_info'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAssetIdPermissions assetIdPermissions = new OASAssetIdPermissions();
        System.assertEquals(new List<String>(), assetIdPermissions.permissions);
        System.assertEquals(null, assetIdPermissions.assetId);
        System.assertEquals(null, assetIdPermissions.assetType);
        System.assertEquals(null, assetIdPermissions.assetGroupInfo);
    }
}
