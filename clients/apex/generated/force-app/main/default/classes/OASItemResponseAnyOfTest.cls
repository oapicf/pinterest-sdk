@isTest
private class OASItemResponseAnyOfTest {
    @isTest
    private static void equalsSameInstance() {
        OASItemResponseAnyOf itemResponseAnyOf1 = OASItemResponseAnyOf.getExample();
        OASItemResponseAnyOf itemResponseAnyOf2 = itemResponseAnyOf1;
        OASItemResponseAnyOf itemResponseAnyOf3 = new OASItemResponseAnyOf();
        OASItemResponseAnyOf itemResponseAnyOf4 = itemResponseAnyOf3;

        System.assert(itemResponseAnyOf1.equals(itemResponseAnyOf2));
        System.assert(itemResponseAnyOf2.equals(itemResponseAnyOf1));
        System.assert(itemResponseAnyOf1.equals(itemResponseAnyOf1));
        System.assert(itemResponseAnyOf3.equals(itemResponseAnyOf4));
        System.assert(itemResponseAnyOf4.equals(itemResponseAnyOf3));
        System.assert(itemResponseAnyOf3.equals(itemResponseAnyOf3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASItemResponseAnyOf itemResponseAnyOf1 = OASItemResponseAnyOf.getExample();
        OASItemResponseAnyOf itemResponseAnyOf2 = OASItemResponseAnyOf.getExample();
        OASItemResponseAnyOf itemResponseAnyOf3 = new OASItemResponseAnyOf();
        OASItemResponseAnyOf itemResponseAnyOf4 = new OASItemResponseAnyOf();

        System.assert(itemResponseAnyOf1.equals(itemResponseAnyOf2));
        System.assert(itemResponseAnyOf2.equals(itemResponseAnyOf1));
        System.assert(itemResponseAnyOf3.equals(itemResponseAnyOf4));
        System.assert(itemResponseAnyOf4.equals(itemResponseAnyOf3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASItemResponseAnyOf itemResponseAnyOf1 = OASItemResponseAnyOf.getExample();
        OASItemResponseAnyOf itemResponseAnyOf2 = new OASItemResponseAnyOf();

        System.assertEquals(false, itemResponseAnyOf1.equals('foo'));
        System.assertEquals(false, itemResponseAnyOf2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASItemResponseAnyOf itemResponseAnyOf1 = OASItemResponseAnyOf.getExample();
        OASItemResponseAnyOf itemResponseAnyOf2 = new OASItemResponseAnyOf();
        OASItemResponseAnyOf itemResponseAnyOf3;

        System.assertEquals(false, itemResponseAnyOf1.equals(itemResponseAnyOf3));
        System.assertEquals(false, itemResponseAnyOf2.equals(itemResponseAnyOf3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASItemResponseAnyOf itemResponseAnyOf1 = OASItemResponseAnyOf.getExample();
        OASItemResponseAnyOf itemResponseAnyOf2 = new OASItemResponseAnyOf();

        System.assertEquals(itemResponseAnyOf1.hashCode(), itemResponseAnyOf1.hashCode());
        System.assertEquals(itemResponseAnyOf2.hashCode(), itemResponseAnyOf2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASItemResponseAnyOf itemResponseAnyOf1 = OASItemResponseAnyOf.getExample();
        OASItemResponseAnyOf itemResponseAnyOf2 = OASItemResponseAnyOf.getExample();
        OASItemResponseAnyOf itemResponseAnyOf3 = new OASItemResponseAnyOf();
        OASItemResponseAnyOf itemResponseAnyOf4 = new OASItemResponseAnyOf();

        System.assert(itemResponseAnyOf1.equals(itemResponseAnyOf2));
        System.assert(itemResponseAnyOf3.equals(itemResponseAnyOf4));
        System.assertEquals(itemResponseAnyOf1.hashCode(), itemResponseAnyOf2.hashCode());
        System.assertEquals(itemResponseAnyOf3.hashCode(), itemResponseAnyOf4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASItemResponseAnyOf itemResponseAnyOf = new OASItemResponseAnyOf();
        Map<String, String> x-property-mappings = itemResponseAnyOf.getx-property-mappings();
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
        System.assertEquals('itemId', x-property-mappings.get('item_id'));
        System.assertEquals('hotelId', x-property-mappings.get('hotel_id'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASItemResponseAnyOf itemResponseAnyOf = new OASItemResponseAnyOf();
        System.assertEquals(new List<OASPin>(), itemResponseAnyOf.pins);
        System.assertEquals(null, itemResponseAnyOf.catalogType);
        System.assertEquals(null, itemResponseAnyOf.itemId);
        System.assertEquals(null, itemResponseAnyOf.attributes);
        System.assertEquals(null, itemResponseAnyOf.hotelId);
    }
}
