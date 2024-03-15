@isTest
private class OASPinMediaWithImageAndVideoTest {
    @isTest
    private static void equalsSameInstance() {
        OASPinMediaWithImageAndVideo pinMediaWithImageAndVideo1 = OASPinMediaWithImageAndVideo.getExample();
        OASPinMediaWithImageAndVideo pinMediaWithImageAndVideo2 = pinMediaWithImageAndVideo1;
        OASPinMediaWithImageAndVideo pinMediaWithImageAndVideo3 = new OASPinMediaWithImageAndVideo();
        OASPinMediaWithImageAndVideo pinMediaWithImageAndVideo4 = pinMediaWithImageAndVideo3;

        System.assert(pinMediaWithImageAndVideo1.equals(pinMediaWithImageAndVideo2));
        System.assert(pinMediaWithImageAndVideo2.equals(pinMediaWithImageAndVideo1));
        System.assert(pinMediaWithImageAndVideo1.equals(pinMediaWithImageAndVideo1));
        System.assert(pinMediaWithImageAndVideo3.equals(pinMediaWithImageAndVideo4));
        System.assert(pinMediaWithImageAndVideo4.equals(pinMediaWithImageAndVideo3));
        System.assert(pinMediaWithImageAndVideo3.equals(pinMediaWithImageAndVideo3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPinMediaWithImageAndVideo pinMediaWithImageAndVideo1 = OASPinMediaWithImageAndVideo.getExample();
        OASPinMediaWithImageAndVideo pinMediaWithImageAndVideo2 = OASPinMediaWithImageAndVideo.getExample();
        OASPinMediaWithImageAndVideo pinMediaWithImageAndVideo3 = new OASPinMediaWithImageAndVideo();
        OASPinMediaWithImageAndVideo pinMediaWithImageAndVideo4 = new OASPinMediaWithImageAndVideo();

        System.assert(pinMediaWithImageAndVideo1.equals(pinMediaWithImageAndVideo2));
        System.assert(pinMediaWithImageAndVideo2.equals(pinMediaWithImageAndVideo1));
        System.assert(pinMediaWithImageAndVideo3.equals(pinMediaWithImageAndVideo4));
        System.assert(pinMediaWithImageAndVideo4.equals(pinMediaWithImageAndVideo3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPinMediaWithImageAndVideo pinMediaWithImageAndVideo1 = OASPinMediaWithImageAndVideo.getExample();
        OASPinMediaWithImageAndVideo pinMediaWithImageAndVideo2 = new OASPinMediaWithImageAndVideo();

        System.assertEquals(false, pinMediaWithImageAndVideo1.equals('foo'));
        System.assertEquals(false, pinMediaWithImageAndVideo2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPinMediaWithImageAndVideo pinMediaWithImageAndVideo1 = OASPinMediaWithImageAndVideo.getExample();
        OASPinMediaWithImageAndVideo pinMediaWithImageAndVideo2 = new OASPinMediaWithImageAndVideo();
        OASPinMediaWithImageAndVideo pinMediaWithImageAndVideo3;

        System.assertEquals(false, pinMediaWithImageAndVideo1.equals(pinMediaWithImageAndVideo3));
        System.assertEquals(false, pinMediaWithImageAndVideo2.equals(pinMediaWithImageAndVideo3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPinMediaWithImageAndVideo pinMediaWithImageAndVideo1 = OASPinMediaWithImageAndVideo.getExample();
        OASPinMediaWithImageAndVideo pinMediaWithImageAndVideo2 = new OASPinMediaWithImageAndVideo();

        System.assertEquals(pinMediaWithImageAndVideo1.hashCode(), pinMediaWithImageAndVideo1.hashCode());
        System.assertEquals(pinMediaWithImageAndVideo2.hashCode(), pinMediaWithImageAndVideo2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPinMediaWithImageAndVideo pinMediaWithImageAndVideo1 = OASPinMediaWithImageAndVideo.getExample();
        OASPinMediaWithImageAndVideo pinMediaWithImageAndVideo2 = OASPinMediaWithImageAndVideo.getExample();
        OASPinMediaWithImageAndVideo pinMediaWithImageAndVideo3 = new OASPinMediaWithImageAndVideo();
        OASPinMediaWithImageAndVideo pinMediaWithImageAndVideo4 = new OASPinMediaWithImageAndVideo();

        System.assert(pinMediaWithImageAndVideo1.equals(pinMediaWithImageAndVideo2));
        System.assert(pinMediaWithImageAndVideo3.equals(pinMediaWithImageAndVideo4));
        System.assertEquals(pinMediaWithImageAndVideo1.hashCode(), pinMediaWithImageAndVideo2.hashCode());
        System.assertEquals(pinMediaWithImageAndVideo3.hashCode(), pinMediaWithImageAndVideo4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPinMediaWithImageAndVideo pinMediaWithImageAndVideo = new OASPinMediaWithImageAndVideo();
        Map<String, String> x-property-mappings = pinMediaWithImageAndVideo.getx-property-mappings();
        System.assertEquals('mediaType', x-property-mappings.get('media_type'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPinMediaWithImageAndVideo pinMediaWithImageAndVideo = new OASPinMediaWithImageAndVideo();
        System.assertEquals(new List<OASPinMediaMetadata>(), pinMediaWithImageAndVideo.items);
        System.assertEquals(null, pinMediaWithImageAndVideo.mediaType);
    }
}
