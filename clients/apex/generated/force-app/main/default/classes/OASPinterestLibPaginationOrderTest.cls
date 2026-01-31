@isTest
private class OASPinterestLibPaginationOrderTest {
    @isTest
    private static void allowableValues() {
        Set<OASPinterestLibPaginationOrder> expected = new Set<OASPinterestLibPaginationOrder>{
            OASPinterestLibPaginationOrder.ASCENDING,
            OASPinterestLibPaginationOrder.DESCENDING
        };
        Set<OASPinterestLibPaginationOrder> actual  = new Set<OASPinterestLibPaginationOrder>(OASPinterestLibPaginationOrder.values());
        System.assertEquals(expected, actual);
    }
}
