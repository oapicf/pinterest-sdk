@isTest
private class OASPinMediaWithVideosTest {
    @isTest
    private static void equalsSameInstance() {
        OASPinMediaWithVideos pinMediaWithVideos1 = OASPinMediaWithVideos.getExample();
        OASPinMediaWithVideos pinMediaWithVideos2 = pinMediaWithVideos1;
        OASPinMediaWithVideos pinMediaWithVideos3 = new OASPinMediaWithVideos();
        OASPinMediaWithVideos pinMediaWithVideos4 = pinMediaWithVideos3;

        System.assert(pinMediaWithVideos1.equals(pinMediaWithVideos2));
        System.assert(pinMediaWithVideos2.equals(pinMediaWithVideos1));
        System.assert(pinMediaWithVideos1.equals(pinMediaWithVideos1));
        System.assert(pinMediaWithVideos3.equals(pinMediaWithVideos4));
        System.assert(pinMediaWithVideos4.equals(pinMediaWithVideos3));
        System.assert(pinMediaWithVideos3.equals(pinMediaWithVideos3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPinMediaWithVideos pinMediaWithVideos1 = OASPinMediaWithVideos.getExample();
        OASPinMediaWithVideos pinMediaWithVideos2 = OASPinMediaWithVideos.getExample();
        OASPinMediaWithVideos pinMediaWithVideos3 = new OASPinMediaWithVideos();
        OASPinMediaWithVideos pinMediaWithVideos4 = new OASPinMediaWithVideos();

        System.assert(pinMediaWithVideos1.equals(pinMediaWithVideos2));
        System.assert(pinMediaWithVideos2.equals(pinMediaWithVideos1));
        System.assert(pinMediaWithVideos3.equals(pinMediaWithVideos4));
        System.assert(pinMediaWithVideos4.equals(pinMediaWithVideos3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPinMediaWithVideos pinMediaWithVideos1 = OASPinMediaWithVideos.getExample();
        OASPinMediaWithVideos pinMediaWithVideos2 = new OASPinMediaWithVideos();

        System.assertEquals(false, pinMediaWithVideos1.equals('foo'));
        System.assertEquals(false, pinMediaWithVideos2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPinMediaWithVideos pinMediaWithVideos1 = OASPinMediaWithVideos.getExample();
        OASPinMediaWithVideos pinMediaWithVideos2 = new OASPinMediaWithVideos();
        OASPinMediaWithVideos pinMediaWithVideos3;

        System.assertEquals(false, pinMediaWithVideos1.equals(pinMediaWithVideos3));
        System.assertEquals(false, pinMediaWithVideos2.equals(pinMediaWithVideos3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPinMediaWithVideos pinMediaWithVideos1 = OASPinMediaWithVideos.getExample();
        OASPinMediaWithVideos pinMediaWithVideos2 = new OASPinMediaWithVideos();

        System.assertEquals(pinMediaWithVideos1.hashCode(), pinMediaWithVideos1.hashCode());
        System.assertEquals(pinMediaWithVideos2.hashCode(), pinMediaWithVideos2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPinMediaWithVideos pinMediaWithVideos1 = OASPinMediaWithVideos.getExample();
        OASPinMediaWithVideos pinMediaWithVideos2 = OASPinMediaWithVideos.getExample();
        OASPinMediaWithVideos pinMediaWithVideos3 = new OASPinMediaWithVideos();
        OASPinMediaWithVideos pinMediaWithVideos4 = new OASPinMediaWithVideos();

        System.assert(pinMediaWithVideos1.equals(pinMediaWithVideos2));
        System.assert(pinMediaWithVideos3.equals(pinMediaWithVideos4));
        System.assertEquals(pinMediaWithVideos1.hashCode(), pinMediaWithVideos2.hashCode());
        System.assertEquals(pinMediaWithVideos3.hashCode(), pinMediaWithVideos4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPinMediaWithVideos pinMediaWithVideos = new OASPinMediaWithVideos();
        Map<String, String> x-property-mappings = pinMediaWithVideos.getx-property-mappings();
        System.assertEquals('mediaType', x-property-mappings.get('media_type'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPinMediaWithVideos pinMediaWithVideos = new OASPinMediaWithVideos();
        System.assertEquals(new List<OASVideoMetadata>(), pinMediaWithVideos.items);
        System.assertEquals(null, pinMediaWithVideos.mediaType);
    }
}
