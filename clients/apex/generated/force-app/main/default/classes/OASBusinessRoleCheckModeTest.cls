@isTest
private class OASBusinessRoleCheckModeTest {
    @isTest
    private static void allowableValues() {
        Set<OASBusinessRoleCheckMode> expected = new Set<OASBusinessRoleCheckMode>{
            OASBusinessRoleCheckMode.INTERNAL,
            OASBusinessRoleCheckMode.EXTERNAL
        };
        Set<OASBusinessRoleCheckMode> actual  = new Set<OASBusinessRoleCheckMode>(OASBusinessRoleCheckMode.values());
        System.assertEquals(expected, actual);
    }
}
