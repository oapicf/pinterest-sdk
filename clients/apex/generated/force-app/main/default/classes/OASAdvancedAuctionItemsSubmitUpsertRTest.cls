@isTest
private class OASAdvancedAuctionItemsSubmitUpsertRTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdvancedAuctionItemsSubmitUpsertR advancedAuctionItemsSubmitUpsertRecord1 = OASAdvancedAuctionItemsSubmitUpsertR.getExample();
        OASAdvancedAuctionItemsSubmitUpsertR advancedAuctionItemsSubmitUpsertRecord2 = advancedAuctionItemsSubmitUpsertRecord1;
        OASAdvancedAuctionItemsSubmitUpsertR advancedAuctionItemsSubmitUpsertRecord3 = new OASAdvancedAuctionItemsSubmitUpsertR();
        OASAdvancedAuctionItemsSubmitUpsertR advancedAuctionItemsSubmitUpsertRecord4 = advancedAuctionItemsSubmitUpsertRecord3;

        System.assert(advancedAuctionItemsSubmitUpsertRecord1.equals(advancedAuctionItemsSubmitUpsertRecord2));
        System.assert(advancedAuctionItemsSubmitUpsertRecord2.equals(advancedAuctionItemsSubmitUpsertRecord1));
        System.assert(advancedAuctionItemsSubmitUpsertRecord1.equals(advancedAuctionItemsSubmitUpsertRecord1));
        System.assert(advancedAuctionItemsSubmitUpsertRecord3.equals(advancedAuctionItemsSubmitUpsertRecord4));
        System.assert(advancedAuctionItemsSubmitUpsertRecord4.equals(advancedAuctionItemsSubmitUpsertRecord3));
        System.assert(advancedAuctionItemsSubmitUpsertRecord3.equals(advancedAuctionItemsSubmitUpsertRecord3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdvancedAuctionItemsSubmitUpsertR advancedAuctionItemsSubmitUpsertRecord1 = OASAdvancedAuctionItemsSubmitUpsertR.getExample();
        OASAdvancedAuctionItemsSubmitUpsertR advancedAuctionItemsSubmitUpsertRecord2 = OASAdvancedAuctionItemsSubmitUpsertR.getExample();
        OASAdvancedAuctionItemsSubmitUpsertR advancedAuctionItemsSubmitUpsertRecord3 = new OASAdvancedAuctionItemsSubmitUpsertR();
        OASAdvancedAuctionItemsSubmitUpsertR advancedAuctionItemsSubmitUpsertRecord4 = new OASAdvancedAuctionItemsSubmitUpsertR();

        System.assert(advancedAuctionItemsSubmitUpsertRecord1.equals(advancedAuctionItemsSubmitUpsertRecord2));
        System.assert(advancedAuctionItemsSubmitUpsertRecord2.equals(advancedAuctionItemsSubmitUpsertRecord1));
        System.assert(advancedAuctionItemsSubmitUpsertRecord3.equals(advancedAuctionItemsSubmitUpsertRecord4));
        System.assert(advancedAuctionItemsSubmitUpsertRecord4.equals(advancedAuctionItemsSubmitUpsertRecord3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdvancedAuctionItemsSubmitUpsertR advancedAuctionItemsSubmitUpsertRecord1 = OASAdvancedAuctionItemsSubmitUpsertR.getExample();
        OASAdvancedAuctionItemsSubmitUpsertR advancedAuctionItemsSubmitUpsertRecord2 = new OASAdvancedAuctionItemsSubmitUpsertR();

        System.assertEquals(false, advancedAuctionItemsSubmitUpsertRecord1.equals('foo'));
        System.assertEquals(false, advancedAuctionItemsSubmitUpsertRecord2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdvancedAuctionItemsSubmitUpsertR advancedAuctionItemsSubmitUpsertRecord1 = OASAdvancedAuctionItemsSubmitUpsertR.getExample();
        OASAdvancedAuctionItemsSubmitUpsertR advancedAuctionItemsSubmitUpsertRecord2 = new OASAdvancedAuctionItemsSubmitUpsertR();
        OASAdvancedAuctionItemsSubmitUpsertR advancedAuctionItemsSubmitUpsertRecord3;

        System.assertEquals(false, advancedAuctionItemsSubmitUpsertRecord1.equals(advancedAuctionItemsSubmitUpsertRecord3));
        System.assertEquals(false, advancedAuctionItemsSubmitUpsertRecord2.equals(advancedAuctionItemsSubmitUpsertRecord3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdvancedAuctionItemsSubmitUpsertR advancedAuctionItemsSubmitUpsertRecord1 = OASAdvancedAuctionItemsSubmitUpsertR.getExample();
        OASAdvancedAuctionItemsSubmitUpsertR advancedAuctionItemsSubmitUpsertRecord2 = new OASAdvancedAuctionItemsSubmitUpsertR();

        System.assertEquals(advancedAuctionItemsSubmitUpsertRecord1.hashCode(), advancedAuctionItemsSubmitUpsertRecord1.hashCode());
        System.assertEquals(advancedAuctionItemsSubmitUpsertRecord2.hashCode(), advancedAuctionItemsSubmitUpsertRecord2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdvancedAuctionItemsSubmitUpsertR advancedAuctionItemsSubmitUpsertRecord1 = OASAdvancedAuctionItemsSubmitUpsertR.getExample();
        OASAdvancedAuctionItemsSubmitUpsertR advancedAuctionItemsSubmitUpsertRecord2 = OASAdvancedAuctionItemsSubmitUpsertR.getExample();
        OASAdvancedAuctionItemsSubmitUpsertR advancedAuctionItemsSubmitUpsertRecord3 = new OASAdvancedAuctionItemsSubmitUpsertR();
        OASAdvancedAuctionItemsSubmitUpsertR advancedAuctionItemsSubmitUpsertRecord4 = new OASAdvancedAuctionItemsSubmitUpsertR();

        System.assert(advancedAuctionItemsSubmitUpsertRecord1.equals(advancedAuctionItemsSubmitUpsertRecord2));
        System.assert(advancedAuctionItemsSubmitUpsertRecord3.equals(advancedAuctionItemsSubmitUpsertRecord4));
        System.assertEquals(advancedAuctionItemsSubmitUpsertRecord1.hashCode(), advancedAuctionItemsSubmitUpsertRecord2.hashCode());
        System.assertEquals(advancedAuctionItemsSubmitUpsertRecord3.hashCode(), advancedAuctionItemsSubmitUpsertRecord4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAdvancedAuctionItemsSubmitUpsertR advancedAuctionItemsSubmitUpsertRecord = new OASAdvancedAuctionItemsSubmitUpsertR();
        Map<String, String> x-property-mappings = advancedAuctionItemsSubmitUpsertRecord.getx-property-mappings();
        System.assertEquals('itemId', x-property-mappings.get('item_id'));
        System.assertEquals('bidOptions', x-property-mappings.get('bid_options'));
        System.assertEquals('updateMask', x-property-mappings.get('update_mask'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAdvancedAuctionItemsSubmitUpsertR advancedAuctionItemsSubmitUpsertRecord = new OASAdvancedAuctionItemsSubmitUpsertR();
        System.assertEquals(new List<OASUpdateMaskBidOptionField>(), advancedAuctionItemsSubmitUpsertRecord.updateMask);
        System.assertEquals(null, advancedAuctionItemsSubmitUpsertRecord.itemId);
        System.assertEquals(null, advancedAuctionItemsSubmitUpsertRecord.country);
        System.assertEquals(null, advancedAuctionItemsSubmitUpsertRecord.language);
        System.assertEquals(null, advancedAuctionItemsSubmitUpsertRecord.bidOptions);
    }
}
