@isTest
private class OASProductGroupPromotionsList200RespTest {
    @isTest
    private static void equalsSameInstance() {
        OASProductGroupPromotionsList200Resp productGroupPromotionsList200Response1 = OASProductGroupPromotionsList200Resp.getExample();
        OASProductGroupPromotionsList200Resp productGroupPromotionsList200Response2 = productGroupPromotionsList200Response1;
        OASProductGroupPromotionsList200Resp productGroupPromotionsList200Response3 = new OASProductGroupPromotionsList200Resp();
        OASProductGroupPromotionsList200Resp productGroupPromotionsList200Response4 = productGroupPromotionsList200Response3;

        System.assert(productGroupPromotionsList200Response1.equals(productGroupPromotionsList200Response2));
        System.assert(productGroupPromotionsList200Response2.equals(productGroupPromotionsList200Response1));
        System.assert(productGroupPromotionsList200Response1.equals(productGroupPromotionsList200Response1));
        System.assert(productGroupPromotionsList200Response3.equals(productGroupPromotionsList200Response4));
        System.assert(productGroupPromotionsList200Response4.equals(productGroupPromotionsList200Response3));
        System.assert(productGroupPromotionsList200Response3.equals(productGroupPromotionsList200Response3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASProductGroupPromotionsList200Resp productGroupPromotionsList200Response1 = OASProductGroupPromotionsList200Resp.getExample();
        OASProductGroupPromotionsList200Resp productGroupPromotionsList200Response2 = OASProductGroupPromotionsList200Resp.getExample();
        OASProductGroupPromotionsList200Resp productGroupPromotionsList200Response3 = new OASProductGroupPromotionsList200Resp();
        OASProductGroupPromotionsList200Resp productGroupPromotionsList200Response4 = new OASProductGroupPromotionsList200Resp();

        System.assert(productGroupPromotionsList200Response1.equals(productGroupPromotionsList200Response2));
        System.assert(productGroupPromotionsList200Response2.equals(productGroupPromotionsList200Response1));
        System.assert(productGroupPromotionsList200Response3.equals(productGroupPromotionsList200Response4));
        System.assert(productGroupPromotionsList200Response4.equals(productGroupPromotionsList200Response3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASProductGroupPromotionsList200Resp productGroupPromotionsList200Response1 = OASProductGroupPromotionsList200Resp.getExample();
        OASProductGroupPromotionsList200Resp productGroupPromotionsList200Response2 = new OASProductGroupPromotionsList200Resp();

        System.assertEquals(false, productGroupPromotionsList200Response1.equals('foo'));
        System.assertEquals(false, productGroupPromotionsList200Response2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASProductGroupPromotionsList200Resp productGroupPromotionsList200Response1 = OASProductGroupPromotionsList200Resp.getExample();
        OASProductGroupPromotionsList200Resp productGroupPromotionsList200Response2 = new OASProductGroupPromotionsList200Resp();
        OASProductGroupPromotionsList200Resp productGroupPromotionsList200Response3;

        System.assertEquals(false, productGroupPromotionsList200Response1.equals(productGroupPromotionsList200Response3));
        System.assertEquals(false, productGroupPromotionsList200Response2.equals(productGroupPromotionsList200Response3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASProductGroupPromotionsList200Resp productGroupPromotionsList200Response1 = OASProductGroupPromotionsList200Resp.getExample();
        OASProductGroupPromotionsList200Resp productGroupPromotionsList200Response2 = new OASProductGroupPromotionsList200Resp();

        System.assertEquals(productGroupPromotionsList200Response1.hashCode(), productGroupPromotionsList200Response1.hashCode());
        System.assertEquals(productGroupPromotionsList200Response2.hashCode(), productGroupPromotionsList200Response2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASProductGroupPromotionsList200Resp productGroupPromotionsList200Response1 = OASProductGroupPromotionsList200Resp.getExample();
        OASProductGroupPromotionsList200Resp productGroupPromotionsList200Response2 = OASProductGroupPromotionsList200Resp.getExample();
        OASProductGroupPromotionsList200Resp productGroupPromotionsList200Response3 = new OASProductGroupPromotionsList200Resp();
        OASProductGroupPromotionsList200Resp productGroupPromotionsList200Response4 = new OASProductGroupPromotionsList200Resp();

        System.assert(productGroupPromotionsList200Response1.equals(productGroupPromotionsList200Response2));
        System.assert(productGroupPromotionsList200Response3.equals(productGroupPromotionsList200Response4));
        System.assertEquals(productGroupPromotionsList200Response1.hashCode(), productGroupPromotionsList200Response2.hashCode());
        System.assertEquals(productGroupPromotionsList200Response3.hashCode(), productGroupPromotionsList200Response4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASProductGroupPromotionsList200Resp productGroupPromotionsList200Response = new OASProductGroupPromotionsList200Resp();
        System.assertEquals(new List<OASProductGroupPromotionResponseItem>(), productGroupPromotionsList200Response.items);
        System.assertEquals(null, productGroupPromotionsList200Response.bookmark);
    }
}
