@isTest
private class OASUpdateMemberAssetsResultsResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASUpdateMemberAssetsResultsResponse updateMemberAssetsResultsResponseArrayItemsInner1 = OASUpdateMemberAssetsResultsResponse.getExample();
        OASUpdateMemberAssetsResultsResponse updateMemberAssetsResultsResponseArrayItemsInner2 = updateMemberAssetsResultsResponseArrayItemsInner1;
        OASUpdateMemberAssetsResultsResponse updateMemberAssetsResultsResponseArrayItemsInner3 = new OASUpdateMemberAssetsResultsResponse();
        OASUpdateMemberAssetsResultsResponse updateMemberAssetsResultsResponseArrayItemsInner4 = updateMemberAssetsResultsResponseArrayItemsInner3;

        System.assert(updateMemberAssetsResultsResponseArrayItemsInner1.equals(updateMemberAssetsResultsResponseArrayItemsInner2));
        System.assert(updateMemberAssetsResultsResponseArrayItemsInner2.equals(updateMemberAssetsResultsResponseArrayItemsInner1));
        System.assert(updateMemberAssetsResultsResponseArrayItemsInner1.equals(updateMemberAssetsResultsResponseArrayItemsInner1));
        System.assert(updateMemberAssetsResultsResponseArrayItemsInner3.equals(updateMemberAssetsResultsResponseArrayItemsInner4));
        System.assert(updateMemberAssetsResultsResponseArrayItemsInner4.equals(updateMemberAssetsResultsResponseArrayItemsInner3));
        System.assert(updateMemberAssetsResultsResponseArrayItemsInner3.equals(updateMemberAssetsResultsResponseArrayItemsInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUpdateMemberAssetsResultsResponse updateMemberAssetsResultsResponseArrayItemsInner1 = OASUpdateMemberAssetsResultsResponse.getExample();
        OASUpdateMemberAssetsResultsResponse updateMemberAssetsResultsResponseArrayItemsInner2 = OASUpdateMemberAssetsResultsResponse.getExample();
        OASUpdateMemberAssetsResultsResponse updateMemberAssetsResultsResponseArrayItemsInner3 = new OASUpdateMemberAssetsResultsResponse();
        OASUpdateMemberAssetsResultsResponse updateMemberAssetsResultsResponseArrayItemsInner4 = new OASUpdateMemberAssetsResultsResponse();

        System.assert(updateMemberAssetsResultsResponseArrayItemsInner1.equals(updateMemberAssetsResultsResponseArrayItemsInner2));
        System.assert(updateMemberAssetsResultsResponseArrayItemsInner2.equals(updateMemberAssetsResultsResponseArrayItemsInner1));
        System.assert(updateMemberAssetsResultsResponseArrayItemsInner3.equals(updateMemberAssetsResultsResponseArrayItemsInner4));
        System.assert(updateMemberAssetsResultsResponseArrayItemsInner4.equals(updateMemberAssetsResultsResponseArrayItemsInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUpdateMemberAssetsResultsResponse updateMemberAssetsResultsResponseArrayItemsInner1 = OASUpdateMemberAssetsResultsResponse.getExample();
        OASUpdateMemberAssetsResultsResponse updateMemberAssetsResultsResponseArrayItemsInner2 = new OASUpdateMemberAssetsResultsResponse();

        System.assertEquals(false, updateMemberAssetsResultsResponseArrayItemsInner1.equals('foo'));
        System.assertEquals(false, updateMemberAssetsResultsResponseArrayItemsInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUpdateMemberAssetsResultsResponse updateMemberAssetsResultsResponseArrayItemsInner1 = OASUpdateMemberAssetsResultsResponse.getExample();
        OASUpdateMemberAssetsResultsResponse updateMemberAssetsResultsResponseArrayItemsInner2 = new OASUpdateMemberAssetsResultsResponse();
        OASUpdateMemberAssetsResultsResponse updateMemberAssetsResultsResponseArrayItemsInner3;

        System.assertEquals(false, updateMemberAssetsResultsResponseArrayItemsInner1.equals(updateMemberAssetsResultsResponseArrayItemsInner3));
        System.assertEquals(false, updateMemberAssetsResultsResponseArrayItemsInner2.equals(updateMemberAssetsResultsResponseArrayItemsInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUpdateMemberAssetsResultsResponse updateMemberAssetsResultsResponseArrayItemsInner1 = OASUpdateMemberAssetsResultsResponse.getExample();
        OASUpdateMemberAssetsResultsResponse updateMemberAssetsResultsResponseArrayItemsInner2 = new OASUpdateMemberAssetsResultsResponse();

        System.assertEquals(updateMemberAssetsResultsResponseArrayItemsInner1.hashCode(), updateMemberAssetsResultsResponseArrayItemsInner1.hashCode());
        System.assertEquals(updateMemberAssetsResultsResponseArrayItemsInner2.hashCode(), updateMemberAssetsResultsResponseArrayItemsInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUpdateMemberAssetsResultsResponse updateMemberAssetsResultsResponseArrayItemsInner1 = OASUpdateMemberAssetsResultsResponse.getExample();
        OASUpdateMemberAssetsResultsResponse updateMemberAssetsResultsResponseArrayItemsInner2 = OASUpdateMemberAssetsResultsResponse.getExample();
        OASUpdateMemberAssetsResultsResponse updateMemberAssetsResultsResponseArrayItemsInner3 = new OASUpdateMemberAssetsResultsResponse();
        OASUpdateMemberAssetsResultsResponse updateMemberAssetsResultsResponseArrayItemsInner4 = new OASUpdateMemberAssetsResultsResponse();

        System.assert(updateMemberAssetsResultsResponseArrayItemsInner1.equals(updateMemberAssetsResultsResponseArrayItemsInner2));
        System.assert(updateMemberAssetsResultsResponseArrayItemsInner3.equals(updateMemberAssetsResultsResponseArrayItemsInner4));
        System.assertEquals(updateMemberAssetsResultsResponseArrayItemsInner1.hashCode(), updateMemberAssetsResultsResponseArrayItemsInner2.hashCode());
        System.assertEquals(updateMemberAssetsResultsResponseArrayItemsInner3.hashCode(), updateMemberAssetsResultsResponseArrayItemsInner4.hashCode());
    }
}
