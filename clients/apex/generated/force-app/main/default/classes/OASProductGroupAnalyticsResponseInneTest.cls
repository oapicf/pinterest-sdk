@isTest
private class OASProductGroupAnalyticsResponseInneTest {
    @isTest
    private static void equalsSameInstance() {
        OASProductGroupAnalyticsResponseInne productGroupAnalyticsResponseInner1 = OASProductGroupAnalyticsResponseInne.getExample();
        OASProductGroupAnalyticsResponseInne productGroupAnalyticsResponseInner2 = productGroupAnalyticsResponseInner1;
        OASProductGroupAnalyticsResponseInne productGroupAnalyticsResponseInner3 = new OASProductGroupAnalyticsResponseInne();
        OASProductGroupAnalyticsResponseInne productGroupAnalyticsResponseInner4 = productGroupAnalyticsResponseInner3;

        System.assert(productGroupAnalyticsResponseInner1.equals(productGroupAnalyticsResponseInner2));
        System.assert(productGroupAnalyticsResponseInner2.equals(productGroupAnalyticsResponseInner1));
        System.assert(productGroupAnalyticsResponseInner1.equals(productGroupAnalyticsResponseInner1));
        System.assert(productGroupAnalyticsResponseInner3.equals(productGroupAnalyticsResponseInner4));
        System.assert(productGroupAnalyticsResponseInner4.equals(productGroupAnalyticsResponseInner3));
        System.assert(productGroupAnalyticsResponseInner3.equals(productGroupAnalyticsResponseInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASProductGroupAnalyticsResponseInne productGroupAnalyticsResponseInner1 = OASProductGroupAnalyticsResponseInne.getExample();
        OASProductGroupAnalyticsResponseInne productGroupAnalyticsResponseInner2 = OASProductGroupAnalyticsResponseInne.getExample();
        OASProductGroupAnalyticsResponseInne productGroupAnalyticsResponseInner3 = new OASProductGroupAnalyticsResponseInne();
        OASProductGroupAnalyticsResponseInne productGroupAnalyticsResponseInner4 = new OASProductGroupAnalyticsResponseInne();

        System.assert(productGroupAnalyticsResponseInner1.equals(productGroupAnalyticsResponseInner2));
        System.assert(productGroupAnalyticsResponseInner2.equals(productGroupAnalyticsResponseInner1));
        System.assert(productGroupAnalyticsResponseInner3.equals(productGroupAnalyticsResponseInner4));
        System.assert(productGroupAnalyticsResponseInner4.equals(productGroupAnalyticsResponseInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASProductGroupAnalyticsResponseInne productGroupAnalyticsResponseInner1 = OASProductGroupAnalyticsResponseInne.getExample();
        OASProductGroupAnalyticsResponseInne productGroupAnalyticsResponseInner2 = new OASProductGroupAnalyticsResponseInne();

        System.assertEquals(false, productGroupAnalyticsResponseInner1.equals('foo'));
        System.assertEquals(false, productGroupAnalyticsResponseInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASProductGroupAnalyticsResponseInne productGroupAnalyticsResponseInner1 = OASProductGroupAnalyticsResponseInne.getExample();
        OASProductGroupAnalyticsResponseInne productGroupAnalyticsResponseInner2 = new OASProductGroupAnalyticsResponseInne();
        OASProductGroupAnalyticsResponseInne productGroupAnalyticsResponseInner3;

        System.assertEquals(false, productGroupAnalyticsResponseInner1.equals(productGroupAnalyticsResponseInner3));
        System.assertEquals(false, productGroupAnalyticsResponseInner2.equals(productGroupAnalyticsResponseInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASProductGroupAnalyticsResponseInne productGroupAnalyticsResponseInner1 = OASProductGroupAnalyticsResponseInne.getExample();
        OASProductGroupAnalyticsResponseInne productGroupAnalyticsResponseInner2 = new OASProductGroupAnalyticsResponseInne();

        System.assertEquals(productGroupAnalyticsResponseInner1.hashCode(), productGroupAnalyticsResponseInner1.hashCode());
        System.assertEquals(productGroupAnalyticsResponseInner2.hashCode(), productGroupAnalyticsResponseInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASProductGroupAnalyticsResponseInne productGroupAnalyticsResponseInner1 = OASProductGroupAnalyticsResponseInne.getExample();
        OASProductGroupAnalyticsResponseInne productGroupAnalyticsResponseInner2 = OASProductGroupAnalyticsResponseInne.getExample();
        OASProductGroupAnalyticsResponseInne productGroupAnalyticsResponseInner3 = new OASProductGroupAnalyticsResponseInne();
        OASProductGroupAnalyticsResponseInne productGroupAnalyticsResponseInner4 = new OASProductGroupAnalyticsResponseInne();

        System.assert(productGroupAnalyticsResponseInner1.equals(productGroupAnalyticsResponseInner2));
        System.assert(productGroupAnalyticsResponseInner3.equals(productGroupAnalyticsResponseInner4));
        System.assertEquals(productGroupAnalyticsResponseInner1.hashCode(), productGroupAnalyticsResponseInner2.hashCode());
        System.assertEquals(productGroupAnalyticsResponseInner3.hashCode(), productGroupAnalyticsResponseInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASProductGroupAnalyticsResponseInne productGroupAnalyticsResponseInner = new OASProductGroupAnalyticsResponseInne();
        Map<String, String> x-property-mappings = productGroupAnalyticsResponseInner.getx-property-mappings();
        System.assertEquals('r_DATE', x-property-mappings.get('DATE'));
    }
}
