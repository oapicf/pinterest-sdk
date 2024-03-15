@isTest
private class OASCatalogsHotelProductGroupFilterKeTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsHotelProductGroupFilterKe catalogsHotelProductGroupFilterKeys1 = OASCatalogsHotelProductGroupFilterKe.getExample();
        OASCatalogsHotelProductGroupFilterKe catalogsHotelProductGroupFilterKeys2 = catalogsHotelProductGroupFilterKeys1;
        OASCatalogsHotelProductGroupFilterKe catalogsHotelProductGroupFilterKeys3 = new OASCatalogsHotelProductGroupFilterKe();
        OASCatalogsHotelProductGroupFilterKe catalogsHotelProductGroupFilterKeys4 = catalogsHotelProductGroupFilterKeys3;

        System.assert(catalogsHotelProductGroupFilterKeys1.equals(catalogsHotelProductGroupFilterKeys2));
        System.assert(catalogsHotelProductGroupFilterKeys2.equals(catalogsHotelProductGroupFilterKeys1));
        System.assert(catalogsHotelProductGroupFilterKeys1.equals(catalogsHotelProductGroupFilterKeys1));
        System.assert(catalogsHotelProductGroupFilterKeys3.equals(catalogsHotelProductGroupFilterKeys4));
        System.assert(catalogsHotelProductGroupFilterKeys4.equals(catalogsHotelProductGroupFilterKeys3));
        System.assert(catalogsHotelProductGroupFilterKeys3.equals(catalogsHotelProductGroupFilterKeys3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsHotelProductGroupFilterKe catalogsHotelProductGroupFilterKeys1 = OASCatalogsHotelProductGroupFilterKe.getExample();
        OASCatalogsHotelProductGroupFilterKe catalogsHotelProductGroupFilterKeys2 = OASCatalogsHotelProductGroupFilterKe.getExample();
        OASCatalogsHotelProductGroupFilterKe catalogsHotelProductGroupFilterKeys3 = new OASCatalogsHotelProductGroupFilterKe();
        OASCatalogsHotelProductGroupFilterKe catalogsHotelProductGroupFilterKeys4 = new OASCatalogsHotelProductGroupFilterKe();

        System.assert(catalogsHotelProductGroupFilterKeys1.equals(catalogsHotelProductGroupFilterKeys2));
        System.assert(catalogsHotelProductGroupFilterKeys2.equals(catalogsHotelProductGroupFilterKeys1));
        System.assert(catalogsHotelProductGroupFilterKeys3.equals(catalogsHotelProductGroupFilterKeys4));
        System.assert(catalogsHotelProductGroupFilterKeys4.equals(catalogsHotelProductGroupFilterKeys3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsHotelProductGroupFilterKe catalogsHotelProductGroupFilterKeys1 = OASCatalogsHotelProductGroupFilterKe.getExample();
        OASCatalogsHotelProductGroupFilterKe catalogsHotelProductGroupFilterKeys2 = new OASCatalogsHotelProductGroupFilterKe();

        System.assertEquals(false, catalogsHotelProductGroupFilterKeys1.equals('foo'));
        System.assertEquals(false, catalogsHotelProductGroupFilterKeys2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsHotelProductGroupFilterKe catalogsHotelProductGroupFilterKeys1 = OASCatalogsHotelProductGroupFilterKe.getExample();
        OASCatalogsHotelProductGroupFilterKe catalogsHotelProductGroupFilterKeys2 = new OASCatalogsHotelProductGroupFilterKe();
        OASCatalogsHotelProductGroupFilterKe catalogsHotelProductGroupFilterKeys3;

        System.assertEquals(false, catalogsHotelProductGroupFilterKeys1.equals(catalogsHotelProductGroupFilterKeys3));
        System.assertEquals(false, catalogsHotelProductGroupFilterKeys2.equals(catalogsHotelProductGroupFilterKeys3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsHotelProductGroupFilterKe catalogsHotelProductGroupFilterKeys1 = OASCatalogsHotelProductGroupFilterKe.getExample();
        OASCatalogsHotelProductGroupFilterKe catalogsHotelProductGroupFilterKeys2 = new OASCatalogsHotelProductGroupFilterKe();

        System.assertEquals(catalogsHotelProductGroupFilterKeys1.hashCode(), catalogsHotelProductGroupFilterKeys1.hashCode());
        System.assertEquals(catalogsHotelProductGroupFilterKeys2.hashCode(), catalogsHotelProductGroupFilterKeys2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsHotelProductGroupFilterKe catalogsHotelProductGroupFilterKeys1 = OASCatalogsHotelProductGroupFilterKe.getExample();
        OASCatalogsHotelProductGroupFilterKe catalogsHotelProductGroupFilterKeys2 = OASCatalogsHotelProductGroupFilterKe.getExample();
        OASCatalogsHotelProductGroupFilterKe catalogsHotelProductGroupFilterKeys3 = new OASCatalogsHotelProductGroupFilterKe();
        OASCatalogsHotelProductGroupFilterKe catalogsHotelProductGroupFilterKeys4 = new OASCatalogsHotelProductGroupFilterKe();

        System.assert(catalogsHotelProductGroupFilterKeys1.equals(catalogsHotelProductGroupFilterKeys2));
        System.assert(catalogsHotelProductGroupFilterKeys3.equals(catalogsHotelProductGroupFilterKeys4));
        System.assertEquals(catalogsHotelProductGroupFilterKeys1.hashCode(), catalogsHotelProductGroupFilterKeys2.hashCode());
        System.assertEquals(catalogsHotelProductGroupFilterKeys3.hashCode(), catalogsHotelProductGroupFilterKeys4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsHotelProductGroupFilterKe catalogsHotelProductGroupFilterKeys = new OASCatalogsHotelProductGroupFilterKe();
        Map<String, String> x-property-mappings = catalogsHotelProductGroupFilterKeys.getx-property-mappings();
        System.assertEquals('cuSTOMLABEL0', x-property-mappings.get('CUSTOM_LABEL_0'));
        System.assertEquals('cuSTOMLABEL1', x-property-mappings.get('CUSTOM_LABEL_1'));
        System.assertEquals('cuSTOMLABEL2', x-property-mappings.get('CUSTOM_LABEL_2'));
        System.assertEquals('cuSTOMLABEL3', x-property-mappings.get('CUSTOM_LABEL_3'));
        System.assertEquals('cuSTOMLABEL4', x-property-mappings.get('CUSTOM_LABEL_4'));
    }
}
