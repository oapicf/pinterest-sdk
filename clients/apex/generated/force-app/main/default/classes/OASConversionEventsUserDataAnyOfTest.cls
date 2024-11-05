@isTest
private class OASConversionEventsUserDataAnyOfTest {
    @isTest
    private static void equalsSameInstance() {
        OASConversionEventsUserDataAnyOf conversionEventsUserDataAnyOf1 = OASConversionEventsUserDataAnyOf.getExample();
        OASConversionEventsUserDataAnyOf conversionEventsUserDataAnyOf2 = conversionEventsUserDataAnyOf1;
        OASConversionEventsUserDataAnyOf conversionEventsUserDataAnyOf3 = new OASConversionEventsUserDataAnyOf();
        OASConversionEventsUserDataAnyOf conversionEventsUserDataAnyOf4 = conversionEventsUserDataAnyOf3;

        System.assert(conversionEventsUserDataAnyOf1.equals(conversionEventsUserDataAnyOf2));
        System.assert(conversionEventsUserDataAnyOf2.equals(conversionEventsUserDataAnyOf1));
        System.assert(conversionEventsUserDataAnyOf1.equals(conversionEventsUserDataAnyOf1));
        System.assert(conversionEventsUserDataAnyOf3.equals(conversionEventsUserDataAnyOf4));
        System.assert(conversionEventsUserDataAnyOf4.equals(conversionEventsUserDataAnyOf3));
        System.assert(conversionEventsUserDataAnyOf3.equals(conversionEventsUserDataAnyOf3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASConversionEventsUserDataAnyOf conversionEventsUserDataAnyOf1 = OASConversionEventsUserDataAnyOf.getExample();
        OASConversionEventsUserDataAnyOf conversionEventsUserDataAnyOf2 = OASConversionEventsUserDataAnyOf.getExample();
        OASConversionEventsUserDataAnyOf conversionEventsUserDataAnyOf3 = new OASConversionEventsUserDataAnyOf();
        OASConversionEventsUserDataAnyOf conversionEventsUserDataAnyOf4 = new OASConversionEventsUserDataAnyOf();

        System.assert(conversionEventsUserDataAnyOf1.equals(conversionEventsUserDataAnyOf2));
        System.assert(conversionEventsUserDataAnyOf2.equals(conversionEventsUserDataAnyOf1));
        System.assert(conversionEventsUserDataAnyOf3.equals(conversionEventsUserDataAnyOf4));
        System.assert(conversionEventsUserDataAnyOf4.equals(conversionEventsUserDataAnyOf3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASConversionEventsUserDataAnyOf conversionEventsUserDataAnyOf1 = OASConversionEventsUserDataAnyOf.getExample();
        OASConversionEventsUserDataAnyOf conversionEventsUserDataAnyOf2 = new OASConversionEventsUserDataAnyOf();

        System.assertEquals(false, conversionEventsUserDataAnyOf1.equals('foo'));
        System.assertEquals(false, conversionEventsUserDataAnyOf2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASConversionEventsUserDataAnyOf conversionEventsUserDataAnyOf1 = OASConversionEventsUserDataAnyOf.getExample();
        OASConversionEventsUserDataAnyOf conversionEventsUserDataAnyOf2 = new OASConversionEventsUserDataAnyOf();
        OASConversionEventsUserDataAnyOf conversionEventsUserDataAnyOf3;

        System.assertEquals(false, conversionEventsUserDataAnyOf1.equals(conversionEventsUserDataAnyOf3));
        System.assertEquals(false, conversionEventsUserDataAnyOf2.equals(conversionEventsUserDataAnyOf3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASConversionEventsUserDataAnyOf conversionEventsUserDataAnyOf1 = OASConversionEventsUserDataAnyOf.getExample();
        OASConversionEventsUserDataAnyOf conversionEventsUserDataAnyOf2 = new OASConversionEventsUserDataAnyOf();

        System.assertEquals(conversionEventsUserDataAnyOf1.hashCode(), conversionEventsUserDataAnyOf1.hashCode());
        System.assertEquals(conversionEventsUserDataAnyOf2.hashCode(), conversionEventsUserDataAnyOf2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASConversionEventsUserDataAnyOf conversionEventsUserDataAnyOf1 = OASConversionEventsUserDataAnyOf.getExample();
        OASConversionEventsUserDataAnyOf conversionEventsUserDataAnyOf2 = OASConversionEventsUserDataAnyOf.getExample();
        OASConversionEventsUserDataAnyOf conversionEventsUserDataAnyOf3 = new OASConversionEventsUserDataAnyOf();
        OASConversionEventsUserDataAnyOf conversionEventsUserDataAnyOf4 = new OASConversionEventsUserDataAnyOf();

        System.assert(conversionEventsUserDataAnyOf1.equals(conversionEventsUserDataAnyOf2));
        System.assert(conversionEventsUserDataAnyOf3.equals(conversionEventsUserDataAnyOf4));
        System.assertEquals(conversionEventsUserDataAnyOf1.hashCode(), conversionEventsUserDataAnyOf2.hashCode());
        System.assertEquals(conversionEventsUserDataAnyOf3.hashCode(), conversionEventsUserDataAnyOf4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASConversionEventsUserDataAnyOf conversionEventsUserDataAnyOf = new OASConversionEventsUserDataAnyOf();
        Map<String, String> x-property-mappings = conversionEventsUserDataAnyOf.getx-property-mappings();
        System.assertEquals('hashedMaids', x-property-mappings.get('hashed_maids'));
        System.assertEquals('clientIpAddress', x-property-mappings.get('client_ip_address'));
        System.assertEquals('clientUserAgent', x-property-mappings.get('client_user_agent'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASConversionEventsUserDataAnyOf conversionEventsUserDataAnyOf = new OASConversionEventsUserDataAnyOf();
        System.assertEquals(new List<String>(), conversionEventsUserDataAnyOf.em);
        System.assertEquals(new List<String>(), conversionEventsUserDataAnyOf.hashedMaids);
        System.assertEquals(null, conversionEventsUserDataAnyOf.clientIpAddress);
        System.assertEquals(null, conversionEventsUserDataAnyOf.clientUserAgent);
    }
}
