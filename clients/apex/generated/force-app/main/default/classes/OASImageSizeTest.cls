@isTest
private class OASImageSizeTest {
    @isTest
    private static void equalsSameInstance() {
        OASImageSize imageSize1 = OASImageSize.getExample();
        OASImageSize imageSize2 = imageSize1;
        OASImageSize imageSize3 = new OASImageSize();
        OASImageSize imageSize4 = imageSize3;

        System.assert(imageSize1.equals(imageSize2));
        System.assert(imageSize2.equals(imageSize1));
        System.assert(imageSize1.equals(imageSize1));
        System.assert(imageSize3.equals(imageSize4));
        System.assert(imageSize4.equals(imageSize3));
        System.assert(imageSize3.equals(imageSize3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASImageSize imageSize1 = OASImageSize.getExample();
        OASImageSize imageSize2 = OASImageSize.getExample();
        OASImageSize imageSize3 = new OASImageSize();
        OASImageSize imageSize4 = new OASImageSize();

        System.assert(imageSize1.equals(imageSize2));
        System.assert(imageSize2.equals(imageSize1));
        System.assert(imageSize3.equals(imageSize4));
        System.assert(imageSize4.equals(imageSize3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASImageSize imageSize1 = OASImageSize.getExample();
        OASImageSize imageSize2 = new OASImageSize();

        System.assertEquals(false, imageSize1.equals('foo'));
        System.assertEquals(false, imageSize2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASImageSize imageSize1 = OASImageSize.getExample();
        OASImageSize imageSize2 = new OASImageSize();
        OASImageSize imageSize3;

        System.assertEquals(false, imageSize1.equals(imageSize3));
        System.assertEquals(false, imageSize2.equals(imageSize3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASImageSize imageSize1 = OASImageSize.getExample();
        OASImageSize imageSize2 = new OASImageSize();

        System.assertEquals(imageSize1.hashCode(), imageSize1.hashCode());
        System.assertEquals(imageSize2.hashCode(), imageSize2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASImageSize imageSize1 = OASImageSize.getExample();
        OASImageSize imageSize2 = OASImageSize.getExample();
        OASImageSize imageSize3 = new OASImageSize();
        OASImageSize imageSize4 = new OASImageSize();

        System.assert(imageSize1.equals(imageSize2));
        System.assert(imageSize3.equals(imageSize4));
        System.assertEquals(imageSize1.hashCode(), imageSize2.hashCode());
        System.assertEquals(imageSize3.hashCode(), imageSize4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASImageSize imageSize = new OASImageSize();
        Map<String, String> x-property-mappings = imageSize.getx-property-mappings();
        System.assertEquals('', x-property-mappings.get('1200x'));
        System.assertEquals('', x-property-mappings.get('150x150'));
        System.assertEquals('', x-property-mappings.get('400x300'));
        System.assertEquals('', x-property-mappings.get('600x'));
    }
}
