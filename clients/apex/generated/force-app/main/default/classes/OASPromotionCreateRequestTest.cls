@isTest
private class OASPromotionCreateRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASPromotionCreateRequest promotionCreateRequest1 = OASPromotionCreateRequest.getExample();
        OASPromotionCreateRequest promotionCreateRequest2 = promotionCreateRequest1;
        OASPromotionCreateRequest promotionCreateRequest3 = new OASPromotionCreateRequest();
        OASPromotionCreateRequest promotionCreateRequest4 = promotionCreateRequest3;

        System.assert(promotionCreateRequest1.equals(promotionCreateRequest2));
        System.assert(promotionCreateRequest2.equals(promotionCreateRequest1));
        System.assert(promotionCreateRequest1.equals(promotionCreateRequest1));
        System.assert(promotionCreateRequest3.equals(promotionCreateRequest4));
        System.assert(promotionCreateRequest4.equals(promotionCreateRequest3));
        System.assert(promotionCreateRequest3.equals(promotionCreateRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPromotionCreateRequest promotionCreateRequest1 = OASPromotionCreateRequest.getExample();
        OASPromotionCreateRequest promotionCreateRequest2 = OASPromotionCreateRequest.getExample();
        OASPromotionCreateRequest promotionCreateRequest3 = new OASPromotionCreateRequest();
        OASPromotionCreateRequest promotionCreateRequest4 = new OASPromotionCreateRequest();

        System.assert(promotionCreateRequest1.equals(promotionCreateRequest2));
        System.assert(promotionCreateRequest2.equals(promotionCreateRequest1));
        System.assert(promotionCreateRequest3.equals(promotionCreateRequest4));
        System.assert(promotionCreateRequest4.equals(promotionCreateRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPromotionCreateRequest promotionCreateRequest1 = OASPromotionCreateRequest.getExample();
        OASPromotionCreateRequest promotionCreateRequest2 = new OASPromotionCreateRequest();

        System.assertEquals(false, promotionCreateRequest1.equals('foo'));
        System.assertEquals(false, promotionCreateRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPromotionCreateRequest promotionCreateRequest1 = OASPromotionCreateRequest.getExample();
        OASPromotionCreateRequest promotionCreateRequest2 = new OASPromotionCreateRequest();
        OASPromotionCreateRequest promotionCreateRequest3;

        System.assertEquals(false, promotionCreateRequest1.equals(promotionCreateRequest3));
        System.assertEquals(false, promotionCreateRequest2.equals(promotionCreateRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPromotionCreateRequest promotionCreateRequest1 = OASPromotionCreateRequest.getExample();
        OASPromotionCreateRequest promotionCreateRequest2 = new OASPromotionCreateRequest();

        System.assertEquals(promotionCreateRequest1.hashCode(), promotionCreateRequest1.hashCode());
        System.assertEquals(promotionCreateRequest2.hashCode(), promotionCreateRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPromotionCreateRequest promotionCreateRequest1 = OASPromotionCreateRequest.getExample();
        OASPromotionCreateRequest promotionCreateRequest2 = OASPromotionCreateRequest.getExample();
        OASPromotionCreateRequest promotionCreateRequest3 = new OASPromotionCreateRequest();
        OASPromotionCreateRequest promotionCreateRequest4 = new OASPromotionCreateRequest();

        System.assert(promotionCreateRequest1.equals(promotionCreateRequest2));
        System.assert(promotionCreateRequest3.equals(promotionCreateRequest4));
        System.assertEquals(promotionCreateRequest1.hashCode(), promotionCreateRequest2.hashCode());
        System.assertEquals(promotionCreateRequest3.hashCode(), promotionCreateRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPromotionCreateRequest promotionCreateRequest = new OASPromotionCreateRequest();
        Map<String, String> x-property-mappings = promotionCreateRequest.getx-property-mappings();
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
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPromotionCreateRequest promotionCreateRequest = new OASPromotionCreateRequest();
        System.assertEquals(new List<OASPromotionTemplateValue>(), promotionCreateRequest.templateValues);
        System.assertEquals(null, promotionCreateRequest.discountStatus);
        System.assertEquals(null, promotionCreateRequest.endTime);
        System.assertEquals(null, promotionCreateRequest.externalId);
        System.assertEquals(null, promotionCreateRequest.platformType);
        System.assertEquals(null, promotionCreateRequest.promotionCode);
        System.assertEquals(null, promotionCreateRequest.promotionCustomId);
        System.assertEquals(null, promotionCreateRequest.promotionTitle);
        System.assertEquals(null, promotionCreateRequest.promotionType);
        System.assertEquals(null, promotionCreateRequest.startTime);
    }
}
