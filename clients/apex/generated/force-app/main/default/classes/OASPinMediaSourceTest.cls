@isTest
private class OASPinMediaSourceTest {
    @isTest
    private static void equalsSameInstance() {
        OASPinMediaSource pinMediaSource1 = OASPinMediaSource.getExample();
        OASPinMediaSource pinMediaSource2 = pinMediaSource1;
        OASPinMediaSource pinMediaSource3 = new OASPinMediaSource();
        OASPinMediaSource pinMediaSource4 = pinMediaSource3;

        System.assert(pinMediaSource1.equals(pinMediaSource2));
        System.assert(pinMediaSource2.equals(pinMediaSource1));
        System.assert(pinMediaSource1.equals(pinMediaSource1));
        System.assert(pinMediaSource3.equals(pinMediaSource4));
        System.assert(pinMediaSource4.equals(pinMediaSource3));
        System.assert(pinMediaSource3.equals(pinMediaSource3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPinMediaSource pinMediaSource1 = OASPinMediaSource.getExample();
        OASPinMediaSource pinMediaSource2 = OASPinMediaSource.getExample();
        OASPinMediaSource pinMediaSource3 = new OASPinMediaSource();
        OASPinMediaSource pinMediaSource4 = new OASPinMediaSource();

        System.assert(pinMediaSource1.equals(pinMediaSource2));
        System.assert(pinMediaSource2.equals(pinMediaSource1));
        System.assert(pinMediaSource3.equals(pinMediaSource4));
        System.assert(pinMediaSource4.equals(pinMediaSource3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPinMediaSource pinMediaSource1 = OASPinMediaSource.getExample();
        OASPinMediaSource pinMediaSource2 = new OASPinMediaSource();

        System.assertEquals(false, pinMediaSource1.equals('foo'));
        System.assertEquals(false, pinMediaSource2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPinMediaSource pinMediaSource1 = OASPinMediaSource.getExample();
        OASPinMediaSource pinMediaSource2 = new OASPinMediaSource();
        OASPinMediaSource pinMediaSource3;

        System.assertEquals(false, pinMediaSource1.equals(pinMediaSource3));
        System.assertEquals(false, pinMediaSource2.equals(pinMediaSource3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPinMediaSource pinMediaSource1 = OASPinMediaSource.getExample();
        OASPinMediaSource pinMediaSource2 = new OASPinMediaSource();

        System.assertEquals(pinMediaSource1.hashCode(), pinMediaSource1.hashCode());
        System.assertEquals(pinMediaSource2.hashCode(), pinMediaSource2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPinMediaSource pinMediaSource1 = OASPinMediaSource.getExample();
        OASPinMediaSource pinMediaSource2 = OASPinMediaSource.getExample();
        OASPinMediaSource pinMediaSource3 = new OASPinMediaSource();
        OASPinMediaSource pinMediaSource4 = new OASPinMediaSource();

        System.assert(pinMediaSource1.equals(pinMediaSource2));
        System.assert(pinMediaSource3.equals(pinMediaSource4));
        System.assertEquals(pinMediaSource1.hashCode(), pinMediaSource2.hashCode());
        System.assertEquals(pinMediaSource3.hashCode(), pinMediaSource4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPinMediaSource pinMediaSource = new OASPinMediaSource();
        Map<String, String> x-property-mappings = pinMediaSource.getx-property-mappings();
        System.assertEquals('sourceType', x-property-mappings.get('source_type'));
        System.assertEquals('contentType', x-property-mappings.get('content_type'));
        System.assertEquals('isStandard', x-property-mappings.get('is_standard'));
        System.assertEquals('coverImageUrl', x-property-mappings.get('cover_image_url'));
        System.assertEquals('coverImageContentType', x-property-mappings.get('cover_image_content_type'));
        System.assertEquals('coverImageData', x-property-mappings.get('cover_image_data'));
        System.assertEquals('mediaId', x-property-mappings.get('media_id'));
        System.assertEquals('isAffiliateLink', x-property-mappings.get('is_affiliate_link'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPinMediaSource pinMediaSource = new OASPinMediaSource();
        System.assertEquals(true, pinMediaSource.isStandard);
        System.assertEquals(new List<OASPinMediaSourceImagesURLItemsInner>(), pinMediaSource.items);
        System.assertEquals(false, pinMediaSource.isAffiliateLink);
        System.assertEquals(null, pinMediaSource.sourceType);
        System.assertEquals(null, pinMediaSource.contentType);
        System.assertEquals(null, pinMediaSource.data);
        System.assertEquals(null, pinMediaSource.url);
        System.assertEquals(null, pinMediaSource.coverImageUrl);
        System.assertEquals(null, pinMediaSource.coverImageContentType);
        System.assertEquals(null, pinMediaSource.coverImageData);
        System.assertEquals(null, pinMediaSource.mediaId);
        System.assertEquals(null, pinMediaSource.index);
    }
}
