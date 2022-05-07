@isTest
private class OASPacingDeliveryTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASPacingDeliveryType> expected = new Set<OASPacingDeliveryType>{
            OASPacingDeliveryType.STANDARD,
            OASPacingDeliveryType.ACCELERATED
        };
        Set<OASPacingDeliveryType> actual  = new Set<OASPacingDeliveryType>(OASPacingDeliveryType.values());
        System.assertEquals(expected, actual);
    }
}
