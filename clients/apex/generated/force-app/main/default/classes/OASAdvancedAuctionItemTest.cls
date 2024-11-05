@isTest
private class OASAdvancedAuctionItemTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdvancedAuctionItem advancedAuctionItem1 = OASAdvancedAuctionItem.getExample();
        OASAdvancedAuctionItem advancedAuctionItem2 = advancedAuctionItem1;
        OASAdvancedAuctionItem advancedAuctionItem3 = new OASAdvancedAuctionItem();
        OASAdvancedAuctionItem advancedAuctionItem4 = advancedAuctionItem3;

        System.assert(advancedAuctionItem1.equals(advancedAuctionItem2));
        System.assert(advancedAuctionItem2.equals(advancedAuctionItem1));
        System.assert(advancedAuctionItem1.equals(advancedAuctionItem1));
        System.assert(advancedAuctionItem3.equals(advancedAuctionItem4));
        System.assert(advancedAuctionItem4.equals(advancedAuctionItem3));
        System.assert(advancedAuctionItem3.equals(advancedAuctionItem3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdvancedAuctionItem advancedAuctionItem1 = OASAdvancedAuctionItem.getExample();
        OASAdvancedAuctionItem advancedAuctionItem2 = OASAdvancedAuctionItem.getExample();
        OASAdvancedAuctionItem advancedAuctionItem3 = new OASAdvancedAuctionItem();
        OASAdvancedAuctionItem advancedAuctionItem4 = new OASAdvancedAuctionItem();

        System.assert(advancedAuctionItem1.equals(advancedAuctionItem2));
        System.assert(advancedAuctionItem2.equals(advancedAuctionItem1));
        System.assert(advancedAuctionItem3.equals(advancedAuctionItem4));
        System.assert(advancedAuctionItem4.equals(advancedAuctionItem3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdvancedAuctionItem advancedAuctionItem1 = OASAdvancedAuctionItem.getExample();
        OASAdvancedAuctionItem advancedAuctionItem2 = new OASAdvancedAuctionItem();

        System.assertEquals(false, advancedAuctionItem1.equals('foo'));
        System.assertEquals(false, advancedAuctionItem2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdvancedAuctionItem advancedAuctionItem1 = OASAdvancedAuctionItem.getExample();
        OASAdvancedAuctionItem advancedAuctionItem2 = new OASAdvancedAuctionItem();
        OASAdvancedAuctionItem advancedAuctionItem3;

        System.assertEquals(false, advancedAuctionItem1.equals(advancedAuctionItem3));
        System.assertEquals(false, advancedAuctionItem2.equals(advancedAuctionItem3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdvancedAuctionItem advancedAuctionItem1 = OASAdvancedAuctionItem.getExample();
        OASAdvancedAuctionItem advancedAuctionItem2 = new OASAdvancedAuctionItem();

        System.assertEquals(advancedAuctionItem1.hashCode(), advancedAuctionItem1.hashCode());
        System.assertEquals(advancedAuctionItem2.hashCode(), advancedAuctionItem2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdvancedAuctionItem advancedAuctionItem1 = OASAdvancedAuctionItem.getExample();
        OASAdvancedAuctionItem advancedAuctionItem2 = OASAdvancedAuctionItem.getExample();
        OASAdvancedAuctionItem advancedAuctionItem3 = new OASAdvancedAuctionItem();
        OASAdvancedAuctionItem advancedAuctionItem4 = new OASAdvancedAuctionItem();

        System.assert(advancedAuctionItem1.equals(advancedAuctionItem2));
        System.assert(advancedAuctionItem3.equals(advancedAuctionItem4));
        System.assertEquals(advancedAuctionItem1.hashCode(), advancedAuctionItem2.hashCode());
        System.assertEquals(advancedAuctionItem3.hashCode(), advancedAuctionItem4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAdvancedAuctionItem advancedAuctionItem = new OASAdvancedAuctionItem();
        Map<String, String> x-property-mappings = advancedAuctionItem.getx-property-mappings();
        System.assertEquals('itemId', x-property-mappings.get('item_id'));
        System.assertEquals('bidOptions', x-property-mappings.get('bid_options'));
    }
}
