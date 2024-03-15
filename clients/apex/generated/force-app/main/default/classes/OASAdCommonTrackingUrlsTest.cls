@isTest
private class OASAdCommonTrackingUrlsTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdCommonTrackingUrls adCommonTrackingUrls1 = OASAdCommonTrackingUrls.getExample();
        OASAdCommonTrackingUrls adCommonTrackingUrls2 = adCommonTrackingUrls1;
        OASAdCommonTrackingUrls adCommonTrackingUrls3 = new OASAdCommonTrackingUrls();
        OASAdCommonTrackingUrls adCommonTrackingUrls4 = adCommonTrackingUrls3;

        System.assert(adCommonTrackingUrls1.equals(adCommonTrackingUrls2));
        System.assert(adCommonTrackingUrls2.equals(adCommonTrackingUrls1));
        System.assert(adCommonTrackingUrls1.equals(adCommonTrackingUrls1));
        System.assert(adCommonTrackingUrls3.equals(adCommonTrackingUrls4));
        System.assert(adCommonTrackingUrls4.equals(adCommonTrackingUrls3));
        System.assert(adCommonTrackingUrls3.equals(adCommonTrackingUrls3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdCommonTrackingUrls adCommonTrackingUrls1 = OASAdCommonTrackingUrls.getExample();
        OASAdCommonTrackingUrls adCommonTrackingUrls2 = OASAdCommonTrackingUrls.getExample();
        OASAdCommonTrackingUrls adCommonTrackingUrls3 = new OASAdCommonTrackingUrls();
        OASAdCommonTrackingUrls adCommonTrackingUrls4 = new OASAdCommonTrackingUrls();

        System.assert(adCommonTrackingUrls1.equals(adCommonTrackingUrls2));
        System.assert(adCommonTrackingUrls2.equals(adCommonTrackingUrls1));
        System.assert(adCommonTrackingUrls3.equals(adCommonTrackingUrls4));
        System.assert(adCommonTrackingUrls4.equals(adCommonTrackingUrls3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdCommonTrackingUrls adCommonTrackingUrls1 = OASAdCommonTrackingUrls.getExample();
        OASAdCommonTrackingUrls adCommonTrackingUrls2 = new OASAdCommonTrackingUrls();

        System.assertEquals(false, adCommonTrackingUrls1.equals('foo'));
        System.assertEquals(false, adCommonTrackingUrls2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdCommonTrackingUrls adCommonTrackingUrls1 = OASAdCommonTrackingUrls.getExample();
        OASAdCommonTrackingUrls adCommonTrackingUrls2 = new OASAdCommonTrackingUrls();
        OASAdCommonTrackingUrls adCommonTrackingUrls3;

        System.assertEquals(false, adCommonTrackingUrls1.equals(adCommonTrackingUrls3));
        System.assertEquals(false, adCommonTrackingUrls2.equals(adCommonTrackingUrls3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdCommonTrackingUrls adCommonTrackingUrls1 = OASAdCommonTrackingUrls.getExample();
        OASAdCommonTrackingUrls adCommonTrackingUrls2 = new OASAdCommonTrackingUrls();

        System.assertEquals(adCommonTrackingUrls1.hashCode(), adCommonTrackingUrls1.hashCode());
        System.assertEquals(adCommonTrackingUrls2.hashCode(), adCommonTrackingUrls2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdCommonTrackingUrls adCommonTrackingUrls1 = OASAdCommonTrackingUrls.getExample();
        OASAdCommonTrackingUrls adCommonTrackingUrls2 = OASAdCommonTrackingUrls.getExample();
        OASAdCommonTrackingUrls adCommonTrackingUrls3 = new OASAdCommonTrackingUrls();
        OASAdCommonTrackingUrls adCommonTrackingUrls4 = new OASAdCommonTrackingUrls();

        System.assert(adCommonTrackingUrls1.equals(adCommonTrackingUrls2));
        System.assert(adCommonTrackingUrls3.equals(adCommonTrackingUrls4));
        System.assertEquals(adCommonTrackingUrls1.hashCode(), adCommonTrackingUrls2.hashCode());
        System.assertEquals(adCommonTrackingUrls3.hashCode(), adCommonTrackingUrls4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAdCommonTrackingUrls adCommonTrackingUrls = new OASAdCommonTrackingUrls();
        Map<String, String> x-property-mappings = adCommonTrackingUrls.getx-property-mappings();
        System.assertEquals('buyableButton', x-property-mappings.get('buyable_button'));
        System.assertEquals('audienceVerification', x-property-mappings.get('audience_verification'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAdCommonTrackingUrls adCommonTrackingUrls = new OASAdCommonTrackingUrls();
        System.assertEquals(new List<String>(), adCommonTrackingUrls.impression);
        System.assertEquals(new List<String>(), adCommonTrackingUrls.click);
        System.assertEquals(new List<String>(), adCommonTrackingUrls.engagement);
        System.assertEquals(new List<String>(), adCommonTrackingUrls.buyableButton);
        System.assertEquals(new List<String>(), adCommonTrackingUrls.audienceVerification);
    }
}
