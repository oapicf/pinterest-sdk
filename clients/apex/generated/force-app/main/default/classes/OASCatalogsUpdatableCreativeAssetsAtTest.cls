@isTest
private class OASCatalogsUpdatableCreativeAssetsAtTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsUpdatableCreativeAssetsAt catalogsUpdatableCreativeAssetsAttributes1 = OASCatalogsUpdatableCreativeAssetsAt.getExample();
        OASCatalogsUpdatableCreativeAssetsAt catalogsUpdatableCreativeAssetsAttributes2 = catalogsUpdatableCreativeAssetsAttributes1;
        OASCatalogsUpdatableCreativeAssetsAt catalogsUpdatableCreativeAssetsAttributes3 = new OASCatalogsUpdatableCreativeAssetsAt();
        OASCatalogsUpdatableCreativeAssetsAt catalogsUpdatableCreativeAssetsAttributes4 = catalogsUpdatableCreativeAssetsAttributes3;

        System.assert(catalogsUpdatableCreativeAssetsAttributes1.equals(catalogsUpdatableCreativeAssetsAttributes2));
        System.assert(catalogsUpdatableCreativeAssetsAttributes2.equals(catalogsUpdatableCreativeAssetsAttributes1));
        System.assert(catalogsUpdatableCreativeAssetsAttributes1.equals(catalogsUpdatableCreativeAssetsAttributes1));
        System.assert(catalogsUpdatableCreativeAssetsAttributes3.equals(catalogsUpdatableCreativeAssetsAttributes4));
        System.assert(catalogsUpdatableCreativeAssetsAttributes4.equals(catalogsUpdatableCreativeAssetsAttributes3));
        System.assert(catalogsUpdatableCreativeAssetsAttributes3.equals(catalogsUpdatableCreativeAssetsAttributes3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsUpdatableCreativeAssetsAt catalogsUpdatableCreativeAssetsAttributes1 = OASCatalogsUpdatableCreativeAssetsAt.getExample();
        OASCatalogsUpdatableCreativeAssetsAt catalogsUpdatableCreativeAssetsAttributes2 = OASCatalogsUpdatableCreativeAssetsAt.getExample();
        OASCatalogsUpdatableCreativeAssetsAt catalogsUpdatableCreativeAssetsAttributes3 = new OASCatalogsUpdatableCreativeAssetsAt();
        OASCatalogsUpdatableCreativeAssetsAt catalogsUpdatableCreativeAssetsAttributes4 = new OASCatalogsUpdatableCreativeAssetsAt();

        System.assert(catalogsUpdatableCreativeAssetsAttributes1.equals(catalogsUpdatableCreativeAssetsAttributes2));
        System.assert(catalogsUpdatableCreativeAssetsAttributes2.equals(catalogsUpdatableCreativeAssetsAttributes1));
        System.assert(catalogsUpdatableCreativeAssetsAttributes3.equals(catalogsUpdatableCreativeAssetsAttributes4));
        System.assert(catalogsUpdatableCreativeAssetsAttributes4.equals(catalogsUpdatableCreativeAssetsAttributes3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsUpdatableCreativeAssetsAt catalogsUpdatableCreativeAssetsAttributes1 = OASCatalogsUpdatableCreativeAssetsAt.getExample();
        OASCatalogsUpdatableCreativeAssetsAt catalogsUpdatableCreativeAssetsAttributes2 = new OASCatalogsUpdatableCreativeAssetsAt();

        System.assertEquals(false, catalogsUpdatableCreativeAssetsAttributes1.equals('foo'));
        System.assertEquals(false, catalogsUpdatableCreativeAssetsAttributes2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsUpdatableCreativeAssetsAt catalogsUpdatableCreativeAssetsAttributes1 = OASCatalogsUpdatableCreativeAssetsAt.getExample();
        OASCatalogsUpdatableCreativeAssetsAt catalogsUpdatableCreativeAssetsAttributes2 = new OASCatalogsUpdatableCreativeAssetsAt();
        OASCatalogsUpdatableCreativeAssetsAt catalogsUpdatableCreativeAssetsAttributes3;

        System.assertEquals(false, catalogsUpdatableCreativeAssetsAttributes1.equals(catalogsUpdatableCreativeAssetsAttributes3));
        System.assertEquals(false, catalogsUpdatableCreativeAssetsAttributes2.equals(catalogsUpdatableCreativeAssetsAttributes3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsUpdatableCreativeAssetsAt catalogsUpdatableCreativeAssetsAttributes1 = OASCatalogsUpdatableCreativeAssetsAt.getExample();
        OASCatalogsUpdatableCreativeAssetsAt catalogsUpdatableCreativeAssetsAttributes2 = new OASCatalogsUpdatableCreativeAssetsAt();

        System.assertEquals(catalogsUpdatableCreativeAssetsAttributes1.hashCode(), catalogsUpdatableCreativeAssetsAttributes1.hashCode());
        System.assertEquals(catalogsUpdatableCreativeAssetsAttributes2.hashCode(), catalogsUpdatableCreativeAssetsAttributes2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsUpdatableCreativeAssetsAt catalogsUpdatableCreativeAssetsAttributes1 = OASCatalogsUpdatableCreativeAssetsAt.getExample();
        OASCatalogsUpdatableCreativeAssetsAt catalogsUpdatableCreativeAssetsAttributes2 = OASCatalogsUpdatableCreativeAssetsAt.getExample();
        OASCatalogsUpdatableCreativeAssetsAt catalogsUpdatableCreativeAssetsAttributes3 = new OASCatalogsUpdatableCreativeAssetsAt();
        OASCatalogsUpdatableCreativeAssetsAt catalogsUpdatableCreativeAssetsAttributes4 = new OASCatalogsUpdatableCreativeAssetsAt();

        System.assert(catalogsUpdatableCreativeAssetsAttributes1.equals(catalogsUpdatableCreativeAssetsAttributes2));
        System.assert(catalogsUpdatableCreativeAssetsAttributes3.equals(catalogsUpdatableCreativeAssetsAttributes4));
        System.assertEquals(catalogsUpdatableCreativeAssetsAttributes1.hashCode(), catalogsUpdatableCreativeAssetsAttributes2.hashCode());
        System.assertEquals(catalogsUpdatableCreativeAssetsAttributes3.hashCode(), catalogsUpdatableCreativeAssetsAttributes4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsUpdatableCreativeAssetsAt catalogsUpdatableCreativeAssetsAttributes = new OASCatalogsUpdatableCreativeAssetsAt();
        Map<String, String> x-property-mappings = catalogsUpdatableCreativeAssetsAttributes.getx-property-mappings();
        System.assertEquals('iosDeepLink', x-property-mappings.get('ios_deep_link'));
        System.assertEquals('androidDeepLink', x-property-mappings.get('android_deep_link'));
        System.assertEquals('googleProductCategory', x-property-mappings.get('google_product_category'));
        System.assertEquals('customLabel0', x-property-mappings.get('custom_label_0'));
        System.assertEquals('customLabel1', x-property-mappings.get('custom_label_1'));
        System.assertEquals('customLabel2', x-property-mappings.get('custom_label_2'));
        System.assertEquals('customLabel3', x-property-mappings.get('custom_label_3'));
        System.assertEquals('customLabel4', x-property-mappings.get('custom_label_4'));
    }
}
