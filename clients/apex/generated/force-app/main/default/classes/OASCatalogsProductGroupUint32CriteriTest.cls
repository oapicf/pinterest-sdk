@isTest
private class OASCatalogsProductGroupUint32CriteriTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsProductGroupUint32Criteri catalogsProductGroupUint32Criteria1 = OASCatalogsProductGroupUint32Criteri.getExample();
        OASCatalogsProductGroupUint32Criteri catalogsProductGroupUint32Criteria2 = catalogsProductGroupUint32Criteria1;
        OASCatalogsProductGroupUint32Criteri catalogsProductGroupUint32Criteria3 = new OASCatalogsProductGroupUint32Criteri();
        OASCatalogsProductGroupUint32Criteri catalogsProductGroupUint32Criteria4 = catalogsProductGroupUint32Criteria3;

        System.assert(catalogsProductGroupUint32Criteria1.equals(catalogsProductGroupUint32Criteria2));
        System.assert(catalogsProductGroupUint32Criteria2.equals(catalogsProductGroupUint32Criteria1));
        System.assert(catalogsProductGroupUint32Criteria1.equals(catalogsProductGroupUint32Criteria1));
        System.assert(catalogsProductGroupUint32Criteria3.equals(catalogsProductGroupUint32Criteria4));
        System.assert(catalogsProductGroupUint32Criteria4.equals(catalogsProductGroupUint32Criteria3));
        System.assert(catalogsProductGroupUint32Criteria3.equals(catalogsProductGroupUint32Criteria3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsProductGroupUint32Criteri catalogsProductGroupUint32Criteria1 = OASCatalogsProductGroupUint32Criteri.getExample();
        OASCatalogsProductGroupUint32Criteri catalogsProductGroupUint32Criteria2 = OASCatalogsProductGroupUint32Criteri.getExample();
        OASCatalogsProductGroupUint32Criteri catalogsProductGroupUint32Criteria3 = new OASCatalogsProductGroupUint32Criteri();
        OASCatalogsProductGroupUint32Criteri catalogsProductGroupUint32Criteria4 = new OASCatalogsProductGroupUint32Criteri();

        System.assert(catalogsProductGroupUint32Criteria1.equals(catalogsProductGroupUint32Criteria2));
        System.assert(catalogsProductGroupUint32Criteria2.equals(catalogsProductGroupUint32Criteria1));
        System.assert(catalogsProductGroupUint32Criteria3.equals(catalogsProductGroupUint32Criteria4));
        System.assert(catalogsProductGroupUint32Criteria4.equals(catalogsProductGroupUint32Criteria3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsProductGroupUint32Criteri catalogsProductGroupUint32Criteria1 = OASCatalogsProductGroupUint32Criteri.getExample();
        OASCatalogsProductGroupUint32Criteri catalogsProductGroupUint32Criteria2 = new OASCatalogsProductGroupUint32Criteri();

        System.assertEquals(false, catalogsProductGroupUint32Criteria1.equals('foo'));
        System.assertEquals(false, catalogsProductGroupUint32Criteria2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsProductGroupUint32Criteri catalogsProductGroupUint32Criteria1 = OASCatalogsProductGroupUint32Criteri.getExample();
        OASCatalogsProductGroupUint32Criteri catalogsProductGroupUint32Criteria2 = new OASCatalogsProductGroupUint32Criteri();
        OASCatalogsProductGroupUint32Criteri catalogsProductGroupUint32Criteria3;

        System.assertEquals(false, catalogsProductGroupUint32Criteria1.equals(catalogsProductGroupUint32Criteria3));
        System.assertEquals(false, catalogsProductGroupUint32Criteria2.equals(catalogsProductGroupUint32Criteria3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsProductGroupUint32Criteri catalogsProductGroupUint32Criteria1 = OASCatalogsProductGroupUint32Criteri.getExample();
        OASCatalogsProductGroupUint32Criteri catalogsProductGroupUint32Criteria2 = new OASCatalogsProductGroupUint32Criteri();

        System.assertEquals(catalogsProductGroupUint32Criteria1.hashCode(), catalogsProductGroupUint32Criteria1.hashCode());
        System.assertEquals(catalogsProductGroupUint32Criteria2.hashCode(), catalogsProductGroupUint32Criteria2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsProductGroupUint32Criteri catalogsProductGroupUint32Criteria1 = OASCatalogsProductGroupUint32Criteri.getExample();
        OASCatalogsProductGroupUint32Criteri catalogsProductGroupUint32Criteria2 = OASCatalogsProductGroupUint32Criteri.getExample();
        OASCatalogsProductGroupUint32Criteri catalogsProductGroupUint32Criteria3 = new OASCatalogsProductGroupUint32Criteri();
        OASCatalogsProductGroupUint32Criteri catalogsProductGroupUint32Criteria4 = new OASCatalogsProductGroupUint32Criteri();

        System.assert(catalogsProductGroupUint32Criteria1.equals(catalogsProductGroupUint32Criteria2));
        System.assert(catalogsProductGroupUint32Criteria3.equals(catalogsProductGroupUint32Criteria4));
        System.assertEquals(catalogsProductGroupUint32Criteria1.hashCode(), catalogsProductGroupUint32Criteria2.hashCode());
        System.assertEquals(catalogsProductGroupUint32Criteria3.hashCode(), catalogsProductGroupUint32Criteria4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCatalogsProductGroupUint32Criteri catalogsProductGroupUint32Criteria = new OASCatalogsProductGroupUint32Criteri();
        System.assertEquals(false, catalogsProductGroupUint32Criteria.negated);
        System.assertEquals(null, catalogsProductGroupUint32Criteria.operator);
        System.assertEquals(null, catalogsProductGroupUint32Criteria.value);
    }
}
