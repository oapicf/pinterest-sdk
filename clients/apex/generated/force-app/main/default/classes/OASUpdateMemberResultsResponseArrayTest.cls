@isTest
private class OASUpdateMemberResultsResponseArrayTest {
    @isTest
    private static void equalsSameInstance() {
        OASUpdateMemberResultsResponseArray updateMemberResultsResponseArray1 = OASUpdateMemberResultsResponseArray.getExample();
        OASUpdateMemberResultsResponseArray updateMemberResultsResponseArray2 = updateMemberResultsResponseArray1;
        OASUpdateMemberResultsResponseArray updateMemberResultsResponseArray3 = new OASUpdateMemberResultsResponseArray();
        OASUpdateMemberResultsResponseArray updateMemberResultsResponseArray4 = updateMemberResultsResponseArray3;

        System.assert(updateMemberResultsResponseArray1.equals(updateMemberResultsResponseArray2));
        System.assert(updateMemberResultsResponseArray2.equals(updateMemberResultsResponseArray1));
        System.assert(updateMemberResultsResponseArray1.equals(updateMemberResultsResponseArray1));
        System.assert(updateMemberResultsResponseArray3.equals(updateMemberResultsResponseArray4));
        System.assert(updateMemberResultsResponseArray4.equals(updateMemberResultsResponseArray3));
        System.assert(updateMemberResultsResponseArray3.equals(updateMemberResultsResponseArray3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUpdateMemberResultsResponseArray updateMemberResultsResponseArray1 = OASUpdateMemberResultsResponseArray.getExample();
        OASUpdateMemberResultsResponseArray updateMemberResultsResponseArray2 = OASUpdateMemberResultsResponseArray.getExample();
        OASUpdateMemberResultsResponseArray updateMemberResultsResponseArray3 = new OASUpdateMemberResultsResponseArray();
        OASUpdateMemberResultsResponseArray updateMemberResultsResponseArray4 = new OASUpdateMemberResultsResponseArray();

        System.assert(updateMemberResultsResponseArray1.equals(updateMemberResultsResponseArray2));
        System.assert(updateMemberResultsResponseArray2.equals(updateMemberResultsResponseArray1));
        System.assert(updateMemberResultsResponseArray3.equals(updateMemberResultsResponseArray4));
        System.assert(updateMemberResultsResponseArray4.equals(updateMemberResultsResponseArray3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUpdateMemberResultsResponseArray updateMemberResultsResponseArray1 = OASUpdateMemberResultsResponseArray.getExample();
        OASUpdateMemberResultsResponseArray updateMemberResultsResponseArray2 = new OASUpdateMemberResultsResponseArray();

        System.assertEquals(false, updateMemberResultsResponseArray1.equals('foo'));
        System.assertEquals(false, updateMemberResultsResponseArray2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUpdateMemberResultsResponseArray updateMemberResultsResponseArray1 = OASUpdateMemberResultsResponseArray.getExample();
        OASUpdateMemberResultsResponseArray updateMemberResultsResponseArray2 = new OASUpdateMemberResultsResponseArray();
        OASUpdateMemberResultsResponseArray updateMemberResultsResponseArray3;

        System.assertEquals(false, updateMemberResultsResponseArray1.equals(updateMemberResultsResponseArray3));
        System.assertEquals(false, updateMemberResultsResponseArray2.equals(updateMemberResultsResponseArray3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUpdateMemberResultsResponseArray updateMemberResultsResponseArray1 = OASUpdateMemberResultsResponseArray.getExample();
        OASUpdateMemberResultsResponseArray updateMemberResultsResponseArray2 = new OASUpdateMemberResultsResponseArray();

        System.assertEquals(updateMemberResultsResponseArray1.hashCode(), updateMemberResultsResponseArray1.hashCode());
        System.assertEquals(updateMemberResultsResponseArray2.hashCode(), updateMemberResultsResponseArray2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUpdateMemberResultsResponseArray updateMemberResultsResponseArray1 = OASUpdateMemberResultsResponseArray.getExample();
        OASUpdateMemberResultsResponseArray updateMemberResultsResponseArray2 = OASUpdateMemberResultsResponseArray.getExample();
        OASUpdateMemberResultsResponseArray updateMemberResultsResponseArray3 = new OASUpdateMemberResultsResponseArray();
        OASUpdateMemberResultsResponseArray updateMemberResultsResponseArray4 = new OASUpdateMemberResultsResponseArray();

        System.assert(updateMemberResultsResponseArray1.equals(updateMemberResultsResponseArray2));
        System.assert(updateMemberResultsResponseArray3.equals(updateMemberResultsResponseArray4));
        System.assertEquals(updateMemberResultsResponseArray1.hashCode(), updateMemberResultsResponseArray2.hashCode());
        System.assertEquals(updateMemberResultsResponseArray3.hashCode(), updateMemberResultsResponseArray4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASUpdateMemberResultsResponseArray updateMemberResultsResponseArray = new OASUpdateMemberResultsResponseArray();
        System.assertEquals(new List<OASUpdateMemberResult>(), updateMemberResultsResponseArray.items);
    }
}
