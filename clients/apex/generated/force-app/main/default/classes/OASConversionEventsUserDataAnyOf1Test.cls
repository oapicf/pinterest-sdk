@isTest
private class OASConversionEventsUserDataAnyOf1Test {
    @isTest
    private static void equalsSameInstance() {
        OASConversionEventsUserDataAnyOf1 conversionEventsUserDataAnyOf11 = OASConversionEventsUserDataAnyOf1.getExample();
        OASConversionEventsUserDataAnyOf1 conversionEventsUserDataAnyOf12 = conversionEventsUserDataAnyOf11;
        OASConversionEventsUserDataAnyOf1 conversionEventsUserDataAnyOf13 = new OASConversionEventsUserDataAnyOf1();
        OASConversionEventsUserDataAnyOf1 conversionEventsUserDataAnyOf14 = conversionEventsUserDataAnyOf13;

        System.assert(conversionEventsUserDataAnyOf11.equals(conversionEventsUserDataAnyOf12));
        System.assert(conversionEventsUserDataAnyOf12.equals(conversionEventsUserDataAnyOf11));
        System.assert(conversionEventsUserDataAnyOf11.equals(conversionEventsUserDataAnyOf11));
        System.assert(conversionEventsUserDataAnyOf13.equals(conversionEventsUserDataAnyOf14));
        System.assert(conversionEventsUserDataAnyOf14.equals(conversionEventsUserDataAnyOf13));
        System.assert(conversionEventsUserDataAnyOf13.equals(conversionEventsUserDataAnyOf13));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASConversionEventsUserDataAnyOf1 conversionEventsUserDataAnyOf11 = OASConversionEventsUserDataAnyOf1.getExample();
        OASConversionEventsUserDataAnyOf1 conversionEventsUserDataAnyOf12 = OASConversionEventsUserDataAnyOf1.getExample();
        OASConversionEventsUserDataAnyOf1 conversionEventsUserDataAnyOf13 = new OASConversionEventsUserDataAnyOf1();
        OASConversionEventsUserDataAnyOf1 conversionEventsUserDataAnyOf14 = new OASConversionEventsUserDataAnyOf1();

        System.assert(conversionEventsUserDataAnyOf11.equals(conversionEventsUserDataAnyOf12));
        System.assert(conversionEventsUserDataAnyOf12.equals(conversionEventsUserDataAnyOf11));
        System.assert(conversionEventsUserDataAnyOf13.equals(conversionEventsUserDataAnyOf14));
        System.assert(conversionEventsUserDataAnyOf14.equals(conversionEventsUserDataAnyOf13));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASConversionEventsUserDataAnyOf1 conversionEventsUserDataAnyOf11 = OASConversionEventsUserDataAnyOf1.getExample();
        OASConversionEventsUserDataAnyOf1 conversionEventsUserDataAnyOf12 = new OASConversionEventsUserDataAnyOf1();

        System.assertEquals(false, conversionEventsUserDataAnyOf11.equals('foo'));
        System.assertEquals(false, conversionEventsUserDataAnyOf12.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASConversionEventsUserDataAnyOf1 conversionEventsUserDataAnyOf11 = OASConversionEventsUserDataAnyOf1.getExample();
        OASConversionEventsUserDataAnyOf1 conversionEventsUserDataAnyOf12 = new OASConversionEventsUserDataAnyOf1();
        OASConversionEventsUserDataAnyOf1 conversionEventsUserDataAnyOf13;

        System.assertEquals(false, conversionEventsUserDataAnyOf11.equals(conversionEventsUserDataAnyOf13));
        System.assertEquals(false, conversionEventsUserDataAnyOf12.equals(conversionEventsUserDataAnyOf13));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASConversionEventsUserDataAnyOf1 conversionEventsUserDataAnyOf11 = OASConversionEventsUserDataAnyOf1.getExample();
        OASConversionEventsUserDataAnyOf1 conversionEventsUserDataAnyOf12 = new OASConversionEventsUserDataAnyOf1();

        System.assertEquals(conversionEventsUserDataAnyOf11.hashCode(), conversionEventsUserDataAnyOf11.hashCode());
        System.assertEquals(conversionEventsUserDataAnyOf12.hashCode(), conversionEventsUserDataAnyOf12.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASConversionEventsUserDataAnyOf1 conversionEventsUserDataAnyOf11 = OASConversionEventsUserDataAnyOf1.getExample();
        OASConversionEventsUserDataAnyOf1 conversionEventsUserDataAnyOf12 = OASConversionEventsUserDataAnyOf1.getExample();
        OASConversionEventsUserDataAnyOf1 conversionEventsUserDataAnyOf13 = new OASConversionEventsUserDataAnyOf1();
        OASConversionEventsUserDataAnyOf1 conversionEventsUserDataAnyOf14 = new OASConversionEventsUserDataAnyOf1();

        System.assert(conversionEventsUserDataAnyOf11.equals(conversionEventsUserDataAnyOf12));
        System.assert(conversionEventsUserDataAnyOf13.equals(conversionEventsUserDataAnyOf14));
        System.assertEquals(conversionEventsUserDataAnyOf11.hashCode(), conversionEventsUserDataAnyOf12.hashCode());
        System.assertEquals(conversionEventsUserDataAnyOf13.hashCode(), conversionEventsUserDataAnyOf14.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASConversionEventsUserDataAnyOf1 conversionEventsUserDataAnyOf1 = new OASConversionEventsUserDataAnyOf1();
        Map<String, String> x-property-mappings = conversionEventsUserDataAnyOf1.getx-property-mappings();
        System.assertEquals('hashedMaids', x-property-mappings.get('hashed_maids'));
        System.assertEquals('clientIpAddress', x-property-mappings.get('client_ip_address'));
        System.assertEquals('clientUserAgent', x-property-mappings.get('client_user_agent'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASConversionEventsUserDataAnyOf1 conversionEventsUserDataAnyOf1 = new OASConversionEventsUserDataAnyOf1();
        System.assertEquals(new List<String>(), conversionEventsUserDataAnyOf1.em);
        System.assertEquals(new List<String>(), conversionEventsUserDataAnyOf1.hashedMaids);
        System.assertEquals(null, conversionEventsUserDataAnyOf1.clientIpAddress);
        System.assertEquals(null, conversionEventsUserDataAnyOf1.clientUserAgent);
    }
}
