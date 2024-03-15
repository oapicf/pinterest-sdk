@isTest
private class OASImageMetadataTest {
    @isTest
    private static void equalsSameInstance() {
        OASImageMetadata imageMetadata1 = OASImageMetadata.getExample();
        OASImageMetadata imageMetadata2 = imageMetadata1;
        OASImageMetadata imageMetadata3 = new OASImageMetadata();
        OASImageMetadata imageMetadata4 = imageMetadata3;

        System.assert(imageMetadata1.equals(imageMetadata2));
        System.assert(imageMetadata2.equals(imageMetadata1));
        System.assert(imageMetadata1.equals(imageMetadata1));
        System.assert(imageMetadata3.equals(imageMetadata4));
        System.assert(imageMetadata4.equals(imageMetadata3));
        System.assert(imageMetadata3.equals(imageMetadata3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASImageMetadata imageMetadata1 = OASImageMetadata.getExample();
        OASImageMetadata imageMetadata2 = OASImageMetadata.getExample();
        OASImageMetadata imageMetadata3 = new OASImageMetadata();
        OASImageMetadata imageMetadata4 = new OASImageMetadata();

        System.assert(imageMetadata1.equals(imageMetadata2));
        System.assert(imageMetadata2.equals(imageMetadata1));
        System.assert(imageMetadata3.equals(imageMetadata4));
        System.assert(imageMetadata4.equals(imageMetadata3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASImageMetadata imageMetadata1 = OASImageMetadata.getExample();
        OASImageMetadata imageMetadata2 = new OASImageMetadata();

        System.assertEquals(false, imageMetadata1.equals('foo'));
        System.assertEquals(false, imageMetadata2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASImageMetadata imageMetadata1 = OASImageMetadata.getExample();
        OASImageMetadata imageMetadata2 = new OASImageMetadata();
        OASImageMetadata imageMetadata3;

        System.assertEquals(false, imageMetadata1.equals(imageMetadata3));
        System.assertEquals(false, imageMetadata2.equals(imageMetadata3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASImageMetadata imageMetadata1 = OASImageMetadata.getExample();
        OASImageMetadata imageMetadata2 = new OASImageMetadata();

        System.assertEquals(imageMetadata1.hashCode(), imageMetadata1.hashCode());
        System.assertEquals(imageMetadata2.hashCode(), imageMetadata2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASImageMetadata imageMetadata1 = OASImageMetadata.getExample();
        OASImageMetadata imageMetadata2 = OASImageMetadata.getExample();
        OASImageMetadata imageMetadata3 = new OASImageMetadata();
        OASImageMetadata imageMetadata4 = new OASImageMetadata();

        System.assert(imageMetadata1.equals(imageMetadata2));
        System.assert(imageMetadata3.equals(imageMetadata4));
        System.assertEquals(imageMetadata1.hashCode(), imageMetadata2.hashCode());
        System.assertEquals(imageMetadata3.hashCode(), imageMetadata4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASImageMetadata imageMetadata = new OASImageMetadata();
        Map<String, String> x-property-mappings = imageMetadata.getx-property-mappings();
        System.assertEquals('itemType', x-property-mappings.get('item_type'));
    }
}
