@isTest
private class OASAdGroupsAnalyticsResponseInnerTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdGroupsAnalyticsResponseInner adGroupsAnalyticsResponseInner1 = OASAdGroupsAnalyticsResponseInner.getExample();
        OASAdGroupsAnalyticsResponseInner adGroupsAnalyticsResponseInner2 = adGroupsAnalyticsResponseInner1;
        OASAdGroupsAnalyticsResponseInner adGroupsAnalyticsResponseInner3 = new OASAdGroupsAnalyticsResponseInner();
        OASAdGroupsAnalyticsResponseInner adGroupsAnalyticsResponseInner4 = adGroupsAnalyticsResponseInner3;

        System.assert(adGroupsAnalyticsResponseInner1.equals(adGroupsAnalyticsResponseInner2));
        System.assert(adGroupsAnalyticsResponseInner2.equals(adGroupsAnalyticsResponseInner1));
        System.assert(adGroupsAnalyticsResponseInner1.equals(adGroupsAnalyticsResponseInner1));
        System.assert(adGroupsAnalyticsResponseInner3.equals(adGroupsAnalyticsResponseInner4));
        System.assert(adGroupsAnalyticsResponseInner4.equals(adGroupsAnalyticsResponseInner3));
        System.assert(adGroupsAnalyticsResponseInner3.equals(adGroupsAnalyticsResponseInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdGroupsAnalyticsResponseInner adGroupsAnalyticsResponseInner1 = OASAdGroupsAnalyticsResponseInner.getExample();
        OASAdGroupsAnalyticsResponseInner adGroupsAnalyticsResponseInner2 = OASAdGroupsAnalyticsResponseInner.getExample();
        OASAdGroupsAnalyticsResponseInner adGroupsAnalyticsResponseInner3 = new OASAdGroupsAnalyticsResponseInner();
        OASAdGroupsAnalyticsResponseInner adGroupsAnalyticsResponseInner4 = new OASAdGroupsAnalyticsResponseInner();

        System.assert(adGroupsAnalyticsResponseInner1.equals(adGroupsAnalyticsResponseInner2));
        System.assert(adGroupsAnalyticsResponseInner2.equals(adGroupsAnalyticsResponseInner1));
        System.assert(adGroupsAnalyticsResponseInner3.equals(adGroupsAnalyticsResponseInner4));
        System.assert(adGroupsAnalyticsResponseInner4.equals(adGroupsAnalyticsResponseInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdGroupsAnalyticsResponseInner adGroupsAnalyticsResponseInner1 = OASAdGroupsAnalyticsResponseInner.getExample();
        OASAdGroupsAnalyticsResponseInner adGroupsAnalyticsResponseInner2 = new OASAdGroupsAnalyticsResponseInner();

        System.assertEquals(false, adGroupsAnalyticsResponseInner1.equals('foo'));
        System.assertEquals(false, adGroupsAnalyticsResponseInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdGroupsAnalyticsResponseInner adGroupsAnalyticsResponseInner1 = OASAdGroupsAnalyticsResponseInner.getExample();
        OASAdGroupsAnalyticsResponseInner adGroupsAnalyticsResponseInner2 = new OASAdGroupsAnalyticsResponseInner();
        OASAdGroupsAnalyticsResponseInner adGroupsAnalyticsResponseInner3;

        System.assertEquals(false, adGroupsAnalyticsResponseInner1.equals(adGroupsAnalyticsResponseInner3));
        System.assertEquals(false, adGroupsAnalyticsResponseInner2.equals(adGroupsAnalyticsResponseInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdGroupsAnalyticsResponseInner adGroupsAnalyticsResponseInner1 = OASAdGroupsAnalyticsResponseInner.getExample();
        OASAdGroupsAnalyticsResponseInner adGroupsAnalyticsResponseInner2 = new OASAdGroupsAnalyticsResponseInner();

        System.assertEquals(adGroupsAnalyticsResponseInner1.hashCode(), adGroupsAnalyticsResponseInner1.hashCode());
        System.assertEquals(adGroupsAnalyticsResponseInner2.hashCode(), adGroupsAnalyticsResponseInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdGroupsAnalyticsResponseInner adGroupsAnalyticsResponseInner1 = OASAdGroupsAnalyticsResponseInner.getExample();
        OASAdGroupsAnalyticsResponseInner adGroupsAnalyticsResponseInner2 = OASAdGroupsAnalyticsResponseInner.getExample();
        OASAdGroupsAnalyticsResponseInner adGroupsAnalyticsResponseInner3 = new OASAdGroupsAnalyticsResponseInner();
        OASAdGroupsAnalyticsResponseInner adGroupsAnalyticsResponseInner4 = new OASAdGroupsAnalyticsResponseInner();

        System.assert(adGroupsAnalyticsResponseInner1.equals(adGroupsAnalyticsResponseInner2));
        System.assert(adGroupsAnalyticsResponseInner3.equals(adGroupsAnalyticsResponseInner4));
        System.assertEquals(adGroupsAnalyticsResponseInner1.hashCode(), adGroupsAnalyticsResponseInner2.hashCode());
        System.assertEquals(adGroupsAnalyticsResponseInner3.hashCode(), adGroupsAnalyticsResponseInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAdGroupsAnalyticsResponseInner adGroupsAnalyticsResponseInner = new OASAdGroupsAnalyticsResponseInner();
        Map<String, String> x-property-mappings = adGroupsAnalyticsResponseInner.getx-property-mappings();
        System.assertEquals('r_DATE', x-property-mappings.get('DATE'));
    }
}
