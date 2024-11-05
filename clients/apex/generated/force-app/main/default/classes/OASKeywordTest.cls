@isTest
private class OASKeywordTest {
    @isTest
    private static void equalsSameInstance() {
        OASKeyword keyword1 = OASKeyword.getExample();
        OASKeyword keyword2 = keyword1;
        OASKeyword keyword3 = new OASKeyword();
        OASKeyword keyword4 = keyword3;

        System.assert(keyword1.equals(keyword2));
        System.assert(keyword2.equals(keyword1));
        System.assert(keyword1.equals(keyword1));
        System.assert(keyword3.equals(keyword4));
        System.assert(keyword4.equals(keyword3));
        System.assert(keyword3.equals(keyword3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASKeyword keyword1 = OASKeyword.getExample();
        OASKeyword keyword2 = OASKeyword.getExample();
        OASKeyword keyword3 = new OASKeyword();
        OASKeyword keyword4 = new OASKeyword();

        System.assert(keyword1.equals(keyword2));
        System.assert(keyword2.equals(keyword1));
        System.assert(keyword3.equals(keyword4));
        System.assert(keyword4.equals(keyword3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASKeyword keyword1 = OASKeyword.getExample();
        OASKeyword keyword2 = new OASKeyword();

        System.assertEquals(false, keyword1.equals('foo'));
        System.assertEquals(false, keyword2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASKeyword keyword1 = OASKeyword.getExample();
        OASKeyword keyword2 = new OASKeyword();
        OASKeyword keyword3;

        System.assertEquals(false, keyword1.equals(keyword3));
        System.assertEquals(false, keyword2.equals(keyword3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASKeyword keyword1 = OASKeyword.getExample();
        OASKeyword keyword2 = new OASKeyword();

        System.assertEquals(keyword1.hashCode(), keyword1.hashCode());
        System.assertEquals(keyword2.hashCode(), keyword2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASKeyword keyword1 = OASKeyword.getExample();
        OASKeyword keyword2 = OASKeyword.getExample();
        OASKeyword keyword3 = new OASKeyword();
        OASKeyword keyword4 = new OASKeyword();

        System.assert(keyword1.equals(keyword2));
        System.assert(keyword3.equals(keyword4));
        System.assertEquals(keyword1.hashCode(), keyword2.hashCode());
        System.assertEquals(keyword3.hashCode(), keyword4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASKeyword keyword = new OASKeyword();
        Map<String, String> x-property-mappings = keyword.getx-property-mappings();
        System.assertEquals('matchType', x-property-mappings.get('match_type'));
        System.assertEquals('parentId', x-property-mappings.get('parent_id'));
        System.assertEquals('parentType', x-property-mappings.get('parent_type'));
    }
}
