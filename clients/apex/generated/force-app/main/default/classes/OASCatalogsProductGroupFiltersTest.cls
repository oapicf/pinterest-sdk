@isTest
private class OASCatalogsProductGroupFiltersTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsProductGroupFilters catalogsProductGroupFilters1 = OASCatalogsProductGroupFilters.getExample();
        OASCatalogsProductGroupFilters catalogsProductGroupFilters2 = catalogsProductGroupFilters1;
        OASCatalogsProductGroupFilters catalogsProductGroupFilters3 = new OASCatalogsProductGroupFilters();
        OASCatalogsProductGroupFilters catalogsProductGroupFilters4 = catalogsProductGroupFilters3;

        System.assert(catalogsProductGroupFilters1.equals(catalogsProductGroupFilters2));
        System.assert(catalogsProductGroupFilters2.equals(catalogsProductGroupFilters1));
        System.assert(catalogsProductGroupFilters1.equals(catalogsProductGroupFilters1));
        System.assert(catalogsProductGroupFilters3.equals(catalogsProductGroupFilters4));
        System.assert(catalogsProductGroupFilters4.equals(catalogsProductGroupFilters3));
        System.assert(catalogsProductGroupFilters3.equals(catalogsProductGroupFilters3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsProductGroupFilters catalogsProductGroupFilters1 = OASCatalogsProductGroupFilters.getExample();
        OASCatalogsProductGroupFilters catalogsProductGroupFilters2 = OASCatalogsProductGroupFilters.getExample();
        OASCatalogsProductGroupFilters catalogsProductGroupFilters3 = new OASCatalogsProductGroupFilters();
        OASCatalogsProductGroupFilters catalogsProductGroupFilters4 = new OASCatalogsProductGroupFilters();

        System.assert(catalogsProductGroupFilters1.equals(catalogsProductGroupFilters2));
        System.assert(catalogsProductGroupFilters2.equals(catalogsProductGroupFilters1));
        System.assert(catalogsProductGroupFilters3.equals(catalogsProductGroupFilters4));
        System.assert(catalogsProductGroupFilters4.equals(catalogsProductGroupFilters3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsProductGroupFilters catalogsProductGroupFilters1 = OASCatalogsProductGroupFilters.getExample();
        OASCatalogsProductGroupFilters catalogsProductGroupFilters2 = new OASCatalogsProductGroupFilters();

        System.assertEquals(false, catalogsProductGroupFilters1.equals('foo'));
        System.assertEquals(false, catalogsProductGroupFilters2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsProductGroupFilters catalogsProductGroupFilters1 = OASCatalogsProductGroupFilters.getExample();
        OASCatalogsProductGroupFilters catalogsProductGroupFilters2 = new OASCatalogsProductGroupFilters();
        OASCatalogsProductGroupFilters catalogsProductGroupFilters3;

        System.assertEquals(false, catalogsProductGroupFilters1.equals(catalogsProductGroupFilters3));
        System.assertEquals(false, catalogsProductGroupFilters2.equals(catalogsProductGroupFilters3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsProductGroupFilters catalogsProductGroupFilters1 = OASCatalogsProductGroupFilters.getExample();
        OASCatalogsProductGroupFilters catalogsProductGroupFilters2 = new OASCatalogsProductGroupFilters();

        System.assertEquals(catalogsProductGroupFilters1.hashCode(), catalogsProductGroupFilters1.hashCode());
        System.assertEquals(catalogsProductGroupFilters2.hashCode(), catalogsProductGroupFilters2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsProductGroupFilters catalogsProductGroupFilters1 = OASCatalogsProductGroupFilters.getExample();
        OASCatalogsProductGroupFilters catalogsProductGroupFilters2 = OASCatalogsProductGroupFilters.getExample();
        OASCatalogsProductGroupFilters catalogsProductGroupFilters3 = new OASCatalogsProductGroupFilters();
        OASCatalogsProductGroupFilters catalogsProductGroupFilters4 = new OASCatalogsProductGroupFilters();

        System.assert(catalogsProductGroupFilters1.equals(catalogsProductGroupFilters2));
        System.assert(catalogsProductGroupFilters3.equals(catalogsProductGroupFilters4));
        System.assertEquals(catalogsProductGroupFilters1.hashCode(), catalogsProductGroupFilters2.hashCode());
        System.assertEquals(catalogsProductGroupFilters3.hashCode(), catalogsProductGroupFilters4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsProductGroupFilters catalogsProductGroupFilters = new OASCatalogsProductGroupFilters();
        Map<String, String> x-property-mappings = catalogsProductGroupFilters.getx-property-mappings();
        System.assertEquals('anyOf', x-property-mappings.get('any_of'));
        System.assertEquals('allOf', x-property-mappings.get('all_of'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCatalogsProductGroupFilters catalogsProductGroupFilters = new OASCatalogsProductGroupFilters();
        System.assertEquals(new List<OASCatalogsProductGroupFilterKeys>(), catalogsProductGroupFilters.anyOf);
        System.assertEquals(new List<OASCatalogsProductGroupFilterKeys>(), catalogsProductGroupFilters.allOf);
    }
}
