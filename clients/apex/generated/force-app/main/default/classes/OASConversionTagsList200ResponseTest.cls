@isTest
private class OASConversionTagsList200ResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASConversionTagsList200Response conversionTagsList200Response1 = OASConversionTagsList200Response.getExample();
        OASConversionTagsList200Response conversionTagsList200Response2 = conversionTagsList200Response1;
        OASConversionTagsList200Response conversionTagsList200Response3 = new OASConversionTagsList200Response();
        OASConversionTagsList200Response conversionTagsList200Response4 = conversionTagsList200Response3;

        System.assert(conversionTagsList200Response1.equals(conversionTagsList200Response2));
        System.assert(conversionTagsList200Response2.equals(conversionTagsList200Response1));
        System.assert(conversionTagsList200Response1.equals(conversionTagsList200Response1));
        System.assert(conversionTagsList200Response3.equals(conversionTagsList200Response4));
        System.assert(conversionTagsList200Response4.equals(conversionTagsList200Response3));
        System.assert(conversionTagsList200Response3.equals(conversionTagsList200Response3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASConversionTagsList200Response conversionTagsList200Response1 = OASConversionTagsList200Response.getExample();
        OASConversionTagsList200Response conversionTagsList200Response2 = OASConversionTagsList200Response.getExample();
        OASConversionTagsList200Response conversionTagsList200Response3 = new OASConversionTagsList200Response();
        OASConversionTagsList200Response conversionTagsList200Response4 = new OASConversionTagsList200Response();

        System.assert(conversionTagsList200Response1.equals(conversionTagsList200Response2));
        System.assert(conversionTagsList200Response2.equals(conversionTagsList200Response1));
        System.assert(conversionTagsList200Response3.equals(conversionTagsList200Response4));
        System.assert(conversionTagsList200Response4.equals(conversionTagsList200Response3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASConversionTagsList200Response conversionTagsList200Response1 = OASConversionTagsList200Response.getExample();
        OASConversionTagsList200Response conversionTagsList200Response2 = new OASConversionTagsList200Response();

        System.assertEquals(false, conversionTagsList200Response1.equals('foo'));
        System.assertEquals(false, conversionTagsList200Response2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASConversionTagsList200Response conversionTagsList200Response1 = OASConversionTagsList200Response.getExample();
        OASConversionTagsList200Response conversionTagsList200Response2 = new OASConversionTagsList200Response();
        OASConversionTagsList200Response conversionTagsList200Response3;

        System.assertEquals(false, conversionTagsList200Response1.equals(conversionTagsList200Response3));
        System.assertEquals(false, conversionTagsList200Response2.equals(conversionTagsList200Response3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASConversionTagsList200Response conversionTagsList200Response1 = OASConversionTagsList200Response.getExample();
        OASConversionTagsList200Response conversionTagsList200Response2 = new OASConversionTagsList200Response();

        System.assertEquals(conversionTagsList200Response1.hashCode(), conversionTagsList200Response1.hashCode());
        System.assertEquals(conversionTagsList200Response2.hashCode(), conversionTagsList200Response2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASConversionTagsList200Response conversionTagsList200Response1 = OASConversionTagsList200Response.getExample();
        OASConversionTagsList200Response conversionTagsList200Response2 = OASConversionTagsList200Response.getExample();
        OASConversionTagsList200Response conversionTagsList200Response3 = new OASConversionTagsList200Response();
        OASConversionTagsList200Response conversionTagsList200Response4 = new OASConversionTagsList200Response();

        System.assert(conversionTagsList200Response1.equals(conversionTagsList200Response2));
        System.assert(conversionTagsList200Response3.equals(conversionTagsList200Response4));
        System.assertEquals(conversionTagsList200Response1.hashCode(), conversionTagsList200Response2.hashCode());
        System.assertEquals(conversionTagsList200Response3.hashCode(), conversionTagsList200Response4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASConversionTagsList200Response conversionTagsList200Response = new OASConversionTagsList200Response();
        System.assertEquals(new List<OASConversionTag>(), conversionTagsList200Response.items);
    }
}
