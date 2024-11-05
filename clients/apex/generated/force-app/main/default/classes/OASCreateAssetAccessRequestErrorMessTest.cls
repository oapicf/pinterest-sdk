@isTest
private class OASCreateAssetAccessRequestErrorMessTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateAssetAccessRequestErrorMess createAssetAccessRequestErrorMessageInner1 = OASCreateAssetAccessRequestErrorMess.getExample();
        OASCreateAssetAccessRequestErrorMess createAssetAccessRequestErrorMessageInner2 = createAssetAccessRequestErrorMessageInner1;
        OASCreateAssetAccessRequestErrorMess createAssetAccessRequestErrorMessageInner3 = new OASCreateAssetAccessRequestErrorMess();
        OASCreateAssetAccessRequestErrorMess createAssetAccessRequestErrorMessageInner4 = createAssetAccessRequestErrorMessageInner3;

        System.assert(createAssetAccessRequestErrorMessageInner1.equals(createAssetAccessRequestErrorMessageInner2));
        System.assert(createAssetAccessRequestErrorMessageInner2.equals(createAssetAccessRequestErrorMessageInner1));
        System.assert(createAssetAccessRequestErrorMessageInner1.equals(createAssetAccessRequestErrorMessageInner1));
        System.assert(createAssetAccessRequestErrorMessageInner3.equals(createAssetAccessRequestErrorMessageInner4));
        System.assert(createAssetAccessRequestErrorMessageInner4.equals(createAssetAccessRequestErrorMessageInner3));
        System.assert(createAssetAccessRequestErrorMessageInner3.equals(createAssetAccessRequestErrorMessageInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateAssetAccessRequestErrorMess createAssetAccessRequestErrorMessageInner1 = OASCreateAssetAccessRequestErrorMess.getExample();
        OASCreateAssetAccessRequestErrorMess createAssetAccessRequestErrorMessageInner2 = OASCreateAssetAccessRequestErrorMess.getExample();
        OASCreateAssetAccessRequestErrorMess createAssetAccessRequestErrorMessageInner3 = new OASCreateAssetAccessRequestErrorMess();
        OASCreateAssetAccessRequestErrorMess createAssetAccessRequestErrorMessageInner4 = new OASCreateAssetAccessRequestErrorMess();

        System.assert(createAssetAccessRequestErrorMessageInner1.equals(createAssetAccessRequestErrorMessageInner2));
        System.assert(createAssetAccessRequestErrorMessageInner2.equals(createAssetAccessRequestErrorMessageInner1));
        System.assert(createAssetAccessRequestErrorMessageInner3.equals(createAssetAccessRequestErrorMessageInner4));
        System.assert(createAssetAccessRequestErrorMessageInner4.equals(createAssetAccessRequestErrorMessageInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateAssetAccessRequestErrorMess createAssetAccessRequestErrorMessageInner1 = OASCreateAssetAccessRequestErrorMess.getExample();
        OASCreateAssetAccessRequestErrorMess createAssetAccessRequestErrorMessageInner2 = new OASCreateAssetAccessRequestErrorMess();

        System.assertEquals(false, createAssetAccessRequestErrorMessageInner1.equals('foo'));
        System.assertEquals(false, createAssetAccessRequestErrorMessageInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateAssetAccessRequestErrorMess createAssetAccessRequestErrorMessageInner1 = OASCreateAssetAccessRequestErrorMess.getExample();
        OASCreateAssetAccessRequestErrorMess createAssetAccessRequestErrorMessageInner2 = new OASCreateAssetAccessRequestErrorMess();
        OASCreateAssetAccessRequestErrorMess createAssetAccessRequestErrorMessageInner3;

        System.assertEquals(false, createAssetAccessRequestErrorMessageInner1.equals(createAssetAccessRequestErrorMessageInner3));
        System.assertEquals(false, createAssetAccessRequestErrorMessageInner2.equals(createAssetAccessRequestErrorMessageInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateAssetAccessRequestErrorMess createAssetAccessRequestErrorMessageInner1 = OASCreateAssetAccessRequestErrorMess.getExample();
        OASCreateAssetAccessRequestErrorMess createAssetAccessRequestErrorMessageInner2 = new OASCreateAssetAccessRequestErrorMess();

        System.assertEquals(createAssetAccessRequestErrorMessageInner1.hashCode(), createAssetAccessRequestErrorMessageInner1.hashCode());
        System.assertEquals(createAssetAccessRequestErrorMessageInner2.hashCode(), createAssetAccessRequestErrorMessageInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateAssetAccessRequestErrorMess createAssetAccessRequestErrorMessageInner1 = OASCreateAssetAccessRequestErrorMess.getExample();
        OASCreateAssetAccessRequestErrorMess createAssetAccessRequestErrorMessageInner2 = OASCreateAssetAccessRequestErrorMess.getExample();
        OASCreateAssetAccessRequestErrorMess createAssetAccessRequestErrorMessageInner3 = new OASCreateAssetAccessRequestErrorMess();
        OASCreateAssetAccessRequestErrorMess createAssetAccessRequestErrorMessageInner4 = new OASCreateAssetAccessRequestErrorMess();

        System.assert(createAssetAccessRequestErrorMessageInner1.equals(createAssetAccessRequestErrorMessageInner2));
        System.assert(createAssetAccessRequestErrorMessageInner3.equals(createAssetAccessRequestErrorMessageInner4));
        System.assertEquals(createAssetAccessRequestErrorMessageInner1.hashCode(), createAssetAccessRequestErrorMessageInner2.hashCode());
        System.assertEquals(createAssetAccessRequestErrorMessageInner3.hashCode(), createAssetAccessRequestErrorMessageInner4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCreateAssetAccessRequestErrorMess createAssetAccessRequestErrorMessageInner = new OASCreateAssetAccessRequestErrorMess();
        System.assertEquals(new List<String>(), createAssetAccessRequestErrorMessageInner.messages);
        System.assertEquals(null, createAssetAccessRequestErrorMessageInner.code);
    }
}
