@isTest
private class OASAppTypeMultipliersTest {
    @isTest
    private static void equalsSameInstance() {
        OASAppTypeMultipliers appTypeMultipliers1 = OASAppTypeMultipliers.getExample();
        OASAppTypeMultipliers appTypeMultipliers2 = appTypeMultipliers1;
        OASAppTypeMultipliers appTypeMultipliers3 = new OASAppTypeMultipliers();
        OASAppTypeMultipliers appTypeMultipliers4 = appTypeMultipliers3;

        System.assert(appTypeMultipliers1.equals(appTypeMultipliers2));
        System.assert(appTypeMultipliers2.equals(appTypeMultipliers1));
        System.assert(appTypeMultipliers1.equals(appTypeMultipliers1));
        System.assert(appTypeMultipliers3.equals(appTypeMultipliers4));
        System.assert(appTypeMultipliers4.equals(appTypeMultipliers3));
        System.assert(appTypeMultipliers3.equals(appTypeMultipliers3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAppTypeMultipliers appTypeMultipliers1 = OASAppTypeMultipliers.getExample();
        OASAppTypeMultipliers appTypeMultipliers2 = OASAppTypeMultipliers.getExample();
        OASAppTypeMultipliers appTypeMultipliers3 = new OASAppTypeMultipliers();
        OASAppTypeMultipliers appTypeMultipliers4 = new OASAppTypeMultipliers();

        System.assert(appTypeMultipliers1.equals(appTypeMultipliers2));
        System.assert(appTypeMultipliers2.equals(appTypeMultipliers1));
        System.assert(appTypeMultipliers3.equals(appTypeMultipliers4));
        System.assert(appTypeMultipliers4.equals(appTypeMultipliers3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAppTypeMultipliers appTypeMultipliers1 = OASAppTypeMultipliers.getExample();
        OASAppTypeMultipliers appTypeMultipliers2 = new OASAppTypeMultipliers();

        System.assertEquals(false, appTypeMultipliers1.equals('foo'));
        System.assertEquals(false, appTypeMultipliers2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAppTypeMultipliers appTypeMultipliers1 = OASAppTypeMultipliers.getExample();
        OASAppTypeMultipliers appTypeMultipliers2 = new OASAppTypeMultipliers();
        OASAppTypeMultipliers appTypeMultipliers3;

        System.assertEquals(false, appTypeMultipliers1.equals(appTypeMultipliers3));
        System.assertEquals(false, appTypeMultipliers2.equals(appTypeMultipliers3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAppTypeMultipliers appTypeMultipliers1 = OASAppTypeMultipliers.getExample();
        OASAppTypeMultipliers appTypeMultipliers2 = new OASAppTypeMultipliers();

        System.assertEquals(appTypeMultipliers1.hashCode(), appTypeMultipliers1.hashCode());
        System.assertEquals(appTypeMultipliers2.hashCode(), appTypeMultipliers2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAppTypeMultipliers appTypeMultipliers1 = OASAppTypeMultipliers.getExample();
        OASAppTypeMultipliers appTypeMultipliers2 = OASAppTypeMultipliers.getExample();
        OASAppTypeMultipliers appTypeMultipliers3 = new OASAppTypeMultipliers();
        OASAppTypeMultipliers appTypeMultipliers4 = new OASAppTypeMultipliers();

        System.assert(appTypeMultipliers1.equals(appTypeMultipliers2));
        System.assert(appTypeMultipliers3.equals(appTypeMultipliers4));
        System.assertEquals(appTypeMultipliers1.hashCode(), appTypeMultipliers2.hashCode());
        System.assertEquals(appTypeMultipliers3.hashCode(), appTypeMultipliers4.hashCode());
    }
}
