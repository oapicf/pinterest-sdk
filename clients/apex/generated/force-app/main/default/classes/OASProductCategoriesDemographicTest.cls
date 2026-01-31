@isTest
private class OASProductCategoriesDemographicTest {
    @isTest
    private static void equalsSameInstance() {
        OASProductCategoriesDemographic productCategoriesDemographic1 = OASProductCategoriesDemographic.getExample();
        OASProductCategoriesDemographic productCategoriesDemographic2 = productCategoriesDemographic1;
        OASProductCategoriesDemographic productCategoriesDemographic3 = new OASProductCategoriesDemographic();
        OASProductCategoriesDemographic productCategoriesDemographic4 = productCategoriesDemographic3;

        System.assert(productCategoriesDemographic1.equals(productCategoriesDemographic2));
        System.assert(productCategoriesDemographic2.equals(productCategoriesDemographic1));
        System.assert(productCategoriesDemographic1.equals(productCategoriesDemographic1));
        System.assert(productCategoriesDemographic3.equals(productCategoriesDemographic4));
        System.assert(productCategoriesDemographic4.equals(productCategoriesDemographic3));
        System.assert(productCategoriesDemographic3.equals(productCategoriesDemographic3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASProductCategoriesDemographic productCategoriesDemographic1 = OASProductCategoriesDemographic.getExample();
        OASProductCategoriesDemographic productCategoriesDemographic2 = OASProductCategoriesDemographic.getExample();
        OASProductCategoriesDemographic productCategoriesDemographic3 = new OASProductCategoriesDemographic();
        OASProductCategoriesDemographic productCategoriesDemographic4 = new OASProductCategoriesDemographic();

        System.assert(productCategoriesDemographic1.equals(productCategoriesDemographic2));
        System.assert(productCategoriesDemographic2.equals(productCategoriesDemographic1));
        System.assert(productCategoriesDemographic3.equals(productCategoriesDemographic4));
        System.assert(productCategoriesDemographic4.equals(productCategoriesDemographic3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASProductCategoriesDemographic productCategoriesDemographic1 = OASProductCategoriesDemographic.getExample();
        OASProductCategoriesDemographic productCategoriesDemographic2 = new OASProductCategoriesDemographic();

        System.assertEquals(false, productCategoriesDemographic1.equals('foo'));
        System.assertEquals(false, productCategoriesDemographic2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASProductCategoriesDemographic productCategoriesDemographic1 = OASProductCategoriesDemographic.getExample();
        OASProductCategoriesDemographic productCategoriesDemographic2 = new OASProductCategoriesDemographic();
        OASProductCategoriesDemographic productCategoriesDemographic3;

        System.assertEquals(false, productCategoriesDemographic1.equals(productCategoriesDemographic3));
        System.assertEquals(false, productCategoriesDemographic2.equals(productCategoriesDemographic3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASProductCategoriesDemographic productCategoriesDemographic1 = OASProductCategoriesDemographic.getExample();
        OASProductCategoriesDemographic productCategoriesDemographic2 = new OASProductCategoriesDemographic();

        System.assertEquals(productCategoriesDemographic1.hashCode(), productCategoriesDemographic1.hashCode());
        System.assertEquals(productCategoriesDemographic2.hashCode(), productCategoriesDemographic2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASProductCategoriesDemographic productCategoriesDemographic1 = OASProductCategoriesDemographic.getExample();
        OASProductCategoriesDemographic productCategoriesDemographic2 = OASProductCategoriesDemographic.getExample();
        OASProductCategoriesDemographic productCategoriesDemographic3 = new OASProductCategoriesDemographic();
        OASProductCategoriesDemographic productCategoriesDemographic4 = new OASProductCategoriesDemographic();

        System.assert(productCategoriesDemographic1.equals(productCategoriesDemographic2));
        System.assert(productCategoriesDemographic3.equals(productCategoriesDemographic4));
        System.assertEquals(productCategoriesDemographic1.hashCode(), productCategoriesDemographic2.hashCode());
        System.assertEquals(productCategoriesDemographic3.hashCode(), productCategoriesDemographic4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASProductCategoriesDemographic productCategoriesDemographic = new OASProductCategoriesDemographic();
        System.assertEquals(new Map<String, Double>(), productCategoriesDemographic.age);
        System.assertEquals(null, productCategoriesDemographic.gender);
    }
}
