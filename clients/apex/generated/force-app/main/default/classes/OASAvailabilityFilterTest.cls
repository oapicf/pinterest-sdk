@isTest
private class OASAvailabilityFilterTest {
    @isTest
    private static void equalsSameInstance() {
        OASAvailabilityFilter availabilityFilter1 = OASAvailabilityFilter.getExample();
        OASAvailabilityFilter availabilityFilter2 = availabilityFilter1;
        OASAvailabilityFilter availabilityFilter3 = new OASAvailabilityFilter();
        OASAvailabilityFilter availabilityFilter4 = availabilityFilter3;

        System.assert(availabilityFilter1.equals(availabilityFilter2));
        System.assert(availabilityFilter2.equals(availabilityFilter1));
        System.assert(availabilityFilter1.equals(availabilityFilter1));
        System.assert(availabilityFilter3.equals(availabilityFilter4));
        System.assert(availabilityFilter4.equals(availabilityFilter3));
        System.assert(availabilityFilter3.equals(availabilityFilter3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAvailabilityFilter availabilityFilter1 = OASAvailabilityFilter.getExample();
        OASAvailabilityFilter availabilityFilter2 = OASAvailabilityFilter.getExample();
        OASAvailabilityFilter availabilityFilter3 = new OASAvailabilityFilter();
        OASAvailabilityFilter availabilityFilter4 = new OASAvailabilityFilter();

        System.assert(availabilityFilter1.equals(availabilityFilter2));
        System.assert(availabilityFilter2.equals(availabilityFilter1));
        System.assert(availabilityFilter3.equals(availabilityFilter4));
        System.assert(availabilityFilter4.equals(availabilityFilter3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAvailabilityFilter availabilityFilter1 = OASAvailabilityFilter.getExample();
        OASAvailabilityFilter availabilityFilter2 = new OASAvailabilityFilter();

        System.assertEquals(false, availabilityFilter1.equals('foo'));
        System.assertEquals(false, availabilityFilter2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAvailabilityFilter availabilityFilter1 = OASAvailabilityFilter.getExample();
        OASAvailabilityFilter availabilityFilter2 = new OASAvailabilityFilter();
        OASAvailabilityFilter availabilityFilter3;

        System.assertEquals(false, availabilityFilter1.equals(availabilityFilter3));
        System.assertEquals(false, availabilityFilter2.equals(availabilityFilter3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAvailabilityFilter availabilityFilter1 = OASAvailabilityFilter.getExample();
        OASAvailabilityFilter availabilityFilter2 = new OASAvailabilityFilter();

        System.assertEquals(availabilityFilter1.hashCode(), availabilityFilter1.hashCode());
        System.assertEquals(availabilityFilter2.hashCode(), availabilityFilter2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAvailabilityFilter availabilityFilter1 = OASAvailabilityFilter.getExample();
        OASAvailabilityFilter availabilityFilter2 = OASAvailabilityFilter.getExample();
        OASAvailabilityFilter availabilityFilter3 = new OASAvailabilityFilter();
        OASAvailabilityFilter availabilityFilter4 = new OASAvailabilityFilter();

        System.assert(availabilityFilter1.equals(availabilityFilter2));
        System.assert(availabilityFilter3.equals(availabilityFilter4));
        System.assertEquals(availabilityFilter1.hashCode(), availabilityFilter2.hashCode());
        System.assertEquals(availabilityFilter3.hashCode(), availabilityFilter4.hashCode());
    }
}
