@isTest
private class OASNotificationResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASNotificationResponse notificationResponse1 = OASNotificationResponse.getExample();
        OASNotificationResponse notificationResponse2 = notificationResponse1;
        OASNotificationResponse notificationResponse3 = new OASNotificationResponse();
        OASNotificationResponse notificationResponse4 = notificationResponse3;

        System.assert(notificationResponse1.equals(notificationResponse2));
        System.assert(notificationResponse2.equals(notificationResponse1));
        System.assert(notificationResponse1.equals(notificationResponse1));
        System.assert(notificationResponse3.equals(notificationResponse4));
        System.assert(notificationResponse4.equals(notificationResponse3));
        System.assert(notificationResponse3.equals(notificationResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASNotificationResponse notificationResponse1 = OASNotificationResponse.getExample();
        OASNotificationResponse notificationResponse2 = OASNotificationResponse.getExample();
        OASNotificationResponse notificationResponse3 = new OASNotificationResponse();
        OASNotificationResponse notificationResponse4 = new OASNotificationResponse();

        System.assert(notificationResponse1.equals(notificationResponse2));
        System.assert(notificationResponse2.equals(notificationResponse1));
        System.assert(notificationResponse3.equals(notificationResponse4));
        System.assert(notificationResponse4.equals(notificationResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASNotificationResponse notificationResponse1 = OASNotificationResponse.getExample();
        OASNotificationResponse notificationResponse2 = new OASNotificationResponse();

        System.assertEquals(false, notificationResponse1.equals('foo'));
        System.assertEquals(false, notificationResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASNotificationResponse notificationResponse1 = OASNotificationResponse.getExample();
        OASNotificationResponse notificationResponse2 = new OASNotificationResponse();
        OASNotificationResponse notificationResponse3;

        System.assertEquals(false, notificationResponse1.equals(notificationResponse3));
        System.assertEquals(false, notificationResponse2.equals(notificationResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASNotificationResponse notificationResponse1 = OASNotificationResponse.getExample();
        OASNotificationResponse notificationResponse2 = new OASNotificationResponse();

        System.assertEquals(notificationResponse1.hashCode(), notificationResponse1.hashCode());
        System.assertEquals(notificationResponse2.hashCode(), notificationResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASNotificationResponse notificationResponse1 = OASNotificationResponse.getExample();
        OASNotificationResponse notificationResponse2 = OASNotificationResponse.getExample();
        OASNotificationResponse notificationResponse3 = new OASNotificationResponse();
        OASNotificationResponse notificationResponse4 = new OASNotificationResponse();

        System.assert(notificationResponse1.equals(notificationResponse2));
        System.assert(notificationResponse3.equals(notificationResponse4));
        System.assertEquals(notificationResponse1.hashCode(), notificationResponse2.hashCode());
        System.assertEquals(notificationResponse3.hashCode(), notificationResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASNotificationResponse notificationResponse = new OASNotificationResponse();
        Map<String, String> x-property-mappings = notificationResponse.getx-property-mappings();
        System.assertEquals('receivedAt', x-property-mappings.get('received_at'));
        System.assertEquals('errorMsg', x-property-mappings.get('error_msg'));
    }
}
