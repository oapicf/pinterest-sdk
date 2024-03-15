@isTest
private class OASCatalogsProductGroupMultipleGendeTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsProductGroupMultipleGende catalogsProductGroupMultipleGenderCriteria1 = OASCatalogsProductGroupMultipleGende.getExample();
        OASCatalogsProductGroupMultipleGende catalogsProductGroupMultipleGenderCriteria2 = catalogsProductGroupMultipleGenderCriteria1;
        OASCatalogsProductGroupMultipleGende catalogsProductGroupMultipleGenderCriteria3 = new OASCatalogsProductGroupMultipleGende();
        OASCatalogsProductGroupMultipleGende catalogsProductGroupMultipleGenderCriteria4 = catalogsProductGroupMultipleGenderCriteria3;

        System.assert(catalogsProductGroupMultipleGenderCriteria1.equals(catalogsProductGroupMultipleGenderCriteria2));
        System.assert(catalogsProductGroupMultipleGenderCriteria2.equals(catalogsProductGroupMultipleGenderCriteria1));
        System.assert(catalogsProductGroupMultipleGenderCriteria1.equals(catalogsProductGroupMultipleGenderCriteria1));
        System.assert(catalogsProductGroupMultipleGenderCriteria3.equals(catalogsProductGroupMultipleGenderCriteria4));
        System.assert(catalogsProductGroupMultipleGenderCriteria4.equals(catalogsProductGroupMultipleGenderCriteria3));
        System.assert(catalogsProductGroupMultipleGenderCriteria3.equals(catalogsProductGroupMultipleGenderCriteria3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsProductGroupMultipleGende catalogsProductGroupMultipleGenderCriteria1 = OASCatalogsProductGroupMultipleGende.getExample();
        OASCatalogsProductGroupMultipleGende catalogsProductGroupMultipleGenderCriteria2 = OASCatalogsProductGroupMultipleGende.getExample();
        OASCatalogsProductGroupMultipleGende catalogsProductGroupMultipleGenderCriteria3 = new OASCatalogsProductGroupMultipleGende();
        OASCatalogsProductGroupMultipleGende catalogsProductGroupMultipleGenderCriteria4 = new OASCatalogsProductGroupMultipleGende();

        System.assert(catalogsProductGroupMultipleGenderCriteria1.equals(catalogsProductGroupMultipleGenderCriteria2));
        System.assert(catalogsProductGroupMultipleGenderCriteria2.equals(catalogsProductGroupMultipleGenderCriteria1));
        System.assert(catalogsProductGroupMultipleGenderCriteria3.equals(catalogsProductGroupMultipleGenderCriteria4));
        System.assert(catalogsProductGroupMultipleGenderCriteria4.equals(catalogsProductGroupMultipleGenderCriteria3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsProductGroupMultipleGende catalogsProductGroupMultipleGenderCriteria1 = OASCatalogsProductGroupMultipleGende.getExample();
        OASCatalogsProductGroupMultipleGende catalogsProductGroupMultipleGenderCriteria2 = new OASCatalogsProductGroupMultipleGende();

        System.assertEquals(false, catalogsProductGroupMultipleGenderCriteria1.equals('foo'));
        System.assertEquals(false, catalogsProductGroupMultipleGenderCriteria2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsProductGroupMultipleGende catalogsProductGroupMultipleGenderCriteria1 = OASCatalogsProductGroupMultipleGende.getExample();
        OASCatalogsProductGroupMultipleGende catalogsProductGroupMultipleGenderCriteria2 = new OASCatalogsProductGroupMultipleGende();
        OASCatalogsProductGroupMultipleGende catalogsProductGroupMultipleGenderCriteria3;

        System.assertEquals(false, catalogsProductGroupMultipleGenderCriteria1.equals(catalogsProductGroupMultipleGenderCriteria3));
        System.assertEquals(false, catalogsProductGroupMultipleGenderCriteria2.equals(catalogsProductGroupMultipleGenderCriteria3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsProductGroupMultipleGende catalogsProductGroupMultipleGenderCriteria1 = OASCatalogsProductGroupMultipleGende.getExample();
        OASCatalogsProductGroupMultipleGende catalogsProductGroupMultipleGenderCriteria2 = new OASCatalogsProductGroupMultipleGende();

        System.assertEquals(catalogsProductGroupMultipleGenderCriteria1.hashCode(), catalogsProductGroupMultipleGenderCriteria1.hashCode());
        System.assertEquals(catalogsProductGroupMultipleGenderCriteria2.hashCode(), catalogsProductGroupMultipleGenderCriteria2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsProductGroupMultipleGende catalogsProductGroupMultipleGenderCriteria1 = OASCatalogsProductGroupMultipleGende.getExample();
        OASCatalogsProductGroupMultipleGende catalogsProductGroupMultipleGenderCriteria2 = OASCatalogsProductGroupMultipleGende.getExample();
        OASCatalogsProductGroupMultipleGende catalogsProductGroupMultipleGenderCriteria3 = new OASCatalogsProductGroupMultipleGende();
        OASCatalogsProductGroupMultipleGende catalogsProductGroupMultipleGenderCriteria4 = new OASCatalogsProductGroupMultipleGende();

        System.assert(catalogsProductGroupMultipleGenderCriteria1.equals(catalogsProductGroupMultipleGenderCriteria2));
        System.assert(catalogsProductGroupMultipleGenderCriteria3.equals(catalogsProductGroupMultipleGenderCriteria4));
        System.assertEquals(catalogsProductGroupMultipleGenderCriteria1.hashCode(), catalogsProductGroupMultipleGenderCriteria2.hashCode());
        System.assertEquals(catalogsProductGroupMultipleGenderCriteria3.hashCode(), catalogsProductGroupMultipleGenderCriteria4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCatalogsProductGroupMultipleGende catalogsProductGroupMultipleGenderCriteria = new OASCatalogsProductGroupMultipleGende();
        System.assertEquals(new List<OASGender>(), catalogsProductGroupMultipleGenderCriteria.values);
        System.assertEquals(false, catalogsProductGroupMultipleGenderCriteria.negated);
    }
}
