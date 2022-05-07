@isTest
private class OASProductType1FilterTest {
    @isTest
    private static void equalsSameInstance() {
        OASProductType1Filter productType1Filter1 = OASProductType1Filter.getExample();
        OASProductType1Filter productType1Filter2 = productType1Filter1;
        OASProductType1Filter productType1Filter3 = new OASProductType1Filter();
        OASProductType1Filter productType1Filter4 = productType1Filter3;

        System.assert(productType1Filter1.equals(productType1Filter2));
        System.assert(productType1Filter2.equals(productType1Filter1));
        System.assert(productType1Filter1.equals(productType1Filter1));
        System.assert(productType1Filter3.equals(productType1Filter4));
        System.assert(productType1Filter4.equals(productType1Filter3));
        System.assert(productType1Filter3.equals(productType1Filter3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASProductType1Filter productType1Filter1 = OASProductType1Filter.getExample();
        OASProductType1Filter productType1Filter2 = OASProductType1Filter.getExample();
        OASProductType1Filter productType1Filter3 = new OASProductType1Filter();
        OASProductType1Filter productType1Filter4 = new OASProductType1Filter();

        System.assert(productType1Filter1.equals(productType1Filter2));
        System.assert(productType1Filter2.equals(productType1Filter1));
        System.assert(productType1Filter3.equals(productType1Filter4));
        System.assert(productType1Filter4.equals(productType1Filter3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASProductType1Filter productType1Filter1 = OASProductType1Filter.getExample();
        OASProductType1Filter productType1Filter2 = new OASProductType1Filter();

        System.assertEquals(false, productType1Filter1.equals('foo'));
        System.assertEquals(false, productType1Filter2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASProductType1Filter productType1Filter1 = OASProductType1Filter.getExample();
        OASProductType1Filter productType1Filter2 = new OASProductType1Filter();
        OASProductType1Filter productType1Filter3;

        System.assertEquals(false, productType1Filter1.equals(productType1Filter3));
        System.assertEquals(false, productType1Filter2.equals(productType1Filter3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASProductType1Filter productType1Filter1 = OASProductType1Filter.getExample();
        OASProductType1Filter productType1Filter2 = new OASProductType1Filter();

        System.assertEquals(productType1Filter1.hashCode(), productType1Filter1.hashCode());
        System.assertEquals(productType1Filter2.hashCode(), productType1Filter2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASProductType1Filter productType1Filter1 = OASProductType1Filter.getExample();
        OASProductType1Filter productType1Filter2 = OASProductType1Filter.getExample();
        OASProductType1Filter productType1Filter3 = new OASProductType1Filter();
        OASProductType1Filter productType1Filter4 = new OASProductType1Filter();

        System.assert(productType1Filter1.equals(productType1Filter2));
        System.assert(productType1Filter3.equals(productType1Filter4));
        System.assertEquals(productType1Filter1.hashCode(), productType1Filter2.hashCode());
        System.assertEquals(productType1Filter3.hashCode(), productType1Filter4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASProductType1Filter productType1Filter = new OASProductType1Filter();
        Map<String, String> x-property-mappings = productType1Filter.getx-property-mappings();
        System.assertEquals('prODUCTTYPE1', x-property-mappings.get('PRODUCT_TYPE_1'));
    }
}
