@isTest
private class OASMediaUploadParametersTest {
    @isTest
    private static void equalsSameInstance() {
        OASMediaUploadParameters mediaUploadParameters1 = OASMediaUploadParameters.getExample();
        OASMediaUploadParameters mediaUploadParameters2 = mediaUploadParameters1;
        OASMediaUploadParameters mediaUploadParameters3 = new OASMediaUploadParameters();
        OASMediaUploadParameters mediaUploadParameters4 = mediaUploadParameters3;

        System.assert(mediaUploadParameters1.equals(mediaUploadParameters2));
        System.assert(mediaUploadParameters2.equals(mediaUploadParameters1));
        System.assert(mediaUploadParameters1.equals(mediaUploadParameters1));
        System.assert(mediaUploadParameters3.equals(mediaUploadParameters4));
        System.assert(mediaUploadParameters4.equals(mediaUploadParameters3));
        System.assert(mediaUploadParameters3.equals(mediaUploadParameters3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMediaUploadParameters mediaUploadParameters1 = OASMediaUploadParameters.getExample();
        OASMediaUploadParameters mediaUploadParameters2 = OASMediaUploadParameters.getExample();
        OASMediaUploadParameters mediaUploadParameters3 = new OASMediaUploadParameters();
        OASMediaUploadParameters mediaUploadParameters4 = new OASMediaUploadParameters();

        System.assert(mediaUploadParameters1.equals(mediaUploadParameters2));
        System.assert(mediaUploadParameters2.equals(mediaUploadParameters1));
        System.assert(mediaUploadParameters3.equals(mediaUploadParameters4));
        System.assert(mediaUploadParameters4.equals(mediaUploadParameters3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMediaUploadParameters mediaUploadParameters1 = OASMediaUploadParameters.getExample();
        OASMediaUploadParameters mediaUploadParameters2 = new OASMediaUploadParameters();

        System.assertEquals(false, mediaUploadParameters1.equals('foo'));
        System.assertEquals(false, mediaUploadParameters2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMediaUploadParameters mediaUploadParameters1 = OASMediaUploadParameters.getExample();
        OASMediaUploadParameters mediaUploadParameters2 = new OASMediaUploadParameters();
        OASMediaUploadParameters mediaUploadParameters3;

        System.assertEquals(false, mediaUploadParameters1.equals(mediaUploadParameters3));
        System.assertEquals(false, mediaUploadParameters2.equals(mediaUploadParameters3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMediaUploadParameters mediaUploadParameters1 = OASMediaUploadParameters.getExample();
        OASMediaUploadParameters mediaUploadParameters2 = new OASMediaUploadParameters();

        System.assertEquals(mediaUploadParameters1.hashCode(), mediaUploadParameters1.hashCode());
        System.assertEquals(mediaUploadParameters2.hashCode(), mediaUploadParameters2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMediaUploadParameters mediaUploadParameters1 = OASMediaUploadParameters.getExample();
        OASMediaUploadParameters mediaUploadParameters2 = OASMediaUploadParameters.getExample();
        OASMediaUploadParameters mediaUploadParameters3 = new OASMediaUploadParameters();
        OASMediaUploadParameters mediaUploadParameters4 = new OASMediaUploadParameters();

        System.assert(mediaUploadParameters1.equals(mediaUploadParameters2));
        System.assert(mediaUploadParameters3.equals(mediaUploadParameters4));
        System.assertEquals(mediaUploadParameters1.hashCode(), mediaUploadParameters2.hashCode());
        System.assertEquals(mediaUploadParameters3.hashCode(), mediaUploadParameters4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASMediaUploadParameters mediaUploadParameters = new OASMediaUploadParameters();
        Map<String, String> x-property-mappings = mediaUploadParameters.getx-property-mappings();
        System.assertEquals('contentType', x-property-mappings.get('Content-Type'));
        System.assertEquals('xAmzAlgorithm', x-property-mappings.get('x-amz-algorithm'));
        System.assertEquals('xAmzCredential', x-property-mappings.get('x-amz-credential'));
        System.assertEquals('xAmzDate', x-property-mappings.get('x-amz-date'));
        System.assertEquals('xAmzSecurityToken', x-property-mappings.get('x-amz-security-token'));
        System.assertEquals('xAmzSignature', x-property-mappings.get('x-amz-signature'));
    }
}
