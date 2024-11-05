@isTest
private class OASDeleteAssetGroupResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASDeleteAssetGroupResponse deleteAssetGroupResponse1 = OASDeleteAssetGroupResponse.getExample();
        OASDeleteAssetGroupResponse deleteAssetGroupResponse2 = deleteAssetGroupResponse1;
        OASDeleteAssetGroupResponse deleteAssetGroupResponse3 = new OASDeleteAssetGroupResponse();
        OASDeleteAssetGroupResponse deleteAssetGroupResponse4 = deleteAssetGroupResponse3;

        System.assert(deleteAssetGroupResponse1.equals(deleteAssetGroupResponse2));
        System.assert(deleteAssetGroupResponse2.equals(deleteAssetGroupResponse1));
        System.assert(deleteAssetGroupResponse1.equals(deleteAssetGroupResponse1));
        System.assert(deleteAssetGroupResponse3.equals(deleteAssetGroupResponse4));
        System.assert(deleteAssetGroupResponse4.equals(deleteAssetGroupResponse3));
        System.assert(deleteAssetGroupResponse3.equals(deleteAssetGroupResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDeleteAssetGroupResponse deleteAssetGroupResponse1 = OASDeleteAssetGroupResponse.getExample();
        OASDeleteAssetGroupResponse deleteAssetGroupResponse2 = OASDeleteAssetGroupResponse.getExample();
        OASDeleteAssetGroupResponse deleteAssetGroupResponse3 = new OASDeleteAssetGroupResponse();
        OASDeleteAssetGroupResponse deleteAssetGroupResponse4 = new OASDeleteAssetGroupResponse();

        System.assert(deleteAssetGroupResponse1.equals(deleteAssetGroupResponse2));
        System.assert(deleteAssetGroupResponse2.equals(deleteAssetGroupResponse1));
        System.assert(deleteAssetGroupResponse3.equals(deleteAssetGroupResponse4));
        System.assert(deleteAssetGroupResponse4.equals(deleteAssetGroupResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDeleteAssetGroupResponse deleteAssetGroupResponse1 = OASDeleteAssetGroupResponse.getExample();
        OASDeleteAssetGroupResponse deleteAssetGroupResponse2 = new OASDeleteAssetGroupResponse();

        System.assertEquals(false, deleteAssetGroupResponse1.equals('foo'));
        System.assertEquals(false, deleteAssetGroupResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDeleteAssetGroupResponse deleteAssetGroupResponse1 = OASDeleteAssetGroupResponse.getExample();
        OASDeleteAssetGroupResponse deleteAssetGroupResponse2 = new OASDeleteAssetGroupResponse();
        OASDeleteAssetGroupResponse deleteAssetGroupResponse3;

        System.assertEquals(false, deleteAssetGroupResponse1.equals(deleteAssetGroupResponse3));
        System.assertEquals(false, deleteAssetGroupResponse2.equals(deleteAssetGroupResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDeleteAssetGroupResponse deleteAssetGroupResponse1 = OASDeleteAssetGroupResponse.getExample();
        OASDeleteAssetGroupResponse deleteAssetGroupResponse2 = new OASDeleteAssetGroupResponse();

        System.assertEquals(deleteAssetGroupResponse1.hashCode(), deleteAssetGroupResponse1.hashCode());
        System.assertEquals(deleteAssetGroupResponse2.hashCode(), deleteAssetGroupResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDeleteAssetGroupResponse deleteAssetGroupResponse1 = OASDeleteAssetGroupResponse.getExample();
        OASDeleteAssetGroupResponse deleteAssetGroupResponse2 = OASDeleteAssetGroupResponse.getExample();
        OASDeleteAssetGroupResponse deleteAssetGroupResponse3 = new OASDeleteAssetGroupResponse();
        OASDeleteAssetGroupResponse deleteAssetGroupResponse4 = new OASDeleteAssetGroupResponse();

        System.assert(deleteAssetGroupResponse1.equals(deleteAssetGroupResponse2));
        System.assert(deleteAssetGroupResponse3.equals(deleteAssetGroupResponse4));
        System.assertEquals(deleteAssetGroupResponse1.hashCode(), deleteAssetGroupResponse2.hashCode());
        System.assertEquals(deleteAssetGroupResponse3.hashCode(), deleteAssetGroupResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASDeleteAssetGroupResponse deleteAssetGroupResponse = new OASDeleteAssetGroupResponse();
        Map<String, String> x-property-mappings = deleteAssetGroupResponse.getx-property-mappings();
        System.assertEquals('deletedAssetGroups', x-property-mappings.get('deleted_asset_groups'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASDeleteAssetGroupResponse deleteAssetGroupResponse = new OASDeleteAssetGroupResponse();
        System.assertEquals(new List<String>(), deleteAssetGroupResponse.deletedAssetGroups);
        System.assertEquals(new List<OASDeleteAssetGroupResponseException>(), deleteAssetGroupResponse.exceptions);
    }
}
