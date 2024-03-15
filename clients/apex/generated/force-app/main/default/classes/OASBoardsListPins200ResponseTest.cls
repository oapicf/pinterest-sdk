@isTest
private class OASBoardsListPins200ResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASBoardsListPins200Response boardsListPins200Response1 = OASBoardsListPins200Response.getExample();
        OASBoardsListPins200Response boardsListPins200Response2 = boardsListPins200Response1;
        OASBoardsListPins200Response boardsListPins200Response3 = new OASBoardsListPins200Response();
        OASBoardsListPins200Response boardsListPins200Response4 = boardsListPins200Response3;

        System.assert(boardsListPins200Response1.equals(boardsListPins200Response2));
        System.assert(boardsListPins200Response2.equals(boardsListPins200Response1));
        System.assert(boardsListPins200Response1.equals(boardsListPins200Response1));
        System.assert(boardsListPins200Response3.equals(boardsListPins200Response4));
        System.assert(boardsListPins200Response4.equals(boardsListPins200Response3));
        System.assert(boardsListPins200Response3.equals(boardsListPins200Response3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBoardsListPins200Response boardsListPins200Response1 = OASBoardsListPins200Response.getExample();
        OASBoardsListPins200Response boardsListPins200Response2 = OASBoardsListPins200Response.getExample();
        OASBoardsListPins200Response boardsListPins200Response3 = new OASBoardsListPins200Response();
        OASBoardsListPins200Response boardsListPins200Response4 = new OASBoardsListPins200Response();

        System.assert(boardsListPins200Response1.equals(boardsListPins200Response2));
        System.assert(boardsListPins200Response2.equals(boardsListPins200Response1));
        System.assert(boardsListPins200Response3.equals(boardsListPins200Response4));
        System.assert(boardsListPins200Response4.equals(boardsListPins200Response3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBoardsListPins200Response boardsListPins200Response1 = OASBoardsListPins200Response.getExample();
        OASBoardsListPins200Response boardsListPins200Response2 = new OASBoardsListPins200Response();

        System.assertEquals(false, boardsListPins200Response1.equals('foo'));
        System.assertEquals(false, boardsListPins200Response2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBoardsListPins200Response boardsListPins200Response1 = OASBoardsListPins200Response.getExample();
        OASBoardsListPins200Response boardsListPins200Response2 = new OASBoardsListPins200Response();
        OASBoardsListPins200Response boardsListPins200Response3;

        System.assertEquals(false, boardsListPins200Response1.equals(boardsListPins200Response3));
        System.assertEquals(false, boardsListPins200Response2.equals(boardsListPins200Response3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBoardsListPins200Response boardsListPins200Response1 = OASBoardsListPins200Response.getExample();
        OASBoardsListPins200Response boardsListPins200Response2 = new OASBoardsListPins200Response();

        System.assertEquals(boardsListPins200Response1.hashCode(), boardsListPins200Response1.hashCode());
        System.assertEquals(boardsListPins200Response2.hashCode(), boardsListPins200Response2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBoardsListPins200Response boardsListPins200Response1 = OASBoardsListPins200Response.getExample();
        OASBoardsListPins200Response boardsListPins200Response2 = OASBoardsListPins200Response.getExample();
        OASBoardsListPins200Response boardsListPins200Response3 = new OASBoardsListPins200Response();
        OASBoardsListPins200Response boardsListPins200Response4 = new OASBoardsListPins200Response();

        System.assert(boardsListPins200Response1.equals(boardsListPins200Response2));
        System.assert(boardsListPins200Response3.equals(boardsListPins200Response4));
        System.assertEquals(boardsListPins200Response1.hashCode(), boardsListPins200Response2.hashCode());
        System.assertEquals(boardsListPins200Response3.hashCode(), boardsListPins200Response4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASBoardsListPins200Response boardsListPins200Response = new OASBoardsListPins200Response();
        System.assertEquals(new List<OASPin>(), boardsListPins200Response.items);
        System.assertEquals(null, boardsListPins200Response.bookmark);
    }
}
