@isTest
private class OASBusinessAccessErrorTest {
    @isTest
    private static void equalsSameInstance() {
        OASBusinessAccessError businessAccessError1 = OASBusinessAccessError.getExample();
        OASBusinessAccessError businessAccessError2 = businessAccessError1;
        OASBusinessAccessError businessAccessError3 = new OASBusinessAccessError();
        OASBusinessAccessError businessAccessError4 = businessAccessError3;

        System.assert(businessAccessError1.equals(businessAccessError2));
        System.assert(businessAccessError2.equals(businessAccessError1));
        System.assert(businessAccessError1.equals(businessAccessError1));
        System.assert(businessAccessError3.equals(businessAccessError4));
        System.assert(businessAccessError4.equals(businessAccessError3));
        System.assert(businessAccessError3.equals(businessAccessError3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBusinessAccessError businessAccessError1 = OASBusinessAccessError.getExample();
        OASBusinessAccessError businessAccessError2 = OASBusinessAccessError.getExample();
        OASBusinessAccessError businessAccessError3 = new OASBusinessAccessError();
        OASBusinessAccessError businessAccessError4 = new OASBusinessAccessError();

        System.assert(businessAccessError1.equals(businessAccessError2));
        System.assert(businessAccessError2.equals(businessAccessError1));
        System.assert(businessAccessError3.equals(businessAccessError4));
        System.assert(businessAccessError4.equals(businessAccessError3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBusinessAccessError businessAccessError1 = OASBusinessAccessError.getExample();
        OASBusinessAccessError businessAccessError2 = new OASBusinessAccessError();

        System.assertEquals(false, businessAccessError1.equals('foo'));
        System.assertEquals(false, businessAccessError2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBusinessAccessError businessAccessError1 = OASBusinessAccessError.getExample();
        OASBusinessAccessError businessAccessError2 = new OASBusinessAccessError();
        OASBusinessAccessError businessAccessError3;

        System.assertEquals(false, businessAccessError1.equals(businessAccessError3));
        System.assertEquals(false, businessAccessError2.equals(businessAccessError3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBusinessAccessError businessAccessError1 = OASBusinessAccessError.getExample();
        OASBusinessAccessError businessAccessError2 = new OASBusinessAccessError();

        System.assertEquals(businessAccessError1.hashCode(), businessAccessError1.hashCode());
        System.assertEquals(businessAccessError2.hashCode(), businessAccessError2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBusinessAccessError businessAccessError1 = OASBusinessAccessError.getExample();
        OASBusinessAccessError businessAccessError2 = OASBusinessAccessError.getExample();
        OASBusinessAccessError businessAccessError3 = new OASBusinessAccessError();
        OASBusinessAccessError businessAccessError4 = new OASBusinessAccessError();

        System.assert(businessAccessError1.equals(businessAccessError2));
        System.assert(businessAccessError3.equals(businessAccessError4));
        System.assertEquals(businessAccessError1.hashCode(), businessAccessError2.hashCode());
        System.assertEquals(businessAccessError3.hashCode(), businessAccessError4.hashCode());
    }
}
