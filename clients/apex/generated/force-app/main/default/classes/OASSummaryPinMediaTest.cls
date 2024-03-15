@isTest
private class OASSummaryPinMediaTest {
    @isTest
    private static void equalsSameInstance() {
        OASSummaryPinMedia summaryPinMedia1 = OASSummaryPinMedia.getExample();
        OASSummaryPinMedia summaryPinMedia2 = summaryPinMedia1;
        OASSummaryPinMedia summaryPinMedia3 = new OASSummaryPinMedia();
        OASSummaryPinMedia summaryPinMedia4 = summaryPinMedia3;

        System.assert(summaryPinMedia1.equals(summaryPinMedia2));
        System.assert(summaryPinMedia2.equals(summaryPinMedia1));
        System.assert(summaryPinMedia1.equals(summaryPinMedia1));
        System.assert(summaryPinMedia3.equals(summaryPinMedia4));
        System.assert(summaryPinMedia4.equals(summaryPinMedia3));
        System.assert(summaryPinMedia3.equals(summaryPinMedia3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASSummaryPinMedia summaryPinMedia1 = OASSummaryPinMedia.getExample();
        OASSummaryPinMedia summaryPinMedia2 = OASSummaryPinMedia.getExample();
        OASSummaryPinMedia summaryPinMedia3 = new OASSummaryPinMedia();
        OASSummaryPinMedia summaryPinMedia4 = new OASSummaryPinMedia();

        System.assert(summaryPinMedia1.equals(summaryPinMedia2));
        System.assert(summaryPinMedia2.equals(summaryPinMedia1));
        System.assert(summaryPinMedia3.equals(summaryPinMedia4));
        System.assert(summaryPinMedia4.equals(summaryPinMedia3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASSummaryPinMedia summaryPinMedia1 = OASSummaryPinMedia.getExample();
        OASSummaryPinMedia summaryPinMedia2 = new OASSummaryPinMedia();

        System.assertEquals(false, summaryPinMedia1.equals('foo'));
        System.assertEquals(false, summaryPinMedia2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASSummaryPinMedia summaryPinMedia1 = OASSummaryPinMedia.getExample();
        OASSummaryPinMedia summaryPinMedia2 = new OASSummaryPinMedia();
        OASSummaryPinMedia summaryPinMedia3;

        System.assertEquals(false, summaryPinMedia1.equals(summaryPinMedia3));
        System.assertEquals(false, summaryPinMedia2.equals(summaryPinMedia3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASSummaryPinMedia summaryPinMedia1 = OASSummaryPinMedia.getExample();
        OASSummaryPinMedia summaryPinMedia2 = new OASSummaryPinMedia();

        System.assertEquals(summaryPinMedia1.hashCode(), summaryPinMedia1.hashCode());
        System.assertEquals(summaryPinMedia2.hashCode(), summaryPinMedia2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASSummaryPinMedia summaryPinMedia1 = OASSummaryPinMedia.getExample();
        OASSummaryPinMedia summaryPinMedia2 = OASSummaryPinMedia.getExample();
        OASSummaryPinMedia summaryPinMedia3 = new OASSummaryPinMedia();
        OASSummaryPinMedia summaryPinMedia4 = new OASSummaryPinMedia();

        System.assert(summaryPinMedia1.equals(summaryPinMedia2));
        System.assert(summaryPinMedia3.equals(summaryPinMedia4));
        System.assertEquals(summaryPinMedia1.hashCode(), summaryPinMedia2.hashCode());
        System.assertEquals(summaryPinMedia3.hashCode(), summaryPinMedia4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASSummaryPinMedia summaryPinMedia = new OASSummaryPinMedia();
        Map<String, String> x-property-mappings = summaryPinMedia.getx-property-mappings();
        System.assertEquals('mediaType', x-property-mappings.get('media_type'));
    }
}
