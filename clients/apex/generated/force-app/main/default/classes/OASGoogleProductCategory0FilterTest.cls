@isTest
private class OASGoogleProductCategory0FilterTest {
    @isTest
    private static void equalsSameInstance() {
        OASGoogleProductCategory0Filter googleProductCategory0Filter1 = OASGoogleProductCategory0Filter.getExample();
        OASGoogleProductCategory0Filter googleProductCategory0Filter2 = googleProductCategory0Filter1;
        OASGoogleProductCategory0Filter googleProductCategory0Filter3 = new OASGoogleProductCategory0Filter();
        OASGoogleProductCategory0Filter googleProductCategory0Filter4 = googleProductCategory0Filter3;

        System.assert(googleProductCategory0Filter1.equals(googleProductCategory0Filter2));
        System.assert(googleProductCategory0Filter2.equals(googleProductCategory0Filter1));
        System.assert(googleProductCategory0Filter1.equals(googleProductCategory0Filter1));
        System.assert(googleProductCategory0Filter3.equals(googleProductCategory0Filter4));
        System.assert(googleProductCategory0Filter4.equals(googleProductCategory0Filter3));
        System.assert(googleProductCategory0Filter3.equals(googleProductCategory0Filter3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGoogleProductCategory0Filter googleProductCategory0Filter1 = OASGoogleProductCategory0Filter.getExample();
        OASGoogleProductCategory0Filter googleProductCategory0Filter2 = OASGoogleProductCategory0Filter.getExample();
        OASGoogleProductCategory0Filter googleProductCategory0Filter3 = new OASGoogleProductCategory0Filter();
        OASGoogleProductCategory0Filter googleProductCategory0Filter4 = new OASGoogleProductCategory0Filter();

        System.assert(googleProductCategory0Filter1.equals(googleProductCategory0Filter2));
        System.assert(googleProductCategory0Filter2.equals(googleProductCategory0Filter1));
        System.assert(googleProductCategory0Filter3.equals(googleProductCategory0Filter4));
        System.assert(googleProductCategory0Filter4.equals(googleProductCategory0Filter3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGoogleProductCategory0Filter googleProductCategory0Filter1 = OASGoogleProductCategory0Filter.getExample();
        OASGoogleProductCategory0Filter googleProductCategory0Filter2 = new OASGoogleProductCategory0Filter();

        System.assertEquals(false, googleProductCategory0Filter1.equals('foo'));
        System.assertEquals(false, googleProductCategory0Filter2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGoogleProductCategory0Filter googleProductCategory0Filter1 = OASGoogleProductCategory0Filter.getExample();
        OASGoogleProductCategory0Filter googleProductCategory0Filter2 = new OASGoogleProductCategory0Filter();
        OASGoogleProductCategory0Filter googleProductCategory0Filter3;

        System.assertEquals(false, googleProductCategory0Filter1.equals(googleProductCategory0Filter3));
        System.assertEquals(false, googleProductCategory0Filter2.equals(googleProductCategory0Filter3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGoogleProductCategory0Filter googleProductCategory0Filter1 = OASGoogleProductCategory0Filter.getExample();
        OASGoogleProductCategory0Filter googleProductCategory0Filter2 = new OASGoogleProductCategory0Filter();

        System.assertEquals(googleProductCategory0Filter1.hashCode(), googleProductCategory0Filter1.hashCode());
        System.assertEquals(googleProductCategory0Filter2.hashCode(), googleProductCategory0Filter2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGoogleProductCategory0Filter googleProductCategory0Filter1 = OASGoogleProductCategory0Filter.getExample();
        OASGoogleProductCategory0Filter googleProductCategory0Filter2 = OASGoogleProductCategory0Filter.getExample();
        OASGoogleProductCategory0Filter googleProductCategory0Filter3 = new OASGoogleProductCategory0Filter();
        OASGoogleProductCategory0Filter googleProductCategory0Filter4 = new OASGoogleProductCategory0Filter();

        System.assert(googleProductCategory0Filter1.equals(googleProductCategory0Filter2));
        System.assert(googleProductCategory0Filter3.equals(googleProductCategory0Filter4));
        System.assertEquals(googleProductCategory0Filter1.hashCode(), googleProductCategory0Filter2.hashCode());
        System.assertEquals(googleProductCategory0Filter3.hashCode(), googleProductCategory0Filter4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASGoogleProductCategory0Filter googleProductCategory0Filter = new OASGoogleProductCategory0Filter();
        Map<String, String> x-property-mappings = googleProductCategory0Filter.getx-property-mappings();
        System.assertEquals('goOGLEPRODUCTCATEGORY0', x-property-mappings.get('GOOGLE_PRODUCT_CATEGORY_0'));
    }
}
