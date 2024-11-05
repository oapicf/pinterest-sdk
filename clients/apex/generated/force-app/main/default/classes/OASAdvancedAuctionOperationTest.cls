@isTest
private class OASAdvancedAuctionOperationTest {
    @isTest
    private static void allowableValues() {
        Set<OASAdvancedAuctionOperation> expected = new Set<OASAdvancedAuctionOperation>{
            OASAdvancedAuctionOperation.UPSERT,
            OASAdvancedAuctionOperation.DELETE
        };
        Set<OASAdvancedAuctionOperation> actual  = new Set<OASAdvancedAuctionOperation>(OASAdvancedAuctionOperation.values());
        System.assertEquals(expected, actual);
    }
}
