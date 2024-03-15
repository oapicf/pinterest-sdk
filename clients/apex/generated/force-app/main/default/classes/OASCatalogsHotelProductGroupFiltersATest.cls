@isTest
private class OASCatalogsHotelProductGroupFiltersATest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsHotelProductGroupFiltersA catalogsHotelProductGroupFiltersAnyOf1 = OASCatalogsHotelProductGroupFiltersA.getExample();
        OASCatalogsHotelProductGroupFiltersA catalogsHotelProductGroupFiltersAnyOf2 = catalogsHotelProductGroupFiltersAnyOf1;
        OASCatalogsHotelProductGroupFiltersA catalogsHotelProductGroupFiltersAnyOf3 = new OASCatalogsHotelProductGroupFiltersA();
        OASCatalogsHotelProductGroupFiltersA catalogsHotelProductGroupFiltersAnyOf4 = catalogsHotelProductGroupFiltersAnyOf3;

        System.assert(catalogsHotelProductGroupFiltersAnyOf1.equals(catalogsHotelProductGroupFiltersAnyOf2));
        System.assert(catalogsHotelProductGroupFiltersAnyOf2.equals(catalogsHotelProductGroupFiltersAnyOf1));
        System.assert(catalogsHotelProductGroupFiltersAnyOf1.equals(catalogsHotelProductGroupFiltersAnyOf1));
        System.assert(catalogsHotelProductGroupFiltersAnyOf3.equals(catalogsHotelProductGroupFiltersAnyOf4));
        System.assert(catalogsHotelProductGroupFiltersAnyOf4.equals(catalogsHotelProductGroupFiltersAnyOf3));
        System.assert(catalogsHotelProductGroupFiltersAnyOf3.equals(catalogsHotelProductGroupFiltersAnyOf3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsHotelProductGroupFiltersA catalogsHotelProductGroupFiltersAnyOf1 = OASCatalogsHotelProductGroupFiltersA.getExample();
        OASCatalogsHotelProductGroupFiltersA catalogsHotelProductGroupFiltersAnyOf2 = OASCatalogsHotelProductGroupFiltersA.getExample();
        OASCatalogsHotelProductGroupFiltersA catalogsHotelProductGroupFiltersAnyOf3 = new OASCatalogsHotelProductGroupFiltersA();
        OASCatalogsHotelProductGroupFiltersA catalogsHotelProductGroupFiltersAnyOf4 = new OASCatalogsHotelProductGroupFiltersA();

        System.assert(catalogsHotelProductGroupFiltersAnyOf1.equals(catalogsHotelProductGroupFiltersAnyOf2));
        System.assert(catalogsHotelProductGroupFiltersAnyOf2.equals(catalogsHotelProductGroupFiltersAnyOf1));
        System.assert(catalogsHotelProductGroupFiltersAnyOf3.equals(catalogsHotelProductGroupFiltersAnyOf4));
        System.assert(catalogsHotelProductGroupFiltersAnyOf4.equals(catalogsHotelProductGroupFiltersAnyOf3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsHotelProductGroupFiltersA catalogsHotelProductGroupFiltersAnyOf1 = OASCatalogsHotelProductGroupFiltersA.getExample();
        OASCatalogsHotelProductGroupFiltersA catalogsHotelProductGroupFiltersAnyOf2 = new OASCatalogsHotelProductGroupFiltersA();

        System.assertEquals(false, catalogsHotelProductGroupFiltersAnyOf1.equals('foo'));
        System.assertEquals(false, catalogsHotelProductGroupFiltersAnyOf2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsHotelProductGroupFiltersA catalogsHotelProductGroupFiltersAnyOf1 = OASCatalogsHotelProductGroupFiltersA.getExample();
        OASCatalogsHotelProductGroupFiltersA catalogsHotelProductGroupFiltersAnyOf2 = new OASCatalogsHotelProductGroupFiltersA();
        OASCatalogsHotelProductGroupFiltersA catalogsHotelProductGroupFiltersAnyOf3;

        System.assertEquals(false, catalogsHotelProductGroupFiltersAnyOf1.equals(catalogsHotelProductGroupFiltersAnyOf3));
        System.assertEquals(false, catalogsHotelProductGroupFiltersAnyOf2.equals(catalogsHotelProductGroupFiltersAnyOf3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsHotelProductGroupFiltersA catalogsHotelProductGroupFiltersAnyOf1 = OASCatalogsHotelProductGroupFiltersA.getExample();
        OASCatalogsHotelProductGroupFiltersA catalogsHotelProductGroupFiltersAnyOf2 = new OASCatalogsHotelProductGroupFiltersA();

        System.assertEquals(catalogsHotelProductGroupFiltersAnyOf1.hashCode(), catalogsHotelProductGroupFiltersAnyOf1.hashCode());
        System.assertEquals(catalogsHotelProductGroupFiltersAnyOf2.hashCode(), catalogsHotelProductGroupFiltersAnyOf2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsHotelProductGroupFiltersA catalogsHotelProductGroupFiltersAnyOf1 = OASCatalogsHotelProductGroupFiltersA.getExample();
        OASCatalogsHotelProductGroupFiltersA catalogsHotelProductGroupFiltersAnyOf2 = OASCatalogsHotelProductGroupFiltersA.getExample();
        OASCatalogsHotelProductGroupFiltersA catalogsHotelProductGroupFiltersAnyOf3 = new OASCatalogsHotelProductGroupFiltersA();
        OASCatalogsHotelProductGroupFiltersA catalogsHotelProductGroupFiltersAnyOf4 = new OASCatalogsHotelProductGroupFiltersA();

        System.assert(catalogsHotelProductGroupFiltersAnyOf1.equals(catalogsHotelProductGroupFiltersAnyOf2));
        System.assert(catalogsHotelProductGroupFiltersAnyOf3.equals(catalogsHotelProductGroupFiltersAnyOf4));
        System.assertEquals(catalogsHotelProductGroupFiltersAnyOf1.hashCode(), catalogsHotelProductGroupFiltersAnyOf2.hashCode());
        System.assertEquals(catalogsHotelProductGroupFiltersAnyOf3.hashCode(), catalogsHotelProductGroupFiltersAnyOf4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsHotelProductGroupFiltersA catalogsHotelProductGroupFiltersAnyOf = new OASCatalogsHotelProductGroupFiltersA();
        Map<String, String> x-property-mappings = catalogsHotelProductGroupFiltersAnyOf.getx-property-mappings();
        System.assertEquals('anyOf', x-property-mappings.get('any_of'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCatalogsHotelProductGroupFiltersA catalogsHotelProductGroupFiltersAnyOf = new OASCatalogsHotelProductGroupFiltersA();
        System.assertEquals(new List<OASCatalogsHotelProductGroupFilterKe>(), catalogsHotelProductGroupFiltersAnyOf.anyOf);
    }
}
