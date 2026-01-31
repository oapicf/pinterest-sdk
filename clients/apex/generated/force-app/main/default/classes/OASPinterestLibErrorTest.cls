@isTest
private class OASPinterestLibErrorTest {
    @isTest
    private static void equalsSameInstance() {
        OASPinterestLibError pinterestLibError1 = OASPinterestLibError.getExample();
        OASPinterestLibError pinterestLibError2 = pinterestLibError1;
        OASPinterestLibError pinterestLibError3 = new OASPinterestLibError();
        OASPinterestLibError pinterestLibError4 = pinterestLibError3;

        System.assert(pinterestLibError1.equals(pinterestLibError2));
        System.assert(pinterestLibError2.equals(pinterestLibError1));
        System.assert(pinterestLibError1.equals(pinterestLibError1));
        System.assert(pinterestLibError3.equals(pinterestLibError4));
        System.assert(pinterestLibError4.equals(pinterestLibError3));
        System.assert(pinterestLibError3.equals(pinterestLibError3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPinterestLibError pinterestLibError1 = OASPinterestLibError.getExample();
        OASPinterestLibError pinterestLibError2 = OASPinterestLibError.getExample();
        OASPinterestLibError pinterestLibError3 = new OASPinterestLibError();
        OASPinterestLibError pinterestLibError4 = new OASPinterestLibError();

        System.assert(pinterestLibError1.equals(pinterestLibError2));
        System.assert(pinterestLibError2.equals(pinterestLibError1));
        System.assert(pinterestLibError3.equals(pinterestLibError4));
        System.assert(pinterestLibError4.equals(pinterestLibError3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPinterestLibError pinterestLibError1 = OASPinterestLibError.getExample();
        OASPinterestLibError pinterestLibError2 = new OASPinterestLibError();

        System.assertEquals(false, pinterestLibError1.equals('foo'));
        System.assertEquals(false, pinterestLibError2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPinterestLibError pinterestLibError1 = OASPinterestLibError.getExample();
        OASPinterestLibError pinterestLibError2 = new OASPinterestLibError();
        OASPinterestLibError pinterestLibError3;

        System.assertEquals(false, pinterestLibError1.equals(pinterestLibError3));
        System.assertEquals(false, pinterestLibError2.equals(pinterestLibError3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPinterestLibError pinterestLibError1 = OASPinterestLibError.getExample();
        OASPinterestLibError pinterestLibError2 = new OASPinterestLibError();

        System.assertEquals(pinterestLibError1.hashCode(), pinterestLibError1.hashCode());
        System.assertEquals(pinterestLibError2.hashCode(), pinterestLibError2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPinterestLibError pinterestLibError1 = OASPinterestLibError.getExample();
        OASPinterestLibError pinterestLibError2 = OASPinterestLibError.getExample();
        OASPinterestLibError pinterestLibError3 = new OASPinterestLibError();
        OASPinterestLibError pinterestLibError4 = new OASPinterestLibError();

        System.assert(pinterestLibError1.equals(pinterestLibError2));
        System.assert(pinterestLibError3.equals(pinterestLibError4));
        System.assertEquals(pinterestLibError1.hashCode(), pinterestLibError2.hashCode());
        System.assertEquals(pinterestLibError3.hashCode(), pinterestLibError4.hashCode());
    }
}
