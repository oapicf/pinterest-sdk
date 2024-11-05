@isTest
private class OASAdvancedAuctionItemsSubmitRecordTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdvancedAuctionItemsSubmitRecord advancedAuctionItemsSubmitRecord1 = OASAdvancedAuctionItemsSubmitRecord.getExample();
        OASAdvancedAuctionItemsSubmitRecord advancedAuctionItemsSubmitRecord2 = advancedAuctionItemsSubmitRecord1;
        OASAdvancedAuctionItemsSubmitRecord advancedAuctionItemsSubmitRecord3 = new OASAdvancedAuctionItemsSubmitRecord();
        OASAdvancedAuctionItemsSubmitRecord advancedAuctionItemsSubmitRecord4 = advancedAuctionItemsSubmitRecord3;

        System.assert(advancedAuctionItemsSubmitRecord1.equals(advancedAuctionItemsSubmitRecord2));
        System.assert(advancedAuctionItemsSubmitRecord2.equals(advancedAuctionItemsSubmitRecord1));
        System.assert(advancedAuctionItemsSubmitRecord1.equals(advancedAuctionItemsSubmitRecord1));
        System.assert(advancedAuctionItemsSubmitRecord3.equals(advancedAuctionItemsSubmitRecord4));
        System.assert(advancedAuctionItemsSubmitRecord4.equals(advancedAuctionItemsSubmitRecord3));
        System.assert(advancedAuctionItemsSubmitRecord3.equals(advancedAuctionItemsSubmitRecord3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdvancedAuctionItemsSubmitRecord advancedAuctionItemsSubmitRecord1 = OASAdvancedAuctionItemsSubmitRecord.getExample();
        OASAdvancedAuctionItemsSubmitRecord advancedAuctionItemsSubmitRecord2 = OASAdvancedAuctionItemsSubmitRecord.getExample();
        OASAdvancedAuctionItemsSubmitRecord advancedAuctionItemsSubmitRecord3 = new OASAdvancedAuctionItemsSubmitRecord();
        OASAdvancedAuctionItemsSubmitRecord advancedAuctionItemsSubmitRecord4 = new OASAdvancedAuctionItemsSubmitRecord();

        System.assert(advancedAuctionItemsSubmitRecord1.equals(advancedAuctionItemsSubmitRecord2));
        System.assert(advancedAuctionItemsSubmitRecord2.equals(advancedAuctionItemsSubmitRecord1));
        System.assert(advancedAuctionItemsSubmitRecord3.equals(advancedAuctionItemsSubmitRecord4));
        System.assert(advancedAuctionItemsSubmitRecord4.equals(advancedAuctionItemsSubmitRecord3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdvancedAuctionItemsSubmitRecord advancedAuctionItemsSubmitRecord1 = OASAdvancedAuctionItemsSubmitRecord.getExample();
        OASAdvancedAuctionItemsSubmitRecord advancedAuctionItemsSubmitRecord2 = new OASAdvancedAuctionItemsSubmitRecord();

        System.assertEquals(false, advancedAuctionItemsSubmitRecord1.equals('foo'));
        System.assertEquals(false, advancedAuctionItemsSubmitRecord2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdvancedAuctionItemsSubmitRecord advancedAuctionItemsSubmitRecord1 = OASAdvancedAuctionItemsSubmitRecord.getExample();
        OASAdvancedAuctionItemsSubmitRecord advancedAuctionItemsSubmitRecord2 = new OASAdvancedAuctionItemsSubmitRecord();
        OASAdvancedAuctionItemsSubmitRecord advancedAuctionItemsSubmitRecord3;

        System.assertEquals(false, advancedAuctionItemsSubmitRecord1.equals(advancedAuctionItemsSubmitRecord3));
        System.assertEquals(false, advancedAuctionItemsSubmitRecord2.equals(advancedAuctionItemsSubmitRecord3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdvancedAuctionItemsSubmitRecord advancedAuctionItemsSubmitRecord1 = OASAdvancedAuctionItemsSubmitRecord.getExample();
        OASAdvancedAuctionItemsSubmitRecord advancedAuctionItemsSubmitRecord2 = new OASAdvancedAuctionItemsSubmitRecord();

        System.assertEquals(advancedAuctionItemsSubmitRecord1.hashCode(), advancedAuctionItemsSubmitRecord1.hashCode());
        System.assertEquals(advancedAuctionItemsSubmitRecord2.hashCode(), advancedAuctionItemsSubmitRecord2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdvancedAuctionItemsSubmitRecord advancedAuctionItemsSubmitRecord1 = OASAdvancedAuctionItemsSubmitRecord.getExample();
        OASAdvancedAuctionItemsSubmitRecord advancedAuctionItemsSubmitRecord2 = OASAdvancedAuctionItemsSubmitRecord.getExample();
        OASAdvancedAuctionItemsSubmitRecord advancedAuctionItemsSubmitRecord3 = new OASAdvancedAuctionItemsSubmitRecord();
        OASAdvancedAuctionItemsSubmitRecord advancedAuctionItemsSubmitRecord4 = new OASAdvancedAuctionItemsSubmitRecord();

        System.assert(advancedAuctionItemsSubmitRecord1.equals(advancedAuctionItemsSubmitRecord2));
        System.assert(advancedAuctionItemsSubmitRecord3.equals(advancedAuctionItemsSubmitRecord4));
        System.assertEquals(advancedAuctionItemsSubmitRecord1.hashCode(), advancedAuctionItemsSubmitRecord2.hashCode());
        System.assertEquals(advancedAuctionItemsSubmitRecord3.hashCode(), advancedAuctionItemsSubmitRecord4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAdvancedAuctionItemsSubmitRecord advancedAuctionItemsSubmitRecord = new OASAdvancedAuctionItemsSubmitRecord();
        Map<String, String> x-property-mappings = advancedAuctionItemsSubmitRecord.getx-property-mappings();
        System.assertEquals('itemId', x-property-mappings.get('item_id'));
        System.assertEquals('bidOptions', x-property-mappings.get('bid_options'));
        System.assertEquals('updateMask', x-property-mappings.get('update_mask'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAdvancedAuctionItemsSubmitRecord advancedAuctionItemsSubmitRecord = new OASAdvancedAuctionItemsSubmitRecord();
        System.assertEquals(new List<OASUpdateMaskBidOptionField>(), advancedAuctionItemsSubmitRecord.updateMask);
        System.assertEquals(null, advancedAuctionItemsSubmitRecord.operation);
        System.assertEquals(null, advancedAuctionItemsSubmitRecord.itemId);
        System.assertEquals(null, advancedAuctionItemsSubmitRecord.country);
        System.assertEquals(null, advancedAuctionItemsSubmitRecord.language);
        System.assertEquals(null, advancedAuctionItemsSubmitRecord.bidOptions);
    }
}
