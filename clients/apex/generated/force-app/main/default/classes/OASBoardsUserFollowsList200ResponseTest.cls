@isTest
private class OASBoardsUserFollowsList200ResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASBoardsUserFollowsList200Response boardsUserFollowsList200Response1 = OASBoardsUserFollowsList200Response.getExample();
        OASBoardsUserFollowsList200Response boardsUserFollowsList200Response2 = boardsUserFollowsList200Response1;
        OASBoardsUserFollowsList200Response boardsUserFollowsList200Response3 = new OASBoardsUserFollowsList200Response();
        OASBoardsUserFollowsList200Response boardsUserFollowsList200Response4 = boardsUserFollowsList200Response3;

        System.assert(boardsUserFollowsList200Response1.equals(boardsUserFollowsList200Response2));
        System.assert(boardsUserFollowsList200Response2.equals(boardsUserFollowsList200Response1));
        System.assert(boardsUserFollowsList200Response1.equals(boardsUserFollowsList200Response1));
        System.assert(boardsUserFollowsList200Response3.equals(boardsUserFollowsList200Response4));
        System.assert(boardsUserFollowsList200Response4.equals(boardsUserFollowsList200Response3));
        System.assert(boardsUserFollowsList200Response3.equals(boardsUserFollowsList200Response3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBoardsUserFollowsList200Response boardsUserFollowsList200Response1 = OASBoardsUserFollowsList200Response.getExample();
        OASBoardsUserFollowsList200Response boardsUserFollowsList200Response2 = OASBoardsUserFollowsList200Response.getExample();
        OASBoardsUserFollowsList200Response boardsUserFollowsList200Response3 = new OASBoardsUserFollowsList200Response();
        OASBoardsUserFollowsList200Response boardsUserFollowsList200Response4 = new OASBoardsUserFollowsList200Response();

        System.assert(boardsUserFollowsList200Response1.equals(boardsUserFollowsList200Response2));
        System.assert(boardsUserFollowsList200Response2.equals(boardsUserFollowsList200Response1));
        System.assert(boardsUserFollowsList200Response3.equals(boardsUserFollowsList200Response4));
        System.assert(boardsUserFollowsList200Response4.equals(boardsUserFollowsList200Response3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBoardsUserFollowsList200Response boardsUserFollowsList200Response1 = OASBoardsUserFollowsList200Response.getExample();
        OASBoardsUserFollowsList200Response boardsUserFollowsList200Response2 = new OASBoardsUserFollowsList200Response();

        System.assertEquals(false, boardsUserFollowsList200Response1.equals('foo'));
        System.assertEquals(false, boardsUserFollowsList200Response2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBoardsUserFollowsList200Response boardsUserFollowsList200Response1 = OASBoardsUserFollowsList200Response.getExample();
        OASBoardsUserFollowsList200Response boardsUserFollowsList200Response2 = new OASBoardsUserFollowsList200Response();
        OASBoardsUserFollowsList200Response boardsUserFollowsList200Response3;

        System.assertEquals(false, boardsUserFollowsList200Response1.equals(boardsUserFollowsList200Response3));
        System.assertEquals(false, boardsUserFollowsList200Response2.equals(boardsUserFollowsList200Response3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBoardsUserFollowsList200Response boardsUserFollowsList200Response1 = OASBoardsUserFollowsList200Response.getExample();
        OASBoardsUserFollowsList200Response boardsUserFollowsList200Response2 = new OASBoardsUserFollowsList200Response();

        System.assertEquals(boardsUserFollowsList200Response1.hashCode(), boardsUserFollowsList200Response1.hashCode());
        System.assertEquals(boardsUserFollowsList200Response2.hashCode(), boardsUserFollowsList200Response2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBoardsUserFollowsList200Response boardsUserFollowsList200Response1 = OASBoardsUserFollowsList200Response.getExample();
        OASBoardsUserFollowsList200Response boardsUserFollowsList200Response2 = OASBoardsUserFollowsList200Response.getExample();
        OASBoardsUserFollowsList200Response boardsUserFollowsList200Response3 = new OASBoardsUserFollowsList200Response();
        OASBoardsUserFollowsList200Response boardsUserFollowsList200Response4 = new OASBoardsUserFollowsList200Response();

        System.assert(boardsUserFollowsList200Response1.equals(boardsUserFollowsList200Response2));
        System.assert(boardsUserFollowsList200Response3.equals(boardsUserFollowsList200Response4));
        System.assertEquals(boardsUserFollowsList200Response1.hashCode(), boardsUserFollowsList200Response2.hashCode());
        System.assertEquals(boardsUserFollowsList200Response3.hashCode(), boardsUserFollowsList200Response4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASBoardsUserFollowsList200Response boardsUserFollowsList200Response = new OASBoardsUserFollowsList200Response();
        System.assertEquals(new List<OASBoard>(), boardsUserFollowsList200Response.items);
        System.assertEquals(null, boardsUserFollowsList200Response.bookmark);
    }
}
