@isTest
private class OASCatalogsProductGroupPricingCriterTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsProductGroupPricingCriter catalogsProductGroupPricingCriteria1 = OASCatalogsProductGroupPricingCriter.getExample();
        OASCatalogsProductGroupPricingCriter catalogsProductGroupPricingCriteria2 = catalogsProductGroupPricingCriteria1;
        OASCatalogsProductGroupPricingCriter catalogsProductGroupPricingCriteria3 = new OASCatalogsProductGroupPricingCriter();
        OASCatalogsProductGroupPricingCriter catalogsProductGroupPricingCriteria4 = catalogsProductGroupPricingCriteria3;

        System.assert(catalogsProductGroupPricingCriteria1.equals(catalogsProductGroupPricingCriteria2));
        System.assert(catalogsProductGroupPricingCriteria2.equals(catalogsProductGroupPricingCriteria1));
        System.assert(catalogsProductGroupPricingCriteria1.equals(catalogsProductGroupPricingCriteria1));
        System.assert(catalogsProductGroupPricingCriteria3.equals(catalogsProductGroupPricingCriteria4));
        System.assert(catalogsProductGroupPricingCriteria4.equals(catalogsProductGroupPricingCriteria3));
        System.assert(catalogsProductGroupPricingCriteria3.equals(catalogsProductGroupPricingCriteria3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsProductGroupPricingCriter catalogsProductGroupPricingCriteria1 = OASCatalogsProductGroupPricingCriter.getExample();
        OASCatalogsProductGroupPricingCriter catalogsProductGroupPricingCriteria2 = OASCatalogsProductGroupPricingCriter.getExample();
        OASCatalogsProductGroupPricingCriter catalogsProductGroupPricingCriteria3 = new OASCatalogsProductGroupPricingCriter();
        OASCatalogsProductGroupPricingCriter catalogsProductGroupPricingCriteria4 = new OASCatalogsProductGroupPricingCriter();

        System.assert(catalogsProductGroupPricingCriteria1.equals(catalogsProductGroupPricingCriteria2));
        System.assert(catalogsProductGroupPricingCriteria2.equals(catalogsProductGroupPricingCriteria1));
        System.assert(catalogsProductGroupPricingCriteria3.equals(catalogsProductGroupPricingCriteria4));
        System.assert(catalogsProductGroupPricingCriteria4.equals(catalogsProductGroupPricingCriteria3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsProductGroupPricingCriter catalogsProductGroupPricingCriteria1 = OASCatalogsProductGroupPricingCriter.getExample();
        OASCatalogsProductGroupPricingCriter catalogsProductGroupPricingCriteria2 = new OASCatalogsProductGroupPricingCriter();

        System.assertEquals(false, catalogsProductGroupPricingCriteria1.equals('foo'));
        System.assertEquals(false, catalogsProductGroupPricingCriteria2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsProductGroupPricingCriter catalogsProductGroupPricingCriteria1 = OASCatalogsProductGroupPricingCriter.getExample();
        OASCatalogsProductGroupPricingCriter catalogsProductGroupPricingCriteria2 = new OASCatalogsProductGroupPricingCriter();
        OASCatalogsProductGroupPricingCriter catalogsProductGroupPricingCriteria3;

        System.assertEquals(false, catalogsProductGroupPricingCriteria1.equals(catalogsProductGroupPricingCriteria3));
        System.assertEquals(false, catalogsProductGroupPricingCriteria2.equals(catalogsProductGroupPricingCriteria3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsProductGroupPricingCriter catalogsProductGroupPricingCriteria1 = OASCatalogsProductGroupPricingCriter.getExample();
        OASCatalogsProductGroupPricingCriter catalogsProductGroupPricingCriteria2 = new OASCatalogsProductGroupPricingCriter();

        System.assertEquals(catalogsProductGroupPricingCriteria1.hashCode(), catalogsProductGroupPricingCriteria1.hashCode());
        System.assertEquals(catalogsProductGroupPricingCriteria2.hashCode(), catalogsProductGroupPricingCriteria2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsProductGroupPricingCriter catalogsProductGroupPricingCriteria1 = OASCatalogsProductGroupPricingCriter.getExample();
        OASCatalogsProductGroupPricingCriter catalogsProductGroupPricingCriteria2 = OASCatalogsProductGroupPricingCriter.getExample();
        OASCatalogsProductGroupPricingCriter catalogsProductGroupPricingCriteria3 = new OASCatalogsProductGroupPricingCriter();
        OASCatalogsProductGroupPricingCriter catalogsProductGroupPricingCriteria4 = new OASCatalogsProductGroupPricingCriter();

        System.assert(catalogsProductGroupPricingCriteria1.equals(catalogsProductGroupPricingCriteria2));
        System.assert(catalogsProductGroupPricingCriteria3.equals(catalogsProductGroupPricingCriteria4));
        System.assertEquals(catalogsProductGroupPricingCriteria1.hashCode(), catalogsProductGroupPricingCriteria2.hashCode());
        System.assertEquals(catalogsProductGroupPricingCriteria3.hashCode(), catalogsProductGroupPricingCriteria4.hashCode());
    }
}
