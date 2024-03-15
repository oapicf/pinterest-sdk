@isTest
private class OASOptimizationGoalMetadataScrollupGTest {
    @isTest
    private static void equalsSameInstance() {
        OASOptimizationGoalMetadataScrollupG optimizationGoalMetadataScrollupGoalMetadata1 = OASOptimizationGoalMetadataScrollupG.getExample();
        OASOptimizationGoalMetadataScrollupG optimizationGoalMetadataScrollupGoalMetadata2 = optimizationGoalMetadataScrollupGoalMetadata1;
        OASOptimizationGoalMetadataScrollupG optimizationGoalMetadataScrollupGoalMetadata3 = new OASOptimizationGoalMetadataScrollupG();
        OASOptimizationGoalMetadataScrollupG optimizationGoalMetadataScrollupGoalMetadata4 = optimizationGoalMetadataScrollupGoalMetadata3;

        System.assert(optimizationGoalMetadataScrollupGoalMetadata1.equals(optimizationGoalMetadataScrollupGoalMetadata2));
        System.assert(optimizationGoalMetadataScrollupGoalMetadata2.equals(optimizationGoalMetadataScrollupGoalMetadata1));
        System.assert(optimizationGoalMetadataScrollupGoalMetadata1.equals(optimizationGoalMetadataScrollupGoalMetadata1));
        System.assert(optimizationGoalMetadataScrollupGoalMetadata3.equals(optimizationGoalMetadataScrollupGoalMetadata4));
        System.assert(optimizationGoalMetadataScrollupGoalMetadata4.equals(optimizationGoalMetadataScrollupGoalMetadata3));
        System.assert(optimizationGoalMetadataScrollupGoalMetadata3.equals(optimizationGoalMetadataScrollupGoalMetadata3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOptimizationGoalMetadataScrollupG optimizationGoalMetadataScrollupGoalMetadata1 = OASOptimizationGoalMetadataScrollupG.getExample();
        OASOptimizationGoalMetadataScrollupG optimizationGoalMetadataScrollupGoalMetadata2 = OASOptimizationGoalMetadataScrollupG.getExample();
        OASOptimizationGoalMetadataScrollupG optimizationGoalMetadataScrollupGoalMetadata3 = new OASOptimizationGoalMetadataScrollupG();
        OASOptimizationGoalMetadataScrollupG optimizationGoalMetadataScrollupGoalMetadata4 = new OASOptimizationGoalMetadataScrollupG();

        System.assert(optimizationGoalMetadataScrollupGoalMetadata1.equals(optimizationGoalMetadataScrollupGoalMetadata2));
        System.assert(optimizationGoalMetadataScrollupGoalMetadata2.equals(optimizationGoalMetadataScrollupGoalMetadata1));
        System.assert(optimizationGoalMetadataScrollupGoalMetadata3.equals(optimizationGoalMetadataScrollupGoalMetadata4));
        System.assert(optimizationGoalMetadataScrollupGoalMetadata4.equals(optimizationGoalMetadataScrollupGoalMetadata3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOptimizationGoalMetadataScrollupG optimizationGoalMetadataScrollupGoalMetadata1 = OASOptimizationGoalMetadataScrollupG.getExample();
        OASOptimizationGoalMetadataScrollupG optimizationGoalMetadataScrollupGoalMetadata2 = new OASOptimizationGoalMetadataScrollupG();

        System.assertEquals(false, optimizationGoalMetadataScrollupGoalMetadata1.equals('foo'));
        System.assertEquals(false, optimizationGoalMetadataScrollupGoalMetadata2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOptimizationGoalMetadataScrollupG optimizationGoalMetadataScrollupGoalMetadata1 = OASOptimizationGoalMetadataScrollupG.getExample();
        OASOptimizationGoalMetadataScrollupG optimizationGoalMetadataScrollupGoalMetadata2 = new OASOptimizationGoalMetadataScrollupG();
        OASOptimizationGoalMetadataScrollupG optimizationGoalMetadataScrollupGoalMetadata3;

        System.assertEquals(false, optimizationGoalMetadataScrollupGoalMetadata1.equals(optimizationGoalMetadataScrollupGoalMetadata3));
        System.assertEquals(false, optimizationGoalMetadataScrollupGoalMetadata2.equals(optimizationGoalMetadataScrollupGoalMetadata3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOptimizationGoalMetadataScrollupG optimizationGoalMetadataScrollupGoalMetadata1 = OASOptimizationGoalMetadataScrollupG.getExample();
        OASOptimizationGoalMetadataScrollupG optimizationGoalMetadataScrollupGoalMetadata2 = new OASOptimizationGoalMetadataScrollupG();

        System.assertEquals(optimizationGoalMetadataScrollupGoalMetadata1.hashCode(), optimizationGoalMetadataScrollupGoalMetadata1.hashCode());
        System.assertEquals(optimizationGoalMetadataScrollupGoalMetadata2.hashCode(), optimizationGoalMetadataScrollupGoalMetadata2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOptimizationGoalMetadataScrollupG optimizationGoalMetadataScrollupGoalMetadata1 = OASOptimizationGoalMetadataScrollupG.getExample();
        OASOptimizationGoalMetadataScrollupG optimizationGoalMetadataScrollupGoalMetadata2 = OASOptimizationGoalMetadataScrollupG.getExample();
        OASOptimizationGoalMetadataScrollupG optimizationGoalMetadataScrollupGoalMetadata3 = new OASOptimizationGoalMetadataScrollupG();
        OASOptimizationGoalMetadataScrollupG optimizationGoalMetadataScrollupGoalMetadata4 = new OASOptimizationGoalMetadataScrollupG();

        System.assert(optimizationGoalMetadataScrollupGoalMetadata1.equals(optimizationGoalMetadataScrollupGoalMetadata2));
        System.assert(optimizationGoalMetadataScrollupGoalMetadata3.equals(optimizationGoalMetadataScrollupGoalMetadata4));
        System.assertEquals(optimizationGoalMetadataScrollupGoalMetadata1.hashCode(), optimizationGoalMetadataScrollupGoalMetadata2.hashCode());
        System.assertEquals(optimizationGoalMetadataScrollupGoalMetadata3.hashCode(), optimizationGoalMetadataScrollupGoalMetadata4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOptimizationGoalMetadataScrollupG optimizationGoalMetadataScrollupGoalMetadata = new OASOptimizationGoalMetadataScrollupG();
        Map<String, String> x-property-mappings = optimizationGoalMetadataScrollupGoalMetadata.getx-property-mappings();
        System.assertEquals('scrollupGoalValueInMicroCurrency', x-property-mappings.get('scrollup_goal_value_in_micro_currency'));
    }
}
