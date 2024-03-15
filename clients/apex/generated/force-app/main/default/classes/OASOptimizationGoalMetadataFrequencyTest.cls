@isTest
private class OASOptimizationGoalMetadataFrequencyTest {
    @isTest
    private static void equalsSameInstance() {
        OASOptimizationGoalMetadataFrequency optimizationGoalMetadataFrequencyGoalMetadata1 = OASOptimizationGoalMetadataFrequency.getExample();
        OASOptimizationGoalMetadataFrequency optimizationGoalMetadataFrequencyGoalMetadata2 = optimizationGoalMetadataFrequencyGoalMetadata1;
        OASOptimizationGoalMetadataFrequency optimizationGoalMetadataFrequencyGoalMetadata3 = new OASOptimizationGoalMetadataFrequency();
        OASOptimizationGoalMetadataFrequency optimizationGoalMetadataFrequencyGoalMetadata4 = optimizationGoalMetadataFrequencyGoalMetadata3;

        System.assert(optimizationGoalMetadataFrequencyGoalMetadata1.equals(optimizationGoalMetadataFrequencyGoalMetadata2));
        System.assert(optimizationGoalMetadataFrequencyGoalMetadata2.equals(optimizationGoalMetadataFrequencyGoalMetadata1));
        System.assert(optimizationGoalMetadataFrequencyGoalMetadata1.equals(optimizationGoalMetadataFrequencyGoalMetadata1));
        System.assert(optimizationGoalMetadataFrequencyGoalMetadata3.equals(optimizationGoalMetadataFrequencyGoalMetadata4));
        System.assert(optimizationGoalMetadataFrequencyGoalMetadata4.equals(optimizationGoalMetadataFrequencyGoalMetadata3));
        System.assert(optimizationGoalMetadataFrequencyGoalMetadata3.equals(optimizationGoalMetadataFrequencyGoalMetadata3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOptimizationGoalMetadataFrequency optimizationGoalMetadataFrequencyGoalMetadata1 = OASOptimizationGoalMetadataFrequency.getExample();
        OASOptimizationGoalMetadataFrequency optimizationGoalMetadataFrequencyGoalMetadata2 = OASOptimizationGoalMetadataFrequency.getExample();
        OASOptimizationGoalMetadataFrequency optimizationGoalMetadataFrequencyGoalMetadata3 = new OASOptimizationGoalMetadataFrequency();
        OASOptimizationGoalMetadataFrequency optimizationGoalMetadataFrequencyGoalMetadata4 = new OASOptimizationGoalMetadataFrequency();

        System.assert(optimizationGoalMetadataFrequencyGoalMetadata1.equals(optimizationGoalMetadataFrequencyGoalMetadata2));
        System.assert(optimizationGoalMetadataFrequencyGoalMetadata2.equals(optimizationGoalMetadataFrequencyGoalMetadata1));
        System.assert(optimizationGoalMetadataFrequencyGoalMetadata3.equals(optimizationGoalMetadataFrequencyGoalMetadata4));
        System.assert(optimizationGoalMetadataFrequencyGoalMetadata4.equals(optimizationGoalMetadataFrequencyGoalMetadata3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOptimizationGoalMetadataFrequency optimizationGoalMetadataFrequencyGoalMetadata1 = OASOptimizationGoalMetadataFrequency.getExample();
        OASOptimizationGoalMetadataFrequency optimizationGoalMetadataFrequencyGoalMetadata2 = new OASOptimizationGoalMetadataFrequency();

        System.assertEquals(false, optimizationGoalMetadataFrequencyGoalMetadata1.equals('foo'));
        System.assertEquals(false, optimizationGoalMetadataFrequencyGoalMetadata2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOptimizationGoalMetadataFrequency optimizationGoalMetadataFrequencyGoalMetadata1 = OASOptimizationGoalMetadataFrequency.getExample();
        OASOptimizationGoalMetadataFrequency optimizationGoalMetadataFrequencyGoalMetadata2 = new OASOptimizationGoalMetadataFrequency();
        OASOptimizationGoalMetadataFrequency optimizationGoalMetadataFrequencyGoalMetadata3;

        System.assertEquals(false, optimizationGoalMetadataFrequencyGoalMetadata1.equals(optimizationGoalMetadataFrequencyGoalMetadata3));
        System.assertEquals(false, optimizationGoalMetadataFrequencyGoalMetadata2.equals(optimizationGoalMetadataFrequencyGoalMetadata3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOptimizationGoalMetadataFrequency optimizationGoalMetadataFrequencyGoalMetadata1 = OASOptimizationGoalMetadataFrequency.getExample();
        OASOptimizationGoalMetadataFrequency optimizationGoalMetadataFrequencyGoalMetadata2 = new OASOptimizationGoalMetadataFrequency();

        System.assertEquals(optimizationGoalMetadataFrequencyGoalMetadata1.hashCode(), optimizationGoalMetadataFrequencyGoalMetadata1.hashCode());
        System.assertEquals(optimizationGoalMetadataFrequencyGoalMetadata2.hashCode(), optimizationGoalMetadataFrequencyGoalMetadata2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOptimizationGoalMetadataFrequency optimizationGoalMetadataFrequencyGoalMetadata1 = OASOptimizationGoalMetadataFrequency.getExample();
        OASOptimizationGoalMetadataFrequency optimizationGoalMetadataFrequencyGoalMetadata2 = OASOptimizationGoalMetadataFrequency.getExample();
        OASOptimizationGoalMetadataFrequency optimizationGoalMetadataFrequencyGoalMetadata3 = new OASOptimizationGoalMetadataFrequency();
        OASOptimizationGoalMetadataFrequency optimizationGoalMetadataFrequencyGoalMetadata4 = new OASOptimizationGoalMetadataFrequency();

        System.assert(optimizationGoalMetadataFrequencyGoalMetadata1.equals(optimizationGoalMetadataFrequencyGoalMetadata2));
        System.assert(optimizationGoalMetadataFrequencyGoalMetadata3.equals(optimizationGoalMetadataFrequencyGoalMetadata4));
        System.assertEquals(optimizationGoalMetadataFrequencyGoalMetadata1.hashCode(), optimizationGoalMetadataFrequencyGoalMetadata2.hashCode());
        System.assertEquals(optimizationGoalMetadataFrequencyGoalMetadata3.hashCode(), optimizationGoalMetadataFrequencyGoalMetadata4.hashCode());
    }
}
