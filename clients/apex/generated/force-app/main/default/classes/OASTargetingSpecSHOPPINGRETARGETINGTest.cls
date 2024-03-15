@isTest
private class OASTargetingSpecSHOPPINGRETARGETINGTest {
    @isTest
    private static void equalsSameInstance() {
        OASTargetingSpecSHOPPINGRETARGETING targetingSpecSHOPPINGRETARGETING1 = OASTargetingSpecSHOPPINGRETARGETING.getExample();
        OASTargetingSpecSHOPPINGRETARGETING targetingSpecSHOPPINGRETARGETING2 = targetingSpecSHOPPINGRETARGETING1;
        OASTargetingSpecSHOPPINGRETARGETING targetingSpecSHOPPINGRETARGETING3 = new OASTargetingSpecSHOPPINGRETARGETING();
        OASTargetingSpecSHOPPINGRETARGETING targetingSpecSHOPPINGRETARGETING4 = targetingSpecSHOPPINGRETARGETING3;

        System.assert(targetingSpecSHOPPINGRETARGETING1.equals(targetingSpecSHOPPINGRETARGETING2));
        System.assert(targetingSpecSHOPPINGRETARGETING2.equals(targetingSpecSHOPPINGRETARGETING1));
        System.assert(targetingSpecSHOPPINGRETARGETING1.equals(targetingSpecSHOPPINGRETARGETING1));
        System.assert(targetingSpecSHOPPINGRETARGETING3.equals(targetingSpecSHOPPINGRETARGETING4));
        System.assert(targetingSpecSHOPPINGRETARGETING4.equals(targetingSpecSHOPPINGRETARGETING3));
        System.assert(targetingSpecSHOPPINGRETARGETING3.equals(targetingSpecSHOPPINGRETARGETING3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTargetingSpecSHOPPINGRETARGETING targetingSpecSHOPPINGRETARGETING1 = OASTargetingSpecSHOPPINGRETARGETING.getExample();
        OASTargetingSpecSHOPPINGRETARGETING targetingSpecSHOPPINGRETARGETING2 = OASTargetingSpecSHOPPINGRETARGETING.getExample();
        OASTargetingSpecSHOPPINGRETARGETING targetingSpecSHOPPINGRETARGETING3 = new OASTargetingSpecSHOPPINGRETARGETING();
        OASTargetingSpecSHOPPINGRETARGETING targetingSpecSHOPPINGRETARGETING4 = new OASTargetingSpecSHOPPINGRETARGETING();

        System.assert(targetingSpecSHOPPINGRETARGETING1.equals(targetingSpecSHOPPINGRETARGETING2));
        System.assert(targetingSpecSHOPPINGRETARGETING2.equals(targetingSpecSHOPPINGRETARGETING1));
        System.assert(targetingSpecSHOPPINGRETARGETING3.equals(targetingSpecSHOPPINGRETARGETING4));
        System.assert(targetingSpecSHOPPINGRETARGETING4.equals(targetingSpecSHOPPINGRETARGETING3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTargetingSpecSHOPPINGRETARGETING targetingSpecSHOPPINGRETARGETING1 = OASTargetingSpecSHOPPINGRETARGETING.getExample();
        OASTargetingSpecSHOPPINGRETARGETING targetingSpecSHOPPINGRETARGETING2 = new OASTargetingSpecSHOPPINGRETARGETING();

        System.assertEquals(false, targetingSpecSHOPPINGRETARGETING1.equals('foo'));
        System.assertEquals(false, targetingSpecSHOPPINGRETARGETING2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTargetingSpecSHOPPINGRETARGETING targetingSpecSHOPPINGRETARGETING1 = OASTargetingSpecSHOPPINGRETARGETING.getExample();
        OASTargetingSpecSHOPPINGRETARGETING targetingSpecSHOPPINGRETARGETING2 = new OASTargetingSpecSHOPPINGRETARGETING();
        OASTargetingSpecSHOPPINGRETARGETING targetingSpecSHOPPINGRETARGETING3;

        System.assertEquals(false, targetingSpecSHOPPINGRETARGETING1.equals(targetingSpecSHOPPINGRETARGETING3));
        System.assertEquals(false, targetingSpecSHOPPINGRETARGETING2.equals(targetingSpecSHOPPINGRETARGETING3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTargetingSpecSHOPPINGRETARGETING targetingSpecSHOPPINGRETARGETING1 = OASTargetingSpecSHOPPINGRETARGETING.getExample();
        OASTargetingSpecSHOPPINGRETARGETING targetingSpecSHOPPINGRETARGETING2 = new OASTargetingSpecSHOPPINGRETARGETING();

        System.assertEquals(targetingSpecSHOPPINGRETARGETING1.hashCode(), targetingSpecSHOPPINGRETARGETING1.hashCode());
        System.assertEquals(targetingSpecSHOPPINGRETARGETING2.hashCode(), targetingSpecSHOPPINGRETARGETING2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTargetingSpecSHOPPINGRETARGETING targetingSpecSHOPPINGRETARGETING1 = OASTargetingSpecSHOPPINGRETARGETING.getExample();
        OASTargetingSpecSHOPPINGRETARGETING targetingSpecSHOPPINGRETARGETING2 = OASTargetingSpecSHOPPINGRETARGETING.getExample();
        OASTargetingSpecSHOPPINGRETARGETING targetingSpecSHOPPINGRETARGETING3 = new OASTargetingSpecSHOPPINGRETARGETING();
        OASTargetingSpecSHOPPINGRETARGETING targetingSpecSHOPPINGRETARGETING4 = new OASTargetingSpecSHOPPINGRETARGETING();

        System.assert(targetingSpecSHOPPINGRETARGETING1.equals(targetingSpecSHOPPINGRETARGETING2));
        System.assert(targetingSpecSHOPPINGRETARGETING3.equals(targetingSpecSHOPPINGRETARGETING4));
        System.assertEquals(targetingSpecSHOPPINGRETARGETING1.hashCode(), targetingSpecSHOPPINGRETARGETING2.hashCode());
        System.assertEquals(targetingSpecSHOPPINGRETARGETING3.hashCode(), targetingSpecSHOPPINGRETARGETING4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASTargetingSpecSHOPPINGRETARGETING targetingSpecSHOPPINGRETARGETING = new OASTargetingSpecSHOPPINGRETARGETING();
        Map<String, String> x-property-mappings = targetingSpecSHOPPINGRETARGETING.getx-property-mappings();
        System.assertEquals('lookbackWindow', x-property-mappings.get('lookback_window'));
        System.assertEquals('tagTypes', x-property-mappings.get('tag_types'));
        System.assertEquals('exclusionWindow', x-property-mappings.get('exclusion_window'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASTargetingSpecSHOPPINGRETARGETING targetingSpecSHOPPINGRETARGETING = new OASTargetingSpecSHOPPINGRETARGETING();
        System.assertEquals(new List<Integer>(), targetingSpecSHOPPINGRETARGETING.tagTypes);
        System.assertEquals(null, targetingSpecSHOPPINGRETARGETING.lookbackWindow);
        System.assertEquals(null, targetingSpecSHOPPINGRETARGETING.exclusionWindow);
    }
}
