@isTest
private class OASConversionEventResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASConversionEventResponse conversionEventResponse1 = OASConversionEventResponse.getExample();
        OASConversionEventResponse conversionEventResponse2 = conversionEventResponse1;
        OASConversionEventResponse conversionEventResponse3 = new OASConversionEventResponse();
        OASConversionEventResponse conversionEventResponse4 = conversionEventResponse3;

        System.assert(conversionEventResponse1.equals(conversionEventResponse2));
        System.assert(conversionEventResponse2.equals(conversionEventResponse1));
        System.assert(conversionEventResponse1.equals(conversionEventResponse1));
        System.assert(conversionEventResponse3.equals(conversionEventResponse4));
        System.assert(conversionEventResponse4.equals(conversionEventResponse3));
        System.assert(conversionEventResponse3.equals(conversionEventResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASConversionEventResponse conversionEventResponse1 = OASConversionEventResponse.getExample();
        OASConversionEventResponse conversionEventResponse2 = OASConversionEventResponse.getExample();
        OASConversionEventResponse conversionEventResponse3 = new OASConversionEventResponse();
        OASConversionEventResponse conversionEventResponse4 = new OASConversionEventResponse();

        System.assert(conversionEventResponse1.equals(conversionEventResponse2));
        System.assert(conversionEventResponse2.equals(conversionEventResponse1));
        System.assert(conversionEventResponse3.equals(conversionEventResponse4));
        System.assert(conversionEventResponse4.equals(conversionEventResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASConversionEventResponse conversionEventResponse1 = OASConversionEventResponse.getExample();
        OASConversionEventResponse conversionEventResponse2 = new OASConversionEventResponse();

        System.assertEquals(false, conversionEventResponse1.equals('foo'));
        System.assertEquals(false, conversionEventResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASConversionEventResponse conversionEventResponse1 = OASConversionEventResponse.getExample();
        OASConversionEventResponse conversionEventResponse2 = new OASConversionEventResponse();
        OASConversionEventResponse conversionEventResponse3;

        System.assertEquals(false, conversionEventResponse1.equals(conversionEventResponse3));
        System.assertEquals(false, conversionEventResponse2.equals(conversionEventResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASConversionEventResponse conversionEventResponse1 = OASConversionEventResponse.getExample();
        OASConversionEventResponse conversionEventResponse2 = new OASConversionEventResponse();

        System.assertEquals(conversionEventResponse1.hashCode(), conversionEventResponse1.hashCode());
        System.assertEquals(conversionEventResponse2.hashCode(), conversionEventResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASConversionEventResponse conversionEventResponse1 = OASConversionEventResponse.getExample();
        OASConversionEventResponse conversionEventResponse2 = OASConversionEventResponse.getExample();
        OASConversionEventResponse conversionEventResponse3 = new OASConversionEventResponse();
        OASConversionEventResponse conversionEventResponse4 = new OASConversionEventResponse();

        System.assert(conversionEventResponse1.equals(conversionEventResponse2));
        System.assert(conversionEventResponse3.equals(conversionEventResponse4));
        System.assertEquals(conversionEventResponse1.hashCode(), conversionEventResponse2.hashCode());
        System.assertEquals(conversionEventResponse3.hashCode(), conversionEventResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASConversionEventResponse conversionEventResponse = new OASConversionEventResponse();
        Map<String, String> x-property-mappings = conversionEventResponse.getx-property-mappings();
        System.assertEquals('conversionEvent', x-property-mappings.get('conversion_event'));
        System.assertEquals('conversionTagId', x-property-mappings.get('conversion_tag_id'));
        System.assertEquals('adAccountId', x-property-mappings.get('ad_account_id'));
        System.assertEquals('createdTime', x-property-mappings.get('created_time'));
    }
}
