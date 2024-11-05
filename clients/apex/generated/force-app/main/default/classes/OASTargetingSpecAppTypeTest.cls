@isTest
private class OASTargetingSpecAppTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASTargetingSpecAppType> expected = new Set<OASTargetingSpecAppType>{
            OASTargetingSpecAppType.ANDROID_MOBILE,
            OASTargetingSpecAppType.ANDROID_TABLET,
            OASTargetingSpecAppType.IPAD,
            OASTargetingSpecAppType.IPHONE,
            OASTargetingSpecAppType.WEB,
            OASTargetingSpecAppType.WEB_MOBILE
        };
        Set<OASTargetingSpecAppType> actual  = new Set<OASTargetingSpecAppType>(OASTargetingSpecAppType.values());
        System.assertEquals(expected, actual);
    }
}
