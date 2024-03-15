@isTest
private class OASGoogleProductCategory1FilterTest {
    @isTest
    private static void equalsSameInstance() {
        OASGoogleProductCategory1Filter googleProductCategory1Filter1 = OASGoogleProductCategory1Filter.getExample();
        OASGoogleProductCategory1Filter googleProductCategory1Filter2 = googleProductCategory1Filter1;
        OASGoogleProductCategory1Filter googleProductCategory1Filter3 = new OASGoogleProductCategory1Filter();
        OASGoogleProductCategory1Filter googleProductCategory1Filter4 = googleProductCategory1Filter3;

        System.assert(googleProductCategory1Filter1.equals(googleProductCategory1Filter2));
        System.assert(googleProductCategory1Filter2.equals(googleProductCategory1Filter1));
        System.assert(googleProductCategory1Filter1.equals(googleProductCategory1Filter1));
        System.assert(googleProductCategory1Filter3.equals(googleProductCategory1Filter4));
        System.assert(googleProductCategory1Filter4.equals(googleProductCategory1Filter3));
        System.assert(googleProductCategory1Filter3.equals(googleProductCategory1Filter3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGoogleProductCategory1Filter googleProductCategory1Filter1 = OASGoogleProductCategory1Filter.getExample();
        OASGoogleProductCategory1Filter googleProductCategory1Filter2 = OASGoogleProductCategory1Filter.getExample();
        OASGoogleProductCategory1Filter googleProductCategory1Filter3 = new OASGoogleProductCategory1Filter();
        OASGoogleProductCategory1Filter googleProductCategory1Filter4 = new OASGoogleProductCategory1Filter();

        System.assert(googleProductCategory1Filter1.equals(googleProductCategory1Filter2));
        System.assert(googleProductCategory1Filter2.equals(googleProductCategory1Filter1));
        System.assert(googleProductCategory1Filter3.equals(googleProductCategory1Filter4));
        System.assert(googleProductCategory1Filter4.equals(googleProductCategory1Filter3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGoogleProductCategory1Filter googleProductCategory1Filter1 = OASGoogleProductCategory1Filter.getExample();
        OASGoogleProductCategory1Filter googleProductCategory1Filter2 = new OASGoogleProductCategory1Filter();

        System.assertEquals(false, googleProductCategory1Filter1.equals('foo'));
        System.assertEquals(false, googleProductCategory1Filter2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGoogleProductCategory1Filter googleProductCategory1Filter1 = OASGoogleProductCategory1Filter.getExample();
        OASGoogleProductCategory1Filter googleProductCategory1Filter2 = new OASGoogleProductCategory1Filter();
        OASGoogleProductCategory1Filter googleProductCategory1Filter3;

        System.assertEquals(false, googleProductCategory1Filter1.equals(googleProductCategory1Filter3));
        System.assertEquals(false, googleProductCategory1Filter2.equals(googleProductCategory1Filter3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGoogleProductCategory1Filter googleProductCategory1Filter1 = OASGoogleProductCategory1Filter.getExample();
        OASGoogleProductCategory1Filter googleProductCategory1Filter2 = new OASGoogleProductCategory1Filter();

        System.assertEquals(googleProductCategory1Filter1.hashCode(), googleProductCategory1Filter1.hashCode());
        System.assertEquals(googleProductCategory1Filter2.hashCode(), googleProductCategory1Filter2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGoogleProductCategory1Filter googleProductCategory1Filter1 = OASGoogleProductCategory1Filter.getExample();
        OASGoogleProductCategory1Filter googleProductCategory1Filter2 = OASGoogleProductCategory1Filter.getExample();
        OASGoogleProductCategory1Filter googleProductCategory1Filter3 = new OASGoogleProductCategory1Filter();
        OASGoogleProductCategory1Filter googleProductCategory1Filter4 = new OASGoogleProductCategory1Filter();

        System.assert(googleProductCategory1Filter1.equals(googleProductCategory1Filter2));
        System.assert(googleProductCategory1Filter3.equals(googleProductCategory1Filter4));
        System.assertEquals(googleProductCategory1Filter1.hashCode(), googleProductCategory1Filter2.hashCode());
        System.assertEquals(googleProductCategory1Filter3.hashCode(), googleProductCategory1Filter4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASGoogleProductCategory1Filter googleProductCategory1Filter = new OASGoogleProductCategory1Filter();
        Map<String, String> x-property-mappings = googleProductCategory1Filter.getx-property-mappings();
        System.assertEquals('goOGLEPRODUCTCATEGORY1', x-property-mappings.get('GOOGLE_PRODUCT_CATEGORY_1'));
    }
}
