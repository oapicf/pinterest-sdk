@isTest
private class OASBoardWithUpdatePrivacyTest {
    @isTest
    private static void equalsSameInstance() {
        OASBoardWithUpdatePrivacy boardWithUpdatePrivacy1 = OASBoardWithUpdatePrivacy.getExample();
        OASBoardWithUpdatePrivacy boardWithUpdatePrivacy2 = boardWithUpdatePrivacy1;
        OASBoardWithUpdatePrivacy boardWithUpdatePrivacy3 = new OASBoardWithUpdatePrivacy();
        OASBoardWithUpdatePrivacy boardWithUpdatePrivacy4 = boardWithUpdatePrivacy3;

        System.assert(boardWithUpdatePrivacy1.equals(boardWithUpdatePrivacy2));
        System.assert(boardWithUpdatePrivacy2.equals(boardWithUpdatePrivacy1));
        System.assert(boardWithUpdatePrivacy1.equals(boardWithUpdatePrivacy1));
        System.assert(boardWithUpdatePrivacy3.equals(boardWithUpdatePrivacy4));
        System.assert(boardWithUpdatePrivacy4.equals(boardWithUpdatePrivacy3));
        System.assert(boardWithUpdatePrivacy3.equals(boardWithUpdatePrivacy3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBoardWithUpdatePrivacy boardWithUpdatePrivacy1 = OASBoardWithUpdatePrivacy.getExample();
        OASBoardWithUpdatePrivacy boardWithUpdatePrivacy2 = OASBoardWithUpdatePrivacy.getExample();
        OASBoardWithUpdatePrivacy boardWithUpdatePrivacy3 = new OASBoardWithUpdatePrivacy();
        OASBoardWithUpdatePrivacy boardWithUpdatePrivacy4 = new OASBoardWithUpdatePrivacy();

        System.assert(boardWithUpdatePrivacy1.equals(boardWithUpdatePrivacy2));
        System.assert(boardWithUpdatePrivacy2.equals(boardWithUpdatePrivacy1));
        System.assert(boardWithUpdatePrivacy3.equals(boardWithUpdatePrivacy4));
        System.assert(boardWithUpdatePrivacy4.equals(boardWithUpdatePrivacy3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBoardWithUpdatePrivacy boardWithUpdatePrivacy1 = OASBoardWithUpdatePrivacy.getExample();
        OASBoardWithUpdatePrivacy boardWithUpdatePrivacy2 = new OASBoardWithUpdatePrivacy();

        System.assertEquals(false, boardWithUpdatePrivacy1.equals('foo'));
        System.assertEquals(false, boardWithUpdatePrivacy2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBoardWithUpdatePrivacy boardWithUpdatePrivacy1 = OASBoardWithUpdatePrivacy.getExample();
        OASBoardWithUpdatePrivacy boardWithUpdatePrivacy2 = new OASBoardWithUpdatePrivacy();
        OASBoardWithUpdatePrivacy boardWithUpdatePrivacy3;

        System.assertEquals(false, boardWithUpdatePrivacy1.equals(boardWithUpdatePrivacy3));
        System.assertEquals(false, boardWithUpdatePrivacy2.equals(boardWithUpdatePrivacy3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBoardWithUpdatePrivacy boardWithUpdatePrivacy1 = OASBoardWithUpdatePrivacy.getExample();
        OASBoardWithUpdatePrivacy boardWithUpdatePrivacy2 = new OASBoardWithUpdatePrivacy();

        System.assertEquals(boardWithUpdatePrivacy1.hashCode(), boardWithUpdatePrivacy1.hashCode());
        System.assertEquals(boardWithUpdatePrivacy2.hashCode(), boardWithUpdatePrivacy2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBoardWithUpdatePrivacy boardWithUpdatePrivacy1 = OASBoardWithUpdatePrivacy.getExample();
        OASBoardWithUpdatePrivacy boardWithUpdatePrivacy2 = OASBoardWithUpdatePrivacy.getExample();
        OASBoardWithUpdatePrivacy boardWithUpdatePrivacy3 = new OASBoardWithUpdatePrivacy();
        OASBoardWithUpdatePrivacy boardWithUpdatePrivacy4 = new OASBoardWithUpdatePrivacy();

        System.assert(boardWithUpdatePrivacy1.equals(boardWithUpdatePrivacy2));
        System.assert(boardWithUpdatePrivacy3.equals(boardWithUpdatePrivacy4));
        System.assertEquals(boardWithUpdatePrivacy1.hashCode(), boardWithUpdatePrivacy2.hashCode());
        System.assertEquals(boardWithUpdatePrivacy3.hashCode(), boardWithUpdatePrivacy4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASBoardWithUpdatePrivacy boardWithUpdatePrivacy = new OASBoardWithUpdatePrivacy();
        Map<String, String> x-property-mappings = boardWithUpdatePrivacy.getx-property-mappings();
        System.assertEquals('boardPinsModifiedAt', x-property-mappings.get('board_pins_modified_at'));
        System.assertEquals('collaboratorCount', x-property-mappings.get('collaborator_count'));
        System.assertEquals('createdAt', x-property-mappings.get('created_at'));
        System.assertEquals('followerCount', x-property-mappings.get('follower_count'));
        System.assertEquals('isAdsOnly', x-property-mappings.get('is_ads_only'));
        System.assertEquals('pinCount', x-property-mappings.get('pin_count'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASBoardWithUpdatePrivacy boardWithUpdatePrivacy = new OASBoardWithUpdatePrivacy();
        System.assertEquals(false, boardWithUpdatePrivacy.isAdsOnly);
        System.assertEquals(null, boardWithUpdatePrivacy.boardPinsModifiedAt);
        System.assertEquals(null, boardWithUpdatePrivacy.collaboratorCount);
        System.assertEquals(null, boardWithUpdatePrivacy.createdAt);
        System.assertEquals(null, boardWithUpdatePrivacy.description);
        System.assertEquals(null, boardWithUpdatePrivacy.followerCount);
        System.assertEquals(null, boardWithUpdatePrivacy.id);
        System.assertEquals(null, boardWithUpdatePrivacy.media);
        System.assertEquals(null, boardWithUpdatePrivacy.name);
        System.assertEquals(null, boardWithUpdatePrivacy.owner);
        System.assertEquals(null, boardWithUpdatePrivacy.pinCount);
        System.assertEquals(null, boardWithUpdatePrivacy.privacy);
    }
}
