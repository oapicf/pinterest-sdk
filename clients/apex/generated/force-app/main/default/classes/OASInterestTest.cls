@isTest
private class OASInterestTest {
    @isTest
    private static void equalsSameInstance() {
        OASInterest interest1 = OASInterest.getExample();
        OASInterest interest2 = interest1;
        OASInterest interest3 = new OASInterest();
        OASInterest interest4 = interest3;

        System.assert(interest1.equals(interest2));
        System.assert(interest2.equals(interest1));
        System.assert(interest1.equals(interest1));
        System.assert(interest3.equals(interest4));
        System.assert(interest4.equals(interest3));
        System.assert(interest3.equals(interest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASInterest interest1 = OASInterest.getExample();
        OASInterest interest2 = OASInterest.getExample();
        OASInterest interest3 = new OASInterest();
        OASInterest interest4 = new OASInterest();

        System.assert(interest1.equals(interest2));
        System.assert(interest2.equals(interest1));
        System.assert(interest3.equals(interest4));
        System.assert(interest4.equals(interest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASInterest interest1 = OASInterest.getExample();
        OASInterest interest2 = new OASInterest();

        System.assertEquals(false, interest1.equals('foo'));
        System.assertEquals(false, interest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASInterest interest1 = OASInterest.getExample();
        OASInterest interest2 = new OASInterest();
        OASInterest interest3;

        System.assertEquals(false, interest1.equals(interest3));
        System.assertEquals(false, interest2.equals(interest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASInterest interest1 = OASInterest.getExample();
        OASInterest interest2 = new OASInterest();

        System.assertEquals(interest1.hashCode(), interest1.hashCode());
        System.assertEquals(interest2.hashCode(), interest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASInterest interest1 = OASInterest.getExample();
        OASInterest interest2 = OASInterest.getExample();
        OASInterest interest3 = new OASInterest();
        OASInterest interest4 = new OASInterest();

        System.assert(interest1.equals(interest2));
        System.assert(interest3.equals(interest4));
        System.assertEquals(interest1.hashCode(), interest2.hashCode());
        System.assertEquals(interest3.hashCode(), interest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASInterest interest = new OASInterest();
        Map<String, String> x-property-mappings = interest.getx-property-mappings();
        System.assertEquals('canonicalUrl', x-property-mappings.get('canonical_url'));
    }
}
