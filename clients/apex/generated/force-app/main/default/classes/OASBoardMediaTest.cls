@isTest
private class OASBoardMediaTest {
    @isTest
    private static void equalsSameInstance() {
        OASBoardMedia boardMedia1 = OASBoardMedia.getExample();
        OASBoardMedia boardMedia2 = boardMedia1;
        OASBoardMedia boardMedia3 = new OASBoardMedia();
        OASBoardMedia boardMedia4 = boardMedia3;

        System.assert(boardMedia1.equals(boardMedia2));
        System.assert(boardMedia2.equals(boardMedia1));
        System.assert(boardMedia1.equals(boardMedia1));
        System.assert(boardMedia3.equals(boardMedia4));
        System.assert(boardMedia4.equals(boardMedia3));
        System.assert(boardMedia3.equals(boardMedia3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBoardMedia boardMedia1 = OASBoardMedia.getExample();
        OASBoardMedia boardMedia2 = OASBoardMedia.getExample();
        OASBoardMedia boardMedia3 = new OASBoardMedia();
        OASBoardMedia boardMedia4 = new OASBoardMedia();

        System.assert(boardMedia1.equals(boardMedia2));
        System.assert(boardMedia2.equals(boardMedia1));
        System.assert(boardMedia3.equals(boardMedia4));
        System.assert(boardMedia4.equals(boardMedia3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBoardMedia boardMedia1 = OASBoardMedia.getExample();
        OASBoardMedia boardMedia2 = new OASBoardMedia();

        System.assertEquals(false, boardMedia1.equals('foo'));
        System.assertEquals(false, boardMedia2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBoardMedia boardMedia1 = OASBoardMedia.getExample();
        OASBoardMedia boardMedia2 = new OASBoardMedia();
        OASBoardMedia boardMedia3;

        System.assertEquals(false, boardMedia1.equals(boardMedia3));
        System.assertEquals(false, boardMedia2.equals(boardMedia3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBoardMedia boardMedia1 = OASBoardMedia.getExample();
        OASBoardMedia boardMedia2 = new OASBoardMedia();

        System.assertEquals(boardMedia1.hashCode(), boardMedia1.hashCode());
        System.assertEquals(boardMedia2.hashCode(), boardMedia2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBoardMedia boardMedia1 = OASBoardMedia.getExample();
        OASBoardMedia boardMedia2 = OASBoardMedia.getExample();
        OASBoardMedia boardMedia3 = new OASBoardMedia();
        OASBoardMedia boardMedia4 = new OASBoardMedia();

        System.assert(boardMedia1.equals(boardMedia2));
        System.assert(boardMedia3.equals(boardMedia4));
        System.assertEquals(boardMedia1.hashCode(), boardMedia2.hashCode());
        System.assertEquals(boardMedia3.hashCode(), boardMedia4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASBoardMedia boardMedia = new OASBoardMedia();
        Map<String, String> x-property-mappings = boardMedia.getx-property-mappings();
        System.assertEquals('imageCoverUrl', x-property-mappings.get('image_cover_url'));
        System.assertEquals('pinThumbnailUrls', x-property-mappings.get('pin_thumbnail_urls'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASBoardMedia boardMedia = new OASBoardMedia();
        System.assertEquals(new List<String>(), boardMedia.pinThumbnailUrls);
        System.assertEquals(null, boardMedia.imageCoverUrl);
    }
}
