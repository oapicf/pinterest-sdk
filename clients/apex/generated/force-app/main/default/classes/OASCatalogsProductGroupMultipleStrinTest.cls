@isTest
private class OASCatalogsProductGroupMultipleStrinTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsProductGroupMultipleStrin catalogsProductGroupMultipleStringCriteria1 = OASCatalogsProductGroupMultipleStrin.getExample();
        OASCatalogsProductGroupMultipleStrin catalogsProductGroupMultipleStringCriteria2 = catalogsProductGroupMultipleStringCriteria1;
        OASCatalogsProductGroupMultipleStrin catalogsProductGroupMultipleStringCriteria3 = new OASCatalogsProductGroupMultipleStrin();
        OASCatalogsProductGroupMultipleStrin catalogsProductGroupMultipleStringCriteria4 = catalogsProductGroupMultipleStringCriteria3;

        System.assert(catalogsProductGroupMultipleStringCriteria1.equals(catalogsProductGroupMultipleStringCriteria2));
        System.assert(catalogsProductGroupMultipleStringCriteria2.equals(catalogsProductGroupMultipleStringCriteria1));
        System.assert(catalogsProductGroupMultipleStringCriteria1.equals(catalogsProductGroupMultipleStringCriteria1));
        System.assert(catalogsProductGroupMultipleStringCriteria3.equals(catalogsProductGroupMultipleStringCriteria4));
        System.assert(catalogsProductGroupMultipleStringCriteria4.equals(catalogsProductGroupMultipleStringCriteria3));
        System.assert(catalogsProductGroupMultipleStringCriteria3.equals(catalogsProductGroupMultipleStringCriteria3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsProductGroupMultipleStrin catalogsProductGroupMultipleStringCriteria1 = OASCatalogsProductGroupMultipleStrin.getExample();
        OASCatalogsProductGroupMultipleStrin catalogsProductGroupMultipleStringCriteria2 = OASCatalogsProductGroupMultipleStrin.getExample();
        OASCatalogsProductGroupMultipleStrin catalogsProductGroupMultipleStringCriteria3 = new OASCatalogsProductGroupMultipleStrin();
        OASCatalogsProductGroupMultipleStrin catalogsProductGroupMultipleStringCriteria4 = new OASCatalogsProductGroupMultipleStrin();

        System.assert(catalogsProductGroupMultipleStringCriteria1.equals(catalogsProductGroupMultipleStringCriteria2));
        System.assert(catalogsProductGroupMultipleStringCriteria2.equals(catalogsProductGroupMultipleStringCriteria1));
        System.assert(catalogsProductGroupMultipleStringCriteria3.equals(catalogsProductGroupMultipleStringCriteria4));
        System.assert(catalogsProductGroupMultipleStringCriteria4.equals(catalogsProductGroupMultipleStringCriteria3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsProductGroupMultipleStrin catalogsProductGroupMultipleStringCriteria1 = OASCatalogsProductGroupMultipleStrin.getExample();
        OASCatalogsProductGroupMultipleStrin catalogsProductGroupMultipleStringCriteria2 = new OASCatalogsProductGroupMultipleStrin();

        System.assertEquals(false, catalogsProductGroupMultipleStringCriteria1.equals('foo'));
        System.assertEquals(false, catalogsProductGroupMultipleStringCriteria2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsProductGroupMultipleStrin catalogsProductGroupMultipleStringCriteria1 = OASCatalogsProductGroupMultipleStrin.getExample();
        OASCatalogsProductGroupMultipleStrin catalogsProductGroupMultipleStringCriteria2 = new OASCatalogsProductGroupMultipleStrin();
        OASCatalogsProductGroupMultipleStrin catalogsProductGroupMultipleStringCriteria3;

        System.assertEquals(false, catalogsProductGroupMultipleStringCriteria1.equals(catalogsProductGroupMultipleStringCriteria3));
        System.assertEquals(false, catalogsProductGroupMultipleStringCriteria2.equals(catalogsProductGroupMultipleStringCriteria3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsProductGroupMultipleStrin catalogsProductGroupMultipleStringCriteria1 = OASCatalogsProductGroupMultipleStrin.getExample();
        OASCatalogsProductGroupMultipleStrin catalogsProductGroupMultipleStringCriteria2 = new OASCatalogsProductGroupMultipleStrin();

        System.assertEquals(catalogsProductGroupMultipleStringCriteria1.hashCode(), catalogsProductGroupMultipleStringCriteria1.hashCode());
        System.assertEquals(catalogsProductGroupMultipleStringCriteria2.hashCode(), catalogsProductGroupMultipleStringCriteria2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsProductGroupMultipleStrin catalogsProductGroupMultipleStringCriteria1 = OASCatalogsProductGroupMultipleStrin.getExample();
        OASCatalogsProductGroupMultipleStrin catalogsProductGroupMultipleStringCriteria2 = OASCatalogsProductGroupMultipleStrin.getExample();
        OASCatalogsProductGroupMultipleStrin catalogsProductGroupMultipleStringCriteria3 = new OASCatalogsProductGroupMultipleStrin();
        OASCatalogsProductGroupMultipleStrin catalogsProductGroupMultipleStringCriteria4 = new OASCatalogsProductGroupMultipleStrin();

        System.assert(catalogsProductGroupMultipleStringCriteria1.equals(catalogsProductGroupMultipleStringCriteria2));
        System.assert(catalogsProductGroupMultipleStringCriteria3.equals(catalogsProductGroupMultipleStringCriteria4));
        System.assertEquals(catalogsProductGroupMultipleStringCriteria1.hashCode(), catalogsProductGroupMultipleStringCriteria2.hashCode());
        System.assertEquals(catalogsProductGroupMultipleStringCriteria3.hashCode(), catalogsProductGroupMultipleStringCriteria4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCatalogsProductGroupMultipleStrin catalogsProductGroupMultipleStringCriteria = new OASCatalogsProductGroupMultipleStrin();
        System.assertEquals(new List<String>(), catalogsProductGroupMultipleStringCriteria.values);
        System.assertEquals(null, catalogsProductGroupMultipleStringCriteria.negated);
    }
}
