@isTest
private class OASLeadsExportStatusTest {
    @isTest
    private static void allowableValues() {
        Set<OASLeadsExportStatus> expected = new Set<OASLeadsExportStatus>{
            OASLeadsExportStatus.IN_PROGRESS,
            OASLeadsExportStatus.FINISHED,
            OASLeadsExportStatus.FAILED
        };
        Set<OASLeadsExportStatus> actual  = new Set<OASLeadsExportStatus>(OASLeadsExportStatus.values());
        System.assertEquals(expected, actual);
    }
}
