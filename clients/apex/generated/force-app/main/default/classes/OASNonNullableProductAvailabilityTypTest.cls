@isTest
private class OASNonNullableProductAvailabilityTypTest {
    @isTest
    private static void allowableValues() {
        Set<OASNonNullableProductAvailabilityTyp> expected = new Set<OASNonNullableProductAvailabilityTyp>{
            OASNonNullableProductAvailabilityTyp.IN_STOCK,
            OASNonNullableProductAvailabilityTyp.OUT_OF_STOCK,
            OASNonNullableProductAvailabilityTyp.PREORDER
        };
        Set<OASNonNullableProductAvailabilityTyp> actual  = new Set<OASNonNullableProductAvailabilityTyp>(OASNonNullableProductAvailabilityTyp.values());
        System.assertEquals(expected, actual);
    }
}
