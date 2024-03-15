@isTest
private class OASBudgetTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASBudgetType> expected = new Set<OASBudgetType>{
            OASBudgetType.DAILY,
            OASBudgetType.LIFETIME,
            OASBudgetType.CBO_ADGROUP
        };
        Set<OASBudgetType> actual  = new Set<OASBudgetType>(OASBudgetType.values());
        System.assertEquals(expected, actual);
    }
}
