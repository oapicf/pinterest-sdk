@isTest
private class OASOptimizationGoalMetadataConversioTest {
    @isTest
    private static void equalsSameInstance() {
        OASOptimizationGoalMetadataConversio optimizationGoalMetadataConversionTagV3GoalMetadata1 = OASOptimizationGoalMetadataConversio.getExample();
        OASOptimizationGoalMetadataConversio optimizationGoalMetadataConversionTagV3GoalMetadata2 = optimizationGoalMetadataConversionTagV3GoalMetadata1;
        OASOptimizationGoalMetadataConversio optimizationGoalMetadataConversionTagV3GoalMetadata3 = new OASOptimizationGoalMetadataConversio();
        OASOptimizationGoalMetadataConversio optimizationGoalMetadataConversionTagV3GoalMetadata4 = optimizationGoalMetadataConversionTagV3GoalMetadata3;

        System.assert(optimizationGoalMetadataConversionTagV3GoalMetadata1.equals(optimizationGoalMetadataConversionTagV3GoalMetadata2));
        System.assert(optimizationGoalMetadataConversionTagV3GoalMetadata2.equals(optimizationGoalMetadataConversionTagV3GoalMetadata1));
        System.assert(optimizationGoalMetadataConversionTagV3GoalMetadata1.equals(optimizationGoalMetadataConversionTagV3GoalMetadata1));
        System.assert(optimizationGoalMetadataConversionTagV3GoalMetadata3.equals(optimizationGoalMetadataConversionTagV3GoalMetadata4));
        System.assert(optimizationGoalMetadataConversionTagV3GoalMetadata4.equals(optimizationGoalMetadataConversionTagV3GoalMetadata3));
        System.assert(optimizationGoalMetadataConversionTagV3GoalMetadata3.equals(optimizationGoalMetadataConversionTagV3GoalMetadata3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOptimizationGoalMetadataConversio optimizationGoalMetadataConversionTagV3GoalMetadata1 = OASOptimizationGoalMetadataConversio.getExample();
        OASOptimizationGoalMetadataConversio optimizationGoalMetadataConversionTagV3GoalMetadata2 = OASOptimizationGoalMetadataConversio.getExample();
        OASOptimizationGoalMetadataConversio optimizationGoalMetadataConversionTagV3GoalMetadata3 = new OASOptimizationGoalMetadataConversio();
        OASOptimizationGoalMetadataConversio optimizationGoalMetadataConversionTagV3GoalMetadata4 = new OASOptimizationGoalMetadataConversio();

        System.assert(optimizationGoalMetadataConversionTagV3GoalMetadata1.equals(optimizationGoalMetadataConversionTagV3GoalMetadata2));
        System.assert(optimizationGoalMetadataConversionTagV3GoalMetadata2.equals(optimizationGoalMetadataConversionTagV3GoalMetadata1));
        System.assert(optimizationGoalMetadataConversionTagV3GoalMetadata3.equals(optimizationGoalMetadataConversionTagV3GoalMetadata4));
        System.assert(optimizationGoalMetadataConversionTagV3GoalMetadata4.equals(optimizationGoalMetadataConversionTagV3GoalMetadata3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOptimizationGoalMetadataConversio optimizationGoalMetadataConversionTagV3GoalMetadata1 = OASOptimizationGoalMetadataConversio.getExample();
        OASOptimizationGoalMetadataConversio optimizationGoalMetadataConversionTagV3GoalMetadata2 = new OASOptimizationGoalMetadataConversio();

        System.assertEquals(false, optimizationGoalMetadataConversionTagV3GoalMetadata1.equals('foo'));
        System.assertEquals(false, optimizationGoalMetadataConversionTagV3GoalMetadata2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOptimizationGoalMetadataConversio optimizationGoalMetadataConversionTagV3GoalMetadata1 = OASOptimizationGoalMetadataConversio.getExample();
        OASOptimizationGoalMetadataConversio optimizationGoalMetadataConversionTagV3GoalMetadata2 = new OASOptimizationGoalMetadataConversio();
        OASOptimizationGoalMetadataConversio optimizationGoalMetadataConversionTagV3GoalMetadata3;

        System.assertEquals(false, optimizationGoalMetadataConversionTagV3GoalMetadata1.equals(optimizationGoalMetadataConversionTagV3GoalMetadata3));
        System.assertEquals(false, optimizationGoalMetadataConversionTagV3GoalMetadata2.equals(optimizationGoalMetadataConversionTagV3GoalMetadata3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOptimizationGoalMetadataConversio optimizationGoalMetadataConversionTagV3GoalMetadata1 = OASOptimizationGoalMetadataConversio.getExample();
        OASOptimizationGoalMetadataConversio optimizationGoalMetadataConversionTagV3GoalMetadata2 = new OASOptimizationGoalMetadataConversio();

        System.assertEquals(optimizationGoalMetadataConversionTagV3GoalMetadata1.hashCode(), optimizationGoalMetadataConversionTagV3GoalMetadata1.hashCode());
        System.assertEquals(optimizationGoalMetadataConversionTagV3GoalMetadata2.hashCode(), optimizationGoalMetadataConversionTagV3GoalMetadata2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOptimizationGoalMetadataConversio optimizationGoalMetadataConversionTagV3GoalMetadata1 = OASOptimizationGoalMetadataConversio.getExample();
        OASOptimizationGoalMetadataConversio optimizationGoalMetadataConversionTagV3GoalMetadata2 = OASOptimizationGoalMetadataConversio.getExample();
        OASOptimizationGoalMetadataConversio optimizationGoalMetadataConversionTagV3GoalMetadata3 = new OASOptimizationGoalMetadataConversio();
        OASOptimizationGoalMetadataConversio optimizationGoalMetadataConversionTagV3GoalMetadata4 = new OASOptimizationGoalMetadataConversio();

        System.assert(optimizationGoalMetadataConversionTagV3GoalMetadata1.equals(optimizationGoalMetadataConversionTagV3GoalMetadata2));
        System.assert(optimizationGoalMetadataConversionTagV3GoalMetadata3.equals(optimizationGoalMetadataConversionTagV3GoalMetadata4));
        System.assertEquals(optimizationGoalMetadataConversionTagV3GoalMetadata1.hashCode(), optimizationGoalMetadataConversionTagV3GoalMetadata2.hashCode());
        System.assertEquals(optimizationGoalMetadataConversionTagV3GoalMetadata3.hashCode(), optimizationGoalMetadataConversionTagV3GoalMetadata4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOptimizationGoalMetadataConversio optimizationGoalMetadataConversionTagV3GoalMetadata = new OASOptimizationGoalMetadataConversio();
        Map<String, String> x-property-mappings = optimizationGoalMetadataConversionTagV3GoalMetadata.getx-property-mappings();
        System.assertEquals('attributionWindows', x-property-mappings.get('attribution_windows'));
        System.assertEquals('conversionEvent', x-property-mappings.get('conversion_event'));
        System.assertEquals('conversionTagId', x-property-mappings.get('conversion_tag_id'));
        System.assertEquals('cpaGoalValueInMicroCurrency', x-property-mappings.get('cpa_goal_value_in_micro_currency'));
        System.assertEquals('isRoasOptimized', x-property-mappings.get('is_roas_optimized'));
        System.assertEquals('learningModeType', x-property-mappings.get('learning_mode_type'));
    }
}
