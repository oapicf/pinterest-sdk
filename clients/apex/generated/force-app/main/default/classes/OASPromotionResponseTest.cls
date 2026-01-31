@isTest
private class OASPromotionResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASPromotionResponse promotionResponse1 = OASPromotionResponse.getExample();
        OASPromotionResponse promotionResponse2 = promotionResponse1;
        OASPromotionResponse promotionResponse3 = new OASPromotionResponse();
        OASPromotionResponse promotionResponse4 = promotionResponse3;

        System.assert(promotionResponse1.equals(promotionResponse2));
        System.assert(promotionResponse2.equals(promotionResponse1));
        System.assert(promotionResponse1.equals(promotionResponse1));
        System.assert(promotionResponse3.equals(promotionResponse4));
        System.assert(promotionResponse4.equals(promotionResponse3));
        System.assert(promotionResponse3.equals(promotionResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPromotionResponse promotionResponse1 = OASPromotionResponse.getExample();
        OASPromotionResponse promotionResponse2 = OASPromotionResponse.getExample();
        OASPromotionResponse promotionResponse3 = new OASPromotionResponse();
        OASPromotionResponse promotionResponse4 = new OASPromotionResponse();

        System.assert(promotionResponse1.equals(promotionResponse2));
        System.assert(promotionResponse2.equals(promotionResponse1));
        System.assert(promotionResponse3.equals(promotionResponse4));
        System.assert(promotionResponse4.equals(promotionResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPromotionResponse promotionResponse1 = OASPromotionResponse.getExample();
        OASPromotionResponse promotionResponse2 = new OASPromotionResponse();

        System.assertEquals(false, promotionResponse1.equals('foo'));
        System.assertEquals(false, promotionResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPromotionResponse promotionResponse1 = OASPromotionResponse.getExample();
        OASPromotionResponse promotionResponse2 = new OASPromotionResponse();
        OASPromotionResponse promotionResponse3;

        System.assertEquals(false, promotionResponse1.equals(promotionResponse3));
        System.assertEquals(false, promotionResponse2.equals(promotionResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPromotionResponse promotionResponse1 = OASPromotionResponse.getExample();
        OASPromotionResponse promotionResponse2 = new OASPromotionResponse();

        System.assertEquals(promotionResponse1.hashCode(), promotionResponse1.hashCode());
        System.assertEquals(promotionResponse2.hashCode(), promotionResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPromotionResponse promotionResponse1 = OASPromotionResponse.getExample();
        OASPromotionResponse promotionResponse2 = OASPromotionResponse.getExample();
        OASPromotionResponse promotionResponse3 = new OASPromotionResponse();
        OASPromotionResponse promotionResponse4 = new OASPromotionResponse();

        System.assert(promotionResponse1.equals(promotionResponse2));
        System.assert(promotionResponse3.equals(promotionResponse4));
        System.assertEquals(promotionResponse1.hashCode(), promotionResponse2.hashCode());
        System.assertEquals(promotionResponse3.hashCode(), promotionResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPromotionResponse promotionResponse = new OASPromotionResponse();
        Map<String, String> x-property-mappings = promotionResponse.getx-property-mappings();
        System.assertEquals('discountStatus', x-property-mappings.get('discount_status'));
        System.assertEquals('endTime', x-property-mappings.get('end_time'));
        System.assertEquals('externalId', x-property-mappings.get('external_id'));
        System.assertEquals('platformType', x-property-mappings.get('platform_type'));
        System.assertEquals('promotionCode', x-property-mappings.get('promotion_code'));
        System.assertEquals('promotionCustomId', x-property-mappings.get('promotion_custom_id'));
        System.assertEquals('promotionTitle', x-property-mappings.get('promotion_title'));
        System.assertEquals('promotionType', x-property-mappings.get('promotion_type'));
        System.assertEquals('startTime', x-property-mappings.get('start_time'));
        System.assertEquals('templateValues', x-property-mappings.get('template_values'));
        System.assertEquals('adAccountId', x-property-mappings.get('ad_account_id'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPromotionResponse promotionResponse = new OASPromotionResponse();
        System.assertEquals(new List<OASPromotionTemplateValue>(), promotionResponse.templateValues);
        System.assertEquals(null, promotionResponse.discountStatus);
        System.assertEquals(null, promotionResponse.endTime);
        System.assertEquals(null, promotionResponse.externalId);
        System.assertEquals(null, promotionResponse.platformType);
        System.assertEquals(null, promotionResponse.promotionCode);
        System.assertEquals(null, promotionResponse.promotionCustomId);
        System.assertEquals(null, promotionResponse.promotionTitle);
        System.assertEquals(null, promotionResponse.promotionType);
        System.assertEquals(null, promotionResponse.startTime);
        System.assertEquals(null, promotionResponse.adAccountId);
        System.assertEquals(null, promotionResponse.id);
        System.assertEquals(null, promotionResponse.status);
    }
}
