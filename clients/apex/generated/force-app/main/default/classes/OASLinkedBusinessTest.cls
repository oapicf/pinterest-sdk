@isTest
private class OASLinkedBusinessTest {
    @isTest
    private static void equalsSameInstance() {
        OASLinkedBusiness linkedBusiness1 = OASLinkedBusiness.getExample();
        OASLinkedBusiness linkedBusiness2 = linkedBusiness1;
        OASLinkedBusiness linkedBusiness3 = new OASLinkedBusiness();
        OASLinkedBusiness linkedBusiness4 = linkedBusiness3;

        System.assert(linkedBusiness1.equals(linkedBusiness2));
        System.assert(linkedBusiness2.equals(linkedBusiness1));
        System.assert(linkedBusiness1.equals(linkedBusiness1));
        System.assert(linkedBusiness3.equals(linkedBusiness4));
        System.assert(linkedBusiness4.equals(linkedBusiness3));
        System.assert(linkedBusiness3.equals(linkedBusiness3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASLinkedBusiness linkedBusiness1 = OASLinkedBusiness.getExample();
        OASLinkedBusiness linkedBusiness2 = OASLinkedBusiness.getExample();
        OASLinkedBusiness linkedBusiness3 = new OASLinkedBusiness();
        OASLinkedBusiness linkedBusiness4 = new OASLinkedBusiness();

        System.assert(linkedBusiness1.equals(linkedBusiness2));
        System.assert(linkedBusiness2.equals(linkedBusiness1));
        System.assert(linkedBusiness3.equals(linkedBusiness4));
        System.assert(linkedBusiness4.equals(linkedBusiness3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASLinkedBusiness linkedBusiness1 = OASLinkedBusiness.getExample();
        OASLinkedBusiness linkedBusiness2 = new OASLinkedBusiness();

        System.assertEquals(false, linkedBusiness1.equals('foo'));
        System.assertEquals(false, linkedBusiness2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASLinkedBusiness linkedBusiness1 = OASLinkedBusiness.getExample();
        OASLinkedBusiness linkedBusiness2 = new OASLinkedBusiness();
        OASLinkedBusiness linkedBusiness3;

        System.assertEquals(false, linkedBusiness1.equals(linkedBusiness3));
        System.assertEquals(false, linkedBusiness2.equals(linkedBusiness3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASLinkedBusiness linkedBusiness1 = OASLinkedBusiness.getExample();
        OASLinkedBusiness linkedBusiness2 = new OASLinkedBusiness();

        System.assertEquals(linkedBusiness1.hashCode(), linkedBusiness1.hashCode());
        System.assertEquals(linkedBusiness2.hashCode(), linkedBusiness2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASLinkedBusiness linkedBusiness1 = OASLinkedBusiness.getExample();
        OASLinkedBusiness linkedBusiness2 = OASLinkedBusiness.getExample();
        OASLinkedBusiness linkedBusiness3 = new OASLinkedBusiness();
        OASLinkedBusiness linkedBusiness4 = new OASLinkedBusiness();

        System.assert(linkedBusiness1.equals(linkedBusiness2));
        System.assert(linkedBusiness3.equals(linkedBusiness4));
        System.assertEquals(linkedBusiness1.hashCode(), linkedBusiness2.hashCode());
        System.assertEquals(linkedBusiness3.hashCode(), linkedBusiness4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASLinkedBusiness linkedBusiness = new OASLinkedBusiness();
        Map<String, String> x-property-mappings = linkedBusiness.getx-property-mappings();
        System.assertEquals('imageSmallUrl', x-property-mappings.get('image_small_url'));
        System.assertEquals('imageMediumUrl', x-property-mappings.get('image_medium_url'));
        System.assertEquals('imageLargeUrl', x-property-mappings.get('image_large_url'));
        System.assertEquals('imageXlargeUrl', x-property-mappings.get('image_xlarge_url'));
    }
}
