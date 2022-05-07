@isTest
private class OASGoogleProductCategory6FilterTest {
    @isTest
    private static void equalsSameInstance() {
        OASGoogleProductCategory6Filter googleProductCategory6Filter1 = OASGoogleProductCategory6Filter.getExample();
        OASGoogleProductCategory6Filter googleProductCategory6Filter2 = googleProductCategory6Filter1;
        OASGoogleProductCategory6Filter googleProductCategory6Filter3 = new OASGoogleProductCategory6Filter();
        OASGoogleProductCategory6Filter googleProductCategory6Filter4 = googleProductCategory6Filter3;

        System.assert(googleProductCategory6Filter1.equals(googleProductCategory6Filter2));
        System.assert(googleProductCategory6Filter2.equals(googleProductCategory6Filter1));
        System.assert(googleProductCategory6Filter1.equals(googleProductCategory6Filter1));
        System.assert(googleProductCategory6Filter3.equals(googleProductCategory6Filter4));
        System.assert(googleProductCategory6Filter4.equals(googleProductCategory6Filter3));
        System.assert(googleProductCategory6Filter3.equals(googleProductCategory6Filter3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGoogleProductCategory6Filter googleProductCategory6Filter1 = OASGoogleProductCategory6Filter.getExample();
        OASGoogleProductCategory6Filter googleProductCategory6Filter2 = OASGoogleProductCategory6Filter.getExample();
        OASGoogleProductCategory6Filter googleProductCategory6Filter3 = new OASGoogleProductCategory6Filter();
        OASGoogleProductCategory6Filter googleProductCategory6Filter4 = new OASGoogleProductCategory6Filter();

        System.assert(googleProductCategory6Filter1.equals(googleProductCategory6Filter2));
        System.assert(googleProductCategory6Filter2.equals(googleProductCategory6Filter1));
        System.assert(googleProductCategory6Filter3.equals(googleProductCategory6Filter4));
        System.assert(googleProductCategory6Filter4.equals(googleProductCategory6Filter3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGoogleProductCategory6Filter googleProductCategory6Filter1 = OASGoogleProductCategory6Filter.getExample();
        OASGoogleProductCategory6Filter googleProductCategory6Filter2 = new OASGoogleProductCategory6Filter();

        System.assertEquals(false, googleProductCategory6Filter1.equals('foo'));
        System.assertEquals(false, googleProductCategory6Filter2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGoogleProductCategory6Filter googleProductCategory6Filter1 = OASGoogleProductCategory6Filter.getExample();
        OASGoogleProductCategory6Filter googleProductCategory6Filter2 = new OASGoogleProductCategory6Filter();
        OASGoogleProductCategory6Filter googleProductCategory6Filter3;

        System.assertEquals(false, googleProductCategory6Filter1.equals(googleProductCategory6Filter3));
        System.assertEquals(false, googleProductCategory6Filter2.equals(googleProductCategory6Filter3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGoogleProductCategory6Filter googleProductCategory6Filter1 = OASGoogleProductCategory6Filter.getExample();
        OASGoogleProductCategory6Filter googleProductCategory6Filter2 = new OASGoogleProductCategory6Filter();

        System.assertEquals(googleProductCategory6Filter1.hashCode(), googleProductCategory6Filter1.hashCode());
        System.assertEquals(googleProductCategory6Filter2.hashCode(), googleProductCategory6Filter2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGoogleProductCategory6Filter googleProductCategory6Filter1 = OASGoogleProductCategory6Filter.getExample();
        OASGoogleProductCategory6Filter googleProductCategory6Filter2 = OASGoogleProductCategory6Filter.getExample();
        OASGoogleProductCategory6Filter googleProductCategory6Filter3 = new OASGoogleProductCategory6Filter();
        OASGoogleProductCategory6Filter googleProductCategory6Filter4 = new OASGoogleProductCategory6Filter();

        System.assert(googleProductCategory6Filter1.equals(googleProductCategory6Filter2));
        System.assert(googleProductCategory6Filter3.equals(googleProductCategory6Filter4));
        System.assertEquals(googleProductCategory6Filter1.hashCode(), googleProductCategory6Filter2.hashCode());
        System.assertEquals(googleProductCategory6Filter3.hashCode(), googleProductCategory6Filter4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASGoogleProductCategory6Filter googleProductCategory6Filter = new OASGoogleProductCategory6Filter();
        Map<String, String> x-property-mappings = googleProductCategory6Filter.getx-property-mappings();
        System.assertEquals('goOGLEPRODUCTCATEGORY6', x-property-mappings.get('GOOGLE_PRODUCT_CATEGORY_6'));
    }
}
