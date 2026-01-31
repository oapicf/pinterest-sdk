@isTest
private class OASTargetingSpecOperationShoppingRetTest {
    @isTest
    private static void equalsSameInstance() {
        OASTargetingSpecOperationShoppingRet targetingSpecOperationShoppingRetargeting1 = OASTargetingSpecOperationShoppingRet.getExample();
        OASTargetingSpecOperationShoppingRet targetingSpecOperationShoppingRetargeting2 = targetingSpecOperationShoppingRetargeting1;
        OASTargetingSpecOperationShoppingRet targetingSpecOperationShoppingRetargeting3 = new OASTargetingSpecOperationShoppingRet();
        OASTargetingSpecOperationShoppingRet targetingSpecOperationShoppingRetargeting4 = targetingSpecOperationShoppingRetargeting3;

        System.assert(targetingSpecOperationShoppingRetargeting1.equals(targetingSpecOperationShoppingRetargeting2));
        System.assert(targetingSpecOperationShoppingRetargeting2.equals(targetingSpecOperationShoppingRetargeting1));
        System.assert(targetingSpecOperationShoppingRetargeting1.equals(targetingSpecOperationShoppingRetargeting1));
        System.assert(targetingSpecOperationShoppingRetargeting3.equals(targetingSpecOperationShoppingRetargeting4));
        System.assert(targetingSpecOperationShoppingRetargeting4.equals(targetingSpecOperationShoppingRetargeting3));
        System.assert(targetingSpecOperationShoppingRetargeting3.equals(targetingSpecOperationShoppingRetargeting3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTargetingSpecOperationShoppingRet targetingSpecOperationShoppingRetargeting1 = OASTargetingSpecOperationShoppingRet.getExample();
        OASTargetingSpecOperationShoppingRet targetingSpecOperationShoppingRetargeting2 = OASTargetingSpecOperationShoppingRet.getExample();
        OASTargetingSpecOperationShoppingRet targetingSpecOperationShoppingRetargeting3 = new OASTargetingSpecOperationShoppingRet();
        OASTargetingSpecOperationShoppingRet targetingSpecOperationShoppingRetargeting4 = new OASTargetingSpecOperationShoppingRet();

        System.assert(targetingSpecOperationShoppingRetargeting1.equals(targetingSpecOperationShoppingRetargeting2));
        System.assert(targetingSpecOperationShoppingRetargeting2.equals(targetingSpecOperationShoppingRetargeting1));
        System.assert(targetingSpecOperationShoppingRetargeting3.equals(targetingSpecOperationShoppingRetargeting4));
        System.assert(targetingSpecOperationShoppingRetargeting4.equals(targetingSpecOperationShoppingRetargeting3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTargetingSpecOperationShoppingRet targetingSpecOperationShoppingRetargeting1 = OASTargetingSpecOperationShoppingRet.getExample();
        OASTargetingSpecOperationShoppingRet targetingSpecOperationShoppingRetargeting2 = new OASTargetingSpecOperationShoppingRet();

        System.assertEquals(false, targetingSpecOperationShoppingRetargeting1.equals('foo'));
        System.assertEquals(false, targetingSpecOperationShoppingRetargeting2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTargetingSpecOperationShoppingRet targetingSpecOperationShoppingRetargeting1 = OASTargetingSpecOperationShoppingRet.getExample();
        OASTargetingSpecOperationShoppingRet targetingSpecOperationShoppingRetargeting2 = new OASTargetingSpecOperationShoppingRet();
        OASTargetingSpecOperationShoppingRet targetingSpecOperationShoppingRetargeting3;

        System.assertEquals(false, targetingSpecOperationShoppingRetargeting1.equals(targetingSpecOperationShoppingRetargeting3));
        System.assertEquals(false, targetingSpecOperationShoppingRetargeting2.equals(targetingSpecOperationShoppingRetargeting3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTargetingSpecOperationShoppingRet targetingSpecOperationShoppingRetargeting1 = OASTargetingSpecOperationShoppingRet.getExample();
        OASTargetingSpecOperationShoppingRet targetingSpecOperationShoppingRetargeting2 = new OASTargetingSpecOperationShoppingRet();

        System.assertEquals(targetingSpecOperationShoppingRetargeting1.hashCode(), targetingSpecOperationShoppingRetargeting1.hashCode());
        System.assertEquals(targetingSpecOperationShoppingRetargeting2.hashCode(), targetingSpecOperationShoppingRetargeting2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTargetingSpecOperationShoppingRet targetingSpecOperationShoppingRetargeting1 = OASTargetingSpecOperationShoppingRet.getExample();
        OASTargetingSpecOperationShoppingRet targetingSpecOperationShoppingRetargeting2 = OASTargetingSpecOperationShoppingRet.getExample();
        OASTargetingSpecOperationShoppingRet targetingSpecOperationShoppingRetargeting3 = new OASTargetingSpecOperationShoppingRet();
        OASTargetingSpecOperationShoppingRet targetingSpecOperationShoppingRetargeting4 = new OASTargetingSpecOperationShoppingRet();

        System.assert(targetingSpecOperationShoppingRetargeting1.equals(targetingSpecOperationShoppingRetargeting2));
        System.assert(targetingSpecOperationShoppingRetargeting3.equals(targetingSpecOperationShoppingRetargeting4));
        System.assertEquals(targetingSpecOperationShoppingRetargeting1.hashCode(), targetingSpecOperationShoppingRetargeting2.hashCode());
        System.assertEquals(targetingSpecOperationShoppingRetargeting3.hashCode(), targetingSpecOperationShoppingRetargeting4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASTargetingSpecOperationShoppingRet targetingSpecOperationShoppingRetargeting = new OASTargetingSpecOperationShoppingRet();
        System.assertEquals(new List<OASTargetingSpecShoppingRetargeting>(), targetingSpecOperationShoppingRetargeting.values);
        System.assertEquals(null, targetingSpecOperationShoppingRetargeting.field);
        System.assertEquals(null, targetingSpecOperationShoppingRetargeting.operation);
    }
}
