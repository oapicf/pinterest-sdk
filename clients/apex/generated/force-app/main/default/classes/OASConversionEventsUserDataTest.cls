@isTest
private class OASConversionEventsUserDataTest {
    @isTest
    private static void equalsSameInstance() {
        OASConversionEventsUserData conversionEventsUserData1 = OASConversionEventsUserData.getExample();
        OASConversionEventsUserData conversionEventsUserData2 = conversionEventsUserData1;
        OASConversionEventsUserData conversionEventsUserData3 = new OASConversionEventsUserData();
        OASConversionEventsUserData conversionEventsUserData4 = conversionEventsUserData3;

        System.assert(conversionEventsUserData1.equals(conversionEventsUserData2));
        System.assert(conversionEventsUserData2.equals(conversionEventsUserData1));
        System.assert(conversionEventsUserData1.equals(conversionEventsUserData1));
        System.assert(conversionEventsUserData3.equals(conversionEventsUserData4));
        System.assert(conversionEventsUserData4.equals(conversionEventsUserData3));
        System.assert(conversionEventsUserData3.equals(conversionEventsUserData3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASConversionEventsUserData conversionEventsUserData1 = OASConversionEventsUserData.getExample();
        OASConversionEventsUserData conversionEventsUserData2 = OASConversionEventsUserData.getExample();
        OASConversionEventsUserData conversionEventsUserData3 = new OASConversionEventsUserData();
        OASConversionEventsUserData conversionEventsUserData4 = new OASConversionEventsUserData();

        System.assert(conversionEventsUserData1.equals(conversionEventsUserData2));
        System.assert(conversionEventsUserData2.equals(conversionEventsUserData1));
        System.assert(conversionEventsUserData3.equals(conversionEventsUserData4));
        System.assert(conversionEventsUserData4.equals(conversionEventsUserData3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASConversionEventsUserData conversionEventsUserData1 = OASConversionEventsUserData.getExample();
        OASConversionEventsUserData conversionEventsUserData2 = new OASConversionEventsUserData();

        System.assertEquals(false, conversionEventsUserData1.equals('foo'));
        System.assertEquals(false, conversionEventsUserData2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASConversionEventsUserData conversionEventsUserData1 = OASConversionEventsUserData.getExample();
        OASConversionEventsUserData conversionEventsUserData2 = new OASConversionEventsUserData();
        OASConversionEventsUserData conversionEventsUserData3;

        System.assertEquals(false, conversionEventsUserData1.equals(conversionEventsUserData3));
        System.assertEquals(false, conversionEventsUserData2.equals(conversionEventsUserData3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASConversionEventsUserData conversionEventsUserData1 = OASConversionEventsUserData.getExample();
        OASConversionEventsUserData conversionEventsUserData2 = new OASConversionEventsUserData();

        System.assertEquals(conversionEventsUserData1.hashCode(), conversionEventsUserData1.hashCode());
        System.assertEquals(conversionEventsUserData2.hashCode(), conversionEventsUserData2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASConversionEventsUserData conversionEventsUserData1 = OASConversionEventsUserData.getExample();
        OASConversionEventsUserData conversionEventsUserData2 = OASConversionEventsUserData.getExample();
        OASConversionEventsUserData conversionEventsUserData3 = new OASConversionEventsUserData();
        OASConversionEventsUserData conversionEventsUserData4 = new OASConversionEventsUserData();

        System.assert(conversionEventsUserData1.equals(conversionEventsUserData2));
        System.assert(conversionEventsUserData3.equals(conversionEventsUserData4));
        System.assertEquals(conversionEventsUserData1.hashCode(), conversionEventsUserData2.hashCode());
        System.assertEquals(conversionEventsUserData3.hashCode(), conversionEventsUserData4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASConversionEventsUserData conversionEventsUserData = new OASConversionEventsUserData();
        Map<String, String> x-property-mappings = conversionEventsUserData.getx-property-mappings();
        System.assertEquals('externalId', x-property-mappings.get('external_id'));
        System.assertEquals('clickId', x-property-mappings.get('click_id'));
        System.assertEquals('partnerId', x-property-mappings.get('partner_id'));
        System.assertEquals('hashedMaids', x-property-mappings.get('hashed_maids'));
        System.assertEquals('clientIpAddress', x-property-mappings.get('client_ip_address'));
        System.assertEquals('clientUserAgent', x-property-mappings.get('client_user_agent'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASConversionEventsUserData conversionEventsUserData = new OASConversionEventsUserData();
        System.assertEquals(new List<String>(), conversionEventsUserData.ph);
        System.assertEquals(new List<String>(), conversionEventsUserData.ge);
        System.assertEquals(new List<String>(), conversionEventsUserData.db);
        System.assertEquals(new List<String>(), conversionEventsUserData.ln);
        System.assertEquals(new List<String>(), conversionEventsUserData.fn);
        System.assertEquals(new List<String>(), conversionEventsUserData.ct);
        System.assertEquals(new List<String>(), conversionEventsUserData.st);
        System.assertEquals(new List<String>(), conversionEventsUserData.zp);
        System.assertEquals(new List<String>(), conversionEventsUserData.country);
        System.assertEquals(new List<String>(), conversionEventsUserData.externalId);
        System.assertEquals(new List<String>(), conversionEventsUserData.em);
        System.assertEquals(new List<String>(), conversionEventsUserData.hashedMaids);
        System.assertEquals(null, conversionEventsUserData.clickId);
        System.assertEquals(null, conversionEventsUserData.partnerId);
        System.assertEquals(null, conversionEventsUserData.clientIpAddress);
        System.assertEquals(null, conversionEventsUserData.clientUserAgent);
    }
}
