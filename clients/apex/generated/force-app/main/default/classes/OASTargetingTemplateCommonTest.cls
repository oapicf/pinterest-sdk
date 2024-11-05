@isTest
private class OASTargetingTemplateCommonTest {
    @isTest
    private static void equalsSameInstance() {
        OASTargetingTemplateCommon targetingTemplateCommon1 = OASTargetingTemplateCommon.getExample();
        OASTargetingTemplateCommon targetingTemplateCommon2 = targetingTemplateCommon1;
        OASTargetingTemplateCommon targetingTemplateCommon3 = new OASTargetingTemplateCommon();
        OASTargetingTemplateCommon targetingTemplateCommon4 = targetingTemplateCommon3;

        System.assert(targetingTemplateCommon1.equals(targetingTemplateCommon2));
        System.assert(targetingTemplateCommon2.equals(targetingTemplateCommon1));
        System.assert(targetingTemplateCommon1.equals(targetingTemplateCommon1));
        System.assert(targetingTemplateCommon3.equals(targetingTemplateCommon4));
        System.assert(targetingTemplateCommon4.equals(targetingTemplateCommon3));
        System.assert(targetingTemplateCommon3.equals(targetingTemplateCommon3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTargetingTemplateCommon targetingTemplateCommon1 = OASTargetingTemplateCommon.getExample();
        OASTargetingTemplateCommon targetingTemplateCommon2 = OASTargetingTemplateCommon.getExample();
        OASTargetingTemplateCommon targetingTemplateCommon3 = new OASTargetingTemplateCommon();
        OASTargetingTemplateCommon targetingTemplateCommon4 = new OASTargetingTemplateCommon();

        System.assert(targetingTemplateCommon1.equals(targetingTemplateCommon2));
        System.assert(targetingTemplateCommon2.equals(targetingTemplateCommon1));
        System.assert(targetingTemplateCommon3.equals(targetingTemplateCommon4));
        System.assert(targetingTemplateCommon4.equals(targetingTemplateCommon3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTargetingTemplateCommon targetingTemplateCommon1 = OASTargetingTemplateCommon.getExample();
        OASTargetingTemplateCommon targetingTemplateCommon2 = new OASTargetingTemplateCommon();

        System.assertEquals(false, targetingTemplateCommon1.equals('foo'));
        System.assertEquals(false, targetingTemplateCommon2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTargetingTemplateCommon targetingTemplateCommon1 = OASTargetingTemplateCommon.getExample();
        OASTargetingTemplateCommon targetingTemplateCommon2 = new OASTargetingTemplateCommon();
        OASTargetingTemplateCommon targetingTemplateCommon3;

        System.assertEquals(false, targetingTemplateCommon1.equals(targetingTemplateCommon3));
        System.assertEquals(false, targetingTemplateCommon2.equals(targetingTemplateCommon3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTargetingTemplateCommon targetingTemplateCommon1 = OASTargetingTemplateCommon.getExample();
        OASTargetingTemplateCommon targetingTemplateCommon2 = new OASTargetingTemplateCommon();

        System.assertEquals(targetingTemplateCommon1.hashCode(), targetingTemplateCommon1.hashCode());
        System.assertEquals(targetingTemplateCommon2.hashCode(), targetingTemplateCommon2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTargetingTemplateCommon targetingTemplateCommon1 = OASTargetingTemplateCommon.getExample();
        OASTargetingTemplateCommon targetingTemplateCommon2 = OASTargetingTemplateCommon.getExample();
        OASTargetingTemplateCommon targetingTemplateCommon3 = new OASTargetingTemplateCommon();
        OASTargetingTemplateCommon targetingTemplateCommon4 = new OASTargetingTemplateCommon();

        System.assert(targetingTemplateCommon1.equals(targetingTemplateCommon2));
        System.assert(targetingTemplateCommon3.equals(targetingTemplateCommon4));
        System.assertEquals(targetingTemplateCommon1.hashCode(), targetingTemplateCommon2.hashCode());
        System.assertEquals(targetingTemplateCommon3.hashCode(), targetingTemplateCommon4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASTargetingTemplateCommon targetingTemplateCommon = new OASTargetingTemplateCommon();
        Map<String, String> x-property-mappings = targetingTemplateCommon.getx-property-mappings();
        System.assertEquals('autoTargetingEnabled', x-property-mappings.get('auto_targeting_enabled'));
        System.assertEquals('targetingAttributes', x-property-mappings.get('targeting_attributes'));
        System.assertEquals('placementGroup', x-property-mappings.get('placement_group'));
        System.assertEquals('trackingUrls', x-property-mappings.get('tracking_urls'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASTargetingTemplateCommon targetingTemplateCommon = new OASTargetingTemplateCommon();
        System.assertEquals(true, targetingTemplateCommon.autoTargetingEnabled);
        System.assertEquals(new List<OASTargetingTemplateKeyword>(), targetingTemplateCommon.keywords);
        System.assertEquals(null, targetingTemplateCommon.name);
        System.assertEquals(null, targetingTemplateCommon.targetingAttributes);
        System.assertEquals(null, targetingTemplateCommon.placementGroup);
        System.assertEquals(null, targetingTemplateCommon.trackingUrls);
    }
}
