@isTest
private class OASCatalogsUpsertHotelItemTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsUpsertHotelItem catalogsUpsertHotelItem1 = OASCatalogsUpsertHotelItem.getExample();
        OASCatalogsUpsertHotelItem catalogsUpsertHotelItem2 = catalogsUpsertHotelItem1;
        OASCatalogsUpsertHotelItem catalogsUpsertHotelItem3 = new OASCatalogsUpsertHotelItem();
        OASCatalogsUpsertHotelItem catalogsUpsertHotelItem4 = catalogsUpsertHotelItem3;

        System.assert(catalogsUpsertHotelItem1.equals(catalogsUpsertHotelItem2));
        System.assert(catalogsUpsertHotelItem2.equals(catalogsUpsertHotelItem1));
        System.assert(catalogsUpsertHotelItem1.equals(catalogsUpsertHotelItem1));
        System.assert(catalogsUpsertHotelItem3.equals(catalogsUpsertHotelItem4));
        System.assert(catalogsUpsertHotelItem4.equals(catalogsUpsertHotelItem3));
        System.assert(catalogsUpsertHotelItem3.equals(catalogsUpsertHotelItem3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsUpsertHotelItem catalogsUpsertHotelItem1 = OASCatalogsUpsertHotelItem.getExample();
        OASCatalogsUpsertHotelItem catalogsUpsertHotelItem2 = OASCatalogsUpsertHotelItem.getExample();
        OASCatalogsUpsertHotelItem catalogsUpsertHotelItem3 = new OASCatalogsUpsertHotelItem();
        OASCatalogsUpsertHotelItem catalogsUpsertHotelItem4 = new OASCatalogsUpsertHotelItem();

        System.assert(catalogsUpsertHotelItem1.equals(catalogsUpsertHotelItem2));
        System.assert(catalogsUpsertHotelItem2.equals(catalogsUpsertHotelItem1));
        System.assert(catalogsUpsertHotelItem3.equals(catalogsUpsertHotelItem4));
        System.assert(catalogsUpsertHotelItem4.equals(catalogsUpsertHotelItem3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsUpsertHotelItem catalogsUpsertHotelItem1 = OASCatalogsUpsertHotelItem.getExample();
        OASCatalogsUpsertHotelItem catalogsUpsertHotelItem2 = new OASCatalogsUpsertHotelItem();

        System.assertEquals(false, catalogsUpsertHotelItem1.equals('foo'));
        System.assertEquals(false, catalogsUpsertHotelItem2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsUpsertHotelItem catalogsUpsertHotelItem1 = OASCatalogsUpsertHotelItem.getExample();
        OASCatalogsUpsertHotelItem catalogsUpsertHotelItem2 = new OASCatalogsUpsertHotelItem();
        OASCatalogsUpsertHotelItem catalogsUpsertHotelItem3;

        System.assertEquals(false, catalogsUpsertHotelItem1.equals(catalogsUpsertHotelItem3));
        System.assertEquals(false, catalogsUpsertHotelItem2.equals(catalogsUpsertHotelItem3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsUpsertHotelItem catalogsUpsertHotelItem1 = OASCatalogsUpsertHotelItem.getExample();
        OASCatalogsUpsertHotelItem catalogsUpsertHotelItem2 = new OASCatalogsUpsertHotelItem();

        System.assertEquals(catalogsUpsertHotelItem1.hashCode(), catalogsUpsertHotelItem1.hashCode());
        System.assertEquals(catalogsUpsertHotelItem2.hashCode(), catalogsUpsertHotelItem2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsUpsertHotelItem catalogsUpsertHotelItem1 = OASCatalogsUpsertHotelItem.getExample();
        OASCatalogsUpsertHotelItem catalogsUpsertHotelItem2 = OASCatalogsUpsertHotelItem.getExample();
        OASCatalogsUpsertHotelItem catalogsUpsertHotelItem3 = new OASCatalogsUpsertHotelItem();
        OASCatalogsUpsertHotelItem catalogsUpsertHotelItem4 = new OASCatalogsUpsertHotelItem();

        System.assert(catalogsUpsertHotelItem1.equals(catalogsUpsertHotelItem2));
        System.assert(catalogsUpsertHotelItem3.equals(catalogsUpsertHotelItem4));
        System.assertEquals(catalogsUpsertHotelItem1.hashCode(), catalogsUpsertHotelItem2.hashCode());
        System.assertEquals(catalogsUpsertHotelItem3.hashCode(), catalogsUpsertHotelItem4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsUpsertHotelItem catalogsUpsertHotelItem = new OASCatalogsUpsertHotelItem();
        Map<String, String> x-property-mappings = catalogsUpsertHotelItem.getx-property-mappings();
        System.assertEquals('hotelId', x-property-mappings.get('hotel_id'));
    }
}
