@isTest
private class OASDetailedErrorTest {
    @isTest
    private static void equalsSameInstance() {
        OASDetailedError detailedError1 = OASDetailedError.getExample();
        OASDetailedError detailedError2 = detailedError1;
        OASDetailedError detailedError3 = new OASDetailedError();
        OASDetailedError detailedError4 = detailedError3;

        System.assert(detailedError1.equals(detailedError2));
        System.assert(detailedError2.equals(detailedError1));
        System.assert(detailedError1.equals(detailedError1));
        System.assert(detailedError3.equals(detailedError4));
        System.assert(detailedError4.equals(detailedError3));
        System.assert(detailedError3.equals(detailedError3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDetailedError detailedError1 = OASDetailedError.getExample();
        OASDetailedError detailedError2 = OASDetailedError.getExample();
        OASDetailedError detailedError3 = new OASDetailedError();
        OASDetailedError detailedError4 = new OASDetailedError();

        System.assert(detailedError1.equals(detailedError2));
        System.assert(detailedError2.equals(detailedError1));
        System.assert(detailedError3.equals(detailedError4));
        System.assert(detailedError4.equals(detailedError3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDetailedError detailedError1 = OASDetailedError.getExample();
        OASDetailedError detailedError2 = new OASDetailedError();

        System.assertEquals(false, detailedError1.equals('foo'));
        System.assertEquals(false, detailedError2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDetailedError detailedError1 = OASDetailedError.getExample();
        OASDetailedError detailedError2 = new OASDetailedError();
        OASDetailedError detailedError3;

        System.assertEquals(false, detailedError1.equals(detailedError3));
        System.assertEquals(false, detailedError2.equals(detailedError3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDetailedError detailedError1 = OASDetailedError.getExample();
        OASDetailedError detailedError2 = new OASDetailedError();

        System.assertEquals(detailedError1.hashCode(), detailedError1.hashCode());
        System.assertEquals(detailedError2.hashCode(), detailedError2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDetailedError detailedError1 = OASDetailedError.getExample();
        OASDetailedError detailedError2 = OASDetailedError.getExample();
        OASDetailedError detailedError3 = new OASDetailedError();
        OASDetailedError detailedError4 = new OASDetailedError();

        System.assert(detailedError1.equals(detailedError2));
        System.assert(detailedError3.equals(detailedError4));
        System.assertEquals(detailedError1.hashCode(), detailedError2.hashCode());
        System.assertEquals(detailedError3.hashCode(), detailedError4.hashCode());
    }
}
