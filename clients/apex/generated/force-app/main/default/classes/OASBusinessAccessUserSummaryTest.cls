@isTest
private class OASBusinessAccessUserSummaryTest {
    @isTest
    private static void equalsSameInstance() {
        OASBusinessAccessUserSummary businessAccessUserSummary1 = OASBusinessAccessUserSummary.getExample();
        OASBusinessAccessUserSummary businessAccessUserSummary2 = businessAccessUserSummary1;
        OASBusinessAccessUserSummary businessAccessUserSummary3 = new OASBusinessAccessUserSummary();
        OASBusinessAccessUserSummary businessAccessUserSummary4 = businessAccessUserSummary3;

        System.assert(businessAccessUserSummary1.equals(businessAccessUserSummary2));
        System.assert(businessAccessUserSummary2.equals(businessAccessUserSummary1));
        System.assert(businessAccessUserSummary1.equals(businessAccessUserSummary1));
        System.assert(businessAccessUserSummary3.equals(businessAccessUserSummary4));
        System.assert(businessAccessUserSummary4.equals(businessAccessUserSummary3));
        System.assert(businessAccessUserSummary3.equals(businessAccessUserSummary3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBusinessAccessUserSummary businessAccessUserSummary1 = OASBusinessAccessUserSummary.getExample();
        OASBusinessAccessUserSummary businessAccessUserSummary2 = OASBusinessAccessUserSummary.getExample();
        OASBusinessAccessUserSummary businessAccessUserSummary3 = new OASBusinessAccessUserSummary();
        OASBusinessAccessUserSummary businessAccessUserSummary4 = new OASBusinessAccessUserSummary();

        System.assert(businessAccessUserSummary1.equals(businessAccessUserSummary2));
        System.assert(businessAccessUserSummary2.equals(businessAccessUserSummary1));
        System.assert(businessAccessUserSummary3.equals(businessAccessUserSummary4));
        System.assert(businessAccessUserSummary4.equals(businessAccessUserSummary3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBusinessAccessUserSummary businessAccessUserSummary1 = OASBusinessAccessUserSummary.getExample();
        OASBusinessAccessUserSummary businessAccessUserSummary2 = new OASBusinessAccessUserSummary();

        System.assertEquals(false, businessAccessUserSummary1.equals('foo'));
        System.assertEquals(false, businessAccessUserSummary2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBusinessAccessUserSummary businessAccessUserSummary1 = OASBusinessAccessUserSummary.getExample();
        OASBusinessAccessUserSummary businessAccessUserSummary2 = new OASBusinessAccessUserSummary();
        OASBusinessAccessUserSummary businessAccessUserSummary3;

        System.assertEquals(false, businessAccessUserSummary1.equals(businessAccessUserSummary3));
        System.assertEquals(false, businessAccessUserSummary2.equals(businessAccessUserSummary3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBusinessAccessUserSummary businessAccessUserSummary1 = OASBusinessAccessUserSummary.getExample();
        OASBusinessAccessUserSummary businessAccessUserSummary2 = new OASBusinessAccessUserSummary();

        System.assertEquals(businessAccessUserSummary1.hashCode(), businessAccessUserSummary1.hashCode());
        System.assertEquals(businessAccessUserSummary2.hashCode(), businessAccessUserSummary2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBusinessAccessUserSummary businessAccessUserSummary1 = OASBusinessAccessUserSummary.getExample();
        OASBusinessAccessUserSummary businessAccessUserSummary2 = OASBusinessAccessUserSummary.getExample();
        OASBusinessAccessUserSummary businessAccessUserSummary3 = new OASBusinessAccessUserSummary();
        OASBusinessAccessUserSummary businessAccessUserSummary4 = new OASBusinessAccessUserSummary();

        System.assert(businessAccessUserSummary1.equals(businessAccessUserSummary2));
        System.assert(businessAccessUserSummary3.equals(businessAccessUserSummary4));
        System.assertEquals(businessAccessUserSummary1.hashCode(), businessAccessUserSummary2.hashCode());
        System.assertEquals(businessAccessUserSummary3.hashCode(), businessAccessUserSummary4.hashCode());
    }
}
