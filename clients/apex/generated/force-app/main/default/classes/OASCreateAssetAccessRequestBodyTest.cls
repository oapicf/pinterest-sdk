@isTest
private class OASCreateAssetAccessRequestBodyTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateAssetAccessRequestBody createAssetAccessRequestBody1 = OASCreateAssetAccessRequestBody.getExample();
        OASCreateAssetAccessRequestBody createAssetAccessRequestBody2 = createAssetAccessRequestBody1;
        OASCreateAssetAccessRequestBody createAssetAccessRequestBody3 = new OASCreateAssetAccessRequestBody();
        OASCreateAssetAccessRequestBody createAssetAccessRequestBody4 = createAssetAccessRequestBody3;

        System.assert(createAssetAccessRequestBody1.equals(createAssetAccessRequestBody2));
        System.assert(createAssetAccessRequestBody2.equals(createAssetAccessRequestBody1));
        System.assert(createAssetAccessRequestBody1.equals(createAssetAccessRequestBody1));
        System.assert(createAssetAccessRequestBody3.equals(createAssetAccessRequestBody4));
        System.assert(createAssetAccessRequestBody4.equals(createAssetAccessRequestBody3));
        System.assert(createAssetAccessRequestBody3.equals(createAssetAccessRequestBody3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateAssetAccessRequestBody createAssetAccessRequestBody1 = OASCreateAssetAccessRequestBody.getExample();
        OASCreateAssetAccessRequestBody createAssetAccessRequestBody2 = OASCreateAssetAccessRequestBody.getExample();
        OASCreateAssetAccessRequestBody createAssetAccessRequestBody3 = new OASCreateAssetAccessRequestBody();
        OASCreateAssetAccessRequestBody createAssetAccessRequestBody4 = new OASCreateAssetAccessRequestBody();

        System.assert(createAssetAccessRequestBody1.equals(createAssetAccessRequestBody2));
        System.assert(createAssetAccessRequestBody2.equals(createAssetAccessRequestBody1));
        System.assert(createAssetAccessRequestBody3.equals(createAssetAccessRequestBody4));
        System.assert(createAssetAccessRequestBody4.equals(createAssetAccessRequestBody3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateAssetAccessRequestBody createAssetAccessRequestBody1 = OASCreateAssetAccessRequestBody.getExample();
        OASCreateAssetAccessRequestBody createAssetAccessRequestBody2 = new OASCreateAssetAccessRequestBody();

        System.assertEquals(false, createAssetAccessRequestBody1.equals('foo'));
        System.assertEquals(false, createAssetAccessRequestBody2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateAssetAccessRequestBody createAssetAccessRequestBody1 = OASCreateAssetAccessRequestBody.getExample();
        OASCreateAssetAccessRequestBody createAssetAccessRequestBody2 = new OASCreateAssetAccessRequestBody();
        OASCreateAssetAccessRequestBody createAssetAccessRequestBody3;

        System.assertEquals(false, createAssetAccessRequestBody1.equals(createAssetAccessRequestBody3));
        System.assertEquals(false, createAssetAccessRequestBody2.equals(createAssetAccessRequestBody3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateAssetAccessRequestBody createAssetAccessRequestBody1 = OASCreateAssetAccessRequestBody.getExample();
        OASCreateAssetAccessRequestBody createAssetAccessRequestBody2 = new OASCreateAssetAccessRequestBody();

        System.assertEquals(createAssetAccessRequestBody1.hashCode(), createAssetAccessRequestBody1.hashCode());
        System.assertEquals(createAssetAccessRequestBody2.hashCode(), createAssetAccessRequestBody2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateAssetAccessRequestBody createAssetAccessRequestBody1 = OASCreateAssetAccessRequestBody.getExample();
        OASCreateAssetAccessRequestBody createAssetAccessRequestBody2 = OASCreateAssetAccessRequestBody.getExample();
        OASCreateAssetAccessRequestBody createAssetAccessRequestBody3 = new OASCreateAssetAccessRequestBody();
        OASCreateAssetAccessRequestBody createAssetAccessRequestBody4 = new OASCreateAssetAccessRequestBody();

        System.assert(createAssetAccessRequestBody1.equals(createAssetAccessRequestBody2));
        System.assert(createAssetAccessRequestBody3.equals(createAssetAccessRequestBody4));
        System.assertEquals(createAssetAccessRequestBody1.hashCode(), createAssetAccessRequestBody2.hashCode());
        System.assertEquals(createAssetAccessRequestBody3.hashCode(), createAssetAccessRequestBody4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCreateAssetAccessRequestBody createAssetAccessRequestBody = new OASCreateAssetAccessRequestBody();
        Map<String, String> x-property-mappings = createAssetAccessRequestBody.getx-property-mappings();
        System.assertEquals('assetRequests', x-property-mappings.get('asset_requests'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCreateAssetAccessRequestBody createAssetAccessRequestBody = new OASCreateAssetAccessRequestBody();
        System.assertEquals(new List<OASCreateAssetAccessRequestBodyAsset>(), createAssetAccessRequestBody.assetRequests);
    }
}
