@isTest
private class OASCatalogsUpdateHotelItemTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsUpdateHotelItem catalogsUpdateHotelItem1 = OASCatalogsUpdateHotelItem.getExample();
        OASCatalogsUpdateHotelItem catalogsUpdateHotelItem2 = catalogsUpdateHotelItem1;
        OASCatalogsUpdateHotelItem catalogsUpdateHotelItem3 = new OASCatalogsUpdateHotelItem();
        OASCatalogsUpdateHotelItem catalogsUpdateHotelItem4 = catalogsUpdateHotelItem3;

        System.assert(catalogsUpdateHotelItem1.equals(catalogsUpdateHotelItem2));
        System.assert(catalogsUpdateHotelItem2.equals(catalogsUpdateHotelItem1));
        System.assert(catalogsUpdateHotelItem1.equals(catalogsUpdateHotelItem1));
        System.assert(catalogsUpdateHotelItem3.equals(catalogsUpdateHotelItem4));
        System.assert(catalogsUpdateHotelItem4.equals(catalogsUpdateHotelItem3));
        System.assert(catalogsUpdateHotelItem3.equals(catalogsUpdateHotelItem3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsUpdateHotelItem catalogsUpdateHotelItem1 = OASCatalogsUpdateHotelItem.getExample();
        OASCatalogsUpdateHotelItem catalogsUpdateHotelItem2 = OASCatalogsUpdateHotelItem.getExample();
        OASCatalogsUpdateHotelItem catalogsUpdateHotelItem3 = new OASCatalogsUpdateHotelItem();
        OASCatalogsUpdateHotelItem catalogsUpdateHotelItem4 = new OASCatalogsUpdateHotelItem();

        System.assert(catalogsUpdateHotelItem1.equals(catalogsUpdateHotelItem2));
        System.assert(catalogsUpdateHotelItem2.equals(catalogsUpdateHotelItem1));
        System.assert(catalogsUpdateHotelItem3.equals(catalogsUpdateHotelItem4));
        System.assert(catalogsUpdateHotelItem4.equals(catalogsUpdateHotelItem3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsUpdateHotelItem catalogsUpdateHotelItem1 = OASCatalogsUpdateHotelItem.getExample();
        OASCatalogsUpdateHotelItem catalogsUpdateHotelItem2 = new OASCatalogsUpdateHotelItem();

        System.assertEquals(false, catalogsUpdateHotelItem1.equals('foo'));
        System.assertEquals(false, catalogsUpdateHotelItem2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsUpdateHotelItem catalogsUpdateHotelItem1 = OASCatalogsUpdateHotelItem.getExample();
        OASCatalogsUpdateHotelItem catalogsUpdateHotelItem2 = new OASCatalogsUpdateHotelItem();
        OASCatalogsUpdateHotelItem catalogsUpdateHotelItem3;

        System.assertEquals(false, catalogsUpdateHotelItem1.equals(catalogsUpdateHotelItem3));
        System.assertEquals(false, catalogsUpdateHotelItem2.equals(catalogsUpdateHotelItem3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsUpdateHotelItem catalogsUpdateHotelItem1 = OASCatalogsUpdateHotelItem.getExample();
        OASCatalogsUpdateHotelItem catalogsUpdateHotelItem2 = new OASCatalogsUpdateHotelItem();

        System.assertEquals(catalogsUpdateHotelItem1.hashCode(), catalogsUpdateHotelItem1.hashCode());
        System.assertEquals(catalogsUpdateHotelItem2.hashCode(), catalogsUpdateHotelItem2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsUpdateHotelItem catalogsUpdateHotelItem1 = OASCatalogsUpdateHotelItem.getExample();
        OASCatalogsUpdateHotelItem catalogsUpdateHotelItem2 = OASCatalogsUpdateHotelItem.getExample();
        OASCatalogsUpdateHotelItem catalogsUpdateHotelItem3 = new OASCatalogsUpdateHotelItem();
        OASCatalogsUpdateHotelItem catalogsUpdateHotelItem4 = new OASCatalogsUpdateHotelItem();

        System.assert(catalogsUpdateHotelItem1.equals(catalogsUpdateHotelItem2));
        System.assert(catalogsUpdateHotelItem3.equals(catalogsUpdateHotelItem4));
        System.assertEquals(catalogsUpdateHotelItem1.hashCode(), catalogsUpdateHotelItem2.hashCode());
        System.assertEquals(catalogsUpdateHotelItem3.hashCode(), catalogsUpdateHotelItem4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsUpdateHotelItem catalogsUpdateHotelItem = new OASCatalogsUpdateHotelItem();
        Map<String, String> x-property-mappings = catalogsUpdateHotelItem.getx-property-mappings();
        System.assertEquals('hotelId', x-property-mappings.get('hotel_id'));
    }
}
