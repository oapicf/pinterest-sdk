@isTest
private class OASTrackingUrlsTest {
    @isTest
    private static void equalsSameInstance() {
        OASTrackingUrls trackingUrls1 = OASTrackingUrls.getExample();
        OASTrackingUrls trackingUrls2 = trackingUrls1;
        OASTrackingUrls trackingUrls3 = new OASTrackingUrls();
        OASTrackingUrls trackingUrls4 = trackingUrls3;

        System.assert(trackingUrls1.equals(trackingUrls2));
        System.assert(trackingUrls2.equals(trackingUrls1));
        System.assert(trackingUrls1.equals(trackingUrls1));
        System.assert(trackingUrls3.equals(trackingUrls4));
        System.assert(trackingUrls4.equals(trackingUrls3));
        System.assert(trackingUrls3.equals(trackingUrls3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTrackingUrls trackingUrls1 = OASTrackingUrls.getExample();
        OASTrackingUrls trackingUrls2 = OASTrackingUrls.getExample();
        OASTrackingUrls trackingUrls3 = new OASTrackingUrls();
        OASTrackingUrls trackingUrls4 = new OASTrackingUrls();

        System.assert(trackingUrls1.equals(trackingUrls2));
        System.assert(trackingUrls2.equals(trackingUrls1));
        System.assert(trackingUrls3.equals(trackingUrls4));
        System.assert(trackingUrls4.equals(trackingUrls3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTrackingUrls trackingUrls1 = OASTrackingUrls.getExample();
        OASTrackingUrls trackingUrls2 = new OASTrackingUrls();

        System.assertEquals(false, trackingUrls1.equals('foo'));
        System.assertEquals(false, trackingUrls2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTrackingUrls trackingUrls1 = OASTrackingUrls.getExample();
        OASTrackingUrls trackingUrls2 = new OASTrackingUrls();
        OASTrackingUrls trackingUrls3;

        System.assertEquals(false, trackingUrls1.equals(trackingUrls3));
        System.assertEquals(false, trackingUrls2.equals(trackingUrls3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTrackingUrls trackingUrls1 = OASTrackingUrls.getExample();
        OASTrackingUrls trackingUrls2 = new OASTrackingUrls();

        System.assertEquals(trackingUrls1.hashCode(), trackingUrls1.hashCode());
        System.assertEquals(trackingUrls2.hashCode(), trackingUrls2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTrackingUrls trackingUrls1 = OASTrackingUrls.getExample();
        OASTrackingUrls trackingUrls2 = OASTrackingUrls.getExample();
        OASTrackingUrls trackingUrls3 = new OASTrackingUrls();
        OASTrackingUrls trackingUrls4 = new OASTrackingUrls();

        System.assert(trackingUrls1.equals(trackingUrls2));
        System.assert(trackingUrls3.equals(trackingUrls4));
        System.assertEquals(trackingUrls1.hashCode(), trackingUrls2.hashCode());
        System.assertEquals(trackingUrls3.hashCode(), trackingUrls4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASTrackingUrls trackingUrls = new OASTrackingUrls();
        Map<String, String> x-property-mappings = trackingUrls.getx-property-mappings();
        System.assertEquals('buyableButton', x-property-mappings.get('buyable_button'));
        System.assertEquals('audienceVerification', x-property-mappings.get('audience_verification'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASTrackingUrls trackingUrls = new OASTrackingUrls();
        System.assertEquals(new List<String>(), trackingUrls.impression);
        System.assertEquals(new List<String>(), trackingUrls.click);
        System.assertEquals(new List<String>(), trackingUrls.engagement);
        System.assertEquals(new List<String>(), trackingUrls.buyableButton);
        System.assertEquals(new List<String>(), trackingUrls.audienceVerification);
    }
}
