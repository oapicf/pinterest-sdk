@isTest
private class OASGoogleProductCategory5FilterTest {
    @isTest
    private static void equalsSameInstance() {
        OASGoogleProductCategory5Filter googleProductCategory5Filter1 = OASGoogleProductCategory5Filter.getExample();
        OASGoogleProductCategory5Filter googleProductCategory5Filter2 = googleProductCategory5Filter1;
        OASGoogleProductCategory5Filter googleProductCategory5Filter3 = new OASGoogleProductCategory5Filter();
        OASGoogleProductCategory5Filter googleProductCategory5Filter4 = googleProductCategory5Filter3;

        System.assert(googleProductCategory5Filter1.equals(googleProductCategory5Filter2));
        System.assert(googleProductCategory5Filter2.equals(googleProductCategory5Filter1));
        System.assert(googleProductCategory5Filter1.equals(googleProductCategory5Filter1));
        System.assert(googleProductCategory5Filter3.equals(googleProductCategory5Filter4));
        System.assert(googleProductCategory5Filter4.equals(googleProductCategory5Filter3));
        System.assert(googleProductCategory5Filter3.equals(googleProductCategory5Filter3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGoogleProductCategory5Filter googleProductCategory5Filter1 = OASGoogleProductCategory5Filter.getExample();
        OASGoogleProductCategory5Filter googleProductCategory5Filter2 = OASGoogleProductCategory5Filter.getExample();
        OASGoogleProductCategory5Filter googleProductCategory5Filter3 = new OASGoogleProductCategory5Filter();
        OASGoogleProductCategory5Filter googleProductCategory5Filter4 = new OASGoogleProductCategory5Filter();

        System.assert(googleProductCategory5Filter1.equals(googleProductCategory5Filter2));
        System.assert(googleProductCategory5Filter2.equals(googleProductCategory5Filter1));
        System.assert(googleProductCategory5Filter3.equals(googleProductCategory5Filter4));
        System.assert(googleProductCategory5Filter4.equals(googleProductCategory5Filter3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGoogleProductCategory5Filter googleProductCategory5Filter1 = OASGoogleProductCategory5Filter.getExample();
        OASGoogleProductCategory5Filter googleProductCategory5Filter2 = new OASGoogleProductCategory5Filter();

        System.assertEquals(false, googleProductCategory5Filter1.equals('foo'));
        System.assertEquals(false, googleProductCategory5Filter2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGoogleProductCategory5Filter googleProductCategory5Filter1 = OASGoogleProductCategory5Filter.getExample();
        OASGoogleProductCategory5Filter googleProductCategory5Filter2 = new OASGoogleProductCategory5Filter();
        OASGoogleProductCategory5Filter googleProductCategory5Filter3;

        System.assertEquals(false, googleProductCategory5Filter1.equals(googleProductCategory5Filter3));
        System.assertEquals(false, googleProductCategory5Filter2.equals(googleProductCategory5Filter3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGoogleProductCategory5Filter googleProductCategory5Filter1 = OASGoogleProductCategory5Filter.getExample();
        OASGoogleProductCategory5Filter googleProductCategory5Filter2 = new OASGoogleProductCategory5Filter();

        System.assertEquals(googleProductCategory5Filter1.hashCode(), googleProductCategory5Filter1.hashCode());
        System.assertEquals(googleProductCategory5Filter2.hashCode(), googleProductCategory5Filter2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGoogleProductCategory5Filter googleProductCategory5Filter1 = OASGoogleProductCategory5Filter.getExample();
        OASGoogleProductCategory5Filter googleProductCategory5Filter2 = OASGoogleProductCategory5Filter.getExample();
        OASGoogleProductCategory5Filter googleProductCategory5Filter3 = new OASGoogleProductCategory5Filter();
        OASGoogleProductCategory5Filter googleProductCategory5Filter4 = new OASGoogleProductCategory5Filter();

        System.assert(googleProductCategory5Filter1.equals(googleProductCategory5Filter2));
        System.assert(googleProductCategory5Filter3.equals(googleProductCategory5Filter4));
        System.assertEquals(googleProductCategory5Filter1.hashCode(), googleProductCategory5Filter2.hashCode());
        System.assertEquals(googleProductCategory5Filter3.hashCode(), googleProductCategory5Filter4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASGoogleProductCategory5Filter googleProductCategory5Filter = new OASGoogleProductCategory5Filter();
        Map<String, String> x-property-mappings = googleProductCategory5Filter.getx-property-mappings();
        System.assertEquals('goOGLEPRODUCTCATEGORY5', x-property-mappings.get('GOOGLE_PRODUCT_CATEGORY_5'));
    }
}
