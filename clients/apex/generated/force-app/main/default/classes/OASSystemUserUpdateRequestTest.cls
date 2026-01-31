@isTest
private class OASSystemUserUpdateRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASSystemUserUpdateRequest systemUserUpdateRequest1 = OASSystemUserUpdateRequest.getExample();
        OASSystemUserUpdateRequest systemUserUpdateRequest2 = systemUserUpdateRequest1;
        OASSystemUserUpdateRequest systemUserUpdateRequest3 = new OASSystemUserUpdateRequest();
        OASSystemUserUpdateRequest systemUserUpdateRequest4 = systemUserUpdateRequest3;

        System.assert(systemUserUpdateRequest1.equals(systemUserUpdateRequest2));
        System.assert(systemUserUpdateRequest2.equals(systemUserUpdateRequest1));
        System.assert(systemUserUpdateRequest1.equals(systemUserUpdateRequest1));
        System.assert(systemUserUpdateRequest3.equals(systemUserUpdateRequest4));
        System.assert(systemUserUpdateRequest4.equals(systemUserUpdateRequest3));
        System.assert(systemUserUpdateRequest3.equals(systemUserUpdateRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASSystemUserUpdateRequest systemUserUpdateRequest1 = OASSystemUserUpdateRequest.getExample();
        OASSystemUserUpdateRequest systemUserUpdateRequest2 = OASSystemUserUpdateRequest.getExample();
        OASSystemUserUpdateRequest systemUserUpdateRequest3 = new OASSystemUserUpdateRequest();
        OASSystemUserUpdateRequest systemUserUpdateRequest4 = new OASSystemUserUpdateRequest();

        System.assert(systemUserUpdateRequest1.equals(systemUserUpdateRequest2));
        System.assert(systemUserUpdateRequest2.equals(systemUserUpdateRequest1));
        System.assert(systemUserUpdateRequest3.equals(systemUserUpdateRequest4));
        System.assert(systemUserUpdateRequest4.equals(systemUserUpdateRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASSystemUserUpdateRequest systemUserUpdateRequest1 = OASSystemUserUpdateRequest.getExample();
        OASSystemUserUpdateRequest systemUserUpdateRequest2 = new OASSystemUserUpdateRequest();

        System.assertEquals(false, systemUserUpdateRequest1.equals('foo'));
        System.assertEquals(false, systemUserUpdateRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASSystemUserUpdateRequest systemUserUpdateRequest1 = OASSystemUserUpdateRequest.getExample();
        OASSystemUserUpdateRequest systemUserUpdateRequest2 = new OASSystemUserUpdateRequest();
        OASSystemUserUpdateRequest systemUserUpdateRequest3;

        System.assertEquals(false, systemUserUpdateRequest1.equals(systemUserUpdateRequest3));
        System.assertEquals(false, systemUserUpdateRequest2.equals(systemUserUpdateRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASSystemUserUpdateRequest systemUserUpdateRequest1 = OASSystemUserUpdateRequest.getExample();
        OASSystemUserUpdateRequest systemUserUpdateRequest2 = new OASSystemUserUpdateRequest();

        System.assertEquals(systemUserUpdateRequest1.hashCode(), systemUserUpdateRequest1.hashCode());
        System.assertEquals(systemUserUpdateRequest2.hashCode(), systemUserUpdateRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASSystemUserUpdateRequest systemUserUpdateRequest1 = OASSystemUserUpdateRequest.getExample();
        OASSystemUserUpdateRequest systemUserUpdateRequest2 = OASSystemUserUpdateRequest.getExample();
        OASSystemUserUpdateRequest systemUserUpdateRequest3 = new OASSystemUserUpdateRequest();
        OASSystemUserUpdateRequest systemUserUpdateRequest4 = new OASSystemUserUpdateRequest();

        System.assert(systemUserUpdateRequest1.equals(systemUserUpdateRequest2));
        System.assert(systemUserUpdateRequest3.equals(systemUserUpdateRequest4));
        System.assertEquals(systemUserUpdateRequest1.hashCode(), systemUserUpdateRequest2.hashCode());
        System.assertEquals(systemUserUpdateRequest3.hashCode(), systemUserUpdateRequest4.hashCode());
    }
}
