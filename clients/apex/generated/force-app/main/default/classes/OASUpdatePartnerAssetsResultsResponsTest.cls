@isTest
private class OASUpdatePartnerAssetsResultsResponsTest {
    @isTest
    private static void equalsSameInstance() {
        OASUpdatePartnerAssetsResultsRespons updatePartnerAssetsResultsResponseArray1 = OASUpdatePartnerAssetsResultsRespons.getExample();
        OASUpdatePartnerAssetsResultsRespons updatePartnerAssetsResultsResponseArray2 = updatePartnerAssetsResultsResponseArray1;
        OASUpdatePartnerAssetsResultsRespons updatePartnerAssetsResultsResponseArray3 = new OASUpdatePartnerAssetsResultsRespons();
        OASUpdatePartnerAssetsResultsRespons updatePartnerAssetsResultsResponseArray4 = updatePartnerAssetsResultsResponseArray3;

        System.assert(updatePartnerAssetsResultsResponseArray1.equals(updatePartnerAssetsResultsResponseArray2));
        System.assert(updatePartnerAssetsResultsResponseArray2.equals(updatePartnerAssetsResultsResponseArray1));
        System.assert(updatePartnerAssetsResultsResponseArray1.equals(updatePartnerAssetsResultsResponseArray1));
        System.assert(updatePartnerAssetsResultsResponseArray3.equals(updatePartnerAssetsResultsResponseArray4));
        System.assert(updatePartnerAssetsResultsResponseArray4.equals(updatePartnerAssetsResultsResponseArray3));
        System.assert(updatePartnerAssetsResultsResponseArray3.equals(updatePartnerAssetsResultsResponseArray3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUpdatePartnerAssetsResultsRespons updatePartnerAssetsResultsResponseArray1 = OASUpdatePartnerAssetsResultsRespons.getExample();
        OASUpdatePartnerAssetsResultsRespons updatePartnerAssetsResultsResponseArray2 = OASUpdatePartnerAssetsResultsRespons.getExample();
        OASUpdatePartnerAssetsResultsRespons updatePartnerAssetsResultsResponseArray3 = new OASUpdatePartnerAssetsResultsRespons();
        OASUpdatePartnerAssetsResultsRespons updatePartnerAssetsResultsResponseArray4 = new OASUpdatePartnerAssetsResultsRespons();

        System.assert(updatePartnerAssetsResultsResponseArray1.equals(updatePartnerAssetsResultsResponseArray2));
        System.assert(updatePartnerAssetsResultsResponseArray2.equals(updatePartnerAssetsResultsResponseArray1));
        System.assert(updatePartnerAssetsResultsResponseArray3.equals(updatePartnerAssetsResultsResponseArray4));
        System.assert(updatePartnerAssetsResultsResponseArray4.equals(updatePartnerAssetsResultsResponseArray3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUpdatePartnerAssetsResultsRespons updatePartnerAssetsResultsResponseArray1 = OASUpdatePartnerAssetsResultsRespons.getExample();
        OASUpdatePartnerAssetsResultsRespons updatePartnerAssetsResultsResponseArray2 = new OASUpdatePartnerAssetsResultsRespons();

        System.assertEquals(false, updatePartnerAssetsResultsResponseArray1.equals('foo'));
        System.assertEquals(false, updatePartnerAssetsResultsResponseArray2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUpdatePartnerAssetsResultsRespons updatePartnerAssetsResultsResponseArray1 = OASUpdatePartnerAssetsResultsRespons.getExample();
        OASUpdatePartnerAssetsResultsRespons updatePartnerAssetsResultsResponseArray2 = new OASUpdatePartnerAssetsResultsRespons();
        OASUpdatePartnerAssetsResultsRespons updatePartnerAssetsResultsResponseArray3;

        System.assertEquals(false, updatePartnerAssetsResultsResponseArray1.equals(updatePartnerAssetsResultsResponseArray3));
        System.assertEquals(false, updatePartnerAssetsResultsResponseArray2.equals(updatePartnerAssetsResultsResponseArray3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUpdatePartnerAssetsResultsRespons updatePartnerAssetsResultsResponseArray1 = OASUpdatePartnerAssetsResultsRespons.getExample();
        OASUpdatePartnerAssetsResultsRespons updatePartnerAssetsResultsResponseArray2 = new OASUpdatePartnerAssetsResultsRespons();

        System.assertEquals(updatePartnerAssetsResultsResponseArray1.hashCode(), updatePartnerAssetsResultsResponseArray1.hashCode());
        System.assertEquals(updatePartnerAssetsResultsResponseArray2.hashCode(), updatePartnerAssetsResultsResponseArray2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUpdatePartnerAssetsResultsRespons updatePartnerAssetsResultsResponseArray1 = OASUpdatePartnerAssetsResultsRespons.getExample();
        OASUpdatePartnerAssetsResultsRespons updatePartnerAssetsResultsResponseArray2 = OASUpdatePartnerAssetsResultsRespons.getExample();
        OASUpdatePartnerAssetsResultsRespons updatePartnerAssetsResultsResponseArray3 = new OASUpdatePartnerAssetsResultsRespons();
        OASUpdatePartnerAssetsResultsRespons updatePartnerAssetsResultsResponseArray4 = new OASUpdatePartnerAssetsResultsRespons();

        System.assert(updatePartnerAssetsResultsResponseArray1.equals(updatePartnerAssetsResultsResponseArray2));
        System.assert(updatePartnerAssetsResultsResponseArray3.equals(updatePartnerAssetsResultsResponseArray4));
        System.assertEquals(updatePartnerAssetsResultsResponseArray1.hashCode(), updatePartnerAssetsResultsResponseArray2.hashCode());
        System.assertEquals(updatePartnerAssetsResultsResponseArray3.hashCode(), updatePartnerAssetsResultsResponseArray4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASUpdatePartnerAssetsResultsRespons updatePartnerAssetsResultsResponseArray = new OASUpdatePartnerAssetsResultsRespons();
        System.assertEquals(new List<OASUpdatePartnerAssetsResult>(), updatePartnerAssetsResultsResponseArray.items);
    }
}
