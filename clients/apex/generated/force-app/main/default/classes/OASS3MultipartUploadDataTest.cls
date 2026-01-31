@isTest
private class OASS3MultipartUploadDataTest {
    @isTest
    private static void equalsSameInstance() {
        OASS3MultipartUploadData s3MultipartUploadData1 = OASS3MultipartUploadData.getExample();
        OASS3MultipartUploadData s3MultipartUploadData2 = s3MultipartUploadData1;
        OASS3MultipartUploadData s3MultipartUploadData3 = new OASS3MultipartUploadData();
        OASS3MultipartUploadData s3MultipartUploadData4 = s3MultipartUploadData3;

        System.assert(s3MultipartUploadData1.equals(s3MultipartUploadData2));
        System.assert(s3MultipartUploadData2.equals(s3MultipartUploadData1));
        System.assert(s3MultipartUploadData1.equals(s3MultipartUploadData1));
        System.assert(s3MultipartUploadData3.equals(s3MultipartUploadData4));
        System.assert(s3MultipartUploadData4.equals(s3MultipartUploadData3));
        System.assert(s3MultipartUploadData3.equals(s3MultipartUploadData3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASS3MultipartUploadData s3MultipartUploadData1 = OASS3MultipartUploadData.getExample();
        OASS3MultipartUploadData s3MultipartUploadData2 = OASS3MultipartUploadData.getExample();
        OASS3MultipartUploadData s3MultipartUploadData3 = new OASS3MultipartUploadData();
        OASS3MultipartUploadData s3MultipartUploadData4 = new OASS3MultipartUploadData();

        System.assert(s3MultipartUploadData1.equals(s3MultipartUploadData2));
        System.assert(s3MultipartUploadData2.equals(s3MultipartUploadData1));
        System.assert(s3MultipartUploadData3.equals(s3MultipartUploadData4));
        System.assert(s3MultipartUploadData4.equals(s3MultipartUploadData3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASS3MultipartUploadData s3MultipartUploadData1 = OASS3MultipartUploadData.getExample();
        OASS3MultipartUploadData s3MultipartUploadData2 = new OASS3MultipartUploadData();

        System.assertEquals(false, s3MultipartUploadData1.equals('foo'));
        System.assertEquals(false, s3MultipartUploadData2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASS3MultipartUploadData s3MultipartUploadData1 = OASS3MultipartUploadData.getExample();
        OASS3MultipartUploadData s3MultipartUploadData2 = new OASS3MultipartUploadData();
        OASS3MultipartUploadData s3MultipartUploadData3;

        System.assertEquals(false, s3MultipartUploadData1.equals(s3MultipartUploadData3));
        System.assertEquals(false, s3MultipartUploadData2.equals(s3MultipartUploadData3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASS3MultipartUploadData s3MultipartUploadData1 = OASS3MultipartUploadData.getExample();
        OASS3MultipartUploadData s3MultipartUploadData2 = new OASS3MultipartUploadData();

        System.assertEquals(s3MultipartUploadData1.hashCode(), s3MultipartUploadData1.hashCode());
        System.assertEquals(s3MultipartUploadData2.hashCode(), s3MultipartUploadData2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASS3MultipartUploadData s3MultipartUploadData1 = OASS3MultipartUploadData.getExample();
        OASS3MultipartUploadData s3MultipartUploadData2 = OASS3MultipartUploadData.getExample();
        OASS3MultipartUploadData s3MultipartUploadData3 = new OASS3MultipartUploadData();
        OASS3MultipartUploadData s3MultipartUploadData4 = new OASS3MultipartUploadData();

        System.assert(s3MultipartUploadData1.equals(s3MultipartUploadData2));
        System.assert(s3MultipartUploadData3.equals(s3MultipartUploadData4));
        System.assertEquals(s3MultipartUploadData1.hashCode(), s3MultipartUploadData2.hashCode());
        System.assertEquals(s3MultipartUploadData3.hashCode(), s3MultipartUploadData4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASS3MultipartUploadData s3MultipartUploadData = new OASS3MultipartUploadData();
        Map<String, String> x-property-mappings = s3MultipartUploadData.getx-property-mappings();
        System.assertEquals('fileParts', x-property-mappings.get('file_parts'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASS3MultipartUploadData s3MultipartUploadData = new OASS3MultipartUploadData();
        System.assertEquals(new List<OASS3FilePart>(), s3MultipartUploadData.fileParts);
    }
}
