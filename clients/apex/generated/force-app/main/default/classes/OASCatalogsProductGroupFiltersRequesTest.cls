@isTest
private class OASCatalogsProductGroupFiltersRequesTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsProductGroupFiltersReques catalogsProductGroupFiltersRequestAnyOf11 = OASCatalogsProductGroupFiltersReques.getExample();
        OASCatalogsProductGroupFiltersReques catalogsProductGroupFiltersRequestAnyOf12 = catalogsProductGroupFiltersRequestAnyOf11;
        OASCatalogsProductGroupFiltersReques catalogsProductGroupFiltersRequestAnyOf13 = new OASCatalogsProductGroupFiltersReques();
        OASCatalogsProductGroupFiltersReques catalogsProductGroupFiltersRequestAnyOf14 = catalogsProductGroupFiltersRequestAnyOf13;

        System.assert(catalogsProductGroupFiltersRequestAnyOf11.equals(catalogsProductGroupFiltersRequestAnyOf12));
        System.assert(catalogsProductGroupFiltersRequestAnyOf12.equals(catalogsProductGroupFiltersRequestAnyOf11));
        System.assert(catalogsProductGroupFiltersRequestAnyOf11.equals(catalogsProductGroupFiltersRequestAnyOf11));
        System.assert(catalogsProductGroupFiltersRequestAnyOf13.equals(catalogsProductGroupFiltersRequestAnyOf14));
        System.assert(catalogsProductGroupFiltersRequestAnyOf14.equals(catalogsProductGroupFiltersRequestAnyOf13));
        System.assert(catalogsProductGroupFiltersRequestAnyOf13.equals(catalogsProductGroupFiltersRequestAnyOf13));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsProductGroupFiltersReques catalogsProductGroupFiltersRequestAnyOf11 = OASCatalogsProductGroupFiltersReques.getExample();
        OASCatalogsProductGroupFiltersReques catalogsProductGroupFiltersRequestAnyOf12 = OASCatalogsProductGroupFiltersReques.getExample();
        OASCatalogsProductGroupFiltersReques catalogsProductGroupFiltersRequestAnyOf13 = new OASCatalogsProductGroupFiltersReques();
        OASCatalogsProductGroupFiltersReques catalogsProductGroupFiltersRequestAnyOf14 = new OASCatalogsProductGroupFiltersReques();

        System.assert(catalogsProductGroupFiltersRequestAnyOf11.equals(catalogsProductGroupFiltersRequestAnyOf12));
        System.assert(catalogsProductGroupFiltersRequestAnyOf12.equals(catalogsProductGroupFiltersRequestAnyOf11));
        System.assert(catalogsProductGroupFiltersRequestAnyOf13.equals(catalogsProductGroupFiltersRequestAnyOf14));
        System.assert(catalogsProductGroupFiltersRequestAnyOf14.equals(catalogsProductGroupFiltersRequestAnyOf13));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsProductGroupFiltersReques catalogsProductGroupFiltersRequestAnyOf11 = OASCatalogsProductGroupFiltersReques.getExample();
        OASCatalogsProductGroupFiltersReques catalogsProductGroupFiltersRequestAnyOf12 = new OASCatalogsProductGroupFiltersReques();

        System.assertEquals(false, catalogsProductGroupFiltersRequestAnyOf11.equals('foo'));
        System.assertEquals(false, catalogsProductGroupFiltersRequestAnyOf12.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsProductGroupFiltersReques catalogsProductGroupFiltersRequestAnyOf11 = OASCatalogsProductGroupFiltersReques.getExample();
        OASCatalogsProductGroupFiltersReques catalogsProductGroupFiltersRequestAnyOf12 = new OASCatalogsProductGroupFiltersReques();
        OASCatalogsProductGroupFiltersReques catalogsProductGroupFiltersRequestAnyOf13;

        System.assertEquals(false, catalogsProductGroupFiltersRequestAnyOf11.equals(catalogsProductGroupFiltersRequestAnyOf13));
        System.assertEquals(false, catalogsProductGroupFiltersRequestAnyOf12.equals(catalogsProductGroupFiltersRequestAnyOf13));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsProductGroupFiltersReques catalogsProductGroupFiltersRequestAnyOf11 = OASCatalogsProductGroupFiltersReques.getExample();
        OASCatalogsProductGroupFiltersReques catalogsProductGroupFiltersRequestAnyOf12 = new OASCatalogsProductGroupFiltersReques();

        System.assertEquals(catalogsProductGroupFiltersRequestAnyOf11.hashCode(), catalogsProductGroupFiltersRequestAnyOf11.hashCode());
        System.assertEquals(catalogsProductGroupFiltersRequestAnyOf12.hashCode(), catalogsProductGroupFiltersRequestAnyOf12.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsProductGroupFiltersReques catalogsProductGroupFiltersRequestAnyOf11 = OASCatalogsProductGroupFiltersReques.getExample();
        OASCatalogsProductGroupFiltersReques catalogsProductGroupFiltersRequestAnyOf12 = OASCatalogsProductGroupFiltersReques.getExample();
        OASCatalogsProductGroupFiltersReques catalogsProductGroupFiltersRequestAnyOf13 = new OASCatalogsProductGroupFiltersReques();
        OASCatalogsProductGroupFiltersReques catalogsProductGroupFiltersRequestAnyOf14 = new OASCatalogsProductGroupFiltersReques();

        System.assert(catalogsProductGroupFiltersRequestAnyOf11.equals(catalogsProductGroupFiltersRequestAnyOf12));
        System.assert(catalogsProductGroupFiltersRequestAnyOf13.equals(catalogsProductGroupFiltersRequestAnyOf14));
        System.assertEquals(catalogsProductGroupFiltersRequestAnyOf11.hashCode(), catalogsProductGroupFiltersRequestAnyOf12.hashCode());
        System.assertEquals(catalogsProductGroupFiltersRequestAnyOf13.hashCode(), catalogsProductGroupFiltersRequestAnyOf14.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsProductGroupFiltersReques catalogsProductGroupFiltersRequestAnyOf1 = new OASCatalogsProductGroupFiltersReques();
        Map<String, String> x-property-mappings = catalogsProductGroupFiltersRequestAnyOf1.getx-property-mappings();
        System.assertEquals('allOf', x-property-mappings.get('all_of'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCatalogsProductGroupFiltersReques catalogsProductGroupFiltersRequestAnyOf1 = new OASCatalogsProductGroupFiltersReques();
        System.assertEquals(new List<OASCatalogsProductGroupFilterKeys>(), catalogsProductGroupFiltersRequestAnyOf1.allOf);
    }
}
