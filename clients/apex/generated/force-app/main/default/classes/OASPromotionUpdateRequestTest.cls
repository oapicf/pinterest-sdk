@isTest
private class OASPromotionUpdateRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASPromotionUpdateRequest promotionUpdateRequest1 = OASPromotionUpdateRequest.getExample();
        OASPromotionUpdateRequest promotionUpdateRequest2 = promotionUpdateRequest1;
        OASPromotionUpdateRequest promotionUpdateRequest3 = new OASPromotionUpdateRequest();
        OASPromotionUpdateRequest promotionUpdateRequest4 = promotionUpdateRequest3;

        System.assert(promotionUpdateRequest1.equals(promotionUpdateRequest2));
        System.assert(promotionUpdateRequest2.equals(promotionUpdateRequest1));
        System.assert(promotionUpdateRequest1.equals(promotionUpdateRequest1));
        System.assert(promotionUpdateRequest3.equals(promotionUpdateRequest4));
        System.assert(promotionUpdateRequest4.equals(promotionUpdateRequest3));
        System.assert(promotionUpdateRequest3.equals(promotionUpdateRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPromotionUpdateRequest promotionUpdateRequest1 = OASPromotionUpdateRequest.getExample();
        OASPromotionUpdateRequest promotionUpdateRequest2 = OASPromotionUpdateRequest.getExample();
        OASPromotionUpdateRequest promotionUpdateRequest3 = new OASPromotionUpdateRequest();
        OASPromotionUpdateRequest promotionUpdateRequest4 = new OASPromotionUpdateRequest();

        System.assert(promotionUpdateRequest1.equals(promotionUpdateRequest2));
        System.assert(promotionUpdateRequest2.equals(promotionUpdateRequest1));
        System.assert(promotionUpdateRequest3.equals(promotionUpdateRequest4));
        System.assert(promotionUpdateRequest4.equals(promotionUpdateRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPromotionUpdateRequest promotionUpdateRequest1 = OASPromotionUpdateRequest.getExample();
        OASPromotionUpdateRequest promotionUpdateRequest2 = new OASPromotionUpdateRequest();

        System.assertEquals(false, promotionUpdateRequest1.equals('foo'));
        System.assertEquals(false, promotionUpdateRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPromotionUpdateRequest promotionUpdateRequest1 = OASPromotionUpdateRequest.getExample();
        OASPromotionUpdateRequest promotionUpdateRequest2 = new OASPromotionUpdateRequest();
        OASPromotionUpdateRequest promotionUpdateRequest3;

        System.assertEquals(false, promotionUpdateRequest1.equals(promotionUpdateRequest3));
        System.assertEquals(false, promotionUpdateRequest2.equals(promotionUpdateRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPromotionUpdateRequest promotionUpdateRequest1 = OASPromotionUpdateRequest.getExample();
        OASPromotionUpdateRequest promotionUpdateRequest2 = new OASPromotionUpdateRequest();

        System.assertEquals(promotionUpdateRequest1.hashCode(), promotionUpdateRequest1.hashCode());
        System.assertEquals(promotionUpdateRequest2.hashCode(), promotionUpdateRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPromotionUpdateRequest promotionUpdateRequest1 = OASPromotionUpdateRequest.getExample();
        OASPromotionUpdateRequest promotionUpdateRequest2 = OASPromotionUpdateRequest.getExample();
        OASPromotionUpdateRequest promotionUpdateRequest3 = new OASPromotionUpdateRequest();
        OASPromotionUpdateRequest promotionUpdateRequest4 = new OASPromotionUpdateRequest();

        System.assert(promotionUpdateRequest1.equals(promotionUpdateRequest2));
        System.assert(promotionUpdateRequest3.equals(promotionUpdateRequest4));
        System.assertEquals(promotionUpdateRequest1.hashCode(), promotionUpdateRequest2.hashCode());
        System.assertEquals(promotionUpdateRequest3.hashCode(), promotionUpdateRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPromotionUpdateRequest promotionUpdateRequest = new OASPromotionUpdateRequest();
        Map<String, String> x-property-mappings = promotionUpdateRequest.getx-property-mappings();
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
        OASPromotionUpdateRequest promotionUpdateRequest = new OASPromotionUpdateRequest();
        System.assertEquals(new List<OASPromotionTemplateValue>(), promotionUpdateRequest.templateValues);
        System.assertEquals(null, promotionUpdateRequest.discountStatus);
        System.assertEquals(null, promotionUpdateRequest.endTime);
        System.assertEquals(null, promotionUpdateRequest.externalId);
        System.assertEquals(null, promotionUpdateRequest.platformType);
        System.assertEquals(null, promotionUpdateRequest.promotionCode);
        System.assertEquals(null, promotionUpdateRequest.promotionCustomId);
        System.assertEquals(null, promotionUpdateRequest.promotionTitle);
        System.assertEquals(null, promotionUpdateRequest.promotionType);
        System.assertEquals(null, promotionUpdateRequest.startTime);
        System.assertEquals(null, promotionUpdateRequest.id);
        System.assertEquals(null, promotionUpdateRequest.status);
    }
}
