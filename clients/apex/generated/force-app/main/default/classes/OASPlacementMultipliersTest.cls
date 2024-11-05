@isTest
private class OASPlacementMultipliersTest {
    @isTest
    private static void equalsSameInstance() {
        OASPlacementMultipliers placementMultipliers1 = OASPlacementMultipliers.getExample();
        OASPlacementMultipliers placementMultipliers2 = placementMultipliers1;
        OASPlacementMultipliers placementMultipliers3 = new OASPlacementMultipliers();
        OASPlacementMultipliers placementMultipliers4 = placementMultipliers3;

        System.assert(placementMultipliers1.equals(placementMultipliers2));
        System.assert(placementMultipliers2.equals(placementMultipliers1));
        System.assert(placementMultipliers1.equals(placementMultipliers1));
        System.assert(placementMultipliers3.equals(placementMultipliers4));
        System.assert(placementMultipliers4.equals(placementMultipliers3));
        System.assert(placementMultipliers3.equals(placementMultipliers3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPlacementMultipliers placementMultipliers1 = OASPlacementMultipliers.getExample();
        OASPlacementMultipliers placementMultipliers2 = OASPlacementMultipliers.getExample();
        OASPlacementMultipliers placementMultipliers3 = new OASPlacementMultipliers();
        OASPlacementMultipliers placementMultipliers4 = new OASPlacementMultipliers();

        System.assert(placementMultipliers1.equals(placementMultipliers2));
        System.assert(placementMultipliers2.equals(placementMultipliers1));
        System.assert(placementMultipliers3.equals(placementMultipliers4));
        System.assert(placementMultipliers4.equals(placementMultipliers3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPlacementMultipliers placementMultipliers1 = OASPlacementMultipliers.getExample();
        OASPlacementMultipliers placementMultipliers2 = new OASPlacementMultipliers();

        System.assertEquals(false, placementMultipliers1.equals('foo'));
        System.assertEquals(false, placementMultipliers2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPlacementMultipliers placementMultipliers1 = OASPlacementMultipliers.getExample();
        OASPlacementMultipliers placementMultipliers2 = new OASPlacementMultipliers();
        OASPlacementMultipliers placementMultipliers3;

        System.assertEquals(false, placementMultipliers1.equals(placementMultipliers3));
        System.assertEquals(false, placementMultipliers2.equals(placementMultipliers3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPlacementMultipliers placementMultipliers1 = OASPlacementMultipliers.getExample();
        OASPlacementMultipliers placementMultipliers2 = new OASPlacementMultipliers();

        System.assertEquals(placementMultipliers1.hashCode(), placementMultipliers1.hashCode());
        System.assertEquals(placementMultipliers2.hashCode(), placementMultipliers2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPlacementMultipliers placementMultipliers1 = OASPlacementMultipliers.getExample();
        OASPlacementMultipliers placementMultipliers2 = OASPlacementMultipliers.getExample();
        OASPlacementMultipliers placementMultipliers3 = new OASPlacementMultipliers();
        OASPlacementMultipliers placementMultipliers4 = new OASPlacementMultipliers();

        System.assert(placementMultipliers1.equals(placementMultipliers2));
        System.assert(placementMultipliers3.equals(placementMultipliers4));
        System.assertEquals(placementMultipliers1.hashCode(), placementMultipliers2.hashCode());
        System.assertEquals(placementMultipliers3.hashCode(), placementMultipliers4.hashCode());
    }
}
