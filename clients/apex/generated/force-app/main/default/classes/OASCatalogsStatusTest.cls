@isTest
private class OASCatalogsStatusTest {
    @isTest
    private static void allowableValues() {
        Set<OASCatalogsStatus> expected = new Set<OASCatalogsStatus>{
            OASCatalogsStatus.ACTIVE,
            OASCatalogsStatus.INACTIVE
        };
        Set<OASCatalogsStatus> actual  = new Set<OASCatalogsStatus>(OASCatalogsStatus.values());
        System.assertEquals(expected, actual);
    }
}
