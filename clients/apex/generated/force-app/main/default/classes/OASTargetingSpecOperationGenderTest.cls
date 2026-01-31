@isTest
private class OASTargetingSpecOperationGenderTest {
    @isTest
    private static void equalsSameInstance() {
        OASTargetingSpecOperationGender targetingSpecOperationGender1 = OASTargetingSpecOperationGender.getExample();
        OASTargetingSpecOperationGender targetingSpecOperationGender2 = targetingSpecOperationGender1;
        OASTargetingSpecOperationGender targetingSpecOperationGender3 = new OASTargetingSpecOperationGender();
        OASTargetingSpecOperationGender targetingSpecOperationGender4 = targetingSpecOperationGender3;

        System.assert(targetingSpecOperationGender1.equals(targetingSpecOperationGender2));
        System.assert(targetingSpecOperationGender2.equals(targetingSpecOperationGender1));
        System.assert(targetingSpecOperationGender1.equals(targetingSpecOperationGender1));
        System.assert(targetingSpecOperationGender3.equals(targetingSpecOperationGender4));
        System.assert(targetingSpecOperationGender4.equals(targetingSpecOperationGender3));
        System.assert(targetingSpecOperationGender3.equals(targetingSpecOperationGender3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTargetingSpecOperationGender targetingSpecOperationGender1 = OASTargetingSpecOperationGender.getExample();
        OASTargetingSpecOperationGender targetingSpecOperationGender2 = OASTargetingSpecOperationGender.getExample();
        OASTargetingSpecOperationGender targetingSpecOperationGender3 = new OASTargetingSpecOperationGender();
        OASTargetingSpecOperationGender targetingSpecOperationGender4 = new OASTargetingSpecOperationGender();

        System.assert(targetingSpecOperationGender1.equals(targetingSpecOperationGender2));
        System.assert(targetingSpecOperationGender2.equals(targetingSpecOperationGender1));
        System.assert(targetingSpecOperationGender3.equals(targetingSpecOperationGender4));
        System.assert(targetingSpecOperationGender4.equals(targetingSpecOperationGender3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTargetingSpecOperationGender targetingSpecOperationGender1 = OASTargetingSpecOperationGender.getExample();
        OASTargetingSpecOperationGender targetingSpecOperationGender2 = new OASTargetingSpecOperationGender();

        System.assertEquals(false, targetingSpecOperationGender1.equals('foo'));
        System.assertEquals(false, targetingSpecOperationGender2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTargetingSpecOperationGender targetingSpecOperationGender1 = OASTargetingSpecOperationGender.getExample();
        OASTargetingSpecOperationGender targetingSpecOperationGender2 = new OASTargetingSpecOperationGender();
        OASTargetingSpecOperationGender targetingSpecOperationGender3;

        System.assertEquals(false, targetingSpecOperationGender1.equals(targetingSpecOperationGender3));
        System.assertEquals(false, targetingSpecOperationGender2.equals(targetingSpecOperationGender3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTargetingSpecOperationGender targetingSpecOperationGender1 = OASTargetingSpecOperationGender.getExample();
        OASTargetingSpecOperationGender targetingSpecOperationGender2 = new OASTargetingSpecOperationGender();

        System.assertEquals(targetingSpecOperationGender1.hashCode(), targetingSpecOperationGender1.hashCode());
        System.assertEquals(targetingSpecOperationGender2.hashCode(), targetingSpecOperationGender2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTargetingSpecOperationGender targetingSpecOperationGender1 = OASTargetingSpecOperationGender.getExample();
        OASTargetingSpecOperationGender targetingSpecOperationGender2 = OASTargetingSpecOperationGender.getExample();
        OASTargetingSpecOperationGender targetingSpecOperationGender3 = new OASTargetingSpecOperationGender();
        OASTargetingSpecOperationGender targetingSpecOperationGender4 = new OASTargetingSpecOperationGender();

        System.assert(targetingSpecOperationGender1.equals(targetingSpecOperationGender2));
        System.assert(targetingSpecOperationGender3.equals(targetingSpecOperationGender4));
        System.assertEquals(targetingSpecOperationGender1.hashCode(), targetingSpecOperationGender2.hashCode());
        System.assertEquals(targetingSpecOperationGender3.hashCode(), targetingSpecOperationGender4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASTargetingSpecOperationGender targetingSpecOperationGender = new OASTargetingSpecOperationGender();
        System.assertEquals(new List<OASTargetingSpecGender>(), targetingSpecOperationGender.values);
        System.assertEquals(null, targetingSpecOperationGender.field);
        System.assertEquals(null, targetingSpecOperationGender.operation);
    }
}
