@isTest
private class OASAdPreviewRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdPreviewRequest adPreviewRequest1 = OASAdPreviewRequest.getExample();
        OASAdPreviewRequest adPreviewRequest2 = adPreviewRequest1;
        OASAdPreviewRequest adPreviewRequest3 = new OASAdPreviewRequest();
        OASAdPreviewRequest adPreviewRequest4 = adPreviewRequest3;

        System.assert(adPreviewRequest1.equals(adPreviewRequest2));
        System.assert(adPreviewRequest2.equals(adPreviewRequest1));
        System.assert(adPreviewRequest1.equals(adPreviewRequest1));
        System.assert(adPreviewRequest3.equals(adPreviewRequest4));
        System.assert(adPreviewRequest4.equals(adPreviewRequest3));
        System.assert(adPreviewRequest3.equals(adPreviewRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdPreviewRequest adPreviewRequest1 = OASAdPreviewRequest.getExample();
        OASAdPreviewRequest adPreviewRequest2 = OASAdPreviewRequest.getExample();
        OASAdPreviewRequest adPreviewRequest3 = new OASAdPreviewRequest();
        OASAdPreviewRequest adPreviewRequest4 = new OASAdPreviewRequest();

        System.assert(adPreviewRequest1.equals(adPreviewRequest2));
        System.assert(adPreviewRequest2.equals(adPreviewRequest1));
        System.assert(adPreviewRequest3.equals(adPreviewRequest4));
        System.assert(adPreviewRequest4.equals(adPreviewRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdPreviewRequest adPreviewRequest1 = OASAdPreviewRequest.getExample();
        OASAdPreviewRequest adPreviewRequest2 = new OASAdPreviewRequest();

        System.assertEquals(false, adPreviewRequest1.equals('foo'));
        System.assertEquals(false, adPreviewRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdPreviewRequest adPreviewRequest1 = OASAdPreviewRequest.getExample();
        OASAdPreviewRequest adPreviewRequest2 = new OASAdPreviewRequest();
        OASAdPreviewRequest adPreviewRequest3;

        System.assertEquals(false, adPreviewRequest1.equals(adPreviewRequest3));
        System.assertEquals(false, adPreviewRequest2.equals(adPreviewRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdPreviewRequest adPreviewRequest1 = OASAdPreviewRequest.getExample();
        OASAdPreviewRequest adPreviewRequest2 = new OASAdPreviewRequest();

        System.assertEquals(adPreviewRequest1.hashCode(), adPreviewRequest1.hashCode());
        System.assertEquals(adPreviewRequest2.hashCode(), adPreviewRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdPreviewRequest adPreviewRequest1 = OASAdPreviewRequest.getExample();
        OASAdPreviewRequest adPreviewRequest2 = OASAdPreviewRequest.getExample();
        OASAdPreviewRequest adPreviewRequest3 = new OASAdPreviewRequest();
        OASAdPreviewRequest adPreviewRequest4 = new OASAdPreviewRequest();

        System.assert(adPreviewRequest1.equals(adPreviewRequest2));
        System.assert(adPreviewRequest3.equals(adPreviewRequest4));
        System.assertEquals(adPreviewRequest1.hashCode(), adPreviewRequest2.hashCode());
        System.assertEquals(adPreviewRequest3.hashCode(), adPreviewRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAdPreviewRequest adPreviewRequest = new OASAdPreviewRequest();
        Map<String, String> x-property-mappings = adPreviewRequest.getx-property-mappings();
        System.assertEquals('imageUrl', x-property-mappings.get('image_url'));
        System.assertEquals('pinId', x-property-mappings.get('pin_id'));
    }
}
