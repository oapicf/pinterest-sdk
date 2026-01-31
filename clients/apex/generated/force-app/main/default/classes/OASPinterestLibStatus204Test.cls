@isTest
private class OASPinterestLibStatus204Test {
    @isTest
    private static void equalsSameInstance() {
        OASPinterestLibStatus204 pinterestLibStatus2041 = OASPinterestLibStatus204.getExample();
        OASPinterestLibStatus204 pinterestLibStatus2042 = pinterestLibStatus2041;
        OASPinterestLibStatus204 pinterestLibStatus2043 = new OASPinterestLibStatus204();
        OASPinterestLibStatus204 pinterestLibStatus2044 = pinterestLibStatus2043;

        System.assert(pinterestLibStatus2041.equals(pinterestLibStatus2042));
        System.assert(pinterestLibStatus2042.equals(pinterestLibStatus2041));
        System.assert(pinterestLibStatus2041.equals(pinterestLibStatus2041));
        System.assert(pinterestLibStatus2043.equals(pinterestLibStatus2044));
        System.assert(pinterestLibStatus2044.equals(pinterestLibStatus2043));
        System.assert(pinterestLibStatus2043.equals(pinterestLibStatus2043));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPinterestLibStatus204 pinterestLibStatus2041 = OASPinterestLibStatus204.getExample();
        OASPinterestLibStatus204 pinterestLibStatus2042 = OASPinterestLibStatus204.getExample();
        OASPinterestLibStatus204 pinterestLibStatus2043 = new OASPinterestLibStatus204();
        OASPinterestLibStatus204 pinterestLibStatus2044 = new OASPinterestLibStatus204();

        System.assert(pinterestLibStatus2041.equals(pinterestLibStatus2042));
        System.assert(pinterestLibStatus2042.equals(pinterestLibStatus2041));
        System.assert(pinterestLibStatus2043.equals(pinterestLibStatus2044));
        System.assert(pinterestLibStatus2044.equals(pinterestLibStatus2043));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPinterestLibStatus204 pinterestLibStatus2041 = OASPinterestLibStatus204.getExample();
        OASPinterestLibStatus204 pinterestLibStatus2042 = new OASPinterestLibStatus204();

        System.assertEquals(false, pinterestLibStatus2041.equals('foo'));
        System.assertEquals(false, pinterestLibStatus2042.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPinterestLibStatus204 pinterestLibStatus2041 = OASPinterestLibStatus204.getExample();
        OASPinterestLibStatus204 pinterestLibStatus2042 = new OASPinterestLibStatus204();
        OASPinterestLibStatus204 pinterestLibStatus2043;

        System.assertEquals(false, pinterestLibStatus2041.equals(pinterestLibStatus2043));
        System.assertEquals(false, pinterestLibStatus2042.equals(pinterestLibStatus2043));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPinterestLibStatus204 pinterestLibStatus2041 = OASPinterestLibStatus204.getExample();
        OASPinterestLibStatus204 pinterestLibStatus2042 = new OASPinterestLibStatus204();

        System.assertEquals(pinterestLibStatus2041.hashCode(), pinterestLibStatus2041.hashCode());
        System.assertEquals(pinterestLibStatus2042.hashCode(), pinterestLibStatus2042.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPinterestLibStatus204 pinterestLibStatus2041 = OASPinterestLibStatus204.getExample();
        OASPinterestLibStatus204 pinterestLibStatus2042 = OASPinterestLibStatus204.getExample();
        OASPinterestLibStatus204 pinterestLibStatus2043 = new OASPinterestLibStatus204();
        OASPinterestLibStatus204 pinterestLibStatus2044 = new OASPinterestLibStatus204();

        System.assert(pinterestLibStatus2041.equals(pinterestLibStatus2042));
        System.assert(pinterestLibStatus2043.equals(pinterestLibStatus2044));
        System.assertEquals(pinterestLibStatus2041.hashCode(), pinterestLibStatus2042.hashCode());
        System.assertEquals(pinterestLibStatus2043.hashCode(), pinterestLibStatus2044.hashCode());
    }
}
