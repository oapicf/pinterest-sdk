@isTest
private class OASTargetingTemplateGetResponseDataTest {
    @isTest
    private static void equalsSameInstance() {
        OASTargetingTemplateGetResponseData targetingTemplateGetResponseData1 = OASTargetingTemplateGetResponseData.getExample();
        OASTargetingTemplateGetResponseData targetingTemplateGetResponseData2 = targetingTemplateGetResponseData1;
        OASTargetingTemplateGetResponseData targetingTemplateGetResponseData3 = new OASTargetingTemplateGetResponseData();
        OASTargetingTemplateGetResponseData targetingTemplateGetResponseData4 = targetingTemplateGetResponseData3;

        System.assert(targetingTemplateGetResponseData1.equals(targetingTemplateGetResponseData2));
        System.assert(targetingTemplateGetResponseData2.equals(targetingTemplateGetResponseData1));
        System.assert(targetingTemplateGetResponseData1.equals(targetingTemplateGetResponseData1));
        System.assert(targetingTemplateGetResponseData3.equals(targetingTemplateGetResponseData4));
        System.assert(targetingTemplateGetResponseData4.equals(targetingTemplateGetResponseData3));
        System.assert(targetingTemplateGetResponseData3.equals(targetingTemplateGetResponseData3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTargetingTemplateGetResponseData targetingTemplateGetResponseData1 = OASTargetingTemplateGetResponseData.getExample();
        OASTargetingTemplateGetResponseData targetingTemplateGetResponseData2 = OASTargetingTemplateGetResponseData.getExample();
        OASTargetingTemplateGetResponseData targetingTemplateGetResponseData3 = new OASTargetingTemplateGetResponseData();
        OASTargetingTemplateGetResponseData targetingTemplateGetResponseData4 = new OASTargetingTemplateGetResponseData();

        System.assert(targetingTemplateGetResponseData1.equals(targetingTemplateGetResponseData2));
        System.assert(targetingTemplateGetResponseData2.equals(targetingTemplateGetResponseData1));
        System.assert(targetingTemplateGetResponseData3.equals(targetingTemplateGetResponseData4));
        System.assert(targetingTemplateGetResponseData4.equals(targetingTemplateGetResponseData3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTargetingTemplateGetResponseData targetingTemplateGetResponseData1 = OASTargetingTemplateGetResponseData.getExample();
        OASTargetingTemplateGetResponseData targetingTemplateGetResponseData2 = new OASTargetingTemplateGetResponseData();

        System.assertEquals(false, targetingTemplateGetResponseData1.equals('foo'));
        System.assertEquals(false, targetingTemplateGetResponseData2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTargetingTemplateGetResponseData targetingTemplateGetResponseData1 = OASTargetingTemplateGetResponseData.getExample();
        OASTargetingTemplateGetResponseData targetingTemplateGetResponseData2 = new OASTargetingTemplateGetResponseData();
        OASTargetingTemplateGetResponseData targetingTemplateGetResponseData3;

        System.assertEquals(false, targetingTemplateGetResponseData1.equals(targetingTemplateGetResponseData3));
        System.assertEquals(false, targetingTemplateGetResponseData2.equals(targetingTemplateGetResponseData3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTargetingTemplateGetResponseData targetingTemplateGetResponseData1 = OASTargetingTemplateGetResponseData.getExample();
        OASTargetingTemplateGetResponseData targetingTemplateGetResponseData2 = new OASTargetingTemplateGetResponseData();

        System.assertEquals(targetingTemplateGetResponseData1.hashCode(), targetingTemplateGetResponseData1.hashCode());
        System.assertEquals(targetingTemplateGetResponseData2.hashCode(), targetingTemplateGetResponseData2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTargetingTemplateGetResponseData targetingTemplateGetResponseData1 = OASTargetingTemplateGetResponseData.getExample();
        OASTargetingTemplateGetResponseData targetingTemplateGetResponseData2 = OASTargetingTemplateGetResponseData.getExample();
        OASTargetingTemplateGetResponseData targetingTemplateGetResponseData3 = new OASTargetingTemplateGetResponseData();
        OASTargetingTemplateGetResponseData targetingTemplateGetResponseData4 = new OASTargetingTemplateGetResponseData();

        System.assert(targetingTemplateGetResponseData1.equals(targetingTemplateGetResponseData2));
        System.assert(targetingTemplateGetResponseData3.equals(targetingTemplateGetResponseData4));
        System.assertEquals(targetingTemplateGetResponseData1.hashCode(), targetingTemplateGetResponseData2.hashCode());
        System.assertEquals(targetingTemplateGetResponseData3.hashCode(), targetingTemplateGetResponseData4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASTargetingTemplateGetResponseData targetingTemplateGetResponseData = new OASTargetingTemplateGetResponseData();
        Map<String, String> x-property-mappings = targetingTemplateGetResponseData.getx-property-mappings();
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
        OASTargetingTemplateGetResponseData targetingTemplateGetResponseData = new OASTargetingTemplateGetResponseData();
        System.assertEquals(true, targetingTemplateGetResponseData.autoTargetingEnabled);
        System.assertEquals(new List<OASTargetingTemplateKeyword>(), targetingTemplateGetResponseData.keywords);
        System.assertEquals(StatusEnum.ACTIVE, targetingTemplateGetResponseData.status);
        System.assertEquals(null, targetingTemplateGetResponseData.name);
        System.assertEquals(null, targetingTemplateGetResponseData.targetingAttributes);
        System.assertEquals(null, targetingTemplateGetResponseData.placementGroup);
        System.assertEquals(null, targetingTemplateGetResponseData.trackingUrls);
        System.assertEquals(null, targetingTemplateGetResponseData.id);
        System.assertEquals(null, targetingTemplateGetResponseData.createdTime);
        System.assertEquals(null, targetingTemplateGetResponseData.updatedTime);
        System.assertEquals(null, targetingTemplateGetResponseData.adAccountId);
        System.assertEquals(null, targetingTemplateGetResponseData.sizing);
        System.assertEquals(null, targetingTemplateGetResponseData.valid);
    }
}
