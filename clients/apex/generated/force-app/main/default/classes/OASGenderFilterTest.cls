@isTest
private class OASGenderFilterTest {
    @isTest
    private static void equalsSameInstance() {
        OASGenderFilter genderFilter1 = OASGenderFilter.getExample();
        OASGenderFilter genderFilter2 = genderFilter1;
        OASGenderFilter genderFilter3 = new OASGenderFilter();
        OASGenderFilter genderFilter4 = genderFilter3;

        System.assert(genderFilter1.equals(genderFilter2));
        System.assert(genderFilter2.equals(genderFilter1));
        System.assert(genderFilter1.equals(genderFilter1));
        System.assert(genderFilter3.equals(genderFilter4));
        System.assert(genderFilter4.equals(genderFilter3));
        System.assert(genderFilter3.equals(genderFilter3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGenderFilter genderFilter1 = OASGenderFilter.getExample();
        OASGenderFilter genderFilter2 = OASGenderFilter.getExample();
        OASGenderFilter genderFilter3 = new OASGenderFilter();
        OASGenderFilter genderFilter4 = new OASGenderFilter();

        System.assert(genderFilter1.equals(genderFilter2));
        System.assert(genderFilter2.equals(genderFilter1));
        System.assert(genderFilter3.equals(genderFilter4));
        System.assert(genderFilter4.equals(genderFilter3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGenderFilter genderFilter1 = OASGenderFilter.getExample();
        OASGenderFilter genderFilter2 = new OASGenderFilter();

        System.assertEquals(false, genderFilter1.equals('foo'));
        System.assertEquals(false, genderFilter2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGenderFilter genderFilter1 = OASGenderFilter.getExample();
        OASGenderFilter genderFilter2 = new OASGenderFilter();
        OASGenderFilter genderFilter3;

        System.assertEquals(false, genderFilter1.equals(genderFilter3));
        System.assertEquals(false, genderFilter2.equals(genderFilter3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGenderFilter genderFilter1 = OASGenderFilter.getExample();
        OASGenderFilter genderFilter2 = new OASGenderFilter();

        System.assertEquals(genderFilter1.hashCode(), genderFilter1.hashCode());
        System.assertEquals(genderFilter2.hashCode(), genderFilter2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGenderFilter genderFilter1 = OASGenderFilter.getExample();
        OASGenderFilter genderFilter2 = OASGenderFilter.getExample();
        OASGenderFilter genderFilter3 = new OASGenderFilter();
        OASGenderFilter genderFilter4 = new OASGenderFilter();

        System.assert(genderFilter1.equals(genderFilter2));
        System.assert(genderFilter3.equals(genderFilter4));
        System.assertEquals(genderFilter1.hashCode(), genderFilter2.hashCode());
        System.assertEquals(genderFilter3.hashCode(), genderFilter4.hashCode());
    }
}
