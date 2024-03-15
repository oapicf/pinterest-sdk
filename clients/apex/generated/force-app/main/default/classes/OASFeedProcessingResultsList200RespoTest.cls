@isTest
private class OASFeedProcessingResultsList200RespoTest {
    @isTest
    private static void equalsSameInstance() {
        OASFeedProcessingResultsList200Respo feedProcessingResultsList200Response1 = OASFeedProcessingResultsList200Respo.getExample();
        OASFeedProcessingResultsList200Respo feedProcessingResultsList200Response2 = feedProcessingResultsList200Response1;
        OASFeedProcessingResultsList200Respo feedProcessingResultsList200Response3 = new OASFeedProcessingResultsList200Respo();
        OASFeedProcessingResultsList200Respo feedProcessingResultsList200Response4 = feedProcessingResultsList200Response3;

        System.assert(feedProcessingResultsList200Response1.equals(feedProcessingResultsList200Response2));
        System.assert(feedProcessingResultsList200Response2.equals(feedProcessingResultsList200Response1));
        System.assert(feedProcessingResultsList200Response1.equals(feedProcessingResultsList200Response1));
        System.assert(feedProcessingResultsList200Response3.equals(feedProcessingResultsList200Response4));
        System.assert(feedProcessingResultsList200Response4.equals(feedProcessingResultsList200Response3));
        System.assert(feedProcessingResultsList200Response3.equals(feedProcessingResultsList200Response3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASFeedProcessingResultsList200Respo feedProcessingResultsList200Response1 = OASFeedProcessingResultsList200Respo.getExample();
        OASFeedProcessingResultsList200Respo feedProcessingResultsList200Response2 = OASFeedProcessingResultsList200Respo.getExample();
        OASFeedProcessingResultsList200Respo feedProcessingResultsList200Response3 = new OASFeedProcessingResultsList200Respo();
        OASFeedProcessingResultsList200Respo feedProcessingResultsList200Response4 = new OASFeedProcessingResultsList200Respo();

        System.assert(feedProcessingResultsList200Response1.equals(feedProcessingResultsList200Response2));
        System.assert(feedProcessingResultsList200Response2.equals(feedProcessingResultsList200Response1));
        System.assert(feedProcessingResultsList200Response3.equals(feedProcessingResultsList200Response4));
        System.assert(feedProcessingResultsList200Response4.equals(feedProcessingResultsList200Response3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASFeedProcessingResultsList200Respo feedProcessingResultsList200Response1 = OASFeedProcessingResultsList200Respo.getExample();
        OASFeedProcessingResultsList200Respo feedProcessingResultsList200Response2 = new OASFeedProcessingResultsList200Respo();

        System.assertEquals(false, feedProcessingResultsList200Response1.equals('foo'));
        System.assertEquals(false, feedProcessingResultsList200Response2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASFeedProcessingResultsList200Respo feedProcessingResultsList200Response1 = OASFeedProcessingResultsList200Respo.getExample();
        OASFeedProcessingResultsList200Respo feedProcessingResultsList200Response2 = new OASFeedProcessingResultsList200Respo();
        OASFeedProcessingResultsList200Respo feedProcessingResultsList200Response3;

        System.assertEquals(false, feedProcessingResultsList200Response1.equals(feedProcessingResultsList200Response3));
        System.assertEquals(false, feedProcessingResultsList200Response2.equals(feedProcessingResultsList200Response3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASFeedProcessingResultsList200Respo feedProcessingResultsList200Response1 = OASFeedProcessingResultsList200Respo.getExample();
        OASFeedProcessingResultsList200Respo feedProcessingResultsList200Response2 = new OASFeedProcessingResultsList200Respo();

        System.assertEquals(feedProcessingResultsList200Response1.hashCode(), feedProcessingResultsList200Response1.hashCode());
        System.assertEquals(feedProcessingResultsList200Response2.hashCode(), feedProcessingResultsList200Response2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASFeedProcessingResultsList200Respo feedProcessingResultsList200Response1 = OASFeedProcessingResultsList200Respo.getExample();
        OASFeedProcessingResultsList200Respo feedProcessingResultsList200Response2 = OASFeedProcessingResultsList200Respo.getExample();
        OASFeedProcessingResultsList200Respo feedProcessingResultsList200Response3 = new OASFeedProcessingResultsList200Respo();
        OASFeedProcessingResultsList200Respo feedProcessingResultsList200Response4 = new OASFeedProcessingResultsList200Respo();

        System.assert(feedProcessingResultsList200Response1.equals(feedProcessingResultsList200Response2));
        System.assert(feedProcessingResultsList200Response3.equals(feedProcessingResultsList200Response4));
        System.assertEquals(feedProcessingResultsList200Response1.hashCode(), feedProcessingResultsList200Response2.hashCode());
        System.assertEquals(feedProcessingResultsList200Response3.hashCode(), feedProcessingResultsList200Response4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASFeedProcessingResultsList200Respo feedProcessingResultsList200Response = new OASFeedProcessingResultsList200Respo();
        System.assertEquals(new List<OASCatalogsFeedProcessingResult>(), feedProcessingResultsList200Response.items);
        System.assertEquals(null, feedProcessingResultsList200Response.bookmark);
    }
}
