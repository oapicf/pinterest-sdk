@isTest
private class OASBoardTest {
    @isTest
    private static void equalsSameInstance() {
        OASBoard board1 = OASBoard.getExample();
        OASBoard board2 = board1;
        OASBoard board3 = new OASBoard();
        OASBoard board4 = board3;

        System.assert(board1.equals(board2));
        System.assert(board2.equals(board1));
        System.assert(board1.equals(board1));
        System.assert(board3.equals(board4));
        System.assert(board4.equals(board3));
        System.assert(board3.equals(board3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBoard board1 = OASBoard.getExample();
        OASBoard board2 = OASBoard.getExample();
        OASBoard board3 = new OASBoard();
        OASBoard board4 = new OASBoard();

        System.assert(board1.equals(board2));
        System.assert(board2.equals(board1));
        System.assert(board3.equals(board4));
        System.assert(board4.equals(board3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBoard board1 = OASBoard.getExample();
        OASBoard board2 = new OASBoard();

        System.assertEquals(false, board1.equals('foo'));
        System.assertEquals(false, board2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBoard board1 = OASBoard.getExample();
        OASBoard board2 = new OASBoard();
        OASBoard board3;

        System.assertEquals(false, board1.equals(board3));
        System.assertEquals(false, board2.equals(board3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBoard board1 = OASBoard.getExample();
        OASBoard board2 = new OASBoard();

        System.assertEquals(board1.hashCode(), board1.hashCode());
        System.assertEquals(board2.hashCode(), board2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBoard board1 = OASBoard.getExample();
        OASBoard board2 = OASBoard.getExample();
        OASBoard board3 = new OASBoard();
        OASBoard board4 = new OASBoard();

        System.assert(board1.equals(board2));
        System.assert(board3.equals(board4));
        System.assertEquals(board1.hashCode(), board2.hashCode());
        System.assertEquals(board3.hashCode(), board4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASBoard board = new OASBoard();
        System.assertEquals(PrivacyEnum.PUBLIC, board.privacy);
        System.assertEquals(null, board.id);
        System.assertEquals(null, board.name);
        System.assertEquals(null, board.description);
        System.assertEquals(null, board.owner);
    }
}
