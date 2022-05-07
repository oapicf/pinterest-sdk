@isTest
private class OASProductType2FilterTest {
    @isTest
    private static void equalsSameInstance() {
        OASProductType2Filter productType2Filter1 = OASProductType2Filter.getExample();
        OASProductType2Filter productType2Filter2 = productType2Filter1;
        OASProductType2Filter productType2Filter3 = new OASProductType2Filter();
        OASProductType2Filter productType2Filter4 = productType2Filter3;

        System.assert(productType2Filter1.equals(productType2Filter2));
        System.assert(productType2Filter2.equals(productType2Filter1));
        System.assert(productType2Filter1.equals(productType2Filter1));
        System.assert(productType2Filter3.equals(productType2Filter4));
        System.assert(productType2Filter4.equals(productType2Filter3));
        System.assert(productType2Filter3.equals(productType2Filter3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASProductType2Filter productType2Filter1 = OASProductType2Filter.getExample();
        OASProductType2Filter productType2Filter2 = OASProductType2Filter.getExample();
        OASProductType2Filter productType2Filter3 = new OASProductType2Filter();
        OASProductType2Filter productType2Filter4 = new OASProductType2Filter();

        System.assert(productType2Filter1.equals(productType2Filter2));
        System.assert(productType2Filter2.equals(productType2Filter1));
        System.assert(productType2Filter3.equals(productType2Filter4));
        System.assert(productType2Filter4.equals(productType2Filter3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASProductType2Filter productType2Filter1 = OASProductType2Filter.getExample();
        OASProductType2Filter productType2Filter2 = new OASProductType2Filter();

        System.assertEquals(false, productType2Filter1.equals('foo'));
        System.assertEquals(false, productType2Filter2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASProductType2Filter productType2Filter1 = OASProductType2Filter.getExample();
        OASProductType2Filter productType2Filter2 = new OASProductType2Filter();
        OASProductType2Filter productType2Filter3;

        System.assertEquals(false, productType2Filter1.equals(productType2Filter3));
        System.assertEquals(false, productType2Filter2.equals(productType2Filter3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASProductType2Filter productType2Filter1 = OASProductType2Filter.getExample();
        OASProductType2Filter productType2Filter2 = new OASProductType2Filter();

        System.assertEquals(productType2Filter1.hashCode(), productType2Filter1.hashCode());
        System.assertEquals(productType2Filter2.hashCode(), productType2Filter2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASProductType2Filter productType2Filter1 = OASProductType2Filter.getExample();
        OASProductType2Filter productType2Filter2 = OASProductType2Filter.getExample();
        OASProductType2Filter productType2Filter3 = new OASProductType2Filter();
        OASProductType2Filter productType2Filter4 = new OASProductType2Filter();

        System.assert(productType2Filter1.equals(productType2Filter2));
        System.assert(productType2Filter3.equals(productType2Filter4));
        System.assertEquals(productType2Filter1.hashCode(), productType2Filter2.hashCode());
        System.assertEquals(productType2Filter3.hashCode(), productType2Filter4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASProductType2Filter productType2Filter = new OASProductType2Filter();
        Map<String, String> x-property-mappings = productType2Filter.getx-property-mappings();
        System.assertEquals('prODUCTTYPE2', x-property-mappings.get('PRODUCT_TYPE_2'));
    }
}
