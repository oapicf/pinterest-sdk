@isTest
private class OASCatalogsProductGroupMultipleCountTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsProductGroupMultipleCount catalogsProductGroupMultipleCountriesCriteria1 = OASCatalogsProductGroupMultipleCount.getExample();
        OASCatalogsProductGroupMultipleCount catalogsProductGroupMultipleCountriesCriteria2 = catalogsProductGroupMultipleCountriesCriteria1;
        OASCatalogsProductGroupMultipleCount catalogsProductGroupMultipleCountriesCriteria3 = new OASCatalogsProductGroupMultipleCount();
        OASCatalogsProductGroupMultipleCount catalogsProductGroupMultipleCountriesCriteria4 = catalogsProductGroupMultipleCountriesCriteria3;

        System.assert(catalogsProductGroupMultipleCountriesCriteria1.equals(catalogsProductGroupMultipleCountriesCriteria2));
        System.assert(catalogsProductGroupMultipleCountriesCriteria2.equals(catalogsProductGroupMultipleCountriesCriteria1));
        System.assert(catalogsProductGroupMultipleCountriesCriteria1.equals(catalogsProductGroupMultipleCountriesCriteria1));
        System.assert(catalogsProductGroupMultipleCountriesCriteria3.equals(catalogsProductGroupMultipleCountriesCriteria4));
        System.assert(catalogsProductGroupMultipleCountriesCriteria4.equals(catalogsProductGroupMultipleCountriesCriteria3));
        System.assert(catalogsProductGroupMultipleCountriesCriteria3.equals(catalogsProductGroupMultipleCountriesCriteria3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsProductGroupMultipleCount catalogsProductGroupMultipleCountriesCriteria1 = OASCatalogsProductGroupMultipleCount.getExample();
        OASCatalogsProductGroupMultipleCount catalogsProductGroupMultipleCountriesCriteria2 = OASCatalogsProductGroupMultipleCount.getExample();
        OASCatalogsProductGroupMultipleCount catalogsProductGroupMultipleCountriesCriteria3 = new OASCatalogsProductGroupMultipleCount();
        OASCatalogsProductGroupMultipleCount catalogsProductGroupMultipleCountriesCriteria4 = new OASCatalogsProductGroupMultipleCount();

        System.assert(catalogsProductGroupMultipleCountriesCriteria1.equals(catalogsProductGroupMultipleCountriesCriteria2));
        System.assert(catalogsProductGroupMultipleCountriesCriteria2.equals(catalogsProductGroupMultipleCountriesCriteria1));
        System.assert(catalogsProductGroupMultipleCountriesCriteria3.equals(catalogsProductGroupMultipleCountriesCriteria4));
        System.assert(catalogsProductGroupMultipleCountriesCriteria4.equals(catalogsProductGroupMultipleCountriesCriteria3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsProductGroupMultipleCount catalogsProductGroupMultipleCountriesCriteria1 = OASCatalogsProductGroupMultipleCount.getExample();
        OASCatalogsProductGroupMultipleCount catalogsProductGroupMultipleCountriesCriteria2 = new OASCatalogsProductGroupMultipleCount();

        System.assertEquals(false, catalogsProductGroupMultipleCountriesCriteria1.equals('foo'));
        System.assertEquals(false, catalogsProductGroupMultipleCountriesCriteria2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsProductGroupMultipleCount catalogsProductGroupMultipleCountriesCriteria1 = OASCatalogsProductGroupMultipleCount.getExample();
        OASCatalogsProductGroupMultipleCount catalogsProductGroupMultipleCountriesCriteria2 = new OASCatalogsProductGroupMultipleCount();
        OASCatalogsProductGroupMultipleCount catalogsProductGroupMultipleCountriesCriteria3;

        System.assertEquals(false, catalogsProductGroupMultipleCountriesCriteria1.equals(catalogsProductGroupMultipleCountriesCriteria3));
        System.assertEquals(false, catalogsProductGroupMultipleCountriesCriteria2.equals(catalogsProductGroupMultipleCountriesCriteria3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsProductGroupMultipleCount catalogsProductGroupMultipleCountriesCriteria1 = OASCatalogsProductGroupMultipleCount.getExample();
        OASCatalogsProductGroupMultipleCount catalogsProductGroupMultipleCountriesCriteria2 = new OASCatalogsProductGroupMultipleCount();

        System.assertEquals(catalogsProductGroupMultipleCountriesCriteria1.hashCode(), catalogsProductGroupMultipleCountriesCriteria1.hashCode());
        System.assertEquals(catalogsProductGroupMultipleCountriesCriteria2.hashCode(), catalogsProductGroupMultipleCountriesCriteria2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsProductGroupMultipleCount catalogsProductGroupMultipleCountriesCriteria1 = OASCatalogsProductGroupMultipleCount.getExample();
        OASCatalogsProductGroupMultipleCount catalogsProductGroupMultipleCountriesCriteria2 = OASCatalogsProductGroupMultipleCount.getExample();
        OASCatalogsProductGroupMultipleCount catalogsProductGroupMultipleCountriesCriteria3 = new OASCatalogsProductGroupMultipleCount();
        OASCatalogsProductGroupMultipleCount catalogsProductGroupMultipleCountriesCriteria4 = new OASCatalogsProductGroupMultipleCount();

        System.assert(catalogsProductGroupMultipleCountriesCriteria1.equals(catalogsProductGroupMultipleCountriesCriteria2));
        System.assert(catalogsProductGroupMultipleCountriesCriteria3.equals(catalogsProductGroupMultipleCountriesCriteria4));
        System.assertEquals(catalogsProductGroupMultipleCountriesCriteria1.hashCode(), catalogsProductGroupMultipleCountriesCriteria2.hashCode());
        System.assertEquals(catalogsProductGroupMultipleCountriesCriteria3.hashCode(), catalogsProductGroupMultipleCountriesCriteria4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCatalogsProductGroupMultipleCount catalogsProductGroupMultipleCountriesCriteria = new OASCatalogsProductGroupMultipleCount();
        System.assertEquals(new List<OASCountry>(), catalogsProductGroupMultipleCountriesCriteria.values);
        System.assertEquals(false, catalogsProductGroupMultipleCountriesCriteria.negated);
    }
}
