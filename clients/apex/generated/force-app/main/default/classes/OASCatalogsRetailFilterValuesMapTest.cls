@isTest
private class OASCatalogsRetailFilterValuesMapTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsRetailFilterValuesMap catalogsRetailFilterValuesMap1 = OASCatalogsRetailFilterValuesMap.getExample();
        OASCatalogsRetailFilterValuesMap catalogsRetailFilterValuesMap2 = catalogsRetailFilterValuesMap1;
        OASCatalogsRetailFilterValuesMap catalogsRetailFilterValuesMap3 = new OASCatalogsRetailFilterValuesMap();
        OASCatalogsRetailFilterValuesMap catalogsRetailFilterValuesMap4 = catalogsRetailFilterValuesMap3;

        System.assert(catalogsRetailFilterValuesMap1.equals(catalogsRetailFilterValuesMap2));
        System.assert(catalogsRetailFilterValuesMap2.equals(catalogsRetailFilterValuesMap1));
        System.assert(catalogsRetailFilterValuesMap1.equals(catalogsRetailFilterValuesMap1));
        System.assert(catalogsRetailFilterValuesMap3.equals(catalogsRetailFilterValuesMap4));
        System.assert(catalogsRetailFilterValuesMap4.equals(catalogsRetailFilterValuesMap3));
        System.assert(catalogsRetailFilterValuesMap3.equals(catalogsRetailFilterValuesMap3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsRetailFilterValuesMap catalogsRetailFilterValuesMap1 = OASCatalogsRetailFilterValuesMap.getExample();
        OASCatalogsRetailFilterValuesMap catalogsRetailFilterValuesMap2 = OASCatalogsRetailFilterValuesMap.getExample();
        OASCatalogsRetailFilterValuesMap catalogsRetailFilterValuesMap3 = new OASCatalogsRetailFilterValuesMap();
        OASCatalogsRetailFilterValuesMap catalogsRetailFilterValuesMap4 = new OASCatalogsRetailFilterValuesMap();

        System.assert(catalogsRetailFilterValuesMap1.equals(catalogsRetailFilterValuesMap2));
        System.assert(catalogsRetailFilterValuesMap2.equals(catalogsRetailFilterValuesMap1));
        System.assert(catalogsRetailFilterValuesMap3.equals(catalogsRetailFilterValuesMap4));
        System.assert(catalogsRetailFilterValuesMap4.equals(catalogsRetailFilterValuesMap3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsRetailFilterValuesMap catalogsRetailFilterValuesMap1 = OASCatalogsRetailFilterValuesMap.getExample();
        OASCatalogsRetailFilterValuesMap catalogsRetailFilterValuesMap2 = new OASCatalogsRetailFilterValuesMap();

        System.assertEquals(false, catalogsRetailFilterValuesMap1.equals('foo'));
        System.assertEquals(false, catalogsRetailFilterValuesMap2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsRetailFilterValuesMap catalogsRetailFilterValuesMap1 = OASCatalogsRetailFilterValuesMap.getExample();
        OASCatalogsRetailFilterValuesMap catalogsRetailFilterValuesMap2 = new OASCatalogsRetailFilterValuesMap();
        OASCatalogsRetailFilterValuesMap catalogsRetailFilterValuesMap3;

        System.assertEquals(false, catalogsRetailFilterValuesMap1.equals(catalogsRetailFilterValuesMap3));
        System.assertEquals(false, catalogsRetailFilterValuesMap2.equals(catalogsRetailFilterValuesMap3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsRetailFilterValuesMap catalogsRetailFilterValuesMap1 = OASCatalogsRetailFilterValuesMap.getExample();
        OASCatalogsRetailFilterValuesMap catalogsRetailFilterValuesMap2 = new OASCatalogsRetailFilterValuesMap();

        System.assertEquals(catalogsRetailFilterValuesMap1.hashCode(), catalogsRetailFilterValuesMap1.hashCode());
        System.assertEquals(catalogsRetailFilterValuesMap2.hashCode(), catalogsRetailFilterValuesMap2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsRetailFilterValuesMap catalogsRetailFilterValuesMap1 = OASCatalogsRetailFilterValuesMap.getExample();
        OASCatalogsRetailFilterValuesMap catalogsRetailFilterValuesMap2 = OASCatalogsRetailFilterValuesMap.getExample();
        OASCatalogsRetailFilterValuesMap catalogsRetailFilterValuesMap3 = new OASCatalogsRetailFilterValuesMap();
        OASCatalogsRetailFilterValuesMap catalogsRetailFilterValuesMap4 = new OASCatalogsRetailFilterValuesMap();

        System.assert(catalogsRetailFilterValuesMap1.equals(catalogsRetailFilterValuesMap2));
        System.assert(catalogsRetailFilterValuesMap3.equals(catalogsRetailFilterValuesMap4));
        System.assertEquals(catalogsRetailFilterValuesMap1.hashCode(), catalogsRetailFilterValuesMap2.hashCode());
        System.assertEquals(catalogsRetailFilterValuesMap3.hashCode(), catalogsRetailFilterValuesMap4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsRetailFilterValuesMap catalogsRetailFilterValuesMap = new OASCatalogsRetailFilterValuesMap();
        Map<String, String> x-property-mappings = catalogsRetailFilterValuesMap.getx-property-mappings();
        System.assertEquals('adImageTags', x-property-mappings.get('ad_image_tags'));
        System.assertEquals('adVideoTags', x-property-mappings.get('ad_video_tags'));
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
        System.assertEquals('productType0', x-property-mappings.get('product_type_0'));
        System.assertEquals('productType1', x-property-mappings.get('product_type_1'));
        System.assertEquals('productType2', x-property-mappings.get('product_type_2'));
        System.assertEquals('productType3', x-property-mappings.get('product_type_3'));
        System.assertEquals('productType4', x-property-mappings.get('product_type_4'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCatalogsRetailFilterValuesMap catalogsRetailFilterValuesMap = new OASCatalogsRetailFilterValuesMap();
        System.assertEquals(new List<String>(), catalogsRetailFilterValuesMap.adImageTags);
        System.assertEquals(new List<String>(), catalogsRetailFilterValuesMap.adVideoTags);
        System.assertEquals(new List<String>(), catalogsRetailFilterValuesMap.availability);
        System.assertEquals(new List<String>(), catalogsRetailFilterValuesMap.brand);
        System.assertEquals(new List<String>(), catalogsRetailFilterValuesMap.condition);
        System.assertEquals(new List<String>(), catalogsRetailFilterValuesMap.customLabel0);
        System.assertEquals(new List<String>(), catalogsRetailFilterValuesMap.customLabel1);
        System.assertEquals(new List<String>(), catalogsRetailFilterValuesMap.customLabel2);
        System.assertEquals(new List<String>(), catalogsRetailFilterValuesMap.customLabel3);
        System.assertEquals(new List<String>(), catalogsRetailFilterValuesMap.customLabel4);
        System.assertEquals(new List<String>(), catalogsRetailFilterValuesMap.gender);
        System.assertEquals(new List<String>(), catalogsRetailFilterValuesMap.googleProductCategory0);
        System.assertEquals(new List<String>(), catalogsRetailFilterValuesMap.googleProductCategory1);
        System.assertEquals(new List<String>(), catalogsRetailFilterValuesMap.googleProductCategory2);
        System.assertEquals(new List<String>(), catalogsRetailFilterValuesMap.googleProductCategory3);
        System.assertEquals(new List<String>(), catalogsRetailFilterValuesMap.googleProductCategory4);
        System.assertEquals(new List<String>(), catalogsRetailFilterValuesMap.googleProductCategory5);
        System.assertEquals(new List<String>(), catalogsRetailFilterValuesMap.googleProductCategory6);
        System.assertEquals(new List<String>(), catalogsRetailFilterValuesMap.mediaType);
        System.assertEquals(new List<String>(), catalogsRetailFilterValuesMap.productType0);
        System.assertEquals(new List<String>(), catalogsRetailFilterValuesMap.productType1);
        System.assertEquals(new List<String>(), catalogsRetailFilterValuesMap.productType2);
        System.assertEquals(new List<String>(), catalogsRetailFilterValuesMap.productType3);
        System.assertEquals(new List<String>(), catalogsRetailFilterValuesMap.productType4);
    }
}
