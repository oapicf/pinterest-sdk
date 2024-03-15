@isTest
private class OASCatalogsHotelProductGroupFiltersTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsHotelProductGroupFilters catalogsHotelProductGroupFilters1 = OASCatalogsHotelProductGroupFilters.getExample();
        OASCatalogsHotelProductGroupFilters catalogsHotelProductGroupFilters2 = catalogsHotelProductGroupFilters1;
        OASCatalogsHotelProductGroupFilters catalogsHotelProductGroupFilters3 = new OASCatalogsHotelProductGroupFilters();
        OASCatalogsHotelProductGroupFilters catalogsHotelProductGroupFilters4 = catalogsHotelProductGroupFilters3;

        System.assert(catalogsHotelProductGroupFilters1.equals(catalogsHotelProductGroupFilters2));
        System.assert(catalogsHotelProductGroupFilters2.equals(catalogsHotelProductGroupFilters1));
        System.assert(catalogsHotelProductGroupFilters1.equals(catalogsHotelProductGroupFilters1));
        System.assert(catalogsHotelProductGroupFilters3.equals(catalogsHotelProductGroupFilters4));
        System.assert(catalogsHotelProductGroupFilters4.equals(catalogsHotelProductGroupFilters3));
        System.assert(catalogsHotelProductGroupFilters3.equals(catalogsHotelProductGroupFilters3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsHotelProductGroupFilters catalogsHotelProductGroupFilters1 = OASCatalogsHotelProductGroupFilters.getExample();
        OASCatalogsHotelProductGroupFilters catalogsHotelProductGroupFilters2 = OASCatalogsHotelProductGroupFilters.getExample();
        OASCatalogsHotelProductGroupFilters catalogsHotelProductGroupFilters3 = new OASCatalogsHotelProductGroupFilters();
        OASCatalogsHotelProductGroupFilters catalogsHotelProductGroupFilters4 = new OASCatalogsHotelProductGroupFilters();

        System.assert(catalogsHotelProductGroupFilters1.equals(catalogsHotelProductGroupFilters2));
        System.assert(catalogsHotelProductGroupFilters2.equals(catalogsHotelProductGroupFilters1));
        System.assert(catalogsHotelProductGroupFilters3.equals(catalogsHotelProductGroupFilters4));
        System.assert(catalogsHotelProductGroupFilters4.equals(catalogsHotelProductGroupFilters3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsHotelProductGroupFilters catalogsHotelProductGroupFilters1 = OASCatalogsHotelProductGroupFilters.getExample();
        OASCatalogsHotelProductGroupFilters catalogsHotelProductGroupFilters2 = new OASCatalogsHotelProductGroupFilters();

        System.assertEquals(false, catalogsHotelProductGroupFilters1.equals('foo'));
        System.assertEquals(false, catalogsHotelProductGroupFilters2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsHotelProductGroupFilters catalogsHotelProductGroupFilters1 = OASCatalogsHotelProductGroupFilters.getExample();
        OASCatalogsHotelProductGroupFilters catalogsHotelProductGroupFilters2 = new OASCatalogsHotelProductGroupFilters();
        OASCatalogsHotelProductGroupFilters catalogsHotelProductGroupFilters3;

        System.assertEquals(false, catalogsHotelProductGroupFilters1.equals(catalogsHotelProductGroupFilters3));
        System.assertEquals(false, catalogsHotelProductGroupFilters2.equals(catalogsHotelProductGroupFilters3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsHotelProductGroupFilters catalogsHotelProductGroupFilters1 = OASCatalogsHotelProductGroupFilters.getExample();
        OASCatalogsHotelProductGroupFilters catalogsHotelProductGroupFilters2 = new OASCatalogsHotelProductGroupFilters();

        System.assertEquals(catalogsHotelProductGroupFilters1.hashCode(), catalogsHotelProductGroupFilters1.hashCode());
        System.assertEquals(catalogsHotelProductGroupFilters2.hashCode(), catalogsHotelProductGroupFilters2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsHotelProductGroupFilters catalogsHotelProductGroupFilters1 = OASCatalogsHotelProductGroupFilters.getExample();
        OASCatalogsHotelProductGroupFilters catalogsHotelProductGroupFilters2 = OASCatalogsHotelProductGroupFilters.getExample();
        OASCatalogsHotelProductGroupFilters catalogsHotelProductGroupFilters3 = new OASCatalogsHotelProductGroupFilters();
        OASCatalogsHotelProductGroupFilters catalogsHotelProductGroupFilters4 = new OASCatalogsHotelProductGroupFilters();

        System.assert(catalogsHotelProductGroupFilters1.equals(catalogsHotelProductGroupFilters2));
        System.assert(catalogsHotelProductGroupFilters3.equals(catalogsHotelProductGroupFilters4));
        System.assertEquals(catalogsHotelProductGroupFilters1.hashCode(), catalogsHotelProductGroupFilters2.hashCode());
        System.assertEquals(catalogsHotelProductGroupFilters3.hashCode(), catalogsHotelProductGroupFilters4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsHotelProductGroupFilters catalogsHotelProductGroupFilters = new OASCatalogsHotelProductGroupFilters();
        Map<String, String> x-property-mappings = catalogsHotelProductGroupFilters.getx-property-mappings();
        System.assertEquals('anyOf', x-property-mappings.get('any_of'));
        System.assertEquals('allOf', x-property-mappings.get('all_of'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCatalogsHotelProductGroupFilters catalogsHotelProductGroupFilters = new OASCatalogsHotelProductGroupFilters();
        System.assertEquals(new List<OASCatalogsHotelProductGroupFilterKe>(), catalogsHotelProductGroupFilters.anyOf);
        System.assertEquals(new List<OASCatalogsHotelProductGroupFilterKe>(), catalogsHotelProductGroupFilters.allOf);
    }
}
