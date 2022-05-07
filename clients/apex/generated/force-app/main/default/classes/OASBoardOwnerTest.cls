@isTest
private class OASBoardOwnerTest {
    @isTest
    private static void equalsSameInstance() {
        OASBoardOwner boardOwner1 = OASBoardOwner.getExample();
        OASBoardOwner boardOwner2 = boardOwner1;
        OASBoardOwner boardOwner3 = new OASBoardOwner();
        OASBoardOwner boardOwner4 = boardOwner3;

        System.assert(boardOwner1.equals(boardOwner2));
        System.assert(boardOwner2.equals(boardOwner1));
        System.assert(boardOwner1.equals(boardOwner1));
        System.assert(boardOwner3.equals(boardOwner4));
        System.assert(boardOwner4.equals(boardOwner3));
        System.assert(boardOwner3.equals(boardOwner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBoardOwner boardOwner1 = OASBoardOwner.getExample();
        OASBoardOwner boardOwner2 = OASBoardOwner.getExample();
        OASBoardOwner boardOwner3 = new OASBoardOwner();
        OASBoardOwner boardOwner4 = new OASBoardOwner();

        System.assert(boardOwner1.equals(boardOwner2));
        System.assert(boardOwner2.equals(boardOwner1));
        System.assert(boardOwner3.equals(boardOwner4));
        System.assert(boardOwner4.equals(boardOwner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBoardOwner boardOwner1 = OASBoardOwner.getExample();
        OASBoardOwner boardOwner2 = new OASBoardOwner();

        System.assertEquals(false, boardOwner1.equals('foo'));
        System.assertEquals(false, boardOwner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBoardOwner boardOwner1 = OASBoardOwner.getExample();
        OASBoardOwner boardOwner2 = new OASBoardOwner();
        OASBoardOwner boardOwner3;

        System.assertEquals(false, boardOwner1.equals(boardOwner3));
        System.assertEquals(false, boardOwner2.equals(boardOwner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBoardOwner boardOwner1 = OASBoardOwner.getExample();
        OASBoardOwner boardOwner2 = new OASBoardOwner();

        System.assertEquals(boardOwner1.hashCode(), boardOwner1.hashCode());
        System.assertEquals(boardOwner2.hashCode(), boardOwner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBoardOwner boardOwner1 = OASBoardOwner.getExample();
        OASBoardOwner boardOwner2 = OASBoardOwner.getExample();
        OASBoardOwner boardOwner3 = new OASBoardOwner();
        OASBoardOwner boardOwner4 = new OASBoardOwner();

        System.assert(boardOwner1.equals(boardOwner2));
        System.assert(boardOwner3.equals(boardOwner4));
        System.assertEquals(boardOwner1.hashCode(), boardOwner2.hashCode());
        System.assertEquals(boardOwner3.hashCode(), boardOwner4.hashCode());
    }
}
