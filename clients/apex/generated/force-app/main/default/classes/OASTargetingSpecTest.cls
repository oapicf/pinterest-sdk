@isTest
private class OASTargetingSpecTest {
    @isTest
    private static void equalsSameInstance() {
        OASTargetingSpec targetingSpec1 = OASTargetingSpec.getExample();
        OASTargetingSpec targetingSpec2 = targetingSpec1;
        OASTargetingSpec targetingSpec3 = new OASTargetingSpec();
        OASTargetingSpec targetingSpec4 = targetingSpec3;

        System.assert(targetingSpec1.equals(targetingSpec2));
        System.assert(targetingSpec2.equals(targetingSpec1));
        System.assert(targetingSpec1.equals(targetingSpec1));
        System.assert(targetingSpec3.equals(targetingSpec4));
        System.assert(targetingSpec4.equals(targetingSpec3));
        System.assert(targetingSpec3.equals(targetingSpec3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTargetingSpec targetingSpec1 = OASTargetingSpec.getExample();
        OASTargetingSpec targetingSpec2 = OASTargetingSpec.getExample();
        OASTargetingSpec targetingSpec3 = new OASTargetingSpec();
        OASTargetingSpec targetingSpec4 = new OASTargetingSpec();

        System.assert(targetingSpec1.equals(targetingSpec2));
        System.assert(targetingSpec2.equals(targetingSpec1));
        System.assert(targetingSpec3.equals(targetingSpec4));
        System.assert(targetingSpec4.equals(targetingSpec3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTargetingSpec targetingSpec1 = OASTargetingSpec.getExample();
        OASTargetingSpec targetingSpec2 = new OASTargetingSpec();

        System.assertEquals(false, targetingSpec1.equals('foo'));
        System.assertEquals(false, targetingSpec2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTargetingSpec targetingSpec1 = OASTargetingSpec.getExample();
        OASTargetingSpec targetingSpec2 = new OASTargetingSpec();
        OASTargetingSpec targetingSpec3;

        System.assertEquals(false, targetingSpec1.equals(targetingSpec3));
        System.assertEquals(false, targetingSpec2.equals(targetingSpec3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTargetingSpec targetingSpec1 = OASTargetingSpec.getExample();
        OASTargetingSpec targetingSpec2 = new OASTargetingSpec();

        System.assertEquals(targetingSpec1.hashCode(), targetingSpec1.hashCode());
        System.assertEquals(targetingSpec2.hashCode(), targetingSpec2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTargetingSpec targetingSpec1 = OASTargetingSpec.getExample();
        OASTargetingSpec targetingSpec2 = OASTargetingSpec.getExample();
        OASTargetingSpec targetingSpec3 = new OASTargetingSpec();
        OASTargetingSpec targetingSpec4 = new OASTargetingSpec();

        System.assert(targetingSpec1.equals(targetingSpec2));
        System.assert(targetingSpec3.equals(targetingSpec4));
        System.assertEquals(targetingSpec1.hashCode(), targetingSpec2.hashCode());
        System.assertEquals(targetingSpec3.hashCode(), targetingSpec4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASTargetingSpec targetingSpec = new OASTargetingSpec();
        System.assertEquals(new List<String>(), targetingSpec.AGE_BUCKET);
        System.assertEquals(new List<String>(), targetingSpec.APPTYPE);
        System.assertEquals(new List<String>(), targetingSpec.AUDIENCE_EXCLUDE);
        System.assertEquals(new List<String>(), targetingSpec.AUDIENCE_INCLUDE);
        System.assertEquals(new List<String>(), targetingSpec.GENDER);
        System.assertEquals(new List<String>(), targetingSpec.GEO);
        System.assertEquals(new List<String>(), targetingSpec.INTEREST);
        System.assertEquals(new List<String>(), targetingSpec.LOCALE);
        System.assertEquals(new List<String>(), targetingSpec.LOCATION);
        System.assertEquals(new List<OASTargetingSpecSHOPPINGRETARGETING>(), targetingSpec.SHOPPING_RETARGETING);
        System.assertEquals(new List<String>(), targetingSpec.TARGETING_STRATEGY);
    }
}
