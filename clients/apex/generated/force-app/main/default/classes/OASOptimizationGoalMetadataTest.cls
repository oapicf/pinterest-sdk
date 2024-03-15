@isTest
private class OASOptimizationGoalMetadataTest {
    @isTest
    private static void equalsSameInstance() {
        OASOptimizationGoalMetadata optimizationGoalMetadata1 = OASOptimizationGoalMetadata.getExample();
        OASOptimizationGoalMetadata optimizationGoalMetadata2 = optimizationGoalMetadata1;
        OASOptimizationGoalMetadata optimizationGoalMetadata3 = new OASOptimizationGoalMetadata();
        OASOptimizationGoalMetadata optimizationGoalMetadata4 = optimizationGoalMetadata3;

        System.assert(optimizationGoalMetadata1.equals(optimizationGoalMetadata2));
        System.assert(optimizationGoalMetadata2.equals(optimizationGoalMetadata1));
        System.assert(optimizationGoalMetadata1.equals(optimizationGoalMetadata1));
        System.assert(optimizationGoalMetadata3.equals(optimizationGoalMetadata4));
        System.assert(optimizationGoalMetadata4.equals(optimizationGoalMetadata3));
        System.assert(optimizationGoalMetadata3.equals(optimizationGoalMetadata3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOptimizationGoalMetadata optimizationGoalMetadata1 = OASOptimizationGoalMetadata.getExample();
        OASOptimizationGoalMetadata optimizationGoalMetadata2 = OASOptimizationGoalMetadata.getExample();
        OASOptimizationGoalMetadata optimizationGoalMetadata3 = new OASOptimizationGoalMetadata();
        OASOptimizationGoalMetadata optimizationGoalMetadata4 = new OASOptimizationGoalMetadata();

        System.assert(optimizationGoalMetadata1.equals(optimizationGoalMetadata2));
        System.assert(optimizationGoalMetadata2.equals(optimizationGoalMetadata1));
        System.assert(optimizationGoalMetadata3.equals(optimizationGoalMetadata4));
        System.assert(optimizationGoalMetadata4.equals(optimizationGoalMetadata3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOptimizationGoalMetadata optimizationGoalMetadata1 = OASOptimizationGoalMetadata.getExample();
        OASOptimizationGoalMetadata optimizationGoalMetadata2 = new OASOptimizationGoalMetadata();

        System.assertEquals(false, optimizationGoalMetadata1.equals('foo'));
        System.assertEquals(false, optimizationGoalMetadata2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOptimizationGoalMetadata optimizationGoalMetadata1 = OASOptimizationGoalMetadata.getExample();
        OASOptimizationGoalMetadata optimizationGoalMetadata2 = new OASOptimizationGoalMetadata();
        OASOptimizationGoalMetadata optimizationGoalMetadata3;

        System.assertEquals(false, optimizationGoalMetadata1.equals(optimizationGoalMetadata3));
        System.assertEquals(false, optimizationGoalMetadata2.equals(optimizationGoalMetadata3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOptimizationGoalMetadata optimizationGoalMetadata1 = OASOptimizationGoalMetadata.getExample();
        OASOptimizationGoalMetadata optimizationGoalMetadata2 = new OASOptimizationGoalMetadata();

        System.assertEquals(optimizationGoalMetadata1.hashCode(), optimizationGoalMetadata1.hashCode());
        System.assertEquals(optimizationGoalMetadata2.hashCode(), optimizationGoalMetadata2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOptimizationGoalMetadata optimizationGoalMetadata1 = OASOptimizationGoalMetadata.getExample();
        OASOptimizationGoalMetadata optimizationGoalMetadata2 = OASOptimizationGoalMetadata.getExample();
        OASOptimizationGoalMetadata optimizationGoalMetadata3 = new OASOptimizationGoalMetadata();
        OASOptimizationGoalMetadata optimizationGoalMetadata4 = new OASOptimizationGoalMetadata();

        System.assert(optimizationGoalMetadata1.equals(optimizationGoalMetadata2));
        System.assert(optimizationGoalMetadata3.equals(optimizationGoalMetadata4));
        System.assertEquals(optimizationGoalMetadata1.hashCode(), optimizationGoalMetadata2.hashCode());
        System.assertEquals(optimizationGoalMetadata3.hashCode(), optimizationGoalMetadata4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOptimizationGoalMetadata optimizationGoalMetadata = new OASOptimizationGoalMetadata();
        Map<String, String> x-property-mappings = optimizationGoalMetadata.getx-property-mappings();
        System.assertEquals('conversionTagV3GoalMetadata', x-property-mappings.get('conversion_tag_v3_goal_metadata'));
        System.assertEquals('frequencyGoalMetadata', x-property-mappings.get('frequency_goal_metadata'));
        System.assertEquals('scrollupGoalMetadata', x-property-mappings.get('scrollup_goal_metadata'));
    }
}
