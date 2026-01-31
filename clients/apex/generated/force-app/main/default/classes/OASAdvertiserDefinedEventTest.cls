@isTest
private class OASAdvertiserDefinedEventTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdvertiserDefinedEvent advertiserDefinedEvent1 = OASAdvertiserDefinedEvent.getExample();
        OASAdvertiserDefinedEvent advertiserDefinedEvent2 = advertiserDefinedEvent1;
        OASAdvertiserDefinedEvent advertiserDefinedEvent3 = new OASAdvertiserDefinedEvent();
        OASAdvertiserDefinedEvent advertiserDefinedEvent4 = advertiserDefinedEvent3;

        System.assert(advertiserDefinedEvent1.equals(advertiserDefinedEvent2));
        System.assert(advertiserDefinedEvent2.equals(advertiserDefinedEvent1));
        System.assert(advertiserDefinedEvent1.equals(advertiserDefinedEvent1));
        System.assert(advertiserDefinedEvent3.equals(advertiserDefinedEvent4));
        System.assert(advertiserDefinedEvent4.equals(advertiserDefinedEvent3));
        System.assert(advertiserDefinedEvent3.equals(advertiserDefinedEvent3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdvertiserDefinedEvent advertiserDefinedEvent1 = OASAdvertiserDefinedEvent.getExample();
        OASAdvertiserDefinedEvent advertiserDefinedEvent2 = OASAdvertiserDefinedEvent.getExample();
        OASAdvertiserDefinedEvent advertiserDefinedEvent3 = new OASAdvertiserDefinedEvent();
        OASAdvertiserDefinedEvent advertiserDefinedEvent4 = new OASAdvertiserDefinedEvent();

        System.assert(advertiserDefinedEvent1.equals(advertiserDefinedEvent2));
        System.assert(advertiserDefinedEvent2.equals(advertiserDefinedEvent1));
        System.assert(advertiserDefinedEvent3.equals(advertiserDefinedEvent4));
        System.assert(advertiserDefinedEvent4.equals(advertiserDefinedEvent3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdvertiserDefinedEvent advertiserDefinedEvent1 = OASAdvertiserDefinedEvent.getExample();
        OASAdvertiserDefinedEvent advertiserDefinedEvent2 = new OASAdvertiserDefinedEvent();

        System.assertEquals(false, advertiserDefinedEvent1.equals('foo'));
        System.assertEquals(false, advertiserDefinedEvent2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdvertiserDefinedEvent advertiserDefinedEvent1 = OASAdvertiserDefinedEvent.getExample();
        OASAdvertiserDefinedEvent advertiserDefinedEvent2 = new OASAdvertiserDefinedEvent();
        OASAdvertiserDefinedEvent advertiserDefinedEvent3;

        System.assertEquals(false, advertiserDefinedEvent1.equals(advertiserDefinedEvent3));
        System.assertEquals(false, advertiserDefinedEvent2.equals(advertiserDefinedEvent3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdvertiserDefinedEvent advertiserDefinedEvent1 = OASAdvertiserDefinedEvent.getExample();
        OASAdvertiserDefinedEvent advertiserDefinedEvent2 = new OASAdvertiserDefinedEvent();

        System.assertEquals(advertiserDefinedEvent1.hashCode(), advertiserDefinedEvent1.hashCode());
        System.assertEquals(advertiserDefinedEvent2.hashCode(), advertiserDefinedEvent2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdvertiserDefinedEvent advertiserDefinedEvent1 = OASAdvertiserDefinedEvent.getExample();
        OASAdvertiserDefinedEvent advertiserDefinedEvent2 = OASAdvertiserDefinedEvent.getExample();
        OASAdvertiserDefinedEvent advertiserDefinedEvent3 = new OASAdvertiserDefinedEvent();
        OASAdvertiserDefinedEvent advertiserDefinedEvent4 = new OASAdvertiserDefinedEvent();

        System.assert(advertiserDefinedEvent1.equals(advertiserDefinedEvent2));
        System.assert(advertiserDefinedEvent3.equals(advertiserDefinedEvent4));
        System.assertEquals(advertiserDefinedEvent1.hashCode(), advertiserDefinedEvent2.hashCode());
        System.assertEquals(advertiserDefinedEvent3.hashCode(), advertiserDefinedEvent4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAdvertiserDefinedEvent advertiserDefinedEvent = new OASAdvertiserDefinedEvent();
        Map<String, String> x-property-mappings = advertiserDefinedEvent.getx-property-mappings();
        System.assertEquals('mappedConversionType', x-property-mappings.get('mapped_conversion_type'));
    }
}
