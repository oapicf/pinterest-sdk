@isTest
private class OASAdAccountAnalyticsResponseInnerTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdAccountAnalyticsResponseInner adAccountAnalyticsResponseInner1 = OASAdAccountAnalyticsResponseInner.getExample();
        OASAdAccountAnalyticsResponseInner adAccountAnalyticsResponseInner2 = adAccountAnalyticsResponseInner1;
        OASAdAccountAnalyticsResponseInner adAccountAnalyticsResponseInner3 = new OASAdAccountAnalyticsResponseInner();
        OASAdAccountAnalyticsResponseInner adAccountAnalyticsResponseInner4 = adAccountAnalyticsResponseInner3;

        System.assert(adAccountAnalyticsResponseInner1.equals(adAccountAnalyticsResponseInner2));
        System.assert(adAccountAnalyticsResponseInner2.equals(adAccountAnalyticsResponseInner1));
        System.assert(adAccountAnalyticsResponseInner1.equals(adAccountAnalyticsResponseInner1));
        System.assert(adAccountAnalyticsResponseInner3.equals(adAccountAnalyticsResponseInner4));
        System.assert(adAccountAnalyticsResponseInner4.equals(adAccountAnalyticsResponseInner3));
        System.assert(adAccountAnalyticsResponseInner3.equals(adAccountAnalyticsResponseInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdAccountAnalyticsResponseInner adAccountAnalyticsResponseInner1 = OASAdAccountAnalyticsResponseInner.getExample();
        OASAdAccountAnalyticsResponseInner adAccountAnalyticsResponseInner2 = OASAdAccountAnalyticsResponseInner.getExample();
        OASAdAccountAnalyticsResponseInner adAccountAnalyticsResponseInner3 = new OASAdAccountAnalyticsResponseInner();
        OASAdAccountAnalyticsResponseInner adAccountAnalyticsResponseInner4 = new OASAdAccountAnalyticsResponseInner();

        System.assert(adAccountAnalyticsResponseInner1.equals(adAccountAnalyticsResponseInner2));
        System.assert(adAccountAnalyticsResponseInner2.equals(adAccountAnalyticsResponseInner1));
        System.assert(adAccountAnalyticsResponseInner3.equals(adAccountAnalyticsResponseInner4));
        System.assert(adAccountAnalyticsResponseInner4.equals(adAccountAnalyticsResponseInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdAccountAnalyticsResponseInner adAccountAnalyticsResponseInner1 = OASAdAccountAnalyticsResponseInner.getExample();
        OASAdAccountAnalyticsResponseInner adAccountAnalyticsResponseInner2 = new OASAdAccountAnalyticsResponseInner();

        System.assertEquals(false, adAccountAnalyticsResponseInner1.equals('foo'));
        System.assertEquals(false, adAccountAnalyticsResponseInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdAccountAnalyticsResponseInner adAccountAnalyticsResponseInner1 = OASAdAccountAnalyticsResponseInner.getExample();
        OASAdAccountAnalyticsResponseInner adAccountAnalyticsResponseInner2 = new OASAdAccountAnalyticsResponseInner();
        OASAdAccountAnalyticsResponseInner adAccountAnalyticsResponseInner3;

        System.assertEquals(false, adAccountAnalyticsResponseInner1.equals(adAccountAnalyticsResponseInner3));
        System.assertEquals(false, adAccountAnalyticsResponseInner2.equals(adAccountAnalyticsResponseInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdAccountAnalyticsResponseInner adAccountAnalyticsResponseInner1 = OASAdAccountAnalyticsResponseInner.getExample();
        OASAdAccountAnalyticsResponseInner adAccountAnalyticsResponseInner2 = new OASAdAccountAnalyticsResponseInner();

        System.assertEquals(adAccountAnalyticsResponseInner1.hashCode(), adAccountAnalyticsResponseInner1.hashCode());
        System.assertEquals(adAccountAnalyticsResponseInner2.hashCode(), adAccountAnalyticsResponseInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdAccountAnalyticsResponseInner adAccountAnalyticsResponseInner1 = OASAdAccountAnalyticsResponseInner.getExample();
        OASAdAccountAnalyticsResponseInner adAccountAnalyticsResponseInner2 = OASAdAccountAnalyticsResponseInner.getExample();
        OASAdAccountAnalyticsResponseInner adAccountAnalyticsResponseInner3 = new OASAdAccountAnalyticsResponseInner();
        OASAdAccountAnalyticsResponseInner adAccountAnalyticsResponseInner4 = new OASAdAccountAnalyticsResponseInner();

        System.assert(adAccountAnalyticsResponseInner1.equals(adAccountAnalyticsResponseInner2));
        System.assert(adAccountAnalyticsResponseInner3.equals(adAccountAnalyticsResponseInner4));
        System.assertEquals(adAccountAnalyticsResponseInner1.hashCode(), adAccountAnalyticsResponseInner2.hashCode());
        System.assertEquals(adAccountAnalyticsResponseInner3.hashCode(), adAccountAnalyticsResponseInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAdAccountAnalyticsResponseInner adAccountAnalyticsResponseInner = new OASAdAccountAnalyticsResponseInner();
        Map<String, String> x-property-mappings = adAccountAnalyticsResponseInner.getx-property-mappings();
        System.assertEquals('r_DATE', x-property-mappings.get('DATE'));
    }
}
