@isTest
private class OASCreateAssetAccessRequestBodyAssetTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateAssetAccessRequestBodyAsset createAssetAccessRequestBodyAssetRequestsInner1 = OASCreateAssetAccessRequestBodyAsset.getExample();
        OASCreateAssetAccessRequestBodyAsset createAssetAccessRequestBodyAssetRequestsInner2 = createAssetAccessRequestBodyAssetRequestsInner1;
        OASCreateAssetAccessRequestBodyAsset createAssetAccessRequestBodyAssetRequestsInner3 = new OASCreateAssetAccessRequestBodyAsset();
        OASCreateAssetAccessRequestBodyAsset createAssetAccessRequestBodyAssetRequestsInner4 = createAssetAccessRequestBodyAssetRequestsInner3;

        System.assert(createAssetAccessRequestBodyAssetRequestsInner1.equals(createAssetAccessRequestBodyAssetRequestsInner2));
        System.assert(createAssetAccessRequestBodyAssetRequestsInner2.equals(createAssetAccessRequestBodyAssetRequestsInner1));
        System.assert(createAssetAccessRequestBodyAssetRequestsInner1.equals(createAssetAccessRequestBodyAssetRequestsInner1));
        System.assert(createAssetAccessRequestBodyAssetRequestsInner3.equals(createAssetAccessRequestBodyAssetRequestsInner4));
        System.assert(createAssetAccessRequestBodyAssetRequestsInner4.equals(createAssetAccessRequestBodyAssetRequestsInner3));
        System.assert(createAssetAccessRequestBodyAssetRequestsInner3.equals(createAssetAccessRequestBodyAssetRequestsInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateAssetAccessRequestBodyAsset createAssetAccessRequestBodyAssetRequestsInner1 = OASCreateAssetAccessRequestBodyAsset.getExample();
        OASCreateAssetAccessRequestBodyAsset createAssetAccessRequestBodyAssetRequestsInner2 = OASCreateAssetAccessRequestBodyAsset.getExample();
        OASCreateAssetAccessRequestBodyAsset createAssetAccessRequestBodyAssetRequestsInner3 = new OASCreateAssetAccessRequestBodyAsset();
        OASCreateAssetAccessRequestBodyAsset createAssetAccessRequestBodyAssetRequestsInner4 = new OASCreateAssetAccessRequestBodyAsset();

        System.assert(createAssetAccessRequestBodyAssetRequestsInner1.equals(createAssetAccessRequestBodyAssetRequestsInner2));
        System.assert(createAssetAccessRequestBodyAssetRequestsInner2.equals(createAssetAccessRequestBodyAssetRequestsInner1));
        System.assert(createAssetAccessRequestBodyAssetRequestsInner3.equals(createAssetAccessRequestBodyAssetRequestsInner4));
        System.assert(createAssetAccessRequestBodyAssetRequestsInner4.equals(createAssetAccessRequestBodyAssetRequestsInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateAssetAccessRequestBodyAsset createAssetAccessRequestBodyAssetRequestsInner1 = OASCreateAssetAccessRequestBodyAsset.getExample();
        OASCreateAssetAccessRequestBodyAsset createAssetAccessRequestBodyAssetRequestsInner2 = new OASCreateAssetAccessRequestBodyAsset();

        System.assertEquals(false, createAssetAccessRequestBodyAssetRequestsInner1.equals('foo'));
        System.assertEquals(false, createAssetAccessRequestBodyAssetRequestsInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateAssetAccessRequestBodyAsset createAssetAccessRequestBodyAssetRequestsInner1 = OASCreateAssetAccessRequestBodyAsset.getExample();
        OASCreateAssetAccessRequestBodyAsset createAssetAccessRequestBodyAssetRequestsInner2 = new OASCreateAssetAccessRequestBodyAsset();
        OASCreateAssetAccessRequestBodyAsset createAssetAccessRequestBodyAssetRequestsInner3;

        System.assertEquals(false, createAssetAccessRequestBodyAssetRequestsInner1.equals(createAssetAccessRequestBodyAssetRequestsInner3));
        System.assertEquals(false, createAssetAccessRequestBodyAssetRequestsInner2.equals(createAssetAccessRequestBodyAssetRequestsInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateAssetAccessRequestBodyAsset createAssetAccessRequestBodyAssetRequestsInner1 = OASCreateAssetAccessRequestBodyAsset.getExample();
        OASCreateAssetAccessRequestBodyAsset createAssetAccessRequestBodyAssetRequestsInner2 = new OASCreateAssetAccessRequestBodyAsset();

        System.assertEquals(createAssetAccessRequestBodyAssetRequestsInner1.hashCode(), createAssetAccessRequestBodyAssetRequestsInner1.hashCode());
        System.assertEquals(createAssetAccessRequestBodyAssetRequestsInner2.hashCode(), createAssetAccessRequestBodyAssetRequestsInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateAssetAccessRequestBodyAsset createAssetAccessRequestBodyAssetRequestsInner1 = OASCreateAssetAccessRequestBodyAsset.getExample();
        OASCreateAssetAccessRequestBodyAsset createAssetAccessRequestBodyAssetRequestsInner2 = OASCreateAssetAccessRequestBodyAsset.getExample();
        OASCreateAssetAccessRequestBodyAsset createAssetAccessRequestBodyAssetRequestsInner3 = new OASCreateAssetAccessRequestBodyAsset();
        OASCreateAssetAccessRequestBodyAsset createAssetAccessRequestBodyAssetRequestsInner4 = new OASCreateAssetAccessRequestBodyAsset();

        System.assert(createAssetAccessRequestBodyAssetRequestsInner1.equals(createAssetAccessRequestBodyAssetRequestsInner2));
        System.assert(createAssetAccessRequestBodyAssetRequestsInner3.equals(createAssetAccessRequestBodyAssetRequestsInner4));
        System.assertEquals(createAssetAccessRequestBodyAssetRequestsInner1.hashCode(), createAssetAccessRequestBodyAssetRequestsInner2.hashCode());
        System.assertEquals(createAssetAccessRequestBodyAssetRequestsInner3.hashCode(), createAssetAccessRequestBodyAssetRequestsInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCreateAssetAccessRequestBodyAsset createAssetAccessRequestBodyAssetRequestsInner = new OASCreateAssetAccessRequestBodyAsset();
        Map<String, String> x-property-mappings = createAssetAccessRequestBodyAssetRequestsInner.getx-property-mappings();
        System.assertEquals('partnerId', x-property-mappings.get('partner_id'));
        System.assertEquals('assetIdToPermissions', x-property-mappings.get('asset_id_to_permissions'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCreateAssetAccessRequestBodyAsset createAssetAccessRequestBodyAssetRequestsInner = new OASCreateAssetAccessRequestBodyAsset();
        System.assertEquals(new Map<String, List<OASPermissions>>(), createAssetAccessRequestBodyAssetRequestsInner.assetIdToPermissions);
        System.assertEquals(null, createAssetAccessRequestBodyAssetRequestsInner.partnerId);
    }
}
