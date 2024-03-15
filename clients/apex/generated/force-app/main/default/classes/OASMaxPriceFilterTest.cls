@isTest
private class OASMaxPriceFilterTest {
    @isTest
    private static void equalsSameInstance() {
        OASMaxPriceFilter maxPriceFilter1 = OASMaxPriceFilter.getExample();
        OASMaxPriceFilter maxPriceFilter2 = maxPriceFilter1;
        OASMaxPriceFilter maxPriceFilter3 = new OASMaxPriceFilter();
        OASMaxPriceFilter maxPriceFilter4 = maxPriceFilter3;

        System.assert(maxPriceFilter1.equals(maxPriceFilter2));
        System.assert(maxPriceFilter2.equals(maxPriceFilter1));
        System.assert(maxPriceFilter1.equals(maxPriceFilter1));
        System.assert(maxPriceFilter3.equals(maxPriceFilter4));
        System.assert(maxPriceFilter4.equals(maxPriceFilter3));
        System.assert(maxPriceFilter3.equals(maxPriceFilter3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMaxPriceFilter maxPriceFilter1 = OASMaxPriceFilter.getExample();
        OASMaxPriceFilter maxPriceFilter2 = OASMaxPriceFilter.getExample();
        OASMaxPriceFilter maxPriceFilter3 = new OASMaxPriceFilter();
        OASMaxPriceFilter maxPriceFilter4 = new OASMaxPriceFilter();

        System.assert(maxPriceFilter1.equals(maxPriceFilter2));
        System.assert(maxPriceFilter2.equals(maxPriceFilter1));
        System.assert(maxPriceFilter3.equals(maxPriceFilter4));
        System.assert(maxPriceFilter4.equals(maxPriceFilter3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMaxPriceFilter maxPriceFilter1 = OASMaxPriceFilter.getExample();
        OASMaxPriceFilter maxPriceFilter2 = new OASMaxPriceFilter();

        System.assertEquals(false, maxPriceFilter1.equals('foo'));
        System.assertEquals(false, maxPriceFilter2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMaxPriceFilter maxPriceFilter1 = OASMaxPriceFilter.getExample();
        OASMaxPriceFilter maxPriceFilter2 = new OASMaxPriceFilter();
        OASMaxPriceFilter maxPriceFilter3;

        System.assertEquals(false, maxPriceFilter1.equals(maxPriceFilter3));
        System.assertEquals(false, maxPriceFilter2.equals(maxPriceFilter3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMaxPriceFilter maxPriceFilter1 = OASMaxPriceFilter.getExample();
        OASMaxPriceFilter maxPriceFilter2 = new OASMaxPriceFilter();

        System.assertEquals(maxPriceFilter1.hashCode(), maxPriceFilter1.hashCode());
        System.assertEquals(maxPriceFilter2.hashCode(), maxPriceFilter2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMaxPriceFilter maxPriceFilter1 = OASMaxPriceFilter.getExample();
        OASMaxPriceFilter maxPriceFilter2 = OASMaxPriceFilter.getExample();
        OASMaxPriceFilter maxPriceFilter3 = new OASMaxPriceFilter();
        OASMaxPriceFilter maxPriceFilter4 = new OASMaxPriceFilter();

        System.assert(maxPriceFilter1.equals(maxPriceFilter2));
        System.assert(maxPriceFilter3.equals(maxPriceFilter4));
        System.assertEquals(maxPriceFilter1.hashCode(), maxPriceFilter2.hashCode());
        System.assertEquals(maxPriceFilter3.hashCode(), maxPriceFilter4.hashCode());
    }
}
