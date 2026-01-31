@isTest
private class OASIngestionSourceOptionsTest {
    @isTest
    private static void allowableValues() {
        Set<OASIngestionSourceOptions> expected = new Set<OASIngestionSourceOptions>{
            OASIngestionSourceOptions.TAG,
            OASIngestionSourceOptions.MMP,
            OASIngestionSourceOptions.FILE_UPLOAD,
            OASIngestionSourceOptions.CONVERSIONS_API,
            OASIngestionSourceOptions.NATIVE
        };
        Set<OASIngestionSourceOptions> actual  = new Set<OASIngestionSourceOptions>(OASIngestionSourceOptions.values());
        System.assertEquals(expected, actual);
    }
}
