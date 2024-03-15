@isTest
private class OASConversionReportTimeTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASConversionReportTimeType> expected = new Set<OASConversionReportTimeType>{
            OASConversionReportTimeType.AD_ACTION,
            OASConversionReportTimeType.CONVERSION
        };
        Set<OASConversionReportTimeType> actual  = new Set<OASConversionReportTimeType>(OASConversionReportTimeType.values());
        System.assertEquals(expected, actual);
    }
}
