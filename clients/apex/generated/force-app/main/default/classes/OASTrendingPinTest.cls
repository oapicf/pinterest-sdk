@isTest
private class OASTrendingPinTest {
    @isTest
    private static void equalsSameInstance() {
        OASTrendingPin trendingPin1 = OASTrendingPin.getExample();
        OASTrendingPin trendingPin2 = trendingPin1;
        OASTrendingPin trendingPin3 = new OASTrendingPin();
        OASTrendingPin trendingPin4 = trendingPin3;

        System.assert(trendingPin1.equals(trendingPin2));
        System.assert(trendingPin2.equals(trendingPin1));
        System.assert(trendingPin1.equals(trendingPin1));
        System.assert(trendingPin3.equals(trendingPin4));
        System.assert(trendingPin4.equals(trendingPin3));
        System.assert(trendingPin3.equals(trendingPin3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTrendingPin trendingPin1 = OASTrendingPin.getExample();
        OASTrendingPin trendingPin2 = OASTrendingPin.getExample();
        OASTrendingPin trendingPin3 = new OASTrendingPin();
        OASTrendingPin trendingPin4 = new OASTrendingPin();

        System.assert(trendingPin1.equals(trendingPin2));
        System.assert(trendingPin2.equals(trendingPin1));
        System.assert(trendingPin3.equals(trendingPin4));
        System.assert(trendingPin4.equals(trendingPin3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTrendingPin trendingPin1 = OASTrendingPin.getExample();
        OASTrendingPin trendingPin2 = new OASTrendingPin();

        System.assertEquals(false, trendingPin1.equals('foo'));
        System.assertEquals(false, trendingPin2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTrendingPin trendingPin1 = OASTrendingPin.getExample();
        OASTrendingPin trendingPin2 = new OASTrendingPin();
        OASTrendingPin trendingPin3;

        System.assertEquals(false, trendingPin1.equals(trendingPin3));
        System.assertEquals(false, trendingPin2.equals(trendingPin3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTrendingPin trendingPin1 = OASTrendingPin.getExample();
        OASTrendingPin trendingPin2 = new OASTrendingPin();

        System.assertEquals(trendingPin1.hashCode(), trendingPin1.hashCode());
        System.assertEquals(trendingPin2.hashCode(), trendingPin2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTrendingPin trendingPin1 = OASTrendingPin.getExample();
        OASTrendingPin trendingPin2 = OASTrendingPin.getExample();
        OASTrendingPin trendingPin3 = new OASTrendingPin();
        OASTrendingPin trendingPin4 = new OASTrendingPin();

        System.assert(trendingPin1.equals(trendingPin2));
        System.assert(trendingPin3.equals(trendingPin4));
        System.assertEquals(trendingPin1.hashCode(), trendingPin2.hashCode());
        System.assertEquals(trendingPin3.hashCode(), trendingPin4.hashCode());
    }
}
