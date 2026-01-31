@isTest
private class OASAdPinAnalyticsTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdPinAnalytics adPinAnalytics1 = OASAdPinAnalytics.getExample();
        OASAdPinAnalytics adPinAnalytics2 = adPinAnalytics1;
        OASAdPinAnalytics adPinAnalytics3 = new OASAdPinAnalytics();
        OASAdPinAnalytics adPinAnalytics4 = adPinAnalytics3;

        System.assert(adPinAnalytics1.equals(adPinAnalytics2));
        System.assert(adPinAnalytics2.equals(adPinAnalytics1));
        System.assert(adPinAnalytics1.equals(adPinAnalytics1));
        System.assert(adPinAnalytics3.equals(adPinAnalytics4));
        System.assert(adPinAnalytics4.equals(adPinAnalytics3));
        System.assert(adPinAnalytics3.equals(adPinAnalytics3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdPinAnalytics adPinAnalytics1 = OASAdPinAnalytics.getExample();
        OASAdPinAnalytics adPinAnalytics2 = OASAdPinAnalytics.getExample();
        OASAdPinAnalytics adPinAnalytics3 = new OASAdPinAnalytics();
        OASAdPinAnalytics adPinAnalytics4 = new OASAdPinAnalytics();

        System.assert(adPinAnalytics1.equals(adPinAnalytics2));
        System.assert(adPinAnalytics2.equals(adPinAnalytics1));
        System.assert(adPinAnalytics3.equals(adPinAnalytics4));
        System.assert(adPinAnalytics4.equals(adPinAnalytics3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdPinAnalytics adPinAnalytics1 = OASAdPinAnalytics.getExample();
        OASAdPinAnalytics adPinAnalytics2 = new OASAdPinAnalytics();

        System.assertEquals(false, adPinAnalytics1.equals('foo'));
        System.assertEquals(false, adPinAnalytics2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdPinAnalytics adPinAnalytics1 = OASAdPinAnalytics.getExample();
        OASAdPinAnalytics adPinAnalytics2 = new OASAdPinAnalytics();
        OASAdPinAnalytics adPinAnalytics3;

        System.assertEquals(false, adPinAnalytics1.equals(adPinAnalytics3));
        System.assertEquals(false, adPinAnalytics2.equals(adPinAnalytics3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdPinAnalytics adPinAnalytics1 = OASAdPinAnalytics.getExample();
        OASAdPinAnalytics adPinAnalytics2 = new OASAdPinAnalytics();

        System.assertEquals(adPinAnalytics1.hashCode(), adPinAnalytics1.hashCode());
        System.assertEquals(adPinAnalytics2.hashCode(), adPinAnalytics2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdPinAnalytics adPinAnalytics1 = OASAdPinAnalytics.getExample();
        OASAdPinAnalytics adPinAnalytics2 = OASAdPinAnalytics.getExample();
        OASAdPinAnalytics adPinAnalytics3 = new OASAdPinAnalytics();
        OASAdPinAnalytics adPinAnalytics4 = new OASAdPinAnalytics();

        System.assert(adPinAnalytics1.equals(adPinAnalytics2));
        System.assert(adPinAnalytics3.equals(adPinAnalytics4));
        System.assertEquals(adPinAnalytics1.hashCode(), adPinAnalytics2.hashCode());
        System.assertEquals(adPinAnalytics3.hashCode(), adPinAnalytics4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAdPinAnalytics adPinAnalytics = new OASAdPinAnalytics();
        Map<String, String> x-property-mappings = adPinAnalytics.getx-property-mappings();
        System.assertEquals('r_DATE', x-property-mappings.get('DATE'));
    }
}
