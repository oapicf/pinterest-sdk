@isTest
private class OASUserFollowingFeedTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASUserFollowingFeedType> expected = new Set<OASUserFollowingFeedType>{
            OASUserFollowingFeedType.ALL,
            OASUserFollowingFeedType.RANKED,
            OASUserFollowingFeedType.CREATOR_ONLY,
            OASUserFollowingFeedType.RANKED_CREATOR_ONLY
        };
        Set<OASUserFollowingFeedType> actual  = new Set<OASUserFollowingFeedType>(OASUserFollowingFeedType.values());
        System.assertEquals(expected, actual);
    }
}
