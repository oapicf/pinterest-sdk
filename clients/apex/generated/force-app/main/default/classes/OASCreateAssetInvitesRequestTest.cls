@isTest
private class OASCreateAssetInvitesRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateAssetInvitesRequest createAssetInvitesRequest1 = OASCreateAssetInvitesRequest.getExample();
        OASCreateAssetInvitesRequest createAssetInvitesRequest2 = createAssetInvitesRequest1;
        OASCreateAssetInvitesRequest createAssetInvitesRequest3 = new OASCreateAssetInvitesRequest();
        OASCreateAssetInvitesRequest createAssetInvitesRequest4 = createAssetInvitesRequest3;

        System.assert(createAssetInvitesRequest1.equals(createAssetInvitesRequest2));
        System.assert(createAssetInvitesRequest2.equals(createAssetInvitesRequest1));
        System.assert(createAssetInvitesRequest1.equals(createAssetInvitesRequest1));
        System.assert(createAssetInvitesRequest3.equals(createAssetInvitesRequest4));
        System.assert(createAssetInvitesRequest4.equals(createAssetInvitesRequest3));
        System.assert(createAssetInvitesRequest3.equals(createAssetInvitesRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateAssetInvitesRequest createAssetInvitesRequest1 = OASCreateAssetInvitesRequest.getExample();
        OASCreateAssetInvitesRequest createAssetInvitesRequest2 = OASCreateAssetInvitesRequest.getExample();
        OASCreateAssetInvitesRequest createAssetInvitesRequest3 = new OASCreateAssetInvitesRequest();
        OASCreateAssetInvitesRequest createAssetInvitesRequest4 = new OASCreateAssetInvitesRequest();

        System.assert(createAssetInvitesRequest1.equals(createAssetInvitesRequest2));
        System.assert(createAssetInvitesRequest2.equals(createAssetInvitesRequest1));
        System.assert(createAssetInvitesRequest3.equals(createAssetInvitesRequest4));
        System.assert(createAssetInvitesRequest4.equals(createAssetInvitesRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateAssetInvitesRequest createAssetInvitesRequest1 = OASCreateAssetInvitesRequest.getExample();
        OASCreateAssetInvitesRequest createAssetInvitesRequest2 = new OASCreateAssetInvitesRequest();

        System.assertEquals(false, createAssetInvitesRequest1.equals('foo'));
        System.assertEquals(false, createAssetInvitesRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateAssetInvitesRequest createAssetInvitesRequest1 = OASCreateAssetInvitesRequest.getExample();
        OASCreateAssetInvitesRequest createAssetInvitesRequest2 = new OASCreateAssetInvitesRequest();
        OASCreateAssetInvitesRequest createAssetInvitesRequest3;

        System.assertEquals(false, createAssetInvitesRequest1.equals(createAssetInvitesRequest3));
        System.assertEquals(false, createAssetInvitesRequest2.equals(createAssetInvitesRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateAssetInvitesRequest createAssetInvitesRequest1 = OASCreateAssetInvitesRequest.getExample();
        OASCreateAssetInvitesRequest createAssetInvitesRequest2 = new OASCreateAssetInvitesRequest();

        System.assertEquals(createAssetInvitesRequest1.hashCode(), createAssetInvitesRequest1.hashCode());
        System.assertEquals(createAssetInvitesRequest2.hashCode(), createAssetInvitesRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateAssetInvitesRequest createAssetInvitesRequest1 = OASCreateAssetInvitesRequest.getExample();
        OASCreateAssetInvitesRequest createAssetInvitesRequest2 = OASCreateAssetInvitesRequest.getExample();
        OASCreateAssetInvitesRequest createAssetInvitesRequest3 = new OASCreateAssetInvitesRequest();
        OASCreateAssetInvitesRequest createAssetInvitesRequest4 = new OASCreateAssetInvitesRequest();

        System.assert(createAssetInvitesRequest1.equals(createAssetInvitesRequest2));
        System.assert(createAssetInvitesRequest3.equals(createAssetInvitesRequest4));
        System.assertEquals(createAssetInvitesRequest1.hashCode(), createAssetInvitesRequest2.hashCode());
        System.assertEquals(createAssetInvitesRequest3.hashCode(), createAssetInvitesRequest4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCreateAssetInvitesRequest createAssetInvitesRequest = new OASCreateAssetInvitesRequest();
        System.assertEquals(new List<OASCreateAssetInvitesRequestItem>(), createAssetInvitesRequest.invites);
    }
}
