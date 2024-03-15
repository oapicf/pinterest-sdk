@isTest
private class OASMediaList200ResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASMediaList200Response mediaList200Response1 = OASMediaList200Response.getExample();
        OASMediaList200Response mediaList200Response2 = mediaList200Response1;
        OASMediaList200Response mediaList200Response3 = new OASMediaList200Response();
        OASMediaList200Response mediaList200Response4 = mediaList200Response3;

        System.assert(mediaList200Response1.equals(mediaList200Response2));
        System.assert(mediaList200Response2.equals(mediaList200Response1));
        System.assert(mediaList200Response1.equals(mediaList200Response1));
        System.assert(mediaList200Response3.equals(mediaList200Response4));
        System.assert(mediaList200Response4.equals(mediaList200Response3));
        System.assert(mediaList200Response3.equals(mediaList200Response3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMediaList200Response mediaList200Response1 = OASMediaList200Response.getExample();
        OASMediaList200Response mediaList200Response2 = OASMediaList200Response.getExample();
        OASMediaList200Response mediaList200Response3 = new OASMediaList200Response();
        OASMediaList200Response mediaList200Response4 = new OASMediaList200Response();

        System.assert(mediaList200Response1.equals(mediaList200Response2));
        System.assert(mediaList200Response2.equals(mediaList200Response1));
        System.assert(mediaList200Response3.equals(mediaList200Response4));
        System.assert(mediaList200Response4.equals(mediaList200Response3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMediaList200Response mediaList200Response1 = OASMediaList200Response.getExample();
        OASMediaList200Response mediaList200Response2 = new OASMediaList200Response();

        System.assertEquals(false, mediaList200Response1.equals('foo'));
        System.assertEquals(false, mediaList200Response2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMediaList200Response mediaList200Response1 = OASMediaList200Response.getExample();
        OASMediaList200Response mediaList200Response2 = new OASMediaList200Response();
        OASMediaList200Response mediaList200Response3;

        System.assertEquals(false, mediaList200Response1.equals(mediaList200Response3));
        System.assertEquals(false, mediaList200Response2.equals(mediaList200Response3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMediaList200Response mediaList200Response1 = OASMediaList200Response.getExample();
        OASMediaList200Response mediaList200Response2 = new OASMediaList200Response();

        System.assertEquals(mediaList200Response1.hashCode(), mediaList200Response1.hashCode());
        System.assertEquals(mediaList200Response2.hashCode(), mediaList200Response2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMediaList200Response mediaList200Response1 = OASMediaList200Response.getExample();
        OASMediaList200Response mediaList200Response2 = OASMediaList200Response.getExample();
        OASMediaList200Response mediaList200Response3 = new OASMediaList200Response();
        OASMediaList200Response mediaList200Response4 = new OASMediaList200Response();

        System.assert(mediaList200Response1.equals(mediaList200Response2));
        System.assert(mediaList200Response3.equals(mediaList200Response4));
        System.assertEquals(mediaList200Response1.hashCode(), mediaList200Response2.hashCode());
        System.assertEquals(mediaList200Response3.hashCode(), mediaList200Response4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASMediaList200Response mediaList200Response = new OASMediaList200Response();
        System.assertEquals(new List<OASMediaUploadDetails>(), mediaList200Response.items);
        System.assertEquals(null, mediaList200Response.bookmark);
    }
}
