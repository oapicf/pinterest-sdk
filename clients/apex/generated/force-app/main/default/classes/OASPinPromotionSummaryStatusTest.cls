@isTest
private class OASPinPromotionSummaryStatusTest {
    @isTest
    private static void allowableValues() {
        Set<OASPinPromotionSummaryStatus> expected = new Set<OASPinPromotionSummaryStatus>{
            OASPinPromotionSummaryStatus.APPROVED,
            OASPinPromotionSummaryStatus.PAUSED,
            OASPinPromotionSummaryStatus.PENDING,
            OASPinPromotionSummaryStatus.REJECTED,
            OASPinPromotionSummaryStatus.ADVERTISER_DISABLED,
            OASPinPromotionSummaryStatus.ARCHIVED
        };
        Set<OASPinPromotionSummaryStatus> actual  = new Set<OASPinPromotionSummaryStatus>(OASPinPromotionSummaryStatus.values());
        System.assertEquals(expected, actual);
    }
}
