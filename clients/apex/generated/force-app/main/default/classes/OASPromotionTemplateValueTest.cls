@isTest
private class OASPromotionTemplateValueTest {
    @isTest
    private static void equalsSameInstance() {
        OASPromotionTemplateValue promotionTemplateValue1 = OASPromotionTemplateValue.getExample();
        OASPromotionTemplateValue promotionTemplateValue2 = promotionTemplateValue1;
        OASPromotionTemplateValue promotionTemplateValue3 = new OASPromotionTemplateValue();
        OASPromotionTemplateValue promotionTemplateValue4 = promotionTemplateValue3;

        System.assert(promotionTemplateValue1.equals(promotionTemplateValue2));
        System.assert(promotionTemplateValue2.equals(promotionTemplateValue1));
        System.assert(promotionTemplateValue1.equals(promotionTemplateValue1));
        System.assert(promotionTemplateValue3.equals(promotionTemplateValue4));
        System.assert(promotionTemplateValue4.equals(promotionTemplateValue3));
        System.assert(promotionTemplateValue3.equals(promotionTemplateValue3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPromotionTemplateValue promotionTemplateValue1 = OASPromotionTemplateValue.getExample();
        OASPromotionTemplateValue promotionTemplateValue2 = OASPromotionTemplateValue.getExample();
        OASPromotionTemplateValue promotionTemplateValue3 = new OASPromotionTemplateValue();
        OASPromotionTemplateValue promotionTemplateValue4 = new OASPromotionTemplateValue();

        System.assert(promotionTemplateValue1.equals(promotionTemplateValue2));
        System.assert(promotionTemplateValue2.equals(promotionTemplateValue1));
        System.assert(promotionTemplateValue3.equals(promotionTemplateValue4));
        System.assert(promotionTemplateValue4.equals(promotionTemplateValue3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPromotionTemplateValue promotionTemplateValue1 = OASPromotionTemplateValue.getExample();
        OASPromotionTemplateValue promotionTemplateValue2 = new OASPromotionTemplateValue();

        System.assertEquals(false, promotionTemplateValue1.equals('foo'));
        System.assertEquals(false, promotionTemplateValue2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPromotionTemplateValue promotionTemplateValue1 = OASPromotionTemplateValue.getExample();
        OASPromotionTemplateValue promotionTemplateValue2 = new OASPromotionTemplateValue();
        OASPromotionTemplateValue promotionTemplateValue3;

        System.assertEquals(false, promotionTemplateValue1.equals(promotionTemplateValue3));
        System.assertEquals(false, promotionTemplateValue2.equals(promotionTemplateValue3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPromotionTemplateValue promotionTemplateValue1 = OASPromotionTemplateValue.getExample();
        OASPromotionTemplateValue promotionTemplateValue2 = new OASPromotionTemplateValue();

        System.assertEquals(promotionTemplateValue1.hashCode(), promotionTemplateValue1.hashCode());
        System.assertEquals(promotionTemplateValue2.hashCode(), promotionTemplateValue2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPromotionTemplateValue promotionTemplateValue1 = OASPromotionTemplateValue.getExample();
        OASPromotionTemplateValue promotionTemplateValue2 = OASPromotionTemplateValue.getExample();
        OASPromotionTemplateValue promotionTemplateValue3 = new OASPromotionTemplateValue();
        OASPromotionTemplateValue promotionTemplateValue4 = new OASPromotionTemplateValue();

        System.assert(promotionTemplateValue1.equals(promotionTemplateValue2));
        System.assert(promotionTemplateValue3.equals(promotionTemplateValue4));
        System.assertEquals(promotionTemplateValue1.hashCode(), promotionTemplateValue2.hashCode());
        System.assertEquals(promotionTemplateValue3.hashCode(), promotionTemplateValue4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPromotionTemplateValue promotionTemplateValue = new OASPromotionTemplateValue();
        Map<String, String> x-property-mappings = promotionTemplateValue.getx-property-mappings();
        System.assertEquals('currencyCode', x-property-mappings.get('currency_code'));
        System.assertEquals('customText', x-property-mappings.get('custom_text'));
    }
}
