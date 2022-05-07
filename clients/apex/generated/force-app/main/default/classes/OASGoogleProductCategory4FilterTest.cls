@isTest
private class OASGoogleProductCategory4FilterTest {
    @isTest
    private static void equalsSameInstance() {
        OASGoogleProductCategory4Filter googleProductCategory4Filter1 = OASGoogleProductCategory4Filter.getExample();
        OASGoogleProductCategory4Filter googleProductCategory4Filter2 = googleProductCategory4Filter1;
        OASGoogleProductCategory4Filter googleProductCategory4Filter3 = new OASGoogleProductCategory4Filter();
        OASGoogleProductCategory4Filter googleProductCategory4Filter4 = googleProductCategory4Filter3;

        System.assert(googleProductCategory4Filter1.equals(googleProductCategory4Filter2));
        System.assert(googleProductCategory4Filter2.equals(googleProductCategory4Filter1));
        System.assert(googleProductCategory4Filter1.equals(googleProductCategory4Filter1));
        System.assert(googleProductCategory4Filter3.equals(googleProductCategory4Filter4));
        System.assert(googleProductCategory4Filter4.equals(googleProductCategory4Filter3));
        System.assert(googleProductCategory4Filter3.equals(googleProductCategory4Filter3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGoogleProductCategory4Filter googleProductCategory4Filter1 = OASGoogleProductCategory4Filter.getExample();
        OASGoogleProductCategory4Filter googleProductCategory4Filter2 = OASGoogleProductCategory4Filter.getExample();
        OASGoogleProductCategory4Filter googleProductCategory4Filter3 = new OASGoogleProductCategory4Filter();
        OASGoogleProductCategory4Filter googleProductCategory4Filter4 = new OASGoogleProductCategory4Filter();

        System.assert(googleProductCategory4Filter1.equals(googleProductCategory4Filter2));
        System.assert(googleProductCategory4Filter2.equals(googleProductCategory4Filter1));
        System.assert(googleProductCategory4Filter3.equals(googleProductCategory4Filter4));
        System.assert(googleProductCategory4Filter4.equals(googleProductCategory4Filter3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGoogleProductCategory4Filter googleProductCategory4Filter1 = OASGoogleProductCategory4Filter.getExample();
        OASGoogleProductCategory4Filter googleProductCategory4Filter2 = new OASGoogleProductCategory4Filter();

        System.assertEquals(false, googleProductCategory4Filter1.equals('foo'));
        System.assertEquals(false, googleProductCategory4Filter2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGoogleProductCategory4Filter googleProductCategory4Filter1 = OASGoogleProductCategory4Filter.getExample();
        OASGoogleProductCategory4Filter googleProductCategory4Filter2 = new OASGoogleProductCategory4Filter();
        OASGoogleProductCategory4Filter googleProductCategory4Filter3;

        System.assertEquals(false, googleProductCategory4Filter1.equals(googleProductCategory4Filter3));
        System.assertEquals(false, googleProductCategory4Filter2.equals(googleProductCategory4Filter3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGoogleProductCategory4Filter googleProductCategory4Filter1 = OASGoogleProductCategory4Filter.getExample();
        OASGoogleProductCategory4Filter googleProductCategory4Filter2 = new OASGoogleProductCategory4Filter();

        System.assertEquals(googleProductCategory4Filter1.hashCode(), googleProductCategory4Filter1.hashCode());
        System.assertEquals(googleProductCategory4Filter2.hashCode(), googleProductCategory4Filter2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGoogleProductCategory4Filter googleProductCategory4Filter1 = OASGoogleProductCategory4Filter.getExample();
        OASGoogleProductCategory4Filter googleProductCategory4Filter2 = OASGoogleProductCategory4Filter.getExample();
        OASGoogleProductCategory4Filter googleProductCategory4Filter3 = new OASGoogleProductCategory4Filter();
        OASGoogleProductCategory4Filter googleProductCategory4Filter4 = new OASGoogleProductCategory4Filter();

        System.assert(googleProductCategory4Filter1.equals(googleProductCategory4Filter2));
        System.assert(googleProductCategory4Filter3.equals(googleProductCategory4Filter4));
        System.assertEquals(googleProductCategory4Filter1.hashCode(), googleProductCategory4Filter2.hashCode());
        System.assertEquals(googleProductCategory4Filter3.hashCode(), googleProductCategory4Filter4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASGoogleProductCategory4Filter googleProductCategory4Filter = new OASGoogleProductCategory4Filter();
        Map<String, String> x-property-mappings = googleProductCategory4Filter.getx-property-mappings();
        System.assertEquals('goOGLEPRODUCTCATEGORY4', x-property-mappings.get('GOOGLE_PRODUCT_CATEGORY_4'));
    }
}
