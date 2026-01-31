@isTest
private class OASUpdatableItemAttributesGtinTest {
    @isTest
    private static void equalsSameInstance() {
        OASUpdatableItemAttributesGtin updatableItemAttributesGtin1 = OASUpdatableItemAttributesGtin.getExample();
        OASUpdatableItemAttributesGtin updatableItemAttributesGtin2 = updatableItemAttributesGtin1;
        OASUpdatableItemAttributesGtin updatableItemAttributesGtin3 = new OASUpdatableItemAttributesGtin();
        OASUpdatableItemAttributesGtin updatableItemAttributesGtin4 = updatableItemAttributesGtin3;

        System.assert(updatableItemAttributesGtin1.equals(updatableItemAttributesGtin2));
        System.assert(updatableItemAttributesGtin2.equals(updatableItemAttributesGtin1));
        System.assert(updatableItemAttributesGtin1.equals(updatableItemAttributesGtin1));
        System.assert(updatableItemAttributesGtin3.equals(updatableItemAttributesGtin4));
        System.assert(updatableItemAttributesGtin4.equals(updatableItemAttributesGtin3));
        System.assert(updatableItemAttributesGtin3.equals(updatableItemAttributesGtin3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUpdatableItemAttributesGtin updatableItemAttributesGtin1 = OASUpdatableItemAttributesGtin.getExample();
        OASUpdatableItemAttributesGtin updatableItemAttributesGtin2 = OASUpdatableItemAttributesGtin.getExample();
        OASUpdatableItemAttributesGtin updatableItemAttributesGtin3 = new OASUpdatableItemAttributesGtin();
        OASUpdatableItemAttributesGtin updatableItemAttributesGtin4 = new OASUpdatableItemAttributesGtin();

        System.assert(updatableItemAttributesGtin1.equals(updatableItemAttributesGtin2));
        System.assert(updatableItemAttributesGtin2.equals(updatableItemAttributesGtin1));
        System.assert(updatableItemAttributesGtin3.equals(updatableItemAttributesGtin4));
        System.assert(updatableItemAttributesGtin4.equals(updatableItemAttributesGtin3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUpdatableItemAttributesGtin updatableItemAttributesGtin1 = OASUpdatableItemAttributesGtin.getExample();
        OASUpdatableItemAttributesGtin updatableItemAttributesGtin2 = new OASUpdatableItemAttributesGtin();

        System.assertEquals(false, updatableItemAttributesGtin1.equals('foo'));
        System.assertEquals(false, updatableItemAttributesGtin2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUpdatableItemAttributesGtin updatableItemAttributesGtin1 = OASUpdatableItemAttributesGtin.getExample();
        OASUpdatableItemAttributesGtin updatableItemAttributesGtin2 = new OASUpdatableItemAttributesGtin();
        OASUpdatableItemAttributesGtin updatableItemAttributesGtin3;

        System.assertEquals(false, updatableItemAttributesGtin1.equals(updatableItemAttributesGtin3));
        System.assertEquals(false, updatableItemAttributesGtin2.equals(updatableItemAttributesGtin3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUpdatableItemAttributesGtin updatableItemAttributesGtin1 = OASUpdatableItemAttributesGtin.getExample();
        OASUpdatableItemAttributesGtin updatableItemAttributesGtin2 = new OASUpdatableItemAttributesGtin();

        System.assertEquals(updatableItemAttributesGtin1.hashCode(), updatableItemAttributesGtin1.hashCode());
        System.assertEquals(updatableItemAttributesGtin2.hashCode(), updatableItemAttributesGtin2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUpdatableItemAttributesGtin updatableItemAttributesGtin1 = OASUpdatableItemAttributesGtin.getExample();
        OASUpdatableItemAttributesGtin updatableItemAttributesGtin2 = OASUpdatableItemAttributesGtin.getExample();
        OASUpdatableItemAttributesGtin updatableItemAttributesGtin3 = new OASUpdatableItemAttributesGtin();
        OASUpdatableItemAttributesGtin updatableItemAttributesGtin4 = new OASUpdatableItemAttributesGtin();

        System.assert(updatableItemAttributesGtin1.equals(updatableItemAttributesGtin2));
        System.assert(updatableItemAttributesGtin3.equals(updatableItemAttributesGtin4));
        System.assertEquals(updatableItemAttributesGtin1.hashCode(), updatableItemAttributesGtin2.hashCode());
        System.assertEquals(updatableItemAttributesGtin3.hashCode(), updatableItemAttributesGtin4.hashCode());
    }
}
