@isTest
private class OASProductType0FilterTest {
    @isTest
    private static void equalsSameInstance() {
        OASProductType0Filter productType0Filter1 = OASProductType0Filter.getExample();
        OASProductType0Filter productType0Filter2 = productType0Filter1;
        OASProductType0Filter productType0Filter3 = new OASProductType0Filter();
        OASProductType0Filter productType0Filter4 = productType0Filter3;

        System.assert(productType0Filter1.equals(productType0Filter2));
        System.assert(productType0Filter2.equals(productType0Filter1));
        System.assert(productType0Filter1.equals(productType0Filter1));
        System.assert(productType0Filter3.equals(productType0Filter4));
        System.assert(productType0Filter4.equals(productType0Filter3));
        System.assert(productType0Filter3.equals(productType0Filter3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASProductType0Filter productType0Filter1 = OASProductType0Filter.getExample();
        OASProductType0Filter productType0Filter2 = OASProductType0Filter.getExample();
        OASProductType0Filter productType0Filter3 = new OASProductType0Filter();
        OASProductType0Filter productType0Filter4 = new OASProductType0Filter();

        System.assert(productType0Filter1.equals(productType0Filter2));
        System.assert(productType0Filter2.equals(productType0Filter1));
        System.assert(productType0Filter3.equals(productType0Filter4));
        System.assert(productType0Filter4.equals(productType0Filter3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASProductType0Filter productType0Filter1 = OASProductType0Filter.getExample();
        OASProductType0Filter productType0Filter2 = new OASProductType0Filter();

        System.assertEquals(false, productType0Filter1.equals('foo'));
        System.assertEquals(false, productType0Filter2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASProductType0Filter productType0Filter1 = OASProductType0Filter.getExample();
        OASProductType0Filter productType0Filter2 = new OASProductType0Filter();
        OASProductType0Filter productType0Filter3;

        System.assertEquals(false, productType0Filter1.equals(productType0Filter3));
        System.assertEquals(false, productType0Filter2.equals(productType0Filter3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASProductType0Filter productType0Filter1 = OASProductType0Filter.getExample();
        OASProductType0Filter productType0Filter2 = new OASProductType0Filter();

        System.assertEquals(productType0Filter1.hashCode(), productType0Filter1.hashCode());
        System.assertEquals(productType0Filter2.hashCode(), productType0Filter2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASProductType0Filter productType0Filter1 = OASProductType0Filter.getExample();
        OASProductType0Filter productType0Filter2 = OASProductType0Filter.getExample();
        OASProductType0Filter productType0Filter3 = new OASProductType0Filter();
        OASProductType0Filter productType0Filter4 = new OASProductType0Filter();

        System.assert(productType0Filter1.equals(productType0Filter2));
        System.assert(productType0Filter3.equals(productType0Filter4));
        System.assertEquals(productType0Filter1.hashCode(), productType0Filter2.hashCode());
        System.assertEquals(productType0Filter3.hashCode(), productType0Filter4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASProductType0Filter productType0Filter = new OASProductType0Filter();
        Map<String, String> x-property-mappings = productType0Filter.getx-property-mappings();
        System.assertEquals('prODUCTTYPE0', x-property-mappings.get('PRODUCT_TYPE_0'));
    }
}
