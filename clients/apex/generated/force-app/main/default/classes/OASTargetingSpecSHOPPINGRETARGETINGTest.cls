@isTest
private class OASTargetingSpecShoppingRetargetingTest {
    @isTest
    private static void equalsSameInstance() {
        OASTargetingSpecShoppingRetargeting targetingSpecShoppingRetargeting1 = OASTargetingSpecShoppingRetargeting.getExample();
        OASTargetingSpecShoppingRetargeting targetingSpecShoppingRetargeting2 = targetingSpecShoppingRetargeting1;
        OASTargetingSpecShoppingRetargeting targetingSpecShoppingRetargeting3 = new OASTargetingSpecShoppingRetargeting();
        OASTargetingSpecShoppingRetargeting targetingSpecShoppingRetargeting4 = targetingSpecShoppingRetargeting3;

        System.assert(targetingSpecShoppingRetargeting1.equals(targetingSpecShoppingRetargeting2));
        System.assert(targetingSpecShoppingRetargeting2.equals(targetingSpecShoppingRetargeting1));
        System.assert(targetingSpecShoppingRetargeting1.equals(targetingSpecShoppingRetargeting1));
        System.assert(targetingSpecShoppingRetargeting3.equals(targetingSpecShoppingRetargeting4));
        System.assert(targetingSpecShoppingRetargeting4.equals(targetingSpecShoppingRetargeting3));
        System.assert(targetingSpecShoppingRetargeting3.equals(targetingSpecShoppingRetargeting3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTargetingSpecShoppingRetargeting targetingSpecShoppingRetargeting1 = OASTargetingSpecShoppingRetargeting.getExample();
        OASTargetingSpecShoppingRetargeting targetingSpecShoppingRetargeting2 = OASTargetingSpecShoppingRetargeting.getExample();
        OASTargetingSpecShoppingRetargeting targetingSpecShoppingRetargeting3 = new OASTargetingSpecShoppingRetargeting();
        OASTargetingSpecShoppingRetargeting targetingSpecShoppingRetargeting4 = new OASTargetingSpecShoppingRetargeting();

        System.assert(targetingSpecShoppingRetargeting1.equals(targetingSpecShoppingRetargeting2));
        System.assert(targetingSpecShoppingRetargeting2.equals(targetingSpecShoppingRetargeting1));
        System.assert(targetingSpecShoppingRetargeting3.equals(targetingSpecShoppingRetargeting4));
        System.assert(targetingSpecShoppingRetargeting4.equals(targetingSpecShoppingRetargeting3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTargetingSpecShoppingRetargeting targetingSpecShoppingRetargeting1 = OASTargetingSpecShoppingRetargeting.getExample();
        OASTargetingSpecShoppingRetargeting targetingSpecShoppingRetargeting2 = new OASTargetingSpecShoppingRetargeting();

        System.assertEquals(false, targetingSpecShoppingRetargeting1.equals('foo'));
        System.assertEquals(false, targetingSpecShoppingRetargeting2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTargetingSpecShoppingRetargeting targetingSpecShoppingRetargeting1 = OASTargetingSpecShoppingRetargeting.getExample();
        OASTargetingSpecShoppingRetargeting targetingSpecShoppingRetargeting2 = new OASTargetingSpecShoppingRetargeting();
        OASTargetingSpecShoppingRetargeting targetingSpecShoppingRetargeting3;

        System.assertEquals(false, targetingSpecShoppingRetargeting1.equals(targetingSpecShoppingRetargeting3));
        System.assertEquals(false, targetingSpecShoppingRetargeting2.equals(targetingSpecShoppingRetargeting3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTargetingSpecShoppingRetargeting targetingSpecShoppingRetargeting1 = OASTargetingSpecShoppingRetargeting.getExample();
        OASTargetingSpecShoppingRetargeting targetingSpecShoppingRetargeting2 = new OASTargetingSpecShoppingRetargeting();

        System.assertEquals(targetingSpecShoppingRetargeting1.hashCode(), targetingSpecShoppingRetargeting1.hashCode());
        System.assertEquals(targetingSpecShoppingRetargeting2.hashCode(), targetingSpecShoppingRetargeting2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTargetingSpecShoppingRetargeting targetingSpecShoppingRetargeting1 = OASTargetingSpecShoppingRetargeting.getExample();
        OASTargetingSpecShoppingRetargeting targetingSpecShoppingRetargeting2 = OASTargetingSpecShoppingRetargeting.getExample();
        OASTargetingSpecShoppingRetargeting targetingSpecShoppingRetargeting3 = new OASTargetingSpecShoppingRetargeting();
        OASTargetingSpecShoppingRetargeting targetingSpecShoppingRetargeting4 = new OASTargetingSpecShoppingRetargeting();

        System.assert(targetingSpecShoppingRetargeting1.equals(targetingSpecShoppingRetargeting2));
        System.assert(targetingSpecShoppingRetargeting3.equals(targetingSpecShoppingRetargeting4));
        System.assertEquals(targetingSpecShoppingRetargeting1.hashCode(), targetingSpecShoppingRetargeting2.hashCode());
        System.assertEquals(targetingSpecShoppingRetargeting3.hashCode(), targetingSpecShoppingRetargeting4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASTargetingSpecShoppingRetargeting targetingSpecShoppingRetargeting = new OASTargetingSpecShoppingRetargeting();
        Map<String, String> x-property-mappings = targetingSpecShoppingRetargeting.getx-property-mappings();
        System.assertEquals('exclusionWindow', x-property-mappings.get('exclusion_window'));
        System.assertEquals('lookbackWindow', x-property-mappings.get('lookback_window'));
        System.assertEquals('tagTypes', x-property-mappings.get('tag_types'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASTargetingSpecShoppingRetargeting targetingSpecShoppingRetargeting = new OASTargetingSpecShoppingRetargeting();
        System.assertEquals(new List<Integer>(), targetingSpecShoppingRetargeting.tagTypes);
        System.assertEquals(null, targetingSpecShoppingRetargeting.exclusionWindow);
        System.assertEquals(null, targetingSpecShoppingRetargeting.lookbackWindow);
    }
}
