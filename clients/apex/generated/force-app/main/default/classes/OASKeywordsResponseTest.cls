@isTest
private class OASKeywordsResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASKeywordsResponse keywordsResponse1 = OASKeywordsResponse.getExample();
        OASKeywordsResponse keywordsResponse2 = keywordsResponse1;
        OASKeywordsResponse keywordsResponse3 = new OASKeywordsResponse();
        OASKeywordsResponse keywordsResponse4 = keywordsResponse3;

        System.assert(keywordsResponse1.equals(keywordsResponse2));
        System.assert(keywordsResponse2.equals(keywordsResponse1));
        System.assert(keywordsResponse1.equals(keywordsResponse1));
        System.assert(keywordsResponse3.equals(keywordsResponse4));
        System.assert(keywordsResponse4.equals(keywordsResponse3));
        System.assert(keywordsResponse3.equals(keywordsResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASKeywordsResponse keywordsResponse1 = OASKeywordsResponse.getExample();
        OASKeywordsResponse keywordsResponse2 = OASKeywordsResponse.getExample();
        OASKeywordsResponse keywordsResponse3 = new OASKeywordsResponse();
        OASKeywordsResponse keywordsResponse4 = new OASKeywordsResponse();

        System.assert(keywordsResponse1.equals(keywordsResponse2));
        System.assert(keywordsResponse2.equals(keywordsResponse1));
        System.assert(keywordsResponse3.equals(keywordsResponse4));
        System.assert(keywordsResponse4.equals(keywordsResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASKeywordsResponse keywordsResponse1 = OASKeywordsResponse.getExample();
        OASKeywordsResponse keywordsResponse2 = new OASKeywordsResponse();

        System.assertEquals(false, keywordsResponse1.equals('foo'));
        System.assertEquals(false, keywordsResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASKeywordsResponse keywordsResponse1 = OASKeywordsResponse.getExample();
        OASKeywordsResponse keywordsResponse2 = new OASKeywordsResponse();
        OASKeywordsResponse keywordsResponse3;

        System.assertEquals(false, keywordsResponse1.equals(keywordsResponse3));
        System.assertEquals(false, keywordsResponse2.equals(keywordsResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASKeywordsResponse keywordsResponse1 = OASKeywordsResponse.getExample();
        OASKeywordsResponse keywordsResponse2 = new OASKeywordsResponse();

        System.assertEquals(keywordsResponse1.hashCode(), keywordsResponse1.hashCode());
        System.assertEquals(keywordsResponse2.hashCode(), keywordsResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASKeywordsResponse keywordsResponse1 = OASKeywordsResponse.getExample();
        OASKeywordsResponse keywordsResponse2 = OASKeywordsResponse.getExample();
        OASKeywordsResponse keywordsResponse3 = new OASKeywordsResponse();
        OASKeywordsResponse keywordsResponse4 = new OASKeywordsResponse();

        System.assert(keywordsResponse1.equals(keywordsResponse2));
        System.assert(keywordsResponse3.equals(keywordsResponse4));
        System.assertEquals(keywordsResponse1.hashCode(), keywordsResponse2.hashCode());
        System.assertEquals(keywordsResponse3.hashCode(), keywordsResponse4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASKeywordsResponse keywordsResponse = new OASKeywordsResponse();
        System.assertEquals(new List<OASKeywordError>(), keywordsResponse.errors);
        System.assertEquals(new List<OASKeyword>(), keywordsResponse.keywords);
    }
}
