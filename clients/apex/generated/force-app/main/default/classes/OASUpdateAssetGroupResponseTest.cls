@isTest
private class OASUpdateAssetGroupResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASUpdateAssetGroupResponse updateAssetGroupResponse1 = OASUpdateAssetGroupResponse.getExample();
        OASUpdateAssetGroupResponse updateAssetGroupResponse2 = updateAssetGroupResponse1;
        OASUpdateAssetGroupResponse updateAssetGroupResponse3 = new OASUpdateAssetGroupResponse();
        OASUpdateAssetGroupResponse updateAssetGroupResponse4 = updateAssetGroupResponse3;

        System.assert(updateAssetGroupResponse1.equals(updateAssetGroupResponse2));
        System.assert(updateAssetGroupResponse2.equals(updateAssetGroupResponse1));
        System.assert(updateAssetGroupResponse1.equals(updateAssetGroupResponse1));
        System.assert(updateAssetGroupResponse3.equals(updateAssetGroupResponse4));
        System.assert(updateAssetGroupResponse4.equals(updateAssetGroupResponse3));
        System.assert(updateAssetGroupResponse3.equals(updateAssetGroupResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUpdateAssetGroupResponse updateAssetGroupResponse1 = OASUpdateAssetGroupResponse.getExample();
        OASUpdateAssetGroupResponse updateAssetGroupResponse2 = OASUpdateAssetGroupResponse.getExample();
        OASUpdateAssetGroupResponse updateAssetGroupResponse3 = new OASUpdateAssetGroupResponse();
        OASUpdateAssetGroupResponse updateAssetGroupResponse4 = new OASUpdateAssetGroupResponse();

        System.assert(updateAssetGroupResponse1.equals(updateAssetGroupResponse2));
        System.assert(updateAssetGroupResponse2.equals(updateAssetGroupResponse1));
        System.assert(updateAssetGroupResponse3.equals(updateAssetGroupResponse4));
        System.assert(updateAssetGroupResponse4.equals(updateAssetGroupResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUpdateAssetGroupResponse updateAssetGroupResponse1 = OASUpdateAssetGroupResponse.getExample();
        OASUpdateAssetGroupResponse updateAssetGroupResponse2 = new OASUpdateAssetGroupResponse();

        System.assertEquals(false, updateAssetGroupResponse1.equals('foo'));
        System.assertEquals(false, updateAssetGroupResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUpdateAssetGroupResponse updateAssetGroupResponse1 = OASUpdateAssetGroupResponse.getExample();
        OASUpdateAssetGroupResponse updateAssetGroupResponse2 = new OASUpdateAssetGroupResponse();
        OASUpdateAssetGroupResponse updateAssetGroupResponse3;

        System.assertEquals(false, updateAssetGroupResponse1.equals(updateAssetGroupResponse3));
        System.assertEquals(false, updateAssetGroupResponse2.equals(updateAssetGroupResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUpdateAssetGroupResponse updateAssetGroupResponse1 = OASUpdateAssetGroupResponse.getExample();
        OASUpdateAssetGroupResponse updateAssetGroupResponse2 = new OASUpdateAssetGroupResponse();

        System.assertEquals(updateAssetGroupResponse1.hashCode(), updateAssetGroupResponse1.hashCode());
        System.assertEquals(updateAssetGroupResponse2.hashCode(), updateAssetGroupResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUpdateAssetGroupResponse updateAssetGroupResponse1 = OASUpdateAssetGroupResponse.getExample();
        OASUpdateAssetGroupResponse updateAssetGroupResponse2 = OASUpdateAssetGroupResponse.getExample();
        OASUpdateAssetGroupResponse updateAssetGroupResponse3 = new OASUpdateAssetGroupResponse();
        OASUpdateAssetGroupResponse updateAssetGroupResponse4 = new OASUpdateAssetGroupResponse();

        System.assert(updateAssetGroupResponse1.equals(updateAssetGroupResponse2));
        System.assert(updateAssetGroupResponse3.equals(updateAssetGroupResponse4));
        System.assertEquals(updateAssetGroupResponse1.hashCode(), updateAssetGroupResponse2.hashCode());
        System.assertEquals(updateAssetGroupResponse3.hashCode(), updateAssetGroupResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASUpdateAssetGroupResponse updateAssetGroupResponse = new OASUpdateAssetGroupResponse();
        Map<String, String> x-property-mappings = updateAssetGroupResponse.getx-property-mappings();
        System.assertEquals('updatedAssetGroups', x-property-mappings.get('updated_asset_groups'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASUpdateAssetGroupResponse updateAssetGroupResponse = new OASUpdateAssetGroupResponse();
        System.assertEquals(new List<OASAssetGroupBinding>(), updateAssetGroupResponse.updatedAssetGroups);
        System.assertEquals(new List<OASUpdateAssetGroupResponseException>(), updateAssetGroupResponse.exceptions);
    }
}
