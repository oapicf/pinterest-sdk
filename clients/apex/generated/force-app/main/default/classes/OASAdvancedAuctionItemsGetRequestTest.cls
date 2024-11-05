@isTest
private class OASAdvancedAuctionItemsGetRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdvancedAuctionItemsGetRequest advancedAuctionItemsGetRequest1 = OASAdvancedAuctionItemsGetRequest.getExample();
        OASAdvancedAuctionItemsGetRequest advancedAuctionItemsGetRequest2 = advancedAuctionItemsGetRequest1;
        OASAdvancedAuctionItemsGetRequest advancedAuctionItemsGetRequest3 = new OASAdvancedAuctionItemsGetRequest();
        OASAdvancedAuctionItemsGetRequest advancedAuctionItemsGetRequest4 = advancedAuctionItemsGetRequest3;

        System.assert(advancedAuctionItemsGetRequest1.equals(advancedAuctionItemsGetRequest2));
        System.assert(advancedAuctionItemsGetRequest2.equals(advancedAuctionItemsGetRequest1));
        System.assert(advancedAuctionItemsGetRequest1.equals(advancedAuctionItemsGetRequest1));
        System.assert(advancedAuctionItemsGetRequest3.equals(advancedAuctionItemsGetRequest4));
        System.assert(advancedAuctionItemsGetRequest4.equals(advancedAuctionItemsGetRequest3));
        System.assert(advancedAuctionItemsGetRequest3.equals(advancedAuctionItemsGetRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdvancedAuctionItemsGetRequest advancedAuctionItemsGetRequest1 = OASAdvancedAuctionItemsGetRequest.getExample();
        OASAdvancedAuctionItemsGetRequest advancedAuctionItemsGetRequest2 = OASAdvancedAuctionItemsGetRequest.getExample();
        OASAdvancedAuctionItemsGetRequest advancedAuctionItemsGetRequest3 = new OASAdvancedAuctionItemsGetRequest();
        OASAdvancedAuctionItemsGetRequest advancedAuctionItemsGetRequest4 = new OASAdvancedAuctionItemsGetRequest();

        System.assert(advancedAuctionItemsGetRequest1.equals(advancedAuctionItemsGetRequest2));
        System.assert(advancedAuctionItemsGetRequest2.equals(advancedAuctionItemsGetRequest1));
        System.assert(advancedAuctionItemsGetRequest3.equals(advancedAuctionItemsGetRequest4));
        System.assert(advancedAuctionItemsGetRequest4.equals(advancedAuctionItemsGetRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdvancedAuctionItemsGetRequest advancedAuctionItemsGetRequest1 = OASAdvancedAuctionItemsGetRequest.getExample();
        OASAdvancedAuctionItemsGetRequest advancedAuctionItemsGetRequest2 = new OASAdvancedAuctionItemsGetRequest();

        System.assertEquals(false, advancedAuctionItemsGetRequest1.equals('foo'));
        System.assertEquals(false, advancedAuctionItemsGetRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdvancedAuctionItemsGetRequest advancedAuctionItemsGetRequest1 = OASAdvancedAuctionItemsGetRequest.getExample();
        OASAdvancedAuctionItemsGetRequest advancedAuctionItemsGetRequest2 = new OASAdvancedAuctionItemsGetRequest();
        OASAdvancedAuctionItemsGetRequest advancedAuctionItemsGetRequest3;

        System.assertEquals(false, advancedAuctionItemsGetRequest1.equals(advancedAuctionItemsGetRequest3));
        System.assertEquals(false, advancedAuctionItemsGetRequest2.equals(advancedAuctionItemsGetRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdvancedAuctionItemsGetRequest advancedAuctionItemsGetRequest1 = OASAdvancedAuctionItemsGetRequest.getExample();
        OASAdvancedAuctionItemsGetRequest advancedAuctionItemsGetRequest2 = new OASAdvancedAuctionItemsGetRequest();

        System.assertEquals(advancedAuctionItemsGetRequest1.hashCode(), advancedAuctionItemsGetRequest1.hashCode());
        System.assertEquals(advancedAuctionItemsGetRequest2.hashCode(), advancedAuctionItemsGetRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdvancedAuctionItemsGetRequest advancedAuctionItemsGetRequest1 = OASAdvancedAuctionItemsGetRequest.getExample();
        OASAdvancedAuctionItemsGetRequest advancedAuctionItemsGetRequest2 = OASAdvancedAuctionItemsGetRequest.getExample();
        OASAdvancedAuctionItemsGetRequest advancedAuctionItemsGetRequest3 = new OASAdvancedAuctionItemsGetRequest();
        OASAdvancedAuctionItemsGetRequest advancedAuctionItemsGetRequest4 = new OASAdvancedAuctionItemsGetRequest();

        System.assert(advancedAuctionItemsGetRequest1.equals(advancedAuctionItemsGetRequest2));
        System.assert(advancedAuctionItemsGetRequest3.equals(advancedAuctionItemsGetRequest4));
        System.assertEquals(advancedAuctionItemsGetRequest1.hashCode(), advancedAuctionItemsGetRequest2.hashCode());
        System.assertEquals(advancedAuctionItemsGetRequest3.hashCode(), advancedAuctionItemsGetRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAdvancedAuctionItemsGetRequest advancedAuctionItemsGetRequest = new OASAdvancedAuctionItemsGetRequest();
        Map<String, String> x-property-mappings = advancedAuctionItemsGetRequest.getx-property-mappings();
        System.assertEquals('catalogId', x-property-mappings.get('catalog_id'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAdvancedAuctionItemsGetRequest advancedAuctionItemsGetRequest = new OASAdvancedAuctionItemsGetRequest();
        System.assertEquals(new List<OASAdvancedAuctionItemsGetRecord>(), advancedAuctionItemsGetRequest.items);
        System.assertEquals(null, advancedAuctionItemsGetRequest.catalogId);
    }
}
