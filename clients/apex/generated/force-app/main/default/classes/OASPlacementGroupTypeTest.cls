@isTest
private class OASPlacementGroupTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASPlacementGroupType> expected = new Set<OASPlacementGroupType>{
            OASPlacementGroupType.ALL,
            OASPlacementGroupType.SEARCH,
            OASPlacementGroupType.BROWSE,
            OASPlacementGroupType.OTHER
        };
        Set<OASPlacementGroupType> actual  = new Set<OASPlacementGroupType>(OASPlacementGroupType.values());
        System.assertEquals(expected, actual);
    }
}
