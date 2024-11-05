@isTest
private class OASPermissionsWithOwnerTest {
    @isTest
    private static void allowableValues() {
        Set<OASPermissionsWithOwner> expected = new Set<OASPermissionsWithOwner>{
            OASPermissionsWithOwner.ADMIN,
            OASPermissionsWithOwner.ANALYST,
            OASPermissionsWithOwner.FINANCE_MANAGER,
            OASPermissionsWithOwner.AUDIENCE_MANAGER,
            OASPermissionsWithOwner.CAMPAIGN_MANAGER,
            OASPermissionsWithOwner.CATALOGS_MANAGER,
            OASPermissionsWithOwner.CATALOGS_VIEWER,
            OASPermissionsWithOwner.PROFILE_PUBLISHER,
            OASPermissionsWithOwner.OWNER
        };
        Set<OASPermissionsWithOwner> actual  = new Set<OASPermissionsWithOwner>(OASPermissionsWithOwner.values());
        System.assertEquals(expected, actual);
    }
}
