@isTest
private class OASAdvancedAuctionProcessedItemTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdvancedAuctionProcessedItem advancedAuctionProcessedItem1 = OASAdvancedAuctionProcessedItem.getExample();
        OASAdvancedAuctionProcessedItem advancedAuctionProcessedItem2 = advancedAuctionProcessedItem1;
        OASAdvancedAuctionProcessedItem advancedAuctionProcessedItem3 = new OASAdvancedAuctionProcessedItem();
        OASAdvancedAuctionProcessedItem advancedAuctionProcessedItem4 = advancedAuctionProcessedItem3;

        System.assert(advancedAuctionProcessedItem1.equals(advancedAuctionProcessedItem2));
        System.assert(advancedAuctionProcessedItem2.equals(advancedAuctionProcessedItem1));
        System.assert(advancedAuctionProcessedItem1.equals(advancedAuctionProcessedItem1));
        System.assert(advancedAuctionProcessedItem3.equals(advancedAuctionProcessedItem4));
        System.assert(advancedAuctionProcessedItem4.equals(advancedAuctionProcessedItem3));
        System.assert(advancedAuctionProcessedItem3.equals(advancedAuctionProcessedItem3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdvancedAuctionProcessedItem advancedAuctionProcessedItem1 = OASAdvancedAuctionProcessedItem.getExample();
        OASAdvancedAuctionProcessedItem advancedAuctionProcessedItem2 = OASAdvancedAuctionProcessedItem.getExample();
        OASAdvancedAuctionProcessedItem advancedAuctionProcessedItem3 = new OASAdvancedAuctionProcessedItem();
        OASAdvancedAuctionProcessedItem advancedAuctionProcessedItem4 = new OASAdvancedAuctionProcessedItem();

        System.assert(advancedAuctionProcessedItem1.equals(advancedAuctionProcessedItem2));
        System.assert(advancedAuctionProcessedItem2.equals(advancedAuctionProcessedItem1));
        System.assert(advancedAuctionProcessedItem3.equals(advancedAuctionProcessedItem4));
        System.assert(advancedAuctionProcessedItem4.equals(advancedAuctionProcessedItem3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdvancedAuctionProcessedItem advancedAuctionProcessedItem1 = OASAdvancedAuctionProcessedItem.getExample();
        OASAdvancedAuctionProcessedItem advancedAuctionProcessedItem2 = new OASAdvancedAuctionProcessedItem();

        System.assertEquals(false, advancedAuctionProcessedItem1.equals('foo'));
        System.assertEquals(false, advancedAuctionProcessedItem2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdvancedAuctionProcessedItem advancedAuctionProcessedItem1 = OASAdvancedAuctionProcessedItem.getExample();
        OASAdvancedAuctionProcessedItem advancedAuctionProcessedItem2 = new OASAdvancedAuctionProcessedItem();
        OASAdvancedAuctionProcessedItem advancedAuctionProcessedItem3;

        System.assertEquals(false, advancedAuctionProcessedItem1.equals(advancedAuctionProcessedItem3));
        System.assertEquals(false, advancedAuctionProcessedItem2.equals(advancedAuctionProcessedItem3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdvancedAuctionProcessedItem advancedAuctionProcessedItem1 = OASAdvancedAuctionProcessedItem.getExample();
        OASAdvancedAuctionProcessedItem advancedAuctionProcessedItem2 = new OASAdvancedAuctionProcessedItem();

        System.assertEquals(advancedAuctionProcessedItem1.hashCode(), advancedAuctionProcessedItem1.hashCode());
        System.assertEquals(advancedAuctionProcessedItem2.hashCode(), advancedAuctionProcessedItem2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdvancedAuctionProcessedItem advancedAuctionProcessedItem1 = OASAdvancedAuctionProcessedItem.getExample();
        OASAdvancedAuctionProcessedItem advancedAuctionProcessedItem2 = OASAdvancedAuctionProcessedItem.getExample();
        OASAdvancedAuctionProcessedItem advancedAuctionProcessedItem3 = new OASAdvancedAuctionProcessedItem();
        OASAdvancedAuctionProcessedItem advancedAuctionProcessedItem4 = new OASAdvancedAuctionProcessedItem();

        System.assert(advancedAuctionProcessedItem1.equals(advancedAuctionProcessedItem2));
        System.assert(advancedAuctionProcessedItem3.equals(advancedAuctionProcessedItem4));
        System.assertEquals(advancedAuctionProcessedItem1.hashCode(), advancedAuctionProcessedItem2.hashCode());
        System.assertEquals(advancedAuctionProcessedItem3.hashCode(), advancedAuctionProcessedItem4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAdvancedAuctionProcessedItem advancedAuctionProcessedItem = new OASAdvancedAuctionProcessedItem();
        Map<String, String> x-property-mappings = advancedAuctionProcessedItem.getx-property-mappings();
        System.assertEquals('itemId', x-property-mappings.get('item_id'));
        System.assertEquals('bidOptions', x-property-mappings.get('bid_options'));
        System.assertEquals('updateMask', x-property-mappings.get('update_mask'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAdvancedAuctionProcessedItem advancedAuctionProcessedItem = new OASAdvancedAuctionProcessedItem();
        System.assertEquals(new List<OASUpdateMaskBidOptionField>(), advancedAuctionProcessedItem.updateMask);
        System.assertEquals(new List<OASAdvancedAuctionOperationError>(), advancedAuctionProcessedItem.errors);
        System.assertEquals(null, advancedAuctionProcessedItem.operation);
        System.assertEquals(null, advancedAuctionProcessedItem.itemId);
        System.assertEquals(null, advancedAuctionProcessedItem.country);
        System.assertEquals(null, advancedAuctionProcessedItem.language);
        System.assertEquals(null, advancedAuctionProcessedItem.bidOptions);
    }
}
