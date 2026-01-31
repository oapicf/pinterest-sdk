@isTest
private class OASItemResponseOneOf1Test {
    @isTest
    private static void equalsSameInstance() {
        OASItemResponseOneOf1 itemResponseOneOf11 = OASItemResponseOneOf1.getExample();
        OASItemResponseOneOf1 itemResponseOneOf12 = itemResponseOneOf11;
        OASItemResponseOneOf1 itemResponseOneOf13 = new OASItemResponseOneOf1();
        OASItemResponseOneOf1 itemResponseOneOf14 = itemResponseOneOf13;

        System.assert(itemResponseOneOf11.equals(itemResponseOneOf12));
        System.assert(itemResponseOneOf12.equals(itemResponseOneOf11));
        System.assert(itemResponseOneOf11.equals(itemResponseOneOf11));
        System.assert(itemResponseOneOf13.equals(itemResponseOneOf14));
        System.assert(itemResponseOneOf14.equals(itemResponseOneOf13));
        System.assert(itemResponseOneOf13.equals(itemResponseOneOf13));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASItemResponseOneOf1 itemResponseOneOf11 = OASItemResponseOneOf1.getExample();
        OASItemResponseOneOf1 itemResponseOneOf12 = OASItemResponseOneOf1.getExample();
        OASItemResponseOneOf1 itemResponseOneOf13 = new OASItemResponseOneOf1();
        OASItemResponseOneOf1 itemResponseOneOf14 = new OASItemResponseOneOf1();

        System.assert(itemResponseOneOf11.equals(itemResponseOneOf12));
        System.assert(itemResponseOneOf12.equals(itemResponseOneOf11));
        System.assert(itemResponseOneOf13.equals(itemResponseOneOf14));
        System.assert(itemResponseOneOf14.equals(itemResponseOneOf13));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASItemResponseOneOf1 itemResponseOneOf11 = OASItemResponseOneOf1.getExample();
        OASItemResponseOneOf1 itemResponseOneOf12 = new OASItemResponseOneOf1();

        System.assertEquals(false, itemResponseOneOf11.equals('foo'));
        System.assertEquals(false, itemResponseOneOf12.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASItemResponseOneOf1 itemResponseOneOf11 = OASItemResponseOneOf1.getExample();
        OASItemResponseOneOf1 itemResponseOneOf12 = new OASItemResponseOneOf1();
        OASItemResponseOneOf1 itemResponseOneOf13;

        System.assertEquals(false, itemResponseOneOf11.equals(itemResponseOneOf13));
        System.assertEquals(false, itemResponseOneOf12.equals(itemResponseOneOf13));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASItemResponseOneOf1 itemResponseOneOf11 = OASItemResponseOneOf1.getExample();
        OASItemResponseOneOf1 itemResponseOneOf12 = new OASItemResponseOneOf1();

        System.assertEquals(itemResponseOneOf11.hashCode(), itemResponseOneOf11.hashCode());
        System.assertEquals(itemResponseOneOf12.hashCode(), itemResponseOneOf12.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASItemResponseOneOf1 itemResponseOneOf11 = OASItemResponseOneOf1.getExample();
        OASItemResponseOneOf1 itemResponseOneOf12 = OASItemResponseOneOf1.getExample();
        OASItemResponseOneOf1 itemResponseOneOf13 = new OASItemResponseOneOf1();
        OASItemResponseOneOf1 itemResponseOneOf14 = new OASItemResponseOneOf1();

        System.assert(itemResponseOneOf11.equals(itemResponseOneOf12));
        System.assert(itemResponseOneOf13.equals(itemResponseOneOf14));
        System.assertEquals(itemResponseOneOf11.hashCode(), itemResponseOneOf12.hashCode());
        System.assertEquals(itemResponseOneOf13.hashCode(), itemResponseOneOf14.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASItemResponseOneOf1 itemResponseOneOf1 = new OASItemResponseOneOf1();
        Map<String, String> x-property-mappings = itemResponseOneOf1.getx-property-mappings();
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
        System.assertEquals('itemId', x-property-mappings.get('item_id'));
        System.assertEquals('hotelId', x-property-mappings.get('hotel_id'));
        System.assertEquals('creativeAssetsId', x-property-mappings.get('creative_assets_id'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASItemResponseOneOf1 itemResponseOneOf1 = new OASItemResponseOneOf1();
        System.assertEquals(new List<OASItemValidationEvent>(), itemResponseOneOf1.errors);
        System.assertEquals(null, itemResponseOneOf1.catalogType);
        System.assertEquals(null, itemResponseOneOf1.itemId);
        System.assertEquals(null, itemResponseOneOf1.hotelId);
        System.assertEquals(null, itemResponseOneOf1.creativeAssetsId);
    }
}
