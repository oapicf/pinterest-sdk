@isTest
private class OASBrandFilterTest {
    @isTest
    private static void equalsSameInstance() {
        OASBrandFilter brandFilter1 = OASBrandFilter.getExample();
        OASBrandFilter brandFilter2 = brandFilter1;
        OASBrandFilter brandFilter3 = new OASBrandFilter();
        OASBrandFilter brandFilter4 = brandFilter3;

        System.assert(brandFilter1.equals(brandFilter2));
        System.assert(brandFilter2.equals(brandFilter1));
        System.assert(brandFilter1.equals(brandFilter1));
        System.assert(brandFilter3.equals(brandFilter4));
        System.assert(brandFilter4.equals(brandFilter3));
        System.assert(brandFilter3.equals(brandFilter3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBrandFilter brandFilter1 = OASBrandFilter.getExample();
        OASBrandFilter brandFilter2 = OASBrandFilter.getExample();
        OASBrandFilter brandFilter3 = new OASBrandFilter();
        OASBrandFilter brandFilter4 = new OASBrandFilter();

        System.assert(brandFilter1.equals(brandFilter2));
        System.assert(brandFilter2.equals(brandFilter1));
        System.assert(brandFilter3.equals(brandFilter4));
        System.assert(brandFilter4.equals(brandFilter3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBrandFilter brandFilter1 = OASBrandFilter.getExample();
        OASBrandFilter brandFilter2 = new OASBrandFilter();

        System.assertEquals(false, brandFilter1.equals('foo'));
        System.assertEquals(false, brandFilter2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBrandFilter brandFilter1 = OASBrandFilter.getExample();
        OASBrandFilter brandFilter2 = new OASBrandFilter();
        OASBrandFilter brandFilter3;

        System.assertEquals(false, brandFilter1.equals(brandFilter3));
        System.assertEquals(false, brandFilter2.equals(brandFilter3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBrandFilter brandFilter1 = OASBrandFilter.getExample();
        OASBrandFilter brandFilter2 = new OASBrandFilter();

        System.assertEquals(brandFilter1.hashCode(), brandFilter1.hashCode());
        System.assertEquals(brandFilter2.hashCode(), brandFilter2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBrandFilter brandFilter1 = OASBrandFilter.getExample();
        OASBrandFilter brandFilter2 = OASBrandFilter.getExample();
        OASBrandFilter brandFilter3 = new OASBrandFilter();
        OASBrandFilter brandFilter4 = new OASBrandFilter();

        System.assert(brandFilter1.equals(brandFilter2));
        System.assert(brandFilter3.equals(brandFilter4));
        System.assertEquals(brandFilter1.hashCode(), brandFilter2.hashCode());
        System.assertEquals(brandFilter3.hashCode(), brandFilter4.hashCode());
    }
}
