@isTest
private class OASAdPreviewCreateFromImageTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdPreviewCreateFromImage adPreviewCreateFromImage1 = OASAdPreviewCreateFromImage.getExample();
        OASAdPreviewCreateFromImage adPreviewCreateFromImage2 = adPreviewCreateFromImage1;
        OASAdPreviewCreateFromImage adPreviewCreateFromImage3 = new OASAdPreviewCreateFromImage();
        OASAdPreviewCreateFromImage adPreviewCreateFromImage4 = adPreviewCreateFromImage3;

        System.assert(adPreviewCreateFromImage1.equals(adPreviewCreateFromImage2));
        System.assert(adPreviewCreateFromImage2.equals(adPreviewCreateFromImage1));
        System.assert(adPreviewCreateFromImage1.equals(adPreviewCreateFromImage1));
        System.assert(adPreviewCreateFromImage3.equals(adPreviewCreateFromImage4));
        System.assert(adPreviewCreateFromImage4.equals(adPreviewCreateFromImage3));
        System.assert(adPreviewCreateFromImage3.equals(adPreviewCreateFromImage3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdPreviewCreateFromImage adPreviewCreateFromImage1 = OASAdPreviewCreateFromImage.getExample();
        OASAdPreviewCreateFromImage adPreviewCreateFromImage2 = OASAdPreviewCreateFromImage.getExample();
        OASAdPreviewCreateFromImage adPreviewCreateFromImage3 = new OASAdPreviewCreateFromImage();
        OASAdPreviewCreateFromImage adPreviewCreateFromImage4 = new OASAdPreviewCreateFromImage();

        System.assert(adPreviewCreateFromImage1.equals(adPreviewCreateFromImage2));
        System.assert(adPreviewCreateFromImage2.equals(adPreviewCreateFromImage1));
        System.assert(adPreviewCreateFromImage3.equals(adPreviewCreateFromImage4));
        System.assert(adPreviewCreateFromImage4.equals(adPreviewCreateFromImage3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdPreviewCreateFromImage adPreviewCreateFromImage1 = OASAdPreviewCreateFromImage.getExample();
        OASAdPreviewCreateFromImage adPreviewCreateFromImage2 = new OASAdPreviewCreateFromImage();

        System.assertEquals(false, adPreviewCreateFromImage1.equals('foo'));
        System.assertEquals(false, adPreviewCreateFromImage2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdPreviewCreateFromImage adPreviewCreateFromImage1 = OASAdPreviewCreateFromImage.getExample();
        OASAdPreviewCreateFromImage adPreviewCreateFromImage2 = new OASAdPreviewCreateFromImage();
        OASAdPreviewCreateFromImage adPreviewCreateFromImage3;

        System.assertEquals(false, adPreviewCreateFromImage1.equals(adPreviewCreateFromImage3));
        System.assertEquals(false, adPreviewCreateFromImage2.equals(adPreviewCreateFromImage3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdPreviewCreateFromImage adPreviewCreateFromImage1 = OASAdPreviewCreateFromImage.getExample();
        OASAdPreviewCreateFromImage adPreviewCreateFromImage2 = new OASAdPreviewCreateFromImage();

        System.assertEquals(adPreviewCreateFromImage1.hashCode(), adPreviewCreateFromImage1.hashCode());
        System.assertEquals(adPreviewCreateFromImage2.hashCode(), adPreviewCreateFromImage2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdPreviewCreateFromImage adPreviewCreateFromImage1 = OASAdPreviewCreateFromImage.getExample();
        OASAdPreviewCreateFromImage adPreviewCreateFromImage2 = OASAdPreviewCreateFromImage.getExample();
        OASAdPreviewCreateFromImage adPreviewCreateFromImage3 = new OASAdPreviewCreateFromImage();
        OASAdPreviewCreateFromImage adPreviewCreateFromImage4 = new OASAdPreviewCreateFromImage();

        System.assert(adPreviewCreateFromImage1.equals(adPreviewCreateFromImage2));
        System.assert(adPreviewCreateFromImage3.equals(adPreviewCreateFromImage4));
        System.assertEquals(adPreviewCreateFromImage1.hashCode(), adPreviewCreateFromImage2.hashCode());
        System.assertEquals(adPreviewCreateFromImage3.hashCode(), adPreviewCreateFromImage4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAdPreviewCreateFromImage adPreviewCreateFromImage = new OASAdPreviewCreateFromImage();
        Map<String, String> x-property-mappings = adPreviewCreateFromImage.getx-property-mappings();
        System.assertEquals('imageUrl', x-property-mappings.get('image_url'));
    }
}
