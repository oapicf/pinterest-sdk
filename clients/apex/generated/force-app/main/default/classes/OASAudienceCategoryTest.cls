@isTest
private class OASAudienceCategoryTest {
    @isTest
    private static void equalsSameInstance() {
        OASAudienceCategory audienceCategory1 = OASAudienceCategory.getExample();
        OASAudienceCategory audienceCategory2 = audienceCategory1;
        OASAudienceCategory audienceCategory3 = new OASAudienceCategory();
        OASAudienceCategory audienceCategory4 = audienceCategory3;

        System.assert(audienceCategory1.equals(audienceCategory2));
        System.assert(audienceCategory2.equals(audienceCategory1));
        System.assert(audienceCategory1.equals(audienceCategory1));
        System.assert(audienceCategory3.equals(audienceCategory4));
        System.assert(audienceCategory4.equals(audienceCategory3));
        System.assert(audienceCategory3.equals(audienceCategory3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAudienceCategory audienceCategory1 = OASAudienceCategory.getExample();
        OASAudienceCategory audienceCategory2 = OASAudienceCategory.getExample();
        OASAudienceCategory audienceCategory3 = new OASAudienceCategory();
        OASAudienceCategory audienceCategory4 = new OASAudienceCategory();

        System.assert(audienceCategory1.equals(audienceCategory2));
        System.assert(audienceCategory2.equals(audienceCategory1));
        System.assert(audienceCategory3.equals(audienceCategory4));
        System.assert(audienceCategory4.equals(audienceCategory3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAudienceCategory audienceCategory1 = OASAudienceCategory.getExample();
        OASAudienceCategory audienceCategory2 = new OASAudienceCategory();

        System.assertEquals(false, audienceCategory1.equals('foo'));
        System.assertEquals(false, audienceCategory2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAudienceCategory audienceCategory1 = OASAudienceCategory.getExample();
        OASAudienceCategory audienceCategory2 = new OASAudienceCategory();
        OASAudienceCategory audienceCategory3;

        System.assertEquals(false, audienceCategory1.equals(audienceCategory3));
        System.assertEquals(false, audienceCategory2.equals(audienceCategory3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAudienceCategory audienceCategory1 = OASAudienceCategory.getExample();
        OASAudienceCategory audienceCategory2 = new OASAudienceCategory();

        System.assertEquals(audienceCategory1.hashCode(), audienceCategory1.hashCode());
        System.assertEquals(audienceCategory2.hashCode(), audienceCategory2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAudienceCategory audienceCategory1 = OASAudienceCategory.getExample();
        OASAudienceCategory audienceCategory2 = OASAudienceCategory.getExample();
        OASAudienceCategory audienceCategory3 = new OASAudienceCategory();
        OASAudienceCategory audienceCategory4 = new OASAudienceCategory();

        System.assert(audienceCategory1.equals(audienceCategory2));
        System.assert(audienceCategory3.equals(audienceCategory4));
        System.assertEquals(audienceCategory1.hashCode(), audienceCategory2.hashCode());
        System.assertEquals(audienceCategory3.hashCode(), audienceCategory4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAudienceCategory audienceCategory = new OASAudienceCategory();
        System.assertEquals(new List<OASAudienceSubcategory>(), audienceCategory.subcategories);
        System.assertEquals(null, audienceCategory.key);
        System.assertEquals(null, audienceCategory.name);
        System.assertEquals(null, audienceCategory.ratio);
        System.assertEquals(null, audienceCategory.index);
        System.assertEquals(null, audienceCategory.id);
    }
}
