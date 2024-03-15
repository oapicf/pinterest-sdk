@isTest
private class OASConversionTagListResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASConversionTagListResponse conversionTagListResponse1 = OASConversionTagListResponse.getExample();
        OASConversionTagListResponse conversionTagListResponse2 = conversionTagListResponse1;
        OASConversionTagListResponse conversionTagListResponse3 = new OASConversionTagListResponse();
        OASConversionTagListResponse conversionTagListResponse4 = conversionTagListResponse3;

        System.assert(conversionTagListResponse1.equals(conversionTagListResponse2));
        System.assert(conversionTagListResponse2.equals(conversionTagListResponse1));
        System.assert(conversionTagListResponse1.equals(conversionTagListResponse1));
        System.assert(conversionTagListResponse3.equals(conversionTagListResponse4));
        System.assert(conversionTagListResponse4.equals(conversionTagListResponse3));
        System.assert(conversionTagListResponse3.equals(conversionTagListResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASConversionTagListResponse conversionTagListResponse1 = OASConversionTagListResponse.getExample();
        OASConversionTagListResponse conversionTagListResponse2 = OASConversionTagListResponse.getExample();
        OASConversionTagListResponse conversionTagListResponse3 = new OASConversionTagListResponse();
        OASConversionTagListResponse conversionTagListResponse4 = new OASConversionTagListResponse();

        System.assert(conversionTagListResponse1.equals(conversionTagListResponse2));
        System.assert(conversionTagListResponse2.equals(conversionTagListResponse1));
        System.assert(conversionTagListResponse3.equals(conversionTagListResponse4));
        System.assert(conversionTagListResponse4.equals(conversionTagListResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASConversionTagListResponse conversionTagListResponse1 = OASConversionTagListResponse.getExample();
        OASConversionTagListResponse conversionTagListResponse2 = new OASConversionTagListResponse();

        System.assertEquals(false, conversionTagListResponse1.equals('foo'));
        System.assertEquals(false, conversionTagListResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASConversionTagListResponse conversionTagListResponse1 = OASConversionTagListResponse.getExample();
        OASConversionTagListResponse conversionTagListResponse2 = new OASConversionTagListResponse();
        OASConversionTagListResponse conversionTagListResponse3;

        System.assertEquals(false, conversionTagListResponse1.equals(conversionTagListResponse3));
        System.assertEquals(false, conversionTagListResponse2.equals(conversionTagListResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASConversionTagListResponse conversionTagListResponse1 = OASConversionTagListResponse.getExample();
        OASConversionTagListResponse conversionTagListResponse2 = new OASConversionTagListResponse();

        System.assertEquals(conversionTagListResponse1.hashCode(), conversionTagListResponse1.hashCode());
        System.assertEquals(conversionTagListResponse2.hashCode(), conversionTagListResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASConversionTagListResponse conversionTagListResponse1 = OASConversionTagListResponse.getExample();
        OASConversionTagListResponse conversionTagListResponse2 = OASConversionTagListResponse.getExample();
        OASConversionTagListResponse conversionTagListResponse3 = new OASConversionTagListResponse();
        OASConversionTagListResponse conversionTagListResponse4 = new OASConversionTagListResponse();

        System.assert(conversionTagListResponse1.equals(conversionTagListResponse2));
        System.assert(conversionTagListResponse3.equals(conversionTagListResponse4));
        System.assertEquals(conversionTagListResponse1.hashCode(), conversionTagListResponse2.hashCode());
        System.assertEquals(conversionTagListResponse3.hashCode(), conversionTagListResponse4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASConversionTagListResponse conversionTagListResponse = new OASConversionTagListResponse();
        System.assertEquals(new List<OASConversionTagResponse>(), conversionTagListResponse.items);
    }
}
