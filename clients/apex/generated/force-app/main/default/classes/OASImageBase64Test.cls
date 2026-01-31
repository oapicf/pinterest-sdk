@isTest
private class OASImageBase64Test {
    @isTest
    private static void equalsSameInstance() {
        OASImageBase64 imageBase641 = OASImageBase64.getExample();
        OASImageBase64 imageBase642 = imageBase641;
        OASImageBase64 imageBase643 = new OASImageBase64();
        OASImageBase64 imageBase644 = imageBase643;

        System.assert(imageBase641.equals(imageBase642));
        System.assert(imageBase642.equals(imageBase641));
        System.assert(imageBase641.equals(imageBase641));
        System.assert(imageBase643.equals(imageBase644));
        System.assert(imageBase644.equals(imageBase643));
        System.assert(imageBase643.equals(imageBase643));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASImageBase64 imageBase641 = OASImageBase64.getExample();
        OASImageBase64 imageBase642 = OASImageBase64.getExample();
        OASImageBase64 imageBase643 = new OASImageBase64();
        OASImageBase64 imageBase644 = new OASImageBase64();

        System.assert(imageBase641.equals(imageBase642));
        System.assert(imageBase642.equals(imageBase641));
        System.assert(imageBase643.equals(imageBase644));
        System.assert(imageBase644.equals(imageBase643));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASImageBase64 imageBase641 = OASImageBase64.getExample();
        OASImageBase64 imageBase642 = new OASImageBase64();

        System.assertEquals(false, imageBase641.equals('foo'));
        System.assertEquals(false, imageBase642.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASImageBase64 imageBase641 = OASImageBase64.getExample();
        OASImageBase64 imageBase642 = new OASImageBase64();
        OASImageBase64 imageBase643;

        System.assertEquals(false, imageBase641.equals(imageBase643));
        System.assertEquals(false, imageBase642.equals(imageBase643));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASImageBase64 imageBase641 = OASImageBase64.getExample();
        OASImageBase64 imageBase642 = new OASImageBase64();

        System.assertEquals(imageBase641.hashCode(), imageBase641.hashCode());
        System.assertEquals(imageBase642.hashCode(), imageBase642.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASImageBase64 imageBase641 = OASImageBase64.getExample();
        OASImageBase64 imageBase642 = OASImageBase64.getExample();
        OASImageBase64 imageBase643 = new OASImageBase64();
        OASImageBase64 imageBase644 = new OASImageBase64();

        System.assert(imageBase641.equals(imageBase642));
        System.assert(imageBase643.equals(imageBase644));
        System.assertEquals(imageBase641.hashCode(), imageBase642.hashCode());
        System.assertEquals(imageBase643.hashCode(), imageBase644.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASImageBase64 imageBase64 = new OASImageBase64();
        Map<String, String> x-property-mappings = imageBase64.getx-property-mappings();
        System.assertEquals('contentType', x-property-mappings.get('content_type'));
    }
}
