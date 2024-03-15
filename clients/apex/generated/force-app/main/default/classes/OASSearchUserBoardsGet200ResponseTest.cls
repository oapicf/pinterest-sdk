@isTest
private class OASSearchUserBoardsGet200ResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASSearchUserBoardsGet200Response searchUserBoardsGet200Response1 = OASSearchUserBoardsGet200Response.getExample();
        OASSearchUserBoardsGet200Response searchUserBoardsGet200Response2 = searchUserBoardsGet200Response1;
        OASSearchUserBoardsGet200Response searchUserBoardsGet200Response3 = new OASSearchUserBoardsGet200Response();
        OASSearchUserBoardsGet200Response searchUserBoardsGet200Response4 = searchUserBoardsGet200Response3;

        System.assert(searchUserBoardsGet200Response1.equals(searchUserBoardsGet200Response2));
        System.assert(searchUserBoardsGet200Response2.equals(searchUserBoardsGet200Response1));
        System.assert(searchUserBoardsGet200Response1.equals(searchUserBoardsGet200Response1));
        System.assert(searchUserBoardsGet200Response3.equals(searchUserBoardsGet200Response4));
        System.assert(searchUserBoardsGet200Response4.equals(searchUserBoardsGet200Response3));
        System.assert(searchUserBoardsGet200Response3.equals(searchUserBoardsGet200Response3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASSearchUserBoardsGet200Response searchUserBoardsGet200Response1 = OASSearchUserBoardsGet200Response.getExample();
        OASSearchUserBoardsGet200Response searchUserBoardsGet200Response2 = OASSearchUserBoardsGet200Response.getExample();
        OASSearchUserBoardsGet200Response searchUserBoardsGet200Response3 = new OASSearchUserBoardsGet200Response();
        OASSearchUserBoardsGet200Response searchUserBoardsGet200Response4 = new OASSearchUserBoardsGet200Response();

        System.assert(searchUserBoardsGet200Response1.equals(searchUserBoardsGet200Response2));
        System.assert(searchUserBoardsGet200Response2.equals(searchUserBoardsGet200Response1));
        System.assert(searchUserBoardsGet200Response3.equals(searchUserBoardsGet200Response4));
        System.assert(searchUserBoardsGet200Response4.equals(searchUserBoardsGet200Response3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASSearchUserBoardsGet200Response searchUserBoardsGet200Response1 = OASSearchUserBoardsGet200Response.getExample();
        OASSearchUserBoardsGet200Response searchUserBoardsGet200Response2 = new OASSearchUserBoardsGet200Response();

        System.assertEquals(false, searchUserBoardsGet200Response1.equals('foo'));
        System.assertEquals(false, searchUserBoardsGet200Response2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASSearchUserBoardsGet200Response searchUserBoardsGet200Response1 = OASSearchUserBoardsGet200Response.getExample();
        OASSearchUserBoardsGet200Response searchUserBoardsGet200Response2 = new OASSearchUserBoardsGet200Response();
        OASSearchUserBoardsGet200Response searchUserBoardsGet200Response3;

        System.assertEquals(false, searchUserBoardsGet200Response1.equals(searchUserBoardsGet200Response3));
        System.assertEquals(false, searchUserBoardsGet200Response2.equals(searchUserBoardsGet200Response3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASSearchUserBoardsGet200Response searchUserBoardsGet200Response1 = OASSearchUserBoardsGet200Response.getExample();
        OASSearchUserBoardsGet200Response searchUserBoardsGet200Response2 = new OASSearchUserBoardsGet200Response();

        System.assertEquals(searchUserBoardsGet200Response1.hashCode(), searchUserBoardsGet200Response1.hashCode());
        System.assertEquals(searchUserBoardsGet200Response2.hashCode(), searchUserBoardsGet200Response2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASSearchUserBoardsGet200Response searchUserBoardsGet200Response1 = OASSearchUserBoardsGet200Response.getExample();
        OASSearchUserBoardsGet200Response searchUserBoardsGet200Response2 = OASSearchUserBoardsGet200Response.getExample();
        OASSearchUserBoardsGet200Response searchUserBoardsGet200Response3 = new OASSearchUserBoardsGet200Response();
        OASSearchUserBoardsGet200Response searchUserBoardsGet200Response4 = new OASSearchUserBoardsGet200Response();

        System.assert(searchUserBoardsGet200Response1.equals(searchUserBoardsGet200Response2));
        System.assert(searchUserBoardsGet200Response3.equals(searchUserBoardsGet200Response4));
        System.assertEquals(searchUserBoardsGet200Response1.hashCode(), searchUserBoardsGet200Response2.hashCode());
        System.assertEquals(searchUserBoardsGet200Response3.hashCode(), searchUserBoardsGet200Response4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASSearchUserBoardsGet200Response searchUserBoardsGet200Response = new OASSearchUserBoardsGet200Response();
        System.assertEquals(new List<OASBoard>(), searchUserBoardsGet200Response.items);
        System.assertEquals(null, searchUserBoardsGet200Response.bookmark);
    }
}
