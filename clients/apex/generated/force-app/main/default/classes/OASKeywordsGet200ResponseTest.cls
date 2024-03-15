@isTest
private class OASKeywordsGet200ResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASKeywordsGet200Response keywordsGet200Response1 = OASKeywordsGet200Response.getExample();
        OASKeywordsGet200Response keywordsGet200Response2 = keywordsGet200Response1;
        OASKeywordsGet200Response keywordsGet200Response3 = new OASKeywordsGet200Response();
        OASKeywordsGet200Response keywordsGet200Response4 = keywordsGet200Response3;

        System.assert(keywordsGet200Response1.equals(keywordsGet200Response2));
        System.assert(keywordsGet200Response2.equals(keywordsGet200Response1));
        System.assert(keywordsGet200Response1.equals(keywordsGet200Response1));
        System.assert(keywordsGet200Response3.equals(keywordsGet200Response4));
        System.assert(keywordsGet200Response4.equals(keywordsGet200Response3));
        System.assert(keywordsGet200Response3.equals(keywordsGet200Response3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASKeywordsGet200Response keywordsGet200Response1 = OASKeywordsGet200Response.getExample();
        OASKeywordsGet200Response keywordsGet200Response2 = OASKeywordsGet200Response.getExample();
        OASKeywordsGet200Response keywordsGet200Response3 = new OASKeywordsGet200Response();
        OASKeywordsGet200Response keywordsGet200Response4 = new OASKeywordsGet200Response();

        System.assert(keywordsGet200Response1.equals(keywordsGet200Response2));
        System.assert(keywordsGet200Response2.equals(keywordsGet200Response1));
        System.assert(keywordsGet200Response3.equals(keywordsGet200Response4));
        System.assert(keywordsGet200Response4.equals(keywordsGet200Response3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASKeywordsGet200Response keywordsGet200Response1 = OASKeywordsGet200Response.getExample();
        OASKeywordsGet200Response keywordsGet200Response2 = new OASKeywordsGet200Response();

        System.assertEquals(false, keywordsGet200Response1.equals('foo'));
        System.assertEquals(false, keywordsGet200Response2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASKeywordsGet200Response keywordsGet200Response1 = OASKeywordsGet200Response.getExample();
        OASKeywordsGet200Response keywordsGet200Response2 = new OASKeywordsGet200Response();
        OASKeywordsGet200Response keywordsGet200Response3;

        System.assertEquals(false, keywordsGet200Response1.equals(keywordsGet200Response3));
        System.assertEquals(false, keywordsGet200Response2.equals(keywordsGet200Response3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASKeywordsGet200Response keywordsGet200Response1 = OASKeywordsGet200Response.getExample();
        OASKeywordsGet200Response keywordsGet200Response2 = new OASKeywordsGet200Response();

        System.assertEquals(keywordsGet200Response1.hashCode(), keywordsGet200Response1.hashCode());
        System.assertEquals(keywordsGet200Response2.hashCode(), keywordsGet200Response2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASKeywordsGet200Response keywordsGet200Response1 = OASKeywordsGet200Response.getExample();
        OASKeywordsGet200Response keywordsGet200Response2 = OASKeywordsGet200Response.getExample();
        OASKeywordsGet200Response keywordsGet200Response3 = new OASKeywordsGet200Response();
        OASKeywordsGet200Response keywordsGet200Response4 = new OASKeywordsGet200Response();

        System.assert(keywordsGet200Response1.equals(keywordsGet200Response2));
        System.assert(keywordsGet200Response3.equals(keywordsGet200Response4));
        System.assertEquals(keywordsGet200Response1.hashCode(), keywordsGet200Response2.hashCode());
        System.assertEquals(keywordsGet200Response3.hashCode(), keywordsGet200Response4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASKeywordsGet200Response keywordsGet200Response = new OASKeywordsGet200Response();
        System.assertEquals(new List<OASKeyword>(), keywordsGet200Response.items);
        System.assertEquals(null, keywordsGet200Response.bookmark);
    }
}
