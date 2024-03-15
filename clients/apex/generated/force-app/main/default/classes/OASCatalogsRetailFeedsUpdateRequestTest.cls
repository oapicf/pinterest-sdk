@isTest
private class OASCatalogsRetailFeedsUpdateRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsRetailFeedsUpdateRequest catalogsRetailFeedsUpdateRequest1 = OASCatalogsRetailFeedsUpdateRequest.getExample();
        OASCatalogsRetailFeedsUpdateRequest catalogsRetailFeedsUpdateRequest2 = catalogsRetailFeedsUpdateRequest1;
        OASCatalogsRetailFeedsUpdateRequest catalogsRetailFeedsUpdateRequest3 = new OASCatalogsRetailFeedsUpdateRequest();
        OASCatalogsRetailFeedsUpdateRequest catalogsRetailFeedsUpdateRequest4 = catalogsRetailFeedsUpdateRequest3;

        System.assert(catalogsRetailFeedsUpdateRequest1.equals(catalogsRetailFeedsUpdateRequest2));
        System.assert(catalogsRetailFeedsUpdateRequest2.equals(catalogsRetailFeedsUpdateRequest1));
        System.assert(catalogsRetailFeedsUpdateRequest1.equals(catalogsRetailFeedsUpdateRequest1));
        System.assert(catalogsRetailFeedsUpdateRequest3.equals(catalogsRetailFeedsUpdateRequest4));
        System.assert(catalogsRetailFeedsUpdateRequest4.equals(catalogsRetailFeedsUpdateRequest3));
        System.assert(catalogsRetailFeedsUpdateRequest3.equals(catalogsRetailFeedsUpdateRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsRetailFeedsUpdateRequest catalogsRetailFeedsUpdateRequest1 = OASCatalogsRetailFeedsUpdateRequest.getExample();
        OASCatalogsRetailFeedsUpdateRequest catalogsRetailFeedsUpdateRequest2 = OASCatalogsRetailFeedsUpdateRequest.getExample();
        OASCatalogsRetailFeedsUpdateRequest catalogsRetailFeedsUpdateRequest3 = new OASCatalogsRetailFeedsUpdateRequest();
        OASCatalogsRetailFeedsUpdateRequest catalogsRetailFeedsUpdateRequest4 = new OASCatalogsRetailFeedsUpdateRequest();

        System.assert(catalogsRetailFeedsUpdateRequest1.equals(catalogsRetailFeedsUpdateRequest2));
        System.assert(catalogsRetailFeedsUpdateRequest2.equals(catalogsRetailFeedsUpdateRequest1));
        System.assert(catalogsRetailFeedsUpdateRequest3.equals(catalogsRetailFeedsUpdateRequest4));
        System.assert(catalogsRetailFeedsUpdateRequest4.equals(catalogsRetailFeedsUpdateRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsRetailFeedsUpdateRequest catalogsRetailFeedsUpdateRequest1 = OASCatalogsRetailFeedsUpdateRequest.getExample();
        OASCatalogsRetailFeedsUpdateRequest catalogsRetailFeedsUpdateRequest2 = new OASCatalogsRetailFeedsUpdateRequest();

        System.assertEquals(false, catalogsRetailFeedsUpdateRequest1.equals('foo'));
        System.assertEquals(false, catalogsRetailFeedsUpdateRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsRetailFeedsUpdateRequest catalogsRetailFeedsUpdateRequest1 = OASCatalogsRetailFeedsUpdateRequest.getExample();
        OASCatalogsRetailFeedsUpdateRequest catalogsRetailFeedsUpdateRequest2 = new OASCatalogsRetailFeedsUpdateRequest();
        OASCatalogsRetailFeedsUpdateRequest catalogsRetailFeedsUpdateRequest3;

        System.assertEquals(false, catalogsRetailFeedsUpdateRequest1.equals(catalogsRetailFeedsUpdateRequest3));
        System.assertEquals(false, catalogsRetailFeedsUpdateRequest2.equals(catalogsRetailFeedsUpdateRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsRetailFeedsUpdateRequest catalogsRetailFeedsUpdateRequest1 = OASCatalogsRetailFeedsUpdateRequest.getExample();
        OASCatalogsRetailFeedsUpdateRequest catalogsRetailFeedsUpdateRequest2 = new OASCatalogsRetailFeedsUpdateRequest();

        System.assertEquals(catalogsRetailFeedsUpdateRequest1.hashCode(), catalogsRetailFeedsUpdateRequest1.hashCode());
        System.assertEquals(catalogsRetailFeedsUpdateRequest2.hashCode(), catalogsRetailFeedsUpdateRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsRetailFeedsUpdateRequest catalogsRetailFeedsUpdateRequest1 = OASCatalogsRetailFeedsUpdateRequest.getExample();
        OASCatalogsRetailFeedsUpdateRequest catalogsRetailFeedsUpdateRequest2 = OASCatalogsRetailFeedsUpdateRequest.getExample();
        OASCatalogsRetailFeedsUpdateRequest catalogsRetailFeedsUpdateRequest3 = new OASCatalogsRetailFeedsUpdateRequest();
        OASCatalogsRetailFeedsUpdateRequest catalogsRetailFeedsUpdateRequest4 = new OASCatalogsRetailFeedsUpdateRequest();

        System.assert(catalogsRetailFeedsUpdateRequest1.equals(catalogsRetailFeedsUpdateRequest2));
        System.assert(catalogsRetailFeedsUpdateRequest3.equals(catalogsRetailFeedsUpdateRequest4));
        System.assertEquals(catalogsRetailFeedsUpdateRequest1.hashCode(), catalogsRetailFeedsUpdateRequest2.hashCode());
        System.assertEquals(catalogsRetailFeedsUpdateRequest3.hashCode(), catalogsRetailFeedsUpdateRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsRetailFeedsUpdateRequest catalogsRetailFeedsUpdateRequest = new OASCatalogsRetailFeedsUpdateRequest();
        Map<String, String> x-property-mappings = catalogsRetailFeedsUpdateRequest.getx-property-mappings();
        System.assertEquals('defaultCurrency', x-property-mappings.get('default_currency'));
        System.assertEquals('preferredProcessingSchedule', x-property-mappings.get('preferred_processing_schedule'));
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
        System.assertEquals('defaultAvailability', x-property-mappings.get('default_availability'));
    }
}
