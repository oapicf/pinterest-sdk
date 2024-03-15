@isTest
private class OASAdGroupCommonTrackingUrlsTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdGroupCommonTrackingUrls adGroupCommonTrackingUrls1 = OASAdGroupCommonTrackingUrls.getExample();
        OASAdGroupCommonTrackingUrls adGroupCommonTrackingUrls2 = adGroupCommonTrackingUrls1;
        OASAdGroupCommonTrackingUrls adGroupCommonTrackingUrls3 = new OASAdGroupCommonTrackingUrls();
        OASAdGroupCommonTrackingUrls adGroupCommonTrackingUrls4 = adGroupCommonTrackingUrls3;

        System.assert(adGroupCommonTrackingUrls1.equals(adGroupCommonTrackingUrls2));
        System.assert(adGroupCommonTrackingUrls2.equals(adGroupCommonTrackingUrls1));
        System.assert(adGroupCommonTrackingUrls1.equals(adGroupCommonTrackingUrls1));
        System.assert(adGroupCommonTrackingUrls3.equals(adGroupCommonTrackingUrls4));
        System.assert(adGroupCommonTrackingUrls4.equals(adGroupCommonTrackingUrls3));
        System.assert(adGroupCommonTrackingUrls3.equals(adGroupCommonTrackingUrls3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdGroupCommonTrackingUrls adGroupCommonTrackingUrls1 = OASAdGroupCommonTrackingUrls.getExample();
        OASAdGroupCommonTrackingUrls adGroupCommonTrackingUrls2 = OASAdGroupCommonTrackingUrls.getExample();
        OASAdGroupCommonTrackingUrls adGroupCommonTrackingUrls3 = new OASAdGroupCommonTrackingUrls();
        OASAdGroupCommonTrackingUrls adGroupCommonTrackingUrls4 = new OASAdGroupCommonTrackingUrls();

        System.assert(adGroupCommonTrackingUrls1.equals(adGroupCommonTrackingUrls2));
        System.assert(adGroupCommonTrackingUrls2.equals(adGroupCommonTrackingUrls1));
        System.assert(adGroupCommonTrackingUrls3.equals(adGroupCommonTrackingUrls4));
        System.assert(adGroupCommonTrackingUrls4.equals(adGroupCommonTrackingUrls3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdGroupCommonTrackingUrls adGroupCommonTrackingUrls1 = OASAdGroupCommonTrackingUrls.getExample();
        OASAdGroupCommonTrackingUrls adGroupCommonTrackingUrls2 = new OASAdGroupCommonTrackingUrls();

        System.assertEquals(false, adGroupCommonTrackingUrls1.equals('foo'));
        System.assertEquals(false, adGroupCommonTrackingUrls2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdGroupCommonTrackingUrls adGroupCommonTrackingUrls1 = OASAdGroupCommonTrackingUrls.getExample();
        OASAdGroupCommonTrackingUrls adGroupCommonTrackingUrls2 = new OASAdGroupCommonTrackingUrls();
        OASAdGroupCommonTrackingUrls adGroupCommonTrackingUrls3;

        System.assertEquals(false, adGroupCommonTrackingUrls1.equals(adGroupCommonTrackingUrls3));
        System.assertEquals(false, adGroupCommonTrackingUrls2.equals(adGroupCommonTrackingUrls3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdGroupCommonTrackingUrls adGroupCommonTrackingUrls1 = OASAdGroupCommonTrackingUrls.getExample();
        OASAdGroupCommonTrackingUrls adGroupCommonTrackingUrls2 = new OASAdGroupCommonTrackingUrls();

        System.assertEquals(adGroupCommonTrackingUrls1.hashCode(), adGroupCommonTrackingUrls1.hashCode());
        System.assertEquals(adGroupCommonTrackingUrls2.hashCode(), adGroupCommonTrackingUrls2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdGroupCommonTrackingUrls adGroupCommonTrackingUrls1 = OASAdGroupCommonTrackingUrls.getExample();
        OASAdGroupCommonTrackingUrls adGroupCommonTrackingUrls2 = OASAdGroupCommonTrackingUrls.getExample();
        OASAdGroupCommonTrackingUrls adGroupCommonTrackingUrls3 = new OASAdGroupCommonTrackingUrls();
        OASAdGroupCommonTrackingUrls adGroupCommonTrackingUrls4 = new OASAdGroupCommonTrackingUrls();

        System.assert(adGroupCommonTrackingUrls1.equals(adGroupCommonTrackingUrls2));
        System.assert(adGroupCommonTrackingUrls3.equals(adGroupCommonTrackingUrls4));
        System.assertEquals(adGroupCommonTrackingUrls1.hashCode(), adGroupCommonTrackingUrls2.hashCode());
        System.assertEquals(adGroupCommonTrackingUrls3.hashCode(), adGroupCommonTrackingUrls4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAdGroupCommonTrackingUrls adGroupCommonTrackingUrls = new OASAdGroupCommonTrackingUrls();
        Map<String, String> x-property-mappings = adGroupCommonTrackingUrls.getx-property-mappings();
        System.assertEquals('buyableButton', x-property-mappings.get('buyable_button'));
        System.assertEquals('audienceVerification', x-property-mappings.get('audience_verification'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAdGroupCommonTrackingUrls adGroupCommonTrackingUrls = new OASAdGroupCommonTrackingUrls();
        System.assertEquals(new List<String>(), adGroupCommonTrackingUrls.impression);
        System.assertEquals(new List<String>(), adGroupCommonTrackingUrls.click);
        System.assertEquals(new List<String>(), adGroupCommonTrackingUrls.engagement);
        System.assertEquals(new List<String>(), adGroupCommonTrackingUrls.buyableButton);
        System.assertEquals(new List<String>(), adGroupCommonTrackingUrls.audienceVerification);
    }
}
