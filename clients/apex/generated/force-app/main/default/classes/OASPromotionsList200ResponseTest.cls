@isTest
private class OASPromotionsList200ResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASPromotionsList200Response promotionsList200Response1 = OASPromotionsList200Response.getExample();
        OASPromotionsList200Response promotionsList200Response2 = promotionsList200Response1;
        OASPromotionsList200Response promotionsList200Response3 = new OASPromotionsList200Response();
        OASPromotionsList200Response promotionsList200Response4 = promotionsList200Response3;

        System.assert(promotionsList200Response1.equals(promotionsList200Response2));
        System.assert(promotionsList200Response2.equals(promotionsList200Response1));
        System.assert(promotionsList200Response1.equals(promotionsList200Response1));
        System.assert(promotionsList200Response3.equals(promotionsList200Response4));
        System.assert(promotionsList200Response4.equals(promotionsList200Response3));
        System.assert(promotionsList200Response3.equals(promotionsList200Response3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPromotionsList200Response promotionsList200Response1 = OASPromotionsList200Response.getExample();
        OASPromotionsList200Response promotionsList200Response2 = OASPromotionsList200Response.getExample();
        OASPromotionsList200Response promotionsList200Response3 = new OASPromotionsList200Response();
        OASPromotionsList200Response promotionsList200Response4 = new OASPromotionsList200Response();

        System.assert(promotionsList200Response1.equals(promotionsList200Response2));
        System.assert(promotionsList200Response2.equals(promotionsList200Response1));
        System.assert(promotionsList200Response3.equals(promotionsList200Response4));
        System.assert(promotionsList200Response4.equals(promotionsList200Response3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPromotionsList200Response promotionsList200Response1 = OASPromotionsList200Response.getExample();
        OASPromotionsList200Response promotionsList200Response2 = new OASPromotionsList200Response();

        System.assertEquals(false, promotionsList200Response1.equals('foo'));
        System.assertEquals(false, promotionsList200Response2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPromotionsList200Response promotionsList200Response1 = OASPromotionsList200Response.getExample();
        OASPromotionsList200Response promotionsList200Response2 = new OASPromotionsList200Response();
        OASPromotionsList200Response promotionsList200Response3;

        System.assertEquals(false, promotionsList200Response1.equals(promotionsList200Response3));
        System.assertEquals(false, promotionsList200Response2.equals(promotionsList200Response3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPromotionsList200Response promotionsList200Response1 = OASPromotionsList200Response.getExample();
        OASPromotionsList200Response promotionsList200Response2 = new OASPromotionsList200Response();

        System.assertEquals(promotionsList200Response1.hashCode(), promotionsList200Response1.hashCode());
        System.assertEquals(promotionsList200Response2.hashCode(), promotionsList200Response2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPromotionsList200Response promotionsList200Response1 = OASPromotionsList200Response.getExample();
        OASPromotionsList200Response promotionsList200Response2 = OASPromotionsList200Response.getExample();
        OASPromotionsList200Response promotionsList200Response3 = new OASPromotionsList200Response();
        OASPromotionsList200Response promotionsList200Response4 = new OASPromotionsList200Response();

        System.assert(promotionsList200Response1.equals(promotionsList200Response2));
        System.assert(promotionsList200Response3.equals(promotionsList200Response4));
        System.assertEquals(promotionsList200Response1.hashCode(), promotionsList200Response2.hashCode());
        System.assertEquals(promotionsList200Response3.hashCode(), promotionsList200Response4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPromotionsList200Response promotionsList200Response = new OASPromotionsList200Response();
        System.assertEquals(new List<OASPromotionResponse>(), promotionsList200Response.items);
        System.assertEquals(null, promotionsList200Response.bookmark);
    }
}
