@isTest
private class OASMMMReportingTargetingTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASMMMReportingTargetingType> expected = new Set<OASMMMReportingTargetingType>{
            OASMMMReportingTargetingType.APPTYPE,
            OASMMMReportingTargetingType.COUNTRY,
            OASMMMReportingTargetingType.CREATIVE_TYPE,
            OASMMMReportingTargetingType.GENDER,
            OASMMMReportingTargetingType.LOCATION
        };
        Set<OASMMMReportingTargetingType> actual  = new Set<OASMMMReportingTargetingType>(OASMMMReportingTargetingType.values());
        System.assertEquals(expected, actual);
    }
}
