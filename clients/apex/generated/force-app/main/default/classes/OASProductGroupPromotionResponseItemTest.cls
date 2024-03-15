@isTest
private class OASProductGroupPromotionResponseItemTest {
    @isTest
    private static void equalsSameInstance() {
        OASProductGroupPromotionResponseItem productGroupPromotionResponseItem1 = OASProductGroupPromotionResponseItem.getExample();
        OASProductGroupPromotionResponseItem productGroupPromotionResponseItem2 = productGroupPromotionResponseItem1;
        OASProductGroupPromotionResponseItem productGroupPromotionResponseItem3 = new OASProductGroupPromotionResponseItem();
        OASProductGroupPromotionResponseItem productGroupPromotionResponseItem4 = productGroupPromotionResponseItem3;

        System.assert(productGroupPromotionResponseItem1.equals(productGroupPromotionResponseItem2));
        System.assert(productGroupPromotionResponseItem2.equals(productGroupPromotionResponseItem1));
        System.assert(productGroupPromotionResponseItem1.equals(productGroupPromotionResponseItem1));
        System.assert(productGroupPromotionResponseItem3.equals(productGroupPromotionResponseItem4));
        System.assert(productGroupPromotionResponseItem4.equals(productGroupPromotionResponseItem3));
        System.assert(productGroupPromotionResponseItem3.equals(productGroupPromotionResponseItem3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASProductGroupPromotionResponseItem productGroupPromotionResponseItem1 = OASProductGroupPromotionResponseItem.getExample();
        OASProductGroupPromotionResponseItem productGroupPromotionResponseItem2 = OASProductGroupPromotionResponseItem.getExample();
        OASProductGroupPromotionResponseItem productGroupPromotionResponseItem3 = new OASProductGroupPromotionResponseItem();
        OASProductGroupPromotionResponseItem productGroupPromotionResponseItem4 = new OASProductGroupPromotionResponseItem();

        System.assert(productGroupPromotionResponseItem1.equals(productGroupPromotionResponseItem2));
        System.assert(productGroupPromotionResponseItem2.equals(productGroupPromotionResponseItem1));
        System.assert(productGroupPromotionResponseItem3.equals(productGroupPromotionResponseItem4));
        System.assert(productGroupPromotionResponseItem4.equals(productGroupPromotionResponseItem3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASProductGroupPromotionResponseItem productGroupPromotionResponseItem1 = OASProductGroupPromotionResponseItem.getExample();
        OASProductGroupPromotionResponseItem productGroupPromotionResponseItem2 = new OASProductGroupPromotionResponseItem();

        System.assertEquals(false, productGroupPromotionResponseItem1.equals('foo'));
        System.assertEquals(false, productGroupPromotionResponseItem2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASProductGroupPromotionResponseItem productGroupPromotionResponseItem1 = OASProductGroupPromotionResponseItem.getExample();
        OASProductGroupPromotionResponseItem productGroupPromotionResponseItem2 = new OASProductGroupPromotionResponseItem();
        OASProductGroupPromotionResponseItem productGroupPromotionResponseItem3;

        System.assertEquals(false, productGroupPromotionResponseItem1.equals(productGroupPromotionResponseItem3));
        System.assertEquals(false, productGroupPromotionResponseItem2.equals(productGroupPromotionResponseItem3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASProductGroupPromotionResponseItem productGroupPromotionResponseItem1 = OASProductGroupPromotionResponseItem.getExample();
        OASProductGroupPromotionResponseItem productGroupPromotionResponseItem2 = new OASProductGroupPromotionResponseItem();

        System.assertEquals(productGroupPromotionResponseItem1.hashCode(), productGroupPromotionResponseItem1.hashCode());
        System.assertEquals(productGroupPromotionResponseItem2.hashCode(), productGroupPromotionResponseItem2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASProductGroupPromotionResponseItem productGroupPromotionResponseItem1 = OASProductGroupPromotionResponseItem.getExample();
        OASProductGroupPromotionResponseItem productGroupPromotionResponseItem2 = OASProductGroupPromotionResponseItem.getExample();
        OASProductGroupPromotionResponseItem productGroupPromotionResponseItem3 = new OASProductGroupPromotionResponseItem();
        OASProductGroupPromotionResponseItem productGroupPromotionResponseItem4 = new OASProductGroupPromotionResponseItem();

        System.assert(productGroupPromotionResponseItem1.equals(productGroupPromotionResponseItem2));
        System.assert(productGroupPromotionResponseItem3.equals(productGroupPromotionResponseItem4));
        System.assertEquals(productGroupPromotionResponseItem1.hashCode(), productGroupPromotionResponseItem2.hashCode());
        System.assertEquals(productGroupPromotionResponseItem3.hashCode(), productGroupPromotionResponseItem4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASProductGroupPromotionResponseItem productGroupPromotionResponseItem = new OASProductGroupPromotionResponseItem();
        System.assertEquals(new List<OASException>(), productGroupPromotionResponseItem.exceptions);
        System.assertEquals(null, productGroupPromotionResponseItem.data);
    }
}
