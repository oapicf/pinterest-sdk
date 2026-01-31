@isTest
private class OASSourcePlatformOptionsTest {
    @isTest
    private static void allowableValues() {
        Set<OASSourcePlatformOptions> expected = new Set<OASSourcePlatformOptions>{
            OASSourcePlatformOptions.WEB,
            OASSourcePlatformOptions.MOBILE,
            OASSourcePlatformOptions.MOBILE_ANDROID,
            OASSourcePlatformOptions.MOBILE_IOS,
            OASSourcePlatformOptions.OFFLINE,
            OASSourcePlatformOptions.PINTEREST_WEB,
            OASSourcePlatformOptions.PINTEREST_ANDROID,
            OASSourcePlatformOptions.PINTEREST_IOS,
            OASSourcePlatformOptions.POINT_OF_SALE
        };
        Set<OASSourcePlatformOptions> actual  = new Set<OASSourcePlatformOptions>(OASSourcePlatformOptions.values());
        System.assertEquals(expected, actual);
    }
}
