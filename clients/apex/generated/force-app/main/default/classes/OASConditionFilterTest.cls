@isTest
private class OASConditionFilterTest {
    @isTest
    private static void equalsSameInstance() {
        OASConditionFilter conditionFilter1 = OASConditionFilter.getExample();
        OASConditionFilter conditionFilter2 = conditionFilter1;
        OASConditionFilter conditionFilter3 = new OASConditionFilter();
        OASConditionFilter conditionFilter4 = conditionFilter3;

        System.assert(conditionFilter1.equals(conditionFilter2));
        System.assert(conditionFilter2.equals(conditionFilter1));
        System.assert(conditionFilter1.equals(conditionFilter1));
        System.assert(conditionFilter3.equals(conditionFilter4));
        System.assert(conditionFilter4.equals(conditionFilter3));
        System.assert(conditionFilter3.equals(conditionFilter3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASConditionFilter conditionFilter1 = OASConditionFilter.getExample();
        OASConditionFilter conditionFilter2 = OASConditionFilter.getExample();
        OASConditionFilter conditionFilter3 = new OASConditionFilter();
        OASConditionFilter conditionFilter4 = new OASConditionFilter();

        System.assert(conditionFilter1.equals(conditionFilter2));
        System.assert(conditionFilter2.equals(conditionFilter1));
        System.assert(conditionFilter3.equals(conditionFilter4));
        System.assert(conditionFilter4.equals(conditionFilter3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASConditionFilter conditionFilter1 = OASConditionFilter.getExample();
        OASConditionFilter conditionFilter2 = new OASConditionFilter();

        System.assertEquals(false, conditionFilter1.equals('foo'));
        System.assertEquals(false, conditionFilter2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASConditionFilter conditionFilter1 = OASConditionFilter.getExample();
        OASConditionFilter conditionFilter2 = new OASConditionFilter();
        OASConditionFilter conditionFilter3;

        System.assertEquals(false, conditionFilter1.equals(conditionFilter3));
        System.assertEquals(false, conditionFilter2.equals(conditionFilter3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASConditionFilter conditionFilter1 = OASConditionFilter.getExample();
        OASConditionFilter conditionFilter2 = new OASConditionFilter();

        System.assertEquals(conditionFilter1.hashCode(), conditionFilter1.hashCode());
        System.assertEquals(conditionFilter2.hashCode(), conditionFilter2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASConditionFilter conditionFilter1 = OASConditionFilter.getExample();
        OASConditionFilter conditionFilter2 = OASConditionFilter.getExample();
        OASConditionFilter conditionFilter3 = new OASConditionFilter();
        OASConditionFilter conditionFilter4 = new OASConditionFilter();

        System.assert(conditionFilter1.equals(conditionFilter2));
        System.assert(conditionFilter3.equals(conditionFilter4));
        System.assertEquals(conditionFilter1.hashCode(), conditionFilter2.hashCode());
        System.assertEquals(conditionFilter3.hashCode(), conditionFilter4.hashCode());
    }
}
