@isTest
private class OASAdvancedAuctionBidOptionsTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdvancedAuctionBidOptions advancedAuctionBidOptions1 = OASAdvancedAuctionBidOptions.getExample();
        OASAdvancedAuctionBidOptions advancedAuctionBidOptions2 = advancedAuctionBidOptions1;
        OASAdvancedAuctionBidOptions advancedAuctionBidOptions3 = new OASAdvancedAuctionBidOptions();
        OASAdvancedAuctionBidOptions advancedAuctionBidOptions4 = advancedAuctionBidOptions3;

        System.assert(advancedAuctionBidOptions1.equals(advancedAuctionBidOptions2));
        System.assert(advancedAuctionBidOptions2.equals(advancedAuctionBidOptions1));
        System.assert(advancedAuctionBidOptions1.equals(advancedAuctionBidOptions1));
        System.assert(advancedAuctionBidOptions3.equals(advancedAuctionBidOptions4));
        System.assert(advancedAuctionBidOptions4.equals(advancedAuctionBidOptions3));
        System.assert(advancedAuctionBidOptions3.equals(advancedAuctionBidOptions3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdvancedAuctionBidOptions advancedAuctionBidOptions1 = OASAdvancedAuctionBidOptions.getExample();
        OASAdvancedAuctionBidOptions advancedAuctionBidOptions2 = OASAdvancedAuctionBidOptions.getExample();
        OASAdvancedAuctionBidOptions advancedAuctionBidOptions3 = new OASAdvancedAuctionBidOptions();
        OASAdvancedAuctionBidOptions advancedAuctionBidOptions4 = new OASAdvancedAuctionBidOptions();

        System.assert(advancedAuctionBidOptions1.equals(advancedAuctionBidOptions2));
        System.assert(advancedAuctionBidOptions2.equals(advancedAuctionBidOptions1));
        System.assert(advancedAuctionBidOptions3.equals(advancedAuctionBidOptions4));
        System.assert(advancedAuctionBidOptions4.equals(advancedAuctionBidOptions3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdvancedAuctionBidOptions advancedAuctionBidOptions1 = OASAdvancedAuctionBidOptions.getExample();
        OASAdvancedAuctionBidOptions advancedAuctionBidOptions2 = new OASAdvancedAuctionBidOptions();

        System.assertEquals(false, advancedAuctionBidOptions1.equals('foo'));
        System.assertEquals(false, advancedAuctionBidOptions2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdvancedAuctionBidOptions advancedAuctionBidOptions1 = OASAdvancedAuctionBidOptions.getExample();
        OASAdvancedAuctionBidOptions advancedAuctionBidOptions2 = new OASAdvancedAuctionBidOptions();
        OASAdvancedAuctionBidOptions advancedAuctionBidOptions3;

        System.assertEquals(false, advancedAuctionBidOptions1.equals(advancedAuctionBidOptions3));
        System.assertEquals(false, advancedAuctionBidOptions2.equals(advancedAuctionBidOptions3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdvancedAuctionBidOptions advancedAuctionBidOptions1 = OASAdvancedAuctionBidOptions.getExample();
        OASAdvancedAuctionBidOptions advancedAuctionBidOptions2 = new OASAdvancedAuctionBidOptions();

        System.assertEquals(advancedAuctionBidOptions1.hashCode(), advancedAuctionBidOptions1.hashCode());
        System.assertEquals(advancedAuctionBidOptions2.hashCode(), advancedAuctionBidOptions2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdvancedAuctionBidOptions advancedAuctionBidOptions1 = OASAdvancedAuctionBidOptions.getExample();
        OASAdvancedAuctionBidOptions advancedAuctionBidOptions2 = OASAdvancedAuctionBidOptions.getExample();
        OASAdvancedAuctionBidOptions advancedAuctionBidOptions3 = new OASAdvancedAuctionBidOptions();
        OASAdvancedAuctionBidOptions advancedAuctionBidOptions4 = new OASAdvancedAuctionBidOptions();

        System.assert(advancedAuctionBidOptions1.equals(advancedAuctionBidOptions2));
        System.assert(advancedAuctionBidOptions3.equals(advancedAuctionBidOptions4));
        System.assertEquals(advancedAuctionBidOptions1.hashCode(), advancedAuctionBidOptions2.hashCode());
        System.assertEquals(advancedAuctionBidOptions3.hashCode(), advancedAuctionBidOptions4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAdvancedAuctionBidOptions advancedAuctionBidOptions = new OASAdvancedAuctionBidOptions();
        Map<String, String> x-property-mappings = advancedAuctionBidOptions.getx-property-mappings();
        System.assertEquals('bidInMicroCurrency', x-property-mappings.get('bid_in_micro_currency'));
        System.assertEquals('appTypeMultipliers', x-property-mappings.get('app_type_multipliers'));
        System.assertEquals('placementMultipliers', x-property-mappings.get('placement_multipliers'));
    }
}
