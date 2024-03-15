@isTest
private class OASCatalogsProductGroupMultipleStrinTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsProductGroupMultipleStrin catalogsProductGroupMultipleStringListCriteria1 = OASCatalogsProductGroupMultipleStrin.getExample();
        OASCatalogsProductGroupMultipleStrin catalogsProductGroupMultipleStringListCriteria2 = catalogsProductGroupMultipleStringListCriteria1;
        OASCatalogsProductGroupMultipleStrin catalogsProductGroupMultipleStringListCriteria3 = new OASCatalogsProductGroupMultipleStrin();
        OASCatalogsProductGroupMultipleStrin catalogsProductGroupMultipleStringListCriteria4 = catalogsProductGroupMultipleStringListCriteria3;

        System.assert(catalogsProductGroupMultipleStringListCriteria1.equals(catalogsProductGroupMultipleStringListCriteria2));
        System.assert(catalogsProductGroupMultipleStringListCriteria2.equals(catalogsProductGroupMultipleStringListCriteria1));
        System.assert(catalogsProductGroupMultipleStringListCriteria1.equals(catalogsProductGroupMultipleStringListCriteria1));
        System.assert(catalogsProductGroupMultipleStringListCriteria3.equals(catalogsProductGroupMultipleStringListCriteria4));
        System.assert(catalogsProductGroupMultipleStringListCriteria4.equals(catalogsProductGroupMultipleStringListCriteria3));
        System.assert(catalogsProductGroupMultipleStringListCriteria3.equals(catalogsProductGroupMultipleStringListCriteria3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsProductGroupMultipleStrin catalogsProductGroupMultipleStringListCriteria1 = OASCatalogsProductGroupMultipleStrin.getExample();
        OASCatalogsProductGroupMultipleStrin catalogsProductGroupMultipleStringListCriteria2 = OASCatalogsProductGroupMultipleStrin.getExample();
        OASCatalogsProductGroupMultipleStrin catalogsProductGroupMultipleStringListCriteria3 = new OASCatalogsProductGroupMultipleStrin();
        OASCatalogsProductGroupMultipleStrin catalogsProductGroupMultipleStringListCriteria4 = new OASCatalogsProductGroupMultipleStrin();

        System.assert(catalogsProductGroupMultipleStringListCriteria1.equals(catalogsProductGroupMultipleStringListCriteria2));
        System.assert(catalogsProductGroupMultipleStringListCriteria2.equals(catalogsProductGroupMultipleStringListCriteria1));
        System.assert(catalogsProductGroupMultipleStringListCriteria3.equals(catalogsProductGroupMultipleStringListCriteria4));
        System.assert(catalogsProductGroupMultipleStringListCriteria4.equals(catalogsProductGroupMultipleStringListCriteria3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsProductGroupMultipleStrin catalogsProductGroupMultipleStringListCriteria1 = OASCatalogsProductGroupMultipleStrin.getExample();
        OASCatalogsProductGroupMultipleStrin catalogsProductGroupMultipleStringListCriteria2 = new OASCatalogsProductGroupMultipleStrin();

        System.assertEquals(false, catalogsProductGroupMultipleStringListCriteria1.equals('foo'));
        System.assertEquals(false, catalogsProductGroupMultipleStringListCriteria2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsProductGroupMultipleStrin catalogsProductGroupMultipleStringListCriteria1 = OASCatalogsProductGroupMultipleStrin.getExample();
        OASCatalogsProductGroupMultipleStrin catalogsProductGroupMultipleStringListCriteria2 = new OASCatalogsProductGroupMultipleStrin();
        OASCatalogsProductGroupMultipleStrin catalogsProductGroupMultipleStringListCriteria3;

        System.assertEquals(false, catalogsProductGroupMultipleStringListCriteria1.equals(catalogsProductGroupMultipleStringListCriteria3));
        System.assertEquals(false, catalogsProductGroupMultipleStringListCriteria2.equals(catalogsProductGroupMultipleStringListCriteria3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsProductGroupMultipleStrin catalogsProductGroupMultipleStringListCriteria1 = OASCatalogsProductGroupMultipleStrin.getExample();
        OASCatalogsProductGroupMultipleStrin catalogsProductGroupMultipleStringListCriteria2 = new OASCatalogsProductGroupMultipleStrin();

        System.assertEquals(catalogsProductGroupMultipleStringListCriteria1.hashCode(), catalogsProductGroupMultipleStringListCriteria1.hashCode());
        System.assertEquals(catalogsProductGroupMultipleStringListCriteria2.hashCode(), catalogsProductGroupMultipleStringListCriteria2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsProductGroupMultipleStrin catalogsProductGroupMultipleStringListCriteria1 = OASCatalogsProductGroupMultipleStrin.getExample();
        OASCatalogsProductGroupMultipleStrin catalogsProductGroupMultipleStringListCriteria2 = OASCatalogsProductGroupMultipleStrin.getExample();
        OASCatalogsProductGroupMultipleStrin catalogsProductGroupMultipleStringListCriteria3 = new OASCatalogsProductGroupMultipleStrin();
        OASCatalogsProductGroupMultipleStrin catalogsProductGroupMultipleStringListCriteria4 = new OASCatalogsProductGroupMultipleStrin();

        System.assert(catalogsProductGroupMultipleStringListCriteria1.equals(catalogsProductGroupMultipleStringListCriteria2));
        System.assert(catalogsProductGroupMultipleStringListCriteria3.equals(catalogsProductGroupMultipleStringListCriteria4));
        System.assertEquals(catalogsProductGroupMultipleStringListCriteria1.hashCode(), catalogsProductGroupMultipleStringListCriteria2.hashCode());
        System.assertEquals(catalogsProductGroupMultipleStringListCriteria3.hashCode(), catalogsProductGroupMultipleStringListCriteria4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCatalogsProductGroupMultipleStrin catalogsProductGroupMultipleStringListCriteria = new OASCatalogsProductGroupMultipleStrin();
        System.assertEquals(new List<List<String>>(), catalogsProductGroupMultipleStringListCriteria.values);
        System.assertEquals(false, catalogsProductGroupMultipleStringListCriteria.negated);
    }
}
