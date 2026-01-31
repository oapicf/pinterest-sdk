@isTest
private class OASPromotionsResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASPromotionsResponse promotionsResponse1 = OASPromotionsResponse.getExample();
        OASPromotionsResponse promotionsResponse2 = promotionsResponse1;
        OASPromotionsResponse promotionsResponse3 = new OASPromotionsResponse();
        OASPromotionsResponse promotionsResponse4 = promotionsResponse3;

        System.assert(promotionsResponse1.equals(promotionsResponse2));
        System.assert(promotionsResponse2.equals(promotionsResponse1));
        System.assert(promotionsResponse1.equals(promotionsResponse1));
        System.assert(promotionsResponse3.equals(promotionsResponse4));
        System.assert(promotionsResponse4.equals(promotionsResponse3));
        System.assert(promotionsResponse3.equals(promotionsResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPromotionsResponse promotionsResponse1 = OASPromotionsResponse.getExample();
        OASPromotionsResponse promotionsResponse2 = OASPromotionsResponse.getExample();
        OASPromotionsResponse promotionsResponse3 = new OASPromotionsResponse();
        OASPromotionsResponse promotionsResponse4 = new OASPromotionsResponse();

        System.assert(promotionsResponse1.equals(promotionsResponse2));
        System.assert(promotionsResponse2.equals(promotionsResponse1));
        System.assert(promotionsResponse3.equals(promotionsResponse4));
        System.assert(promotionsResponse4.equals(promotionsResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPromotionsResponse promotionsResponse1 = OASPromotionsResponse.getExample();
        OASPromotionsResponse promotionsResponse2 = new OASPromotionsResponse();

        System.assertEquals(false, promotionsResponse1.equals('foo'));
        System.assertEquals(false, promotionsResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPromotionsResponse promotionsResponse1 = OASPromotionsResponse.getExample();
        OASPromotionsResponse promotionsResponse2 = new OASPromotionsResponse();
        OASPromotionsResponse promotionsResponse3;

        System.assertEquals(false, promotionsResponse1.equals(promotionsResponse3));
        System.assertEquals(false, promotionsResponse2.equals(promotionsResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPromotionsResponse promotionsResponse1 = OASPromotionsResponse.getExample();
        OASPromotionsResponse promotionsResponse2 = new OASPromotionsResponse();

        System.assertEquals(promotionsResponse1.hashCode(), promotionsResponse1.hashCode());
        System.assertEquals(promotionsResponse2.hashCode(), promotionsResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPromotionsResponse promotionsResponse1 = OASPromotionsResponse.getExample();
        OASPromotionsResponse promotionsResponse2 = OASPromotionsResponse.getExample();
        OASPromotionsResponse promotionsResponse3 = new OASPromotionsResponse();
        OASPromotionsResponse promotionsResponse4 = new OASPromotionsResponse();

        System.assert(promotionsResponse1.equals(promotionsResponse2));
        System.assert(promotionsResponse3.equals(promotionsResponse4));
        System.assertEquals(promotionsResponse1.hashCode(), promotionsResponse2.hashCode());
        System.assertEquals(promotionsResponse3.hashCode(), promotionsResponse4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPromotionsResponse promotionsResponse = new OASPromotionsResponse();
        System.assertEquals(new List<OASPromotionArrayElement>(), promotionsResponse.promotions);
    }
}
