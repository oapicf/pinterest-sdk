@isTest
private class OASInviteStatusTest {
    @isTest
    private static void allowableValues() {
        Set<OASInviteStatus> expected = new Set<OASInviteStatus>{
            OASInviteStatus.PENDING,
            OASInviteStatus.ACCEPTED,
            OASInviteStatus.DECLINED,
            OASInviteStatus.CANCELLED,
            OASInviteStatus.EXPIRED
        };
        Set<OASInviteStatus> actual  = new Set<OASInviteStatus>(OASInviteStatus.values());
        System.assertEquals(expected, actual);
    }
}
