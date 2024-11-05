@isTest
private class OASGetBusinessAssetsResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetBusinessAssetsResponse getBusinessAssetsResponse1 = OASGetBusinessAssetsResponse.getExample();
        OASGetBusinessAssetsResponse getBusinessAssetsResponse2 = getBusinessAssetsResponse1;
        OASGetBusinessAssetsResponse getBusinessAssetsResponse3 = new OASGetBusinessAssetsResponse();
        OASGetBusinessAssetsResponse getBusinessAssetsResponse4 = getBusinessAssetsResponse3;

        System.assert(getBusinessAssetsResponse1.equals(getBusinessAssetsResponse2));
        System.assert(getBusinessAssetsResponse2.equals(getBusinessAssetsResponse1));
        System.assert(getBusinessAssetsResponse1.equals(getBusinessAssetsResponse1));
        System.assert(getBusinessAssetsResponse3.equals(getBusinessAssetsResponse4));
        System.assert(getBusinessAssetsResponse4.equals(getBusinessAssetsResponse3));
        System.assert(getBusinessAssetsResponse3.equals(getBusinessAssetsResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetBusinessAssetsResponse getBusinessAssetsResponse1 = OASGetBusinessAssetsResponse.getExample();
        OASGetBusinessAssetsResponse getBusinessAssetsResponse2 = OASGetBusinessAssetsResponse.getExample();
        OASGetBusinessAssetsResponse getBusinessAssetsResponse3 = new OASGetBusinessAssetsResponse();
        OASGetBusinessAssetsResponse getBusinessAssetsResponse4 = new OASGetBusinessAssetsResponse();

        System.assert(getBusinessAssetsResponse1.equals(getBusinessAssetsResponse2));
        System.assert(getBusinessAssetsResponse2.equals(getBusinessAssetsResponse1));
        System.assert(getBusinessAssetsResponse3.equals(getBusinessAssetsResponse4));
        System.assert(getBusinessAssetsResponse4.equals(getBusinessAssetsResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetBusinessAssetsResponse getBusinessAssetsResponse1 = OASGetBusinessAssetsResponse.getExample();
        OASGetBusinessAssetsResponse getBusinessAssetsResponse2 = new OASGetBusinessAssetsResponse();

        System.assertEquals(false, getBusinessAssetsResponse1.equals('foo'));
        System.assertEquals(false, getBusinessAssetsResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetBusinessAssetsResponse getBusinessAssetsResponse1 = OASGetBusinessAssetsResponse.getExample();
        OASGetBusinessAssetsResponse getBusinessAssetsResponse2 = new OASGetBusinessAssetsResponse();
        OASGetBusinessAssetsResponse getBusinessAssetsResponse3;

        System.assertEquals(false, getBusinessAssetsResponse1.equals(getBusinessAssetsResponse3));
        System.assertEquals(false, getBusinessAssetsResponse2.equals(getBusinessAssetsResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetBusinessAssetsResponse getBusinessAssetsResponse1 = OASGetBusinessAssetsResponse.getExample();
        OASGetBusinessAssetsResponse getBusinessAssetsResponse2 = new OASGetBusinessAssetsResponse();

        System.assertEquals(getBusinessAssetsResponse1.hashCode(), getBusinessAssetsResponse1.hashCode());
        System.assertEquals(getBusinessAssetsResponse2.hashCode(), getBusinessAssetsResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetBusinessAssetsResponse getBusinessAssetsResponse1 = OASGetBusinessAssetsResponse.getExample();
        OASGetBusinessAssetsResponse getBusinessAssetsResponse2 = OASGetBusinessAssetsResponse.getExample();
        OASGetBusinessAssetsResponse getBusinessAssetsResponse3 = new OASGetBusinessAssetsResponse();
        OASGetBusinessAssetsResponse getBusinessAssetsResponse4 = new OASGetBusinessAssetsResponse();

        System.assert(getBusinessAssetsResponse1.equals(getBusinessAssetsResponse2));
        System.assert(getBusinessAssetsResponse3.equals(getBusinessAssetsResponse4));
        System.assertEquals(getBusinessAssetsResponse1.hashCode(), getBusinessAssetsResponse2.hashCode());
        System.assertEquals(getBusinessAssetsResponse3.hashCode(), getBusinessAssetsResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASGetBusinessAssetsResponse getBusinessAssetsResponse = new OASGetBusinessAssetsResponse();
        Map<String, String> x-property-mappings = getBusinessAssetsResponse.getx-property-mappings();
        System.assertEquals('assetId', x-property-mappings.get('asset_id'));
        System.assertEquals('assetType', x-property-mappings.get('asset_type'));
        System.assertEquals('assetGroupInfo', x-property-mappings.get('asset_group_info'));
    }
}
