@isTest
private class OASPromotionArrayElementTest {
    @isTest
    private static void equalsSameInstance() {
        OASPromotionArrayElement promotionArrayElement1 = OASPromotionArrayElement.getExample();
        OASPromotionArrayElement promotionArrayElement2 = promotionArrayElement1;
        OASPromotionArrayElement promotionArrayElement3 = new OASPromotionArrayElement();
        OASPromotionArrayElement promotionArrayElement4 = promotionArrayElement3;

        System.assert(promotionArrayElement1.equals(promotionArrayElement2));
        System.assert(promotionArrayElement2.equals(promotionArrayElement1));
        System.assert(promotionArrayElement1.equals(promotionArrayElement1));
        System.assert(promotionArrayElement3.equals(promotionArrayElement4));
        System.assert(promotionArrayElement4.equals(promotionArrayElement3));
        System.assert(promotionArrayElement3.equals(promotionArrayElement3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPromotionArrayElement promotionArrayElement1 = OASPromotionArrayElement.getExample();
        OASPromotionArrayElement promotionArrayElement2 = OASPromotionArrayElement.getExample();
        OASPromotionArrayElement promotionArrayElement3 = new OASPromotionArrayElement();
        OASPromotionArrayElement promotionArrayElement4 = new OASPromotionArrayElement();

        System.assert(promotionArrayElement1.equals(promotionArrayElement2));
        System.assert(promotionArrayElement2.equals(promotionArrayElement1));
        System.assert(promotionArrayElement3.equals(promotionArrayElement4));
        System.assert(promotionArrayElement4.equals(promotionArrayElement3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPromotionArrayElement promotionArrayElement1 = OASPromotionArrayElement.getExample();
        OASPromotionArrayElement promotionArrayElement2 = new OASPromotionArrayElement();

        System.assertEquals(false, promotionArrayElement1.equals('foo'));
        System.assertEquals(false, promotionArrayElement2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPromotionArrayElement promotionArrayElement1 = OASPromotionArrayElement.getExample();
        OASPromotionArrayElement promotionArrayElement2 = new OASPromotionArrayElement();
        OASPromotionArrayElement promotionArrayElement3;

        System.assertEquals(false, promotionArrayElement1.equals(promotionArrayElement3));
        System.assertEquals(false, promotionArrayElement2.equals(promotionArrayElement3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPromotionArrayElement promotionArrayElement1 = OASPromotionArrayElement.getExample();
        OASPromotionArrayElement promotionArrayElement2 = new OASPromotionArrayElement();

        System.assertEquals(promotionArrayElement1.hashCode(), promotionArrayElement1.hashCode());
        System.assertEquals(promotionArrayElement2.hashCode(), promotionArrayElement2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPromotionArrayElement promotionArrayElement1 = OASPromotionArrayElement.getExample();
        OASPromotionArrayElement promotionArrayElement2 = OASPromotionArrayElement.getExample();
        OASPromotionArrayElement promotionArrayElement3 = new OASPromotionArrayElement();
        OASPromotionArrayElement promotionArrayElement4 = new OASPromotionArrayElement();

        System.assert(promotionArrayElement1.equals(promotionArrayElement2));
        System.assert(promotionArrayElement3.equals(promotionArrayElement4));
        System.assertEquals(promotionArrayElement1.hashCode(), promotionArrayElement2.hashCode());
        System.assertEquals(promotionArrayElement3.hashCode(), promotionArrayElement4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPromotionArrayElement promotionArrayElement = new OASPromotionArrayElement();
        Map<String, String> x-property-mappings = promotionArrayElement.getx-property-mappings();
        System.assertEquals('r_exception', x-property-mappings.get('exception'));
    }
}
