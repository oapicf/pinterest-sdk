@isTest
private class OASGoogleProductCategory3FilterTest {
    @isTest
    private static void equalsSameInstance() {
        OASGoogleProductCategory3Filter googleProductCategory3Filter1 = OASGoogleProductCategory3Filter.getExample();
        OASGoogleProductCategory3Filter googleProductCategory3Filter2 = googleProductCategory3Filter1;
        OASGoogleProductCategory3Filter googleProductCategory3Filter3 = new OASGoogleProductCategory3Filter();
        OASGoogleProductCategory3Filter googleProductCategory3Filter4 = googleProductCategory3Filter3;

        System.assert(googleProductCategory3Filter1.equals(googleProductCategory3Filter2));
        System.assert(googleProductCategory3Filter2.equals(googleProductCategory3Filter1));
        System.assert(googleProductCategory3Filter1.equals(googleProductCategory3Filter1));
        System.assert(googleProductCategory3Filter3.equals(googleProductCategory3Filter4));
        System.assert(googleProductCategory3Filter4.equals(googleProductCategory3Filter3));
        System.assert(googleProductCategory3Filter3.equals(googleProductCategory3Filter3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGoogleProductCategory3Filter googleProductCategory3Filter1 = OASGoogleProductCategory3Filter.getExample();
        OASGoogleProductCategory3Filter googleProductCategory3Filter2 = OASGoogleProductCategory3Filter.getExample();
        OASGoogleProductCategory3Filter googleProductCategory3Filter3 = new OASGoogleProductCategory3Filter();
        OASGoogleProductCategory3Filter googleProductCategory3Filter4 = new OASGoogleProductCategory3Filter();

        System.assert(googleProductCategory3Filter1.equals(googleProductCategory3Filter2));
        System.assert(googleProductCategory3Filter2.equals(googleProductCategory3Filter1));
        System.assert(googleProductCategory3Filter3.equals(googleProductCategory3Filter4));
        System.assert(googleProductCategory3Filter4.equals(googleProductCategory3Filter3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGoogleProductCategory3Filter googleProductCategory3Filter1 = OASGoogleProductCategory3Filter.getExample();
        OASGoogleProductCategory3Filter googleProductCategory3Filter2 = new OASGoogleProductCategory3Filter();

        System.assertEquals(false, googleProductCategory3Filter1.equals('foo'));
        System.assertEquals(false, googleProductCategory3Filter2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGoogleProductCategory3Filter googleProductCategory3Filter1 = OASGoogleProductCategory3Filter.getExample();
        OASGoogleProductCategory3Filter googleProductCategory3Filter2 = new OASGoogleProductCategory3Filter();
        OASGoogleProductCategory3Filter googleProductCategory3Filter3;

        System.assertEquals(false, googleProductCategory3Filter1.equals(googleProductCategory3Filter3));
        System.assertEquals(false, googleProductCategory3Filter2.equals(googleProductCategory3Filter3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGoogleProductCategory3Filter googleProductCategory3Filter1 = OASGoogleProductCategory3Filter.getExample();
        OASGoogleProductCategory3Filter googleProductCategory3Filter2 = new OASGoogleProductCategory3Filter();

        System.assertEquals(googleProductCategory3Filter1.hashCode(), googleProductCategory3Filter1.hashCode());
        System.assertEquals(googleProductCategory3Filter2.hashCode(), googleProductCategory3Filter2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGoogleProductCategory3Filter googleProductCategory3Filter1 = OASGoogleProductCategory3Filter.getExample();
        OASGoogleProductCategory3Filter googleProductCategory3Filter2 = OASGoogleProductCategory3Filter.getExample();
        OASGoogleProductCategory3Filter googleProductCategory3Filter3 = new OASGoogleProductCategory3Filter();
        OASGoogleProductCategory3Filter googleProductCategory3Filter4 = new OASGoogleProductCategory3Filter();

        System.assert(googleProductCategory3Filter1.equals(googleProductCategory3Filter2));
        System.assert(googleProductCategory3Filter3.equals(googleProductCategory3Filter4));
        System.assertEquals(googleProductCategory3Filter1.hashCode(), googleProductCategory3Filter2.hashCode());
        System.assertEquals(googleProductCategory3Filter3.hashCode(), googleProductCategory3Filter4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASGoogleProductCategory3Filter googleProductCategory3Filter = new OASGoogleProductCategory3Filter();
        Map<String, String> x-property-mappings = googleProductCategory3Filter.getx-property-mappings();
        System.assertEquals('goOGLEPRODUCTCATEGORY3', x-property-mappings.get('GOOGLE_PRODUCT_CATEGORY_3'));
    }
}
