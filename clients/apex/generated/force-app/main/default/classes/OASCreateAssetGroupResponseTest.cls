@isTest
private class OASCreateAssetGroupResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateAssetGroupResponse createAssetGroupResponse1 = OASCreateAssetGroupResponse.getExample();
        OASCreateAssetGroupResponse createAssetGroupResponse2 = createAssetGroupResponse1;
        OASCreateAssetGroupResponse createAssetGroupResponse3 = new OASCreateAssetGroupResponse();
        OASCreateAssetGroupResponse createAssetGroupResponse4 = createAssetGroupResponse3;

        System.assert(createAssetGroupResponse1.equals(createAssetGroupResponse2));
        System.assert(createAssetGroupResponse2.equals(createAssetGroupResponse1));
        System.assert(createAssetGroupResponse1.equals(createAssetGroupResponse1));
        System.assert(createAssetGroupResponse3.equals(createAssetGroupResponse4));
        System.assert(createAssetGroupResponse4.equals(createAssetGroupResponse3));
        System.assert(createAssetGroupResponse3.equals(createAssetGroupResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateAssetGroupResponse createAssetGroupResponse1 = OASCreateAssetGroupResponse.getExample();
        OASCreateAssetGroupResponse createAssetGroupResponse2 = OASCreateAssetGroupResponse.getExample();
        OASCreateAssetGroupResponse createAssetGroupResponse3 = new OASCreateAssetGroupResponse();
        OASCreateAssetGroupResponse createAssetGroupResponse4 = new OASCreateAssetGroupResponse();

        System.assert(createAssetGroupResponse1.equals(createAssetGroupResponse2));
        System.assert(createAssetGroupResponse2.equals(createAssetGroupResponse1));
        System.assert(createAssetGroupResponse3.equals(createAssetGroupResponse4));
        System.assert(createAssetGroupResponse4.equals(createAssetGroupResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateAssetGroupResponse createAssetGroupResponse1 = OASCreateAssetGroupResponse.getExample();
        OASCreateAssetGroupResponse createAssetGroupResponse2 = new OASCreateAssetGroupResponse();

        System.assertEquals(false, createAssetGroupResponse1.equals('foo'));
        System.assertEquals(false, createAssetGroupResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateAssetGroupResponse createAssetGroupResponse1 = OASCreateAssetGroupResponse.getExample();
        OASCreateAssetGroupResponse createAssetGroupResponse2 = new OASCreateAssetGroupResponse();
        OASCreateAssetGroupResponse createAssetGroupResponse3;

        System.assertEquals(false, createAssetGroupResponse1.equals(createAssetGroupResponse3));
        System.assertEquals(false, createAssetGroupResponse2.equals(createAssetGroupResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateAssetGroupResponse createAssetGroupResponse1 = OASCreateAssetGroupResponse.getExample();
        OASCreateAssetGroupResponse createAssetGroupResponse2 = new OASCreateAssetGroupResponse();

        System.assertEquals(createAssetGroupResponse1.hashCode(), createAssetGroupResponse1.hashCode());
        System.assertEquals(createAssetGroupResponse2.hashCode(), createAssetGroupResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateAssetGroupResponse createAssetGroupResponse1 = OASCreateAssetGroupResponse.getExample();
        OASCreateAssetGroupResponse createAssetGroupResponse2 = OASCreateAssetGroupResponse.getExample();
        OASCreateAssetGroupResponse createAssetGroupResponse3 = new OASCreateAssetGroupResponse();
        OASCreateAssetGroupResponse createAssetGroupResponse4 = new OASCreateAssetGroupResponse();

        System.assert(createAssetGroupResponse1.equals(createAssetGroupResponse2));
        System.assert(createAssetGroupResponse3.equals(createAssetGroupResponse4));
        System.assertEquals(createAssetGroupResponse1.hashCode(), createAssetGroupResponse2.hashCode());
        System.assertEquals(createAssetGroupResponse3.hashCode(), createAssetGroupResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCreateAssetGroupResponse createAssetGroupResponse = new OASCreateAssetGroupResponse();
        Map<String, String> x-property-mappings = createAssetGroupResponse.getx-property-mappings();
        System.assertEquals('assetGroup', x-property-mappings.get('asset_group'));
    }
}
