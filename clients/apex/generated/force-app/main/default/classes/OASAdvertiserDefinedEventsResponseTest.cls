@isTest
private class OASAdvertiserDefinedEventsResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdvertiserDefinedEventsResponse advertiserDefinedEventsResponse1 = OASAdvertiserDefinedEventsResponse.getExample();
        OASAdvertiserDefinedEventsResponse advertiserDefinedEventsResponse2 = advertiserDefinedEventsResponse1;
        OASAdvertiserDefinedEventsResponse advertiserDefinedEventsResponse3 = new OASAdvertiserDefinedEventsResponse();
        OASAdvertiserDefinedEventsResponse advertiserDefinedEventsResponse4 = advertiserDefinedEventsResponse3;

        System.assert(advertiserDefinedEventsResponse1.equals(advertiserDefinedEventsResponse2));
        System.assert(advertiserDefinedEventsResponse2.equals(advertiserDefinedEventsResponse1));
        System.assert(advertiserDefinedEventsResponse1.equals(advertiserDefinedEventsResponse1));
        System.assert(advertiserDefinedEventsResponse3.equals(advertiserDefinedEventsResponse4));
        System.assert(advertiserDefinedEventsResponse4.equals(advertiserDefinedEventsResponse3));
        System.assert(advertiserDefinedEventsResponse3.equals(advertiserDefinedEventsResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdvertiserDefinedEventsResponse advertiserDefinedEventsResponse1 = OASAdvertiserDefinedEventsResponse.getExample();
        OASAdvertiserDefinedEventsResponse advertiserDefinedEventsResponse2 = OASAdvertiserDefinedEventsResponse.getExample();
        OASAdvertiserDefinedEventsResponse advertiserDefinedEventsResponse3 = new OASAdvertiserDefinedEventsResponse();
        OASAdvertiserDefinedEventsResponse advertiserDefinedEventsResponse4 = new OASAdvertiserDefinedEventsResponse();

        System.assert(advertiserDefinedEventsResponse1.equals(advertiserDefinedEventsResponse2));
        System.assert(advertiserDefinedEventsResponse2.equals(advertiserDefinedEventsResponse1));
        System.assert(advertiserDefinedEventsResponse3.equals(advertiserDefinedEventsResponse4));
        System.assert(advertiserDefinedEventsResponse4.equals(advertiserDefinedEventsResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdvertiserDefinedEventsResponse advertiserDefinedEventsResponse1 = OASAdvertiserDefinedEventsResponse.getExample();
        OASAdvertiserDefinedEventsResponse advertiserDefinedEventsResponse2 = new OASAdvertiserDefinedEventsResponse();

        System.assertEquals(false, advertiserDefinedEventsResponse1.equals('foo'));
        System.assertEquals(false, advertiserDefinedEventsResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdvertiserDefinedEventsResponse advertiserDefinedEventsResponse1 = OASAdvertiserDefinedEventsResponse.getExample();
        OASAdvertiserDefinedEventsResponse advertiserDefinedEventsResponse2 = new OASAdvertiserDefinedEventsResponse();
        OASAdvertiserDefinedEventsResponse advertiserDefinedEventsResponse3;

        System.assertEquals(false, advertiserDefinedEventsResponse1.equals(advertiserDefinedEventsResponse3));
        System.assertEquals(false, advertiserDefinedEventsResponse2.equals(advertiserDefinedEventsResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdvertiserDefinedEventsResponse advertiserDefinedEventsResponse1 = OASAdvertiserDefinedEventsResponse.getExample();
        OASAdvertiserDefinedEventsResponse advertiserDefinedEventsResponse2 = new OASAdvertiserDefinedEventsResponse();

        System.assertEquals(advertiserDefinedEventsResponse1.hashCode(), advertiserDefinedEventsResponse1.hashCode());
        System.assertEquals(advertiserDefinedEventsResponse2.hashCode(), advertiserDefinedEventsResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdvertiserDefinedEventsResponse advertiserDefinedEventsResponse1 = OASAdvertiserDefinedEventsResponse.getExample();
        OASAdvertiserDefinedEventsResponse advertiserDefinedEventsResponse2 = OASAdvertiserDefinedEventsResponse.getExample();
        OASAdvertiserDefinedEventsResponse advertiserDefinedEventsResponse3 = new OASAdvertiserDefinedEventsResponse();
        OASAdvertiserDefinedEventsResponse advertiserDefinedEventsResponse4 = new OASAdvertiserDefinedEventsResponse();

        System.assert(advertiserDefinedEventsResponse1.equals(advertiserDefinedEventsResponse2));
        System.assert(advertiserDefinedEventsResponse3.equals(advertiserDefinedEventsResponse4));
        System.assertEquals(advertiserDefinedEventsResponse1.hashCode(), advertiserDefinedEventsResponse2.hashCode());
        System.assertEquals(advertiserDefinedEventsResponse3.hashCode(), advertiserDefinedEventsResponse4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAdvertiserDefinedEventsResponse advertiserDefinedEventsResponse = new OASAdvertiserDefinedEventsResponse();
        System.assertEquals(new List<OASAdvertiserDefinedEvent>(), advertiserDefinedEventsResponse.items);
    }
}
