@isTest
private class OASProductType4FilterTest {
    @isTest
    private static void equalsSameInstance() {
        OASProductType4Filter productType4Filter1 = OASProductType4Filter.getExample();
        OASProductType4Filter productType4Filter2 = productType4Filter1;
        OASProductType4Filter productType4Filter3 = new OASProductType4Filter();
        OASProductType4Filter productType4Filter4 = productType4Filter3;

        System.assert(productType4Filter1.equals(productType4Filter2));
        System.assert(productType4Filter2.equals(productType4Filter1));
        System.assert(productType4Filter1.equals(productType4Filter1));
        System.assert(productType4Filter3.equals(productType4Filter4));
        System.assert(productType4Filter4.equals(productType4Filter3));
        System.assert(productType4Filter3.equals(productType4Filter3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASProductType4Filter productType4Filter1 = OASProductType4Filter.getExample();
        OASProductType4Filter productType4Filter2 = OASProductType4Filter.getExample();
        OASProductType4Filter productType4Filter3 = new OASProductType4Filter();
        OASProductType4Filter productType4Filter4 = new OASProductType4Filter();

        System.assert(productType4Filter1.equals(productType4Filter2));
        System.assert(productType4Filter2.equals(productType4Filter1));
        System.assert(productType4Filter3.equals(productType4Filter4));
        System.assert(productType4Filter4.equals(productType4Filter3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASProductType4Filter productType4Filter1 = OASProductType4Filter.getExample();
        OASProductType4Filter productType4Filter2 = new OASProductType4Filter();

        System.assertEquals(false, productType4Filter1.equals('foo'));
        System.assertEquals(false, productType4Filter2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASProductType4Filter productType4Filter1 = OASProductType4Filter.getExample();
        OASProductType4Filter productType4Filter2 = new OASProductType4Filter();
        OASProductType4Filter productType4Filter3;

        System.assertEquals(false, productType4Filter1.equals(productType4Filter3));
        System.assertEquals(false, productType4Filter2.equals(productType4Filter3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASProductType4Filter productType4Filter1 = OASProductType4Filter.getExample();
        OASProductType4Filter productType4Filter2 = new OASProductType4Filter();

        System.assertEquals(productType4Filter1.hashCode(), productType4Filter1.hashCode());
        System.assertEquals(productType4Filter2.hashCode(), productType4Filter2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASProductType4Filter productType4Filter1 = OASProductType4Filter.getExample();
        OASProductType4Filter productType4Filter2 = OASProductType4Filter.getExample();
        OASProductType4Filter productType4Filter3 = new OASProductType4Filter();
        OASProductType4Filter productType4Filter4 = new OASProductType4Filter();

        System.assert(productType4Filter1.equals(productType4Filter2));
        System.assert(productType4Filter3.equals(productType4Filter4));
        System.assertEquals(productType4Filter1.hashCode(), productType4Filter2.hashCode());
        System.assertEquals(productType4Filter3.hashCode(), productType4Filter4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASProductType4Filter productType4Filter = new OASProductType4Filter();
        Map<String, String> x-property-mappings = productType4Filter.getx-property-mappings();
        System.assertEquals('prODUCTTYPE4', x-property-mappings.get('PRODUCT_TYPE_4'));
    }
}
