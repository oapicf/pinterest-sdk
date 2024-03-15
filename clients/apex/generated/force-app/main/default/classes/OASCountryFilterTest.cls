@isTest
private class OASCountryFilterTest {
    @isTest
    private static void equalsSameInstance() {
        OASCountryFilter countryFilter1 = OASCountryFilter.getExample();
        OASCountryFilter countryFilter2 = countryFilter1;
        OASCountryFilter countryFilter3 = new OASCountryFilter();
        OASCountryFilter countryFilter4 = countryFilter3;

        System.assert(countryFilter1.equals(countryFilter2));
        System.assert(countryFilter2.equals(countryFilter1));
        System.assert(countryFilter1.equals(countryFilter1));
        System.assert(countryFilter3.equals(countryFilter4));
        System.assert(countryFilter4.equals(countryFilter3));
        System.assert(countryFilter3.equals(countryFilter3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCountryFilter countryFilter1 = OASCountryFilter.getExample();
        OASCountryFilter countryFilter2 = OASCountryFilter.getExample();
        OASCountryFilter countryFilter3 = new OASCountryFilter();
        OASCountryFilter countryFilter4 = new OASCountryFilter();

        System.assert(countryFilter1.equals(countryFilter2));
        System.assert(countryFilter2.equals(countryFilter1));
        System.assert(countryFilter3.equals(countryFilter4));
        System.assert(countryFilter4.equals(countryFilter3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCountryFilter countryFilter1 = OASCountryFilter.getExample();
        OASCountryFilter countryFilter2 = new OASCountryFilter();

        System.assertEquals(false, countryFilter1.equals('foo'));
        System.assertEquals(false, countryFilter2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCountryFilter countryFilter1 = OASCountryFilter.getExample();
        OASCountryFilter countryFilter2 = new OASCountryFilter();
        OASCountryFilter countryFilter3;

        System.assertEquals(false, countryFilter1.equals(countryFilter3));
        System.assertEquals(false, countryFilter2.equals(countryFilter3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCountryFilter countryFilter1 = OASCountryFilter.getExample();
        OASCountryFilter countryFilter2 = new OASCountryFilter();

        System.assertEquals(countryFilter1.hashCode(), countryFilter1.hashCode());
        System.assertEquals(countryFilter2.hashCode(), countryFilter2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCountryFilter countryFilter1 = OASCountryFilter.getExample();
        OASCountryFilter countryFilter2 = OASCountryFilter.getExample();
        OASCountryFilter countryFilter3 = new OASCountryFilter();
        OASCountryFilter countryFilter4 = new OASCountryFilter();

        System.assert(countryFilter1.equals(countryFilter2));
        System.assert(countryFilter3.equals(countryFilter4));
        System.assertEquals(countryFilter1.hashCode(), countryFilter2.hashCode());
        System.assertEquals(countryFilter3.hashCode(), countryFilter4.hashCode());
    }
}
