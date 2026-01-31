@isTest
private class OASCatalogsVerticalFeedsCreateRequesTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsVerticalFeedsCreateReques catalogsVerticalFeedsCreateRequest1 = OASCatalogsVerticalFeedsCreateReques.getExample();
        OASCatalogsVerticalFeedsCreateReques catalogsVerticalFeedsCreateRequest2 = catalogsVerticalFeedsCreateRequest1;
        OASCatalogsVerticalFeedsCreateReques catalogsVerticalFeedsCreateRequest3 = new OASCatalogsVerticalFeedsCreateReques();
        OASCatalogsVerticalFeedsCreateReques catalogsVerticalFeedsCreateRequest4 = catalogsVerticalFeedsCreateRequest3;

        System.assert(catalogsVerticalFeedsCreateRequest1.equals(catalogsVerticalFeedsCreateRequest2));
        System.assert(catalogsVerticalFeedsCreateRequest2.equals(catalogsVerticalFeedsCreateRequest1));
        System.assert(catalogsVerticalFeedsCreateRequest1.equals(catalogsVerticalFeedsCreateRequest1));
        System.assert(catalogsVerticalFeedsCreateRequest3.equals(catalogsVerticalFeedsCreateRequest4));
        System.assert(catalogsVerticalFeedsCreateRequest4.equals(catalogsVerticalFeedsCreateRequest3));
        System.assert(catalogsVerticalFeedsCreateRequest3.equals(catalogsVerticalFeedsCreateRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsVerticalFeedsCreateReques catalogsVerticalFeedsCreateRequest1 = OASCatalogsVerticalFeedsCreateReques.getExample();
        OASCatalogsVerticalFeedsCreateReques catalogsVerticalFeedsCreateRequest2 = OASCatalogsVerticalFeedsCreateReques.getExample();
        OASCatalogsVerticalFeedsCreateReques catalogsVerticalFeedsCreateRequest3 = new OASCatalogsVerticalFeedsCreateReques();
        OASCatalogsVerticalFeedsCreateReques catalogsVerticalFeedsCreateRequest4 = new OASCatalogsVerticalFeedsCreateReques();

        System.assert(catalogsVerticalFeedsCreateRequest1.equals(catalogsVerticalFeedsCreateRequest2));
        System.assert(catalogsVerticalFeedsCreateRequest2.equals(catalogsVerticalFeedsCreateRequest1));
        System.assert(catalogsVerticalFeedsCreateRequest3.equals(catalogsVerticalFeedsCreateRequest4));
        System.assert(catalogsVerticalFeedsCreateRequest4.equals(catalogsVerticalFeedsCreateRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsVerticalFeedsCreateReques catalogsVerticalFeedsCreateRequest1 = OASCatalogsVerticalFeedsCreateReques.getExample();
        OASCatalogsVerticalFeedsCreateReques catalogsVerticalFeedsCreateRequest2 = new OASCatalogsVerticalFeedsCreateReques();

        System.assertEquals(false, catalogsVerticalFeedsCreateRequest1.equals('foo'));
        System.assertEquals(false, catalogsVerticalFeedsCreateRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsVerticalFeedsCreateReques catalogsVerticalFeedsCreateRequest1 = OASCatalogsVerticalFeedsCreateReques.getExample();
        OASCatalogsVerticalFeedsCreateReques catalogsVerticalFeedsCreateRequest2 = new OASCatalogsVerticalFeedsCreateReques();
        OASCatalogsVerticalFeedsCreateReques catalogsVerticalFeedsCreateRequest3;

        System.assertEquals(false, catalogsVerticalFeedsCreateRequest1.equals(catalogsVerticalFeedsCreateRequest3));
        System.assertEquals(false, catalogsVerticalFeedsCreateRequest2.equals(catalogsVerticalFeedsCreateRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsVerticalFeedsCreateReques catalogsVerticalFeedsCreateRequest1 = OASCatalogsVerticalFeedsCreateReques.getExample();
        OASCatalogsVerticalFeedsCreateReques catalogsVerticalFeedsCreateRequest2 = new OASCatalogsVerticalFeedsCreateReques();

        System.assertEquals(catalogsVerticalFeedsCreateRequest1.hashCode(), catalogsVerticalFeedsCreateRequest1.hashCode());
        System.assertEquals(catalogsVerticalFeedsCreateRequest2.hashCode(), catalogsVerticalFeedsCreateRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsVerticalFeedsCreateReques catalogsVerticalFeedsCreateRequest1 = OASCatalogsVerticalFeedsCreateReques.getExample();
        OASCatalogsVerticalFeedsCreateReques catalogsVerticalFeedsCreateRequest2 = OASCatalogsVerticalFeedsCreateReques.getExample();
        OASCatalogsVerticalFeedsCreateReques catalogsVerticalFeedsCreateRequest3 = new OASCatalogsVerticalFeedsCreateReques();
        OASCatalogsVerticalFeedsCreateReques catalogsVerticalFeedsCreateRequest4 = new OASCatalogsVerticalFeedsCreateReques();

        System.assert(catalogsVerticalFeedsCreateRequest1.equals(catalogsVerticalFeedsCreateRequest2));
        System.assert(catalogsVerticalFeedsCreateRequest3.equals(catalogsVerticalFeedsCreateRequest4));
        System.assertEquals(catalogsVerticalFeedsCreateRequest1.hashCode(), catalogsVerticalFeedsCreateRequest2.hashCode());
        System.assertEquals(catalogsVerticalFeedsCreateRequest3.hashCode(), catalogsVerticalFeedsCreateRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsVerticalFeedsCreateReques catalogsVerticalFeedsCreateRequest = new OASCatalogsVerticalFeedsCreateReques();
        Map<String, String> x-property-mappings = catalogsVerticalFeedsCreateRequest.getx-property-mappings();
        System.assertEquals('catalogId', x-property-mappings.get('catalog_id'));
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
        System.assertEquals('defaultAvailability', x-property-mappings.get('default_availability'));
        System.assertEquals('defaultCountry', x-property-mappings.get('default_country'));
        System.assertEquals('defaultCurrency', x-property-mappings.get('default_currency'));
        System.assertEquals('defaultLocale', x-property-mappings.get('default_locale'));
        System.assertEquals('preferredProcessingSchedule', x-property-mappings.get('preferred_processing_schedule'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCatalogsVerticalFeedsCreateReques catalogsVerticalFeedsCreateRequest = new OASCatalogsVerticalFeedsCreateReques();
        System.assertEquals('ACTIVE', catalogsVerticalFeedsCreateRequest.status);
        System.assertEquals(null, catalogsVerticalFeedsCreateRequest.catalogId);
        System.assertEquals(null, catalogsVerticalFeedsCreateRequest.catalogType);
        System.assertEquals(null, catalogsVerticalFeedsCreateRequest.credentials);
        System.assertEquals(null, catalogsVerticalFeedsCreateRequest.defaultAvailability);
        System.assertEquals(null, catalogsVerticalFeedsCreateRequest.defaultCountry);
        System.assertEquals(null, catalogsVerticalFeedsCreateRequest.defaultCurrency);
        System.assertEquals(null, catalogsVerticalFeedsCreateRequest.defaultLocale);
        System.assertEquals(null, catalogsVerticalFeedsCreateRequest.format);
        System.assertEquals(null, catalogsVerticalFeedsCreateRequest.location);
        System.assertEquals(null, catalogsVerticalFeedsCreateRequest.name);
        System.assertEquals(null, catalogsVerticalFeedsCreateRequest.preferredProcessingSchedule);
    }
}
