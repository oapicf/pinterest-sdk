@isTest
private class OASCatalogsProductGroupCurrencyCriteTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsProductGroupCurrencyCrite catalogsProductGroupCurrencyCriteria1 = OASCatalogsProductGroupCurrencyCrite.getExample();
        OASCatalogsProductGroupCurrencyCrite catalogsProductGroupCurrencyCriteria2 = catalogsProductGroupCurrencyCriteria1;
        OASCatalogsProductGroupCurrencyCrite catalogsProductGroupCurrencyCriteria3 = new OASCatalogsProductGroupCurrencyCrite();
        OASCatalogsProductGroupCurrencyCrite catalogsProductGroupCurrencyCriteria4 = catalogsProductGroupCurrencyCriteria3;

        System.assert(catalogsProductGroupCurrencyCriteria1.equals(catalogsProductGroupCurrencyCriteria2));
        System.assert(catalogsProductGroupCurrencyCriteria2.equals(catalogsProductGroupCurrencyCriteria1));
        System.assert(catalogsProductGroupCurrencyCriteria1.equals(catalogsProductGroupCurrencyCriteria1));
        System.assert(catalogsProductGroupCurrencyCriteria3.equals(catalogsProductGroupCurrencyCriteria4));
        System.assert(catalogsProductGroupCurrencyCriteria4.equals(catalogsProductGroupCurrencyCriteria3));
        System.assert(catalogsProductGroupCurrencyCriteria3.equals(catalogsProductGroupCurrencyCriteria3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsProductGroupCurrencyCrite catalogsProductGroupCurrencyCriteria1 = OASCatalogsProductGroupCurrencyCrite.getExample();
        OASCatalogsProductGroupCurrencyCrite catalogsProductGroupCurrencyCriteria2 = OASCatalogsProductGroupCurrencyCrite.getExample();
        OASCatalogsProductGroupCurrencyCrite catalogsProductGroupCurrencyCriteria3 = new OASCatalogsProductGroupCurrencyCrite();
        OASCatalogsProductGroupCurrencyCrite catalogsProductGroupCurrencyCriteria4 = new OASCatalogsProductGroupCurrencyCrite();

        System.assert(catalogsProductGroupCurrencyCriteria1.equals(catalogsProductGroupCurrencyCriteria2));
        System.assert(catalogsProductGroupCurrencyCriteria2.equals(catalogsProductGroupCurrencyCriteria1));
        System.assert(catalogsProductGroupCurrencyCriteria3.equals(catalogsProductGroupCurrencyCriteria4));
        System.assert(catalogsProductGroupCurrencyCriteria4.equals(catalogsProductGroupCurrencyCriteria3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsProductGroupCurrencyCrite catalogsProductGroupCurrencyCriteria1 = OASCatalogsProductGroupCurrencyCrite.getExample();
        OASCatalogsProductGroupCurrencyCrite catalogsProductGroupCurrencyCriteria2 = new OASCatalogsProductGroupCurrencyCrite();

        System.assertEquals(false, catalogsProductGroupCurrencyCriteria1.equals('foo'));
        System.assertEquals(false, catalogsProductGroupCurrencyCriteria2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsProductGroupCurrencyCrite catalogsProductGroupCurrencyCriteria1 = OASCatalogsProductGroupCurrencyCrite.getExample();
        OASCatalogsProductGroupCurrencyCrite catalogsProductGroupCurrencyCriteria2 = new OASCatalogsProductGroupCurrencyCrite();
        OASCatalogsProductGroupCurrencyCrite catalogsProductGroupCurrencyCriteria3;

        System.assertEquals(false, catalogsProductGroupCurrencyCriteria1.equals(catalogsProductGroupCurrencyCriteria3));
        System.assertEquals(false, catalogsProductGroupCurrencyCriteria2.equals(catalogsProductGroupCurrencyCriteria3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsProductGroupCurrencyCrite catalogsProductGroupCurrencyCriteria1 = OASCatalogsProductGroupCurrencyCrite.getExample();
        OASCatalogsProductGroupCurrencyCrite catalogsProductGroupCurrencyCriteria2 = new OASCatalogsProductGroupCurrencyCrite();

        System.assertEquals(catalogsProductGroupCurrencyCriteria1.hashCode(), catalogsProductGroupCurrencyCriteria1.hashCode());
        System.assertEquals(catalogsProductGroupCurrencyCriteria2.hashCode(), catalogsProductGroupCurrencyCriteria2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsProductGroupCurrencyCrite catalogsProductGroupCurrencyCriteria1 = OASCatalogsProductGroupCurrencyCrite.getExample();
        OASCatalogsProductGroupCurrencyCrite catalogsProductGroupCurrencyCriteria2 = OASCatalogsProductGroupCurrencyCrite.getExample();
        OASCatalogsProductGroupCurrencyCrite catalogsProductGroupCurrencyCriteria3 = new OASCatalogsProductGroupCurrencyCrite();
        OASCatalogsProductGroupCurrencyCrite catalogsProductGroupCurrencyCriteria4 = new OASCatalogsProductGroupCurrencyCrite();

        System.assert(catalogsProductGroupCurrencyCriteria1.equals(catalogsProductGroupCurrencyCriteria2));
        System.assert(catalogsProductGroupCurrencyCriteria3.equals(catalogsProductGroupCurrencyCriteria4));
        System.assertEquals(catalogsProductGroupCurrencyCriteria1.hashCode(), catalogsProductGroupCurrencyCriteria2.hashCode());
        System.assertEquals(catalogsProductGroupCurrencyCriteria3.hashCode(), catalogsProductGroupCurrencyCriteria4.hashCode());
    }
}
