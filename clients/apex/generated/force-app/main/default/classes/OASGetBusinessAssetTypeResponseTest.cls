@isTest
private class OASGetBusinessAssetTypeResponseTest {
    @isTest
    private static void allowableValues() {
        Set<OASGetBusinessAssetTypeResponse> expected = new Set<OASGetBusinessAssetTypeResponse>{
            OASGetBusinessAssetTypeResponse.AD_ACCOUNT,
            OASGetBusinessAssetTypeResponse.PROFILE,
            OASGetBusinessAssetTypeResponse.ASSET_GROUP,
            OASGetBusinessAssetTypeResponse.CONVERSION_TAG
        };
        Set<OASGetBusinessAssetTypeResponse> actual  = new Set<OASGetBusinessAssetTypeResponse>(OASGetBusinessAssetTypeResponse.values());
        System.assertEquals(expected, actual);
    }
}
