@isTest
private class OASCatalogsProductGroupFiltersAllOfTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsProductGroupFiltersAllOf catalogsProductGroupFiltersAllOf1 = OASCatalogsProductGroupFiltersAllOf.getExample();
        OASCatalogsProductGroupFiltersAllOf catalogsProductGroupFiltersAllOf2 = catalogsProductGroupFiltersAllOf1;
        OASCatalogsProductGroupFiltersAllOf catalogsProductGroupFiltersAllOf3 = new OASCatalogsProductGroupFiltersAllOf();
        OASCatalogsProductGroupFiltersAllOf catalogsProductGroupFiltersAllOf4 = catalogsProductGroupFiltersAllOf3;

        System.assert(catalogsProductGroupFiltersAllOf1.equals(catalogsProductGroupFiltersAllOf2));
        System.assert(catalogsProductGroupFiltersAllOf2.equals(catalogsProductGroupFiltersAllOf1));
        System.assert(catalogsProductGroupFiltersAllOf1.equals(catalogsProductGroupFiltersAllOf1));
        System.assert(catalogsProductGroupFiltersAllOf3.equals(catalogsProductGroupFiltersAllOf4));
        System.assert(catalogsProductGroupFiltersAllOf4.equals(catalogsProductGroupFiltersAllOf3));
        System.assert(catalogsProductGroupFiltersAllOf3.equals(catalogsProductGroupFiltersAllOf3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsProductGroupFiltersAllOf catalogsProductGroupFiltersAllOf1 = OASCatalogsProductGroupFiltersAllOf.getExample();
        OASCatalogsProductGroupFiltersAllOf catalogsProductGroupFiltersAllOf2 = OASCatalogsProductGroupFiltersAllOf.getExample();
        OASCatalogsProductGroupFiltersAllOf catalogsProductGroupFiltersAllOf3 = new OASCatalogsProductGroupFiltersAllOf();
        OASCatalogsProductGroupFiltersAllOf catalogsProductGroupFiltersAllOf4 = new OASCatalogsProductGroupFiltersAllOf();

        System.assert(catalogsProductGroupFiltersAllOf1.equals(catalogsProductGroupFiltersAllOf2));
        System.assert(catalogsProductGroupFiltersAllOf2.equals(catalogsProductGroupFiltersAllOf1));
        System.assert(catalogsProductGroupFiltersAllOf3.equals(catalogsProductGroupFiltersAllOf4));
        System.assert(catalogsProductGroupFiltersAllOf4.equals(catalogsProductGroupFiltersAllOf3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsProductGroupFiltersAllOf catalogsProductGroupFiltersAllOf1 = OASCatalogsProductGroupFiltersAllOf.getExample();
        OASCatalogsProductGroupFiltersAllOf catalogsProductGroupFiltersAllOf2 = new OASCatalogsProductGroupFiltersAllOf();

        System.assertEquals(false, catalogsProductGroupFiltersAllOf1.equals('foo'));
        System.assertEquals(false, catalogsProductGroupFiltersAllOf2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsProductGroupFiltersAllOf catalogsProductGroupFiltersAllOf1 = OASCatalogsProductGroupFiltersAllOf.getExample();
        OASCatalogsProductGroupFiltersAllOf catalogsProductGroupFiltersAllOf2 = new OASCatalogsProductGroupFiltersAllOf();
        OASCatalogsProductGroupFiltersAllOf catalogsProductGroupFiltersAllOf3;

        System.assertEquals(false, catalogsProductGroupFiltersAllOf1.equals(catalogsProductGroupFiltersAllOf3));
        System.assertEquals(false, catalogsProductGroupFiltersAllOf2.equals(catalogsProductGroupFiltersAllOf3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsProductGroupFiltersAllOf catalogsProductGroupFiltersAllOf1 = OASCatalogsProductGroupFiltersAllOf.getExample();
        OASCatalogsProductGroupFiltersAllOf catalogsProductGroupFiltersAllOf2 = new OASCatalogsProductGroupFiltersAllOf();

        System.assertEquals(catalogsProductGroupFiltersAllOf1.hashCode(), catalogsProductGroupFiltersAllOf1.hashCode());
        System.assertEquals(catalogsProductGroupFiltersAllOf2.hashCode(), catalogsProductGroupFiltersAllOf2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsProductGroupFiltersAllOf catalogsProductGroupFiltersAllOf1 = OASCatalogsProductGroupFiltersAllOf.getExample();
        OASCatalogsProductGroupFiltersAllOf catalogsProductGroupFiltersAllOf2 = OASCatalogsProductGroupFiltersAllOf.getExample();
        OASCatalogsProductGroupFiltersAllOf catalogsProductGroupFiltersAllOf3 = new OASCatalogsProductGroupFiltersAllOf();
        OASCatalogsProductGroupFiltersAllOf catalogsProductGroupFiltersAllOf4 = new OASCatalogsProductGroupFiltersAllOf();

        System.assert(catalogsProductGroupFiltersAllOf1.equals(catalogsProductGroupFiltersAllOf2));
        System.assert(catalogsProductGroupFiltersAllOf3.equals(catalogsProductGroupFiltersAllOf4));
        System.assertEquals(catalogsProductGroupFiltersAllOf1.hashCode(), catalogsProductGroupFiltersAllOf2.hashCode());
        System.assertEquals(catalogsProductGroupFiltersAllOf3.hashCode(), catalogsProductGroupFiltersAllOf4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsProductGroupFiltersAllOf catalogsProductGroupFiltersAllOf = new OASCatalogsProductGroupFiltersAllOf();
        Map<String, String> x-property-mappings = catalogsProductGroupFiltersAllOf.getx-property-mappings();
        System.assertEquals('allOf', x-property-mappings.get('all_of'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCatalogsProductGroupFiltersAllOf catalogsProductGroupFiltersAllOf = new OASCatalogsProductGroupFiltersAllOf();
        System.assertEquals(new List<OASCatalogsProductGroupFilterKeys>(), catalogsProductGroupFiltersAllOf.allOf);
    }
}
