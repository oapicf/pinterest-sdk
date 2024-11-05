@isTest
private class OASAdvancedAuctionKeyTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdvancedAuctionKey advancedAuctionKey1 = OASAdvancedAuctionKey.getExample();
        OASAdvancedAuctionKey advancedAuctionKey2 = advancedAuctionKey1;
        OASAdvancedAuctionKey advancedAuctionKey3 = new OASAdvancedAuctionKey();
        OASAdvancedAuctionKey advancedAuctionKey4 = advancedAuctionKey3;

        System.assert(advancedAuctionKey1.equals(advancedAuctionKey2));
        System.assert(advancedAuctionKey2.equals(advancedAuctionKey1));
        System.assert(advancedAuctionKey1.equals(advancedAuctionKey1));
        System.assert(advancedAuctionKey3.equals(advancedAuctionKey4));
        System.assert(advancedAuctionKey4.equals(advancedAuctionKey3));
        System.assert(advancedAuctionKey3.equals(advancedAuctionKey3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdvancedAuctionKey advancedAuctionKey1 = OASAdvancedAuctionKey.getExample();
        OASAdvancedAuctionKey advancedAuctionKey2 = OASAdvancedAuctionKey.getExample();
        OASAdvancedAuctionKey advancedAuctionKey3 = new OASAdvancedAuctionKey();
        OASAdvancedAuctionKey advancedAuctionKey4 = new OASAdvancedAuctionKey();

        System.assert(advancedAuctionKey1.equals(advancedAuctionKey2));
        System.assert(advancedAuctionKey2.equals(advancedAuctionKey1));
        System.assert(advancedAuctionKey3.equals(advancedAuctionKey4));
        System.assert(advancedAuctionKey4.equals(advancedAuctionKey3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdvancedAuctionKey advancedAuctionKey1 = OASAdvancedAuctionKey.getExample();
        OASAdvancedAuctionKey advancedAuctionKey2 = new OASAdvancedAuctionKey();

        System.assertEquals(false, advancedAuctionKey1.equals('foo'));
        System.assertEquals(false, advancedAuctionKey2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdvancedAuctionKey advancedAuctionKey1 = OASAdvancedAuctionKey.getExample();
        OASAdvancedAuctionKey advancedAuctionKey2 = new OASAdvancedAuctionKey();
        OASAdvancedAuctionKey advancedAuctionKey3;

        System.assertEquals(false, advancedAuctionKey1.equals(advancedAuctionKey3));
        System.assertEquals(false, advancedAuctionKey2.equals(advancedAuctionKey3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdvancedAuctionKey advancedAuctionKey1 = OASAdvancedAuctionKey.getExample();
        OASAdvancedAuctionKey advancedAuctionKey2 = new OASAdvancedAuctionKey();

        System.assertEquals(advancedAuctionKey1.hashCode(), advancedAuctionKey1.hashCode());
        System.assertEquals(advancedAuctionKey2.hashCode(), advancedAuctionKey2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdvancedAuctionKey advancedAuctionKey1 = OASAdvancedAuctionKey.getExample();
        OASAdvancedAuctionKey advancedAuctionKey2 = OASAdvancedAuctionKey.getExample();
        OASAdvancedAuctionKey advancedAuctionKey3 = new OASAdvancedAuctionKey();
        OASAdvancedAuctionKey advancedAuctionKey4 = new OASAdvancedAuctionKey();

        System.assert(advancedAuctionKey1.equals(advancedAuctionKey2));
        System.assert(advancedAuctionKey3.equals(advancedAuctionKey4));
        System.assertEquals(advancedAuctionKey1.hashCode(), advancedAuctionKey2.hashCode());
        System.assertEquals(advancedAuctionKey3.hashCode(), advancedAuctionKey4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAdvancedAuctionKey advancedAuctionKey = new OASAdvancedAuctionKey();
        Map<String, String> x-property-mappings = advancedAuctionKey.getx-property-mappings();
        System.assertEquals('itemId', x-property-mappings.get('item_id'));
    }
}
