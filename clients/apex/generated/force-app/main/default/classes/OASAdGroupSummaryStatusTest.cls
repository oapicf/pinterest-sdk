@isTest
private class OASAdGroupSummaryStatusTest {
    @isTest
    private static void allowableValues() {
        Set<OASAdGroupSummaryStatus> expected = new Set<OASAdGroupSummaryStatus>{
            OASAdGroupSummaryStatus.RUNNING,
            OASAdGroupSummaryStatus.PAUSED,
            OASAdGroupSummaryStatus.NOT_STARTED,
            OASAdGroupSummaryStatus.COMPLETED,
            OASAdGroupSummaryStatus.ADVERTISER_DISABLED,
            OASAdGroupSummaryStatus.ARCHIVED
        };
        Set<OASAdGroupSummaryStatus> actual  = new Set<OASAdGroupSummaryStatus>(OASAdGroupSummaryStatus.values());
        System.assertEquals(expected, actual);
    }
}
