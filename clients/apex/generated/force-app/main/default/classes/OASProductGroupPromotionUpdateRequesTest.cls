@isTest
private class OASProductGroupPromotionUpdateRequesTest {
    @isTest
    private static void equalsSameInstance() {
        OASProductGroupPromotionUpdateReques productGroupPromotionUpdateRequest1 = OASProductGroupPromotionUpdateReques.getExample();
        OASProductGroupPromotionUpdateReques productGroupPromotionUpdateRequest2 = productGroupPromotionUpdateRequest1;
        OASProductGroupPromotionUpdateReques productGroupPromotionUpdateRequest3 = new OASProductGroupPromotionUpdateReques();
        OASProductGroupPromotionUpdateReques productGroupPromotionUpdateRequest4 = productGroupPromotionUpdateRequest3;

        System.assert(productGroupPromotionUpdateRequest1.equals(productGroupPromotionUpdateRequest2));
        System.assert(productGroupPromotionUpdateRequest2.equals(productGroupPromotionUpdateRequest1));
        System.assert(productGroupPromotionUpdateRequest1.equals(productGroupPromotionUpdateRequest1));
        System.assert(productGroupPromotionUpdateRequest3.equals(productGroupPromotionUpdateRequest4));
        System.assert(productGroupPromotionUpdateRequest4.equals(productGroupPromotionUpdateRequest3));
        System.assert(productGroupPromotionUpdateRequest3.equals(productGroupPromotionUpdateRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASProductGroupPromotionUpdateReques productGroupPromotionUpdateRequest1 = OASProductGroupPromotionUpdateReques.getExample();
        OASProductGroupPromotionUpdateReques productGroupPromotionUpdateRequest2 = OASProductGroupPromotionUpdateReques.getExample();
        OASProductGroupPromotionUpdateReques productGroupPromotionUpdateRequest3 = new OASProductGroupPromotionUpdateReques();
        OASProductGroupPromotionUpdateReques productGroupPromotionUpdateRequest4 = new OASProductGroupPromotionUpdateReques();

        System.assert(productGroupPromotionUpdateRequest1.equals(productGroupPromotionUpdateRequest2));
        System.assert(productGroupPromotionUpdateRequest2.equals(productGroupPromotionUpdateRequest1));
        System.assert(productGroupPromotionUpdateRequest3.equals(productGroupPromotionUpdateRequest4));
        System.assert(productGroupPromotionUpdateRequest4.equals(productGroupPromotionUpdateRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASProductGroupPromotionUpdateReques productGroupPromotionUpdateRequest1 = OASProductGroupPromotionUpdateReques.getExample();
        OASProductGroupPromotionUpdateReques productGroupPromotionUpdateRequest2 = new OASProductGroupPromotionUpdateReques();

        System.assertEquals(false, productGroupPromotionUpdateRequest1.equals('foo'));
        System.assertEquals(false, productGroupPromotionUpdateRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASProductGroupPromotionUpdateReques productGroupPromotionUpdateRequest1 = OASProductGroupPromotionUpdateReques.getExample();
        OASProductGroupPromotionUpdateReques productGroupPromotionUpdateRequest2 = new OASProductGroupPromotionUpdateReques();
        OASProductGroupPromotionUpdateReques productGroupPromotionUpdateRequest3;

        System.assertEquals(false, productGroupPromotionUpdateRequest1.equals(productGroupPromotionUpdateRequest3));
        System.assertEquals(false, productGroupPromotionUpdateRequest2.equals(productGroupPromotionUpdateRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASProductGroupPromotionUpdateReques productGroupPromotionUpdateRequest1 = OASProductGroupPromotionUpdateReques.getExample();
        OASProductGroupPromotionUpdateReques productGroupPromotionUpdateRequest2 = new OASProductGroupPromotionUpdateReques();

        System.assertEquals(productGroupPromotionUpdateRequest1.hashCode(), productGroupPromotionUpdateRequest1.hashCode());
        System.assertEquals(productGroupPromotionUpdateRequest2.hashCode(), productGroupPromotionUpdateRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASProductGroupPromotionUpdateReques productGroupPromotionUpdateRequest1 = OASProductGroupPromotionUpdateReques.getExample();
        OASProductGroupPromotionUpdateReques productGroupPromotionUpdateRequest2 = OASProductGroupPromotionUpdateReques.getExample();
        OASProductGroupPromotionUpdateReques productGroupPromotionUpdateRequest3 = new OASProductGroupPromotionUpdateReques();
        OASProductGroupPromotionUpdateReques productGroupPromotionUpdateRequest4 = new OASProductGroupPromotionUpdateReques();

        System.assert(productGroupPromotionUpdateRequest1.equals(productGroupPromotionUpdateRequest2));
        System.assert(productGroupPromotionUpdateRequest3.equals(productGroupPromotionUpdateRequest4));
        System.assertEquals(productGroupPromotionUpdateRequest1.hashCode(), productGroupPromotionUpdateRequest2.hashCode());
        System.assertEquals(productGroupPromotionUpdateRequest3.hashCode(), productGroupPromotionUpdateRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASProductGroupPromotionUpdateReques productGroupPromotionUpdateRequest = new OASProductGroupPromotionUpdateReques();
        Map<String, String> x-property-mappings = productGroupPromotionUpdateRequest.getx-property-mappings();
        System.assertEquals('adGroupId', x-property-mappings.get('ad_group_id'));
        System.assertEquals('productGroupPromotion', x-property-mappings.get('product_group_promotion'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASProductGroupPromotionUpdateReques productGroupPromotionUpdateRequest = new OASProductGroupPromotionUpdateReques();
        System.assertEquals(new List<OASProductGroupPromotion>(), productGroupPromotionUpdateRequest.productGroupPromotion);
        System.assertEquals(null, productGroupPromotionUpdateRequest.adGroupId);
    }
}
