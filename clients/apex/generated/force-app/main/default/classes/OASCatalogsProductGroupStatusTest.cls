@isTest
private class OASCatalogsProductGroupStatusTest {
    @isTest
    private static void allowableValues() {
        Set<OASCatalogsProductGroupStatus> expected = new Set<OASCatalogsProductGroupStatus>{
            OASCatalogsProductGroupStatus.ACTIVE,
            OASCatalogsProductGroupStatus.INACTIVE
        };
        Set<OASCatalogsProductGroupStatus> actual  = new Set<OASCatalogsProductGroupStatus>(OASCatalogsProductGroupStatus.values());
        System.assertEquals(expected, actual);
    }
}
