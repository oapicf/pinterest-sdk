@isTest
private class OASBusinessRoleTest {
    @isTest
    private static void allowableValues() {
        Set<OASBusinessRole> expected = new Set<OASBusinessRole>{
            OASBusinessRole.EMPLOYEE,
            OASBusinessRole.BIZ_ADMIN,
            OASBusinessRole.PARTNER
        };
        Set<OASBusinessRole> actual  = new Set<OASBusinessRole>(OASBusinessRole.values());
        System.assertEquals(expected, actual);
    }
}
