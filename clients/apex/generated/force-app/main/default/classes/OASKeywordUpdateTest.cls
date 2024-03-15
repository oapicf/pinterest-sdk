@isTest
private class OASKeywordUpdateTest {
    @isTest
    private static void equalsSameInstance() {
        OASKeywordUpdate keywordUpdate1 = OASKeywordUpdate.getExample();
        OASKeywordUpdate keywordUpdate2 = keywordUpdate1;
        OASKeywordUpdate keywordUpdate3 = new OASKeywordUpdate();
        OASKeywordUpdate keywordUpdate4 = keywordUpdate3;

        System.assert(keywordUpdate1.equals(keywordUpdate2));
        System.assert(keywordUpdate2.equals(keywordUpdate1));
        System.assert(keywordUpdate1.equals(keywordUpdate1));
        System.assert(keywordUpdate3.equals(keywordUpdate4));
        System.assert(keywordUpdate4.equals(keywordUpdate3));
        System.assert(keywordUpdate3.equals(keywordUpdate3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASKeywordUpdate keywordUpdate1 = OASKeywordUpdate.getExample();
        OASKeywordUpdate keywordUpdate2 = OASKeywordUpdate.getExample();
        OASKeywordUpdate keywordUpdate3 = new OASKeywordUpdate();
        OASKeywordUpdate keywordUpdate4 = new OASKeywordUpdate();

        System.assert(keywordUpdate1.equals(keywordUpdate2));
        System.assert(keywordUpdate2.equals(keywordUpdate1));
        System.assert(keywordUpdate3.equals(keywordUpdate4));
        System.assert(keywordUpdate4.equals(keywordUpdate3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASKeywordUpdate keywordUpdate1 = OASKeywordUpdate.getExample();
        OASKeywordUpdate keywordUpdate2 = new OASKeywordUpdate();

        System.assertEquals(false, keywordUpdate1.equals('foo'));
        System.assertEquals(false, keywordUpdate2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASKeywordUpdate keywordUpdate1 = OASKeywordUpdate.getExample();
        OASKeywordUpdate keywordUpdate2 = new OASKeywordUpdate();
        OASKeywordUpdate keywordUpdate3;

        System.assertEquals(false, keywordUpdate1.equals(keywordUpdate3));
        System.assertEquals(false, keywordUpdate2.equals(keywordUpdate3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASKeywordUpdate keywordUpdate1 = OASKeywordUpdate.getExample();
        OASKeywordUpdate keywordUpdate2 = new OASKeywordUpdate();

        System.assertEquals(keywordUpdate1.hashCode(), keywordUpdate1.hashCode());
        System.assertEquals(keywordUpdate2.hashCode(), keywordUpdate2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASKeywordUpdate keywordUpdate1 = OASKeywordUpdate.getExample();
        OASKeywordUpdate keywordUpdate2 = OASKeywordUpdate.getExample();
        OASKeywordUpdate keywordUpdate3 = new OASKeywordUpdate();
        OASKeywordUpdate keywordUpdate4 = new OASKeywordUpdate();

        System.assert(keywordUpdate1.equals(keywordUpdate2));
        System.assert(keywordUpdate3.equals(keywordUpdate4));
        System.assertEquals(keywordUpdate1.hashCode(), keywordUpdate2.hashCode());
        System.assertEquals(keywordUpdate3.hashCode(), keywordUpdate4.hashCode());
    }
}
