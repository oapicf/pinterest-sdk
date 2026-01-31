@isTest
private class OASBoardBaseTest {
    @isTest
    private static void equalsSameInstance() {
        OASBoardBase boardBase1 = OASBoardBase.getExample();
        OASBoardBase boardBase2 = boardBase1;
        OASBoardBase boardBase3 = new OASBoardBase();
        OASBoardBase boardBase4 = boardBase3;

        System.assert(boardBase1.equals(boardBase2));
        System.assert(boardBase2.equals(boardBase1));
        System.assert(boardBase1.equals(boardBase1));
        System.assert(boardBase3.equals(boardBase4));
        System.assert(boardBase4.equals(boardBase3));
        System.assert(boardBase3.equals(boardBase3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBoardBase boardBase1 = OASBoardBase.getExample();
        OASBoardBase boardBase2 = OASBoardBase.getExample();
        OASBoardBase boardBase3 = new OASBoardBase();
        OASBoardBase boardBase4 = new OASBoardBase();

        System.assert(boardBase1.equals(boardBase2));
        System.assert(boardBase2.equals(boardBase1));
        System.assert(boardBase3.equals(boardBase4));
        System.assert(boardBase4.equals(boardBase3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBoardBase boardBase1 = OASBoardBase.getExample();
        OASBoardBase boardBase2 = new OASBoardBase();

        System.assertEquals(false, boardBase1.equals('foo'));
        System.assertEquals(false, boardBase2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBoardBase boardBase1 = OASBoardBase.getExample();
        OASBoardBase boardBase2 = new OASBoardBase();
        OASBoardBase boardBase3;

        System.assertEquals(false, boardBase1.equals(boardBase3));
        System.assertEquals(false, boardBase2.equals(boardBase3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBoardBase boardBase1 = OASBoardBase.getExample();
        OASBoardBase boardBase2 = new OASBoardBase();

        System.assertEquals(boardBase1.hashCode(), boardBase1.hashCode());
        System.assertEquals(boardBase2.hashCode(), boardBase2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBoardBase boardBase1 = OASBoardBase.getExample();
        OASBoardBase boardBase2 = OASBoardBase.getExample();
        OASBoardBase boardBase3 = new OASBoardBase();
        OASBoardBase boardBase4 = new OASBoardBase();

        System.assert(boardBase1.equals(boardBase2));
        System.assert(boardBase3.equals(boardBase4));
        System.assertEquals(boardBase1.hashCode(), boardBase2.hashCode());
        System.assertEquals(boardBase3.hashCode(), boardBase4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASBoardBase boardBase = new OASBoardBase();
        Map<String, String> x-property-mappings = boardBase.getx-property-mappings();
        System.assertEquals('boardPinsModifiedAt', x-property-mappings.get('board_pins_modified_at'));
        System.assertEquals('collaboratorCount', x-property-mappings.get('collaborator_count'));
        System.assertEquals('createdAt', x-property-mappings.get('created_at'));
        System.assertEquals('followerCount', x-property-mappings.get('follower_count'));
        System.assertEquals('isAdsOnly', x-property-mappings.get('is_ads_only'));
        System.assertEquals('pinCount', x-property-mappings.get('pin_count'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASBoardBase boardBase = new OASBoardBase();
        System.assertEquals(false, boardBase.isAdsOnly);
        System.assertEquals(null, boardBase.boardPinsModifiedAt);
        System.assertEquals(null, boardBase.collaboratorCount);
        System.assertEquals(null, boardBase.createdAt);
        System.assertEquals(null, boardBase.description);
        System.assertEquals(null, boardBase.followerCount);
        System.assertEquals(null, boardBase.id);
        System.assertEquals(null, boardBase.media);
        System.assertEquals(null, boardBase.name);
        System.assertEquals(null, boardBase.owner);
        System.assertEquals(null, boardBase.pinCount);
    }
}
