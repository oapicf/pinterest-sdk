@isTest
private class OASAdGroupCommonOptimizationGoalMetaTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdGroupCommonOptimizationGoalMeta adGroupCommonOptimizationGoalMetadata1 = OASAdGroupCommonOptimizationGoalMeta.getExample();
        OASAdGroupCommonOptimizationGoalMeta adGroupCommonOptimizationGoalMetadata2 = adGroupCommonOptimizationGoalMetadata1;
        OASAdGroupCommonOptimizationGoalMeta adGroupCommonOptimizationGoalMetadata3 = new OASAdGroupCommonOptimizationGoalMeta();
        OASAdGroupCommonOptimizationGoalMeta adGroupCommonOptimizationGoalMetadata4 = adGroupCommonOptimizationGoalMetadata3;

        System.assert(adGroupCommonOptimizationGoalMetadata1.equals(adGroupCommonOptimizationGoalMetadata2));
        System.assert(adGroupCommonOptimizationGoalMetadata2.equals(adGroupCommonOptimizationGoalMetadata1));
        System.assert(adGroupCommonOptimizationGoalMetadata1.equals(adGroupCommonOptimizationGoalMetadata1));
        System.assert(adGroupCommonOptimizationGoalMetadata3.equals(adGroupCommonOptimizationGoalMetadata4));
        System.assert(adGroupCommonOptimizationGoalMetadata4.equals(adGroupCommonOptimizationGoalMetadata3));
        System.assert(adGroupCommonOptimizationGoalMetadata3.equals(adGroupCommonOptimizationGoalMetadata3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdGroupCommonOptimizationGoalMeta adGroupCommonOptimizationGoalMetadata1 = OASAdGroupCommonOptimizationGoalMeta.getExample();
        OASAdGroupCommonOptimizationGoalMeta adGroupCommonOptimizationGoalMetadata2 = OASAdGroupCommonOptimizationGoalMeta.getExample();
        OASAdGroupCommonOptimizationGoalMeta adGroupCommonOptimizationGoalMetadata3 = new OASAdGroupCommonOptimizationGoalMeta();
        OASAdGroupCommonOptimizationGoalMeta adGroupCommonOptimizationGoalMetadata4 = new OASAdGroupCommonOptimizationGoalMeta();

        System.assert(adGroupCommonOptimizationGoalMetadata1.equals(adGroupCommonOptimizationGoalMetadata2));
        System.assert(adGroupCommonOptimizationGoalMetadata2.equals(adGroupCommonOptimizationGoalMetadata1));
        System.assert(adGroupCommonOptimizationGoalMetadata3.equals(adGroupCommonOptimizationGoalMetadata4));
        System.assert(adGroupCommonOptimizationGoalMetadata4.equals(adGroupCommonOptimizationGoalMetadata3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdGroupCommonOptimizationGoalMeta adGroupCommonOptimizationGoalMetadata1 = OASAdGroupCommonOptimizationGoalMeta.getExample();
        OASAdGroupCommonOptimizationGoalMeta adGroupCommonOptimizationGoalMetadata2 = new OASAdGroupCommonOptimizationGoalMeta();

        System.assertEquals(false, adGroupCommonOptimizationGoalMetadata1.equals('foo'));
        System.assertEquals(false, adGroupCommonOptimizationGoalMetadata2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdGroupCommonOptimizationGoalMeta adGroupCommonOptimizationGoalMetadata1 = OASAdGroupCommonOptimizationGoalMeta.getExample();
        OASAdGroupCommonOptimizationGoalMeta adGroupCommonOptimizationGoalMetadata2 = new OASAdGroupCommonOptimizationGoalMeta();
        OASAdGroupCommonOptimizationGoalMeta adGroupCommonOptimizationGoalMetadata3;

        System.assertEquals(false, adGroupCommonOptimizationGoalMetadata1.equals(adGroupCommonOptimizationGoalMetadata3));
        System.assertEquals(false, adGroupCommonOptimizationGoalMetadata2.equals(adGroupCommonOptimizationGoalMetadata3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdGroupCommonOptimizationGoalMeta adGroupCommonOptimizationGoalMetadata1 = OASAdGroupCommonOptimizationGoalMeta.getExample();
        OASAdGroupCommonOptimizationGoalMeta adGroupCommonOptimizationGoalMetadata2 = new OASAdGroupCommonOptimizationGoalMeta();

        System.assertEquals(adGroupCommonOptimizationGoalMetadata1.hashCode(), adGroupCommonOptimizationGoalMetadata1.hashCode());
        System.assertEquals(adGroupCommonOptimizationGoalMetadata2.hashCode(), adGroupCommonOptimizationGoalMetadata2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdGroupCommonOptimizationGoalMeta adGroupCommonOptimizationGoalMetadata1 = OASAdGroupCommonOptimizationGoalMeta.getExample();
        OASAdGroupCommonOptimizationGoalMeta adGroupCommonOptimizationGoalMetadata2 = OASAdGroupCommonOptimizationGoalMeta.getExample();
        OASAdGroupCommonOptimizationGoalMeta adGroupCommonOptimizationGoalMetadata3 = new OASAdGroupCommonOptimizationGoalMeta();
        OASAdGroupCommonOptimizationGoalMeta adGroupCommonOptimizationGoalMetadata4 = new OASAdGroupCommonOptimizationGoalMeta();

        System.assert(adGroupCommonOptimizationGoalMetadata1.equals(adGroupCommonOptimizationGoalMetadata2));
        System.assert(adGroupCommonOptimizationGoalMetadata3.equals(adGroupCommonOptimizationGoalMetadata4));
        System.assertEquals(adGroupCommonOptimizationGoalMetadata1.hashCode(), adGroupCommonOptimizationGoalMetadata2.hashCode());
        System.assertEquals(adGroupCommonOptimizationGoalMetadata3.hashCode(), adGroupCommonOptimizationGoalMetadata4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAdGroupCommonOptimizationGoalMeta adGroupCommonOptimizationGoalMetadata = new OASAdGroupCommonOptimizationGoalMeta();
        Map<String, String> x-property-mappings = adGroupCommonOptimizationGoalMetadata.getx-property-mappings();
        System.assertEquals('conversionTagV3GoalMetadata', x-property-mappings.get('conversion_tag_v3_goal_metadata'));
        System.assertEquals('frequencyGoalMetadata', x-property-mappings.get('frequency_goal_metadata'));
        System.assertEquals('scrollupGoalMetadata', x-property-mappings.get('scrollup_goal_metadata'));
    }
}
