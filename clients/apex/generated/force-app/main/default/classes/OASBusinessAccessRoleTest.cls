@isTest
private class OASBusinessAccessRoleTest {
    @isTest
    private static void allowableValues() {
        Set<OASBusinessAccessRole> expected = new Set<OASBusinessAccessRole>{
            OASBusinessAccessRole.OWNER,
            OASBusinessAccessRole.ADMIN,
            OASBusinessAccessRole.ANALYST,
            OASBusinessAccessRole.SOS_READER,
            OASBusinessAccessRole.FINANCE_MANAGER,
            OASBusinessAccessRole.AUDIENCE_MANAGER,
            OASBusinessAccessRole.CAMPAIGN_MANAGER,
            OASBusinessAccessRole.CATALOGS_MANAGER,
            OASBusinessAccessRole.RESTRICTED_OWNER,
            OASBusinessAccessRole.PROFILE_MANAGER,
            OASBusinessAccessRole.PROFILE_PUBLISHER,
            OASBusinessAccessRole.RESOURCE_PINNER_LIST_OWNER,
            OASBusinessAccessRole.RESOURCE_PINNER_LIST_READER,
            OASBusinessAccessRole.BIZ_PINNER_LIST_SHARER,
            OASBusinessAccessRole.RESOURCE_CONVERSION_TAGS_READER
        };
        Set<OASBusinessAccessRole> actual  = new Set<OASBusinessAccessRole>(OASBusinessAccessRole.values());
        System.assertEquals(expected, actual);
    }
}
