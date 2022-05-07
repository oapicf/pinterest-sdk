@isTest
private class OASPinMediaWithImageAllOfTest {
    @isTest
    private static void equalsSameInstance() {
        OASPinMediaWithImageAllOf pinMediaWithImageAllOf1 = OASPinMediaWithImageAllOf.getExample();
        OASPinMediaWithImageAllOf pinMediaWithImageAllOf2 = pinMediaWithImageAllOf1;
        OASPinMediaWithImageAllOf pinMediaWithImageAllOf3 = new OASPinMediaWithImageAllOf();
        OASPinMediaWithImageAllOf pinMediaWithImageAllOf4 = pinMediaWithImageAllOf3;

        System.assert(pinMediaWithImageAllOf1.equals(pinMediaWithImageAllOf2));
        System.assert(pinMediaWithImageAllOf2.equals(pinMediaWithImageAllOf1));
        System.assert(pinMediaWithImageAllOf1.equals(pinMediaWithImageAllOf1));
        System.assert(pinMediaWithImageAllOf3.equals(pinMediaWithImageAllOf4));
        System.assert(pinMediaWithImageAllOf4.equals(pinMediaWithImageAllOf3));
        System.assert(pinMediaWithImageAllOf3.equals(pinMediaWithImageAllOf3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPinMediaWithImageAllOf pinMediaWithImageAllOf1 = OASPinMediaWithImageAllOf.getExample();
        OASPinMediaWithImageAllOf pinMediaWithImageAllOf2 = OASPinMediaWithImageAllOf.getExample();
        OASPinMediaWithImageAllOf pinMediaWithImageAllOf3 = new OASPinMediaWithImageAllOf();
        OASPinMediaWithImageAllOf pinMediaWithImageAllOf4 = new OASPinMediaWithImageAllOf();

        System.assert(pinMediaWithImageAllOf1.equals(pinMediaWithImageAllOf2));
        System.assert(pinMediaWithImageAllOf2.equals(pinMediaWithImageAllOf1));
        System.assert(pinMediaWithImageAllOf3.equals(pinMediaWithImageAllOf4));
        System.assert(pinMediaWithImageAllOf4.equals(pinMediaWithImageAllOf3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPinMediaWithImageAllOf pinMediaWithImageAllOf1 = OASPinMediaWithImageAllOf.getExample();
        OASPinMediaWithImageAllOf pinMediaWithImageAllOf2 = new OASPinMediaWithImageAllOf();

        System.assertEquals(false, pinMediaWithImageAllOf1.equals('foo'));
        System.assertEquals(false, pinMediaWithImageAllOf2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPinMediaWithImageAllOf pinMediaWithImageAllOf1 = OASPinMediaWithImageAllOf.getExample();
        OASPinMediaWithImageAllOf pinMediaWithImageAllOf2 = new OASPinMediaWithImageAllOf();
        OASPinMediaWithImageAllOf pinMediaWithImageAllOf3;

        System.assertEquals(false, pinMediaWithImageAllOf1.equals(pinMediaWithImageAllOf3));
        System.assertEquals(false, pinMediaWithImageAllOf2.equals(pinMediaWithImageAllOf3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPinMediaWithImageAllOf pinMediaWithImageAllOf1 = OASPinMediaWithImageAllOf.getExample();
        OASPinMediaWithImageAllOf pinMediaWithImageAllOf2 = new OASPinMediaWithImageAllOf();

        System.assertEquals(pinMediaWithImageAllOf1.hashCode(), pinMediaWithImageAllOf1.hashCode());
        System.assertEquals(pinMediaWithImageAllOf2.hashCode(), pinMediaWithImageAllOf2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPinMediaWithImageAllOf pinMediaWithImageAllOf1 = OASPinMediaWithImageAllOf.getExample();
        OASPinMediaWithImageAllOf pinMediaWithImageAllOf2 = OASPinMediaWithImageAllOf.getExample();
        OASPinMediaWithImageAllOf pinMediaWithImageAllOf3 = new OASPinMediaWithImageAllOf();
        OASPinMediaWithImageAllOf pinMediaWithImageAllOf4 = new OASPinMediaWithImageAllOf();

        System.assert(pinMediaWithImageAllOf1.equals(pinMediaWithImageAllOf2));
        System.assert(pinMediaWithImageAllOf3.equals(pinMediaWithImageAllOf4));
        System.assertEquals(pinMediaWithImageAllOf1.hashCode(), pinMediaWithImageAllOf2.hashCode());
        System.assertEquals(pinMediaWithImageAllOf3.hashCode(), pinMediaWithImageAllOf4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPinMediaWithImageAllOf pinMediaWithImageAllOf = new OASPinMediaWithImageAllOf();
        System.assertEquals(new Map<String, OASImageDetails>(), pinMediaWithImageAllOf.images);
    }
}
