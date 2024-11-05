@isTest
private class OASProductGroupReferenceFilterTest {
    @isTest
    private static void equalsSameInstance() {
        OASProductGroupReferenceFilter productGroupReferenceFilter1 = OASProductGroupReferenceFilter.getExample();
        OASProductGroupReferenceFilter productGroupReferenceFilter2 = productGroupReferenceFilter1;
        OASProductGroupReferenceFilter productGroupReferenceFilter3 = new OASProductGroupReferenceFilter();
        OASProductGroupReferenceFilter productGroupReferenceFilter4 = productGroupReferenceFilter3;

        System.assert(productGroupReferenceFilter1.equals(productGroupReferenceFilter2));
        System.assert(productGroupReferenceFilter2.equals(productGroupReferenceFilter1));
        System.assert(productGroupReferenceFilter1.equals(productGroupReferenceFilter1));
        System.assert(productGroupReferenceFilter3.equals(productGroupReferenceFilter4));
        System.assert(productGroupReferenceFilter4.equals(productGroupReferenceFilter3));
        System.assert(productGroupReferenceFilter3.equals(productGroupReferenceFilter3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASProductGroupReferenceFilter productGroupReferenceFilter1 = OASProductGroupReferenceFilter.getExample();
        OASProductGroupReferenceFilter productGroupReferenceFilter2 = OASProductGroupReferenceFilter.getExample();
        OASProductGroupReferenceFilter productGroupReferenceFilter3 = new OASProductGroupReferenceFilter();
        OASProductGroupReferenceFilter productGroupReferenceFilter4 = new OASProductGroupReferenceFilter();

        System.assert(productGroupReferenceFilter1.equals(productGroupReferenceFilter2));
        System.assert(productGroupReferenceFilter2.equals(productGroupReferenceFilter1));
        System.assert(productGroupReferenceFilter3.equals(productGroupReferenceFilter4));
        System.assert(productGroupReferenceFilter4.equals(productGroupReferenceFilter3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASProductGroupReferenceFilter productGroupReferenceFilter1 = OASProductGroupReferenceFilter.getExample();
        OASProductGroupReferenceFilter productGroupReferenceFilter2 = new OASProductGroupReferenceFilter();

        System.assertEquals(false, productGroupReferenceFilter1.equals('foo'));
        System.assertEquals(false, productGroupReferenceFilter2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASProductGroupReferenceFilter productGroupReferenceFilter1 = OASProductGroupReferenceFilter.getExample();
        OASProductGroupReferenceFilter productGroupReferenceFilter2 = new OASProductGroupReferenceFilter();
        OASProductGroupReferenceFilter productGroupReferenceFilter3;

        System.assertEquals(false, productGroupReferenceFilter1.equals(productGroupReferenceFilter3));
        System.assertEquals(false, productGroupReferenceFilter2.equals(productGroupReferenceFilter3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASProductGroupReferenceFilter productGroupReferenceFilter1 = OASProductGroupReferenceFilter.getExample();
        OASProductGroupReferenceFilter productGroupReferenceFilter2 = new OASProductGroupReferenceFilter();

        System.assertEquals(productGroupReferenceFilter1.hashCode(), productGroupReferenceFilter1.hashCode());
        System.assertEquals(productGroupReferenceFilter2.hashCode(), productGroupReferenceFilter2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASProductGroupReferenceFilter productGroupReferenceFilter1 = OASProductGroupReferenceFilter.getExample();
        OASProductGroupReferenceFilter productGroupReferenceFilter2 = OASProductGroupReferenceFilter.getExample();
        OASProductGroupReferenceFilter productGroupReferenceFilter3 = new OASProductGroupReferenceFilter();
        OASProductGroupReferenceFilter productGroupReferenceFilter4 = new OASProductGroupReferenceFilter();

        System.assert(productGroupReferenceFilter1.equals(productGroupReferenceFilter2));
        System.assert(productGroupReferenceFilter3.equals(productGroupReferenceFilter4));
        System.assertEquals(productGroupReferenceFilter1.hashCode(), productGroupReferenceFilter2.hashCode());
        System.assertEquals(productGroupReferenceFilter3.hashCode(), productGroupReferenceFilter4.hashCode());
    }
}
