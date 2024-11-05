@isTest
private class OASAssetGroupTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASAssetGroupType> expected = new Set<OASAssetGroupType>{
            OASAssetGroupType.BRAND,
            OASAssetGroupType.LOCATION_OR_LANGUAGE,
            OASAssetGroupType.PRODUCT_LINE,
            OASAssetGroupType.OTHER
        };
        Set<OASAssetGroupType> actual  = new Set<OASAssetGroupType>(OASAssetGroupType.values());
        System.assertEquals(expected, actual);
    }
}
