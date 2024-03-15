@isTest
private class OASPinMediaWithVideoTest {
    @isTest
    private static void equalsSameInstance() {
        OASPinMediaWithVideo pinMediaWithVideo1 = OASPinMediaWithVideo.getExample();
        OASPinMediaWithVideo pinMediaWithVideo2 = pinMediaWithVideo1;
        OASPinMediaWithVideo pinMediaWithVideo3 = new OASPinMediaWithVideo();
        OASPinMediaWithVideo pinMediaWithVideo4 = pinMediaWithVideo3;

        System.assert(pinMediaWithVideo1.equals(pinMediaWithVideo2));
        System.assert(pinMediaWithVideo2.equals(pinMediaWithVideo1));
        System.assert(pinMediaWithVideo1.equals(pinMediaWithVideo1));
        System.assert(pinMediaWithVideo3.equals(pinMediaWithVideo4));
        System.assert(pinMediaWithVideo4.equals(pinMediaWithVideo3));
        System.assert(pinMediaWithVideo3.equals(pinMediaWithVideo3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPinMediaWithVideo pinMediaWithVideo1 = OASPinMediaWithVideo.getExample();
        OASPinMediaWithVideo pinMediaWithVideo2 = OASPinMediaWithVideo.getExample();
        OASPinMediaWithVideo pinMediaWithVideo3 = new OASPinMediaWithVideo();
        OASPinMediaWithVideo pinMediaWithVideo4 = new OASPinMediaWithVideo();

        System.assert(pinMediaWithVideo1.equals(pinMediaWithVideo2));
        System.assert(pinMediaWithVideo2.equals(pinMediaWithVideo1));
        System.assert(pinMediaWithVideo3.equals(pinMediaWithVideo4));
        System.assert(pinMediaWithVideo4.equals(pinMediaWithVideo3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPinMediaWithVideo pinMediaWithVideo1 = OASPinMediaWithVideo.getExample();
        OASPinMediaWithVideo pinMediaWithVideo2 = new OASPinMediaWithVideo();

        System.assertEquals(false, pinMediaWithVideo1.equals('foo'));
        System.assertEquals(false, pinMediaWithVideo2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPinMediaWithVideo pinMediaWithVideo1 = OASPinMediaWithVideo.getExample();
        OASPinMediaWithVideo pinMediaWithVideo2 = new OASPinMediaWithVideo();
        OASPinMediaWithVideo pinMediaWithVideo3;

        System.assertEquals(false, pinMediaWithVideo1.equals(pinMediaWithVideo3));
        System.assertEquals(false, pinMediaWithVideo2.equals(pinMediaWithVideo3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPinMediaWithVideo pinMediaWithVideo1 = OASPinMediaWithVideo.getExample();
        OASPinMediaWithVideo pinMediaWithVideo2 = new OASPinMediaWithVideo();

        System.assertEquals(pinMediaWithVideo1.hashCode(), pinMediaWithVideo1.hashCode());
        System.assertEquals(pinMediaWithVideo2.hashCode(), pinMediaWithVideo2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPinMediaWithVideo pinMediaWithVideo1 = OASPinMediaWithVideo.getExample();
        OASPinMediaWithVideo pinMediaWithVideo2 = OASPinMediaWithVideo.getExample();
        OASPinMediaWithVideo pinMediaWithVideo3 = new OASPinMediaWithVideo();
        OASPinMediaWithVideo pinMediaWithVideo4 = new OASPinMediaWithVideo();

        System.assert(pinMediaWithVideo1.equals(pinMediaWithVideo2));
        System.assert(pinMediaWithVideo3.equals(pinMediaWithVideo4));
        System.assertEquals(pinMediaWithVideo1.hashCode(), pinMediaWithVideo2.hashCode());
        System.assertEquals(pinMediaWithVideo3.hashCode(), pinMediaWithVideo4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPinMediaWithVideo pinMediaWithVideo = new OASPinMediaWithVideo();
        Map<String, String> x-property-mappings = pinMediaWithVideo.getx-property-mappings();
        System.assertEquals('mediaType', x-property-mappings.get('media_type'));
        System.assertEquals('coverImageUrl', x-property-mappings.get('cover_image_url'));
        System.assertEquals('videoUrl', x-property-mappings.get('video_url'));
    }
}
