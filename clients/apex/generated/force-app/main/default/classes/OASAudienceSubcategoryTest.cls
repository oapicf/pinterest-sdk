@isTest
private class OASAudienceSubcategoryTest {
    @isTest
    private static void equalsSameInstance() {
        OASAudienceSubcategory audienceSubcategory1 = OASAudienceSubcategory.getExample();
        OASAudienceSubcategory audienceSubcategory2 = audienceSubcategory1;
        OASAudienceSubcategory audienceSubcategory3 = new OASAudienceSubcategory();
        OASAudienceSubcategory audienceSubcategory4 = audienceSubcategory3;

        System.assert(audienceSubcategory1.equals(audienceSubcategory2));
        System.assert(audienceSubcategory2.equals(audienceSubcategory1));
        System.assert(audienceSubcategory1.equals(audienceSubcategory1));
        System.assert(audienceSubcategory3.equals(audienceSubcategory4));
        System.assert(audienceSubcategory4.equals(audienceSubcategory3));
        System.assert(audienceSubcategory3.equals(audienceSubcategory3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAudienceSubcategory audienceSubcategory1 = OASAudienceSubcategory.getExample();
        OASAudienceSubcategory audienceSubcategory2 = OASAudienceSubcategory.getExample();
        OASAudienceSubcategory audienceSubcategory3 = new OASAudienceSubcategory();
        OASAudienceSubcategory audienceSubcategory4 = new OASAudienceSubcategory();

        System.assert(audienceSubcategory1.equals(audienceSubcategory2));
        System.assert(audienceSubcategory2.equals(audienceSubcategory1));
        System.assert(audienceSubcategory3.equals(audienceSubcategory4));
        System.assert(audienceSubcategory4.equals(audienceSubcategory3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAudienceSubcategory audienceSubcategory1 = OASAudienceSubcategory.getExample();
        OASAudienceSubcategory audienceSubcategory2 = new OASAudienceSubcategory();

        System.assertEquals(false, audienceSubcategory1.equals('foo'));
        System.assertEquals(false, audienceSubcategory2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAudienceSubcategory audienceSubcategory1 = OASAudienceSubcategory.getExample();
        OASAudienceSubcategory audienceSubcategory2 = new OASAudienceSubcategory();
        OASAudienceSubcategory audienceSubcategory3;

        System.assertEquals(false, audienceSubcategory1.equals(audienceSubcategory3));
        System.assertEquals(false, audienceSubcategory2.equals(audienceSubcategory3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAudienceSubcategory audienceSubcategory1 = OASAudienceSubcategory.getExample();
        OASAudienceSubcategory audienceSubcategory2 = new OASAudienceSubcategory();

        System.assertEquals(audienceSubcategory1.hashCode(), audienceSubcategory1.hashCode());
        System.assertEquals(audienceSubcategory2.hashCode(), audienceSubcategory2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAudienceSubcategory audienceSubcategory1 = OASAudienceSubcategory.getExample();
        OASAudienceSubcategory audienceSubcategory2 = OASAudienceSubcategory.getExample();
        OASAudienceSubcategory audienceSubcategory3 = new OASAudienceSubcategory();
        OASAudienceSubcategory audienceSubcategory4 = new OASAudienceSubcategory();

        System.assert(audienceSubcategory1.equals(audienceSubcategory2));
        System.assert(audienceSubcategory3.equals(audienceSubcategory4));
        System.assertEquals(audienceSubcategory1.hashCode(), audienceSubcategory2.hashCode());
        System.assertEquals(audienceSubcategory3.hashCode(), audienceSubcategory4.hashCode());
    }
}
