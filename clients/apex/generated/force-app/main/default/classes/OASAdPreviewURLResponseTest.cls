@isTest
private class OASAdPreviewURLResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdPreviewURLResponse adPreviewURLResponse1 = OASAdPreviewURLResponse.getExample();
        OASAdPreviewURLResponse adPreviewURLResponse2 = adPreviewURLResponse1;
        OASAdPreviewURLResponse adPreviewURLResponse3 = new OASAdPreviewURLResponse();
        OASAdPreviewURLResponse adPreviewURLResponse4 = adPreviewURLResponse3;

        System.assert(adPreviewURLResponse1.equals(adPreviewURLResponse2));
        System.assert(adPreviewURLResponse2.equals(adPreviewURLResponse1));
        System.assert(adPreviewURLResponse1.equals(adPreviewURLResponse1));
        System.assert(adPreviewURLResponse3.equals(adPreviewURLResponse4));
        System.assert(adPreviewURLResponse4.equals(adPreviewURLResponse3));
        System.assert(adPreviewURLResponse3.equals(adPreviewURLResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdPreviewURLResponse adPreviewURLResponse1 = OASAdPreviewURLResponse.getExample();
        OASAdPreviewURLResponse adPreviewURLResponse2 = OASAdPreviewURLResponse.getExample();
        OASAdPreviewURLResponse adPreviewURLResponse3 = new OASAdPreviewURLResponse();
        OASAdPreviewURLResponse adPreviewURLResponse4 = new OASAdPreviewURLResponse();

        System.assert(adPreviewURLResponse1.equals(adPreviewURLResponse2));
        System.assert(adPreviewURLResponse2.equals(adPreviewURLResponse1));
        System.assert(adPreviewURLResponse3.equals(adPreviewURLResponse4));
        System.assert(adPreviewURLResponse4.equals(adPreviewURLResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdPreviewURLResponse adPreviewURLResponse1 = OASAdPreviewURLResponse.getExample();
        OASAdPreviewURLResponse adPreviewURLResponse2 = new OASAdPreviewURLResponse();

        System.assertEquals(false, adPreviewURLResponse1.equals('foo'));
        System.assertEquals(false, adPreviewURLResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdPreviewURLResponse adPreviewURLResponse1 = OASAdPreviewURLResponse.getExample();
        OASAdPreviewURLResponse adPreviewURLResponse2 = new OASAdPreviewURLResponse();
        OASAdPreviewURLResponse adPreviewURLResponse3;

        System.assertEquals(false, adPreviewURLResponse1.equals(adPreviewURLResponse3));
        System.assertEquals(false, adPreviewURLResponse2.equals(adPreviewURLResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdPreviewURLResponse adPreviewURLResponse1 = OASAdPreviewURLResponse.getExample();
        OASAdPreviewURLResponse adPreviewURLResponse2 = new OASAdPreviewURLResponse();

        System.assertEquals(adPreviewURLResponse1.hashCode(), adPreviewURLResponse1.hashCode());
        System.assertEquals(adPreviewURLResponse2.hashCode(), adPreviewURLResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdPreviewURLResponse adPreviewURLResponse1 = OASAdPreviewURLResponse.getExample();
        OASAdPreviewURLResponse adPreviewURLResponse2 = OASAdPreviewURLResponse.getExample();
        OASAdPreviewURLResponse adPreviewURLResponse3 = new OASAdPreviewURLResponse();
        OASAdPreviewURLResponse adPreviewURLResponse4 = new OASAdPreviewURLResponse();

        System.assert(adPreviewURLResponse1.equals(adPreviewURLResponse2));
        System.assert(adPreviewURLResponse3.equals(adPreviewURLResponse4));
        System.assertEquals(adPreviewURLResponse1.hashCode(), adPreviewURLResponse2.hashCode());
        System.assertEquals(adPreviewURLResponse3.hashCode(), adPreviewURLResponse4.hashCode());
    }
}
