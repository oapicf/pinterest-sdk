@isTest
private class OASBoardsList200ResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASBoardsList200Response boardsList200Response1 = OASBoardsList200Response.getExample();
        OASBoardsList200Response boardsList200Response2 = boardsList200Response1;
        OASBoardsList200Response boardsList200Response3 = new OASBoardsList200Response();
        OASBoardsList200Response boardsList200Response4 = boardsList200Response3;

        System.assert(boardsList200Response1.equals(boardsList200Response2));
        System.assert(boardsList200Response2.equals(boardsList200Response1));
        System.assert(boardsList200Response1.equals(boardsList200Response1));
        System.assert(boardsList200Response3.equals(boardsList200Response4));
        System.assert(boardsList200Response4.equals(boardsList200Response3));
        System.assert(boardsList200Response3.equals(boardsList200Response3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBoardsList200Response boardsList200Response1 = OASBoardsList200Response.getExample();
        OASBoardsList200Response boardsList200Response2 = OASBoardsList200Response.getExample();
        OASBoardsList200Response boardsList200Response3 = new OASBoardsList200Response();
        OASBoardsList200Response boardsList200Response4 = new OASBoardsList200Response();

        System.assert(boardsList200Response1.equals(boardsList200Response2));
        System.assert(boardsList200Response2.equals(boardsList200Response1));
        System.assert(boardsList200Response3.equals(boardsList200Response4));
        System.assert(boardsList200Response4.equals(boardsList200Response3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBoardsList200Response boardsList200Response1 = OASBoardsList200Response.getExample();
        OASBoardsList200Response boardsList200Response2 = new OASBoardsList200Response();

        System.assertEquals(false, boardsList200Response1.equals('foo'));
        System.assertEquals(false, boardsList200Response2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBoardsList200Response boardsList200Response1 = OASBoardsList200Response.getExample();
        OASBoardsList200Response boardsList200Response2 = new OASBoardsList200Response();
        OASBoardsList200Response boardsList200Response3;

        System.assertEquals(false, boardsList200Response1.equals(boardsList200Response3));
        System.assertEquals(false, boardsList200Response2.equals(boardsList200Response3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBoardsList200Response boardsList200Response1 = OASBoardsList200Response.getExample();
        OASBoardsList200Response boardsList200Response2 = new OASBoardsList200Response();

        System.assertEquals(boardsList200Response1.hashCode(), boardsList200Response1.hashCode());
        System.assertEquals(boardsList200Response2.hashCode(), boardsList200Response2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBoardsList200Response boardsList200Response1 = OASBoardsList200Response.getExample();
        OASBoardsList200Response boardsList200Response2 = OASBoardsList200Response.getExample();
        OASBoardsList200Response boardsList200Response3 = new OASBoardsList200Response();
        OASBoardsList200Response boardsList200Response4 = new OASBoardsList200Response();

        System.assert(boardsList200Response1.equals(boardsList200Response2));
        System.assert(boardsList200Response3.equals(boardsList200Response4));
        System.assertEquals(boardsList200Response1.hashCode(), boardsList200Response2.hashCode());
        System.assertEquals(boardsList200Response3.hashCode(), boardsList200Response4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASBoardsList200Response boardsList200Response = new OASBoardsList200Response();
        System.assertEquals(new List<OASBoard>(), boardsList200Response.items);
        System.assertEquals(null, boardsList200Response.bookmark);
    }
}
