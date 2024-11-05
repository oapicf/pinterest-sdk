@isTest
private class OASAdvancedAuctionProcessedItemsTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdvancedAuctionProcessedItems advancedAuctionProcessedItems1 = OASAdvancedAuctionProcessedItems.getExample();
        OASAdvancedAuctionProcessedItems advancedAuctionProcessedItems2 = advancedAuctionProcessedItems1;
        OASAdvancedAuctionProcessedItems advancedAuctionProcessedItems3 = new OASAdvancedAuctionProcessedItems();
        OASAdvancedAuctionProcessedItems advancedAuctionProcessedItems4 = advancedAuctionProcessedItems3;

        System.assert(advancedAuctionProcessedItems1.equals(advancedAuctionProcessedItems2));
        System.assert(advancedAuctionProcessedItems2.equals(advancedAuctionProcessedItems1));
        System.assert(advancedAuctionProcessedItems1.equals(advancedAuctionProcessedItems1));
        System.assert(advancedAuctionProcessedItems3.equals(advancedAuctionProcessedItems4));
        System.assert(advancedAuctionProcessedItems4.equals(advancedAuctionProcessedItems3));
        System.assert(advancedAuctionProcessedItems3.equals(advancedAuctionProcessedItems3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdvancedAuctionProcessedItems advancedAuctionProcessedItems1 = OASAdvancedAuctionProcessedItems.getExample();
        OASAdvancedAuctionProcessedItems advancedAuctionProcessedItems2 = OASAdvancedAuctionProcessedItems.getExample();
        OASAdvancedAuctionProcessedItems advancedAuctionProcessedItems3 = new OASAdvancedAuctionProcessedItems();
        OASAdvancedAuctionProcessedItems advancedAuctionProcessedItems4 = new OASAdvancedAuctionProcessedItems();

        System.assert(advancedAuctionProcessedItems1.equals(advancedAuctionProcessedItems2));
        System.assert(advancedAuctionProcessedItems2.equals(advancedAuctionProcessedItems1));
        System.assert(advancedAuctionProcessedItems3.equals(advancedAuctionProcessedItems4));
        System.assert(advancedAuctionProcessedItems4.equals(advancedAuctionProcessedItems3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdvancedAuctionProcessedItems advancedAuctionProcessedItems1 = OASAdvancedAuctionProcessedItems.getExample();
        OASAdvancedAuctionProcessedItems advancedAuctionProcessedItems2 = new OASAdvancedAuctionProcessedItems();

        System.assertEquals(false, advancedAuctionProcessedItems1.equals('foo'));
        System.assertEquals(false, advancedAuctionProcessedItems2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdvancedAuctionProcessedItems advancedAuctionProcessedItems1 = OASAdvancedAuctionProcessedItems.getExample();
        OASAdvancedAuctionProcessedItems advancedAuctionProcessedItems2 = new OASAdvancedAuctionProcessedItems();
        OASAdvancedAuctionProcessedItems advancedAuctionProcessedItems3;

        System.assertEquals(false, advancedAuctionProcessedItems1.equals(advancedAuctionProcessedItems3));
        System.assertEquals(false, advancedAuctionProcessedItems2.equals(advancedAuctionProcessedItems3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdvancedAuctionProcessedItems advancedAuctionProcessedItems1 = OASAdvancedAuctionProcessedItems.getExample();
        OASAdvancedAuctionProcessedItems advancedAuctionProcessedItems2 = new OASAdvancedAuctionProcessedItems();

        System.assertEquals(advancedAuctionProcessedItems1.hashCode(), advancedAuctionProcessedItems1.hashCode());
        System.assertEquals(advancedAuctionProcessedItems2.hashCode(), advancedAuctionProcessedItems2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdvancedAuctionProcessedItems advancedAuctionProcessedItems1 = OASAdvancedAuctionProcessedItems.getExample();
        OASAdvancedAuctionProcessedItems advancedAuctionProcessedItems2 = OASAdvancedAuctionProcessedItems.getExample();
        OASAdvancedAuctionProcessedItems advancedAuctionProcessedItems3 = new OASAdvancedAuctionProcessedItems();
        OASAdvancedAuctionProcessedItems advancedAuctionProcessedItems4 = new OASAdvancedAuctionProcessedItems();

        System.assert(advancedAuctionProcessedItems1.equals(advancedAuctionProcessedItems2));
        System.assert(advancedAuctionProcessedItems3.equals(advancedAuctionProcessedItems4));
        System.assertEquals(advancedAuctionProcessedItems1.hashCode(), advancedAuctionProcessedItems2.hashCode());
        System.assertEquals(advancedAuctionProcessedItems3.hashCode(), advancedAuctionProcessedItems4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAdvancedAuctionProcessedItems advancedAuctionProcessedItems = new OASAdvancedAuctionProcessedItems();
        Map<String, String> x-property-mappings = advancedAuctionProcessedItems.getx-property-mappings();
        System.assertEquals('catalogId', x-property-mappings.get('catalog_id'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAdvancedAuctionProcessedItems advancedAuctionProcessedItems = new OASAdvancedAuctionProcessedItems();
        System.assertEquals(new List<OASAdvancedAuctionProcessedItem>(), advancedAuctionProcessedItems.items);
        System.assertEquals(null, advancedAuctionProcessedItems.catalogId);
    }
}
