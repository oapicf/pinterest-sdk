@isTest
private class OASPinMediaSourceVideoIDTest {
    @isTest
    private static void equalsSameInstance() {
        OASPinMediaSourceVideoID pinMediaSourceVideoID1 = OASPinMediaSourceVideoID.getExample();
        OASPinMediaSourceVideoID pinMediaSourceVideoID2 = pinMediaSourceVideoID1;
        OASPinMediaSourceVideoID pinMediaSourceVideoID3 = new OASPinMediaSourceVideoID();
        OASPinMediaSourceVideoID pinMediaSourceVideoID4 = pinMediaSourceVideoID3;

        System.assert(pinMediaSourceVideoID1.equals(pinMediaSourceVideoID2));
        System.assert(pinMediaSourceVideoID2.equals(pinMediaSourceVideoID1));
        System.assert(pinMediaSourceVideoID1.equals(pinMediaSourceVideoID1));
        System.assert(pinMediaSourceVideoID3.equals(pinMediaSourceVideoID4));
        System.assert(pinMediaSourceVideoID4.equals(pinMediaSourceVideoID3));
        System.assert(pinMediaSourceVideoID3.equals(pinMediaSourceVideoID3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPinMediaSourceVideoID pinMediaSourceVideoID1 = OASPinMediaSourceVideoID.getExample();
        OASPinMediaSourceVideoID pinMediaSourceVideoID2 = OASPinMediaSourceVideoID.getExample();
        OASPinMediaSourceVideoID pinMediaSourceVideoID3 = new OASPinMediaSourceVideoID();
        OASPinMediaSourceVideoID pinMediaSourceVideoID4 = new OASPinMediaSourceVideoID();

        System.assert(pinMediaSourceVideoID1.equals(pinMediaSourceVideoID2));
        System.assert(pinMediaSourceVideoID2.equals(pinMediaSourceVideoID1));
        System.assert(pinMediaSourceVideoID3.equals(pinMediaSourceVideoID4));
        System.assert(pinMediaSourceVideoID4.equals(pinMediaSourceVideoID3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPinMediaSourceVideoID pinMediaSourceVideoID1 = OASPinMediaSourceVideoID.getExample();
        OASPinMediaSourceVideoID pinMediaSourceVideoID2 = new OASPinMediaSourceVideoID();

        System.assertEquals(false, pinMediaSourceVideoID1.equals('foo'));
        System.assertEquals(false, pinMediaSourceVideoID2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPinMediaSourceVideoID pinMediaSourceVideoID1 = OASPinMediaSourceVideoID.getExample();
        OASPinMediaSourceVideoID pinMediaSourceVideoID2 = new OASPinMediaSourceVideoID();
        OASPinMediaSourceVideoID pinMediaSourceVideoID3;

        System.assertEquals(false, pinMediaSourceVideoID1.equals(pinMediaSourceVideoID3));
        System.assertEquals(false, pinMediaSourceVideoID2.equals(pinMediaSourceVideoID3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPinMediaSourceVideoID pinMediaSourceVideoID1 = OASPinMediaSourceVideoID.getExample();
        OASPinMediaSourceVideoID pinMediaSourceVideoID2 = new OASPinMediaSourceVideoID();

        System.assertEquals(pinMediaSourceVideoID1.hashCode(), pinMediaSourceVideoID1.hashCode());
        System.assertEquals(pinMediaSourceVideoID2.hashCode(), pinMediaSourceVideoID2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPinMediaSourceVideoID pinMediaSourceVideoID1 = OASPinMediaSourceVideoID.getExample();
        OASPinMediaSourceVideoID pinMediaSourceVideoID2 = OASPinMediaSourceVideoID.getExample();
        OASPinMediaSourceVideoID pinMediaSourceVideoID3 = new OASPinMediaSourceVideoID();
        OASPinMediaSourceVideoID pinMediaSourceVideoID4 = new OASPinMediaSourceVideoID();

        System.assert(pinMediaSourceVideoID1.equals(pinMediaSourceVideoID2));
        System.assert(pinMediaSourceVideoID3.equals(pinMediaSourceVideoID4));
        System.assertEquals(pinMediaSourceVideoID1.hashCode(), pinMediaSourceVideoID2.hashCode());
        System.assertEquals(pinMediaSourceVideoID3.hashCode(), pinMediaSourceVideoID4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPinMediaSourceVideoID pinMediaSourceVideoID = new OASPinMediaSourceVideoID();
        Map<String, String> x-property-mappings = pinMediaSourceVideoID.getx-property-mappings();
        System.assertEquals('sourceType', x-property-mappings.get('source_type'));
        System.assertEquals('coverImageUrl', x-property-mappings.get('cover_image_url'));
        System.assertEquals('mediaId', x-property-mappings.get('media_id'));
    }
}
