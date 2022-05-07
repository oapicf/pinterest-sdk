@isTest
private class OASMediaUploadAllOfTest {
    @isTest
    private static void equalsSameInstance() {
        OASMediaUploadAllOf mediaUploadAllOf1 = OASMediaUploadAllOf.getExample();
        OASMediaUploadAllOf mediaUploadAllOf2 = mediaUploadAllOf1;
        OASMediaUploadAllOf mediaUploadAllOf3 = new OASMediaUploadAllOf();
        OASMediaUploadAllOf mediaUploadAllOf4 = mediaUploadAllOf3;

        System.assert(mediaUploadAllOf1.equals(mediaUploadAllOf2));
        System.assert(mediaUploadAllOf2.equals(mediaUploadAllOf1));
        System.assert(mediaUploadAllOf1.equals(mediaUploadAllOf1));
        System.assert(mediaUploadAllOf3.equals(mediaUploadAllOf4));
        System.assert(mediaUploadAllOf4.equals(mediaUploadAllOf3));
        System.assert(mediaUploadAllOf3.equals(mediaUploadAllOf3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMediaUploadAllOf mediaUploadAllOf1 = OASMediaUploadAllOf.getExample();
        OASMediaUploadAllOf mediaUploadAllOf2 = OASMediaUploadAllOf.getExample();
        OASMediaUploadAllOf mediaUploadAllOf3 = new OASMediaUploadAllOf();
        OASMediaUploadAllOf mediaUploadAllOf4 = new OASMediaUploadAllOf();

        System.assert(mediaUploadAllOf1.equals(mediaUploadAllOf2));
        System.assert(mediaUploadAllOf2.equals(mediaUploadAllOf1));
        System.assert(mediaUploadAllOf3.equals(mediaUploadAllOf4));
        System.assert(mediaUploadAllOf4.equals(mediaUploadAllOf3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMediaUploadAllOf mediaUploadAllOf1 = OASMediaUploadAllOf.getExample();
        OASMediaUploadAllOf mediaUploadAllOf2 = new OASMediaUploadAllOf();

        System.assertEquals(false, mediaUploadAllOf1.equals('foo'));
        System.assertEquals(false, mediaUploadAllOf2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMediaUploadAllOf mediaUploadAllOf1 = OASMediaUploadAllOf.getExample();
        OASMediaUploadAllOf mediaUploadAllOf2 = new OASMediaUploadAllOf();
        OASMediaUploadAllOf mediaUploadAllOf3;

        System.assertEquals(false, mediaUploadAllOf1.equals(mediaUploadAllOf3));
        System.assertEquals(false, mediaUploadAllOf2.equals(mediaUploadAllOf3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMediaUploadAllOf mediaUploadAllOf1 = OASMediaUploadAllOf.getExample();
        OASMediaUploadAllOf mediaUploadAllOf2 = new OASMediaUploadAllOf();

        System.assertEquals(mediaUploadAllOf1.hashCode(), mediaUploadAllOf1.hashCode());
        System.assertEquals(mediaUploadAllOf2.hashCode(), mediaUploadAllOf2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMediaUploadAllOf mediaUploadAllOf1 = OASMediaUploadAllOf.getExample();
        OASMediaUploadAllOf mediaUploadAllOf2 = OASMediaUploadAllOf.getExample();
        OASMediaUploadAllOf mediaUploadAllOf3 = new OASMediaUploadAllOf();
        OASMediaUploadAllOf mediaUploadAllOf4 = new OASMediaUploadAllOf();

        System.assert(mediaUploadAllOf1.equals(mediaUploadAllOf2));
        System.assert(mediaUploadAllOf3.equals(mediaUploadAllOf4));
        System.assertEquals(mediaUploadAllOf1.hashCode(), mediaUploadAllOf2.hashCode());
        System.assertEquals(mediaUploadAllOf3.hashCode(), mediaUploadAllOf4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASMediaUploadAllOf mediaUploadAllOf = new OASMediaUploadAllOf();
        Map<String, String> x-property-mappings = mediaUploadAllOf.getx-property-mappings();
        System.assertEquals('mediaId', x-property-mappings.get('media_id'));
        System.assertEquals('mediaType', x-property-mappings.get('media_type'));
        System.assertEquals('uploadUrl', x-property-mappings.get('upload_url'));
        System.assertEquals('uploadParameters', x-property-mappings.get('upload_parameters'));
    }
}
