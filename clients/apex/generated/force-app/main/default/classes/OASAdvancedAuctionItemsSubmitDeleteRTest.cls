@isTest
private class OASAdvancedAuctionItemsSubmitDeleteRTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdvancedAuctionItemsSubmitDeleteR advancedAuctionItemsSubmitDeleteRecord1 = OASAdvancedAuctionItemsSubmitDeleteR.getExample();
        OASAdvancedAuctionItemsSubmitDeleteR advancedAuctionItemsSubmitDeleteRecord2 = advancedAuctionItemsSubmitDeleteRecord1;
        OASAdvancedAuctionItemsSubmitDeleteR advancedAuctionItemsSubmitDeleteRecord3 = new OASAdvancedAuctionItemsSubmitDeleteR();
        OASAdvancedAuctionItemsSubmitDeleteR advancedAuctionItemsSubmitDeleteRecord4 = advancedAuctionItemsSubmitDeleteRecord3;

        System.assert(advancedAuctionItemsSubmitDeleteRecord1.equals(advancedAuctionItemsSubmitDeleteRecord2));
        System.assert(advancedAuctionItemsSubmitDeleteRecord2.equals(advancedAuctionItemsSubmitDeleteRecord1));
        System.assert(advancedAuctionItemsSubmitDeleteRecord1.equals(advancedAuctionItemsSubmitDeleteRecord1));
        System.assert(advancedAuctionItemsSubmitDeleteRecord3.equals(advancedAuctionItemsSubmitDeleteRecord4));
        System.assert(advancedAuctionItemsSubmitDeleteRecord4.equals(advancedAuctionItemsSubmitDeleteRecord3));
        System.assert(advancedAuctionItemsSubmitDeleteRecord3.equals(advancedAuctionItemsSubmitDeleteRecord3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdvancedAuctionItemsSubmitDeleteR advancedAuctionItemsSubmitDeleteRecord1 = OASAdvancedAuctionItemsSubmitDeleteR.getExample();
        OASAdvancedAuctionItemsSubmitDeleteR advancedAuctionItemsSubmitDeleteRecord2 = OASAdvancedAuctionItemsSubmitDeleteR.getExample();
        OASAdvancedAuctionItemsSubmitDeleteR advancedAuctionItemsSubmitDeleteRecord3 = new OASAdvancedAuctionItemsSubmitDeleteR();
        OASAdvancedAuctionItemsSubmitDeleteR advancedAuctionItemsSubmitDeleteRecord4 = new OASAdvancedAuctionItemsSubmitDeleteR();

        System.assert(advancedAuctionItemsSubmitDeleteRecord1.equals(advancedAuctionItemsSubmitDeleteRecord2));
        System.assert(advancedAuctionItemsSubmitDeleteRecord2.equals(advancedAuctionItemsSubmitDeleteRecord1));
        System.assert(advancedAuctionItemsSubmitDeleteRecord3.equals(advancedAuctionItemsSubmitDeleteRecord4));
        System.assert(advancedAuctionItemsSubmitDeleteRecord4.equals(advancedAuctionItemsSubmitDeleteRecord3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdvancedAuctionItemsSubmitDeleteR advancedAuctionItemsSubmitDeleteRecord1 = OASAdvancedAuctionItemsSubmitDeleteR.getExample();
        OASAdvancedAuctionItemsSubmitDeleteR advancedAuctionItemsSubmitDeleteRecord2 = new OASAdvancedAuctionItemsSubmitDeleteR();

        System.assertEquals(false, advancedAuctionItemsSubmitDeleteRecord1.equals('foo'));
        System.assertEquals(false, advancedAuctionItemsSubmitDeleteRecord2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdvancedAuctionItemsSubmitDeleteR advancedAuctionItemsSubmitDeleteRecord1 = OASAdvancedAuctionItemsSubmitDeleteR.getExample();
        OASAdvancedAuctionItemsSubmitDeleteR advancedAuctionItemsSubmitDeleteRecord2 = new OASAdvancedAuctionItemsSubmitDeleteR();
        OASAdvancedAuctionItemsSubmitDeleteR advancedAuctionItemsSubmitDeleteRecord3;

        System.assertEquals(false, advancedAuctionItemsSubmitDeleteRecord1.equals(advancedAuctionItemsSubmitDeleteRecord3));
        System.assertEquals(false, advancedAuctionItemsSubmitDeleteRecord2.equals(advancedAuctionItemsSubmitDeleteRecord3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdvancedAuctionItemsSubmitDeleteR advancedAuctionItemsSubmitDeleteRecord1 = OASAdvancedAuctionItemsSubmitDeleteR.getExample();
        OASAdvancedAuctionItemsSubmitDeleteR advancedAuctionItemsSubmitDeleteRecord2 = new OASAdvancedAuctionItemsSubmitDeleteR();

        System.assertEquals(advancedAuctionItemsSubmitDeleteRecord1.hashCode(), advancedAuctionItemsSubmitDeleteRecord1.hashCode());
        System.assertEquals(advancedAuctionItemsSubmitDeleteRecord2.hashCode(), advancedAuctionItemsSubmitDeleteRecord2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdvancedAuctionItemsSubmitDeleteR advancedAuctionItemsSubmitDeleteRecord1 = OASAdvancedAuctionItemsSubmitDeleteR.getExample();
        OASAdvancedAuctionItemsSubmitDeleteR advancedAuctionItemsSubmitDeleteRecord2 = OASAdvancedAuctionItemsSubmitDeleteR.getExample();
        OASAdvancedAuctionItemsSubmitDeleteR advancedAuctionItemsSubmitDeleteRecord3 = new OASAdvancedAuctionItemsSubmitDeleteR();
        OASAdvancedAuctionItemsSubmitDeleteR advancedAuctionItemsSubmitDeleteRecord4 = new OASAdvancedAuctionItemsSubmitDeleteR();

        System.assert(advancedAuctionItemsSubmitDeleteRecord1.equals(advancedAuctionItemsSubmitDeleteRecord2));
        System.assert(advancedAuctionItemsSubmitDeleteRecord3.equals(advancedAuctionItemsSubmitDeleteRecord4));
        System.assertEquals(advancedAuctionItemsSubmitDeleteRecord1.hashCode(), advancedAuctionItemsSubmitDeleteRecord2.hashCode());
        System.assertEquals(advancedAuctionItemsSubmitDeleteRecord3.hashCode(), advancedAuctionItemsSubmitDeleteRecord4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAdvancedAuctionItemsSubmitDeleteR advancedAuctionItemsSubmitDeleteRecord = new OASAdvancedAuctionItemsSubmitDeleteR();
        Map<String, String> x-property-mappings = advancedAuctionItemsSubmitDeleteRecord.getx-property-mappings();
        System.assertEquals('itemId', x-property-mappings.get('item_id'));
    }
}
