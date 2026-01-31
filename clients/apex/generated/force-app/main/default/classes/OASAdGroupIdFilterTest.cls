@isTest
private class OASAdGroupIdFilterTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdGroupIdFilter adGroupIdFilter1 = OASAdGroupIdFilter.getExample();
        OASAdGroupIdFilter adGroupIdFilter2 = adGroupIdFilter1;
        OASAdGroupIdFilter adGroupIdFilter3 = new OASAdGroupIdFilter();
        OASAdGroupIdFilter adGroupIdFilter4 = adGroupIdFilter3;

        System.assert(adGroupIdFilter1.equals(adGroupIdFilter2));
        System.assert(adGroupIdFilter2.equals(adGroupIdFilter1));
        System.assert(adGroupIdFilter1.equals(adGroupIdFilter1));
        System.assert(adGroupIdFilter3.equals(adGroupIdFilter4));
        System.assert(adGroupIdFilter4.equals(adGroupIdFilter3));
        System.assert(adGroupIdFilter3.equals(adGroupIdFilter3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdGroupIdFilter adGroupIdFilter1 = OASAdGroupIdFilter.getExample();
        OASAdGroupIdFilter adGroupIdFilter2 = OASAdGroupIdFilter.getExample();
        OASAdGroupIdFilter adGroupIdFilter3 = new OASAdGroupIdFilter();
        OASAdGroupIdFilter adGroupIdFilter4 = new OASAdGroupIdFilter();

        System.assert(adGroupIdFilter1.equals(adGroupIdFilter2));
        System.assert(adGroupIdFilter2.equals(adGroupIdFilter1));
        System.assert(adGroupIdFilter3.equals(adGroupIdFilter4));
        System.assert(adGroupIdFilter4.equals(adGroupIdFilter3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdGroupIdFilter adGroupIdFilter1 = OASAdGroupIdFilter.getExample();
        OASAdGroupIdFilter adGroupIdFilter2 = new OASAdGroupIdFilter();

        System.assertEquals(false, adGroupIdFilter1.equals('foo'));
        System.assertEquals(false, adGroupIdFilter2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdGroupIdFilter adGroupIdFilter1 = OASAdGroupIdFilter.getExample();
        OASAdGroupIdFilter adGroupIdFilter2 = new OASAdGroupIdFilter();
        OASAdGroupIdFilter adGroupIdFilter3;

        System.assertEquals(false, adGroupIdFilter1.equals(adGroupIdFilter3));
        System.assertEquals(false, adGroupIdFilter2.equals(adGroupIdFilter3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdGroupIdFilter adGroupIdFilter1 = OASAdGroupIdFilter.getExample();
        OASAdGroupIdFilter adGroupIdFilter2 = new OASAdGroupIdFilter();

        System.assertEquals(adGroupIdFilter1.hashCode(), adGroupIdFilter1.hashCode());
        System.assertEquals(adGroupIdFilter2.hashCode(), adGroupIdFilter2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdGroupIdFilter adGroupIdFilter1 = OASAdGroupIdFilter.getExample();
        OASAdGroupIdFilter adGroupIdFilter2 = OASAdGroupIdFilter.getExample();
        OASAdGroupIdFilter adGroupIdFilter3 = new OASAdGroupIdFilter();
        OASAdGroupIdFilter adGroupIdFilter4 = new OASAdGroupIdFilter();

        System.assert(adGroupIdFilter1.equals(adGroupIdFilter2));
        System.assert(adGroupIdFilter3.equals(adGroupIdFilter4));
        System.assertEquals(adGroupIdFilter1.hashCode(), adGroupIdFilter2.hashCode());
        System.assertEquals(adGroupIdFilter3.hashCode(), adGroupIdFilter4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAdGroupIdFilter adGroupIdFilter = new OASAdGroupIdFilter();
        Map<String, String> x-property-mappings = adGroupIdFilter.getx-property-mappings();
        System.assertEquals('adGroupIds', x-property-mappings.get('ad_group_ids'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAdGroupIdFilter adGroupIdFilter = new OASAdGroupIdFilter();
        System.assertEquals(new List<String>(), adGroupIdFilter.adGroupIds);
    }
}
