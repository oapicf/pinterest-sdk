@isTest
private class OASUserWebsiteSummaryTest {
    @isTest
    private static void equalsSameInstance() {
        OASUserWebsiteSummary userWebsiteSummary1 = OASUserWebsiteSummary.getExample();
        OASUserWebsiteSummary userWebsiteSummary2 = userWebsiteSummary1;
        OASUserWebsiteSummary userWebsiteSummary3 = new OASUserWebsiteSummary();
        OASUserWebsiteSummary userWebsiteSummary4 = userWebsiteSummary3;

        System.assert(userWebsiteSummary1.equals(userWebsiteSummary2));
        System.assert(userWebsiteSummary2.equals(userWebsiteSummary1));
        System.assert(userWebsiteSummary1.equals(userWebsiteSummary1));
        System.assert(userWebsiteSummary3.equals(userWebsiteSummary4));
        System.assert(userWebsiteSummary4.equals(userWebsiteSummary3));
        System.assert(userWebsiteSummary3.equals(userWebsiteSummary3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUserWebsiteSummary userWebsiteSummary1 = OASUserWebsiteSummary.getExample();
        OASUserWebsiteSummary userWebsiteSummary2 = OASUserWebsiteSummary.getExample();
        OASUserWebsiteSummary userWebsiteSummary3 = new OASUserWebsiteSummary();
        OASUserWebsiteSummary userWebsiteSummary4 = new OASUserWebsiteSummary();

        System.assert(userWebsiteSummary1.equals(userWebsiteSummary2));
        System.assert(userWebsiteSummary2.equals(userWebsiteSummary1));
        System.assert(userWebsiteSummary3.equals(userWebsiteSummary4));
        System.assert(userWebsiteSummary4.equals(userWebsiteSummary3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUserWebsiteSummary userWebsiteSummary1 = OASUserWebsiteSummary.getExample();
        OASUserWebsiteSummary userWebsiteSummary2 = new OASUserWebsiteSummary();

        System.assertEquals(false, userWebsiteSummary1.equals('foo'));
        System.assertEquals(false, userWebsiteSummary2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUserWebsiteSummary userWebsiteSummary1 = OASUserWebsiteSummary.getExample();
        OASUserWebsiteSummary userWebsiteSummary2 = new OASUserWebsiteSummary();
        OASUserWebsiteSummary userWebsiteSummary3;

        System.assertEquals(false, userWebsiteSummary1.equals(userWebsiteSummary3));
        System.assertEquals(false, userWebsiteSummary2.equals(userWebsiteSummary3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUserWebsiteSummary userWebsiteSummary1 = OASUserWebsiteSummary.getExample();
        OASUserWebsiteSummary userWebsiteSummary2 = new OASUserWebsiteSummary();

        System.assertEquals(userWebsiteSummary1.hashCode(), userWebsiteSummary1.hashCode());
        System.assertEquals(userWebsiteSummary2.hashCode(), userWebsiteSummary2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUserWebsiteSummary userWebsiteSummary1 = OASUserWebsiteSummary.getExample();
        OASUserWebsiteSummary userWebsiteSummary2 = OASUserWebsiteSummary.getExample();
        OASUserWebsiteSummary userWebsiteSummary3 = new OASUserWebsiteSummary();
        OASUserWebsiteSummary userWebsiteSummary4 = new OASUserWebsiteSummary();

        System.assert(userWebsiteSummary1.equals(userWebsiteSummary2));
        System.assert(userWebsiteSummary3.equals(userWebsiteSummary4));
        System.assertEquals(userWebsiteSummary1.hashCode(), userWebsiteSummary2.hashCode());
        System.assertEquals(userWebsiteSummary3.hashCode(), userWebsiteSummary4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASUserWebsiteSummary userWebsiteSummary = new OASUserWebsiteSummary();
        Map<String, String> x-property-mappings = userWebsiteSummary.getx-property-mappings();
        System.assertEquals('verifiedAt', x-property-mappings.get('verified_at'));
    }
}
