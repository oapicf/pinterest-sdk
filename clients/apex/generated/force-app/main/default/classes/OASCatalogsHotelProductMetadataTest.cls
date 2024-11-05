@isTest
private class OASCatalogsHotelProductMetadataTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsHotelProductMetadata catalogsHotelProductMetadata1 = OASCatalogsHotelProductMetadata.getExample();
        OASCatalogsHotelProductMetadata catalogsHotelProductMetadata2 = catalogsHotelProductMetadata1;
        OASCatalogsHotelProductMetadata catalogsHotelProductMetadata3 = new OASCatalogsHotelProductMetadata();
        OASCatalogsHotelProductMetadata catalogsHotelProductMetadata4 = catalogsHotelProductMetadata3;

        System.assert(catalogsHotelProductMetadata1.equals(catalogsHotelProductMetadata2));
        System.assert(catalogsHotelProductMetadata2.equals(catalogsHotelProductMetadata1));
        System.assert(catalogsHotelProductMetadata1.equals(catalogsHotelProductMetadata1));
        System.assert(catalogsHotelProductMetadata3.equals(catalogsHotelProductMetadata4));
        System.assert(catalogsHotelProductMetadata4.equals(catalogsHotelProductMetadata3));
        System.assert(catalogsHotelProductMetadata3.equals(catalogsHotelProductMetadata3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsHotelProductMetadata catalogsHotelProductMetadata1 = OASCatalogsHotelProductMetadata.getExample();
        OASCatalogsHotelProductMetadata catalogsHotelProductMetadata2 = OASCatalogsHotelProductMetadata.getExample();
        OASCatalogsHotelProductMetadata catalogsHotelProductMetadata3 = new OASCatalogsHotelProductMetadata();
        OASCatalogsHotelProductMetadata catalogsHotelProductMetadata4 = new OASCatalogsHotelProductMetadata();

        System.assert(catalogsHotelProductMetadata1.equals(catalogsHotelProductMetadata2));
        System.assert(catalogsHotelProductMetadata2.equals(catalogsHotelProductMetadata1));
        System.assert(catalogsHotelProductMetadata3.equals(catalogsHotelProductMetadata4));
        System.assert(catalogsHotelProductMetadata4.equals(catalogsHotelProductMetadata3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsHotelProductMetadata catalogsHotelProductMetadata1 = OASCatalogsHotelProductMetadata.getExample();
        OASCatalogsHotelProductMetadata catalogsHotelProductMetadata2 = new OASCatalogsHotelProductMetadata();

        System.assertEquals(false, catalogsHotelProductMetadata1.equals('foo'));
        System.assertEquals(false, catalogsHotelProductMetadata2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsHotelProductMetadata catalogsHotelProductMetadata1 = OASCatalogsHotelProductMetadata.getExample();
        OASCatalogsHotelProductMetadata catalogsHotelProductMetadata2 = new OASCatalogsHotelProductMetadata();
        OASCatalogsHotelProductMetadata catalogsHotelProductMetadata3;

        System.assertEquals(false, catalogsHotelProductMetadata1.equals(catalogsHotelProductMetadata3));
        System.assertEquals(false, catalogsHotelProductMetadata2.equals(catalogsHotelProductMetadata3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsHotelProductMetadata catalogsHotelProductMetadata1 = OASCatalogsHotelProductMetadata.getExample();
        OASCatalogsHotelProductMetadata catalogsHotelProductMetadata2 = new OASCatalogsHotelProductMetadata();

        System.assertEquals(catalogsHotelProductMetadata1.hashCode(), catalogsHotelProductMetadata1.hashCode());
        System.assertEquals(catalogsHotelProductMetadata2.hashCode(), catalogsHotelProductMetadata2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsHotelProductMetadata catalogsHotelProductMetadata1 = OASCatalogsHotelProductMetadata.getExample();
        OASCatalogsHotelProductMetadata catalogsHotelProductMetadata2 = OASCatalogsHotelProductMetadata.getExample();
        OASCatalogsHotelProductMetadata catalogsHotelProductMetadata3 = new OASCatalogsHotelProductMetadata();
        OASCatalogsHotelProductMetadata catalogsHotelProductMetadata4 = new OASCatalogsHotelProductMetadata();

        System.assert(catalogsHotelProductMetadata1.equals(catalogsHotelProductMetadata2));
        System.assert(catalogsHotelProductMetadata3.equals(catalogsHotelProductMetadata4));
        System.assertEquals(catalogsHotelProductMetadata1.hashCode(), catalogsHotelProductMetadata2.hashCode());
        System.assertEquals(catalogsHotelProductMetadata3.hashCode(), catalogsHotelProductMetadata4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsHotelProductMetadata catalogsHotelProductMetadata = new OASCatalogsHotelProductMetadata();
        Map<String, String> x-property-mappings = catalogsHotelProductMetadata.getx-property-mappings();
        System.assertEquals('hotelId', x-property-mappings.get('hotel_id'));
    }
}
