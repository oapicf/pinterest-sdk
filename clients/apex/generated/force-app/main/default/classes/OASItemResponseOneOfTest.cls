@isTest
private class OASItemResponseOneOfTest {
    @isTest
    private static void equalsSameInstance() {
        OASItemResponseOneOf itemResponseOneOf1 = OASItemResponseOneOf.getExample();
        OASItemResponseOneOf itemResponseOneOf2 = itemResponseOneOf1;
        OASItemResponseOneOf itemResponseOneOf3 = new OASItemResponseOneOf();
        OASItemResponseOneOf itemResponseOneOf4 = itemResponseOneOf3;

        System.assert(itemResponseOneOf1.equals(itemResponseOneOf2));
        System.assert(itemResponseOneOf2.equals(itemResponseOneOf1));
        System.assert(itemResponseOneOf1.equals(itemResponseOneOf1));
        System.assert(itemResponseOneOf3.equals(itemResponseOneOf4));
        System.assert(itemResponseOneOf4.equals(itemResponseOneOf3));
        System.assert(itemResponseOneOf3.equals(itemResponseOneOf3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASItemResponseOneOf itemResponseOneOf1 = OASItemResponseOneOf.getExample();
        OASItemResponseOneOf itemResponseOneOf2 = OASItemResponseOneOf.getExample();
        OASItemResponseOneOf itemResponseOneOf3 = new OASItemResponseOneOf();
        OASItemResponseOneOf itemResponseOneOf4 = new OASItemResponseOneOf();

        System.assert(itemResponseOneOf1.equals(itemResponseOneOf2));
        System.assert(itemResponseOneOf2.equals(itemResponseOneOf1));
        System.assert(itemResponseOneOf3.equals(itemResponseOneOf4));
        System.assert(itemResponseOneOf4.equals(itemResponseOneOf3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASItemResponseOneOf itemResponseOneOf1 = OASItemResponseOneOf.getExample();
        OASItemResponseOneOf itemResponseOneOf2 = new OASItemResponseOneOf();

        System.assertEquals(false, itemResponseOneOf1.equals('foo'));
        System.assertEquals(false, itemResponseOneOf2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASItemResponseOneOf itemResponseOneOf1 = OASItemResponseOneOf.getExample();
        OASItemResponseOneOf itemResponseOneOf2 = new OASItemResponseOneOf();
        OASItemResponseOneOf itemResponseOneOf3;

        System.assertEquals(false, itemResponseOneOf1.equals(itemResponseOneOf3));
        System.assertEquals(false, itemResponseOneOf2.equals(itemResponseOneOf3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASItemResponseOneOf itemResponseOneOf1 = OASItemResponseOneOf.getExample();
        OASItemResponseOneOf itemResponseOneOf2 = new OASItemResponseOneOf();

        System.assertEquals(itemResponseOneOf1.hashCode(), itemResponseOneOf1.hashCode());
        System.assertEquals(itemResponseOneOf2.hashCode(), itemResponseOneOf2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASItemResponseOneOf itemResponseOneOf1 = OASItemResponseOneOf.getExample();
        OASItemResponseOneOf itemResponseOneOf2 = OASItemResponseOneOf.getExample();
        OASItemResponseOneOf itemResponseOneOf3 = new OASItemResponseOneOf();
        OASItemResponseOneOf itemResponseOneOf4 = new OASItemResponseOneOf();

        System.assert(itemResponseOneOf1.equals(itemResponseOneOf2));
        System.assert(itemResponseOneOf3.equals(itemResponseOneOf4));
        System.assertEquals(itemResponseOneOf1.hashCode(), itemResponseOneOf2.hashCode());
        System.assertEquals(itemResponseOneOf3.hashCode(), itemResponseOneOf4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASItemResponseOneOf itemResponseOneOf = new OASItemResponseOneOf();
        Map<String, String> x-property-mappings = itemResponseOneOf.getx-property-mappings();
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
        System.assertEquals('itemId', x-property-mappings.get('item_id'));
        System.assertEquals('hotelId', x-property-mappings.get('hotel_id'));
        System.assertEquals('creativeAssetsId', x-property-mappings.get('creative_assets_id'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASItemResponseOneOf itemResponseOneOf = new OASItemResponseOneOf();
        System.assertEquals(new List<OASPin>(), itemResponseOneOf.pins);
        System.assertEquals(null, itemResponseOneOf.catalogType);
        System.assertEquals(null, itemResponseOneOf.attributes);
        System.assertEquals(null, itemResponseOneOf.itemId);
        System.assertEquals(null, itemResponseOneOf.hotelId);
        System.assertEquals(null, itemResponseOneOf.creativeAssetsId);
    }
}
