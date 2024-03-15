@isTest
private class OASUserSummaryTest {
    @isTest
    private static void equalsSameInstance() {
        OASUserSummary userSummary1 = OASUserSummary.getExample();
        OASUserSummary userSummary2 = userSummary1;
        OASUserSummary userSummary3 = new OASUserSummary();
        OASUserSummary userSummary4 = userSummary3;

        System.assert(userSummary1.equals(userSummary2));
        System.assert(userSummary2.equals(userSummary1));
        System.assert(userSummary1.equals(userSummary1));
        System.assert(userSummary3.equals(userSummary4));
        System.assert(userSummary4.equals(userSummary3));
        System.assert(userSummary3.equals(userSummary3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUserSummary userSummary1 = OASUserSummary.getExample();
        OASUserSummary userSummary2 = OASUserSummary.getExample();
        OASUserSummary userSummary3 = new OASUserSummary();
        OASUserSummary userSummary4 = new OASUserSummary();

        System.assert(userSummary1.equals(userSummary2));
        System.assert(userSummary2.equals(userSummary1));
        System.assert(userSummary3.equals(userSummary4));
        System.assert(userSummary4.equals(userSummary3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUserSummary userSummary1 = OASUserSummary.getExample();
        OASUserSummary userSummary2 = new OASUserSummary();

        System.assertEquals(false, userSummary1.equals('foo'));
        System.assertEquals(false, userSummary2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUserSummary userSummary1 = OASUserSummary.getExample();
        OASUserSummary userSummary2 = new OASUserSummary();
        OASUserSummary userSummary3;

        System.assertEquals(false, userSummary1.equals(userSummary3));
        System.assertEquals(false, userSummary2.equals(userSummary3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUserSummary userSummary1 = OASUserSummary.getExample();
        OASUserSummary userSummary2 = new OASUserSummary();

        System.assertEquals(userSummary1.hashCode(), userSummary1.hashCode());
        System.assertEquals(userSummary2.hashCode(), userSummary2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUserSummary userSummary1 = OASUserSummary.getExample();
        OASUserSummary userSummary2 = OASUserSummary.getExample();
        OASUserSummary userSummary3 = new OASUserSummary();
        OASUserSummary userSummary4 = new OASUserSummary();

        System.assert(userSummary1.equals(userSummary2));
        System.assert(userSummary3.equals(userSummary4));
        System.assertEquals(userSummary1.hashCode(), userSummary2.hashCode());
        System.assertEquals(userSummary3.hashCode(), userSummary4.hashCode());
    }
}
