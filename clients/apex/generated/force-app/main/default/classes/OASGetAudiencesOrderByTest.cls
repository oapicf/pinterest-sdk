@isTest
private class OASGetAudiencesOrderByTest {
    @isTest
    private static void allowableValues() {
        Set<OASGetAudiencesOrderBy> expected = new Set<OASGetAudiencesOrderBy>{
            OASGetAudiencesOrderBy.NONE,
            OASGetAudiencesOrderBy.ID,
            OASGetAudiencesOrderBy.SIZE,
            OASGetAudiencesOrderBy.CREATION_DATE,
            OASGetAudiencesOrderBy.UPDATED_TIME,
            OASGetAudiencesOrderBy.NAME,
            OASGetAudiencesOrderBy.STATUS,
            OASGetAudiencesOrderBy.TYPE
        };
        Set<OASGetAudiencesOrderBy> actual  = new Set<OASGetAudiencesOrderBy>(OASGetAudiencesOrderBy.values());
        System.assertEquals(expected, actual);
    }
}
