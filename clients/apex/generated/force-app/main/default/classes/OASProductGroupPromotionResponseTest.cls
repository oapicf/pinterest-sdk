@isTest
private class OASProductGroupPromotionResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASProductGroupPromotionResponse productGroupPromotionResponse1 = OASProductGroupPromotionResponse.getExample();
        OASProductGroupPromotionResponse productGroupPromotionResponse2 = productGroupPromotionResponse1;
        OASProductGroupPromotionResponse productGroupPromotionResponse3 = new OASProductGroupPromotionResponse();
        OASProductGroupPromotionResponse productGroupPromotionResponse4 = productGroupPromotionResponse3;

        System.assert(productGroupPromotionResponse1.equals(productGroupPromotionResponse2));
        System.assert(productGroupPromotionResponse2.equals(productGroupPromotionResponse1));
        System.assert(productGroupPromotionResponse1.equals(productGroupPromotionResponse1));
        System.assert(productGroupPromotionResponse3.equals(productGroupPromotionResponse4));
        System.assert(productGroupPromotionResponse4.equals(productGroupPromotionResponse3));
        System.assert(productGroupPromotionResponse3.equals(productGroupPromotionResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASProductGroupPromotionResponse productGroupPromotionResponse1 = OASProductGroupPromotionResponse.getExample();
        OASProductGroupPromotionResponse productGroupPromotionResponse2 = OASProductGroupPromotionResponse.getExample();
        OASProductGroupPromotionResponse productGroupPromotionResponse3 = new OASProductGroupPromotionResponse();
        OASProductGroupPromotionResponse productGroupPromotionResponse4 = new OASProductGroupPromotionResponse();

        System.assert(productGroupPromotionResponse1.equals(productGroupPromotionResponse2));
        System.assert(productGroupPromotionResponse2.equals(productGroupPromotionResponse1));
        System.assert(productGroupPromotionResponse3.equals(productGroupPromotionResponse4));
        System.assert(productGroupPromotionResponse4.equals(productGroupPromotionResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASProductGroupPromotionResponse productGroupPromotionResponse1 = OASProductGroupPromotionResponse.getExample();
        OASProductGroupPromotionResponse productGroupPromotionResponse2 = new OASProductGroupPromotionResponse();

        System.assertEquals(false, productGroupPromotionResponse1.equals('foo'));
        System.assertEquals(false, productGroupPromotionResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASProductGroupPromotionResponse productGroupPromotionResponse1 = OASProductGroupPromotionResponse.getExample();
        OASProductGroupPromotionResponse productGroupPromotionResponse2 = new OASProductGroupPromotionResponse();
        OASProductGroupPromotionResponse productGroupPromotionResponse3;

        System.assertEquals(false, productGroupPromotionResponse1.equals(productGroupPromotionResponse3));
        System.assertEquals(false, productGroupPromotionResponse2.equals(productGroupPromotionResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASProductGroupPromotionResponse productGroupPromotionResponse1 = OASProductGroupPromotionResponse.getExample();
        OASProductGroupPromotionResponse productGroupPromotionResponse2 = new OASProductGroupPromotionResponse();

        System.assertEquals(productGroupPromotionResponse1.hashCode(), productGroupPromotionResponse1.hashCode());
        System.assertEquals(productGroupPromotionResponse2.hashCode(), productGroupPromotionResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASProductGroupPromotionResponse productGroupPromotionResponse1 = OASProductGroupPromotionResponse.getExample();
        OASProductGroupPromotionResponse productGroupPromotionResponse2 = OASProductGroupPromotionResponse.getExample();
        OASProductGroupPromotionResponse productGroupPromotionResponse3 = new OASProductGroupPromotionResponse();
        OASProductGroupPromotionResponse productGroupPromotionResponse4 = new OASProductGroupPromotionResponse();

        System.assert(productGroupPromotionResponse1.equals(productGroupPromotionResponse2));
        System.assert(productGroupPromotionResponse3.equals(productGroupPromotionResponse4));
        System.assertEquals(productGroupPromotionResponse1.hashCode(), productGroupPromotionResponse2.hashCode());
        System.assertEquals(productGroupPromotionResponse3.hashCode(), productGroupPromotionResponse4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASProductGroupPromotionResponse productGroupPromotionResponse = new OASProductGroupPromotionResponse();
        System.assertEquals(new List<OASProductGroupPromotionResponseItem>(), productGroupPromotionResponse.items);
    }
}
