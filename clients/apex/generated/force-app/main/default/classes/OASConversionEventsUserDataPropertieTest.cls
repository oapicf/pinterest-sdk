@isTest
private class OASConversionEventsUserDataPropertieTest {
    @isTest
    private static void equalsSameInstance() {
        OASConversionEventsUserDataPropertie conversionEventsUserDataProperties1 = OASConversionEventsUserDataPropertie.getExample();
        OASConversionEventsUserDataPropertie conversionEventsUserDataProperties2 = conversionEventsUserDataProperties1;
        OASConversionEventsUserDataPropertie conversionEventsUserDataProperties3 = new OASConversionEventsUserDataPropertie();
        OASConversionEventsUserDataPropertie conversionEventsUserDataProperties4 = conversionEventsUserDataProperties3;

        System.assert(conversionEventsUserDataProperties1.equals(conversionEventsUserDataProperties2));
        System.assert(conversionEventsUserDataProperties2.equals(conversionEventsUserDataProperties1));
        System.assert(conversionEventsUserDataProperties1.equals(conversionEventsUserDataProperties1));
        System.assert(conversionEventsUserDataProperties3.equals(conversionEventsUserDataProperties4));
        System.assert(conversionEventsUserDataProperties4.equals(conversionEventsUserDataProperties3));
        System.assert(conversionEventsUserDataProperties3.equals(conversionEventsUserDataProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASConversionEventsUserDataPropertie conversionEventsUserDataProperties1 = OASConversionEventsUserDataPropertie.getExample();
        OASConversionEventsUserDataPropertie conversionEventsUserDataProperties2 = OASConversionEventsUserDataPropertie.getExample();
        OASConversionEventsUserDataPropertie conversionEventsUserDataProperties3 = new OASConversionEventsUserDataPropertie();
        OASConversionEventsUserDataPropertie conversionEventsUserDataProperties4 = new OASConversionEventsUserDataPropertie();

        System.assert(conversionEventsUserDataProperties1.equals(conversionEventsUserDataProperties2));
        System.assert(conversionEventsUserDataProperties2.equals(conversionEventsUserDataProperties1));
        System.assert(conversionEventsUserDataProperties3.equals(conversionEventsUserDataProperties4));
        System.assert(conversionEventsUserDataProperties4.equals(conversionEventsUserDataProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASConversionEventsUserDataPropertie conversionEventsUserDataProperties1 = OASConversionEventsUserDataPropertie.getExample();
        OASConversionEventsUserDataPropertie conversionEventsUserDataProperties2 = new OASConversionEventsUserDataPropertie();

        System.assertEquals(false, conversionEventsUserDataProperties1.equals('foo'));
        System.assertEquals(false, conversionEventsUserDataProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASConversionEventsUserDataPropertie conversionEventsUserDataProperties1 = OASConversionEventsUserDataPropertie.getExample();
        OASConversionEventsUserDataPropertie conversionEventsUserDataProperties2 = new OASConversionEventsUserDataPropertie();
        OASConversionEventsUserDataPropertie conversionEventsUserDataProperties3;

        System.assertEquals(false, conversionEventsUserDataProperties1.equals(conversionEventsUserDataProperties3));
        System.assertEquals(false, conversionEventsUserDataProperties2.equals(conversionEventsUserDataProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASConversionEventsUserDataPropertie conversionEventsUserDataProperties1 = OASConversionEventsUserDataPropertie.getExample();
        OASConversionEventsUserDataPropertie conversionEventsUserDataProperties2 = new OASConversionEventsUserDataPropertie();

        System.assertEquals(conversionEventsUserDataProperties1.hashCode(), conversionEventsUserDataProperties1.hashCode());
        System.assertEquals(conversionEventsUserDataProperties2.hashCode(), conversionEventsUserDataProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASConversionEventsUserDataPropertie conversionEventsUserDataProperties1 = OASConversionEventsUserDataPropertie.getExample();
        OASConversionEventsUserDataPropertie conversionEventsUserDataProperties2 = OASConversionEventsUserDataPropertie.getExample();
        OASConversionEventsUserDataPropertie conversionEventsUserDataProperties3 = new OASConversionEventsUserDataPropertie();
        OASConversionEventsUserDataPropertie conversionEventsUserDataProperties4 = new OASConversionEventsUserDataPropertie();

        System.assert(conversionEventsUserDataProperties1.equals(conversionEventsUserDataProperties2));
        System.assert(conversionEventsUserDataProperties3.equals(conversionEventsUserDataProperties4));
        System.assertEquals(conversionEventsUserDataProperties1.hashCode(), conversionEventsUserDataProperties2.hashCode());
        System.assertEquals(conversionEventsUserDataProperties3.hashCode(), conversionEventsUserDataProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASConversionEventsUserDataPropertie conversionEventsUserDataProperties = new OASConversionEventsUserDataPropertie();
        Map<String, String> x-property-mappings = conversionEventsUserDataProperties.getx-property-mappings();
        System.assertEquals('clickId', x-property-mappings.get('click_id'));
        System.assertEquals('clientIpAddress', x-property-mappings.get('client_ip_address'));
        System.assertEquals('clientUserAgent', x-property-mappings.get('client_user_agent'));
        System.assertEquals('externalId', x-property-mappings.get('external_id'));
        System.assertEquals('hashedMaids', x-property-mappings.get('hashed_maids'));
        System.assertEquals('partnerId', x-property-mappings.get('partner_id'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASConversionEventsUserDataPropertie conversionEventsUserDataProperties = new OASConversionEventsUserDataPropertie();
        System.assertEquals(new List<String>(), conversionEventsUserDataProperties.country);
        System.assertEquals(new List<String>(), conversionEventsUserDataProperties.ct);
        System.assertEquals(new List<String>(), conversionEventsUserDataProperties.db);
        System.assertEquals(new List<String>(), conversionEventsUserDataProperties.em);
        System.assertEquals(new List<String>(), conversionEventsUserDataProperties.externalId);
        System.assertEquals(new List<String>(), conversionEventsUserDataProperties.fn);
        System.assertEquals(new List<String>(), conversionEventsUserDataProperties.ge);
        System.assertEquals(new List<String>(), conversionEventsUserDataProperties.hashedMaids);
        System.assertEquals(new List<String>(), conversionEventsUserDataProperties.ln);
        System.assertEquals(new List<String>(), conversionEventsUserDataProperties.ph);
        System.assertEquals(new List<String>(), conversionEventsUserDataProperties.st);
        System.assertEquals(new List<String>(), conversionEventsUserDataProperties.zp);
        System.assertEquals(null, conversionEventsUserDataProperties.clickId);
        System.assertEquals(null, conversionEventsUserDataProperties.clientIpAddress);
        System.assertEquals(null, conversionEventsUserDataProperties.clientUserAgent);
        System.assertEquals(null, conversionEventsUserDataProperties.partnerId);
    }
}
