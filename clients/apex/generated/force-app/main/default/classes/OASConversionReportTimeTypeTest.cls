@isTest
private class OASConversionReportTimeTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASConversionReportTimeType> expected = new Set<OASConversionReportTimeType>{
            OASConversionReportTimeType.TIME_OF_AD_ACTION,
            OASConversionReportTimeType.TIME_OF_CONVERSION
        };
        Set<OASConversionReportTimeType> actual  = new Set<OASConversionReportTimeType>(OASConversionReportTimeType.values());
        System.assertEquals(expected, actual);
    }
}
