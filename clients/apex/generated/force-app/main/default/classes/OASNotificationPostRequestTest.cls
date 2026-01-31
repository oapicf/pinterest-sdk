@isTest
private class OASNotificationPostRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASNotificationPostRequest notificationPostRequest1 = OASNotificationPostRequest.getExample();
        OASNotificationPostRequest notificationPostRequest2 = notificationPostRequest1;
        OASNotificationPostRequest notificationPostRequest3 = new OASNotificationPostRequest();
        OASNotificationPostRequest notificationPostRequest4 = notificationPostRequest3;

        System.assert(notificationPostRequest1.equals(notificationPostRequest2));
        System.assert(notificationPostRequest2.equals(notificationPostRequest1));
        System.assert(notificationPostRequest1.equals(notificationPostRequest1));
        System.assert(notificationPostRequest3.equals(notificationPostRequest4));
        System.assert(notificationPostRequest4.equals(notificationPostRequest3));
        System.assert(notificationPostRequest3.equals(notificationPostRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASNotificationPostRequest notificationPostRequest1 = OASNotificationPostRequest.getExample();
        OASNotificationPostRequest notificationPostRequest2 = OASNotificationPostRequest.getExample();
        OASNotificationPostRequest notificationPostRequest3 = new OASNotificationPostRequest();
        OASNotificationPostRequest notificationPostRequest4 = new OASNotificationPostRequest();

        System.assert(notificationPostRequest1.equals(notificationPostRequest2));
        System.assert(notificationPostRequest2.equals(notificationPostRequest1));
        System.assert(notificationPostRequest3.equals(notificationPostRequest4));
        System.assert(notificationPostRequest4.equals(notificationPostRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASNotificationPostRequest notificationPostRequest1 = OASNotificationPostRequest.getExample();
        OASNotificationPostRequest notificationPostRequest2 = new OASNotificationPostRequest();

        System.assertEquals(false, notificationPostRequest1.equals('foo'));
        System.assertEquals(false, notificationPostRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASNotificationPostRequest notificationPostRequest1 = OASNotificationPostRequest.getExample();
        OASNotificationPostRequest notificationPostRequest2 = new OASNotificationPostRequest();
        OASNotificationPostRequest notificationPostRequest3;

        System.assertEquals(false, notificationPostRequest1.equals(notificationPostRequest3));
        System.assertEquals(false, notificationPostRequest2.equals(notificationPostRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASNotificationPostRequest notificationPostRequest1 = OASNotificationPostRequest.getExample();
        OASNotificationPostRequest notificationPostRequest2 = new OASNotificationPostRequest();

        System.assertEquals(notificationPostRequest1.hashCode(), notificationPostRequest1.hashCode());
        System.assertEquals(notificationPostRequest2.hashCode(), notificationPostRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASNotificationPostRequest notificationPostRequest1 = OASNotificationPostRequest.getExample();
        OASNotificationPostRequest notificationPostRequest2 = OASNotificationPostRequest.getExample();
        OASNotificationPostRequest notificationPostRequest3 = new OASNotificationPostRequest();
        OASNotificationPostRequest notificationPostRequest4 = new OASNotificationPostRequest();

        System.assert(notificationPostRequest1.equals(notificationPostRequest2));
        System.assert(notificationPostRequest3.equals(notificationPostRequest4));
        System.assertEquals(notificationPostRequest1.hashCode(), notificationPostRequest2.hashCode());
        System.assertEquals(notificationPostRequest3.hashCode(), notificationPostRequest4.hashCode());
    }
}
