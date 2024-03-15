@isTest
private class OASKeywordsRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASKeywordsRequest keywordsRequest1 = OASKeywordsRequest.getExample();
        OASKeywordsRequest keywordsRequest2 = keywordsRequest1;
        OASKeywordsRequest keywordsRequest3 = new OASKeywordsRequest();
        OASKeywordsRequest keywordsRequest4 = keywordsRequest3;

        System.assert(keywordsRequest1.equals(keywordsRequest2));
        System.assert(keywordsRequest2.equals(keywordsRequest1));
        System.assert(keywordsRequest1.equals(keywordsRequest1));
        System.assert(keywordsRequest3.equals(keywordsRequest4));
        System.assert(keywordsRequest4.equals(keywordsRequest3));
        System.assert(keywordsRequest3.equals(keywordsRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASKeywordsRequest keywordsRequest1 = OASKeywordsRequest.getExample();
        OASKeywordsRequest keywordsRequest2 = OASKeywordsRequest.getExample();
        OASKeywordsRequest keywordsRequest3 = new OASKeywordsRequest();
        OASKeywordsRequest keywordsRequest4 = new OASKeywordsRequest();

        System.assert(keywordsRequest1.equals(keywordsRequest2));
        System.assert(keywordsRequest2.equals(keywordsRequest1));
        System.assert(keywordsRequest3.equals(keywordsRequest4));
        System.assert(keywordsRequest4.equals(keywordsRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASKeywordsRequest keywordsRequest1 = OASKeywordsRequest.getExample();
        OASKeywordsRequest keywordsRequest2 = new OASKeywordsRequest();

        System.assertEquals(false, keywordsRequest1.equals('foo'));
        System.assertEquals(false, keywordsRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASKeywordsRequest keywordsRequest1 = OASKeywordsRequest.getExample();
        OASKeywordsRequest keywordsRequest2 = new OASKeywordsRequest();
        OASKeywordsRequest keywordsRequest3;

        System.assertEquals(false, keywordsRequest1.equals(keywordsRequest3));
        System.assertEquals(false, keywordsRequest2.equals(keywordsRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASKeywordsRequest keywordsRequest1 = OASKeywordsRequest.getExample();
        OASKeywordsRequest keywordsRequest2 = new OASKeywordsRequest();

        System.assertEquals(keywordsRequest1.hashCode(), keywordsRequest1.hashCode());
        System.assertEquals(keywordsRequest2.hashCode(), keywordsRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASKeywordsRequest keywordsRequest1 = OASKeywordsRequest.getExample();
        OASKeywordsRequest keywordsRequest2 = OASKeywordsRequest.getExample();
        OASKeywordsRequest keywordsRequest3 = new OASKeywordsRequest();
        OASKeywordsRequest keywordsRequest4 = new OASKeywordsRequest();

        System.assert(keywordsRequest1.equals(keywordsRequest2));
        System.assert(keywordsRequest3.equals(keywordsRequest4));
        System.assertEquals(keywordsRequest1.hashCode(), keywordsRequest2.hashCode());
        System.assertEquals(keywordsRequest3.hashCode(), keywordsRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASKeywordsRequest keywordsRequest = new OASKeywordsRequest();
        Map<String, String> x-property-mappings = keywordsRequest.getx-property-mappings();
        System.assertEquals('parentId', x-property-mappings.get('parent_id'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASKeywordsRequest keywordsRequest = new OASKeywordsRequest();
        System.assertEquals(new List<OASKeywordsCommon>(), keywordsRequest.keywords);
        System.assertEquals(null, keywordsRequest.parentId);
    }
}
