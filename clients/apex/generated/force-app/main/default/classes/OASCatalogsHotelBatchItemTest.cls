@isTest
private class OASCatalogsHotelBatchItemTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsHotelBatchItem catalogsHotelBatchItem1 = OASCatalogsHotelBatchItem.getExample();
        OASCatalogsHotelBatchItem catalogsHotelBatchItem2 = catalogsHotelBatchItem1;
        OASCatalogsHotelBatchItem catalogsHotelBatchItem3 = new OASCatalogsHotelBatchItem();
        OASCatalogsHotelBatchItem catalogsHotelBatchItem4 = catalogsHotelBatchItem3;

        System.assert(catalogsHotelBatchItem1.equals(catalogsHotelBatchItem2));
        System.assert(catalogsHotelBatchItem2.equals(catalogsHotelBatchItem1));
        System.assert(catalogsHotelBatchItem1.equals(catalogsHotelBatchItem1));
        System.assert(catalogsHotelBatchItem3.equals(catalogsHotelBatchItem4));
        System.assert(catalogsHotelBatchItem4.equals(catalogsHotelBatchItem3));
        System.assert(catalogsHotelBatchItem3.equals(catalogsHotelBatchItem3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsHotelBatchItem catalogsHotelBatchItem1 = OASCatalogsHotelBatchItem.getExample();
        OASCatalogsHotelBatchItem catalogsHotelBatchItem2 = OASCatalogsHotelBatchItem.getExample();
        OASCatalogsHotelBatchItem catalogsHotelBatchItem3 = new OASCatalogsHotelBatchItem();
        OASCatalogsHotelBatchItem catalogsHotelBatchItem4 = new OASCatalogsHotelBatchItem();

        System.assert(catalogsHotelBatchItem1.equals(catalogsHotelBatchItem2));
        System.assert(catalogsHotelBatchItem2.equals(catalogsHotelBatchItem1));
        System.assert(catalogsHotelBatchItem3.equals(catalogsHotelBatchItem4));
        System.assert(catalogsHotelBatchItem4.equals(catalogsHotelBatchItem3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsHotelBatchItem catalogsHotelBatchItem1 = OASCatalogsHotelBatchItem.getExample();
        OASCatalogsHotelBatchItem catalogsHotelBatchItem2 = new OASCatalogsHotelBatchItem();

        System.assertEquals(false, catalogsHotelBatchItem1.equals('foo'));
        System.assertEquals(false, catalogsHotelBatchItem2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsHotelBatchItem catalogsHotelBatchItem1 = OASCatalogsHotelBatchItem.getExample();
        OASCatalogsHotelBatchItem catalogsHotelBatchItem2 = new OASCatalogsHotelBatchItem();
        OASCatalogsHotelBatchItem catalogsHotelBatchItem3;

        System.assertEquals(false, catalogsHotelBatchItem1.equals(catalogsHotelBatchItem3));
        System.assertEquals(false, catalogsHotelBatchItem2.equals(catalogsHotelBatchItem3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsHotelBatchItem catalogsHotelBatchItem1 = OASCatalogsHotelBatchItem.getExample();
        OASCatalogsHotelBatchItem catalogsHotelBatchItem2 = new OASCatalogsHotelBatchItem();

        System.assertEquals(catalogsHotelBatchItem1.hashCode(), catalogsHotelBatchItem1.hashCode());
        System.assertEquals(catalogsHotelBatchItem2.hashCode(), catalogsHotelBatchItem2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsHotelBatchItem catalogsHotelBatchItem1 = OASCatalogsHotelBatchItem.getExample();
        OASCatalogsHotelBatchItem catalogsHotelBatchItem2 = OASCatalogsHotelBatchItem.getExample();
        OASCatalogsHotelBatchItem catalogsHotelBatchItem3 = new OASCatalogsHotelBatchItem();
        OASCatalogsHotelBatchItem catalogsHotelBatchItem4 = new OASCatalogsHotelBatchItem();

        System.assert(catalogsHotelBatchItem1.equals(catalogsHotelBatchItem2));
        System.assert(catalogsHotelBatchItem3.equals(catalogsHotelBatchItem4));
        System.assertEquals(catalogsHotelBatchItem1.hashCode(), catalogsHotelBatchItem2.hashCode());
        System.assertEquals(catalogsHotelBatchItem3.hashCode(), catalogsHotelBatchItem4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsHotelBatchItem catalogsHotelBatchItem = new OASCatalogsHotelBatchItem();
        Map<String, String> x-property-mappings = catalogsHotelBatchItem.getx-property-mappings();
        System.assertEquals('hotelId', x-property-mappings.get('hotel_id'));
    }
}
