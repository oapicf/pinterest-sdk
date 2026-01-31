@isTest
private class OASTargetingSpecOperationStringTest {
    @isTest
    private static void equalsSameInstance() {
        OASTargetingSpecOperationString targetingSpecOperationString1 = OASTargetingSpecOperationString.getExample();
        OASTargetingSpecOperationString targetingSpecOperationString2 = targetingSpecOperationString1;
        OASTargetingSpecOperationString targetingSpecOperationString3 = new OASTargetingSpecOperationString();
        OASTargetingSpecOperationString targetingSpecOperationString4 = targetingSpecOperationString3;

        System.assert(targetingSpecOperationString1.equals(targetingSpecOperationString2));
        System.assert(targetingSpecOperationString2.equals(targetingSpecOperationString1));
        System.assert(targetingSpecOperationString1.equals(targetingSpecOperationString1));
        System.assert(targetingSpecOperationString3.equals(targetingSpecOperationString4));
        System.assert(targetingSpecOperationString4.equals(targetingSpecOperationString3));
        System.assert(targetingSpecOperationString3.equals(targetingSpecOperationString3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTargetingSpecOperationString targetingSpecOperationString1 = OASTargetingSpecOperationString.getExample();
        OASTargetingSpecOperationString targetingSpecOperationString2 = OASTargetingSpecOperationString.getExample();
        OASTargetingSpecOperationString targetingSpecOperationString3 = new OASTargetingSpecOperationString();
        OASTargetingSpecOperationString targetingSpecOperationString4 = new OASTargetingSpecOperationString();

        System.assert(targetingSpecOperationString1.equals(targetingSpecOperationString2));
        System.assert(targetingSpecOperationString2.equals(targetingSpecOperationString1));
        System.assert(targetingSpecOperationString3.equals(targetingSpecOperationString4));
        System.assert(targetingSpecOperationString4.equals(targetingSpecOperationString3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTargetingSpecOperationString targetingSpecOperationString1 = OASTargetingSpecOperationString.getExample();
        OASTargetingSpecOperationString targetingSpecOperationString2 = new OASTargetingSpecOperationString();

        System.assertEquals(false, targetingSpecOperationString1.equals('foo'));
        System.assertEquals(false, targetingSpecOperationString2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTargetingSpecOperationString targetingSpecOperationString1 = OASTargetingSpecOperationString.getExample();
        OASTargetingSpecOperationString targetingSpecOperationString2 = new OASTargetingSpecOperationString();
        OASTargetingSpecOperationString targetingSpecOperationString3;

        System.assertEquals(false, targetingSpecOperationString1.equals(targetingSpecOperationString3));
        System.assertEquals(false, targetingSpecOperationString2.equals(targetingSpecOperationString3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTargetingSpecOperationString targetingSpecOperationString1 = OASTargetingSpecOperationString.getExample();
        OASTargetingSpecOperationString targetingSpecOperationString2 = new OASTargetingSpecOperationString();

        System.assertEquals(targetingSpecOperationString1.hashCode(), targetingSpecOperationString1.hashCode());
        System.assertEquals(targetingSpecOperationString2.hashCode(), targetingSpecOperationString2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTargetingSpecOperationString targetingSpecOperationString1 = OASTargetingSpecOperationString.getExample();
        OASTargetingSpecOperationString targetingSpecOperationString2 = OASTargetingSpecOperationString.getExample();
        OASTargetingSpecOperationString targetingSpecOperationString3 = new OASTargetingSpecOperationString();
        OASTargetingSpecOperationString targetingSpecOperationString4 = new OASTargetingSpecOperationString();

        System.assert(targetingSpecOperationString1.equals(targetingSpecOperationString2));
        System.assert(targetingSpecOperationString3.equals(targetingSpecOperationString4));
        System.assertEquals(targetingSpecOperationString1.hashCode(), targetingSpecOperationString2.hashCode());
        System.assertEquals(targetingSpecOperationString3.hashCode(), targetingSpecOperationString4.hashCode());
    }
}
