@isTest
private class OASTargetingTypeFilterTest {
    @isTest
    private static void equalsSameInstance() {
        OASTargetingTypeFilter targetingTypeFilter1 = OASTargetingTypeFilter.getExample();
        OASTargetingTypeFilter targetingTypeFilter2 = targetingTypeFilter1;
        OASTargetingTypeFilter targetingTypeFilter3 = new OASTargetingTypeFilter();
        OASTargetingTypeFilter targetingTypeFilter4 = targetingTypeFilter3;

        System.assert(targetingTypeFilter1.equals(targetingTypeFilter2));
        System.assert(targetingTypeFilter2.equals(targetingTypeFilter1));
        System.assert(targetingTypeFilter1.equals(targetingTypeFilter1));
        System.assert(targetingTypeFilter3.equals(targetingTypeFilter4));
        System.assert(targetingTypeFilter4.equals(targetingTypeFilter3));
        System.assert(targetingTypeFilter3.equals(targetingTypeFilter3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTargetingTypeFilter targetingTypeFilter1 = OASTargetingTypeFilter.getExample();
        OASTargetingTypeFilter targetingTypeFilter2 = OASTargetingTypeFilter.getExample();
        OASTargetingTypeFilter targetingTypeFilter3 = new OASTargetingTypeFilter();
        OASTargetingTypeFilter targetingTypeFilter4 = new OASTargetingTypeFilter();

        System.assert(targetingTypeFilter1.equals(targetingTypeFilter2));
        System.assert(targetingTypeFilter2.equals(targetingTypeFilter1));
        System.assert(targetingTypeFilter3.equals(targetingTypeFilter4));
        System.assert(targetingTypeFilter4.equals(targetingTypeFilter3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTargetingTypeFilter targetingTypeFilter1 = OASTargetingTypeFilter.getExample();
        OASTargetingTypeFilter targetingTypeFilter2 = new OASTargetingTypeFilter();

        System.assertEquals(false, targetingTypeFilter1.equals('foo'));
        System.assertEquals(false, targetingTypeFilter2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTargetingTypeFilter targetingTypeFilter1 = OASTargetingTypeFilter.getExample();
        OASTargetingTypeFilter targetingTypeFilter2 = new OASTargetingTypeFilter();
        OASTargetingTypeFilter targetingTypeFilter3;

        System.assertEquals(false, targetingTypeFilter1.equals(targetingTypeFilter3));
        System.assertEquals(false, targetingTypeFilter2.equals(targetingTypeFilter3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTargetingTypeFilter targetingTypeFilter1 = OASTargetingTypeFilter.getExample();
        OASTargetingTypeFilter targetingTypeFilter2 = new OASTargetingTypeFilter();

        System.assertEquals(targetingTypeFilter1.hashCode(), targetingTypeFilter1.hashCode());
        System.assertEquals(targetingTypeFilter2.hashCode(), targetingTypeFilter2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTargetingTypeFilter targetingTypeFilter1 = OASTargetingTypeFilter.getExample();
        OASTargetingTypeFilter targetingTypeFilter2 = OASTargetingTypeFilter.getExample();
        OASTargetingTypeFilter targetingTypeFilter3 = new OASTargetingTypeFilter();
        OASTargetingTypeFilter targetingTypeFilter4 = new OASTargetingTypeFilter();

        System.assert(targetingTypeFilter1.equals(targetingTypeFilter2));
        System.assert(targetingTypeFilter3.equals(targetingTypeFilter4));
        System.assertEquals(targetingTypeFilter1.hashCode(), targetingTypeFilter2.hashCode());
        System.assertEquals(targetingTypeFilter3.hashCode(), targetingTypeFilter4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASTargetingTypeFilter targetingTypeFilter = new OASTargetingTypeFilter();
        Map<String, String> x-property-mappings = targetingTypeFilter.getx-property-mappings();
        System.assertEquals('targetingTypes', x-property-mappings.get('targeting_types'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASTargetingTypeFilter targetingTypeFilter = new OASTargetingTypeFilter();
        System.assertEquals(new List<OASAdsAnalyticsTargetingType>(), targetingTypeFilter.targetingTypes);
    }
}
