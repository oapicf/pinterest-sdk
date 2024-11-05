@isTest
private class OASUserSingleAssetBindingTest {
    @isTest
    private static void equalsSameInstance() {
        OASUserSingleAssetBinding userSingleAssetBinding1 = OASUserSingleAssetBinding.getExample();
        OASUserSingleAssetBinding userSingleAssetBinding2 = userSingleAssetBinding1;
        OASUserSingleAssetBinding userSingleAssetBinding3 = new OASUserSingleAssetBinding();
        OASUserSingleAssetBinding userSingleAssetBinding4 = userSingleAssetBinding3;

        System.assert(userSingleAssetBinding1.equals(userSingleAssetBinding2));
        System.assert(userSingleAssetBinding2.equals(userSingleAssetBinding1));
        System.assert(userSingleAssetBinding1.equals(userSingleAssetBinding1));
        System.assert(userSingleAssetBinding3.equals(userSingleAssetBinding4));
        System.assert(userSingleAssetBinding4.equals(userSingleAssetBinding3));
        System.assert(userSingleAssetBinding3.equals(userSingleAssetBinding3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUserSingleAssetBinding userSingleAssetBinding1 = OASUserSingleAssetBinding.getExample();
        OASUserSingleAssetBinding userSingleAssetBinding2 = OASUserSingleAssetBinding.getExample();
        OASUserSingleAssetBinding userSingleAssetBinding3 = new OASUserSingleAssetBinding();
        OASUserSingleAssetBinding userSingleAssetBinding4 = new OASUserSingleAssetBinding();

        System.assert(userSingleAssetBinding1.equals(userSingleAssetBinding2));
        System.assert(userSingleAssetBinding2.equals(userSingleAssetBinding1));
        System.assert(userSingleAssetBinding3.equals(userSingleAssetBinding4));
        System.assert(userSingleAssetBinding4.equals(userSingleAssetBinding3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUserSingleAssetBinding userSingleAssetBinding1 = OASUserSingleAssetBinding.getExample();
        OASUserSingleAssetBinding userSingleAssetBinding2 = new OASUserSingleAssetBinding();

        System.assertEquals(false, userSingleAssetBinding1.equals('foo'));
        System.assertEquals(false, userSingleAssetBinding2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUserSingleAssetBinding userSingleAssetBinding1 = OASUserSingleAssetBinding.getExample();
        OASUserSingleAssetBinding userSingleAssetBinding2 = new OASUserSingleAssetBinding();
        OASUserSingleAssetBinding userSingleAssetBinding3;

        System.assertEquals(false, userSingleAssetBinding1.equals(userSingleAssetBinding3));
        System.assertEquals(false, userSingleAssetBinding2.equals(userSingleAssetBinding3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUserSingleAssetBinding userSingleAssetBinding1 = OASUserSingleAssetBinding.getExample();
        OASUserSingleAssetBinding userSingleAssetBinding2 = new OASUserSingleAssetBinding();

        System.assertEquals(userSingleAssetBinding1.hashCode(), userSingleAssetBinding1.hashCode());
        System.assertEquals(userSingleAssetBinding2.hashCode(), userSingleAssetBinding2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUserSingleAssetBinding userSingleAssetBinding1 = OASUserSingleAssetBinding.getExample();
        OASUserSingleAssetBinding userSingleAssetBinding2 = OASUserSingleAssetBinding.getExample();
        OASUserSingleAssetBinding userSingleAssetBinding3 = new OASUserSingleAssetBinding();
        OASUserSingleAssetBinding userSingleAssetBinding4 = new OASUserSingleAssetBinding();

        System.assert(userSingleAssetBinding1.equals(userSingleAssetBinding2));
        System.assert(userSingleAssetBinding3.equals(userSingleAssetBinding4));
        System.assertEquals(userSingleAssetBinding1.hashCode(), userSingleAssetBinding2.hashCode());
        System.assertEquals(userSingleAssetBinding3.hashCode(), userSingleAssetBinding4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASUserSingleAssetBinding userSingleAssetBinding = new OASUserSingleAssetBinding();
        System.assertEquals(new List<String>(), userSingleAssetBinding.permissions);
        System.assertEquals(null, userSingleAssetBinding.user);
    }
}
