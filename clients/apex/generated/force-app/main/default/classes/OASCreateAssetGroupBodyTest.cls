@isTest
private class OASCreateAssetGroupBodyTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateAssetGroupBody createAssetGroupBody1 = OASCreateAssetGroupBody.getExample();
        OASCreateAssetGroupBody createAssetGroupBody2 = createAssetGroupBody1;
        OASCreateAssetGroupBody createAssetGroupBody3 = new OASCreateAssetGroupBody();
        OASCreateAssetGroupBody createAssetGroupBody4 = createAssetGroupBody3;

        System.assert(createAssetGroupBody1.equals(createAssetGroupBody2));
        System.assert(createAssetGroupBody2.equals(createAssetGroupBody1));
        System.assert(createAssetGroupBody1.equals(createAssetGroupBody1));
        System.assert(createAssetGroupBody3.equals(createAssetGroupBody4));
        System.assert(createAssetGroupBody4.equals(createAssetGroupBody3));
        System.assert(createAssetGroupBody3.equals(createAssetGroupBody3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateAssetGroupBody createAssetGroupBody1 = OASCreateAssetGroupBody.getExample();
        OASCreateAssetGroupBody createAssetGroupBody2 = OASCreateAssetGroupBody.getExample();
        OASCreateAssetGroupBody createAssetGroupBody3 = new OASCreateAssetGroupBody();
        OASCreateAssetGroupBody createAssetGroupBody4 = new OASCreateAssetGroupBody();

        System.assert(createAssetGroupBody1.equals(createAssetGroupBody2));
        System.assert(createAssetGroupBody2.equals(createAssetGroupBody1));
        System.assert(createAssetGroupBody3.equals(createAssetGroupBody4));
        System.assert(createAssetGroupBody4.equals(createAssetGroupBody3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateAssetGroupBody createAssetGroupBody1 = OASCreateAssetGroupBody.getExample();
        OASCreateAssetGroupBody createAssetGroupBody2 = new OASCreateAssetGroupBody();

        System.assertEquals(false, createAssetGroupBody1.equals('foo'));
        System.assertEquals(false, createAssetGroupBody2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateAssetGroupBody createAssetGroupBody1 = OASCreateAssetGroupBody.getExample();
        OASCreateAssetGroupBody createAssetGroupBody2 = new OASCreateAssetGroupBody();
        OASCreateAssetGroupBody createAssetGroupBody3;

        System.assertEquals(false, createAssetGroupBody1.equals(createAssetGroupBody3));
        System.assertEquals(false, createAssetGroupBody2.equals(createAssetGroupBody3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateAssetGroupBody createAssetGroupBody1 = OASCreateAssetGroupBody.getExample();
        OASCreateAssetGroupBody createAssetGroupBody2 = new OASCreateAssetGroupBody();

        System.assertEquals(createAssetGroupBody1.hashCode(), createAssetGroupBody1.hashCode());
        System.assertEquals(createAssetGroupBody2.hashCode(), createAssetGroupBody2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateAssetGroupBody createAssetGroupBody1 = OASCreateAssetGroupBody.getExample();
        OASCreateAssetGroupBody createAssetGroupBody2 = OASCreateAssetGroupBody.getExample();
        OASCreateAssetGroupBody createAssetGroupBody3 = new OASCreateAssetGroupBody();
        OASCreateAssetGroupBody createAssetGroupBody4 = new OASCreateAssetGroupBody();

        System.assert(createAssetGroupBody1.equals(createAssetGroupBody2));
        System.assert(createAssetGroupBody3.equals(createAssetGroupBody4));
        System.assertEquals(createAssetGroupBody1.hashCode(), createAssetGroupBody2.hashCode());
        System.assertEquals(createAssetGroupBody3.hashCode(), createAssetGroupBody4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCreateAssetGroupBody createAssetGroupBody = new OASCreateAssetGroupBody();
        Map<String, String> x-property-mappings = createAssetGroupBody.getx-property-mappings();
        System.assertEquals('assetGroupName', x-property-mappings.get('asset_group_name'));
        System.assertEquals('assetGroupDescription', x-property-mappings.get('asset_group_description'));
        System.assertEquals('assetGroupTypes', x-property-mappings.get('asset_group_types'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCreateAssetGroupBody createAssetGroupBody = new OASCreateAssetGroupBody();
        System.assertEquals(new List<OASAssetGroupType>(), createAssetGroupBody.assetGroupTypes);
        System.assertEquals(null, createAssetGroupBody.assetGroupName);
        System.assertEquals(null, createAssetGroupBody.assetGroupDescription);
    }
}
