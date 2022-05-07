@isTest
private class OASCurrencyFilterTest {
    @isTest
    private static void equalsSameInstance() {
        OASCurrencyFilter currencyFilter1 = OASCurrencyFilter.getExample();
        OASCurrencyFilter currencyFilter2 = currencyFilter1;
        OASCurrencyFilter currencyFilter3 = new OASCurrencyFilter();
        OASCurrencyFilter currencyFilter4 = currencyFilter3;

        System.assert(currencyFilter1.equals(currencyFilter2));
        System.assert(currencyFilter2.equals(currencyFilter1));
        System.assert(currencyFilter1.equals(currencyFilter1));
        System.assert(currencyFilter3.equals(currencyFilter4));
        System.assert(currencyFilter4.equals(currencyFilter3));
        System.assert(currencyFilter3.equals(currencyFilter3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCurrencyFilter currencyFilter1 = OASCurrencyFilter.getExample();
        OASCurrencyFilter currencyFilter2 = OASCurrencyFilter.getExample();
        OASCurrencyFilter currencyFilter3 = new OASCurrencyFilter();
        OASCurrencyFilter currencyFilter4 = new OASCurrencyFilter();

        System.assert(currencyFilter1.equals(currencyFilter2));
        System.assert(currencyFilter2.equals(currencyFilter1));
        System.assert(currencyFilter3.equals(currencyFilter4));
        System.assert(currencyFilter4.equals(currencyFilter3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCurrencyFilter currencyFilter1 = OASCurrencyFilter.getExample();
        OASCurrencyFilter currencyFilter2 = new OASCurrencyFilter();

        System.assertEquals(false, currencyFilter1.equals('foo'));
        System.assertEquals(false, currencyFilter2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCurrencyFilter currencyFilter1 = OASCurrencyFilter.getExample();
        OASCurrencyFilter currencyFilter2 = new OASCurrencyFilter();
        OASCurrencyFilter currencyFilter3;

        System.assertEquals(false, currencyFilter1.equals(currencyFilter3));
        System.assertEquals(false, currencyFilter2.equals(currencyFilter3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCurrencyFilter currencyFilter1 = OASCurrencyFilter.getExample();
        OASCurrencyFilter currencyFilter2 = new OASCurrencyFilter();

        System.assertEquals(currencyFilter1.hashCode(), currencyFilter1.hashCode());
        System.assertEquals(currencyFilter2.hashCode(), currencyFilter2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCurrencyFilter currencyFilter1 = OASCurrencyFilter.getExample();
        OASCurrencyFilter currencyFilter2 = OASCurrencyFilter.getExample();
        OASCurrencyFilter currencyFilter3 = new OASCurrencyFilter();
        OASCurrencyFilter currencyFilter4 = new OASCurrencyFilter();

        System.assert(currencyFilter1.equals(currencyFilter2));
        System.assert(currencyFilter3.equals(currencyFilter4));
        System.assertEquals(currencyFilter1.hashCode(), currencyFilter2.hashCode());
        System.assertEquals(currencyFilter3.hashCode(), currencyFilter4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCurrencyFilter currencyFilter = new OASCurrencyFilter();
        Map<String, String> x-property-mappings = currencyFilter.getx-property-mappings();
        System.assertEquals('r_CURRENCY', x-property-mappings.get('CURRENCY'));
    }
}
