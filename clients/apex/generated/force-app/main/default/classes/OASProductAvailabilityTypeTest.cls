@isTest
private class OASProductAvailabilityTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASProductAvailabilityType> expected = new Set<OASProductAvailabilityType>{
            OASProductAvailabilityType.IN_STOCK,
            OASProductAvailabilityType.OUT_OF_STOCK,
            OASProductAvailabilityType.PREORDER
        };
        Set<OASProductAvailabilityType> actual  = new Set<OASProductAvailabilityType>(OASProductAvailabilityType.values());
        System.assertEquals(expected, actual);
    }
}
