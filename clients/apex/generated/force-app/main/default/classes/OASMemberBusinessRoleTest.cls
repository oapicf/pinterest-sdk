@isTest
private class OASMemberBusinessRoleTest {
    @isTest
    private static void allowableValues() {
        Set<OASMemberBusinessRole> expected = new Set<OASMemberBusinessRole>{
            OASMemberBusinessRole.EMPLOYEE,
            OASMemberBusinessRole.BIZ_ADMIN
        };
        Set<OASMemberBusinessRole> actual  = new Set<OASMemberBusinessRole>(OASMemberBusinessRole.values());
        System.assertEquals(expected, actual);
    }
}
