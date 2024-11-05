@isTest
private class OASMediaTypeFilterTest {
    @isTest
    private static void equalsSameInstance() {
        OASMediaTypeFilter mediaTypeFilter1 = OASMediaTypeFilter.getExample();
        OASMediaTypeFilter mediaTypeFilter2 = mediaTypeFilter1;
        OASMediaTypeFilter mediaTypeFilter3 = new OASMediaTypeFilter();
        OASMediaTypeFilter mediaTypeFilter4 = mediaTypeFilter3;

        System.assert(mediaTypeFilter1.equals(mediaTypeFilter2));
        System.assert(mediaTypeFilter2.equals(mediaTypeFilter1));
        System.assert(mediaTypeFilter1.equals(mediaTypeFilter1));
        System.assert(mediaTypeFilter3.equals(mediaTypeFilter4));
        System.assert(mediaTypeFilter4.equals(mediaTypeFilter3));
        System.assert(mediaTypeFilter3.equals(mediaTypeFilter3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMediaTypeFilter mediaTypeFilter1 = OASMediaTypeFilter.getExample();
        OASMediaTypeFilter mediaTypeFilter2 = OASMediaTypeFilter.getExample();
        OASMediaTypeFilter mediaTypeFilter3 = new OASMediaTypeFilter();
        OASMediaTypeFilter mediaTypeFilter4 = new OASMediaTypeFilter();

        System.assert(mediaTypeFilter1.equals(mediaTypeFilter2));
        System.assert(mediaTypeFilter2.equals(mediaTypeFilter1));
        System.assert(mediaTypeFilter3.equals(mediaTypeFilter4));
        System.assert(mediaTypeFilter4.equals(mediaTypeFilter3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMediaTypeFilter mediaTypeFilter1 = OASMediaTypeFilter.getExample();
        OASMediaTypeFilter mediaTypeFilter2 = new OASMediaTypeFilter();

        System.assertEquals(false, mediaTypeFilter1.equals('foo'));
        System.assertEquals(false, mediaTypeFilter2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMediaTypeFilter mediaTypeFilter1 = OASMediaTypeFilter.getExample();
        OASMediaTypeFilter mediaTypeFilter2 = new OASMediaTypeFilter();
        OASMediaTypeFilter mediaTypeFilter3;

        System.assertEquals(false, mediaTypeFilter1.equals(mediaTypeFilter3));
        System.assertEquals(false, mediaTypeFilter2.equals(mediaTypeFilter3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMediaTypeFilter mediaTypeFilter1 = OASMediaTypeFilter.getExample();
        OASMediaTypeFilter mediaTypeFilter2 = new OASMediaTypeFilter();

        System.assertEquals(mediaTypeFilter1.hashCode(), mediaTypeFilter1.hashCode());
        System.assertEquals(mediaTypeFilter2.hashCode(), mediaTypeFilter2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMediaTypeFilter mediaTypeFilter1 = OASMediaTypeFilter.getExample();
        OASMediaTypeFilter mediaTypeFilter2 = OASMediaTypeFilter.getExample();
        OASMediaTypeFilter mediaTypeFilter3 = new OASMediaTypeFilter();
        OASMediaTypeFilter mediaTypeFilter4 = new OASMediaTypeFilter();

        System.assert(mediaTypeFilter1.equals(mediaTypeFilter2));
        System.assert(mediaTypeFilter3.equals(mediaTypeFilter4));
        System.assertEquals(mediaTypeFilter1.hashCode(), mediaTypeFilter2.hashCode());
        System.assertEquals(mediaTypeFilter3.hashCode(), mediaTypeFilter4.hashCode());
    }
}
