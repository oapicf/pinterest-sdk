@isTest
private class OASConversionEventsUserDataAnyOf2Test {
    @isTest
    private static void equalsSameInstance() {
        OASConversionEventsUserDataAnyOf2 conversionEventsUserDataAnyOf21 = OASConversionEventsUserDataAnyOf2.getExample();
        OASConversionEventsUserDataAnyOf2 conversionEventsUserDataAnyOf22 = conversionEventsUserDataAnyOf21;
        OASConversionEventsUserDataAnyOf2 conversionEventsUserDataAnyOf23 = new OASConversionEventsUserDataAnyOf2();
        OASConversionEventsUserDataAnyOf2 conversionEventsUserDataAnyOf24 = conversionEventsUserDataAnyOf23;

        System.assert(conversionEventsUserDataAnyOf21.equals(conversionEventsUserDataAnyOf22));
        System.assert(conversionEventsUserDataAnyOf22.equals(conversionEventsUserDataAnyOf21));
        System.assert(conversionEventsUserDataAnyOf21.equals(conversionEventsUserDataAnyOf21));
        System.assert(conversionEventsUserDataAnyOf23.equals(conversionEventsUserDataAnyOf24));
        System.assert(conversionEventsUserDataAnyOf24.equals(conversionEventsUserDataAnyOf23));
        System.assert(conversionEventsUserDataAnyOf23.equals(conversionEventsUserDataAnyOf23));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASConversionEventsUserDataAnyOf2 conversionEventsUserDataAnyOf21 = OASConversionEventsUserDataAnyOf2.getExample();
        OASConversionEventsUserDataAnyOf2 conversionEventsUserDataAnyOf22 = OASConversionEventsUserDataAnyOf2.getExample();
        OASConversionEventsUserDataAnyOf2 conversionEventsUserDataAnyOf23 = new OASConversionEventsUserDataAnyOf2();
        OASConversionEventsUserDataAnyOf2 conversionEventsUserDataAnyOf24 = new OASConversionEventsUserDataAnyOf2();

        System.assert(conversionEventsUserDataAnyOf21.equals(conversionEventsUserDataAnyOf22));
        System.assert(conversionEventsUserDataAnyOf22.equals(conversionEventsUserDataAnyOf21));
        System.assert(conversionEventsUserDataAnyOf23.equals(conversionEventsUserDataAnyOf24));
        System.assert(conversionEventsUserDataAnyOf24.equals(conversionEventsUserDataAnyOf23));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASConversionEventsUserDataAnyOf2 conversionEventsUserDataAnyOf21 = OASConversionEventsUserDataAnyOf2.getExample();
        OASConversionEventsUserDataAnyOf2 conversionEventsUserDataAnyOf22 = new OASConversionEventsUserDataAnyOf2();

        System.assertEquals(false, conversionEventsUserDataAnyOf21.equals('foo'));
        System.assertEquals(false, conversionEventsUserDataAnyOf22.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASConversionEventsUserDataAnyOf2 conversionEventsUserDataAnyOf21 = OASConversionEventsUserDataAnyOf2.getExample();
        OASConversionEventsUserDataAnyOf2 conversionEventsUserDataAnyOf22 = new OASConversionEventsUserDataAnyOf2();
        OASConversionEventsUserDataAnyOf2 conversionEventsUserDataAnyOf23;

        System.assertEquals(false, conversionEventsUserDataAnyOf21.equals(conversionEventsUserDataAnyOf23));
        System.assertEquals(false, conversionEventsUserDataAnyOf22.equals(conversionEventsUserDataAnyOf23));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASConversionEventsUserDataAnyOf2 conversionEventsUserDataAnyOf21 = OASConversionEventsUserDataAnyOf2.getExample();
        OASConversionEventsUserDataAnyOf2 conversionEventsUserDataAnyOf22 = new OASConversionEventsUserDataAnyOf2();

        System.assertEquals(conversionEventsUserDataAnyOf21.hashCode(), conversionEventsUserDataAnyOf21.hashCode());
        System.assertEquals(conversionEventsUserDataAnyOf22.hashCode(), conversionEventsUserDataAnyOf22.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASConversionEventsUserDataAnyOf2 conversionEventsUserDataAnyOf21 = OASConversionEventsUserDataAnyOf2.getExample();
        OASConversionEventsUserDataAnyOf2 conversionEventsUserDataAnyOf22 = OASConversionEventsUserDataAnyOf2.getExample();
        OASConversionEventsUserDataAnyOf2 conversionEventsUserDataAnyOf23 = new OASConversionEventsUserDataAnyOf2();
        OASConversionEventsUserDataAnyOf2 conversionEventsUserDataAnyOf24 = new OASConversionEventsUserDataAnyOf2();

        System.assert(conversionEventsUserDataAnyOf21.equals(conversionEventsUserDataAnyOf22));
        System.assert(conversionEventsUserDataAnyOf23.equals(conversionEventsUserDataAnyOf24));
        System.assertEquals(conversionEventsUserDataAnyOf21.hashCode(), conversionEventsUserDataAnyOf22.hashCode());
        System.assertEquals(conversionEventsUserDataAnyOf23.hashCode(), conversionEventsUserDataAnyOf24.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASConversionEventsUserDataAnyOf2 conversionEventsUserDataAnyOf2 = new OASConversionEventsUserDataAnyOf2();
        Map<String, String> x-property-mappings = conversionEventsUserDataAnyOf2.getx-property-mappings();
        System.assertEquals('hashedMaids', x-property-mappings.get('hashed_maids'));
        System.assertEquals('clientIpAddress', x-property-mappings.get('client_ip_address'));
        System.assertEquals('clientUserAgent', x-property-mappings.get('client_user_agent'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASConversionEventsUserDataAnyOf2 conversionEventsUserDataAnyOf2 = new OASConversionEventsUserDataAnyOf2();
        System.assertEquals(new List<String>(), conversionEventsUserDataAnyOf2.em);
        System.assertEquals(new List<String>(), conversionEventsUserDataAnyOf2.hashedMaids);
        System.assertEquals(null, conversionEventsUserDataAnyOf2.clientIpAddress);
        System.assertEquals(null, conversionEventsUserDataAnyOf2.clientUserAgent);
    }
}
