@isTest
private class OASDeletePartnerAssetsResultsResponsTest {
    @isTest
    private static void equalsSameInstance() {
        OASDeletePartnerAssetsResultsRespons deletePartnerAssetsResultsResponseArray1 = OASDeletePartnerAssetsResultsRespons.getExample();
        OASDeletePartnerAssetsResultsRespons deletePartnerAssetsResultsResponseArray2 = deletePartnerAssetsResultsResponseArray1;
        OASDeletePartnerAssetsResultsRespons deletePartnerAssetsResultsResponseArray3 = new OASDeletePartnerAssetsResultsRespons();
        OASDeletePartnerAssetsResultsRespons deletePartnerAssetsResultsResponseArray4 = deletePartnerAssetsResultsResponseArray3;

        System.assert(deletePartnerAssetsResultsResponseArray1.equals(deletePartnerAssetsResultsResponseArray2));
        System.assert(deletePartnerAssetsResultsResponseArray2.equals(deletePartnerAssetsResultsResponseArray1));
        System.assert(deletePartnerAssetsResultsResponseArray1.equals(deletePartnerAssetsResultsResponseArray1));
        System.assert(deletePartnerAssetsResultsResponseArray3.equals(deletePartnerAssetsResultsResponseArray4));
        System.assert(deletePartnerAssetsResultsResponseArray4.equals(deletePartnerAssetsResultsResponseArray3));
        System.assert(deletePartnerAssetsResultsResponseArray3.equals(deletePartnerAssetsResultsResponseArray3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDeletePartnerAssetsResultsRespons deletePartnerAssetsResultsResponseArray1 = OASDeletePartnerAssetsResultsRespons.getExample();
        OASDeletePartnerAssetsResultsRespons deletePartnerAssetsResultsResponseArray2 = OASDeletePartnerAssetsResultsRespons.getExample();
        OASDeletePartnerAssetsResultsRespons deletePartnerAssetsResultsResponseArray3 = new OASDeletePartnerAssetsResultsRespons();
        OASDeletePartnerAssetsResultsRespons deletePartnerAssetsResultsResponseArray4 = new OASDeletePartnerAssetsResultsRespons();

        System.assert(deletePartnerAssetsResultsResponseArray1.equals(deletePartnerAssetsResultsResponseArray2));
        System.assert(deletePartnerAssetsResultsResponseArray2.equals(deletePartnerAssetsResultsResponseArray1));
        System.assert(deletePartnerAssetsResultsResponseArray3.equals(deletePartnerAssetsResultsResponseArray4));
        System.assert(deletePartnerAssetsResultsResponseArray4.equals(deletePartnerAssetsResultsResponseArray3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDeletePartnerAssetsResultsRespons deletePartnerAssetsResultsResponseArray1 = OASDeletePartnerAssetsResultsRespons.getExample();
        OASDeletePartnerAssetsResultsRespons deletePartnerAssetsResultsResponseArray2 = new OASDeletePartnerAssetsResultsRespons();

        System.assertEquals(false, deletePartnerAssetsResultsResponseArray1.equals('foo'));
        System.assertEquals(false, deletePartnerAssetsResultsResponseArray2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDeletePartnerAssetsResultsRespons deletePartnerAssetsResultsResponseArray1 = OASDeletePartnerAssetsResultsRespons.getExample();
        OASDeletePartnerAssetsResultsRespons deletePartnerAssetsResultsResponseArray2 = new OASDeletePartnerAssetsResultsRespons();
        OASDeletePartnerAssetsResultsRespons deletePartnerAssetsResultsResponseArray3;

        System.assertEquals(false, deletePartnerAssetsResultsResponseArray1.equals(deletePartnerAssetsResultsResponseArray3));
        System.assertEquals(false, deletePartnerAssetsResultsResponseArray2.equals(deletePartnerAssetsResultsResponseArray3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDeletePartnerAssetsResultsRespons deletePartnerAssetsResultsResponseArray1 = OASDeletePartnerAssetsResultsRespons.getExample();
        OASDeletePartnerAssetsResultsRespons deletePartnerAssetsResultsResponseArray2 = new OASDeletePartnerAssetsResultsRespons();

        System.assertEquals(deletePartnerAssetsResultsResponseArray1.hashCode(), deletePartnerAssetsResultsResponseArray1.hashCode());
        System.assertEquals(deletePartnerAssetsResultsResponseArray2.hashCode(), deletePartnerAssetsResultsResponseArray2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDeletePartnerAssetsResultsRespons deletePartnerAssetsResultsResponseArray1 = OASDeletePartnerAssetsResultsRespons.getExample();
        OASDeletePartnerAssetsResultsRespons deletePartnerAssetsResultsResponseArray2 = OASDeletePartnerAssetsResultsRespons.getExample();
        OASDeletePartnerAssetsResultsRespons deletePartnerAssetsResultsResponseArray3 = new OASDeletePartnerAssetsResultsRespons();
        OASDeletePartnerAssetsResultsRespons deletePartnerAssetsResultsResponseArray4 = new OASDeletePartnerAssetsResultsRespons();

        System.assert(deletePartnerAssetsResultsResponseArray1.equals(deletePartnerAssetsResultsResponseArray2));
        System.assert(deletePartnerAssetsResultsResponseArray3.equals(deletePartnerAssetsResultsResponseArray4));
        System.assertEquals(deletePartnerAssetsResultsResponseArray1.hashCode(), deletePartnerAssetsResultsResponseArray2.hashCode());
        System.assertEquals(deletePartnerAssetsResultsResponseArray3.hashCode(), deletePartnerAssetsResultsResponseArray4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASDeletePartnerAssetsResultsRespons deletePartnerAssetsResultsResponseArray = new OASDeletePartnerAssetsResultsRespons();
        System.assertEquals(new List<OASDeletePartnerAssetsResult>(), deletePartnerAssetsResultsResponseArray.items);
    }
}
