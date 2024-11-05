@isTest
private class OASEnhancedMatchStatusTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASEnhancedMatchStatusType> expected = new Set<OASEnhancedMatchStatusType>{
            OASEnhancedMatchStatusType.UNKNOWN,
            OASEnhancedMatchStatusType.NOT_VALIDATED,
            OASEnhancedMatchStatusType.VALIDATING_IN_PROGRESS,
            OASEnhancedMatchStatusType.VALIDATION_COMPLETE
        };
        Set<OASEnhancedMatchStatusType> actual  = new Set<OASEnhancedMatchStatusType>(OASEnhancedMatchStatusType.values());
        System.assertEquals(expected, actual);
    }
}
