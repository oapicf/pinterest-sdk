@isTest
private class OASOrderLineSingleResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrderLineSingleResponse orderLineSingleResponse1 = OASOrderLineSingleResponse.getExample();
        OASOrderLineSingleResponse orderLineSingleResponse2 = orderLineSingleResponse1;
        OASOrderLineSingleResponse orderLineSingleResponse3 = new OASOrderLineSingleResponse();
        OASOrderLineSingleResponse orderLineSingleResponse4 = orderLineSingleResponse3;

        System.assert(orderLineSingleResponse1.equals(orderLineSingleResponse2));
        System.assert(orderLineSingleResponse2.equals(orderLineSingleResponse1));
        System.assert(orderLineSingleResponse1.equals(orderLineSingleResponse1));
        System.assert(orderLineSingleResponse3.equals(orderLineSingleResponse4));
        System.assert(orderLineSingleResponse4.equals(orderLineSingleResponse3));
        System.assert(orderLineSingleResponse3.equals(orderLineSingleResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrderLineSingleResponse orderLineSingleResponse1 = OASOrderLineSingleResponse.getExample();
        OASOrderLineSingleResponse orderLineSingleResponse2 = OASOrderLineSingleResponse.getExample();
        OASOrderLineSingleResponse orderLineSingleResponse3 = new OASOrderLineSingleResponse();
        OASOrderLineSingleResponse orderLineSingleResponse4 = new OASOrderLineSingleResponse();

        System.assert(orderLineSingleResponse1.equals(orderLineSingleResponse2));
        System.assert(orderLineSingleResponse2.equals(orderLineSingleResponse1));
        System.assert(orderLineSingleResponse3.equals(orderLineSingleResponse4));
        System.assert(orderLineSingleResponse4.equals(orderLineSingleResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrderLineSingleResponse orderLineSingleResponse1 = OASOrderLineSingleResponse.getExample();
        OASOrderLineSingleResponse orderLineSingleResponse2 = new OASOrderLineSingleResponse();

        System.assertEquals(false, orderLineSingleResponse1.equals('foo'));
        System.assertEquals(false, orderLineSingleResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrderLineSingleResponse orderLineSingleResponse1 = OASOrderLineSingleResponse.getExample();
        OASOrderLineSingleResponse orderLineSingleResponse2 = new OASOrderLineSingleResponse();
        OASOrderLineSingleResponse orderLineSingleResponse3;

        System.assertEquals(false, orderLineSingleResponse1.equals(orderLineSingleResponse3));
        System.assertEquals(false, orderLineSingleResponse2.equals(orderLineSingleResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrderLineSingleResponse orderLineSingleResponse1 = OASOrderLineSingleResponse.getExample();
        OASOrderLineSingleResponse orderLineSingleResponse2 = new OASOrderLineSingleResponse();

        System.assertEquals(orderLineSingleResponse1.hashCode(), orderLineSingleResponse1.hashCode());
        System.assertEquals(orderLineSingleResponse2.hashCode(), orderLineSingleResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrderLineSingleResponse orderLineSingleResponse1 = OASOrderLineSingleResponse.getExample();
        OASOrderLineSingleResponse orderLineSingleResponse2 = OASOrderLineSingleResponse.getExample();
        OASOrderLineSingleResponse orderLineSingleResponse3 = new OASOrderLineSingleResponse();
        OASOrderLineSingleResponse orderLineSingleResponse4 = new OASOrderLineSingleResponse();

        System.assert(orderLineSingleResponse1.equals(orderLineSingleResponse2));
        System.assert(orderLineSingleResponse3.equals(orderLineSingleResponse4));
        System.assertEquals(orderLineSingleResponse1.hashCode(), orderLineSingleResponse2.hashCode());
        System.assertEquals(orderLineSingleResponse3.hashCode(), orderLineSingleResponse4.hashCode());
    }
}
