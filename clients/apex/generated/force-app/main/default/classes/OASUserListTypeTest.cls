@isTest
private class OASUserListTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASUserListType> expected = new Set<OASUserListType>{
            OASUserListType.EMAIL,
            OASUserListType.IDFA,
            OASUserListType.MAID,
            OASUserListType.LR_ID,
            OASUserListType.DLX_ID,
            OASUserListType.HASHED_PINNER_ID
        };
        Set<OASUserListType> actual  = new Set<OASUserListType>(OASUserListType.values());
        System.assertEquals(expected, actual);
    }
}
