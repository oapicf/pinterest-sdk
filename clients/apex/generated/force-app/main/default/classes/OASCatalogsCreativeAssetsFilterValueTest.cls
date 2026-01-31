@isTest
private class OASCatalogsCreativeAssetsFilterValueTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsCreativeAssetsFilterValue catalogsCreativeAssetsFilterValuesMap1 = OASCatalogsCreativeAssetsFilterValue.getExample();
        OASCatalogsCreativeAssetsFilterValue catalogsCreativeAssetsFilterValuesMap2 = catalogsCreativeAssetsFilterValuesMap1;
        OASCatalogsCreativeAssetsFilterValue catalogsCreativeAssetsFilterValuesMap3 = new OASCatalogsCreativeAssetsFilterValue();
        OASCatalogsCreativeAssetsFilterValue catalogsCreativeAssetsFilterValuesMap4 = catalogsCreativeAssetsFilterValuesMap3;

        System.assert(catalogsCreativeAssetsFilterValuesMap1.equals(catalogsCreativeAssetsFilterValuesMap2));
        System.assert(catalogsCreativeAssetsFilterValuesMap2.equals(catalogsCreativeAssetsFilterValuesMap1));
        System.assert(catalogsCreativeAssetsFilterValuesMap1.equals(catalogsCreativeAssetsFilterValuesMap1));
        System.assert(catalogsCreativeAssetsFilterValuesMap3.equals(catalogsCreativeAssetsFilterValuesMap4));
        System.assert(catalogsCreativeAssetsFilterValuesMap4.equals(catalogsCreativeAssetsFilterValuesMap3));
        System.assert(catalogsCreativeAssetsFilterValuesMap3.equals(catalogsCreativeAssetsFilterValuesMap3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsCreativeAssetsFilterValue catalogsCreativeAssetsFilterValuesMap1 = OASCatalogsCreativeAssetsFilterValue.getExample();
        OASCatalogsCreativeAssetsFilterValue catalogsCreativeAssetsFilterValuesMap2 = OASCatalogsCreativeAssetsFilterValue.getExample();
        OASCatalogsCreativeAssetsFilterValue catalogsCreativeAssetsFilterValuesMap3 = new OASCatalogsCreativeAssetsFilterValue();
        OASCatalogsCreativeAssetsFilterValue catalogsCreativeAssetsFilterValuesMap4 = new OASCatalogsCreativeAssetsFilterValue();

        System.assert(catalogsCreativeAssetsFilterValuesMap1.equals(catalogsCreativeAssetsFilterValuesMap2));
        System.assert(catalogsCreativeAssetsFilterValuesMap2.equals(catalogsCreativeAssetsFilterValuesMap1));
        System.assert(catalogsCreativeAssetsFilterValuesMap3.equals(catalogsCreativeAssetsFilterValuesMap4));
        System.assert(catalogsCreativeAssetsFilterValuesMap4.equals(catalogsCreativeAssetsFilterValuesMap3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsCreativeAssetsFilterValue catalogsCreativeAssetsFilterValuesMap1 = OASCatalogsCreativeAssetsFilterValue.getExample();
        OASCatalogsCreativeAssetsFilterValue catalogsCreativeAssetsFilterValuesMap2 = new OASCatalogsCreativeAssetsFilterValue();

        System.assertEquals(false, catalogsCreativeAssetsFilterValuesMap1.equals('foo'));
        System.assertEquals(false, catalogsCreativeAssetsFilterValuesMap2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsCreativeAssetsFilterValue catalogsCreativeAssetsFilterValuesMap1 = OASCatalogsCreativeAssetsFilterValue.getExample();
        OASCatalogsCreativeAssetsFilterValue catalogsCreativeAssetsFilterValuesMap2 = new OASCatalogsCreativeAssetsFilterValue();
        OASCatalogsCreativeAssetsFilterValue catalogsCreativeAssetsFilterValuesMap3;

        System.assertEquals(false, catalogsCreativeAssetsFilterValuesMap1.equals(catalogsCreativeAssetsFilterValuesMap3));
        System.assertEquals(false, catalogsCreativeAssetsFilterValuesMap2.equals(catalogsCreativeAssetsFilterValuesMap3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsCreativeAssetsFilterValue catalogsCreativeAssetsFilterValuesMap1 = OASCatalogsCreativeAssetsFilterValue.getExample();
        OASCatalogsCreativeAssetsFilterValue catalogsCreativeAssetsFilterValuesMap2 = new OASCatalogsCreativeAssetsFilterValue();

        System.assertEquals(catalogsCreativeAssetsFilterValuesMap1.hashCode(), catalogsCreativeAssetsFilterValuesMap1.hashCode());
        System.assertEquals(catalogsCreativeAssetsFilterValuesMap2.hashCode(), catalogsCreativeAssetsFilterValuesMap2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsCreativeAssetsFilterValue catalogsCreativeAssetsFilterValuesMap1 = OASCatalogsCreativeAssetsFilterValue.getExample();
        OASCatalogsCreativeAssetsFilterValue catalogsCreativeAssetsFilterValuesMap2 = OASCatalogsCreativeAssetsFilterValue.getExample();
        OASCatalogsCreativeAssetsFilterValue catalogsCreativeAssetsFilterValuesMap3 = new OASCatalogsCreativeAssetsFilterValue();
        OASCatalogsCreativeAssetsFilterValue catalogsCreativeAssetsFilterValuesMap4 = new OASCatalogsCreativeAssetsFilterValue();

        System.assert(catalogsCreativeAssetsFilterValuesMap1.equals(catalogsCreativeAssetsFilterValuesMap2));
        System.assert(catalogsCreativeAssetsFilterValuesMap3.equals(catalogsCreativeAssetsFilterValuesMap4));
        System.assertEquals(catalogsCreativeAssetsFilterValuesMap1.hashCode(), catalogsCreativeAssetsFilterValuesMap2.hashCode());
        System.assertEquals(catalogsCreativeAssetsFilterValuesMap3.hashCode(), catalogsCreativeAssetsFilterValuesMap4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsCreativeAssetsFilterValue catalogsCreativeAssetsFilterValuesMap = new OASCatalogsCreativeAssetsFilterValue();
        Map<String, String> x-property-mappings = catalogsCreativeAssetsFilterValuesMap.getx-property-mappings();
        System.assertEquals('customLabel0', x-property-mappings.get('custom_label_0'));
        System.assertEquals('customLabel1', x-property-mappings.get('custom_label_1'));
        System.assertEquals('customLabel2', x-property-mappings.get('custom_label_2'));
        System.assertEquals('customLabel3', x-property-mappings.get('custom_label_3'));
        System.assertEquals('customLabel4', x-property-mappings.get('custom_label_4'));
        System.assertEquals('googleProductCategory0', x-property-mappings.get('google_product_category_0'));
        System.assertEquals('googleProductCategory1', x-property-mappings.get('google_product_category_1'));
        System.assertEquals('googleProductCategory2', x-property-mappings.get('google_product_category_2'));
        System.assertEquals('googleProductCategory3', x-property-mappings.get('google_product_category_3'));
        System.assertEquals('googleProductCategory4', x-property-mappings.get('google_product_category_4'));
        System.assertEquals('googleProductCategory5', x-property-mappings.get('google_product_category_5'));
        System.assertEquals('googleProductCategory6', x-property-mappings.get('google_product_category_6'));
        System.assertEquals('mediaType', x-property-mappings.get('media_type'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCatalogsCreativeAssetsFilterValue catalogsCreativeAssetsFilterValuesMap = new OASCatalogsCreativeAssetsFilterValue();
        System.assertEquals(new List<String>(), catalogsCreativeAssetsFilterValuesMap.customLabel0);
        System.assertEquals(new List<String>(), catalogsCreativeAssetsFilterValuesMap.customLabel1);
        System.assertEquals(new List<String>(), catalogsCreativeAssetsFilterValuesMap.customLabel2);
        System.assertEquals(new List<String>(), catalogsCreativeAssetsFilterValuesMap.customLabel3);
        System.assertEquals(new List<String>(), catalogsCreativeAssetsFilterValuesMap.customLabel4);
        System.assertEquals(new List<String>(), catalogsCreativeAssetsFilterValuesMap.googleProductCategory0);
        System.assertEquals(new List<String>(), catalogsCreativeAssetsFilterValuesMap.googleProductCategory1);
        System.assertEquals(new List<String>(), catalogsCreativeAssetsFilterValuesMap.googleProductCategory2);
        System.assertEquals(new List<String>(), catalogsCreativeAssetsFilterValuesMap.googleProductCategory3);
        System.assertEquals(new List<String>(), catalogsCreativeAssetsFilterValuesMap.googleProductCategory4);
        System.assertEquals(new List<String>(), catalogsCreativeAssetsFilterValuesMap.googleProductCategory5);
        System.assertEquals(new List<String>(), catalogsCreativeAssetsFilterValuesMap.googleProductCategory6);
        System.assertEquals(new List<String>(), catalogsCreativeAssetsFilterValuesMap.mediaType);
    }
}
