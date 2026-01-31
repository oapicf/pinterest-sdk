@isTest
private class OASPromotionCommonTest {
    @isTest
    private static void equalsSameInstance() {
        OASPromotionCommon promotionCommon1 = OASPromotionCommon.getExample();
        OASPromotionCommon promotionCommon2 = promotionCommon1;
        OASPromotionCommon promotionCommon3 = new OASPromotionCommon();
        OASPromotionCommon promotionCommon4 = promotionCommon3;

        System.assert(promotionCommon1.equals(promotionCommon2));
        System.assert(promotionCommon2.equals(promotionCommon1));
        System.assert(promotionCommon1.equals(promotionCommon1));
        System.assert(promotionCommon3.equals(promotionCommon4));
        System.assert(promotionCommon4.equals(promotionCommon3));
        System.assert(promotionCommon3.equals(promotionCommon3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPromotionCommon promotionCommon1 = OASPromotionCommon.getExample();
        OASPromotionCommon promotionCommon2 = OASPromotionCommon.getExample();
        OASPromotionCommon promotionCommon3 = new OASPromotionCommon();
        OASPromotionCommon promotionCommon4 = new OASPromotionCommon();

        System.assert(promotionCommon1.equals(promotionCommon2));
        System.assert(promotionCommon2.equals(promotionCommon1));
        System.assert(promotionCommon3.equals(promotionCommon4));
        System.assert(promotionCommon4.equals(promotionCommon3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPromotionCommon promotionCommon1 = OASPromotionCommon.getExample();
        OASPromotionCommon promotionCommon2 = new OASPromotionCommon();

        System.assertEquals(false, promotionCommon1.equals('foo'));
        System.assertEquals(false, promotionCommon2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPromotionCommon promotionCommon1 = OASPromotionCommon.getExample();
        OASPromotionCommon promotionCommon2 = new OASPromotionCommon();
        OASPromotionCommon promotionCommon3;

        System.assertEquals(false, promotionCommon1.equals(promotionCommon3));
        System.assertEquals(false, promotionCommon2.equals(promotionCommon3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPromotionCommon promotionCommon1 = OASPromotionCommon.getExample();
        OASPromotionCommon promotionCommon2 = new OASPromotionCommon();

        System.assertEquals(promotionCommon1.hashCode(), promotionCommon1.hashCode());
        System.assertEquals(promotionCommon2.hashCode(), promotionCommon2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPromotionCommon promotionCommon1 = OASPromotionCommon.getExample();
        OASPromotionCommon promotionCommon2 = OASPromotionCommon.getExample();
        OASPromotionCommon promotionCommon3 = new OASPromotionCommon();
        OASPromotionCommon promotionCommon4 = new OASPromotionCommon();

        System.assert(promotionCommon1.equals(promotionCommon2));
        System.assert(promotionCommon3.equals(promotionCommon4));
        System.assertEquals(promotionCommon1.hashCode(), promotionCommon2.hashCode());
        System.assertEquals(promotionCommon3.hashCode(), promotionCommon4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPromotionCommon promotionCommon = new OASPromotionCommon();
        Map<String, String> x-property-mappings = promotionCommon.getx-property-mappings();
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
        OASPromotionCommon promotionCommon = new OASPromotionCommon();
        System.assertEquals(new List<OASPromotionTemplateValue>(), promotionCommon.templateValues);
        System.assertEquals(null, promotionCommon.discountStatus);
        System.assertEquals(null, promotionCommon.endTime);
        System.assertEquals(null, promotionCommon.externalId);
        System.assertEquals(null, promotionCommon.platformType);
        System.assertEquals(null, promotionCommon.promotionCode);
        System.assertEquals(null, promotionCommon.promotionCustomId);
        System.assertEquals(null, promotionCommon.promotionTitle);
        System.assertEquals(null, promotionCommon.promotionType);
        System.assertEquals(null, promotionCommon.startTime);
    }
}
