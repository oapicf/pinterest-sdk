@isTest
private class OASItemResponseAnyOf1Test {
    @isTest
    private static void equalsSameInstance() {
        OASItemResponseAnyOf1 itemResponseAnyOf11 = OASItemResponseAnyOf1.getExample();
        OASItemResponseAnyOf1 itemResponseAnyOf12 = itemResponseAnyOf11;
        OASItemResponseAnyOf1 itemResponseAnyOf13 = new OASItemResponseAnyOf1();
        OASItemResponseAnyOf1 itemResponseAnyOf14 = itemResponseAnyOf13;

        System.assert(itemResponseAnyOf11.equals(itemResponseAnyOf12));
        System.assert(itemResponseAnyOf12.equals(itemResponseAnyOf11));
        System.assert(itemResponseAnyOf11.equals(itemResponseAnyOf11));
        System.assert(itemResponseAnyOf13.equals(itemResponseAnyOf14));
        System.assert(itemResponseAnyOf14.equals(itemResponseAnyOf13));
        System.assert(itemResponseAnyOf13.equals(itemResponseAnyOf13));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASItemResponseAnyOf1 itemResponseAnyOf11 = OASItemResponseAnyOf1.getExample();
        OASItemResponseAnyOf1 itemResponseAnyOf12 = OASItemResponseAnyOf1.getExample();
        OASItemResponseAnyOf1 itemResponseAnyOf13 = new OASItemResponseAnyOf1();
        OASItemResponseAnyOf1 itemResponseAnyOf14 = new OASItemResponseAnyOf1();

        System.assert(itemResponseAnyOf11.equals(itemResponseAnyOf12));
        System.assert(itemResponseAnyOf12.equals(itemResponseAnyOf11));
        System.assert(itemResponseAnyOf13.equals(itemResponseAnyOf14));
        System.assert(itemResponseAnyOf14.equals(itemResponseAnyOf13));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASItemResponseAnyOf1 itemResponseAnyOf11 = OASItemResponseAnyOf1.getExample();
        OASItemResponseAnyOf1 itemResponseAnyOf12 = new OASItemResponseAnyOf1();

        System.assertEquals(false, itemResponseAnyOf11.equals('foo'));
        System.assertEquals(false, itemResponseAnyOf12.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASItemResponseAnyOf1 itemResponseAnyOf11 = OASItemResponseAnyOf1.getExample();
        OASItemResponseAnyOf1 itemResponseAnyOf12 = new OASItemResponseAnyOf1();
        OASItemResponseAnyOf1 itemResponseAnyOf13;

        System.assertEquals(false, itemResponseAnyOf11.equals(itemResponseAnyOf13));
        System.assertEquals(false, itemResponseAnyOf12.equals(itemResponseAnyOf13));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASItemResponseAnyOf1 itemResponseAnyOf11 = OASItemResponseAnyOf1.getExample();
        OASItemResponseAnyOf1 itemResponseAnyOf12 = new OASItemResponseAnyOf1();

        System.assertEquals(itemResponseAnyOf11.hashCode(), itemResponseAnyOf11.hashCode());
        System.assertEquals(itemResponseAnyOf12.hashCode(), itemResponseAnyOf12.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASItemResponseAnyOf1 itemResponseAnyOf11 = OASItemResponseAnyOf1.getExample();
        OASItemResponseAnyOf1 itemResponseAnyOf12 = OASItemResponseAnyOf1.getExample();
        OASItemResponseAnyOf1 itemResponseAnyOf13 = new OASItemResponseAnyOf1();
        OASItemResponseAnyOf1 itemResponseAnyOf14 = new OASItemResponseAnyOf1();

        System.assert(itemResponseAnyOf11.equals(itemResponseAnyOf12));
        System.assert(itemResponseAnyOf13.equals(itemResponseAnyOf14));
        System.assertEquals(itemResponseAnyOf11.hashCode(), itemResponseAnyOf12.hashCode());
        System.assertEquals(itemResponseAnyOf13.hashCode(), itemResponseAnyOf14.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASItemResponseAnyOf1 itemResponseAnyOf1 = new OASItemResponseAnyOf1();
        Map<String, String> x-property-mappings = itemResponseAnyOf1.getx-property-mappings();
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
        System.assertEquals('itemId', x-property-mappings.get('item_id'));
        System.assertEquals('hotelId', x-property-mappings.get('hotel_id'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASItemResponseAnyOf1 itemResponseAnyOf1 = new OASItemResponseAnyOf1();
        System.assertEquals(new List<OASItemValidationEvent>(), itemResponseAnyOf1.errors);
        System.assertEquals(null, itemResponseAnyOf1.catalogType);
        System.assertEquals(null, itemResponseAnyOf1.itemId);
        System.assertEquals(null, itemResponseAnyOf1.hotelId);
    }
}
