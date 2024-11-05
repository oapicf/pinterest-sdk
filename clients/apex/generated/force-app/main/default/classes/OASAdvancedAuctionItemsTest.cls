@isTest
private class OASAdvancedAuctionItemsTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdvancedAuctionItems advancedAuctionItems1 = OASAdvancedAuctionItems.getExample();
        OASAdvancedAuctionItems advancedAuctionItems2 = advancedAuctionItems1;
        OASAdvancedAuctionItems advancedAuctionItems3 = new OASAdvancedAuctionItems();
        OASAdvancedAuctionItems advancedAuctionItems4 = advancedAuctionItems3;

        System.assert(advancedAuctionItems1.equals(advancedAuctionItems2));
        System.assert(advancedAuctionItems2.equals(advancedAuctionItems1));
        System.assert(advancedAuctionItems1.equals(advancedAuctionItems1));
        System.assert(advancedAuctionItems3.equals(advancedAuctionItems4));
        System.assert(advancedAuctionItems4.equals(advancedAuctionItems3));
        System.assert(advancedAuctionItems3.equals(advancedAuctionItems3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdvancedAuctionItems advancedAuctionItems1 = OASAdvancedAuctionItems.getExample();
        OASAdvancedAuctionItems advancedAuctionItems2 = OASAdvancedAuctionItems.getExample();
        OASAdvancedAuctionItems advancedAuctionItems3 = new OASAdvancedAuctionItems();
        OASAdvancedAuctionItems advancedAuctionItems4 = new OASAdvancedAuctionItems();

        System.assert(advancedAuctionItems1.equals(advancedAuctionItems2));
        System.assert(advancedAuctionItems2.equals(advancedAuctionItems1));
        System.assert(advancedAuctionItems3.equals(advancedAuctionItems4));
        System.assert(advancedAuctionItems4.equals(advancedAuctionItems3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdvancedAuctionItems advancedAuctionItems1 = OASAdvancedAuctionItems.getExample();
        OASAdvancedAuctionItems advancedAuctionItems2 = new OASAdvancedAuctionItems();

        System.assertEquals(false, advancedAuctionItems1.equals('foo'));
        System.assertEquals(false, advancedAuctionItems2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdvancedAuctionItems advancedAuctionItems1 = OASAdvancedAuctionItems.getExample();
        OASAdvancedAuctionItems advancedAuctionItems2 = new OASAdvancedAuctionItems();
        OASAdvancedAuctionItems advancedAuctionItems3;

        System.assertEquals(false, advancedAuctionItems1.equals(advancedAuctionItems3));
        System.assertEquals(false, advancedAuctionItems2.equals(advancedAuctionItems3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdvancedAuctionItems advancedAuctionItems1 = OASAdvancedAuctionItems.getExample();
        OASAdvancedAuctionItems advancedAuctionItems2 = new OASAdvancedAuctionItems();

        System.assertEquals(advancedAuctionItems1.hashCode(), advancedAuctionItems1.hashCode());
        System.assertEquals(advancedAuctionItems2.hashCode(), advancedAuctionItems2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdvancedAuctionItems advancedAuctionItems1 = OASAdvancedAuctionItems.getExample();
        OASAdvancedAuctionItems advancedAuctionItems2 = OASAdvancedAuctionItems.getExample();
        OASAdvancedAuctionItems advancedAuctionItems3 = new OASAdvancedAuctionItems();
        OASAdvancedAuctionItems advancedAuctionItems4 = new OASAdvancedAuctionItems();

        System.assert(advancedAuctionItems1.equals(advancedAuctionItems2));
        System.assert(advancedAuctionItems3.equals(advancedAuctionItems4));
        System.assertEquals(advancedAuctionItems1.hashCode(), advancedAuctionItems2.hashCode());
        System.assertEquals(advancedAuctionItems3.hashCode(), advancedAuctionItems4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAdvancedAuctionItems advancedAuctionItems = new OASAdvancedAuctionItems();
        Map<String, String> x-property-mappings = advancedAuctionItems.getx-property-mappings();
        System.assertEquals('catalogId', x-property-mappings.get('catalog_id'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAdvancedAuctionItems advancedAuctionItems = new OASAdvancedAuctionItems();
        System.assertEquals(new List<OASAdvancedAuctionItem>(), advancedAuctionItems.items);
        System.assertEquals(null, advancedAuctionItems.catalogId);
    }
}
