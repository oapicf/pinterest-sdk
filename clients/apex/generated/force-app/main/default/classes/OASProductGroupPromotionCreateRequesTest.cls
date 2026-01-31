@isTest
private class OASProductGroupPromotionCreateRequesTest {
    @isTest
    private static void equalsSameInstance() {
        OASProductGroupPromotionCreateReques productGroupPromotionCreateRequest1 = OASProductGroupPromotionCreateReques.getExample();
        OASProductGroupPromotionCreateReques productGroupPromotionCreateRequest2 = productGroupPromotionCreateRequest1;
        OASProductGroupPromotionCreateReques productGroupPromotionCreateRequest3 = new OASProductGroupPromotionCreateReques();
        OASProductGroupPromotionCreateReques productGroupPromotionCreateRequest4 = productGroupPromotionCreateRequest3;

        System.assert(productGroupPromotionCreateRequest1.equals(productGroupPromotionCreateRequest2));
        System.assert(productGroupPromotionCreateRequest2.equals(productGroupPromotionCreateRequest1));
        System.assert(productGroupPromotionCreateRequest1.equals(productGroupPromotionCreateRequest1));
        System.assert(productGroupPromotionCreateRequest3.equals(productGroupPromotionCreateRequest4));
        System.assert(productGroupPromotionCreateRequest4.equals(productGroupPromotionCreateRequest3));
        System.assert(productGroupPromotionCreateRequest3.equals(productGroupPromotionCreateRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASProductGroupPromotionCreateReques productGroupPromotionCreateRequest1 = OASProductGroupPromotionCreateReques.getExample();
        OASProductGroupPromotionCreateReques productGroupPromotionCreateRequest2 = OASProductGroupPromotionCreateReques.getExample();
        OASProductGroupPromotionCreateReques productGroupPromotionCreateRequest3 = new OASProductGroupPromotionCreateReques();
        OASProductGroupPromotionCreateReques productGroupPromotionCreateRequest4 = new OASProductGroupPromotionCreateReques();

        System.assert(productGroupPromotionCreateRequest1.equals(productGroupPromotionCreateRequest2));
        System.assert(productGroupPromotionCreateRequest2.equals(productGroupPromotionCreateRequest1));
        System.assert(productGroupPromotionCreateRequest3.equals(productGroupPromotionCreateRequest4));
        System.assert(productGroupPromotionCreateRequest4.equals(productGroupPromotionCreateRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASProductGroupPromotionCreateReques productGroupPromotionCreateRequest1 = OASProductGroupPromotionCreateReques.getExample();
        OASProductGroupPromotionCreateReques productGroupPromotionCreateRequest2 = new OASProductGroupPromotionCreateReques();

        System.assertEquals(false, productGroupPromotionCreateRequest1.equals('foo'));
        System.assertEquals(false, productGroupPromotionCreateRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASProductGroupPromotionCreateReques productGroupPromotionCreateRequest1 = OASProductGroupPromotionCreateReques.getExample();
        OASProductGroupPromotionCreateReques productGroupPromotionCreateRequest2 = new OASProductGroupPromotionCreateReques();
        OASProductGroupPromotionCreateReques productGroupPromotionCreateRequest3;

        System.assertEquals(false, productGroupPromotionCreateRequest1.equals(productGroupPromotionCreateRequest3));
        System.assertEquals(false, productGroupPromotionCreateRequest2.equals(productGroupPromotionCreateRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASProductGroupPromotionCreateReques productGroupPromotionCreateRequest1 = OASProductGroupPromotionCreateReques.getExample();
        OASProductGroupPromotionCreateReques productGroupPromotionCreateRequest2 = new OASProductGroupPromotionCreateReques();

        System.assertEquals(productGroupPromotionCreateRequest1.hashCode(), productGroupPromotionCreateRequest1.hashCode());
        System.assertEquals(productGroupPromotionCreateRequest2.hashCode(), productGroupPromotionCreateRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASProductGroupPromotionCreateReques productGroupPromotionCreateRequest1 = OASProductGroupPromotionCreateReques.getExample();
        OASProductGroupPromotionCreateReques productGroupPromotionCreateRequest2 = OASProductGroupPromotionCreateReques.getExample();
        OASProductGroupPromotionCreateReques productGroupPromotionCreateRequest3 = new OASProductGroupPromotionCreateReques();
        OASProductGroupPromotionCreateReques productGroupPromotionCreateRequest4 = new OASProductGroupPromotionCreateReques();

        System.assert(productGroupPromotionCreateRequest1.equals(productGroupPromotionCreateRequest2));
        System.assert(productGroupPromotionCreateRequest3.equals(productGroupPromotionCreateRequest4));
        System.assertEquals(productGroupPromotionCreateRequest1.hashCode(), productGroupPromotionCreateRequest2.hashCode());
        System.assertEquals(productGroupPromotionCreateRequest3.hashCode(), productGroupPromotionCreateRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASProductGroupPromotionCreateReques productGroupPromotionCreateRequest = new OASProductGroupPromotionCreateReques();
        Map<String, String> x-property-mappings = productGroupPromotionCreateRequest.getx-property-mappings();
        System.assertEquals('adGroupId', x-property-mappings.get('ad_group_id'));
        System.assertEquals('productGroupPromotion', x-property-mappings.get('product_group_promotion'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASProductGroupPromotionCreateReques productGroupPromotionCreateRequest = new OASProductGroupPromotionCreateReques();
        System.assertEquals(new List<OASProductGroupPromotion>(), productGroupPromotionCreateRequest.productGroupPromotion);
        System.assertEquals(null, productGroupPromotionCreateRequest.adGroupId);
    }
}
