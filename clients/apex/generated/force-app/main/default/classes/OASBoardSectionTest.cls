@isTest
private class OASBoardSectionTest {
    @isTest
    private static void equalsSameInstance() {
        OASBoardSection boardSection1 = OASBoardSection.getExample();
        OASBoardSection boardSection2 = boardSection1;
        OASBoardSection boardSection3 = new OASBoardSection();
        OASBoardSection boardSection4 = boardSection3;

        System.assert(boardSection1.equals(boardSection2));
        System.assert(boardSection2.equals(boardSection1));
        System.assert(boardSection1.equals(boardSection1));
        System.assert(boardSection3.equals(boardSection4));
        System.assert(boardSection4.equals(boardSection3));
        System.assert(boardSection3.equals(boardSection3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBoardSection boardSection1 = OASBoardSection.getExample();
        OASBoardSection boardSection2 = OASBoardSection.getExample();
        OASBoardSection boardSection3 = new OASBoardSection();
        OASBoardSection boardSection4 = new OASBoardSection();

        System.assert(boardSection1.equals(boardSection2));
        System.assert(boardSection2.equals(boardSection1));
        System.assert(boardSection3.equals(boardSection4));
        System.assert(boardSection4.equals(boardSection3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBoardSection boardSection1 = OASBoardSection.getExample();
        OASBoardSection boardSection2 = new OASBoardSection();

        System.assertEquals(false, boardSection1.equals('foo'));
        System.assertEquals(false, boardSection2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBoardSection boardSection1 = OASBoardSection.getExample();
        OASBoardSection boardSection2 = new OASBoardSection();
        OASBoardSection boardSection3;

        System.assertEquals(false, boardSection1.equals(boardSection3));
        System.assertEquals(false, boardSection2.equals(boardSection3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBoardSection boardSection1 = OASBoardSection.getExample();
        OASBoardSection boardSection2 = new OASBoardSection();

        System.assertEquals(boardSection1.hashCode(), boardSection1.hashCode());
        System.assertEquals(boardSection2.hashCode(), boardSection2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBoardSection boardSection1 = OASBoardSection.getExample();
        OASBoardSection boardSection2 = OASBoardSection.getExample();
        OASBoardSection boardSection3 = new OASBoardSection();
        OASBoardSection boardSection4 = new OASBoardSection();

        System.assert(boardSection1.equals(boardSection2));
        System.assert(boardSection3.equals(boardSection4));
        System.assertEquals(boardSection1.hashCode(), boardSection2.hashCode());
        System.assertEquals(boardSection3.hashCode(), boardSection4.hashCode());
    }
}
