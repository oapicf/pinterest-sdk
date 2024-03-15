@isTest
private class OASRoleTest {
    @isTest
    private static void allowableValues() {
        Set<OASRole> expected = new Set<OASRole>{
            OASRole.UNKNOWN,
            OASRole.OWNER,
            OASRole.ADMIN,
            OASRole.ANALYST,
            OASRole.SOS_READER,
            OASRole.FINANCE_MANAGER,
            OASRole.AUDIENCE_MANAGER,
            OASRole.CAMPAIGN_MANAGER,
            OASRole.CATALOGS_MANAGER,
            OASRole.RESTRICTED_OWNER,
            OASRole.PROFILE_MANAGER,
            OASRole.PROFILE_PUBLISHER,
            OASRole.RESOURCE_PINNER_LIST_OWNER,
            OASRole.RESOURCE_PINNER_LIST_READER,
            OASRole.BIZ_PINNER_LIST_SHARER,
            OASRole.RESOURCE_CONVERSION_TAGS_READER
        };
        Set<OASRole> actual  = new Set<OASRole>(OASRole.values());
        System.assertEquals(expected, actual);
    }
}
