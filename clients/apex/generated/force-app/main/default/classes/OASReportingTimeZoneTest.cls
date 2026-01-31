@isTest
private class OASReportingTimeZoneTest {
    @isTest
    private static void allowableValues() {
        Set<OASReportingTimeZone> expected = new Set<OASReportingTimeZone>{
            OASReportingTimeZone.PINTEREST_TIME_ZONE,
            OASReportingTimeZone.AD_ACCOUNT_TIME_ZONE
        };
        Set<OASReportingTimeZone> actual  = new Set<OASReportingTimeZone>(OASReportingTimeZone.values());
        System.assertEquals(expected, actual);
    }
}
