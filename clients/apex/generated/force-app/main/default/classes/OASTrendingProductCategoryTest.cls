@isTest
private class OASTrendingProductCategoryTest {
    @isTest
    private static void equalsSameInstance() {
        OASTrendingProductCategory trendingProductCategory1 = OASTrendingProductCategory.getExample();
        OASTrendingProductCategory trendingProductCategory2 = trendingProductCategory1;
        OASTrendingProductCategory trendingProductCategory3 = new OASTrendingProductCategory();
        OASTrendingProductCategory trendingProductCategory4 = trendingProductCategory3;

        System.assert(trendingProductCategory1.equals(trendingProductCategory2));
        System.assert(trendingProductCategory2.equals(trendingProductCategory1));
        System.assert(trendingProductCategory1.equals(trendingProductCategory1));
        System.assert(trendingProductCategory3.equals(trendingProductCategory4));
        System.assert(trendingProductCategory4.equals(trendingProductCategory3));
        System.assert(trendingProductCategory3.equals(trendingProductCategory3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTrendingProductCategory trendingProductCategory1 = OASTrendingProductCategory.getExample();
        OASTrendingProductCategory trendingProductCategory2 = OASTrendingProductCategory.getExample();
        OASTrendingProductCategory trendingProductCategory3 = new OASTrendingProductCategory();
        OASTrendingProductCategory trendingProductCategory4 = new OASTrendingProductCategory();

        System.assert(trendingProductCategory1.equals(trendingProductCategory2));
        System.assert(trendingProductCategory2.equals(trendingProductCategory1));
        System.assert(trendingProductCategory3.equals(trendingProductCategory4));
        System.assert(trendingProductCategory4.equals(trendingProductCategory3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTrendingProductCategory trendingProductCategory1 = OASTrendingProductCategory.getExample();
        OASTrendingProductCategory trendingProductCategory2 = new OASTrendingProductCategory();

        System.assertEquals(false, trendingProductCategory1.equals('foo'));
        System.assertEquals(false, trendingProductCategory2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTrendingProductCategory trendingProductCategory1 = OASTrendingProductCategory.getExample();
        OASTrendingProductCategory trendingProductCategory2 = new OASTrendingProductCategory();
        OASTrendingProductCategory trendingProductCategory3;

        System.assertEquals(false, trendingProductCategory1.equals(trendingProductCategory3));
        System.assertEquals(false, trendingProductCategory2.equals(trendingProductCategory3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTrendingProductCategory trendingProductCategory1 = OASTrendingProductCategory.getExample();
        OASTrendingProductCategory trendingProductCategory2 = new OASTrendingProductCategory();

        System.assertEquals(trendingProductCategory1.hashCode(), trendingProductCategory1.hashCode());
        System.assertEquals(trendingProductCategory2.hashCode(), trendingProductCategory2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTrendingProductCategory trendingProductCategory1 = OASTrendingProductCategory.getExample();
        OASTrendingProductCategory trendingProductCategory2 = OASTrendingProductCategory.getExample();
        OASTrendingProductCategory trendingProductCategory3 = new OASTrendingProductCategory();
        OASTrendingProductCategory trendingProductCategory4 = new OASTrendingProductCategory();

        System.assert(trendingProductCategory1.equals(trendingProductCategory2));
        System.assert(trendingProductCategory3.equals(trendingProductCategory4));
        System.assertEquals(trendingProductCategory1.hashCode(), trendingProductCategory2.hashCode());
        System.assertEquals(trendingProductCategory3.hashCode(), trendingProductCategory4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASTrendingProductCategory trendingProductCategory = new OASTrendingProductCategory();
        Map<String, String> x-property-mappings = trendingProductCategory.getx-property-mappings();
        System.assertEquals('engagementType', x-property-mappings.get('engagement_type'));
        System.assertEquals('pctChangeMom', x-property-mappings.get('pct_change_mom'));
        System.assertEquals('percentRelativeVolume', x-property-mappings.get('percent_relative_volume'));
        System.assertEquals('productCategory', x-property-mappings.get('product_category'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASTrendingProductCategory trendingProductCategory = new OASTrendingProductCategory();
        System.assertEquals(new List<OASVerticalProductCategory>(), trendingProductCategory.verticals);
        System.assertEquals(null, trendingProductCategory.engagementType);
        System.assertEquals(null, trendingProductCategory.pctChangeMom);
        System.assertEquals(null, trendingProductCategory.percentRelativeVolume);
        System.assertEquals(null, trendingProductCategory.productCategory);
    }
}
