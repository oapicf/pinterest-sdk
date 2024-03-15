@isTest
private class OASItemGroupIdFilterTest {
    @isTest
    private static void equalsSameInstance() {
        OASItemGroupIdFilter itemGroupIdFilter1 = OASItemGroupIdFilter.getExample();
        OASItemGroupIdFilter itemGroupIdFilter2 = itemGroupIdFilter1;
        OASItemGroupIdFilter itemGroupIdFilter3 = new OASItemGroupIdFilter();
        OASItemGroupIdFilter itemGroupIdFilter4 = itemGroupIdFilter3;

        System.assert(itemGroupIdFilter1.equals(itemGroupIdFilter2));
        System.assert(itemGroupIdFilter2.equals(itemGroupIdFilter1));
        System.assert(itemGroupIdFilter1.equals(itemGroupIdFilter1));
        System.assert(itemGroupIdFilter3.equals(itemGroupIdFilter4));
        System.assert(itemGroupIdFilter4.equals(itemGroupIdFilter3));
        System.assert(itemGroupIdFilter3.equals(itemGroupIdFilter3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASItemGroupIdFilter itemGroupIdFilter1 = OASItemGroupIdFilter.getExample();
        OASItemGroupIdFilter itemGroupIdFilter2 = OASItemGroupIdFilter.getExample();
        OASItemGroupIdFilter itemGroupIdFilter3 = new OASItemGroupIdFilter();
        OASItemGroupIdFilter itemGroupIdFilter4 = new OASItemGroupIdFilter();

        System.assert(itemGroupIdFilter1.equals(itemGroupIdFilter2));
        System.assert(itemGroupIdFilter2.equals(itemGroupIdFilter1));
        System.assert(itemGroupIdFilter3.equals(itemGroupIdFilter4));
        System.assert(itemGroupIdFilter4.equals(itemGroupIdFilter3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASItemGroupIdFilter itemGroupIdFilter1 = OASItemGroupIdFilter.getExample();
        OASItemGroupIdFilter itemGroupIdFilter2 = new OASItemGroupIdFilter();

        System.assertEquals(false, itemGroupIdFilter1.equals('foo'));
        System.assertEquals(false, itemGroupIdFilter2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASItemGroupIdFilter itemGroupIdFilter1 = OASItemGroupIdFilter.getExample();
        OASItemGroupIdFilter itemGroupIdFilter2 = new OASItemGroupIdFilter();
        OASItemGroupIdFilter itemGroupIdFilter3;

        System.assertEquals(false, itemGroupIdFilter1.equals(itemGroupIdFilter3));
        System.assertEquals(false, itemGroupIdFilter2.equals(itemGroupIdFilter3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASItemGroupIdFilter itemGroupIdFilter1 = OASItemGroupIdFilter.getExample();
        OASItemGroupIdFilter itemGroupIdFilter2 = new OASItemGroupIdFilter();

        System.assertEquals(itemGroupIdFilter1.hashCode(), itemGroupIdFilter1.hashCode());
        System.assertEquals(itemGroupIdFilter2.hashCode(), itemGroupIdFilter2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASItemGroupIdFilter itemGroupIdFilter1 = OASItemGroupIdFilter.getExample();
        OASItemGroupIdFilter itemGroupIdFilter2 = OASItemGroupIdFilter.getExample();
        OASItemGroupIdFilter itemGroupIdFilter3 = new OASItemGroupIdFilter();
        OASItemGroupIdFilter itemGroupIdFilter4 = new OASItemGroupIdFilter();

        System.assert(itemGroupIdFilter1.equals(itemGroupIdFilter2));
        System.assert(itemGroupIdFilter3.equals(itemGroupIdFilter4));
        System.assertEquals(itemGroupIdFilter1.hashCode(), itemGroupIdFilter2.hashCode());
        System.assertEquals(itemGroupIdFilter3.hashCode(), itemGroupIdFilter4.hashCode());
    }
}
