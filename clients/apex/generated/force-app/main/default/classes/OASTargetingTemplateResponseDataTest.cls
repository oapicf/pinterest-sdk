@isTest
private class OASTargetingTemplateResponseDataTest {
    @isTest
    private static void equalsSameInstance() {
        OASTargetingTemplateResponseData targetingTemplateResponseData1 = OASTargetingTemplateResponseData.getExample();
        OASTargetingTemplateResponseData targetingTemplateResponseData2 = targetingTemplateResponseData1;
        OASTargetingTemplateResponseData targetingTemplateResponseData3 = new OASTargetingTemplateResponseData();
        OASTargetingTemplateResponseData targetingTemplateResponseData4 = targetingTemplateResponseData3;

        System.assert(targetingTemplateResponseData1.equals(targetingTemplateResponseData2));
        System.assert(targetingTemplateResponseData2.equals(targetingTemplateResponseData1));
        System.assert(targetingTemplateResponseData1.equals(targetingTemplateResponseData1));
        System.assert(targetingTemplateResponseData3.equals(targetingTemplateResponseData4));
        System.assert(targetingTemplateResponseData4.equals(targetingTemplateResponseData3));
        System.assert(targetingTemplateResponseData3.equals(targetingTemplateResponseData3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTargetingTemplateResponseData targetingTemplateResponseData1 = OASTargetingTemplateResponseData.getExample();
        OASTargetingTemplateResponseData targetingTemplateResponseData2 = OASTargetingTemplateResponseData.getExample();
        OASTargetingTemplateResponseData targetingTemplateResponseData3 = new OASTargetingTemplateResponseData();
        OASTargetingTemplateResponseData targetingTemplateResponseData4 = new OASTargetingTemplateResponseData();

        System.assert(targetingTemplateResponseData1.equals(targetingTemplateResponseData2));
        System.assert(targetingTemplateResponseData2.equals(targetingTemplateResponseData1));
        System.assert(targetingTemplateResponseData3.equals(targetingTemplateResponseData4));
        System.assert(targetingTemplateResponseData4.equals(targetingTemplateResponseData3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTargetingTemplateResponseData targetingTemplateResponseData1 = OASTargetingTemplateResponseData.getExample();
        OASTargetingTemplateResponseData targetingTemplateResponseData2 = new OASTargetingTemplateResponseData();

        System.assertEquals(false, targetingTemplateResponseData1.equals('foo'));
        System.assertEquals(false, targetingTemplateResponseData2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTargetingTemplateResponseData targetingTemplateResponseData1 = OASTargetingTemplateResponseData.getExample();
        OASTargetingTemplateResponseData targetingTemplateResponseData2 = new OASTargetingTemplateResponseData();
        OASTargetingTemplateResponseData targetingTemplateResponseData3;

        System.assertEquals(false, targetingTemplateResponseData1.equals(targetingTemplateResponseData3));
        System.assertEquals(false, targetingTemplateResponseData2.equals(targetingTemplateResponseData3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTargetingTemplateResponseData targetingTemplateResponseData1 = OASTargetingTemplateResponseData.getExample();
        OASTargetingTemplateResponseData targetingTemplateResponseData2 = new OASTargetingTemplateResponseData();

        System.assertEquals(targetingTemplateResponseData1.hashCode(), targetingTemplateResponseData1.hashCode());
        System.assertEquals(targetingTemplateResponseData2.hashCode(), targetingTemplateResponseData2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTargetingTemplateResponseData targetingTemplateResponseData1 = OASTargetingTemplateResponseData.getExample();
        OASTargetingTemplateResponseData targetingTemplateResponseData2 = OASTargetingTemplateResponseData.getExample();
        OASTargetingTemplateResponseData targetingTemplateResponseData3 = new OASTargetingTemplateResponseData();
        OASTargetingTemplateResponseData targetingTemplateResponseData4 = new OASTargetingTemplateResponseData();

        System.assert(targetingTemplateResponseData1.equals(targetingTemplateResponseData2));
        System.assert(targetingTemplateResponseData3.equals(targetingTemplateResponseData4));
        System.assertEquals(targetingTemplateResponseData1.hashCode(), targetingTemplateResponseData2.hashCode());
        System.assertEquals(targetingTemplateResponseData3.hashCode(), targetingTemplateResponseData4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASTargetingTemplateResponseData targetingTemplateResponseData = new OASTargetingTemplateResponseData();
        Map<String, String> x-property-mappings = targetingTemplateResponseData.getx-property-mappings();
        System.assertEquals('autoTargetingEnabled', x-property-mappings.get('auto_targeting_enabled'));
        System.assertEquals('targetingAttributes', x-property-mappings.get('targeting_attributes'));
        System.assertEquals('placementGroup', x-property-mappings.get('placement_group'));
        System.assertEquals('trackingUrls', x-property-mappings.get('tracking_urls'));
        System.assertEquals('createdTime', x-property-mappings.get('created_time'));
        System.assertEquals('updatedTime', x-property-mappings.get('updated_time'));
        System.assertEquals('adAccountId', x-property-mappings.get('ad_account_id'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASTargetingTemplateResponseData targetingTemplateResponseData = new OASTargetingTemplateResponseData();
        System.assertEquals(true, targetingTemplateResponseData.autoTargetingEnabled);
        System.assertEquals(new List<OASTargetingTemplateKeyword>(), targetingTemplateResponseData.keywords);
        System.assertEquals(StatusEnum.ACTIVE, targetingTemplateResponseData.status);
        System.assertEquals(null, targetingTemplateResponseData.name);
        System.assertEquals(null, targetingTemplateResponseData.targetingAttributes);
        System.assertEquals(null, targetingTemplateResponseData.placementGroup);
        System.assertEquals(null, targetingTemplateResponseData.trackingUrls);
        System.assertEquals(null, targetingTemplateResponseData.id);
        System.assertEquals(null, targetingTemplateResponseData.createdTime);
        System.assertEquals(null, targetingTemplateResponseData.updatedTime);
        System.assertEquals(null, targetingTemplateResponseData.adAccountId);
        System.assertEquals(null, targetingTemplateResponseData.sizing);
    }
}
