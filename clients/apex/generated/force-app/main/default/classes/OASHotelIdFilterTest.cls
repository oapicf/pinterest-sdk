@isTest
private class OASHotelIdFilterTest {
    @isTest
    private static void equalsSameInstance() {
        OASHotelIdFilter hotelIdFilter1 = OASHotelIdFilter.getExample();
        OASHotelIdFilter hotelIdFilter2 = hotelIdFilter1;
        OASHotelIdFilter hotelIdFilter3 = new OASHotelIdFilter();
        OASHotelIdFilter hotelIdFilter4 = hotelIdFilter3;

        System.assert(hotelIdFilter1.equals(hotelIdFilter2));
        System.assert(hotelIdFilter2.equals(hotelIdFilter1));
        System.assert(hotelIdFilter1.equals(hotelIdFilter1));
        System.assert(hotelIdFilter3.equals(hotelIdFilter4));
        System.assert(hotelIdFilter4.equals(hotelIdFilter3));
        System.assert(hotelIdFilter3.equals(hotelIdFilter3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASHotelIdFilter hotelIdFilter1 = OASHotelIdFilter.getExample();
        OASHotelIdFilter hotelIdFilter2 = OASHotelIdFilter.getExample();
        OASHotelIdFilter hotelIdFilter3 = new OASHotelIdFilter();
        OASHotelIdFilter hotelIdFilter4 = new OASHotelIdFilter();

        System.assert(hotelIdFilter1.equals(hotelIdFilter2));
        System.assert(hotelIdFilter2.equals(hotelIdFilter1));
        System.assert(hotelIdFilter3.equals(hotelIdFilter4));
        System.assert(hotelIdFilter4.equals(hotelIdFilter3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASHotelIdFilter hotelIdFilter1 = OASHotelIdFilter.getExample();
        OASHotelIdFilter hotelIdFilter2 = new OASHotelIdFilter();

        System.assertEquals(false, hotelIdFilter1.equals('foo'));
        System.assertEquals(false, hotelIdFilter2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASHotelIdFilter hotelIdFilter1 = OASHotelIdFilter.getExample();
        OASHotelIdFilter hotelIdFilter2 = new OASHotelIdFilter();
        OASHotelIdFilter hotelIdFilter3;

        System.assertEquals(false, hotelIdFilter1.equals(hotelIdFilter3));
        System.assertEquals(false, hotelIdFilter2.equals(hotelIdFilter3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASHotelIdFilter hotelIdFilter1 = OASHotelIdFilter.getExample();
        OASHotelIdFilter hotelIdFilter2 = new OASHotelIdFilter();

        System.assertEquals(hotelIdFilter1.hashCode(), hotelIdFilter1.hashCode());
        System.assertEquals(hotelIdFilter2.hashCode(), hotelIdFilter2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASHotelIdFilter hotelIdFilter1 = OASHotelIdFilter.getExample();
        OASHotelIdFilter hotelIdFilter2 = OASHotelIdFilter.getExample();
        OASHotelIdFilter hotelIdFilter3 = new OASHotelIdFilter();
        OASHotelIdFilter hotelIdFilter4 = new OASHotelIdFilter();

        System.assert(hotelIdFilter1.equals(hotelIdFilter2));
        System.assert(hotelIdFilter3.equals(hotelIdFilter4));
        System.assertEquals(hotelIdFilter1.hashCode(), hotelIdFilter2.hashCode());
        System.assertEquals(hotelIdFilter3.hashCode(), hotelIdFilter4.hashCode());
    }
}
