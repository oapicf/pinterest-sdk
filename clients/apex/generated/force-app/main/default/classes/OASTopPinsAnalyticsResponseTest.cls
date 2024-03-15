@isTest
private class OASTopPinsAnalyticsResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASTopPinsAnalyticsResponse topPinsAnalyticsResponse1 = OASTopPinsAnalyticsResponse.getExample();
        OASTopPinsAnalyticsResponse topPinsAnalyticsResponse2 = topPinsAnalyticsResponse1;
        OASTopPinsAnalyticsResponse topPinsAnalyticsResponse3 = new OASTopPinsAnalyticsResponse();
        OASTopPinsAnalyticsResponse topPinsAnalyticsResponse4 = topPinsAnalyticsResponse3;

        System.assert(topPinsAnalyticsResponse1.equals(topPinsAnalyticsResponse2));
        System.assert(topPinsAnalyticsResponse2.equals(topPinsAnalyticsResponse1));
        System.assert(topPinsAnalyticsResponse1.equals(topPinsAnalyticsResponse1));
        System.assert(topPinsAnalyticsResponse3.equals(topPinsAnalyticsResponse4));
        System.assert(topPinsAnalyticsResponse4.equals(topPinsAnalyticsResponse3));
        System.assert(topPinsAnalyticsResponse3.equals(topPinsAnalyticsResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTopPinsAnalyticsResponse topPinsAnalyticsResponse1 = OASTopPinsAnalyticsResponse.getExample();
        OASTopPinsAnalyticsResponse topPinsAnalyticsResponse2 = OASTopPinsAnalyticsResponse.getExample();
        OASTopPinsAnalyticsResponse topPinsAnalyticsResponse3 = new OASTopPinsAnalyticsResponse();
        OASTopPinsAnalyticsResponse topPinsAnalyticsResponse4 = new OASTopPinsAnalyticsResponse();

        System.assert(topPinsAnalyticsResponse1.equals(topPinsAnalyticsResponse2));
        System.assert(topPinsAnalyticsResponse2.equals(topPinsAnalyticsResponse1));
        System.assert(topPinsAnalyticsResponse3.equals(topPinsAnalyticsResponse4));
        System.assert(topPinsAnalyticsResponse4.equals(topPinsAnalyticsResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTopPinsAnalyticsResponse topPinsAnalyticsResponse1 = OASTopPinsAnalyticsResponse.getExample();
        OASTopPinsAnalyticsResponse topPinsAnalyticsResponse2 = new OASTopPinsAnalyticsResponse();

        System.assertEquals(false, topPinsAnalyticsResponse1.equals('foo'));
        System.assertEquals(false, topPinsAnalyticsResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTopPinsAnalyticsResponse topPinsAnalyticsResponse1 = OASTopPinsAnalyticsResponse.getExample();
        OASTopPinsAnalyticsResponse topPinsAnalyticsResponse2 = new OASTopPinsAnalyticsResponse();
        OASTopPinsAnalyticsResponse topPinsAnalyticsResponse3;

        System.assertEquals(false, topPinsAnalyticsResponse1.equals(topPinsAnalyticsResponse3));
        System.assertEquals(false, topPinsAnalyticsResponse2.equals(topPinsAnalyticsResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTopPinsAnalyticsResponse topPinsAnalyticsResponse1 = OASTopPinsAnalyticsResponse.getExample();
        OASTopPinsAnalyticsResponse topPinsAnalyticsResponse2 = new OASTopPinsAnalyticsResponse();

        System.assertEquals(topPinsAnalyticsResponse1.hashCode(), topPinsAnalyticsResponse1.hashCode());
        System.assertEquals(topPinsAnalyticsResponse2.hashCode(), topPinsAnalyticsResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTopPinsAnalyticsResponse topPinsAnalyticsResponse1 = OASTopPinsAnalyticsResponse.getExample();
        OASTopPinsAnalyticsResponse topPinsAnalyticsResponse2 = OASTopPinsAnalyticsResponse.getExample();
        OASTopPinsAnalyticsResponse topPinsAnalyticsResponse3 = new OASTopPinsAnalyticsResponse();
        OASTopPinsAnalyticsResponse topPinsAnalyticsResponse4 = new OASTopPinsAnalyticsResponse();

        System.assert(topPinsAnalyticsResponse1.equals(topPinsAnalyticsResponse2));
        System.assert(topPinsAnalyticsResponse3.equals(topPinsAnalyticsResponse4));
        System.assertEquals(topPinsAnalyticsResponse1.hashCode(), topPinsAnalyticsResponse2.hashCode());
        System.assertEquals(topPinsAnalyticsResponse3.hashCode(), topPinsAnalyticsResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASTopPinsAnalyticsResponse topPinsAnalyticsResponse = new OASTopPinsAnalyticsResponse();
        Map<String, String> x-property-mappings = topPinsAnalyticsResponse.getx-property-mappings();
        System.assertEquals('dateAvailability', x-property-mappings.get('date_availability'));
        System.assertEquals('sortBy', x-property-mappings.get('sort_by'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASTopPinsAnalyticsResponse topPinsAnalyticsResponse = new OASTopPinsAnalyticsResponse();
        System.assertEquals(new List<OASTopPinsAnalyticsResponsePinsInner>(), topPinsAnalyticsResponse.pins);
        System.assertEquals(null, topPinsAnalyticsResponse.dateAvailability);
        System.assertEquals(null, topPinsAnalyticsResponse.sortBy);
    }
}
