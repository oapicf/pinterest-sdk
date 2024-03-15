@isTest
private class OASPriceFilterTest {
    @isTest
    private static void equalsSameInstance() {
        OASPriceFilter priceFilter1 = OASPriceFilter.getExample();
        OASPriceFilter priceFilter2 = priceFilter1;
        OASPriceFilter priceFilter3 = new OASPriceFilter();
        OASPriceFilter priceFilter4 = priceFilter3;

        System.assert(priceFilter1.equals(priceFilter2));
        System.assert(priceFilter2.equals(priceFilter1));
        System.assert(priceFilter1.equals(priceFilter1));
        System.assert(priceFilter3.equals(priceFilter4));
        System.assert(priceFilter4.equals(priceFilter3));
        System.assert(priceFilter3.equals(priceFilter3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPriceFilter priceFilter1 = OASPriceFilter.getExample();
        OASPriceFilter priceFilter2 = OASPriceFilter.getExample();
        OASPriceFilter priceFilter3 = new OASPriceFilter();
        OASPriceFilter priceFilter4 = new OASPriceFilter();

        System.assert(priceFilter1.equals(priceFilter2));
        System.assert(priceFilter2.equals(priceFilter1));
        System.assert(priceFilter3.equals(priceFilter4));
        System.assert(priceFilter4.equals(priceFilter3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPriceFilter priceFilter1 = OASPriceFilter.getExample();
        OASPriceFilter priceFilter2 = new OASPriceFilter();

        System.assertEquals(false, priceFilter1.equals('foo'));
        System.assertEquals(false, priceFilter2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPriceFilter priceFilter1 = OASPriceFilter.getExample();
        OASPriceFilter priceFilter2 = new OASPriceFilter();
        OASPriceFilter priceFilter3;

        System.assertEquals(false, priceFilter1.equals(priceFilter3));
        System.assertEquals(false, priceFilter2.equals(priceFilter3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPriceFilter priceFilter1 = OASPriceFilter.getExample();
        OASPriceFilter priceFilter2 = new OASPriceFilter();

        System.assertEquals(priceFilter1.hashCode(), priceFilter1.hashCode());
        System.assertEquals(priceFilter2.hashCode(), priceFilter2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPriceFilter priceFilter1 = OASPriceFilter.getExample();
        OASPriceFilter priceFilter2 = OASPriceFilter.getExample();
        OASPriceFilter priceFilter3 = new OASPriceFilter();
        OASPriceFilter priceFilter4 = new OASPriceFilter();

        System.assert(priceFilter1.equals(priceFilter2));
        System.assert(priceFilter3.equals(priceFilter4));
        System.assertEquals(priceFilter1.hashCode(), priceFilter2.hashCode());
        System.assertEquals(priceFilter3.hashCode(), priceFilter4.hashCode());
    }
}
