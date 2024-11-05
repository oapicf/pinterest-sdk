@isTest
private class OASDeleteAssetGroupResponseExceptionTest {
    @isTest
    private static void equalsSameInstance() {
        OASDeleteAssetGroupResponseException deleteAssetGroupResponseExceptionsInner1 = OASDeleteAssetGroupResponseException.getExample();
        OASDeleteAssetGroupResponseException deleteAssetGroupResponseExceptionsInner2 = deleteAssetGroupResponseExceptionsInner1;
        OASDeleteAssetGroupResponseException deleteAssetGroupResponseExceptionsInner3 = new OASDeleteAssetGroupResponseException();
        OASDeleteAssetGroupResponseException deleteAssetGroupResponseExceptionsInner4 = deleteAssetGroupResponseExceptionsInner3;

        System.assert(deleteAssetGroupResponseExceptionsInner1.equals(deleteAssetGroupResponseExceptionsInner2));
        System.assert(deleteAssetGroupResponseExceptionsInner2.equals(deleteAssetGroupResponseExceptionsInner1));
        System.assert(deleteAssetGroupResponseExceptionsInner1.equals(deleteAssetGroupResponseExceptionsInner1));
        System.assert(deleteAssetGroupResponseExceptionsInner3.equals(deleteAssetGroupResponseExceptionsInner4));
        System.assert(deleteAssetGroupResponseExceptionsInner4.equals(deleteAssetGroupResponseExceptionsInner3));
        System.assert(deleteAssetGroupResponseExceptionsInner3.equals(deleteAssetGroupResponseExceptionsInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDeleteAssetGroupResponseException deleteAssetGroupResponseExceptionsInner1 = OASDeleteAssetGroupResponseException.getExample();
        OASDeleteAssetGroupResponseException deleteAssetGroupResponseExceptionsInner2 = OASDeleteAssetGroupResponseException.getExample();
        OASDeleteAssetGroupResponseException deleteAssetGroupResponseExceptionsInner3 = new OASDeleteAssetGroupResponseException();
        OASDeleteAssetGroupResponseException deleteAssetGroupResponseExceptionsInner4 = new OASDeleteAssetGroupResponseException();

        System.assert(deleteAssetGroupResponseExceptionsInner1.equals(deleteAssetGroupResponseExceptionsInner2));
        System.assert(deleteAssetGroupResponseExceptionsInner2.equals(deleteAssetGroupResponseExceptionsInner1));
        System.assert(deleteAssetGroupResponseExceptionsInner3.equals(deleteAssetGroupResponseExceptionsInner4));
        System.assert(deleteAssetGroupResponseExceptionsInner4.equals(deleteAssetGroupResponseExceptionsInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDeleteAssetGroupResponseException deleteAssetGroupResponseExceptionsInner1 = OASDeleteAssetGroupResponseException.getExample();
        OASDeleteAssetGroupResponseException deleteAssetGroupResponseExceptionsInner2 = new OASDeleteAssetGroupResponseException();

        System.assertEquals(false, deleteAssetGroupResponseExceptionsInner1.equals('foo'));
        System.assertEquals(false, deleteAssetGroupResponseExceptionsInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDeleteAssetGroupResponseException deleteAssetGroupResponseExceptionsInner1 = OASDeleteAssetGroupResponseException.getExample();
        OASDeleteAssetGroupResponseException deleteAssetGroupResponseExceptionsInner2 = new OASDeleteAssetGroupResponseException();
        OASDeleteAssetGroupResponseException deleteAssetGroupResponseExceptionsInner3;

        System.assertEquals(false, deleteAssetGroupResponseExceptionsInner1.equals(deleteAssetGroupResponseExceptionsInner3));
        System.assertEquals(false, deleteAssetGroupResponseExceptionsInner2.equals(deleteAssetGroupResponseExceptionsInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDeleteAssetGroupResponseException deleteAssetGroupResponseExceptionsInner1 = OASDeleteAssetGroupResponseException.getExample();
        OASDeleteAssetGroupResponseException deleteAssetGroupResponseExceptionsInner2 = new OASDeleteAssetGroupResponseException();

        System.assertEquals(deleteAssetGroupResponseExceptionsInner1.hashCode(), deleteAssetGroupResponseExceptionsInner1.hashCode());
        System.assertEquals(deleteAssetGroupResponseExceptionsInner2.hashCode(), deleteAssetGroupResponseExceptionsInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDeleteAssetGroupResponseException deleteAssetGroupResponseExceptionsInner1 = OASDeleteAssetGroupResponseException.getExample();
        OASDeleteAssetGroupResponseException deleteAssetGroupResponseExceptionsInner2 = OASDeleteAssetGroupResponseException.getExample();
        OASDeleteAssetGroupResponseException deleteAssetGroupResponseExceptionsInner3 = new OASDeleteAssetGroupResponseException();
        OASDeleteAssetGroupResponseException deleteAssetGroupResponseExceptionsInner4 = new OASDeleteAssetGroupResponseException();

        System.assert(deleteAssetGroupResponseExceptionsInner1.equals(deleteAssetGroupResponseExceptionsInner2));
        System.assert(deleteAssetGroupResponseExceptionsInner3.equals(deleteAssetGroupResponseExceptionsInner4));
        System.assertEquals(deleteAssetGroupResponseExceptionsInner1.hashCode(), deleteAssetGroupResponseExceptionsInner2.hashCode());
        System.assertEquals(deleteAssetGroupResponseExceptionsInner3.hashCode(), deleteAssetGroupResponseExceptionsInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASDeleteAssetGroupResponseException deleteAssetGroupResponseExceptionsInner = new OASDeleteAssetGroupResponseException();
        Map<String, String> x-property-mappings = deleteAssetGroupResponseExceptionsInner.getx-property-mappings();
        System.assertEquals('assetGroupId', x-property-mappings.get('asset_group_id'));
    }
}
