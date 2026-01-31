@isTest
private class OASCatalogsProductGroupFiltersRequesTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsProductGroupFiltersReques catalogsProductGroupFiltersRequest1 = OASCatalogsProductGroupFiltersReques.getExample();
        OASCatalogsProductGroupFiltersReques catalogsProductGroupFiltersRequest2 = catalogsProductGroupFiltersRequest1;
        OASCatalogsProductGroupFiltersReques catalogsProductGroupFiltersRequest3 = new OASCatalogsProductGroupFiltersReques();
        OASCatalogsProductGroupFiltersReques catalogsProductGroupFiltersRequest4 = catalogsProductGroupFiltersRequest3;

        System.assert(catalogsProductGroupFiltersRequest1.equals(catalogsProductGroupFiltersRequest2));
        System.assert(catalogsProductGroupFiltersRequest2.equals(catalogsProductGroupFiltersRequest1));
        System.assert(catalogsProductGroupFiltersRequest1.equals(catalogsProductGroupFiltersRequest1));
        System.assert(catalogsProductGroupFiltersRequest3.equals(catalogsProductGroupFiltersRequest4));
        System.assert(catalogsProductGroupFiltersRequest4.equals(catalogsProductGroupFiltersRequest3));
        System.assert(catalogsProductGroupFiltersRequest3.equals(catalogsProductGroupFiltersRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsProductGroupFiltersReques catalogsProductGroupFiltersRequest1 = OASCatalogsProductGroupFiltersReques.getExample();
        OASCatalogsProductGroupFiltersReques catalogsProductGroupFiltersRequest2 = OASCatalogsProductGroupFiltersReques.getExample();
        OASCatalogsProductGroupFiltersReques catalogsProductGroupFiltersRequest3 = new OASCatalogsProductGroupFiltersReques();
        OASCatalogsProductGroupFiltersReques catalogsProductGroupFiltersRequest4 = new OASCatalogsProductGroupFiltersReques();

        System.assert(catalogsProductGroupFiltersRequest1.equals(catalogsProductGroupFiltersRequest2));
        System.assert(catalogsProductGroupFiltersRequest2.equals(catalogsProductGroupFiltersRequest1));
        System.assert(catalogsProductGroupFiltersRequest3.equals(catalogsProductGroupFiltersRequest4));
        System.assert(catalogsProductGroupFiltersRequest4.equals(catalogsProductGroupFiltersRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsProductGroupFiltersReques catalogsProductGroupFiltersRequest1 = OASCatalogsProductGroupFiltersReques.getExample();
        OASCatalogsProductGroupFiltersReques catalogsProductGroupFiltersRequest2 = new OASCatalogsProductGroupFiltersReques();

        System.assertEquals(false, catalogsProductGroupFiltersRequest1.equals('foo'));
        System.assertEquals(false, catalogsProductGroupFiltersRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsProductGroupFiltersReques catalogsProductGroupFiltersRequest1 = OASCatalogsProductGroupFiltersReques.getExample();
        OASCatalogsProductGroupFiltersReques catalogsProductGroupFiltersRequest2 = new OASCatalogsProductGroupFiltersReques();
        OASCatalogsProductGroupFiltersReques catalogsProductGroupFiltersRequest3;

        System.assertEquals(false, catalogsProductGroupFiltersRequest1.equals(catalogsProductGroupFiltersRequest3));
        System.assertEquals(false, catalogsProductGroupFiltersRequest2.equals(catalogsProductGroupFiltersRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsProductGroupFiltersReques catalogsProductGroupFiltersRequest1 = OASCatalogsProductGroupFiltersReques.getExample();
        OASCatalogsProductGroupFiltersReques catalogsProductGroupFiltersRequest2 = new OASCatalogsProductGroupFiltersReques();

        System.assertEquals(catalogsProductGroupFiltersRequest1.hashCode(), catalogsProductGroupFiltersRequest1.hashCode());
        System.assertEquals(catalogsProductGroupFiltersRequest2.hashCode(), catalogsProductGroupFiltersRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsProductGroupFiltersReques catalogsProductGroupFiltersRequest1 = OASCatalogsProductGroupFiltersReques.getExample();
        OASCatalogsProductGroupFiltersReques catalogsProductGroupFiltersRequest2 = OASCatalogsProductGroupFiltersReques.getExample();
        OASCatalogsProductGroupFiltersReques catalogsProductGroupFiltersRequest3 = new OASCatalogsProductGroupFiltersReques();
        OASCatalogsProductGroupFiltersReques catalogsProductGroupFiltersRequest4 = new OASCatalogsProductGroupFiltersReques();

        System.assert(catalogsProductGroupFiltersRequest1.equals(catalogsProductGroupFiltersRequest2));
        System.assert(catalogsProductGroupFiltersRequest3.equals(catalogsProductGroupFiltersRequest4));
        System.assertEquals(catalogsProductGroupFiltersRequest1.hashCode(), catalogsProductGroupFiltersRequest2.hashCode());
        System.assertEquals(catalogsProductGroupFiltersRequest3.hashCode(), catalogsProductGroupFiltersRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsProductGroupFiltersReques catalogsProductGroupFiltersRequest = new OASCatalogsProductGroupFiltersReques();
        Map<String, String> x-property-mappings = catalogsProductGroupFiltersRequest.getx-property-mappings();
        System.assertEquals('anyOf', x-property-mappings.get('any_of'));
        System.assertEquals('allOf', x-property-mappings.get('all_of'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCatalogsProductGroupFiltersReques catalogsProductGroupFiltersRequest = new OASCatalogsProductGroupFiltersReques();
        System.assertEquals(new List<OASCatalogsProductGroupFilterKeys>(), catalogsProductGroupFiltersRequest.anyOf);
        System.assertEquals(new List<OASCatalogsProductGroupFilterKeys>(), catalogsProductGroupFiltersRequest.allOf);
    }
}
