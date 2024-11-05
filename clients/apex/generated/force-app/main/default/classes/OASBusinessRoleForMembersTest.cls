@isTest
private class OASBusinessRoleForMembersTest {
    @isTest
    private static void allowableValues() {
        Set<OASBusinessRoleForMembers> expected = new Set<OASBusinessRoleForMembers>{
            OASBusinessRoleForMembers.EMPLOYEE,
            OASBusinessRoleForMembers.BIZ_ADMIN
        };
        Set<OASBusinessRoleForMembers> actual  = new Set<OASBusinessRoleForMembers>(OASBusinessRoleForMembers.values());
        System.assertEquals(expected, actual);
    }
}
