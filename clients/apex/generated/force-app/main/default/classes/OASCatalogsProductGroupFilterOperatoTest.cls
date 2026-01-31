@isTest
private class OASCatalogsProductGroupFilterOperatoTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsProductGroupFilterOperato catalogsProductGroupFilterOperatorTypeCriteria1 = OASCatalogsProductGroupFilterOperato.getExample();
        OASCatalogsProductGroupFilterOperato catalogsProductGroupFilterOperatorTypeCriteria2 = catalogsProductGroupFilterOperatorTypeCriteria1;
        OASCatalogsProductGroupFilterOperato catalogsProductGroupFilterOperatorTypeCriteria3 = new OASCatalogsProductGroupFilterOperato();
        OASCatalogsProductGroupFilterOperato catalogsProductGroupFilterOperatorTypeCriteria4 = catalogsProductGroupFilterOperatorTypeCriteria3;

        System.assert(catalogsProductGroupFilterOperatorTypeCriteria1.equals(catalogsProductGroupFilterOperatorTypeCriteria2));
        System.assert(catalogsProductGroupFilterOperatorTypeCriteria2.equals(catalogsProductGroupFilterOperatorTypeCriteria1));
        System.assert(catalogsProductGroupFilterOperatorTypeCriteria1.equals(catalogsProductGroupFilterOperatorTypeCriteria1));
        System.assert(catalogsProductGroupFilterOperatorTypeCriteria3.equals(catalogsProductGroupFilterOperatorTypeCriteria4));
        System.assert(catalogsProductGroupFilterOperatorTypeCriteria4.equals(catalogsProductGroupFilterOperatorTypeCriteria3));
        System.assert(catalogsProductGroupFilterOperatorTypeCriteria3.equals(catalogsProductGroupFilterOperatorTypeCriteria3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsProductGroupFilterOperato catalogsProductGroupFilterOperatorTypeCriteria1 = OASCatalogsProductGroupFilterOperato.getExample();
        OASCatalogsProductGroupFilterOperato catalogsProductGroupFilterOperatorTypeCriteria2 = OASCatalogsProductGroupFilterOperato.getExample();
        OASCatalogsProductGroupFilterOperato catalogsProductGroupFilterOperatorTypeCriteria3 = new OASCatalogsProductGroupFilterOperato();
        OASCatalogsProductGroupFilterOperato catalogsProductGroupFilterOperatorTypeCriteria4 = new OASCatalogsProductGroupFilterOperato();

        System.assert(catalogsProductGroupFilterOperatorTypeCriteria1.equals(catalogsProductGroupFilterOperatorTypeCriteria2));
        System.assert(catalogsProductGroupFilterOperatorTypeCriteria2.equals(catalogsProductGroupFilterOperatorTypeCriteria1));
        System.assert(catalogsProductGroupFilterOperatorTypeCriteria3.equals(catalogsProductGroupFilterOperatorTypeCriteria4));
        System.assert(catalogsProductGroupFilterOperatorTypeCriteria4.equals(catalogsProductGroupFilterOperatorTypeCriteria3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsProductGroupFilterOperato catalogsProductGroupFilterOperatorTypeCriteria1 = OASCatalogsProductGroupFilterOperato.getExample();
        OASCatalogsProductGroupFilterOperato catalogsProductGroupFilterOperatorTypeCriteria2 = new OASCatalogsProductGroupFilterOperato();

        System.assertEquals(false, catalogsProductGroupFilterOperatorTypeCriteria1.equals('foo'));
        System.assertEquals(false, catalogsProductGroupFilterOperatorTypeCriteria2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsProductGroupFilterOperato catalogsProductGroupFilterOperatorTypeCriteria1 = OASCatalogsProductGroupFilterOperato.getExample();
        OASCatalogsProductGroupFilterOperato catalogsProductGroupFilterOperatorTypeCriteria2 = new OASCatalogsProductGroupFilterOperato();
        OASCatalogsProductGroupFilterOperato catalogsProductGroupFilterOperatorTypeCriteria3;

        System.assertEquals(false, catalogsProductGroupFilterOperatorTypeCriteria1.equals(catalogsProductGroupFilterOperatorTypeCriteria3));
        System.assertEquals(false, catalogsProductGroupFilterOperatorTypeCriteria2.equals(catalogsProductGroupFilterOperatorTypeCriteria3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsProductGroupFilterOperato catalogsProductGroupFilterOperatorTypeCriteria1 = OASCatalogsProductGroupFilterOperato.getExample();
        OASCatalogsProductGroupFilterOperato catalogsProductGroupFilterOperatorTypeCriteria2 = new OASCatalogsProductGroupFilterOperato();

        System.assertEquals(catalogsProductGroupFilterOperatorTypeCriteria1.hashCode(), catalogsProductGroupFilterOperatorTypeCriteria1.hashCode());
        System.assertEquals(catalogsProductGroupFilterOperatorTypeCriteria2.hashCode(), catalogsProductGroupFilterOperatorTypeCriteria2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsProductGroupFilterOperato catalogsProductGroupFilterOperatorTypeCriteria1 = OASCatalogsProductGroupFilterOperato.getExample();
        OASCatalogsProductGroupFilterOperato catalogsProductGroupFilterOperatorTypeCriteria2 = OASCatalogsProductGroupFilterOperato.getExample();
        OASCatalogsProductGroupFilterOperato catalogsProductGroupFilterOperatorTypeCriteria3 = new OASCatalogsProductGroupFilterOperato();
        OASCatalogsProductGroupFilterOperato catalogsProductGroupFilterOperatorTypeCriteria4 = new OASCatalogsProductGroupFilterOperato();

        System.assert(catalogsProductGroupFilterOperatorTypeCriteria1.equals(catalogsProductGroupFilterOperatorTypeCriteria2));
        System.assert(catalogsProductGroupFilterOperatorTypeCriteria3.equals(catalogsProductGroupFilterOperatorTypeCriteria4));
        System.assertEquals(catalogsProductGroupFilterOperatorTypeCriteria1.hashCode(), catalogsProductGroupFilterOperatorTypeCriteria2.hashCode());
        System.assertEquals(catalogsProductGroupFilterOperatorTypeCriteria3.hashCode(), catalogsProductGroupFilterOperatorTypeCriteria4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsProductGroupFilterOperato catalogsProductGroupFilterOperatorTypeCriteria = new OASCatalogsProductGroupFilterOperato();
        Map<String, String> x-property-mappings = catalogsProductGroupFilterOperatorTypeCriteria.getx-property-mappings();
        System.assertEquals('filterOperatorType', x-property-mappings.get('filter_operator_type'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCatalogsProductGroupFilterOperato catalogsProductGroupFilterOperatorTypeCriteria = new OASCatalogsProductGroupFilterOperato();
        System.assertEquals(FilterOperatorTypeEnum.IS, catalogsProductGroupFilterOperatorTypeCriteria.filterOperatorType);
        System.assertEquals(false, catalogsProductGroupFilterOperatorTypeCriteria.negated);
        System.assertEquals(new List<String>(), catalogsProductGroupFilterOperatorTypeCriteria.values);
    }
}
