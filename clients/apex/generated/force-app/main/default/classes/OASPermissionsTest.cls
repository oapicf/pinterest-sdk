@isTest
private class OASPermissionsTest {
    @isTest
    private static void allowableValues() {
        Set<OASPermissions> expected = new Set<OASPermissions>{
            OASPermissions.ADMIN,
            OASPermissions.ANALYST,
            OASPermissions.FINANCE_MANAGER,
            OASPermissions.AUDIENCE_MANAGER,
            OASPermissions.CAMPAIGN_MANAGER,
            OASPermissions.CATALOGS_MANAGER,
            OASPermissions.PROFILE_PUBLISHER
        };
        Set<OASPermissions> actual  = new Set<OASPermissions>(OASPermissions.values());
        System.assertEquals(expected, actual);
    }
}
