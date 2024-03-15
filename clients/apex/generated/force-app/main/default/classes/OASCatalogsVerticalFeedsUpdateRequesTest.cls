@isTest
private class OASCatalogsVerticalFeedsUpdateRequesTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsVerticalFeedsUpdateReques catalogsVerticalFeedsUpdateRequest1 = OASCatalogsVerticalFeedsUpdateReques.getExample();
        OASCatalogsVerticalFeedsUpdateReques catalogsVerticalFeedsUpdateRequest2 = catalogsVerticalFeedsUpdateRequest1;
        OASCatalogsVerticalFeedsUpdateReques catalogsVerticalFeedsUpdateRequest3 = new OASCatalogsVerticalFeedsUpdateReques();
        OASCatalogsVerticalFeedsUpdateReques catalogsVerticalFeedsUpdateRequest4 = catalogsVerticalFeedsUpdateRequest3;

        System.assert(catalogsVerticalFeedsUpdateRequest1.equals(catalogsVerticalFeedsUpdateRequest2));
        System.assert(catalogsVerticalFeedsUpdateRequest2.equals(catalogsVerticalFeedsUpdateRequest1));
        System.assert(catalogsVerticalFeedsUpdateRequest1.equals(catalogsVerticalFeedsUpdateRequest1));
        System.assert(catalogsVerticalFeedsUpdateRequest3.equals(catalogsVerticalFeedsUpdateRequest4));
        System.assert(catalogsVerticalFeedsUpdateRequest4.equals(catalogsVerticalFeedsUpdateRequest3));
        System.assert(catalogsVerticalFeedsUpdateRequest3.equals(catalogsVerticalFeedsUpdateRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsVerticalFeedsUpdateReques catalogsVerticalFeedsUpdateRequest1 = OASCatalogsVerticalFeedsUpdateReques.getExample();
        OASCatalogsVerticalFeedsUpdateReques catalogsVerticalFeedsUpdateRequest2 = OASCatalogsVerticalFeedsUpdateReques.getExample();
        OASCatalogsVerticalFeedsUpdateReques catalogsVerticalFeedsUpdateRequest3 = new OASCatalogsVerticalFeedsUpdateReques();
        OASCatalogsVerticalFeedsUpdateReques catalogsVerticalFeedsUpdateRequest4 = new OASCatalogsVerticalFeedsUpdateReques();

        System.assert(catalogsVerticalFeedsUpdateRequest1.equals(catalogsVerticalFeedsUpdateRequest2));
        System.assert(catalogsVerticalFeedsUpdateRequest2.equals(catalogsVerticalFeedsUpdateRequest1));
        System.assert(catalogsVerticalFeedsUpdateRequest3.equals(catalogsVerticalFeedsUpdateRequest4));
        System.assert(catalogsVerticalFeedsUpdateRequest4.equals(catalogsVerticalFeedsUpdateRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsVerticalFeedsUpdateReques catalogsVerticalFeedsUpdateRequest1 = OASCatalogsVerticalFeedsUpdateReques.getExample();
        OASCatalogsVerticalFeedsUpdateReques catalogsVerticalFeedsUpdateRequest2 = new OASCatalogsVerticalFeedsUpdateReques();

        System.assertEquals(false, catalogsVerticalFeedsUpdateRequest1.equals('foo'));
        System.assertEquals(false, catalogsVerticalFeedsUpdateRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsVerticalFeedsUpdateReques catalogsVerticalFeedsUpdateRequest1 = OASCatalogsVerticalFeedsUpdateReques.getExample();
        OASCatalogsVerticalFeedsUpdateReques catalogsVerticalFeedsUpdateRequest2 = new OASCatalogsVerticalFeedsUpdateReques();
        OASCatalogsVerticalFeedsUpdateReques catalogsVerticalFeedsUpdateRequest3;

        System.assertEquals(false, catalogsVerticalFeedsUpdateRequest1.equals(catalogsVerticalFeedsUpdateRequest3));
        System.assertEquals(false, catalogsVerticalFeedsUpdateRequest2.equals(catalogsVerticalFeedsUpdateRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsVerticalFeedsUpdateReques catalogsVerticalFeedsUpdateRequest1 = OASCatalogsVerticalFeedsUpdateReques.getExample();
        OASCatalogsVerticalFeedsUpdateReques catalogsVerticalFeedsUpdateRequest2 = new OASCatalogsVerticalFeedsUpdateReques();

        System.assertEquals(catalogsVerticalFeedsUpdateRequest1.hashCode(), catalogsVerticalFeedsUpdateRequest1.hashCode());
        System.assertEquals(catalogsVerticalFeedsUpdateRequest2.hashCode(), catalogsVerticalFeedsUpdateRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsVerticalFeedsUpdateReques catalogsVerticalFeedsUpdateRequest1 = OASCatalogsVerticalFeedsUpdateReques.getExample();
        OASCatalogsVerticalFeedsUpdateReques catalogsVerticalFeedsUpdateRequest2 = OASCatalogsVerticalFeedsUpdateReques.getExample();
        OASCatalogsVerticalFeedsUpdateReques catalogsVerticalFeedsUpdateRequest3 = new OASCatalogsVerticalFeedsUpdateReques();
        OASCatalogsVerticalFeedsUpdateReques catalogsVerticalFeedsUpdateRequest4 = new OASCatalogsVerticalFeedsUpdateReques();

        System.assert(catalogsVerticalFeedsUpdateRequest1.equals(catalogsVerticalFeedsUpdateRequest2));
        System.assert(catalogsVerticalFeedsUpdateRequest3.equals(catalogsVerticalFeedsUpdateRequest4));
        System.assertEquals(catalogsVerticalFeedsUpdateRequest1.hashCode(), catalogsVerticalFeedsUpdateRequest2.hashCode());
        System.assertEquals(catalogsVerticalFeedsUpdateRequest3.hashCode(), catalogsVerticalFeedsUpdateRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsVerticalFeedsUpdateReques catalogsVerticalFeedsUpdateRequest = new OASCatalogsVerticalFeedsUpdateReques();
        Map<String, String> x-property-mappings = catalogsVerticalFeedsUpdateRequest.getx-property-mappings();
        System.assertEquals('defaultCurrency', x-property-mappings.get('default_currency'));
        System.assertEquals('preferredProcessingSchedule', x-property-mappings.get('preferred_processing_schedule'));
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
        System.assertEquals('defaultAvailability', x-property-mappings.get('default_availability'));
    }
}
