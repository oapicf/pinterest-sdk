@isTest
private class OASItemResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASItemResponse itemResponse1 = OASItemResponse.getExample();
        OASItemResponse itemResponse2 = itemResponse1;
        OASItemResponse itemResponse3 = new OASItemResponse();
        OASItemResponse itemResponse4 = itemResponse3;

        System.assert(itemResponse1.equals(itemResponse2));
        System.assert(itemResponse2.equals(itemResponse1));
        System.assert(itemResponse1.equals(itemResponse1));
        System.assert(itemResponse3.equals(itemResponse4));
        System.assert(itemResponse4.equals(itemResponse3));
        System.assert(itemResponse3.equals(itemResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASItemResponse itemResponse1 = OASItemResponse.getExample();
        OASItemResponse itemResponse2 = OASItemResponse.getExample();
        OASItemResponse itemResponse3 = new OASItemResponse();
        OASItemResponse itemResponse4 = new OASItemResponse();

        System.assert(itemResponse1.equals(itemResponse2));
        System.assert(itemResponse2.equals(itemResponse1));
        System.assert(itemResponse3.equals(itemResponse4));
        System.assert(itemResponse4.equals(itemResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASItemResponse itemResponse1 = OASItemResponse.getExample();
        OASItemResponse itemResponse2 = new OASItemResponse();

        System.assertEquals(false, itemResponse1.equals('foo'));
        System.assertEquals(false, itemResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASItemResponse itemResponse1 = OASItemResponse.getExample();
        OASItemResponse itemResponse2 = new OASItemResponse();
        OASItemResponse itemResponse3;

        System.assertEquals(false, itemResponse1.equals(itemResponse3));
        System.assertEquals(false, itemResponse2.equals(itemResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASItemResponse itemResponse1 = OASItemResponse.getExample();
        OASItemResponse itemResponse2 = new OASItemResponse();

        System.assertEquals(itemResponse1.hashCode(), itemResponse1.hashCode());
        System.assertEquals(itemResponse2.hashCode(), itemResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASItemResponse itemResponse1 = OASItemResponse.getExample();
        OASItemResponse itemResponse2 = OASItemResponse.getExample();
        OASItemResponse itemResponse3 = new OASItemResponse();
        OASItemResponse itemResponse4 = new OASItemResponse();

        System.assert(itemResponse1.equals(itemResponse2));
        System.assert(itemResponse3.equals(itemResponse4));
        System.assertEquals(itemResponse1.hashCode(), itemResponse2.hashCode());
        System.assertEquals(itemResponse3.hashCode(), itemResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASItemResponse itemResponse = new OASItemResponse();
        Map<String, String> x-property-mappings = itemResponse.getx-property-mappings();
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
        System.assertEquals('itemId', x-property-mappings.get('item_id'));
        System.assertEquals('hotelId', x-property-mappings.get('hotel_id'));
        System.assertEquals('creativeAssetsId', x-property-mappings.get('creative_assets_id'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASItemResponse itemResponse = new OASItemResponse();
        System.assertEquals(new List<OASPin>(), itemResponse.pins);
        System.assertEquals(new List<OASItemValidationEvent>(), itemResponse.errors);
        System.assertEquals(null, itemResponse.catalogType);
        System.assertEquals(null, itemResponse.itemId);
        System.assertEquals(null, itemResponse.attributes);
        System.assertEquals(null, itemResponse.hotelId);
        System.assertEquals(null, itemResponse.creativeAssetsId);
    }
}
