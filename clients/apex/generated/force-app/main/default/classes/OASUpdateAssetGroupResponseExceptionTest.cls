@isTest
private class OASUpdateAssetGroupResponseExceptionTest {
    @isTest
    private static void equalsSameInstance() {
        OASUpdateAssetGroupResponseException updateAssetGroupResponseExceptionsInner1 = OASUpdateAssetGroupResponseException.getExample();
        OASUpdateAssetGroupResponseException updateAssetGroupResponseExceptionsInner2 = updateAssetGroupResponseExceptionsInner1;
        OASUpdateAssetGroupResponseException updateAssetGroupResponseExceptionsInner3 = new OASUpdateAssetGroupResponseException();
        OASUpdateAssetGroupResponseException updateAssetGroupResponseExceptionsInner4 = updateAssetGroupResponseExceptionsInner3;

        System.assert(updateAssetGroupResponseExceptionsInner1.equals(updateAssetGroupResponseExceptionsInner2));
        System.assert(updateAssetGroupResponseExceptionsInner2.equals(updateAssetGroupResponseExceptionsInner1));
        System.assert(updateAssetGroupResponseExceptionsInner1.equals(updateAssetGroupResponseExceptionsInner1));
        System.assert(updateAssetGroupResponseExceptionsInner3.equals(updateAssetGroupResponseExceptionsInner4));
        System.assert(updateAssetGroupResponseExceptionsInner4.equals(updateAssetGroupResponseExceptionsInner3));
        System.assert(updateAssetGroupResponseExceptionsInner3.equals(updateAssetGroupResponseExceptionsInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUpdateAssetGroupResponseException updateAssetGroupResponseExceptionsInner1 = OASUpdateAssetGroupResponseException.getExample();
        OASUpdateAssetGroupResponseException updateAssetGroupResponseExceptionsInner2 = OASUpdateAssetGroupResponseException.getExample();
        OASUpdateAssetGroupResponseException updateAssetGroupResponseExceptionsInner3 = new OASUpdateAssetGroupResponseException();
        OASUpdateAssetGroupResponseException updateAssetGroupResponseExceptionsInner4 = new OASUpdateAssetGroupResponseException();

        System.assert(updateAssetGroupResponseExceptionsInner1.equals(updateAssetGroupResponseExceptionsInner2));
        System.assert(updateAssetGroupResponseExceptionsInner2.equals(updateAssetGroupResponseExceptionsInner1));
        System.assert(updateAssetGroupResponseExceptionsInner3.equals(updateAssetGroupResponseExceptionsInner4));
        System.assert(updateAssetGroupResponseExceptionsInner4.equals(updateAssetGroupResponseExceptionsInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUpdateAssetGroupResponseException updateAssetGroupResponseExceptionsInner1 = OASUpdateAssetGroupResponseException.getExample();
        OASUpdateAssetGroupResponseException updateAssetGroupResponseExceptionsInner2 = new OASUpdateAssetGroupResponseException();

        System.assertEquals(false, updateAssetGroupResponseExceptionsInner1.equals('foo'));
        System.assertEquals(false, updateAssetGroupResponseExceptionsInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUpdateAssetGroupResponseException updateAssetGroupResponseExceptionsInner1 = OASUpdateAssetGroupResponseException.getExample();
        OASUpdateAssetGroupResponseException updateAssetGroupResponseExceptionsInner2 = new OASUpdateAssetGroupResponseException();
        OASUpdateAssetGroupResponseException updateAssetGroupResponseExceptionsInner3;

        System.assertEquals(false, updateAssetGroupResponseExceptionsInner1.equals(updateAssetGroupResponseExceptionsInner3));
        System.assertEquals(false, updateAssetGroupResponseExceptionsInner2.equals(updateAssetGroupResponseExceptionsInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUpdateAssetGroupResponseException updateAssetGroupResponseExceptionsInner1 = OASUpdateAssetGroupResponseException.getExample();
        OASUpdateAssetGroupResponseException updateAssetGroupResponseExceptionsInner2 = new OASUpdateAssetGroupResponseException();

        System.assertEquals(updateAssetGroupResponseExceptionsInner1.hashCode(), updateAssetGroupResponseExceptionsInner1.hashCode());
        System.assertEquals(updateAssetGroupResponseExceptionsInner2.hashCode(), updateAssetGroupResponseExceptionsInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUpdateAssetGroupResponseException updateAssetGroupResponseExceptionsInner1 = OASUpdateAssetGroupResponseException.getExample();
        OASUpdateAssetGroupResponseException updateAssetGroupResponseExceptionsInner2 = OASUpdateAssetGroupResponseException.getExample();
        OASUpdateAssetGroupResponseException updateAssetGroupResponseExceptionsInner3 = new OASUpdateAssetGroupResponseException();
        OASUpdateAssetGroupResponseException updateAssetGroupResponseExceptionsInner4 = new OASUpdateAssetGroupResponseException();

        System.assert(updateAssetGroupResponseExceptionsInner1.equals(updateAssetGroupResponseExceptionsInner2));
        System.assert(updateAssetGroupResponseExceptionsInner3.equals(updateAssetGroupResponseExceptionsInner4));
        System.assertEquals(updateAssetGroupResponseExceptionsInner1.hashCode(), updateAssetGroupResponseExceptionsInner2.hashCode());
        System.assertEquals(updateAssetGroupResponseExceptionsInner3.hashCode(), updateAssetGroupResponseExceptionsInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASUpdateAssetGroupResponseException updateAssetGroupResponseExceptionsInner = new OASUpdateAssetGroupResponseException();
        Map<String, String> x-property-mappings = updateAssetGroupResponseExceptionsInner.getx-property-mappings();
        System.assertEquals('assetGroupId', x-property-mappings.get('asset_group_id'));
    }
}
