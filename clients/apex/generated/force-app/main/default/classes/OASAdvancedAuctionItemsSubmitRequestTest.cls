@isTest
private class OASAdvancedAuctionItemsSubmitRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdvancedAuctionItemsSubmitRequest advancedAuctionItemsSubmitRequest1 = OASAdvancedAuctionItemsSubmitRequest.getExample();
        OASAdvancedAuctionItemsSubmitRequest advancedAuctionItemsSubmitRequest2 = advancedAuctionItemsSubmitRequest1;
        OASAdvancedAuctionItemsSubmitRequest advancedAuctionItemsSubmitRequest3 = new OASAdvancedAuctionItemsSubmitRequest();
        OASAdvancedAuctionItemsSubmitRequest advancedAuctionItemsSubmitRequest4 = advancedAuctionItemsSubmitRequest3;

        System.assert(advancedAuctionItemsSubmitRequest1.equals(advancedAuctionItemsSubmitRequest2));
        System.assert(advancedAuctionItemsSubmitRequest2.equals(advancedAuctionItemsSubmitRequest1));
        System.assert(advancedAuctionItemsSubmitRequest1.equals(advancedAuctionItemsSubmitRequest1));
        System.assert(advancedAuctionItemsSubmitRequest3.equals(advancedAuctionItemsSubmitRequest4));
        System.assert(advancedAuctionItemsSubmitRequest4.equals(advancedAuctionItemsSubmitRequest3));
        System.assert(advancedAuctionItemsSubmitRequest3.equals(advancedAuctionItemsSubmitRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdvancedAuctionItemsSubmitRequest advancedAuctionItemsSubmitRequest1 = OASAdvancedAuctionItemsSubmitRequest.getExample();
        OASAdvancedAuctionItemsSubmitRequest advancedAuctionItemsSubmitRequest2 = OASAdvancedAuctionItemsSubmitRequest.getExample();
        OASAdvancedAuctionItemsSubmitRequest advancedAuctionItemsSubmitRequest3 = new OASAdvancedAuctionItemsSubmitRequest();
        OASAdvancedAuctionItemsSubmitRequest advancedAuctionItemsSubmitRequest4 = new OASAdvancedAuctionItemsSubmitRequest();

        System.assert(advancedAuctionItemsSubmitRequest1.equals(advancedAuctionItemsSubmitRequest2));
        System.assert(advancedAuctionItemsSubmitRequest2.equals(advancedAuctionItemsSubmitRequest1));
        System.assert(advancedAuctionItemsSubmitRequest3.equals(advancedAuctionItemsSubmitRequest4));
        System.assert(advancedAuctionItemsSubmitRequest4.equals(advancedAuctionItemsSubmitRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdvancedAuctionItemsSubmitRequest advancedAuctionItemsSubmitRequest1 = OASAdvancedAuctionItemsSubmitRequest.getExample();
        OASAdvancedAuctionItemsSubmitRequest advancedAuctionItemsSubmitRequest2 = new OASAdvancedAuctionItemsSubmitRequest();

        System.assertEquals(false, advancedAuctionItemsSubmitRequest1.equals('foo'));
        System.assertEquals(false, advancedAuctionItemsSubmitRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdvancedAuctionItemsSubmitRequest advancedAuctionItemsSubmitRequest1 = OASAdvancedAuctionItemsSubmitRequest.getExample();
        OASAdvancedAuctionItemsSubmitRequest advancedAuctionItemsSubmitRequest2 = new OASAdvancedAuctionItemsSubmitRequest();
        OASAdvancedAuctionItemsSubmitRequest advancedAuctionItemsSubmitRequest3;

        System.assertEquals(false, advancedAuctionItemsSubmitRequest1.equals(advancedAuctionItemsSubmitRequest3));
        System.assertEquals(false, advancedAuctionItemsSubmitRequest2.equals(advancedAuctionItemsSubmitRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdvancedAuctionItemsSubmitRequest advancedAuctionItemsSubmitRequest1 = OASAdvancedAuctionItemsSubmitRequest.getExample();
        OASAdvancedAuctionItemsSubmitRequest advancedAuctionItemsSubmitRequest2 = new OASAdvancedAuctionItemsSubmitRequest();

        System.assertEquals(advancedAuctionItemsSubmitRequest1.hashCode(), advancedAuctionItemsSubmitRequest1.hashCode());
        System.assertEquals(advancedAuctionItemsSubmitRequest2.hashCode(), advancedAuctionItemsSubmitRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdvancedAuctionItemsSubmitRequest advancedAuctionItemsSubmitRequest1 = OASAdvancedAuctionItemsSubmitRequest.getExample();
        OASAdvancedAuctionItemsSubmitRequest advancedAuctionItemsSubmitRequest2 = OASAdvancedAuctionItemsSubmitRequest.getExample();
        OASAdvancedAuctionItemsSubmitRequest advancedAuctionItemsSubmitRequest3 = new OASAdvancedAuctionItemsSubmitRequest();
        OASAdvancedAuctionItemsSubmitRequest advancedAuctionItemsSubmitRequest4 = new OASAdvancedAuctionItemsSubmitRequest();

        System.assert(advancedAuctionItemsSubmitRequest1.equals(advancedAuctionItemsSubmitRequest2));
        System.assert(advancedAuctionItemsSubmitRequest3.equals(advancedAuctionItemsSubmitRequest4));
        System.assertEquals(advancedAuctionItemsSubmitRequest1.hashCode(), advancedAuctionItemsSubmitRequest2.hashCode());
        System.assertEquals(advancedAuctionItemsSubmitRequest3.hashCode(), advancedAuctionItemsSubmitRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAdvancedAuctionItemsSubmitRequest advancedAuctionItemsSubmitRequest = new OASAdvancedAuctionItemsSubmitRequest();
        Map<String, String> x-property-mappings = advancedAuctionItemsSubmitRequest.getx-property-mappings();
        System.assertEquals('catalogId', x-property-mappings.get('catalog_id'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAdvancedAuctionItemsSubmitRequest advancedAuctionItemsSubmitRequest = new OASAdvancedAuctionItemsSubmitRequest();
        System.assertEquals(new List<OASAdvancedAuctionItemsSubmitRecord>(), advancedAuctionItemsSubmitRequest.items);
        System.assertEquals(null, advancedAuctionItemsSubmitRequest.catalogId);
    }
}
