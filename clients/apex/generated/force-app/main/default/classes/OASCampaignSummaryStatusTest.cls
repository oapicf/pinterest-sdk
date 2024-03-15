@isTest
private class OASCampaignSummaryStatusTest {
    @isTest
    private static void allowableValues() {
        Set<OASCampaignSummaryStatus> expected = new Set<OASCampaignSummaryStatus>{
            OASCampaignSummaryStatus.RUNNING,
            OASCampaignSummaryStatus.PAUSED,
            OASCampaignSummaryStatus.NOT_STARTED,
            OASCampaignSummaryStatus.COMPLETED,
            OASCampaignSummaryStatus.ADVERTISER_DISABLED,
            OASCampaignSummaryStatus.ARCHIVED,
            OASCampaignSummaryStatus.DRAFT,
            OASCampaignSummaryStatus.DELETED_DRAFT
        };
        Set<OASCampaignSummaryStatus> actual  = new Set<OASCampaignSummaryStatus>(OASCampaignSummaryStatus.values());
        System.assertEquals(expected, actual);
    }
}
