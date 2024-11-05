@isTest
private class OASUpdateMaskBidOptionFieldTest {
    @isTest
    private static void allowableValues() {
        Set<OASUpdateMaskBidOptionField> expected = new Set<OASUpdateMaskBidOptionField>{
            OASUpdateMaskBidOptionField.BID,
            OASUpdateMaskBidOptionField.APP_TYPE_BID_MULTIPLIER_SET,
            OASUpdateMaskBidOptionField.PLACEMENT_BID_MULTIPLIER_SET
        };
        Set<OASUpdateMaskBidOptionField> actual  = new Set<OASUpdateMaskBidOptionField>(OASUpdateMaskBidOptionField.values());
        System.assertEquals(expected, actual);
    }
}
