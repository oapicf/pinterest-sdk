@isTest
private class OASItemIdFilterTest {
    @isTest
    private static void equalsSameInstance() {
        OASItemIdFilter itemIdFilter1 = OASItemIdFilter.getExample();
        OASItemIdFilter itemIdFilter2 = itemIdFilter1;
        OASItemIdFilter itemIdFilter3 = new OASItemIdFilter();
        OASItemIdFilter itemIdFilter4 = itemIdFilter3;

        System.assert(itemIdFilter1.equals(itemIdFilter2));
        System.assert(itemIdFilter2.equals(itemIdFilter1));
        System.assert(itemIdFilter1.equals(itemIdFilter1));
        System.assert(itemIdFilter3.equals(itemIdFilter4));
        System.assert(itemIdFilter4.equals(itemIdFilter3));
        System.assert(itemIdFilter3.equals(itemIdFilter3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASItemIdFilter itemIdFilter1 = OASItemIdFilter.getExample();
        OASItemIdFilter itemIdFilter2 = OASItemIdFilter.getExample();
        OASItemIdFilter itemIdFilter3 = new OASItemIdFilter();
        OASItemIdFilter itemIdFilter4 = new OASItemIdFilter();

        System.assert(itemIdFilter1.equals(itemIdFilter2));
        System.assert(itemIdFilter2.equals(itemIdFilter1));
        System.assert(itemIdFilter3.equals(itemIdFilter4));
        System.assert(itemIdFilter4.equals(itemIdFilter3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASItemIdFilter itemIdFilter1 = OASItemIdFilter.getExample();
        OASItemIdFilter itemIdFilter2 = new OASItemIdFilter();

        System.assertEquals(false, itemIdFilter1.equals('foo'));
        System.assertEquals(false, itemIdFilter2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASItemIdFilter itemIdFilter1 = OASItemIdFilter.getExample();
        OASItemIdFilter itemIdFilter2 = new OASItemIdFilter();
        OASItemIdFilter itemIdFilter3;

        System.assertEquals(false, itemIdFilter1.equals(itemIdFilter3));
        System.assertEquals(false, itemIdFilter2.equals(itemIdFilter3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASItemIdFilter itemIdFilter1 = OASItemIdFilter.getExample();
        OASItemIdFilter itemIdFilter2 = new OASItemIdFilter();

        System.assertEquals(itemIdFilter1.hashCode(), itemIdFilter1.hashCode());
        System.assertEquals(itemIdFilter2.hashCode(), itemIdFilter2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASItemIdFilter itemIdFilter1 = OASItemIdFilter.getExample();
        OASItemIdFilter itemIdFilter2 = OASItemIdFilter.getExample();
        OASItemIdFilter itemIdFilter3 = new OASItemIdFilter();
        OASItemIdFilter itemIdFilter4 = new OASItemIdFilter();

        System.assert(itemIdFilter1.equals(itemIdFilter2));
        System.assert(itemIdFilter3.equals(itemIdFilter4));
        System.assertEquals(itemIdFilter1.hashCode(), itemIdFilter2.hashCode());
        System.assertEquals(itemIdFilter3.hashCode(), itemIdFilter4.hashCode());
    }
}
