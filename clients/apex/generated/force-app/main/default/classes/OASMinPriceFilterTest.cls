@isTest
private class OASMinPriceFilterTest {
    @isTest
    private static void equalsSameInstance() {
        OASMinPriceFilter minPriceFilter1 = OASMinPriceFilter.getExample();
        OASMinPriceFilter minPriceFilter2 = minPriceFilter1;
        OASMinPriceFilter minPriceFilter3 = new OASMinPriceFilter();
        OASMinPriceFilter minPriceFilter4 = minPriceFilter3;

        System.assert(minPriceFilter1.equals(minPriceFilter2));
        System.assert(minPriceFilter2.equals(minPriceFilter1));
        System.assert(minPriceFilter1.equals(minPriceFilter1));
        System.assert(minPriceFilter3.equals(minPriceFilter4));
        System.assert(minPriceFilter4.equals(minPriceFilter3));
        System.assert(minPriceFilter3.equals(minPriceFilter3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMinPriceFilter minPriceFilter1 = OASMinPriceFilter.getExample();
        OASMinPriceFilter minPriceFilter2 = OASMinPriceFilter.getExample();
        OASMinPriceFilter minPriceFilter3 = new OASMinPriceFilter();
        OASMinPriceFilter minPriceFilter4 = new OASMinPriceFilter();

        System.assert(minPriceFilter1.equals(minPriceFilter2));
        System.assert(minPriceFilter2.equals(minPriceFilter1));
        System.assert(minPriceFilter3.equals(minPriceFilter4));
        System.assert(minPriceFilter4.equals(minPriceFilter3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMinPriceFilter minPriceFilter1 = OASMinPriceFilter.getExample();
        OASMinPriceFilter minPriceFilter2 = new OASMinPriceFilter();

        System.assertEquals(false, minPriceFilter1.equals('foo'));
        System.assertEquals(false, minPriceFilter2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMinPriceFilter minPriceFilter1 = OASMinPriceFilter.getExample();
        OASMinPriceFilter minPriceFilter2 = new OASMinPriceFilter();
        OASMinPriceFilter minPriceFilter3;

        System.assertEquals(false, minPriceFilter1.equals(minPriceFilter3));
        System.assertEquals(false, minPriceFilter2.equals(minPriceFilter3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMinPriceFilter minPriceFilter1 = OASMinPriceFilter.getExample();
        OASMinPriceFilter minPriceFilter2 = new OASMinPriceFilter();

        System.assertEquals(minPriceFilter1.hashCode(), minPriceFilter1.hashCode());
        System.assertEquals(minPriceFilter2.hashCode(), minPriceFilter2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMinPriceFilter minPriceFilter1 = OASMinPriceFilter.getExample();
        OASMinPriceFilter minPriceFilter2 = OASMinPriceFilter.getExample();
        OASMinPriceFilter minPriceFilter3 = new OASMinPriceFilter();
        OASMinPriceFilter minPriceFilter4 = new OASMinPriceFilter();

        System.assert(minPriceFilter1.equals(minPriceFilter2));
        System.assert(minPriceFilter3.equals(minPriceFilter4));
        System.assertEquals(minPriceFilter1.hashCode(), minPriceFilter2.hashCode());
        System.assertEquals(minPriceFilter3.hashCode(), minPriceFilter4.hashCode());
    }
}
