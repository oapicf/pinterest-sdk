@isTest
private class OASKeywordsCommonTest {
    @isTest
    private static void equalsSameInstance() {
        OASKeywordsCommon keywordsCommon1 = OASKeywordsCommon.getExample();
        OASKeywordsCommon keywordsCommon2 = keywordsCommon1;
        OASKeywordsCommon keywordsCommon3 = new OASKeywordsCommon();
        OASKeywordsCommon keywordsCommon4 = keywordsCommon3;

        System.assert(keywordsCommon1.equals(keywordsCommon2));
        System.assert(keywordsCommon2.equals(keywordsCommon1));
        System.assert(keywordsCommon1.equals(keywordsCommon1));
        System.assert(keywordsCommon3.equals(keywordsCommon4));
        System.assert(keywordsCommon4.equals(keywordsCommon3));
        System.assert(keywordsCommon3.equals(keywordsCommon3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASKeywordsCommon keywordsCommon1 = OASKeywordsCommon.getExample();
        OASKeywordsCommon keywordsCommon2 = OASKeywordsCommon.getExample();
        OASKeywordsCommon keywordsCommon3 = new OASKeywordsCommon();
        OASKeywordsCommon keywordsCommon4 = new OASKeywordsCommon();

        System.assert(keywordsCommon1.equals(keywordsCommon2));
        System.assert(keywordsCommon2.equals(keywordsCommon1));
        System.assert(keywordsCommon3.equals(keywordsCommon4));
        System.assert(keywordsCommon4.equals(keywordsCommon3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASKeywordsCommon keywordsCommon1 = OASKeywordsCommon.getExample();
        OASKeywordsCommon keywordsCommon2 = new OASKeywordsCommon();

        System.assertEquals(false, keywordsCommon1.equals('foo'));
        System.assertEquals(false, keywordsCommon2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASKeywordsCommon keywordsCommon1 = OASKeywordsCommon.getExample();
        OASKeywordsCommon keywordsCommon2 = new OASKeywordsCommon();
        OASKeywordsCommon keywordsCommon3;

        System.assertEquals(false, keywordsCommon1.equals(keywordsCommon3));
        System.assertEquals(false, keywordsCommon2.equals(keywordsCommon3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASKeywordsCommon keywordsCommon1 = OASKeywordsCommon.getExample();
        OASKeywordsCommon keywordsCommon2 = new OASKeywordsCommon();

        System.assertEquals(keywordsCommon1.hashCode(), keywordsCommon1.hashCode());
        System.assertEquals(keywordsCommon2.hashCode(), keywordsCommon2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASKeywordsCommon keywordsCommon1 = OASKeywordsCommon.getExample();
        OASKeywordsCommon keywordsCommon2 = OASKeywordsCommon.getExample();
        OASKeywordsCommon keywordsCommon3 = new OASKeywordsCommon();
        OASKeywordsCommon keywordsCommon4 = new OASKeywordsCommon();

        System.assert(keywordsCommon1.equals(keywordsCommon2));
        System.assert(keywordsCommon3.equals(keywordsCommon4));
        System.assertEquals(keywordsCommon1.hashCode(), keywordsCommon2.hashCode());
        System.assertEquals(keywordsCommon3.hashCode(), keywordsCommon4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASKeywordsCommon keywordsCommon = new OASKeywordsCommon();
        Map<String, String> x-property-mappings = keywordsCommon.getx-property-mappings();
        System.assertEquals('matchType', x-property-mappings.get('match_type'));
    }
}
