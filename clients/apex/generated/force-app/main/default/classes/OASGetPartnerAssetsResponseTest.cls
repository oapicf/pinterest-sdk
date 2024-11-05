@isTest
private class OASGetPartnerAssetsResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetPartnerAssetsResponse getPartnerAssetsResponse1 = OASGetPartnerAssetsResponse.getExample();
        OASGetPartnerAssetsResponse getPartnerAssetsResponse2 = getPartnerAssetsResponse1;
        OASGetPartnerAssetsResponse getPartnerAssetsResponse3 = new OASGetPartnerAssetsResponse();
        OASGetPartnerAssetsResponse getPartnerAssetsResponse4 = getPartnerAssetsResponse3;

        System.assert(getPartnerAssetsResponse1.equals(getPartnerAssetsResponse2));
        System.assert(getPartnerAssetsResponse2.equals(getPartnerAssetsResponse1));
        System.assert(getPartnerAssetsResponse1.equals(getPartnerAssetsResponse1));
        System.assert(getPartnerAssetsResponse3.equals(getPartnerAssetsResponse4));
        System.assert(getPartnerAssetsResponse4.equals(getPartnerAssetsResponse3));
        System.assert(getPartnerAssetsResponse3.equals(getPartnerAssetsResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetPartnerAssetsResponse getPartnerAssetsResponse1 = OASGetPartnerAssetsResponse.getExample();
        OASGetPartnerAssetsResponse getPartnerAssetsResponse2 = OASGetPartnerAssetsResponse.getExample();
        OASGetPartnerAssetsResponse getPartnerAssetsResponse3 = new OASGetPartnerAssetsResponse();
        OASGetPartnerAssetsResponse getPartnerAssetsResponse4 = new OASGetPartnerAssetsResponse();

        System.assert(getPartnerAssetsResponse1.equals(getPartnerAssetsResponse2));
        System.assert(getPartnerAssetsResponse2.equals(getPartnerAssetsResponse1));
        System.assert(getPartnerAssetsResponse3.equals(getPartnerAssetsResponse4));
        System.assert(getPartnerAssetsResponse4.equals(getPartnerAssetsResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetPartnerAssetsResponse getPartnerAssetsResponse1 = OASGetPartnerAssetsResponse.getExample();
        OASGetPartnerAssetsResponse getPartnerAssetsResponse2 = new OASGetPartnerAssetsResponse();

        System.assertEquals(false, getPartnerAssetsResponse1.equals('foo'));
        System.assertEquals(false, getPartnerAssetsResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetPartnerAssetsResponse getPartnerAssetsResponse1 = OASGetPartnerAssetsResponse.getExample();
        OASGetPartnerAssetsResponse getPartnerAssetsResponse2 = new OASGetPartnerAssetsResponse();
        OASGetPartnerAssetsResponse getPartnerAssetsResponse3;

        System.assertEquals(false, getPartnerAssetsResponse1.equals(getPartnerAssetsResponse3));
        System.assertEquals(false, getPartnerAssetsResponse2.equals(getPartnerAssetsResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetPartnerAssetsResponse getPartnerAssetsResponse1 = OASGetPartnerAssetsResponse.getExample();
        OASGetPartnerAssetsResponse getPartnerAssetsResponse2 = new OASGetPartnerAssetsResponse();

        System.assertEquals(getPartnerAssetsResponse1.hashCode(), getPartnerAssetsResponse1.hashCode());
        System.assertEquals(getPartnerAssetsResponse2.hashCode(), getPartnerAssetsResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetPartnerAssetsResponse getPartnerAssetsResponse1 = OASGetPartnerAssetsResponse.getExample();
        OASGetPartnerAssetsResponse getPartnerAssetsResponse2 = OASGetPartnerAssetsResponse.getExample();
        OASGetPartnerAssetsResponse getPartnerAssetsResponse3 = new OASGetPartnerAssetsResponse();
        OASGetPartnerAssetsResponse getPartnerAssetsResponse4 = new OASGetPartnerAssetsResponse();

        System.assert(getPartnerAssetsResponse1.equals(getPartnerAssetsResponse2));
        System.assert(getPartnerAssetsResponse3.equals(getPartnerAssetsResponse4));
        System.assertEquals(getPartnerAssetsResponse1.hashCode(), getPartnerAssetsResponse2.hashCode());
        System.assertEquals(getPartnerAssetsResponse3.hashCode(), getPartnerAssetsResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASGetPartnerAssetsResponse getPartnerAssetsResponse = new OASGetPartnerAssetsResponse();
        Map<String, String> x-property-mappings = getPartnerAssetsResponse.getx-property-mappings();
        System.assertEquals('assetId', x-property-mappings.get('asset_id'));
        System.assertEquals('assetType', x-property-mappings.get('asset_type'));
        System.assertEquals('assetGroupInfo', x-property-mappings.get('asset_group_info'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASGetPartnerAssetsResponse getPartnerAssetsResponse = new OASGetPartnerAssetsResponse();
        System.assertEquals(new List<String>(), getPartnerAssetsResponse.permissions);
        System.assertEquals(null, getPartnerAssetsResponse.assetId);
        System.assertEquals(null, getPartnerAssetsResponse.assetType);
        System.assertEquals(null, getPartnerAssetsResponse.assetGroupInfo);
    }
}
