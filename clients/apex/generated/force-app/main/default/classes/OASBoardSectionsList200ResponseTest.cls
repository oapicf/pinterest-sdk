@isTest
private class OASBoardSectionsList200ResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASBoardSectionsList200Response boardSectionsList200Response1 = OASBoardSectionsList200Response.getExample();
        OASBoardSectionsList200Response boardSectionsList200Response2 = boardSectionsList200Response1;
        OASBoardSectionsList200Response boardSectionsList200Response3 = new OASBoardSectionsList200Response();
        OASBoardSectionsList200Response boardSectionsList200Response4 = boardSectionsList200Response3;

        System.assert(boardSectionsList200Response1.equals(boardSectionsList200Response2));
        System.assert(boardSectionsList200Response2.equals(boardSectionsList200Response1));
        System.assert(boardSectionsList200Response1.equals(boardSectionsList200Response1));
        System.assert(boardSectionsList200Response3.equals(boardSectionsList200Response4));
        System.assert(boardSectionsList200Response4.equals(boardSectionsList200Response3));
        System.assert(boardSectionsList200Response3.equals(boardSectionsList200Response3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBoardSectionsList200Response boardSectionsList200Response1 = OASBoardSectionsList200Response.getExample();
        OASBoardSectionsList200Response boardSectionsList200Response2 = OASBoardSectionsList200Response.getExample();
        OASBoardSectionsList200Response boardSectionsList200Response3 = new OASBoardSectionsList200Response();
        OASBoardSectionsList200Response boardSectionsList200Response4 = new OASBoardSectionsList200Response();

        System.assert(boardSectionsList200Response1.equals(boardSectionsList200Response2));
        System.assert(boardSectionsList200Response2.equals(boardSectionsList200Response1));
        System.assert(boardSectionsList200Response3.equals(boardSectionsList200Response4));
        System.assert(boardSectionsList200Response4.equals(boardSectionsList200Response3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBoardSectionsList200Response boardSectionsList200Response1 = OASBoardSectionsList200Response.getExample();
        OASBoardSectionsList200Response boardSectionsList200Response2 = new OASBoardSectionsList200Response();

        System.assertEquals(false, boardSectionsList200Response1.equals('foo'));
        System.assertEquals(false, boardSectionsList200Response2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBoardSectionsList200Response boardSectionsList200Response1 = OASBoardSectionsList200Response.getExample();
        OASBoardSectionsList200Response boardSectionsList200Response2 = new OASBoardSectionsList200Response();
        OASBoardSectionsList200Response boardSectionsList200Response3;

        System.assertEquals(false, boardSectionsList200Response1.equals(boardSectionsList200Response3));
        System.assertEquals(false, boardSectionsList200Response2.equals(boardSectionsList200Response3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBoardSectionsList200Response boardSectionsList200Response1 = OASBoardSectionsList200Response.getExample();
        OASBoardSectionsList200Response boardSectionsList200Response2 = new OASBoardSectionsList200Response();

        System.assertEquals(boardSectionsList200Response1.hashCode(), boardSectionsList200Response1.hashCode());
        System.assertEquals(boardSectionsList200Response2.hashCode(), boardSectionsList200Response2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBoardSectionsList200Response boardSectionsList200Response1 = OASBoardSectionsList200Response.getExample();
        OASBoardSectionsList200Response boardSectionsList200Response2 = OASBoardSectionsList200Response.getExample();
        OASBoardSectionsList200Response boardSectionsList200Response3 = new OASBoardSectionsList200Response();
        OASBoardSectionsList200Response boardSectionsList200Response4 = new OASBoardSectionsList200Response();

        System.assert(boardSectionsList200Response1.equals(boardSectionsList200Response2));
        System.assert(boardSectionsList200Response3.equals(boardSectionsList200Response4));
        System.assertEquals(boardSectionsList200Response1.hashCode(), boardSectionsList200Response2.hashCode());
        System.assertEquals(boardSectionsList200Response3.hashCode(), boardSectionsList200Response4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASBoardSectionsList200Response boardSectionsList200Response = new OASBoardSectionsList200Response();
        System.assertEquals(new List<OASBoardSection>(), boardSectionsList200Response.items);
        System.assertEquals(null, boardSectionsList200Response.bookmark);
    }
}
