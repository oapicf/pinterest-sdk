@isTest
private class OASTargetingTemplateCreateTest {
    @isTest
    private static void equalsSameInstance() {
        OASTargetingTemplateCreate targetingTemplateCreate1 = OASTargetingTemplateCreate.getExample();
        OASTargetingTemplateCreate targetingTemplateCreate2 = targetingTemplateCreate1;
        OASTargetingTemplateCreate targetingTemplateCreate3 = new OASTargetingTemplateCreate();
        OASTargetingTemplateCreate targetingTemplateCreate4 = targetingTemplateCreate3;

        System.assert(targetingTemplateCreate1.equals(targetingTemplateCreate2));
        System.assert(targetingTemplateCreate2.equals(targetingTemplateCreate1));
        System.assert(targetingTemplateCreate1.equals(targetingTemplateCreate1));
        System.assert(targetingTemplateCreate3.equals(targetingTemplateCreate4));
        System.assert(targetingTemplateCreate4.equals(targetingTemplateCreate3));
        System.assert(targetingTemplateCreate3.equals(targetingTemplateCreate3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTargetingTemplateCreate targetingTemplateCreate1 = OASTargetingTemplateCreate.getExample();
        OASTargetingTemplateCreate targetingTemplateCreate2 = OASTargetingTemplateCreate.getExample();
        OASTargetingTemplateCreate targetingTemplateCreate3 = new OASTargetingTemplateCreate();
        OASTargetingTemplateCreate targetingTemplateCreate4 = new OASTargetingTemplateCreate();

        System.assert(targetingTemplateCreate1.equals(targetingTemplateCreate2));
        System.assert(targetingTemplateCreate2.equals(targetingTemplateCreate1));
        System.assert(targetingTemplateCreate3.equals(targetingTemplateCreate4));
        System.assert(targetingTemplateCreate4.equals(targetingTemplateCreate3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTargetingTemplateCreate targetingTemplateCreate1 = OASTargetingTemplateCreate.getExample();
        OASTargetingTemplateCreate targetingTemplateCreate2 = new OASTargetingTemplateCreate();

        System.assertEquals(false, targetingTemplateCreate1.equals('foo'));
        System.assertEquals(false, targetingTemplateCreate2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTargetingTemplateCreate targetingTemplateCreate1 = OASTargetingTemplateCreate.getExample();
        OASTargetingTemplateCreate targetingTemplateCreate2 = new OASTargetingTemplateCreate();
        OASTargetingTemplateCreate targetingTemplateCreate3;

        System.assertEquals(false, targetingTemplateCreate1.equals(targetingTemplateCreate3));
        System.assertEquals(false, targetingTemplateCreate2.equals(targetingTemplateCreate3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTargetingTemplateCreate targetingTemplateCreate1 = OASTargetingTemplateCreate.getExample();
        OASTargetingTemplateCreate targetingTemplateCreate2 = new OASTargetingTemplateCreate();

        System.assertEquals(targetingTemplateCreate1.hashCode(), targetingTemplateCreate1.hashCode());
        System.assertEquals(targetingTemplateCreate2.hashCode(), targetingTemplateCreate2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTargetingTemplateCreate targetingTemplateCreate1 = OASTargetingTemplateCreate.getExample();
        OASTargetingTemplateCreate targetingTemplateCreate2 = OASTargetingTemplateCreate.getExample();
        OASTargetingTemplateCreate targetingTemplateCreate3 = new OASTargetingTemplateCreate();
        OASTargetingTemplateCreate targetingTemplateCreate4 = new OASTargetingTemplateCreate();

        System.assert(targetingTemplateCreate1.equals(targetingTemplateCreate2));
        System.assert(targetingTemplateCreate3.equals(targetingTemplateCreate4));
        System.assertEquals(targetingTemplateCreate1.hashCode(), targetingTemplateCreate2.hashCode());
        System.assertEquals(targetingTemplateCreate3.hashCode(), targetingTemplateCreate4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASTargetingTemplateCreate targetingTemplateCreate = new OASTargetingTemplateCreate();
        Map<String, String> x-property-mappings = targetingTemplateCreate.getx-property-mappings();
        System.assertEquals('autoTargetingEnabled', x-property-mappings.get('auto_targeting_enabled'));
        System.assertEquals('targetingAttributes', x-property-mappings.get('targeting_attributes'));
        System.assertEquals('placementGroup', x-property-mappings.get('placement_group'));
        System.assertEquals('trackingUrls', x-property-mappings.get('tracking_urls'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASTargetingTemplateCreate targetingTemplateCreate = new OASTargetingTemplateCreate();
        System.assertEquals(true, targetingTemplateCreate.autoTargetingEnabled);
        System.assertEquals(new List<OASTargetingTemplateKeyword>(), targetingTemplateCreate.keywords);
        System.assertEquals(null, targetingTemplateCreate.name);
        System.assertEquals(null, targetingTemplateCreate.targetingAttributes);
        System.assertEquals(null, targetingTemplateCreate.placementGroup);
        System.assertEquals(null, targetingTemplateCreate.trackingUrls);
    }
}
