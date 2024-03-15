@isTest
private class OASTopVideoPinsAnalyticsResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASTopVideoPinsAnalyticsResponse topVideoPinsAnalyticsResponse1 = OASTopVideoPinsAnalyticsResponse.getExample();
        OASTopVideoPinsAnalyticsResponse topVideoPinsAnalyticsResponse2 = topVideoPinsAnalyticsResponse1;
        OASTopVideoPinsAnalyticsResponse topVideoPinsAnalyticsResponse3 = new OASTopVideoPinsAnalyticsResponse();
        OASTopVideoPinsAnalyticsResponse topVideoPinsAnalyticsResponse4 = topVideoPinsAnalyticsResponse3;

        System.assert(topVideoPinsAnalyticsResponse1.equals(topVideoPinsAnalyticsResponse2));
        System.assert(topVideoPinsAnalyticsResponse2.equals(topVideoPinsAnalyticsResponse1));
        System.assert(topVideoPinsAnalyticsResponse1.equals(topVideoPinsAnalyticsResponse1));
        System.assert(topVideoPinsAnalyticsResponse3.equals(topVideoPinsAnalyticsResponse4));
        System.assert(topVideoPinsAnalyticsResponse4.equals(topVideoPinsAnalyticsResponse3));
        System.assert(topVideoPinsAnalyticsResponse3.equals(topVideoPinsAnalyticsResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTopVideoPinsAnalyticsResponse topVideoPinsAnalyticsResponse1 = OASTopVideoPinsAnalyticsResponse.getExample();
        OASTopVideoPinsAnalyticsResponse topVideoPinsAnalyticsResponse2 = OASTopVideoPinsAnalyticsResponse.getExample();
        OASTopVideoPinsAnalyticsResponse topVideoPinsAnalyticsResponse3 = new OASTopVideoPinsAnalyticsResponse();
        OASTopVideoPinsAnalyticsResponse topVideoPinsAnalyticsResponse4 = new OASTopVideoPinsAnalyticsResponse();

        System.assert(topVideoPinsAnalyticsResponse1.equals(topVideoPinsAnalyticsResponse2));
        System.assert(topVideoPinsAnalyticsResponse2.equals(topVideoPinsAnalyticsResponse1));
        System.assert(topVideoPinsAnalyticsResponse3.equals(topVideoPinsAnalyticsResponse4));
        System.assert(topVideoPinsAnalyticsResponse4.equals(topVideoPinsAnalyticsResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTopVideoPinsAnalyticsResponse topVideoPinsAnalyticsResponse1 = OASTopVideoPinsAnalyticsResponse.getExample();
        OASTopVideoPinsAnalyticsResponse topVideoPinsAnalyticsResponse2 = new OASTopVideoPinsAnalyticsResponse();

        System.assertEquals(false, topVideoPinsAnalyticsResponse1.equals('foo'));
        System.assertEquals(false, topVideoPinsAnalyticsResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTopVideoPinsAnalyticsResponse topVideoPinsAnalyticsResponse1 = OASTopVideoPinsAnalyticsResponse.getExample();
        OASTopVideoPinsAnalyticsResponse topVideoPinsAnalyticsResponse2 = new OASTopVideoPinsAnalyticsResponse();
        OASTopVideoPinsAnalyticsResponse topVideoPinsAnalyticsResponse3;

        System.assertEquals(false, topVideoPinsAnalyticsResponse1.equals(topVideoPinsAnalyticsResponse3));
        System.assertEquals(false, topVideoPinsAnalyticsResponse2.equals(topVideoPinsAnalyticsResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTopVideoPinsAnalyticsResponse topVideoPinsAnalyticsResponse1 = OASTopVideoPinsAnalyticsResponse.getExample();
        OASTopVideoPinsAnalyticsResponse topVideoPinsAnalyticsResponse2 = new OASTopVideoPinsAnalyticsResponse();

        System.assertEquals(topVideoPinsAnalyticsResponse1.hashCode(), topVideoPinsAnalyticsResponse1.hashCode());
        System.assertEquals(topVideoPinsAnalyticsResponse2.hashCode(), topVideoPinsAnalyticsResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTopVideoPinsAnalyticsResponse topVideoPinsAnalyticsResponse1 = OASTopVideoPinsAnalyticsResponse.getExample();
        OASTopVideoPinsAnalyticsResponse topVideoPinsAnalyticsResponse2 = OASTopVideoPinsAnalyticsResponse.getExample();
        OASTopVideoPinsAnalyticsResponse topVideoPinsAnalyticsResponse3 = new OASTopVideoPinsAnalyticsResponse();
        OASTopVideoPinsAnalyticsResponse topVideoPinsAnalyticsResponse4 = new OASTopVideoPinsAnalyticsResponse();

        System.assert(topVideoPinsAnalyticsResponse1.equals(topVideoPinsAnalyticsResponse2));
        System.assert(topVideoPinsAnalyticsResponse3.equals(topVideoPinsAnalyticsResponse4));
        System.assertEquals(topVideoPinsAnalyticsResponse1.hashCode(), topVideoPinsAnalyticsResponse2.hashCode());
        System.assertEquals(topVideoPinsAnalyticsResponse3.hashCode(), topVideoPinsAnalyticsResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASTopVideoPinsAnalyticsResponse topVideoPinsAnalyticsResponse = new OASTopVideoPinsAnalyticsResponse();
        Map<String, String> x-property-mappings = topVideoPinsAnalyticsResponse.getx-property-mappings();
        System.assertEquals('dateAvailability', x-property-mappings.get('date_availability'));
        System.assertEquals('sortBy', x-property-mappings.get('sort_by'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASTopVideoPinsAnalyticsResponse topVideoPinsAnalyticsResponse = new OASTopVideoPinsAnalyticsResponse();
        System.assertEquals(new List<OASTopVideoPinsAnalyticsResponsePins>(), topVideoPinsAnalyticsResponse.pins);
        System.assertEquals(null, topVideoPinsAnalyticsResponse.dateAvailability);
        System.assertEquals(null, topVideoPinsAnalyticsResponse.sortBy);
    }
}
