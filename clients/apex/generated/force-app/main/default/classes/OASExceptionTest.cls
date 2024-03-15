@isTest
private class OASExceptionTest {
    @isTest
    private static void equalsSameInstance() {
        OASException r_exception1 = OASException.getExample();
        OASException r_exception2 = r_exception1;
        OASException r_exception3 = new OASException();
        OASException r_exception4 = r_exception3;

        System.assert(r_exception1.equals(r_exception2));
        System.assert(r_exception2.equals(r_exception1));
        System.assert(r_exception1.equals(r_exception1));
        System.assert(r_exception3.equals(r_exception4));
        System.assert(r_exception4.equals(r_exception3));
        System.assert(r_exception3.equals(r_exception3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASException r_exception1 = OASException.getExample();
        OASException r_exception2 = OASException.getExample();
        OASException r_exception3 = new OASException();
        OASException r_exception4 = new OASException();

        System.assert(r_exception1.equals(r_exception2));
        System.assert(r_exception2.equals(r_exception1));
        System.assert(r_exception3.equals(r_exception4));
        System.assert(r_exception4.equals(r_exception3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASException r_exception1 = OASException.getExample();
        OASException r_exception2 = new OASException();

        System.assertEquals(false, r_exception1.equals('foo'));
        System.assertEquals(false, r_exception2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASException r_exception1 = OASException.getExample();
        OASException r_exception2 = new OASException();
        OASException r_exception3;

        System.assertEquals(false, r_exception1.equals(r_exception3));
        System.assertEquals(false, r_exception2.equals(r_exception3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASException r_exception1 = OASException.getExample();
        OASException r_exception2 = new OASException();

        System.assertEquals(r_exception1.hashCode(), r_exception1.hashCode());
        System.assertEquals(r_exception2.hashCode(), r_exception2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASException r_exception1 = OASException.getExample();
        OASException r_exception2 = OASException.getExample();
        OASException r_exception3 = new OASException();
        OASException r_exception4 = new OASException();

        System.assert(r_exception1.equals(r_exception2));
        System.assert(r_exception3.equals(r_exception4));
        System.assertEquals(r_exception1.hashCode(), r_exception2.hashCode());
        System.assertEquals(r_exception3.hashCode(), r_exception4.hashCode());
    }
}
