@isTest
private class OASS3FilePartTest {
    @isTest
    private static void equalsSameInstance() {
        OASS3FilePart s3FilePart1 = OASS3FilePart.getExample();
        OASS3FilePart s3FilePart2 = s3FilePart1;
        OASS3FilePart s3FilePart3 = new OASS3FilePart();
        OASS3FilePart s3FilePart4 = s3FilePart3;

        System.assert(s3FilePart1.equals(s3FilePart2));
        System.assert(s3FilePart2.equals(s3FilePart1));
        System.assert(s3FilePart1.equals(s3FilePart1));
        System.assert(s3FilePart3.equals(s3FilePart4));
        System.assert(s3FilePart4.equals(s3FilePart3));
        System.assert(s3FilePart3.equals(s3FilePart3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASS3FilePart s3FilePart1 = OASS3FilePart.getExample();
        OASS3FilePart s3FilePart2 = OASS3FilePart.getExample();
        OASS3FilePart s3FilePart3 = new OASS3FilePart();
        OASS3FilePart s3FilePart4 = new OASS3FilePart();

        System.assert(s3FilePart1.equals(s3FilePart2));
        System.assert(s3FilePart2.equals(s3FilePart1));
        System.assert(s3FilePart3.equals(s3FilePart4));
        System.assert(s3FilePart4.equals(s3FilePart3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASS3FilePart s3FilePart1 = OASS3FilePart.getExample();
        OASS3FilePart s3FilePart2 = new OASS3FilePart();

        System.assertEquals(false, s3FilePart1.equals('foo'));
        System.assertEquals(false, s3FilePart2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASS3FilePart s3FilePart1 = OASS3FilePart.getExample();
        OASS3FilePart s3FilePart2 = new OASS3FilePart();
        OASS3FilePart s3FilePart3;

        System.assertEquals(false, s3FilePart1.equals(s3FilePart3));
        System.assertEquals(false, s3FilePart2.equals(s3FilePart3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASS3FilePart s3FilePart1 = OASS3FilePart.getExample();
        OASS3FilePart s3FilePart2 = new OASS3FilePart();

        System.assertEquals(s3FilePart1.hashCode(), s3FilePart1.hashCode());
        System.assertEquals(s3FilePart2.hashCode(), s3FilePart2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASS3FilePart s3FilePart1 = OASS3FilePart.getExample();
        OASS3FilePart s3FilePart2 = OASS3FilePart.getExample();
        OASS3FilePart s3FilePart3 = new OASS3FilePart();
        OASS3FilePart s3FilePart4 = new OASS3FilePart();

        System.assert(s3FilePart1.equals(s3FilePart2));
        System.assert(s3FilePart3.equals(s3FilePart4));
        System.assertEquals(s3FilePart1.hashCode(), s3FilePart2.hashCode());
        System.assertEquals(s3FilePart3.hashCode(), s3FilePart4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASS3FilePart s3FilePart = new OASS3FilePart();
        Map<String, String> x-property-mappings = s3FilePart.getx-property-mappings();
        System.assertEquals('partNumber', x-property-mappings.get('part_number'));
        System.assertEquals('presignedUrl', x-property-mappings.get('presigned_url'));
    }
}
