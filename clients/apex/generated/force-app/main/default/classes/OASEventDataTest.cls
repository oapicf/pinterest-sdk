@isTest
private class OASEventDataTest {
    @isTest
    private static void equalsSameInstance() {
        OASEventData eventData1 = OASEventData.getExample();
        OASEventData eventData2 = eventData1;
        OASEventData eventData3 = new OASEventData();
        OASEventData eventData4 = eventData3;

        System.assert(eventData1.equals(eventData2));
        System.assert(eventData2.equals(eventData1));
        System.assert(eventData1.equals(eventData1));
        System.assert(eventData3.equals(eventData4));
        System.assert(eventData4.equals(eventData3));
        System.assert(eventData3.equals(eventData3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASEventData eventData1 = OASEventData.getExample();
        OASEventData eventData2 = OASEventData.getExample();
        OASEventData eventData3 = new OASEventData();
        OASEventData eventData4 = new OASEventData();

        System.assert(eventData1.equals(eventData2));
        System.assert(eventData2.equals(eventData1));
        System.assert(eventData3.equals(eventData4));
        System.assert(eventData4.equals(eventData3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASEventData eventData1 = OASEventData.getExample();
        OASEventData eventData2 = new OASEventData();

        System.assertEquals(false, eventData1.equals('foo'));
        System.assertEquals(false, eventData2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASEventData eventData1 = OASEventData.getExample();
        OASEventData eventData2 = new OASEventData();
        OASEventData eventData3;

        System.assertEquals(false, eventData1.equals(eventData3));
        System.assertEquals(false, eventData2.equals(eventData3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASEventData eventData1 = OASEventData.getExample();
        OASEventData eventData2 = new OASEventData();

        System.assertEquals(eventData1.hashCode(), eventData1.hashCode());
        System.assertEquals(eventData2.hashCode(), eventData2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASEventData eventData1 = OASEventData.getExample();
        OASEventData eventData2 = OASEventData.getExample();
        OASEventData eventData3 = new OASEventData();
        OASEventData eventData4 = new OASEventData();

        System.assert(eventData1.equals(eventData2));
        System.assert(eventData3.equals(eventData4));
        System.assertEquals(eventData1.hashCode(), eventData2.hashCode());
        System.assertEquals(eventData3.hashCode(), eventData4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASEventData eventData = new OASEventData();
        Map<String, String> x-property-mappings = eventData.getx-property-mappings();
        System.assertEquals('r_currency', x-property-mappings.get('currency'));
        System.assertEquals('leadType', x-property-mappings.get('lead_type'));
        System.assertEquals('lineItems', x-property-mappings.get('line_items'));
        System.assertEquals('orderId', x-property-mappings.get('order_id'));
        System.assertEquals('orderQuantity', x-property-mappings.get('order_quantity'));
        System.assertEquals('pageName', x-property-mappings.get('page_name'));
        System.assertEquals('promoCode', x-property-mappings.get('promo_code'));
        System.assertEquals('searchQuery', x-property-mappings.get('search_query'));
        System.assertEquals('videoTitle', x-property-mappings.get('video_title'));
    }
}
