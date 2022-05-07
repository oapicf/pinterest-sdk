@isTest
private class OASBoardUpdateTest {
    @isTest
    private static void equalsSameInstance() {
        OASBoardUpdate boardUpdate1 = OASBoardUpdate.getExample();
        OASBoardUpdate boardUpdate2 = boardUpdate1;
        OASBoardUpdate boardUpdate3 = new OASBoardUpdate();
        OASBoardUpdate boardUpdate4 = boardUpdate3;

        System.assert(boardUpdate1.equals(boardUpdate2));
        System.assert(boardUpdate2.equals(boardUpdate1));
        System.assert(boardUpdate1.equals(boardUpdate1));
        System.assert(boardUpdate3.equals(boardUpdate4));
        System.assert(boardUpdate4.equals(boardUpdate3));
        System.assert(boardUpdate3.equals(boardUpdate3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBoardUpdate boardUpdate1 = OASBoardUpdate.getExample();
        OASBoardUpdate boardUpdate2 = OASBoardUpdate.getExample();
        OASBoardUpdate boardUpdate3 = new OASBoardUpdate();
        OASBoardUpdate boardUpdate4 = new OASBoardUpdate();

        System.assert(boardUpdate1.equals(boardUpdate2));
        System.assert(boardUpdate2.equals(boardUpdate1));
        System.assert(boardUpdate3.equals(boardUpdate4));
        System.assert(boardUpdate4.equals(boardUpdate3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBoardUpdate boardUpdate1 = OASBoardUpdate.getExample();
        OASBoardUpdate boardUpdate2 = new OASBoardUpdate();

        System.assertEquals(false, boardUpdate1.equals('foo'));
        System.assertEquals(false, boardUpdate2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBoardUpdate boardUpdate1 = OASBoardUpdate.getExample();
        OASBoardUpdate boardUpdate2 = new OASBoardUpdate();
        OASBoardUpdate boardUpdate3;

        System.assertEquals(false, boardUpdate1.equals(boardUpdate3));
        System.assertEquals(false, boardUpdate2.equals(boardUpdate3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBoardUpdate boardUpdate1 = OASBoardUpdate.getExample();
        OASBoardUpdate boardUpdate2 = new OASBoardUpdate();

        System.assertEquals(boardUpdate1.hashCode(), boardUpdate1.hashCode());
        System.assertEquals(boardUpdate2.hashCode(), boardUpdate2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBoardUpdate boardUpdate1 = OASBoardUpdate.getExample();
        OASBoardUpdate boardUpdate2 = OASBoardUpdate.getExample();
        OASBoardUpdate boardUpdate3 = new OASBoardUpdate();
        OASBoardUpdate boardUpdate4 = new OASBoardUpdate();

        System.assert(boardUpdate1.equals(boardUpdate2));
        System.assert(boardUpdate3.equals(boardUpdate4));
        System.assertEquals(boardUpdate1.hashCode(), boardUpdate2.hashCode());
        System.assertEquals(boardUpdate3.hashCode(), boardUpdate4.hashCode());
    }
}
