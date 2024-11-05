@isTest
private class OASInviteTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASInviteType> expected = new Set<OASInviteType>{
            OASInviteType.MEMBER_INVITE,
            OASInviteType.PARTNER_INVITE,
            OASInviteType.PARTNER_REQUEST
        };
        Set<OASInviteType> actual  = new Set<OASInviteType>(OASInviteType.values());
        System.assertEquals(expected, actual);
    }
}
