@isTest
private class OASGoogleProductCategory2FilterTest {
    @isTest
    private static void equalsSameInstance() {
        OASGoogleProductCategory2Filter googleProductCategory2Filter1 = OASGoogleProductCategory2Filter.getExample();
        OASGoogleProductCategory2Filter googleProductCategory2Filter2 = googleProductCategory2Filter1;
        OASGoogleProductCategory2Filter googleProductCategory2Filter3 = new OASGoogleProductCategory2Filter();
        OASGoogleProductCategory2Filter googleProductCategory2Filter4 = googleProductCategory2Filter3;

        System.assert(googleProductCategory2Filter1.equals(googleProductCategory2Filter2));
        System.assert(googleProductCategory2Filter2.equals(googleProductCategory2Filter1));
        System.assert(googleProductCategory2Filter1.equals(googleProductCategory2Filter1));
        System.assert(googleProductCategory2Filter3.equals(googleProductCategory2Filter4));
        System.assert(googleProductCategory2Filter4.equals(googleProductCategory2Filter3));
        System.assert(googleProductCategory2Filter3.equals(googleProductCategory2Filter3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGoogleProductCategory2Filter googleProductCategory2Filter1 = OASGoogleProductCategory2Filter.getExample();
        OASGoogleProductCategory2Filter googleProductCategory2Filter2 = OASGoogleProductCategory2Filter.getExample();
        OASGoogleProductCategory2Filter googleProductCategory2Filter3 = new OASGoogleProductCategory2Filter();
        OASGoogleProductCategory2Filter googleProductCategory2Filter4 = new OASGoogleProductCategory2Filter();

        System.assert(googleProductCategory2Filter1.equals(googleProductCategory2Filter2));
        System.assert(googleProductCategory2Filter2.equals(googleProductCategory2Filter1));
        System.assert(googleProductCategory2Filter3.equals(googleProductCategory2Filter4));
        System.assert(googleProductCategory2Filter4.equals(googleProductCategory2Filter3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGoogleProductCategory2Filter googleProductCategory2Filter1 = OASGoogleProductCategory2Filter.getExample();
        OASGoogleProductCategory2Filter googleProductCategory2Filter2 = new OASGoogleProductCategory2Filter();

        System.assertEquals(false, googleProductCategory2Filter1.equals('foo'));
        System.assertEquals(false, googleProductCategory2Filter2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGoogleProductCategory2Filter googleProductCategory2Filter1 = OASGoogleProductCategory2Filter.getExample();
        OASGoogleProductCategory2Filter googleProductCategory2Filter2 = new OASGoogleProductCategory2Filter();
        OASGoogleProductCategory2Filter googleProductCategory2Filter3;

        System.assertEquals(false, googleProductCategory2Filter1.equals(googleProductCategory2Filter3));
        System.assertEquals(false, googleProductCategory2Filter2.equals(googleProductCategory2Filter3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGoogleProductCategory2Filter googleProductCategory2Filter1 = OASGoogleProductCategory2Filter.getExample();
        OASGoogleProductCategory2Filter googleProductCategory2Filter2 = new OASGoogleProductCategory2Filter();

        System.assertEquals(googleProductCategory2Filter1.hashCode(), googleProductCategory2Filter1.hashCode());
        System.assertEquals(googleProductCategory2Filter2.hashCode(), googleProductCategory2Filter2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGoogleProductCategory2Filter googleProductCategory2Filter1 = OASGoogleProductCategory2Filter.getExample();
        OASGoogleProductCategory2Filter googleProductCategory2Filter2 = OASGoogleProductCategory2Filter.getExample();
        OASGoogleProductCategory2Filter googleProductCategory2Filter3 = new OASGoogleProductCategory2Filter();
        OASGoogleProductCategory2Filter googleProductCategory2Filter4 = new OASGoogleProductCategory2Filter();

        System.assert(googleProductCategory2Filter1.equals(googleProductCategory2Filter2));
        System.assert(googleProductCategory2Filter3.equals(googleProductCategory2Filter4));
        System.assertEquals(googleProductCategory2Filter1.hashCode(), googleProductCategory2Filter2.hashCode());
        System.assertEquals(googleProductCategory2Filter3.hashCode(), googleProductCategory2Filter4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASGoogleProductCategory2Filter googleProductCategory2Filter = new OASGoogleProductCategory2Filter();
        Map<String, String> x-property-mappings = googleProductCategory2Filter.getx-property-mappings();
        System.assertEquals('goOGLEPRODUCTCATEGORY2', x-property-mappings.get('GOOGLE_PRODUCT_CATEGORY_2'));
    }
}
