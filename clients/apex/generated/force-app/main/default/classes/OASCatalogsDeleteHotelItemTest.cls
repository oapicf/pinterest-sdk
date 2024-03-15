@isTest
private class OASCatalogsDeleteHotelItemTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsDeleteHotelItem catalogsDeleteHotelItem1 = OASCatalogsDeleteHotelItem.getExample();
        OASCatalogsDeleteHotelItem catalogsDeleteHotelItem2 = catalogsDeleteHotelItem1;
        OASCatalogsDeleteHotelItem catalogsDeleteHotelItem3 = new OASCatalogsDeleteHotelItem();
        OASCatalogsDeleteHotelItem catalogsDeleteHotelItem4 = catalogsDeleteHotelItem3;

        System.assert(catalogsDeleteHotelItem1.equals(catalogsDeleteHotelItem2));
        System.assert(catalogsDeleteHotelItem2.equals(catalogsDeleteHotelItem1));
        System.assert(catalogsDeleteHotelItem1.equals(catalogsDeleteHotelItem1));
        System.assert(catalogsDeleteHotelItem3.equals(catalogsDeleteHotelItem4));
        System.assert(catalogsDeleteHotelItem4.equals(catalogsDeleteHotelItem3));
        System.assert(catalogsDeleteHotelItem3.equals(catalogsDeleteHotelItem3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsDeleteHotelItem catalogsDeleteHotelItem1 = OASCatalogsDeleteHotelItem.getExample();
        OASCatalogsDeleteHotelItem catalogsDeleteHotelItem2 = OASCatalogsDeleteHotelItem.getExample();
        OASCatalogsDeleteHotelItem catalogsDeleteHotelItem3 = new OASCatalogsDeleteHotelItem();
        OASCatalogsDeleteHotelItem catalogsDeleteHotelItem4 = new OASCatalogsDeleteHotelItem();

        System.assert(catalogsDeleteHotelItem1.equals(catalogsDeleteHotelItem2));
        System.assert(catalogsDeleteHotelItem2.equals(catalogsDeleteHotelItem1));
        System.assert(catalogsDeleteHotelItem3.equals(catalogsDeleteHotelItem4));
        System.assert(catalogsDeleteHotelItem4.equals(catalogsDeleteHotelItem3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsDeleteHotelItem catalogsDeleteHotelItem1 = OASCatalogsDeleteHotelItem.getExample();
        OASCatalogsDeleteHotelItem catalogsDeleteHotelItem2 = new OASCatalogsDeleteHotelItem();

        System.assertEquals(false, catalogsDeleteHotelItem1.equals('foo'));
        System.assertEquals(false, catalogsDeleteHotelItem2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsDeleteHotelItem catalogsDeleteHotelItem1 = OASCatalogsDeleteHotelItem.getExample();
        OASCatalogsDeleteHotelItem catalogsDeleteHotelItem2 = new OASCatalogsDeleteHotelItem();
        OASCatalogsDeleteHotelItem catalogsDeleteHotelItem3;

        System.assertEquals(false, catalogsDeleteHotelItem1.equals(catalogsDeleteHotelItem3));
        System.assertEquals(false, catalogsDeleteHotelItem2.equals(catalogsDeleteHotelItem3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsDeleteHotelItem catalogsDeleteHotelItem1 = OASCatalogsDeleteHotelItem.getExample();
        OASCatalogsDeleteHotelItem catalogsDeleteHotelItem2 = new OASCatalogsDeleteHotelItem();

        System.assertEquals(catalogsDeleteHotelItem1.hashCode(), catalogsDeleteHotelItem1.hashCode());
        System.assertEquals(catalogsDeleteHotelItem2.hashCode(), catalogsDeleteHotelItem2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsDeleteHotelItem catalogsDeleteHotelItem1 = OASCatalogsDeleteHotelItem.getExample();
        OASCatalogsDeleteHotelItem catalogsDeleteHotelItem2 = OASCatalogsDeleteHotelItem.getExample();
        OASCatalogsDeleteHotelItem catalogsDeleteHotelItem3 = new OASCatalogsDeleteHotelItem();
        OASCatalogsDeleteHotelItem catalogsDeleteHotelItem4 = new OASCatalogsDeleteHotelItem();

        System.assert(catalogsDeleteHotelItem1.equals(catalogsDeleteHotelItem2));
        System.assert(catalogsDeleteHotelItem3.equals(catalogsDeleteHotelItem4));
        System.assertEquals(catalogsDeleteHotelItem1.hashCode(), catalogsDeleteHotelItem2.hashCode());
        System.assertEquals(catalogsDeleteHotelItem3.hashCode(), catalogsDeleteHotelItem4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsDeleteHotelItem catalogsDeleteHotelItem = new OASCatalogsDeleteHotelItem();
        Map<String, String> x-property-mappings = catalogsDeleteHotelItem.getx-property-mappings();
        System.assertEquals('hotelId', x-property-mappings.get('hotel_id'));
    }
}
