@isTest
private class OASKeywordUpdateBodyTest {
    @isTest
    private static void equalsSameInstance() {
        OASKeywordUpdateBody keywordUpdateBody1 = OASKeywordUpdateBody.getExample();
        OASKeywordUpdateBody keywordUpdateBody2 = keywordUpdateBody1;
        OASKeywordUpdateBody keywordUpdateBody3 = new OASKeywordUpdateBody();
        OASKeywordUpdateBody keywordUpdateBody4 = keywordUpdateBody3;

        System.assert(keywordUpdateBody1.equals(keywordUpdateBody2));
        System.assert(keywordUpdateBody2.equals(keywordUpdateBody1));
        System.assert(keywordUpdateBody1.equals(keywordUpdateBody1));
        System.assert(keywordUpdateBody3.equals(keywordUpdateBody4));
        System.assert(keywordUpdateBody4.equals(keywordUpdateBody3));
        System.assert(keywordUpdateBody3.equals(keywordUpdateBody3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASKeywordUpdateBody keywordUpdateBody1 = OASKeywordUpdateBody.getExample();
        OASKeywordUpdateBody keywordUpdateBody2 = OASKeywordUpdateBody.getExample();
        OASKeywordUpdateBody keywordUpdateBody3 = new OASKeywordUpdateBody();
        OASKeywordUpdateBody keywordUpdateBody4 = new OASKeywordUpdateBody();

        System.assert(keywordUpdateBody1.equals(keywordUpdateBody2));
        System.assert(keywordUpdateBody2.equals(keywordUpdateBody1));
        System.assert(keywordUpdateBody3.equals(keywordUpdateBody4));
        System.assert(keywordUpdateBody4.equals(keywordUpdateBody3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASKeywordUpdateBody keywordUpdateBody1 = OASKeywordUpdateBody.getExample();
        OASKeywordUpdateBody keywordUpdateBody2 = new OASKeywordUpdateBody();

        System.assertEquals(false, keywordUpdateBody1.equals('foo'));
        System.assertEquals(false, keywordUpdateBody2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASKeywordUpdateBody keywordUpdateBody1 = OASKeywordUpdateBody.getExample();
        OASKeywordUpdateBody keywordUpdateBody2 = new OASKeywordUpdateBody();
        OASKeywordUpdateBody keywordUpdateBody3;

        System.assertEquals(false, keywordUpdateBody1.equals(keywordUpdateBody3));
        System.assertEquals(false, keywordUpdateBody2.equals(keywordUpdateBody3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASKeywordUpdateBody keywordUpdateBody1 = OASKeywordUpdateBody.getExample();
        OASKeywordUpdateBody keywordUpdateBody2 = new OASKeywordUpdateBody();

        System.assertEquals(keywordUpdateBody1.hashCode(), keywordUpdateBody1.hashCode());
        System.assertEquals(keywordUpdateBody2.hashCode(), keywordUpdateBody2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASKeywordUpdateBody keywordUpdateBody1 = OASKeywordUpdateBody.getExample();
        OASKeywordUpdateBody keywordUpdateBody2 = OASKeywordUpdateBody.getExample();
        OASKeywordUpdateBody keywordUpdateBody3 = new OASKeywordUpdateBody();
        OASKeywordUpdateBody keywordUpdateBody4 = new OASKeywordUpdateBody();

        System.assert(keywordUpdateBody1.equals(keywordUpdateBody2));
        System.assert(keywordUpdateBody3.equals(keywordUpdateBody4));
        System.assertEquals(keywordUpdateBody1.hashCode(), keywordUpdateBody2.hashCode());
        System.assertEquals(keywordUpdateBody3.hashCode(), keywordUpdateBody4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASKeywordUpdateBody keywordUpdateBody = new OASKeywordUpdateBody();
        System.assertEquals(new List<OASKeywordUpdate>(), keywordUpdateBody.keywords);
    }
}
