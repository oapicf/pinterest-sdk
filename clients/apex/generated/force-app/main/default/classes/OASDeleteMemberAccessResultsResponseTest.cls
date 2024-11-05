@isTest
private class OASDeleteMemberAccessResultsResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASDeleteMemberAccessResultsResponse deleteMemberAccessResultsResponseArray1 = OASDeleteMemberAccessResultsResponse.getExample();
        OASDeleteMemberAccessResultsResponse deleteMemberAccessResultsResponseArray2 = deleteMemberAccessResultsResponseArray1;
        OASDeleteMemberAccessResultsResponse deleteMemberAccessResultsResponseArray3 = new OASDeleteMemberAccessResultsResponse();
        OASDeleteMemberAccessResultsResponse deleteMemberAccessResultsResponseArray4 = deleteMemberAccessResultsResponseArray3;

        System.assert(deleteMemberAccessResultsResponseArray1.equals(deleteMemberAccessResultsResponseArray2));
        System.assert(deleteMemberAccessResultsResponseArray2.equals(deleteMemberAccessResultsResponseArray1));
        System.assert(deleteMemberAccessResultsResponseArray1.equals(deleteMemberAccessResultsResponseArray1));
        System.assert(deleteMemberAccessResultsResponseArray3.equals(deleteMemberAccessResultsResponseArray4));
        System.assert(deleteMemberAccessResultsResponseArray4.equals(deleteMemberAccessResultsResponseArray3));
        System.assert(deleteMemberAccessResultsResponseArray3.equals(deleteMemberAccessResultsResponseArray3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDeleteMemberAccessResultsResponse deleteMemberAccessResultsResponseArray1 = OASDeleteMemberAccessResultsResponse.getExample();
        OASDeleteMemberAccessResultsResponse deleteMemberAccessResultsResponseArray2 = OASDeleteMemberAccessResultsResponse.getExample();
        OASDeleteMemberAccessResultsResponse deleteMemberAccessResultsResponseArray3 = new OASDeleteMemberAccessResultsResponse();
        OASDeleteMemberAccessResultsResponse deleteMemberAccessResultsResponseArray4 = new OASDeleteMemberAccessResultsResponse();

        System.assert(deleteMemberAccessResultsResponseArray1.equals(deleteMemberAccessResultsResponseArray2));
        System.assert(deleteMemberAccessResultsResponseArray2.equals(deleteMemberAccessResultsResponseArray1));
        System.assert(deleteMemberAccessResultsResponseArray3.equals(deleteMemberAccessResultsResponseArray4));
        System.assert(deleteMemberAccessResultsResponseArray4.equals(deleteMemberAccessResultsResponseArray3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDeleteMemberAccessResultsResponse deleteMemberAccessResultsResponseArray1 = OASDeleteMemberAccessResultsResponse.getExample();
        OASDeleteMemberAccessResultsResponse deleteMemberAccessResultsResponseArray2 = new OASDeleteMemberAccessResultsResponse();

        System.assertEquals(false, deleteMemberAccessResultsResponseArray1.equals('foo'));
        System.assertEquals(false, deleteMemberAccessResultsResponseArray2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDeleteMemberAccessResultsResponse deleteMemberAccessResultsResponseArray1 = OASDeleteMemberAccessResultsResponse.getExample();
        OASDeleteMemberAccessResultsResponse deleteMemberAccessResultsResponseArray2 = new OASDeleteMemberAccessResultsResponse();
        OASDeleteMemberAccessResultsResponse deleteMemberAccessResultsResponseArray3;

        System.assertEquals(false, deleteMemberAccessResultsResponseArray1.equals(deleteMemberAccessResultsResponseArray3));
        System.assertEquals(false, deleteMemberAccessResultsResponseArray2.equals(deleteMemberAccessResultsResponseArray3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDeleteMemberAccessResultsResponse deleteMemberAccessResultsResponseArray1 = OASDeleteMemberAccessResultsResponse.getExample();
        OASDeleteMemberAccessResultsResponse deleteMemberAccessResultsResponseArray2 = new OASDeleteMemberAccessResultsResponse();

        System.assertEquals(deleteMemberAccessResultsResponseArray1.hashCode(), deleteMemberAccessResultsResponseArray1.hashCode());
        System.assertEquals(deleteMemberAccessResultsResponseArray2.hashCode(), deleteMemberAccessResultsResponseArray2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDeleteMemberAccessResultsResponse deleteMemberAccessResultsResponseArray1 = OASDeleteMemberAccessResultsResponse.getExample();
        OASDeleteMemberAccessResultsResponse deleteMemberAccessResultsResponseArray2 = OASDeleteMemberAccessResultsResponse.getExample();
        OASDeleteMemberAccessResultsResponse deleteMemberAccessResultsResponseArray3 = new OASDeleteMemberAccessResultsResponse();
        OASDeleteMemberAccessResultsResponse deleteMemberAccessResultsResponseArray4 = new OASDeleteMemberAccessResultsResponse();

        System.assert(deleteMemberAccessResultsResponseArray1.equals(deleteMemberAccessResultsResponseArray2));
        System.assert(deleteMemberAccessResultsResponseArray3.equals(deleteMemberAccessResultsResponseArray4));
        System.assertEquals(deleteMemberAccessResultsResponseArray1.hashCode(), deleteMemberAccessResultsResponseArray2.hashCode());
        System.assertEquals(deleteMemberAccessResultsResponseArray3.hashCode(), deleteMemberAccessResultsResponseArray4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASDeleteMemberAccessResultsResponse deleteMemberAccessResultsResponseArray = new OASDeleteMemberAccessResultsResponse();
        System.assertEquals(new List<OASDeleteMemberAccessResult>(), deleteMemberAccessResultsResponseArray.items);
    }
}
