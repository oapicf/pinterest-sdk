@isTest
private class OASImageMetadataImagesTest {
    @isTest
    private static void equalsSameInstance() {
        OASImageMetadataImages imageMetadataImages1 = OASImageMetadataImages.getExample();
        OASImageMetadataImages imageMetadataImages2 = imageMetadataImages1;
        OASImageMetadataImages imageMetadataImages3 = new OASImageMetadataImages();
        OASImageMetadataImages imageMetadataImages4 = imageMetadataImages3;

        System.assert(imageMetadataImages1.equals(imageMetadataImages2));
        System.assert(imageMetadataImages2.equals(imageMetadataImages1));
        System.assert(imageMetadataImages1.equals(imageMetadataImages1));
        System.assert(imageMetadataImages3.equals(imageMetadataImages4));
        System.assert(imageMetadataImages4.equals(imageMetadataImages3));
        System.assert(imageMetadataImages3.equals(imageMetadataImages3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASImageMetadataImages imageMetadataImages1 = OASImageMetadataImages.getExample();
        OASImageMetadataImages imageMetadataImages2 = OASImageMetadataImages.getExample();
        OASImageMetadataImages imageMetadataImages3 = new OASImageMetadataImages();
        OASImageMetadataImages imageMetadataImages4 = new OASImageMetadataImages();

        System.assert(imageMetadataImages1.equals(imageMetadataImages2));
        System.assert(imageMetadataImages2.equals(imageMetadataImages1));
        System.assert(imageMetadataImages3.equals(imageMetadataImages4));
        System.assert(imageMetadataImages4.equals(imageMetadataImages3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASImageMetadataImages imageMetadataImages1 = OASImageMetadataImages.getExample();
        OASImageMetadataImages imageMetadataImages2 = new OASImageMetadataImages();

        System.assertEquals(false, imageMetadataImages1.equals('foo'));
        System.assertEquals(false, imageMetadataImages2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASImageMetadataImages imageMetadataImages1 = OASImageMetadataImages.getExample();
        OASImageMetadataImages imageMetadataImages2 = new OASImageMetadataImages();
        OASImageMetadataImages imageMetadataImages3;

        System.assertEquals(false, imageMetadataImages1.equals(imageMetadataImages3));
        System.assertEquals(false, imageMetadataImages2.equals(imageMetadataImages3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASImageMetadataImages imageMetadataImages1 = OASImageMetadataImages.getExample();
        OASImageMetadataImages imageMetadataImages2 = new OASImageMetadataImages();

        System.assertEquals(imageMetadataImages1.hashCode(), imageMetadataImages1.hashCode());
        System.assertEquals(imageMetadataImages2.hashCode(), imageMetadataImages2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASImageMetadataImages imageMetadataImages1 = OASImageMetadataImages.getExample();
        OASImageMetadataImages imageMetadataImages2 = OASImageMetadataImages.getExample();
        OASImageMetadataImages imageMetadataImages3 = new OASImageMetadataImages();
        OASImageMetadataImages imageMetadataImages4 = new OASImageMetadataImages();

        System.assert(imageMetadataImages1.equals(imageMetadataImages2));
        System.assert(imageMetadataImages3.equals(imageMetadataImages4));
        System.assertEquals(imageMetadataImages1.hashCode(), imageMetadataImages2.hashCode());
        System.assertEquals(imageMetadataImages3.hashCode(), imageMetadataImages4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASImageMetadataImages imageMetadataImages = new OASImageMetadataImages();
        Map<String, String> x-property-mappings = imageMetadataImages.getx-property-mappings();
        System.assertEquals('', x-property-mappings.get('150x150'));
        System.assertEquals('', x-property-mappings.get('400x300'));
        System.assertEquals('', x-property-mappings.get('600x'));
        System.assertEquals('', x-property-mappings.get('1200x'));
    }
}
