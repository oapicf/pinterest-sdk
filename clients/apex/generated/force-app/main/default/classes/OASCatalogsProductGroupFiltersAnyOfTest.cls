@isTest
private class OASCatalogsProductGroupFiltersAnyOfTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsProductGroupFiltersAnyOf catalogsProductGroupFiltersAnyOf1 = OASCatalogsProductGroupFiltersAnyOf.getExample();
        OASCatalogsProductGroupFiltersAnyOf catalogsProductGroupFiltersAnyOf2 = catalogsProductGroupFiltersAnyOf1;
        OASCatalogsProductGroupFiltersAnyOf catalogsProductGroupFiltersAnyOf3 = new OASCatalogsProductGroupFiltersAnyOf();
        OASCatalogsProductGroupFiltersAnyOf catalogsProductGroupFiltersAnyOf4 = catalogsProductGroupFiltersAnyOf3;

        System.assert(catalogsProductGroupFiltersAnyOf1.equals(catalogsProductGroupFiltersAnyOf2));
        System.assert(catalogsProductGroupFiltersAnyOf2.equals(catalogsProductGroupFiltersAnyOf1));
        System.assert(catalogsProductGroupFiltersAnyOf1.equals(catalogsProductGroupFiltersAnyOf1));
        System.assert(catalogsProductGroupFiltersAnyOf3.equals(catalogsProductGroupFiltersAnyOf4));
        System.assert(catalogsProductGroupFiltersAnyOf4.equals(catalogsProductGroupFiltersAnyOf3));
        System.assert(catalogsProductGroupFiltersAnyOf3.equals(catalogsProductGroupFiltersAnyOf3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsProductGroupFiltersAnyOf catalogsProductGroupFiltersAnyOf1 = OASCatalogsProductGroupFiltersAnyOf.getExample();
        OASCatalogsProductGroupFiltersAnyOf catalogsProductGroupFiltersAnyOf2 = OASCatalogsProductGroupFiltersAnyOf.getExample();
        OASCatalogsProductGroupFiltersAnyOf catalogsProductGroupFiltersAnyOf3 = new OASCatalogsProductGroupFiltersAnyOf();
        OASCatalogsProductGroupFiltersAnyOf catalogsProductGroupFiltersAnyOf4 = new OASCatalogsProductGroupFiltersAnyOf();

        System.assert(catalogsProductGroupFiltersAnyOf1.equals(catalogsProductGroupFiltersAnyOf2));
        System.assert(catalogsProductGroupFiltersAnyOf2.equals(catalogsProductGroupFiltersAnyOf1));
        System.assert(catalogsProductGroupFiltersAnyOf3.equals(catalogsProductGroupFiltersAnyOf4));
        System.assert(catalogsProductGroupFiltersAnyOf4.equals(catalogsProductGroupFiltersAnyOf3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsProductGroupFiltersAnyOf catalogsProductGroupFiltersAnyOf1 = OASCatalogsProductGroupFiltersAnyOf.getExample();
        OASCatalogsProductGroupFiltersAnyOf catalogsProductGroupFiltersAnyOf2 = new OASCatalogsProductGroupFiltersAnyOf();

        System.assertEquals(false, catalogsProductGroupFiltersAnyOf1.equals('foo'));
        System.assertEquals(false, catalogsProductGroupFiltersAnyOf2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsProductGroupFiltersAnyOf catalogsProductGroupFiltersAnyOf1 = OASCatalogsProductGroupFiltersAnyOf.getExample();
        OASCatalogsProductGroupFiltersAnyOf catalogsProductGroupFiltersAnyOf2 = new OASCatalogsProductGroupFiltersAnyOf();
        OASCatalogsProductGroupFiltersAnyOf catalogsProductGroupFiltersAnyOf3;

        System.assertEquals(false, catalogsProductGroupFiltersAnyOf1.equals(catalogsProductGroupFiltersAnyOf3));
        System.assertEquals(false, catalogsProductGroupFiltersAnyOf2.equals(catalogsProductGroupFiltersAnyOf3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsProductGroupFiltersAnyOf catalogsProductGroupFiltersAnyOf1 = OASCatalogsProductGroupFiltersAnyOf.getExample();
        OASCatalogsProductGroupFiltersAnyOf catalogsProductGroupFiltersAnyOf2 = new OASCatalogsProductGroupFiltersAnyOf();

        System.assertEquals(catalogsProductGroupFiltersAnyOf1.hashCode(), catalogsProductGroupFiltersAnyOf1.hashCode());
        System.assertEquals(catalogsProductGroupFiltersAnyOf2.hashCode(), catalogsProductGroupFiltersAnyOf2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsProductGroupFiltersAnyOf catalogsProductGroupFiltersAnyOf1 = OASCatalogsProductGroupFiltersAnyOf.getExample();
        OASCatalogsProductGroupFiltersAnyOf catalogsProductGroupFiltersAnyOf2 = OASCatalogsProductGroupFiltersAnyOf.getExample();
        OASCatalogsProductGroupFiltersAnyOf catalogsProductGroupFiltersAnyOf3 = new OASCatalogsProductGroupFiltersAnyOf();
        OASCatalogsProductGroupFiltersAnyOf catalogsProductGroupFiltersAnyOf4 = new OASCatalogsProductGroupFiltersAnyOf();

        System.assert(catalogsProductGroupFiltersAnyOf1.equals(catalogsProductGroupFiltersAnyOf2));
        System.assert(catalogsProductGroupFiltersAnyOf3.equals(catalogsProductGroupFiltersAnyOf4));
        System.assertEquals(catalogsProductGroupFiltersAnyOf1.hashCode(), catalogsProductGroupFiltersAnyOf2.hashCode());
        System.assertEquals(catalogsProductGroupFiltersAnyOf3.hashCode(), catalogsProductGroupFiltersAnyOf4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsProductGroupFiltersAnyOf catalogsProductGroupFiltersAnyOf = new OASCatalogsProductGroupFiltersAnyOf();
        Map<String, String> x-property-mappings = catalogsProductGroupFiltersAnyOf.getx-property-mappings();
        System.assertEquals('anyOf', x-property-mappings.get('any_of'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCatalogsProductGroupFiltersAnyOf catalogsProductGroupFiltersAnyOf = new OASCatalogsProductGroupFiltersAnyOf();
        System.assertEquals(new List<OASCatalogsProductGroupFilterKeys>(), catalogsProductGroupFiltersAnyOf.anyOf);
    }
}
