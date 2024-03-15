@isTest
private class OASCatalogsProductGroupPricingCurrenTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsProductGroupPricingCurren catalogsProductGroupPricingCurrencyCriteria1 = OASCatalogsProductGroupPricingCurren.getExample();
        OASCatalogsProductGroupPricingCurren catalogsProductGroupPricingCurrencyCriteria2 = catalogsProductGroupPricingCurrencyCriteria1;
        OASCatalogsProductGroupPricingCurren catalogsProductGroupPricingCurrencyCriteria3 = new OASCatalogsProductGroupPricingCurren();
        OASCatalogsProductGroupPricingCurren catalogsProductGroupPricingCurrencyCriteria4 = catalogsProductGroupPricingCurrencyCriteria3;

        System.assert(catalogsProductGroupPricingCurrencyCriteria1.equals(catalogsProductGroupPricingCurrencyCriteria2));
        System.assert(catalogsProductGroupPricingCurrencyCriteria2.equals(catalogsProductGroupPricingCurrencyCriteria1));
        System.assert(catalogsProductGroupPricingCurrencyCriteria1.equals(catalogsProductGroupPricingCurrencyCriteria1));
        System.assert(catalogsProductGroupPricingCurrencyCriteria3.equals(catalogsProductGroupPricingCurrencyCriteria4));
        System.assert(catalogsProductGroupPricingCurrencyCriteria4.equals(catalogsProductGroupPricingCurrencyCriteria3));
        System.assert(catalogsProductGroupPricingCurrencyCriteria3.equals(catalogsProductGroupPricingCurrencyCriteria3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsProductGroupPricingCurren catalogsProductGroupPricingCurrencyCriteria1 = OASCatalogsProductGroupPricingCurren.getExample();
        OASCatalogsProductGroupPricingCurren catalogsProductGroupPricingCurrencyCriteria2 = OASCatalogsProductGroupPricingCurren.getExample();
        OASCatalogsProductGroupPricingCurren catalogsProductGroupPricingCurrencyCriteria3 = new OASCatalogsProductGroupPricingCurren();
        OASCatalogsProductGroupPricingCurren catalogsProductGroupPricingCurrencyCriteria4 = new OASCatalogsProductGroupPricingCurren();

        System.assert(catalogsProductGroupPricingCurrencyCriteria1.equals(catalogsProductGroupPricingCurrencyCriteria2));
        System.assert(catalogsProductGroupPricingCurrencyCriteria2.equals(catalogsProductGroupPricingCurrencyCriteria1));
        System.assert(catalogsProductGroupPricingCurrencyCriteria3.equals(catalogsProductGroupPricingCurrencyCriteria4));
        System.assert(catalogsProductGroupPricingCurrencyCriteria4.equals(catalogsProductGroupPricingCurrencyCriteria3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsProductGroupPricingCurren catalogsProductGroupPricingCurrencyCriteria1 = OASCatalogsProductGroupPricingCurren.getExample();
        OASCatalogsProductGroupPricingCurren catalogsProductGroupPricingCurrencyCriteria2 = new OASCatalogsProductGroupPricingCurren();

        System.assertEquals(false, catalogsProductGroupPricingCurrencyCriteria1.equals('foo'));
        System.assertEquals(false, catalogsProductGroupPricingCurrencyCriteria2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsProductGroupPricingCurren catalogsProductGroupPricingCurrencyCriteria1 = OASCatalogsProductGroupPricingCurren.getExample();
        OASCatalogsProductGroupPricingCurren catalogsProductGroupPricingCurrencyCriteria2 = new OASCatalogsProductGroupPricingCurren();
        OASCatalogsProductGroupPricingCurren catalogsProductGroupPricingCurrencyCriteria3;

        System.assertEquals(false, catalogsProductGroupPricingCurrencyCriteria1.equals(catalogsProductGroupPricingCurrencyCriteria3));
        System.assertEquals(false, catalogsProductGroupPricingCurrencyCriteria2.equals(catalogsProductGroupPricingCurrencyCriteria3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsProductGroupPricingCurren catalogsProductGroupPricingCurrencyCriteria1 = OASCatalogsProductGroupPricingCurren.getExample();
        OASCatalogsProductGroupPricingCurren catalogsProductGroupPricingCurrencyCriteria2 = new OASCatalogsProductGroupPricingCurren();

        System.assertEquals(catalogsProductGroupPricingCurrencyCriteria1.hashCode(), catalogsProductGroupPricingCurrencyCriteria1.hashCode());
        System.assertEquals(catalogsProductGroupPricingCurrencyCriteria2.hashCode(), catalogsProductGroupPricingCurrencyCriteria2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsProductGroupPricingCurren catalogsProductGroupPricingCurrencyCriteria1 = OASCatalogsProductGroupPricingCurren.getExample();
        OASCatalogsProductGroupPricingCurren catalogsProductGroupPricingCurrencyCriteria2 = OASCatalogsProductGroupPricingCurren.getExample();
        OASCatalogsProductGroupPricingCurren catalogsProductGroupPricingCurrencyCriteria3 = new OASCatalogsProductGroupPricingCurren();
        OASCatalogsProductGroupPricingCurren catalogsProductGroupPricingCurrencyCriteria4 = new OASCatalogsProductGroupPricingCurren();

        System.assert(catalogsProductGroupPricingCurrencyCriteria1.equals(catalogsProductGroupPricingCurrencyCriteria2));
        System.assert(catalogsProductGroupPricingCurrencyCriteria3.equals(catalogsProductGroupPricingCurrencyCriteria4));
        System.assertEquals(catalogsProductGroupPricingCurrencyCriteria1.hashCode(), catalogsProductGroupPricingCurrencyCriteria2.hashCode());
        System.assertEquals(catalogsProductGroupPricingCurrencyCriteria3.hashCode(), catalogsProductGroupPricingCurrencyCriteria4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsProductGroupPricingCurren catalogsProductGroupPricingCurrencyCriteria = new OASCatalogsProductGroupPricingCurren();
        Map<String, String> x-property-mappings = catalogsProductGroupPricingCurrencyCriteria.getx-property-mappings();
        System.assertEquals('r_currency', x-property-mappings.get('currency'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCatalogsProductGroupPricingCurren catalogsProductGroupPricingCurrencyCriteria = new OASCatalogsProductGroupPricingCurren();
        System.assertEquals(false, catalogsProductGroupPricingCurrencyCriteria.negated);
        System.assertEquals(null, catalogsProductGroupPricingCurrencyCriteria.operator);
        System.assertEquals(null, catalogsProductGroupPricingCurrencyCriteria.value);
        System.assertEquals(null, catalogsProductGroupPricingCurrencyCriteria.r_currency);
    }
}
