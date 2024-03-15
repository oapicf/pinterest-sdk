@isTest
private class OASBidFloorSpecTest {
    @isTest
    private static void equalsSameInstance() {
        OASBidFloorSpec bidFloorSpec1 = OASBidFloorSpec.getExample();
        OASBidFloorSpec bidFloorSpec2 = bidFloorSpec1;
        OASBidFloorSpec bidFloorSpec3 = new OASBidFloorSpec();
        OASBidFloorSpec bidFloorSpec4 = bidFloorSpec3;

        System.assert(bidFloorSpec1.equals(bidFloorSpec2));
        System.assert(bidFloorSpec2.equals(bidFloorSpec1));
        System.assert(bidFloorSpec1.equals(bidFloorSpec1));
        System.assert(bidFloorSpec3.equals(bidFloorSpec4));
        System.assert(bidFloorSpec4.equals(bidFloorSpec3));
        System.assert(bidFloorSpec3.equals(bidFloorSpec3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBidFloorSpec bidFloorSpec1 = OASBidFloorSpec.getExample();
        OASBidFloorSpec bidFloorSpec2 = OASBidFloorSpec.getExample();
        OASBidFloorSpec bidFloorSpec3 = new OASBidFloorSpec();
        OASBidFloorSpec bidFloorSpec4 = new OASBidFloorSpec();

        System.assert(bidFloorSpec1.equals(bidFloorSpec2));
        System.assert(bidFloorSpec2.equals(bidFloorSpec1));
        System.assert(bidFloorSpec3.equals(bidFloorSpec4));
        System.assert(bidFloorSpec4.equals(bidFloorSpec3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBidFloorSpec bidFloorSpec1 = OASBidFloorSpec.getExample();
        OASBidFloorSpec bidFloorSpec2 = new OASBidFloorSpec();

        System.assertEquals(false, bidFloorSpec1.equals('foo'));
        System.assertEquals(false, bidFloorSpec2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBidFloorSpec bidFloorSpec1 = OASBidFloorSpec.getExample();
        OASBidFloorSpec bidFloorSpec2 = new OASBidFloorSpec();
        OASBidFloorSpec bidFloorSpec3;

        System.assertEquals(false, bidFloorSpec1.equals(bidFloorSpec3));
        System.assertEquals(false, bidFloorSpec2.equals(bidFloorSpec3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBidFloorSpec bidFloorSpec1 = OASBidFloorSpec.getExample();
        OASBidFloorSpec bidFloorSpec2 = new OASBidFloorSpec();

        System.assertEquals(bidFloorSpec1.hashCode(), bidFloorSpec1.hashCode());
        System.assertEquals(bidFloorSpec2.hashCode(), bidFloorSpec2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBidFloorSpec bidFloorSpec1 = OASBidFloorSpec.getExample();
        OASBidFloorSpec bidFloorSpec2 = OASBidFloorSpec.getExample();
        OASBidFloorSpec bidFloorSpec3 = new OASBidFloorSpec();
        OASBidFloorSpec bidFloorSpec4 = new OASBidFloorSpec();

        System.assert(bidFloorSpec1.equals(bidFloorSpec2));
        System.assert(bidFloorSpec3.equals(bidFloorSpec4));
        System.assertEquals(bidFloorSpec1.hashCode(), bidFloorSpec2.hashCode());
        System.assertEquals(bidFloorSpec3.hashCode(), bidFloorSpec4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASBidFloorSpec bidFloorSpec = new OASBidFloorSpec();
        Map<String, String> x-property-mappings = bidFloorSpec.getx-property-mappings();
        System.assertEquals('r_currency', x-property-mappings.get('currency'));
        System.assertEquals('objectiveType', x-property-mappings.get('objective_type'));
        System.assertEquals('billableEvent', x-property-mappings.get('billable_event'));
        System.assertEquals('optimizationGoalMetadata', x-property-mappings.get('optimization_goal_metadata'));
        System.assertEquals('creativeType', x-property-mappings.get('creative_type'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASBidFloorSpec bidFloorSpec = new OASBidFloorSpec();
        System.assertEquals(new List<OASCountry>(), bidFloorSpec.countries);
        System.assertEquals(null, bidFloorSpec.r_currency);
        System.assertEquals(null, bidFloorSpec.objectiveType);
        System.assertEquals(null, bidFloorSpec.billableEvent);
        System.assertEquals(null, bidFloorSpec.optimizationGoalMetadata);
        System.assertEquals(null, bidFloorSpec.creativeType);
    }
}
