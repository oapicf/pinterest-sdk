@isTest
private class OASFeedsList200ResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASFeedsList200Response feedsList200Response1 = OASFeedsList200Response.getExample();
        OASFeedsList200Response feedsList200Response2 = feedsList200Response1;
        OASFeedsList200Response feedsList200Response3 = new OASFeedsList200Response();
        OASFeedsList200Response feedsList200Response4 = feedsList200Response3;

        System.assert(feedsList200Response1.equals(feedsList200Response2));
        System.assert(feedsList200Response2.equals(feedsList200Response1));
        System.assert(feedsList200Response1.equals(feedsList200Response1));
        System.assert(feedsList200Response3.equals(feedsList200Response4));
        System.assert(feedsList200Response4.equals(feedsList200Response3));
        System.assert(feedsList200Response3.equals(feedsList200Response3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASFeedsList200Response feedsList200Response1 = OASFeedsList200Response.getExample();
        OASFeedsList200Response feedsList200Response2 = OASFeedsList200Response.getExample();
        OASFeedsList200Response feedsList200Response3 = new OASFeedsList200Response();
        OASFeedsList200Response feedsList200Response4 = new OASFeedsList200Response();

        System.assert(feedsList200Response1.equals(feedsList200Response2));
        System.assert(feedsList200Response2.equals(feedsList200Response1));
        System.assert(feedsList200Response3.equals(feedsList200Response4));
        System.assert(feedsList200Response4.equals(feedsList200Response3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASFeedsList200Response feedsList200Response1 = OASFeedsList200Response.getExample();
        OASFeedsList200Response feedsList200Response2 = new OASFeedsList200Response();

        System.assertEquals(false, feedsList200Response1.equals('foo'));
        System.assertEquals(false, feedsList200Response2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASFeedsList200Response feedsList200Response1 = OASFeedsList200Response.getExample();
        OASFeedsList200Response feedsList200Response2 = new OASFeedsList200Response();
        OASFeedsList200Response feedsList200Response3;

        System.assertEquals(false, feedsList200Response1.equals(feedsList200Response3));
        System.assertEquals(false, feedsList200Response2.equals(feedsList200Response3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASFeedsList200Response feedsList200Response1 = OASFeedsList200Response.getExample();
        OASFeedsList200Response feedsList200Response2 = new OASFeedsList200Response();

        System.assertEquals(feedsList200Response1.hashCode(), feedsList200Response1.hashCode());
        System.assertEquals(feedsList200Response2.hashCode(), feedsList200Response2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASFeedsList200Response feedsList200Response1 = OASFeedsList200Response.getExample();
        OASFeedsList200Response feedsList200Response2 = OASFeedsList200Response.getExample();
        OASFeedsList200Response feedsList200Response3 = new OASFeedsList200Response();
        OASFeedsList200Response feedsList200Response4 = new OASFeedsList200Response();

        System.assert(feedsList200Response1.equals(feedsList200Response2));
        System.assert(feedsList200Response3.equals(feedsList200Response4));
        System.assertEquals(feedsList200Response1.hashCode(), feedsList200Response2.hashCode());
        System.assertEquals(feedsList200Response3.hashCode(), feedsList200Response4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASFeedsList200Response feedsList200Response = new OASFeedsList200Response();
        System.assertEquals(new List<OASCatalogsFeed>(), feedsList200Response.items);
        System.assertEquals(null, feedsList200Response.bookmark);
    }
}
