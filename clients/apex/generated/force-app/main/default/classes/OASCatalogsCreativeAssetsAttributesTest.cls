@isTest
private class OASCatalogsCreativeAssetsAttributesTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsCreativeAssetsAttributes catalogsCreativeAssetsAttributes1 = OASCatalogsCreativeAssetsAttributes.getExample();
        OASCatalogsCreativeAssetsAttributes catalogsCreativeAssetsAttributes2 = catalogsCreativeAssetsAttributes1;
        OASCatalogsCreativeAssetsAttributes catalogsCreativeAssetsAttributes3 = new OASCatalogsCreativeAssetsAttributes();
        OASCatalogsCreativeAssetsAttributes catalogsCreativeAssetsAttributes4 = catalogsCreativeAssetsAttributes3;

        System.assert(catalogsCreativeAssetsAttributes1.equals(catalogsCreativeAssetsAttributes2));
        System.assert(catalogsCreativeAssetsAttributes2.equals(catalogsCreativeAssetsAttributes1));
        System.assert(catalogsCreativeAssetsAttributes1.equals(catalogsCreativeAssetsAttributes1));
        System.assert(catalogsCreativeAssetsAttributes3.equals(catalogsCreativeAssetsAttributes4));
        System.assert(catalogsCreativeAssetsAttributes4.equals(catalogsCreativeAssetsAttributes3));
        System.assert(catalogsCreativeAssetsAttributes3.equals(catalogsCreativeAssetsAttributes3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsCreativeAssetsAttributes catalogsCreativeAssetsAttributes1 = OASCatalogsCreativeAssetsAttributes.getExample();
        OASCatalogsCreativeAssetsAttributes catalogsCreativeAssetsAttributes2 = OASCatalogsCreativeAssetsAttributes.getExample();
        OASCatalogsCreativeAssetsAttributes catalogsCreativeAssetsAttributes3 = new OASCatalogsCreativeAssetsAttributes();
        OASCatalogsCreativeAssetsAttributes catalogsCreativeAssetsAttributes4 = new OASCatalogsCreativeAssetsAttributes();

        System.assert(catalogsCreativeAssetsAttributes1.equals(catalogsCreativeAssetsAttributes2));
        System.assert(catalogsCreativeAssetsAttributes2.equals(catalogsCreativeAssetsAttributes1));
        System.assert(catalogsCreativeAssetsAttributes3.equals(catalogsCreativeAssetsAttributes4));
        System.assert(catalogsCreativeAssetsAttributes4.equals(catalogsCreativeAssetsAttributes3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsCreativeAssetsAttributes catalogsCreativeAssetsAttributes1 = OASCatalogsCreativeAssetsAttributes.getExample();
        OASCatalogsCreativeAssetsAttributes catalogsCreativeAssetsAttributes2 = new OASCatalogsCreativeAssetsAttributes();

        System.assertEquals(false, catalogsCreativeAssetsAttributes1.equals('foo'));
        System.assertEquals(false, catalogsCreativeAssetsAttributes2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsCreativeAssetsAttributes catalogsCreativeAssetsAttributes1 = OASCatalogsCreativeAssetsAttributes.getExample();
        OASCatalogsCreativeAssetsAttributes catalogsCreativeAssetsAttributes2 = new OASCatalogsCreativeAssetsAttributes();
        OASCatalogsCreativeAssetsAttributes catalogsCreativeAssetsAttributes3;

        System.assertEquals(false, catalogsCreativeAssetsAttributes1.equals(catalogsCreativeAssetsAttributes3));
        System.assertEquals(false, catalogsCreativeAssetsAttributes2.equals(catalogsCreativeAssetsAttributes3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsCreativeAssetsAttributes catalogsCreativeAssetsAttributes1 = OASCatalogsCreativeAssetsAttributes.getExample();
        OASCatalogsCreativeAssetsAttributes catalogsCreativeAssetsAttributes2 = new OASCatalogsCreativeAssetsAttributes();

        System.assertEquals(catalogsCreativeAssetsAttributes1.hashCode(), catalogsCreativeAssetsAttributes1.hashCode());
        System.assertEquals(catalogsCreativeAssetsAttributes2.hashCode(), catalogsCreativeAssetsAttributes2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsCreativeAssetsAttributes catalogsCreativeAssetsAttributes1 = OASCatalogsCreativeAssetsAttributes.getExample();
        OASCatalogsCreativeAssetsAttributes catalogsCreativeAssetsAttributes2 = OASCatalogsCreativeAssetsAttributes.getExample();
        OASCatalogsCreativeAssetsAttributes catalogsCreativeAssetsAttributes3 = new OASCatalogsCreativeAssetsAttributes();
        OASCatalogsCreativeAssetsAttributes catalogsCreativeAssetsAttributes4 = new OASCatalogsCreativeAssetsAttributes();

        System.assert(catalogsCreativeAssetsAttributes1.equals(catalogsCreativeAssetsAttributes2));
        System.assert(catalogsCreativeAssetsAttributes3.equals(catalogsCreativeAssetsAttributes4));
        System.assertEquals(catalogsCreativeAssetsAttributes1.hashCode(), catalogsCreativeAssetsAttributes2.hashCode());
        System.assertEquals(catalogsCreativeAssetsAttributes3.hashCode(), catalogsCreativeAssetsAttributes4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsCreativeAssetsAttributes catalogsCreativeAssetsAttributes = new OASCatalogsCreativeAssetsAttributes();
        Map<String, String> x-property-mappings = catalogsCreativeAssetsAttributes.getx-property-mappings();
        System.assertEquals('iosDeepLink', x-property-mappings.get('ios_deep_link'));
        System.assertEquals('androidDeepLink', x-property-mappings.get('android_deep_link'));
        System.assertEquals('googleProductCategory', x-property-mappings.get('google_product_category'));
        System.assertEquals('customLabel0', x-property-mappings.get('custom_label_0'));
        System.assertEquals('customLabel1', x-property-mappings.get('custom_label_1'));
        System.assertEquals('customLabel2', x-property-mappings.get('custom_label_2'));
        System.assertEquals('customLabel3', x-property-mappings.get('custom_label_3'));
        System.assertEquals('customLabel4', x-property-mappings.get('custom_label_4'));
        System.assertEquals('imageLink', x-property-mappings.get('image_link'));
        System.assertEquals('videoLink', x-property-mappings.get('video_link'));
    }
}
