@isTest
private class OASAdvancedAuctionItemsGetRecordTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdvancedAuctionItemsGetRecord advancedAuctionItemsGetRecord1 = OASAdvancedAuctionItemsGetRecord.getExample();
        OASAdvancedAuctionItemsGetRecord advancedAuctionItemsGetRecord2 = advancedAuctionItemsGetRecord1;
        OASAdvancedAuctionItemsGetRecord advancedAuctionItemsGetRecord3 = new OASAdvancedAuctionItemsGetRecord();
        OASAdvancedAuctionItemsGetRecord advancedAuctionItemsGetRecord4 = advancedAuctionItemsGetRecord3;

        System.assert(advancedAuctionItemsGetRecord1.equals(advancedAuctionItemsGetRecord2));
        System.assert(advancedAuctionItemsGetRecord2.equals(advancedAuctionItemsGetRecord1));
        System.assert(advancedAuctionItemsGetRecord1.equals(advancedAuctionItemsGetRecord1));
        System.assert(advancedAuctionItemsGetRecord3.equals(advancedAuctionItemsGetRecord4));
        System.assert(advancedAuctionItemsGetRecord4.equals(advancedAuctionItemsGetRecord3));
        System.assert(advancedAuctionItemsGetRecord3.equals(advancedAuctionItemsGetRecord3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdvancedAuctionItemsGetRecord advancedAuctionItemsGetRecord1 = OASAdvancedAuctionItemsGetRecord.getExample();
        OASAdvancedAuctionItemsGetRecord advancedAuctionItemsGetRecord2 = OASAdvancedAuctionItemsGetRecord.getExample();
        OASAdvancedAuctionItemsGetRecord advancedAuctionItemsGetRecord3 = new OASAdvancedAuctionItemsGetRecord();
        OASAdvancedAuctionItemsGetRecord advancedAuctionItemsGetRecord4 = new OASAdvancedAuctionItemsGetRecord();

        System.assert(advancedAuctionItemsGetRecord1.equals(advancedAuctionItemsGetRecord2));
        System.assert(advancedAuctionItemsGetRecord2.equals(advancedAuctionItemsGetRecord1));
        System.assert(advancedAuctionItemsGetRecord3.equals(advancedAuctionItemsGetRecord4));
        System.assert(advancedAuctionItemsGetRecord4.equals(advancedAuctionItemsGetRecord3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdvancedAuctionItemsGetRecord advancedAuctionItemsGetRecord1 = OASAdvancedAuctionItemsGetRecord.getExample();
        OASAdvancedAuctionItemsGetRecord advancedAuctionItemsGetRecord2 = new OASAdvancedAuctionItemsGetRecord();

        System.assertEquals(false, advancedAuctionItemsGetRecord1.equals('foo'));
        System.assertEquals(false, advancedAuctionItemsGetRecord2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdvancedAuctionItemsGetRecord advancedAuctionItemsGetRecord1 = OASAdvancedAuctionItemsGetRecord.getExample();
        OASAdvancedAuctionItemsGetRecord advancedAuctionItemsGetRecord2 = new OASAdvancedAuctionItemsGetRecord();
        OASAdvancedAuctionItemsGetRecord advancedAuctionItemsGetRecord3;

        System.assertEquals(false, advancedAuctionItemsGetRecord1.equals(advancedAuctionItemsGetRecord3));
        System.assertEquals(false, advancedAuctionItemsGetRecord2.equals(advancedAuctionItemsGetRecord3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdvancedAuctionItemsGetRecord advancedAuctionItemsGetRecord1 = OASAdvancedAuctionItemsGetRecord.getExample();
        OASAdvancedAuctionItemsGetRecord advancedAuctionItemsGetRecord2 = new OASAdvancedAuctionItemsGetRecord();

        System.assertEquals(advancedAuctionItemsGetRecord1.hashCode(), advancedAuctionItemsGetRecord1.hashCode());
        System.assertEquals(advancedAuctionItemsGetRecord2.hashCode(), advancedAuctionItemsGetRecord2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdvancedAuctionItemsGetRecord advancedAuctionItemsGetRecord1 = OASAdvancedAuctionItemsGetRecord.getExample();
        OASAdvancedAuctionItemsGetRecord advancedAuctionItemsGetRecord2 = OASAdvancedAuctionItemsGetRecord.getExample();
        OASAdvancedAuctionItemsGetRecord advancedAuctionItemsGetRecord3 = new OASAdvancedAuctionItemsGetRecord();
        OASAdvancedAuctionItemsGetRecord advancedAuctionItemsGetRecord4 = new OASAdvancedAuctionItemsGetRecord();

        System.assert(advancedAuctionItemsGetRecord1.equals(advancedAuctionItemsGetRecord2));
        System.assert(advancedAuctionItemsGetRecord3.equals(advancedAuctionItemsGetRecord4));
        System.assertEquals(advancedAuctionItemsGetRecord1.hashCode(), advancedAuctionItemsGetRecord2.hashCode());
        System.assertEquals(advancedAuctionItemsGetRecord3.hashCode(), advancedAuctionItemsGetRecord4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAdvancedAuctionItemsGetRecord advancedAuctionItemsGetRecord = new OASAdvancedAuctionItemsGetRecord();
        Map<String, String> x-property-mappings = advancedAuctionItemsGetRecord.getx-property-mappings();
        System.assertEquals('itemId', x-property-mappings.get('item_id'));
    }
}
