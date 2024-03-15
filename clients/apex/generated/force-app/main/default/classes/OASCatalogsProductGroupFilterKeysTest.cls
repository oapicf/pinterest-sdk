@isTest
private class OASCatalogsProductGroupFilterKeysTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsProductGroupFilterKeys catalogsProductGroupFilterKeys1 = OASCatalogsProductGroupFilterKeys.getExample();
        OASCatalogsProductGroupFilterKeys catalogsProductGroupFilterKeys2 = catalogsProductGroupFilterKeys1;
        OASCatalogsProductGroupFilterKeys catalogsProductGroupFilterKeys3 = new OASCatalogsProductGroupFilterKeys();
        OASCatalogsProductGroupFilterKeys catalogsProductGroupFilterKeys4 = catalogsProductGroupFilterKeys3;

        System.assert(catalogsProductGroupFilterKeys1.equals(catalogsProductGroupFilterKeys2));
        System.assert(catalogsProductGroupFilterKeys2.equals(catalogsProductGroupFilterKeys1));
        System.assert(catalogsProductGroupFilterKeys1.equals(catalogsProductGroupFilterKeys1));
        System.assert(catalogsProductGroupFilterKeys3.equals(catalogsProductGroupFilterKeys4));
        System.assert(catalogsProductGroupFilterKeys4.equals(catalogsProductGroupFilterKeys3));
        System.assert(catalogsProductGroupFilterKeys3.equals(catalogsProductGroupFilterKeys3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsProductGroupFilterKeys catalogsProductGroupFilterKeys1 = OASCatalogsProductGroupFilterKeys.getExample();
        OASCatalogsProductGroupFilterKeys catalogsProductGroupFilterKeys2 = OASCatalogsProductGroupFilterKeys.getExample();
        OASCatalogsProductGroupFilterKeys catalogsProductGroupFilterKeys3 = new OASCatalogsProductGroupFilterKeys();
        OASCatalogsProductGroupFilterKeys catalogsProductGroupFilterKeys4 = new OASCatalogsProductGroupFilterKeys();

        System.assert(catalogsProductGroupFilterKeys1.equals(catalogsProductGroupFilterKeys2));
        System.assert(catalogsProductGroupFilterKeys2.equals(catalogsProductGroupFilterKeys1));
        System.assert(catalogsProductGroupFilterKeys3.equals(catalogsProductGroupFilterKeys4));
        System.assert(catalogsProductGroupFilterKeys4.equals(catalogsProductGroupFilterKeys3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsProductGroupFilterKeys catalogsProductGroupFilterKeys1 = OASCatalogsProductGroupFilterKeys.getExample();
        OASCatalogsProductGroupFilterKeys catalogsProductGroupFilterKeys2 = new OASCatalogsProductGroupFilterKeys();

        System.assertEquals(false, catalogsProductGroupFilterKeys1.equals('foo'));
        System.assertEquals(false, catalogsProductGroupFilterKeys2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsProductGroupFilterKeys catalogsProductGroupFilterKeys1 = OASCatalogsProductGroupFilterKeys.getExample();
        OASCatalogsProductGroupFilterKeys catalogsProductGroupFilterKeys2 = new OASCatalogsProductGroupFilterKeys();
        OASCatalogsProductGroupFilterKeys catalogsProductGroupFilterKeys3;

        System.assertEquals(false, catalogsProductGroupFilterKeys1.equals(catalogsProductGroupFilterKeys3));
        System.assertEquals(false, catalogsProductGroupFilterKeys2.equals(catalogsProductGroupFilterKeys3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsProductGroupFilterKeys catalogsProductGroupFilterKeys1 = OASCatalogsProductGroupFilterKeys.getExample();
        OASCatalogsProductGroupFilterKeys catalogsProductGroupFilterKeys2 = new OASCatalogsProductGroupFilterKeys();

        System.assertEquals(catalogsProductGroupFilterKeys1.hashCode(), catalogsProductGroupFilterKeys1.hashCode());
        System.assertEquals(catalogsProductGroupFilterKeys2.hashCode(), catalogsProductGroupFilterKeys2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsProductGroupFilterKeys catalogsProductGroupFilterKeys1 = OASCatalogsProductGroupFilterKeys.getExample();
        OASCatalogsProductGroupFilterKeys catalogsProductGroupFilterKeys2 = OASCatalogsProductGroupFilterKeys.getExample();
        OASCatalogsProductGroupFilterKeys catalogsProductGroupFilterKeys3 = new OASCatalogsProductGroupFilterKeys();
        OASCatalogsProductGroupFilterKeys catalogsProductGroupFilterKeys4 = new OASCatalogsProductGroupFilterKeys();

        System.assert(catalogsProductGroupFilterKeys1.equals(catalogsProductGroupFilterKeys2));
        System.assert(catalogsProductGroupFilterKeys3.equals(catalogsProductGroupFilterKeys4));
        System.assertEquals(catalogsProductGroupFilterKeys1.hashCode(), catalogsProductGroupFilterKeys2.hashCode());
        System.assertEquals(catalogsProductGroupFilterKeys3.hashCode(), catalogsProductGroupFilterKeys4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsProductGroupFilterKeys catalogsProductGroupFilterKeys = new OASCatalogsProductGroupFilterKeys();
        Map<String, String> x-property-mappings = catalogsProductGroupFilterKeys.getx-property-mappings();
        System.assertEquals('r_CURRENCY', x-property-mappings.get('CURRENCY'));
        System.assertEquals('cuSTOMLABEL0', x-property-mappings.get('CUSTOM_LABEL_0'));
        System.assertEquals('cuSTOMLABEL1', x-property-mappings.get('CUSTOM_LABEL_1'));
        System.assertEquals('cuSTOMLABEL2', x-property-mappings.get('CUSTOM_LABEL_2'));
        System.assertEquals('cuSTOMLABEL3', x-property-mappings.get('CUSTOM_LABEL_3'));
        System.assertEquals('cuSTOMLABEL4', x-property-mappings.get('CUSTOM_LABEL_4'));
        System.assertEquals('prODUCTTYPE4', x-property-mappings.get('PRODUCT_TYPE_4'));
        System.assertEquals('prODUCTTYPE3', x-property-mappings.get('PRODUCT_TYPE_3'));
        System.assertEquals('prODUCTTYPE2', x-property-mappings.get('PRODUCT_TYPE_2'));
        System.assertEquals('prODUCTTYPE1', x-property-mappings.get('PRODUCT_TYPE_1'));
        System.assertEquals('prODUCTTYPE0', x-property-mappings.get('PRODUCT_TYPE_0'));
        System.assertEquals('goOGLEPRODUCTCATEGORY6', x-property-mappings.get('GOOGLE_PRODUCT_CATEGORY_6'));
        System.assertEquals('goOGLEPRODUCTCATEGORY5', x-property-mappings.get('GOOGLE_PRODUCT_CATEGORY_5'));
        System.assertEquals('goOGLEPRODUCTCATEGORY4', x-property-mappings.get('GOOGLE_PRODUCT_CATEGORY_4'));
        System.assertEquals('goOGLEPRODUCTCATEGORY3', x-property-mappings.get('GOOGLE_PRODUCT_CATEGORY_3'));
        System.assertEquals('goOGLEPRODUCTCATEGORY2', x-property-mappings.get('GOOGLE_PRODUCT_CATEGORY_2'));
        System.assertEquals('goOGLEPRODUCTCATEGORY1', x-property-mappings.get('GOOGLE_PRODUCT_CATEGORY_1'));
        System.assertEquals('goOGLEPRODUCTCATEGORY0', x-property-mappings.get('GOOGLE_PRODUCT_CATEGORY_0'));
    }
}
