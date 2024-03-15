@isTest
private class OASPinterestTagEventDataTest {
    @isTest
    private static void equalsSameInstance() {
        OASPinterestTagEventData pinterestTagEventData1 = OASPinterestTagEventData.getExample();
        OASPinterestTagEventData pinterestTagEventData2 = pinterestTagEventData1;
        OASPinterestTagEventData pinterestTagEventData3 = new OASPinterestTagEventData();
        OASPinterestTagEventData pinterestTagEventData4 = pinterestTagEventData3;

        System.assert(pinterestTagEventData1.equals(pinterestTagEventData2));
        System.assert(pinterestTagEventData2.equals(pinterestTagEventData1));
        System.assert(pinterestTagEventData1.equals(pinterestTagEventData1));
        System.assert(pinterestTagEventData3.equals(pinterestTagEventData4));
        System.assert(pinterestTagEventData4.equals(pinterestTagEventData3));
        System.assert(pinterestTagEventData3.equals(pinterestTagEventData3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPinterestTagEventData pinterestTagEventData1 = OASPinterestTagEventData.getExample();
        OASPinterestTagEventData pinterestTagEventData2 = OASPinterestTagEventData.getExample();
        OASPinterestTagEventData pinterestTagEventData3 = new OASPinterestTagEventData();
        OASPinterestTagEventData pinterestTagEventData4 = new OASPinterestTagEventData();

        System.assert(pinterestTagEventData1.equals(pinterestTagEventData2));
        System.assert(pinterestTagEventData2.equals(pinterestTagEventData1));
        System.assert(pinterestTagEventData3.equals(pinterestTagEventData4));
        System.assert(pinterestTagEventData4.equals(pinterestTagEventData3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPinterestTagEventData pinterestTagEventData1 = OASPinterestTagEventData.getExample();
        OASPinterestTagEventData pinterestTagEventData2 = new OASPinterestTagEventData();

        System.assertEquals(false, pinterestTagEventData1.equals('foo'));
        System.assertEquals(false, pinterestTagEventData2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPinterestTagEventData pinterestTagEventData1 = OASPinterestTagEventData.getExample();
        OASPinterestTagEventData pinterestTagEventData2 = new OASPinterestTagEventData();
        OASPinterestTagEventData pinterestTagEventData3;

        System.assertEquals(false, pinterestTagEventData1.equals(pinterestTagEventData3));
        System.assertEquals(false, pinterestTagEventData2.equals(pinterestTagEventData3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPinterestTagEventData pinterestTagEventData1 = OASPinterestTagEventData.getExample();
        OASPinterestTagEventData pinterestTagEventData2 = new OASPinterestTagEventData();

        System.assertEquals(pinterestTagEventData1.hashCode(), pinterestTagEventData1.hashCode());
        System.assertEquals(pinterestTagEventData2.hashCode(), pinterestTagEventData2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPinterestTagEventData pinterestTagEventData1 = OASPinterestTagEventData.getExample();
        OASPinterestTagEventData pinterestTagEventData2 = OASPinterestTagEventData.getExample();
        OASPinterestTagEventData pinterestTagEventData3 = new OASPinterestTagEventData();
        OASPinterestTagEventData pinterestTagEventData4 = new OASPinterestTagEventData();

        System.assert(pinterestTagEventData1.equals(pinterestTagEventData2));
        System.assert(pinterestTagEventData3.equals(pinterestTagEventData4));
        System.assertEquals(pinterestTagEventData1.hashCode(), pinterestTagEventData2.hashCode());
        System.assertEquals(pinterestTagEventData3.hashCode(), pinterestTagEventData4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPinterestTagEventData pinterestTagEventData = new OASPinterestTagEventData();
        Map<String, String> x-property-mappings = pinterestTagEventData.getx-property-mappings();
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
