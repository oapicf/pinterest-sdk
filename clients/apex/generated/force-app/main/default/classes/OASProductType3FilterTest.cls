@isTest
private class OASProductType3FilterTest {
    @isTest
    private static void equalsSameInstance() {
        OASProductType3Filter productType3Filter1 = OASProductType3Filter.getExample();
        OASProductType3Filter productType3Filter2 = productType3Filter1;
        OASProductType3Filter productType3Filter3 = new OASProductType3Filter();
        OASProductType3Filter productType3Filter4 = productType3Filter3;

        System.assert(productType3Filter1.equals(productType3Filter2));
        System.assert(productType3Filter2.equals(productType3Filter1));
        System.assert(productType3Filter1.equals(productType3Filter1));
        System.assert(productType3Filter3.equals(productType3Filter4));
        System.assert(productType3Filter4.equals(productType3Filter3));
        System.assert(productType3Filter3.equals(productType3Filter3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASProductType3Filter productType3Filter1 = OASProductType3Filter.getExample();
        OASProductType3Filter productType3Filter2 = OASProductType3Filter.getExample();
        OASProductType3Filter productType3Filter3 = new OASProductType3Filter();
        OASProductType3Filter productType3Filter4 = new OASProductType3Filter();

        System.assert(productType3Filter1.equals(productType3Filter2));
        System.assert(productType3Filter2.equals(productType3Filter1));
        System.assert(productType3Filter3.equals(productType3Filter4));
        System.assert(productType3Filter4.equals(productType3Filter3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASProductType3Filter productType3Filter1 = OASProductType3Filter.getExample();
        OASProductType3Filter productType3Filter2 = new OASProductType3Filter();

        System.assertEquals(false, productType3Filter1.equals('foo'));
        System.assertEquals(false, productType3Filter2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASProductType3Filter productType3Filter1 = OASProductType3Filter.getExample();
        OASProductType3Filter productType3Filter2 = new OASProductType3Filter();
        OASProductType3Filter productType3Filter3;

        System.assertEquals(false, productType3Filter1.equals(productType3Filter3));
        System.assertEquals(false, productType3Filter2.equals(productType3Filter3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASProductType3Filter productType3Filter1 = OASProductType3Filter.getExample();
        OASProductType3Filter productType3Filter2 = new OASProductType3Filter();

        System.assertEquals(productType3Filter1.hashCode(), productType3Filter1.hashCode());
        System.assertEquals(productType3Filter2.hashCode(), productType3Filter2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASProductType3Filter productType3Filter1 = OASProductType3Filter.getExample();
        OASProductType3Filter productType3Filter2 = OASProductType3Filter.getExample();
        OASProductType3Filter productType3Filter3 = new OASProductType3Filter();
        OASProductType3Filter productType3Filter4 = new OASProductType3Filter();

        System.assert(productType3Filter1.equals(productType3Filter2));
        System.assert(productType3Filter3.equals(productType3Filter4));
        System.assertEquals(productType3Filter1.hashCode(), productType3Filter2.hashCode());
        System.assertEquals(productType3Filter3.hashCode(), productType3Filter4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASProductType3Filter productType3Filter = new OASProductType3Filter();
        Map<String, String> x-property-mappings = productType3Filter.getx-property-mappings();
        System.assertEquals('prODUCTTYPE3', x-property-mappings.get('PRODUCT_TYPE_3'));
    }
}
