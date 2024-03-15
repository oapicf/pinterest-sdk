@isTest
private class OASMediaUploadAllOfUploadParametersTest {
    @isTest
    private static void equalsSameInstance() {
        OASMediaUploadAllOfUploadParameters mediaUploadAllOfUploadParameters1 = OASMediaUploadAllOfUploadParameters.getExample();
        OASMediaUploadAllOfUploadParameters mediaUploadAllOfUploadParameters2 = mediaUploadAllOfUploadParameters1;
        OASMediaUploadAllOfUploadParameters mediaUploadAllOfUploadParameters3 = new OASMediaUploadAllOfUploadParameters();
        OASMediaUploadAllOfUploadParameters mediaUploadAllOfUploadParameters4 = mediaUploadAllOfUploadParameters3;

        System.assert(mediaUploadAllOfUploadParameters1.equals(mediaUploadAllOfUploadParameters2));
        System.assert(mediaUploadAllOfUploadParameters2.equals(mediaUploadAllOfUploadParameters1));
        System.assert(mediaUploadAllOfUploadParameters1.equals(mediaUploadAllOfUploadParameters1));
        System.assert(mediaUploadAllOfUploadParameters3.equals(mediaUploadAllOfUploadParameters4));
        System.assert(mediaUploadAllOfUploadParameters4.equals(mediaUploadAllOfUploadParameters3));
        System.assert(mediaUploadAllOfUploadParameters3.equals(mediaUploadAllOfUploadParameters3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMediaUploadAllOfUploadParameters mediaUploadAllOfUploadParameters1 = OASMediaUploadAllOfUploadParameters.getExample();
        OASMediaUploadAllOfUploadParameters mediaUploadAllOfUploadParameters2 = OASMediaUploadAllOfUploadParameters.getExample();
        OASMediaUploadAllOfUploadParameters mediaUploadAllOfUploadParameters3 = new OASMediaUploadAllOfUploadParameters();
        OASMediaUploadAllOfUploadParameters mediaUploadAllOfUploadParameters4 = new OASMediaUploadAllOfUploadParameters();

        System.assert(mediaUploadAllOfUploadParameters1.equals(mediaUploadAllOfUploadParameters2));
        System.assert(mediaUploadAllOfUploadParameters2.equals(mediaUploadAllOfUploadParameters1));
        System.assert(mediaUploadAllOfUploadParameters3.equals(mediaUploadAllOfUploadParameters4));
        System.assert(mediaUploadAllOfUploadParameters4.equals(mediaUploadAllOfUploadParameters3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMediaUploadAllOfUploadParameters mediaUploadAllOfUploadParameters1 = OASMediaUploadAllOfUploadParameters.getExample();
        OASMediaUploadAllOfUploadParameters mediaUploadAllOfUploadParameters2 = new OASMediaUploadAllOfUploadParameters();

        System.assertEquals(false, mediaUploadAllOfUploadParameters1.equals('foo'));
        System.assertEquals(false, mediaUploadAllOfUploadParameters2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMediaUploadAllOfUploadParameters mediaUploadAllOfUploadParameters1 = OASMediaUploadAllOfUploadParameters.getExample();
        OASMediaUploadAllOfUploadParameters mediaUploadAllOfUploadParameters2 = new OASMediaUploadAllOfUploadParameters();
        OASMediaUploadAllOfUploadParameters mediaUploadAllOfUploadParameters3;

        System.assertEquals(false, mediaUploadAllOfUploadParameters1.equals(mediaUploadAllOfUploadParameters3));
        System.assertEquals(false, mediaUploadAllOfUploadParameters2.equals(mediaUploadAllOfUploadParameters3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMediaUploadAllOfUploadParameters mediaUploadAllOfUploadParameters1 = OASMediaUploadAllOfUploadParameters.getExample();
        OASMediaUploadAllOfUploadParameters mediaUploadAllOfUploadParameters2 = new OASMediaUploadAllOfUploadParameters();

        System.assertEquals(mediaUploadAllOfUploadParameters1.hashCode(), mediaUploadAllOfUploadParameters1.hashCode());
        System.assertEquals(mediaUploadAllOfUploadParameters2.hashCode(), mediaUploadAllOfUploadParameters2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMediaUploadAllOfUploadParameters mediaUploadAllOfUploadParameters1 = OASMediaUploadAllOfUploadParameters.getExample();
        OASMediaUploadAllOfUploadParameters mediaUploadAllOfUploadParameters2 = OASMediaUploadAllOfUploadParameters.getExample();
        OASMediaUploadAllOfUploadParameters mediaUploadAllOfUploadParameters3 = new OASMediaUploadAllOfUploadParameters();
        OASMediaUploadAllOfUploadParameters mediaUploadAllOfUploadParameters4 = new OASMediaUploadAllOfUploadParameters();

        System.assert(mediaUploadAllOfUploadParameters1.equals(mediaUploadAllOfUploadParameters2));
        System.assert(mediaUploadAllOfUploadParameters3.equals(mediaUploadAllOfUploadParameters4));
        System.assertEquals(mediaUploadAllOfUploadParameters1.hashCode(), mediaUploadAllOfUploadParameters2.hashCode());
        System.assertEquals(mediaUploadAllOfUploadParameters3.hashCode(), mediaUploadAllOfUploadParameters4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASMediaUploadAllOfUploadParameters mediaUploadAllOfUploadParameters = new OASMediaUploadAllOfUploadParameters();
        Map<String, String> x-property-mappings = mediaUploadAllOfUploadParameters.getx-property-mappings();
        System.assertEquals('xAmzDate', x-property-mappings.get('x-amz-date'));
        System.assertEquals('xAmzSignature', x-property-mappings.get('x-amz-signature'));
        System.assertEquals('xAmzSecurityToken', x-property-mappings.get('x-amz-security-token'));
        System.assertEquals('xAmzAlgorithm', x-property-mappings.get('x-amz-algorithm'));
        System.assertEquals('xAmzCredential', x-property-mappings.get('x-amz-credential'));
        System.assertEquals('contentType', x-property-mappings.get('Content-Type'));
    }
}
