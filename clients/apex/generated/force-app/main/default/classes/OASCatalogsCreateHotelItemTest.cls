@isTest
private class OASCatalogsCreateHotelItemTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsCreateHotelItem catalogsCreateHotelItem1 = OASCatalogsCreateHotelItem.getExample();
        OASCatalogsCreateHotelItem catalogsCreateHotelItem2 = catalogsCreateHotelItem1;
        OASCatalogsCreateHotelItem catalogsCreateHotelItem3 = new OASCatalogsCreateHotelItem();
        OASCatalogsCreateHotelItem catalogsCreateHotelItem4 = catalogsCreateHotelItem3;

        System.assert(catalogsCreateHotelItem1.equals(catalogsCreateHotelItem2));
        System.assert(catalogsCreateHotelItem2.equals(catalogsCreateHotelItem1));
        System.assert(catalogsCreateHotelItem1.equals(catalogsCreateHotelItem1));
        System.assert(catalogsCreateHotelItem3.equals(catalogsCreateHotelItem4));
        System.assert(catalogsCreateHotelItem4.equals(catalogsCreateHotelItem3));
        System.assert(catalogsCreateHotelItem3.equals(catalogsCreateHotelItem3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsCreateHotelItem catalogsCreateHotelItem1 = OASCatalogsCreateHotelItem.getExample();
        OASCatalogsCreateHotelItem catalogsCreateHotelItem2 = OASCatalogsCreateHotelItem.getExample();
        OASCatalogsCreateHotelItem catalogsCreateHotelItem3 = new OASCatalogsCreateHotelItem();
        OASCatalogsCreateHotelItem catalogsCreateHotelItem4 = new OASCatalogsCreateHotelItem();

        System.assert(catalogsCreateHotelItem1.equals(catalogsCreateHotelItem2));
        System.assert(catalogsCreateHotelItem2.equals(catalogsCreateHotelItem1));
        System.assert(catalogsCreateHotelItem3.equals(catalogsCreateHotelItem4));
        System.assert(catalogsCreateHotelItem4.equals(catalogsCreateHotelItem3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsCreateHotelItem catalogsCreateHotelItem1 = OASCatalogsCreateHotelItem.getExample();
        OASCatalogsCreateHotelItem catalogsCreateHotelItem2 = new OASCatalogsCreateHotelItem();

        System.assertEquals(false, catalogsCreateHotelItem1.equals('foo'));
        System.assertEquals(false, catalogsCreateHotelItem2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsCreateHotelItem catalogsCreateHotelItem1 = OASCatalogsCreateHotelItem.getExample();
        OASCatalogsCreateHotelItem catalogsCreateHotelItem2 = new OASCatalogsCreateHotelItem();
        OASCatalogsCreateHotelItem catalogsCreateHotelItem3;

        System.assertEquals(false, catalogsCreateHotelItem1.equals(catalogsCreateHotelItem3));
        System.assertEquals(false, catalogsCreateHotelItem2.equals(catalogsCreateHotelItem3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsCreateHotelItem catalogsCreateHotelItem1 = OASCatalogsCreateHotelItem.getExample();
        OASCatalogsCreateHotelItem catalogsCreateHotelItem2 = new OASCatalogsCreateHotelItem();

        System.assertEquals(catalogsCreateHotelItem1.hashCode(), catalogsCreateHotelItem1.hashCode());
        System.assertEquals(catalogsCreateHotelItem2.hashCode(), catalogsCreateHotelItem2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsCreateHotelItem catalogsCreateHotelItem1 = OASCatalogsCreateHotelItem.getExample();
        OASCatalogsCreateHotelItem catalogsCreateHotelItem2 = OASCatalogsCreateHotelItem.getExample();
        OASCatalogsCreateHotelItem catalogsCreateHotelItem3 = new OASCatalogsCreateHotelItem();
        OASCatalogsCreateHotelItem catalogsCreateHotelItem4 = new OASCatalogsCreateHotelItem();

        System.assert(catalogsCreateHotelItem1.equals(catalogsCreateHotelItem2));
        System.assert(catalogsCreateHotelItem3.equals(catalogsCreateHotelItem4));
        System.assertEquals(catalogsCreateHotelItem1.hashCode(), catalogsCreateHotelItem2.hashCode());
        System.assertEquals(catalogsCreateHotelItem3.hashCode(), catalogsCreateHotelItem4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsCreateHotelItem catalogsCreateHotelItem = new OASCatalogsCreateHotelItem();
        Map<String, String> x-property-mappings = catalogsCreateHotelItem.getx-property-mappings();
        System.assertEquals('hotelId', x-property-mappings.get('hotel_id'));
    }
}
