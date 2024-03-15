@isTest
private class OASCatalogsHotelAddressTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsHotelAddress catalogsHotelAddress1 = OASCatalogsHotelAddress.getExample();
        OASCatalogsHotelAddress catalogsHotelAddress2 = catalogsHotelAddress1;
        OASCatalogsHotelAddress catalogsHotelAddress3 = new OASCatalogsHotelAddress();
        OASCatalogsHotelAddress catalogsHotelAddress4 = catalogsHotelAddress3;

        System.assert(catalogsHotelAddress1.equals(catalogsHotelAddress2));
        System.assert(catalogsHotelAddress2.equals(catalogsHotelAddress1));
        System.assert(catalogsHotelAddress1.equals(catalogsHotelAddress1));
        System.assert(catalogsHotelAddress3.equals(catalogsHotelAddress4));
        System.assert(catalogsHotelAddress4.equals(catalogsHotelAddress3));
        System.assert(catalogsHotelAddress3.equals(catalogsHotelAddress3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsHotelAddress catalogsHotelAddress1 = OASCatalogsHotelAddress.getExample();
        OASCatalogsHotelAddress catalogsHotelAddress2 = OASCatalogsHotelAddress.getExample();
        OASCatalogsHotelAddress catalogsHotelAddress3 = new OASCatalogsHotelAddress();
        OASCatalogsHotelAddress catalogsHotelAddress4 = new OASCatalogsHotelAddress();

        System.assert(catalogsHotelAddress1.equals(catalogsHotelAddress2));
        System.assert(catalogsHotelAddress2.equals(catalogsHotelAddress1));
        System.assert(catalogsHotelAddress3.equals(catalogsHotelAddress4));
        System.assert(catalogsHotelAddress4.equals(catalogsHotelAddress3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsHotelAddress catalogsHotelAddress1 = OASCatalogsHotelAddress.getExample();
        OASCatalogsHotelAddress catalogsHotelAddress2 = new OASCatalogsHotelAddress();

        System.assertEquals(false, catalogsHotelAddress1.equals('foo'));
        System.assertEquals(false, catalogsHotelAddress2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsHotelAddress catalogsHotelAddress1 = OASCatalogsHotelAddress.getExample();
        OASCatalogsHotelAddress catalogsHotelAddress2 = new OASCatalogsHotelAddress();
        OASCatalogsHotelAddress catalogsHotelAddress3;

        System.assertEquals(false, catalogsHotelAddress1.equals(catalogsHotelAddress3));
        System.assertEquals(false, catalogsHotelAddress2.equals(catalogsHotelAddress3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsHotelAddress catalogsHotelAddress1 = OASCatalogsHotelAddress.getExample();
        OASCatalogsHotelAddress catalogsHotelAddress2 = new OASCatalogsHotelAddress();

        System.assertEquals(catalogsHotelAddress1.hashCode(), catalogsHotelAddress1.hashCode());
        System.assertEquals(catalogsHotelAddress2.hashCode(), catalogsHotelAddress2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsHotelAddress catalogsHotelAddress1 = OASCatalogsHotelAddress.getExample();
        OASCatalogsHotelAddress catalogsHotelAddress2 = OASCatalogsHotelAddress.getExample();
        OASCatalogsHotelAddress catalogsHotelAddress3 = new OASCatalogsHotelAddress();
        OASCatalogsHotelAddress catalogsHotelAddress4 = new OASCatalogsHotelAddress();

        System.assert(catalogsHotelAddress1.equals(catalogsHotelAddress2));
        System.assert(catalogsHotelAddress3.equals(catalogsHotelAddress4));
        System.assertEquals(catalogsHotelAddress1.hashCode(), catalogsHotelAddress2.hashCode());
        System.assertEquals(catalogsHotelAddress3.hashCode(), catalogsHotelAddress4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsHotelAddress catalogsHotelAddress = new OASCatalogsHotelAddress();
        Map<String, String> x-property-mappings = catalogsHotelAddress.getx-property-mappings();
        System.assertEquals('postalCode', x-property-mappings.get('postal_code'));
    }
}
