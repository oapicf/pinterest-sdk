@isTest
private class OASFollowUserRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASFollowUserRequest followUserRequest1 = OASFollowUserRequest.getExample();
        OASFollowUserRequest followUserRequest2 = followUserRequest1;
        OASFollowUserRequest followUserRequest3 = new OASFollowUserRequest();
        OASFollowUserRequest followUserRequest4 = followUserRequest3;

        System.assert(followUserRequest1.equals(followUserRequest2));
        System.assert(followUserRequest2.equals(followUserRequest1));
        System.assert(followUserRequest1.equals(followUserRequest1));
        System.assert(followUserRequest3.equals(followUserRequest4));
        System.assert(followUserRequest4.equals(followUserRequest3));
        System.assert(followUserRequest3.equals(followUserRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASFollowUserRequest followUserRequest1 = OASFollowUserRequest.getExample();
        OASFollowUserRequest followUserRequest2 = OASFollowUserRequest.getExample();
        OASFollowUserRequest followUserRequest3 = new OASFollowUserRequest();
        OASFollowUserRequest followUserRequest4 = new OASFollowUserRequest();

        System.assert(followUserRequest1.equals(followUserRequest2));
        System.assert(followUserRequest2.equals(followUserRequest1));
        System.assert(followUserRequest3.equals(followUserRequest4));
        System.assert(followUserRequest4.equals(followUserRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASFollowUserRequest followUserRequest1 = OASFollowUserRequest.getExample();
        OASFollowUserRequest followUserRequest2 = new OASFollowUserRequest();

        System.assertEquals(false, followUserRequest1.equals('foo'));
        System.assertEquals(false, followUserRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASFollowUserRequest followUserRequest1 = OASFollowUserRequest.getExample();
        OASFollowUserRequest followUserRequest2 = new OASFollowUserRequest();
        OASFollowUserRequest followUserRequest3;

        System.assertEquals(false, followUserRequest1.equals(followUserRequest3));
        System.assertEquals(false, followUserRequest2.equals(followUserRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASFollowUserRequest followUserRequest1 = OASFollowUserRequest.getExample();
        OASFollowUserRequest followUserRequest2 = new OASFollowUserRequest();

        System.assertEquals(followUserRequest1.hashCode(), followUserRequest1.hashCode());
        System.assertEquals(followUserRequest2.hashCode(), followUserRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASFollowUserRequest followUserRequest1 = OASFollowUserRequest.getExample();
        OASFollowUserRequest followUserRequest2 = OASFollowUserRequest.getExample();
        OASFollowUserRequest followUserRequest3 = new OASFollowUserRequest();
        OASFollowUserRequest followUserRequest4 = new OASFollowUserRequest();

        System.assert(followUserRequest1.equals(followUserRequest2));
        System.assert(followUserRequest3.equals(followUserRequest4));
        System.assertEquals(followUserRequest1.hashCode(), followUserRequest2.hashCode());
        System.assertEquals(followUserRequest3.hashCode(), followUserRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASFollowUserRequest followUserRequest = new OASFollowUserRequest();
        Map<String, String> x-property-mappings = followUserRequest.getx-property-mappings();
        System.assertEquals('autoFollow', x-property-mappings.get('auto_follow'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASFollowUserRequest followUserRequest = new OASFollowUserRequest();
        System.assertEquals(false, followUserRequest.autoFollow);
    }
}
