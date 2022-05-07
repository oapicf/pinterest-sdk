@isTest
private class OASConversionReportAttributionTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASConversionReportAttributionType> expected = new Set<OASConversionReportAttributionType>{
            OASConversionReportAttributionType.INDIVIDUAL,
            OASConversionReportAttributionType.HOUSEHOLD
        };
        Set<OASConversionReportAttributionType> actual  = new Set<OASConversionReportAttributionType>(OASConversionReportAttributionType.values());
        System.assertEquals(expected, actual);
    }
}
