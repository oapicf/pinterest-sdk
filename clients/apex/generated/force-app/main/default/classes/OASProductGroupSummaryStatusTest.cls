@isTest
private class OASProductGroupSummaryStatusTest {
    @isTest
    private static void allowableValues() {
        Set<OASProductGroupSummaryStatus> expected = new Set<OASProductGroupSummaryStatus>{
            OASProductGroupSummaryStatus.RUNNING,
            OASProductGroupSummaryStatus.PAUSED,
            OASProductGroupSummaryStatus.EXCLUDED,
            OASProductGroupSummaryStatus.ARCHIVED
        };
        Set<OASProductGroupSummaryStatus> actual  = new Set<OASProductGroupSummaryStatus>(OASProductGroupSummaryStatus.values());
        System.assertEquals(expected, actual);
    }
}
