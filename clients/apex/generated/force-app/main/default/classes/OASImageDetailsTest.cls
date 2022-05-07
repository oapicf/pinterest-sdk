@isTest
private class OASImageDetailsTest {
    @isTest
    private static void equalsSameInstance() {
        OASImageDetails imageDetails1 = OASImageDetails.getExample();
        OASImageDetails imageDetails2 = imageDetails1;
        OASImageDetails imageDetails3 = new OASImageDetails();
        OASImageDetails imageDetails4 = imageDetails3;

        System.assert(imageDetails1.equals(imageDetails2));
        System.assert(imageDetails2.equals(imageDetails1));
        System.assert(imageDetails1.equals(imageDetails1));
        System.assert(imageDetails3.equals(imageDetails4));
        System.assert(imageDetails4.equals(imageDetails3));
        System.assert(imageDetails3.equals(imageDetails3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASImageDetails imageDetails1 = OASImageDetails.getExample();
        OASImageDetails imageDetails2 = OASImageDetails.getExample();
        OASImageDetails imageDetails3 = new OASImageDetails();
        OASImageDetails imageDetails4 = new OASImageDetails();

        System.assert(imageDetails1.equals(imageDetails2));
        System.assert(imageDetails2.equals(imageDetails1));
        System.assert(imageDetails3.equals(imageDetails4));
        System.assert(imageDetails4.equals(imageDetails3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASImageDetails imageDetails1 = OASImageDetails.getExample();
        OASImageDetails imageDetails2 = new OASImageDetails();

        System.assertEquals(false, imageDetails1.equals('foo'));
        System.assertEquals(false, imageDetails2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASImageDetails imageDetails1 = OASImageDetails.getExample();
        OASImageDetails imageDetails2 = new OASImageDetails();
        OASImageDetails imageDetails3;

        System.assertEquals(false, imageDetails1.equals(imageDetails3));
        System.assertEquals(false, imageDetails2.equals(imageDetails3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASImageDetails imageDetails1 = OASImageDetails.getExample();
        OASImageDetails imageDetails2 = new OASImageDetails();

        System.assertEquals(imageDetails1.hashCode(), imageDetails1.hashCode());
        System.assertEquals(imageDetails2.hashCode(), imageDetails2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASImageDetails imageDetails1 = OASImageDetails.getExample();
        OASImageDetails imageDetails2 = OASImageDetails.getExample();
        OASImageDetails imageDetails3 = new OASImageDetails();
        OASImageDetails imageDetails4 = new OASImageDetails();

        System.assert(imageDetails1.equals(imageDetails2));
        System.assert(imageDetails3.equals(imageDetails4));
        System.assertEquals(imageDetails1.hashCode(), imageDetails2.hashCode());
        System.assertEquals(imageDetails3.hashCode(), imageDetails4.hashCode());
    }
}
