@isTest
private class OASCreateAssetAccessRequestResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateAssetAccessRequestResponse createAssetAccessRequestResponse1 = OASCreateAssetAccessRequestResponse.getExample();
        OASCreateAssetAccessRequestResponse createAssetAccessRequestResponse2 = createAssetAccessRequestResponse1;
        OASCreateAssetAccessRequestResponse createAssetAccessRequestResponse3 = new OASCreateAssetAccessRequestResponse();
        OASCreateAssetAccessRequestResponse createAssetAccessRequestResponse4 = createAssetAccessRequestResponse3;

        System.assert(createAssetAccessRequestResponse1.equals(createAssetAccessRequestResponse2));
        System.assert(createAssetAccessRequestResponse2.equals(createAssetAccessRequestResponse1));
        System.assert(createAssetAccessRequestResponse1.equals(createAssetAccessRequestResponse1));
        System.assert(createAssetAccessRequestResponse3.equals(createAssetAccessRequestResponse4));
        System.assert(createAssetAccessRequestResponse4.equals(createAssetAccessRequestResponse3));
        System.assert(createAssetAccessRequestResponse3.equals(createAssetAccessRequestResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateAssetAccessRequestResponse createAssetAccessRequestResponse1 = OASCreateAssetAccessRequestResponse.getExample();
        OASCreateAssetAccessRequestResponse createAssetAccessRequestResponse2 = OASCreateAssetAccessRequestResponse.getExample();
        OASCreateAssetAccessRequestResponse createAssetAccessRequestResponse3 = new OASCreateAssetAccessRequestResponse();
        OASCreateAssetAccessRequestResponse createAssetAccessRequestResponse4 = new OASCreateAssetAccessRequestResponse();

        System.assert(createAssetAccessRequestResponse1.equals(createAssetAccessRequestResponse2));
        System.assert(createAssetAccessRequestResponse2.equals(createAssetAccessRequestResponse1));
        System.assert(createAssetAccessRequestResponse3.equals(createAssetAccessRequestResponse4));
        System.assert(createAssetAccessRequestResponse4.equals(createAssetAccessRequestResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateAssetAccessRequestResponse createAssetAccessRequestResponse1 = OASCreateAssetAccessRequestResponse.getExample();
        OASCreateAssetAccessRequestResponse createAssetAccessRequestResponse2 = new OASCreateAssetAccessRequestResponse();

        System.assertEquals(false, createAssetAccessRequestResponse1.equals('foo'));
        System.assertEquals(false, createAssetAccessRequestResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateAssetAccessRequestResponse createAssetAccessRequestResponse1 = OASCreateAssetAccessRequestResponse.getExample();
        OASCreateAssetAccessRequestResponse createAssetAccessRequestResponse2 = new OASCreateAssetAccessRequestResponse();
        OASCreateAssetAccessRequestResponse createAssetAccessRequestResponse3;

        System.assertEquals(false, createAssetAccessRequestResponse1.equals(createAssetAccessRequestResponse3));
        System.assertEquals(false, createAssetAccessRequestResponse2.equals(createAssetAccessRequestResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateAssetAccessRequestResponse createAssetAccessRequestResponse1 = OASCreateAssetAccessRequestResponse.getExample();
        OASCreateAssetAccessRequestResponse createAssetAccessRequestResponse2 = new OASCreateAssetAccessRequestResponse();

        System.assertEquals(createAssetAccessRequestResponse1.hashCode(), createAssetAccessRequestResponse1.hashCode());
        System.assertEquals(createAssetAccessRequestResponse2.hashCode(), createAssetAccessRequestResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateAssetAccessRequestResponse createAssetAccessRequestResponse1 = OASCreateAssetAccessRequestResponse.getExample();
        OASCreateAssetAccessRequestResponse createAssetAccessRequestResponse2 = OASCreateAssetAccessRequestResponse.getExample();
        OASCreateAssetAccessRequestResponse createAssetAccessRequestResponse3 = new OASCreateAssetAccessRequestResponse();
        OASCreateAssetAccessRequestResponse createAssetAccessRequestResponse4 = new OASCreateAssetAccessRequestResponse();

        System.assert(createAssetAccessRequestResponse1.equals(createAssetAccessRequestResponse2));
        System.assert(createAssetAccessRequestResponse3.equals(createAssetAccessRequestResponse4));
        System.assertEquals(createAssetAccessRequestResponse1.hashCode(), createAssetAccessRequestResponse2.hashCode());
        System.assertEquals(createAssetAccessRequestResponse3.hashCode(), createAssetAccessRequestResponse4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCreateAssetAccessRequestResponse createAssetAccessRequestResponse = new OASCreateAssetAccessRequestResponse();
        System.assertEquals(new List<OASCreateAssetAccessRequestErrorMess>(), createAssetAccessRequestResponse.exceptions);
        System.assertEquals(new Map<String, String>(), createAssetAccessRequestResponse.invites);
    }
}
