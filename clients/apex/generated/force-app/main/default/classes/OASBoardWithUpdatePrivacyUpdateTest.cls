@isTest
private class OASBoardWithUpdatePrivacyUpdateTest {
    @isTest
    private static void equalsSameInstance() {
        OASBoardWithUpdatePrivacyUpdate boardWithUpdatePrivacyUpdate1 = OASBoardWithUpdatePrivacyUpdate.getExample();
        OASBoardWithUpdatePrivacyUpdate boardWithUpdatePrivacyUpdate2 = boardWithUpdatePrivacyUpdate1;
        OASBoardWithUpdatePrivacyUpdate boardWithUpdatePrivacyUpdate3 = new OASBoardWithUpdatePrivacyUpdate();
        OASBoardWithUpdatePrivacyUpdate boardWithUpdatePrivacyUpdate4 = boardWithUpdatePrivacyUpdate3;

        System.assert(boardWithUpdatePrivacyUpdate1.equals(boardWithUpdatePrivacyUpdate2));
        System.assert(boardWithUpdatePrivacyUpdate2.equals(boardWithUpdatePrivacyUpdate1));
        System.assert(boardWithUpdatePrivacyUpdate1.equals(boardWithUpdatePrivacyUpdate1));
        System.assert(boardWithUpdatePrivacyUpdate3.equals(boardWithUpdatePrivacyUpdate4));
        System.assert(boardWithUpdatePrivacyUpdate4.equals(boardWithUpdatePrivacyUpdate3));
        System.assert(boardWithUpdatePrivacyUpdate3.equals(boardWithUpdatePrivacyUpdate3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBoardWithUpdatePrivacyUpdate boardWithUpdatePrivacyUpdate1 = OASBoardWithUpdatePrivacyUpdate.getExample();
        OASBoardWithUpdatePrivacyUpdate boardWithUpdatePrivacyUpdate2 = OASBoardWithUpdatePrivacyUpdate.getExample();
        OASBoardWithUpdatePrivacyUpdate boardWithUpdatePrivacyUpdate3 = new OASBoardWithUpdatePrivacyUpdate();
        OASBoardWithUpdatePrivacyUpdate boardWithUpdatePrivacyUpdate4 = new OASBoardWithUpdatePrivacyUpdate();

        System.assert(boardWithUpdatePrivacyUpdate1.equals(boardWithUpdatePrivacyUpdate2));
        System.assert(boardWithUpdatePrivacyUpdate2.equals(boardWithUpdatePrivacyUpdate1));
        System.assert(boardWithUpdatePrivacyUpdate3.equals(boardWithUpdatePrivacyUpdate4));
        System.assert(boardWithUpdatePrivacyUpdate4.equals(boardWithUpdatePrivacyUpdate3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBoardWithUpdatePrivacyUpdate boardWithUpdatePrivacyUpdate1 = OASBoardWithUpdatePrivacyUpdate.getExample();
        OASBoardWithUpdatePrivacyUpdate boardWithUpdatePrivacyUpdate2 = new OASBoardWithUpdatePrivacyUpdate();

        System.assertEquals(false, boardWithUpdatePrivacyUpdate1.equals('foo'));
        System.assertEquals(false, boardWithUpdatePrivacyUpdate2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBoardWithUpdatePrivacyUpdate boardWithUpdatePrivacyUpdate1 = OASBoardWithUpdatePrivacyUpdate.getExample();
        OASBoardWithUpdatePrivacyUpdate boardWithUpdatePrivacyUpdate2 = new OASBoardWithUpdatePrivacyUpdate();
        OASBoardWithUpdatePrivacyUpdate boardWithUpdatePrivacyUpdate3;

        System.assertEquals(false, boardWithUpdatePrivacyUpdate1.equals(boardWithUpdatePrivacyUpdate3));
        System.assertEquals(false, boardWithUpdatePrivacyUpdate2.equals(boardWithUpdatePrivacyUpdate3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBoardWithUpdatePrivacyUpdate boardWithUpdatePrivacyUpdate1 = OASBoardWithUpdatePrivacyUpdate.getExample();
        OASBoardWithUpdatePrivacyUpdate boardWithUpdatePrivacyUpdate2 = new OASBoardWithUpdatePrivacyUpdate();

        System.assertEquals(boardWithUpdatePrivacyUpdate1.hashCode(), boardWithUpdatePrivacyUpdate1.hashCode());
        System.assertEquals(boardWithUpdatePrivacyUpdate2.hashCode(), boardWithUpdatePrivacyUpdate2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBoardWithUpdatePrivacyUpdate boardWithUpdatePrivacyUpdate1 = OASBoardWithUpdatePrivacyUpdate.getExample();
        OASBoardWithUpdatePrivacyUpdate boardWithUpdatePrivacyUpdate2 = OASBoardWithUpdatePrivacyUpdate.getExample();
        OASBoardWithUpdatePrivacyUpdate boardWithUpdatePrivacyUpdate3 = new OASBoardWithUpdatePrivacyUpdate();
        OASBoardWithUpdatePrivacyUpdate boardWithUpdatePrivacyUpdate4 = new OASBoardWithUpdatePrivacyUpdate();

        System.assert(boardWithUpdatePrivacyUpdate1.equals(boardWithUpdatePrivacyUpdate2));
        System.assert(boardWithUpdatePrivacyUpdate3.equals(boardWithUpdatePrivacyUpdate4));
        System.assertEquals(boardWithUpdatePrivacyUpdate1.hashCode(), boardWithUpdatePrivacyUpdate2.hashCode());
        System.assertEquals(boardWithUpdatePrivacyUpdate3.hashCode(), boardWithUpdatePrivacyUpdate4.hashCode());
    }
}
