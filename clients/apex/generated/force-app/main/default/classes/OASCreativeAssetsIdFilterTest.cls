@isTest
private class OASCreativeAssetsIdFilterTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreativeAssetsIdFilter creativeAssetsIdFilter1 = OASCreativeAssetsIdFilter.getExample();
        OASCreativeAssetsIdFilter creativeAssetsIdFilter2 = creativeAssetsIdFilter1;
        OASCreativeAssetsIdFilter creativeAssetsIdFilter3 = new OASCreativeAssetsIdFilter();
        OASCreativeAssetsIdFilter creativeAssetsIdFilter4 = creativeAssetsIdFilter3;

        System.assert(creativeAssetsIdFilter1.equals(creativeAssetsIdFilter2));
        System.assert(creativeAssetsIdFilter2.equals(creativeAssetsIdFilter1));
        System.assert(creativeAssetsIdFilter1.equals(creativeAssetsIdFilter1));
        System.assert(creativeAssetsIdFilter3.equals(creativeAssetsIdFilter4));
        System.assert(creativeAssetsIdFilter4.equals(creativeAssetsIdFilter3));
        System.assert(creativeAssetsIdFilter3.equals(creativeAssetsIdFilter3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreativeAssetsIdFilter creativeAssetsIdFilter1 = OASCreativeAssetsIdFilter.getExample();
        OASCreativeAssetsIdFilter creativeAssetsIdFilter2 = OASCreativeAssetsIdFilter.getExample();
        OASCreativeAssetsIdFilter creativeAssetsIdFilter3 = new OASCreativeAssetsIdFilter();
        OASCreativeAssetsIdFilter creativeAssetsIdFilter4 = new OASCreativeAssetsIdFilter();

        System.assert(creativeAssetsIdFilter1.equals(creativeAssetsIdFilter2));
        System.assert(creativeAssetsIdFilter2.equals(creativeAssetsIdFilter1));
        System.assert(creativeAssetsIdFilter3.equals(creativeAssetsIdFilter4));
        System.assert(creativeAssetsIdFilter4.equals(creativeAssetsIdFilter3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreativeAssetsIdFilter creativeAssetsIdFilter1 = OASCreativeAssetsIdFilter.getExample();
        OASCreativeAssetsIdFilter creativeAssetsIdFilter2 = new OASCreativeAssetsIdFilter();

        System.assertEquals(false, creativeAssetsIdFilter1.equals('foo'));
        System.assertEquals(false, creativeAssetsIdFilter2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreativeAssetsIdFilter creativeAssetsIdFilter1 = OASCreativeAssetsIdFilter.getExample();
        OASCreativeAssetsIdFilter creativeAssetsIdFilter2 = new OASCreativeAssetsIdFilter();
        OASCreativeAssetsIdFilter creativeAssetsIdFilter3;

        System.assertEquals(false, creativeAssetsIdFilter1.equals(creativeAssetsIdFilter3));
        System.assertEquals(false, creativeAssetsIdFilter2.equals(creativeAssetsIdFilter3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreativeAssetsIdFilter creativeAssetsIdFilter1 = OASCreativeAssetsIdFilter.getExample();
        OASCreativeAssetsIdFilter creativeAssetsIdFilter2 = new OASCreativeAssetsIdFilter();

        System.assertEquals(creativeAssetsIdFilter1.hashCode(), creativeAssetsIdFilter1.hashCode());
        System.assertEquals(creativeAssetsIdFilter2.hashCode(), creativeAssetsIdFilter2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreativeAssetsIdFilter creativeAssetsIdFilter1 = OASCreativeAssetsIdFilter.getExample();
        OASCreativeAssetsIdFilter creativeAssetsIdFilter2 = OASCreativeAssetsIdFilter.getExample();
        OASCreativeAssetsIdFilter creativeAssetsIdFilter3 = new OASCreativeAssetsIdFilter();
        OASCreativeAssetsIdFilter creativeAssetsIdFilter4 = new OASCreativeAssetsIdFilter();

        System.assert(creativeAssetsIdFilter1.equals(creativeAssetsIdFilter2));
        System.assert(creativeAssetsIdFilter3.equals(creativeAssetsIdFilter4));
        System.assertEquals(creativeAssetsIdFilter1.hashCode(), creativeAssetsIdFilter2.hashCode());
        System.assertEquals(creativeAssetsIdFilter3.hashCode(), creativeAssetsIdFilter4.hashCode());
    }
}
