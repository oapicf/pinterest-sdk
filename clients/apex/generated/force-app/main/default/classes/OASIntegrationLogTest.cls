@isTest
private class OASIntegrationLogTest {
    @isTest
    private static void equalsSameInstance() {
        OASIntegrationLog integrationLog1 = OASIntegrationLog.getExample();
        OASIntegrationLog integrationLog2 = integrationLog1;
        OASIntegrationLog integrationLog3 = new OASIntegrationLog();
        OASIntegrationLog integrationLog4 = integrationLog3;

        System.assert(integrationLog1.equals(integrationLog2));
        System.assert(integrationLog2.equals(integrationLog1));
        System.assert(integrationLog1.equals(integrationLog1));
        System.assert(integrationLog3.equals(integrationLog4));
        System.assert(integrationLog4.equals(integrationLog3));
        System.assert(integrationLog3.equals(integrationLog3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASIntegrationLog integrationLog1 = OASIntegrationLog.getExample();
        OASIntegrationLog integrationLog2 = OASIntegrationLog.getExample();
        OASIntegrationLog integrationLog3 = new OASIntegrationLog();
        OASIntegrationLog integrationLog4 = new OASIntegrationLog();

        System.assert(integrationLog1.equals(integrationLog2));
        System.assert(integrationLog2.equals(integrationLog1));
        System.assert(integrationLog3.equals(integrationLog4));
        System.assert(integrationLog4.equals(integrationLog3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASIntegrationLog integrationLog1 = OASIntegrationLog.getExample();
        OASIntegrationLog integrationLog2 = new OASIntegrationLog();

        System.assertEquals(false, integrationLog1.equals('foo'));
        System.assertEquals(false, integrationLog2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASIntegrationLog integrationLog1 = OASIntegrationLog.getExample();
        OASIntegrationLog integrationLog2 = new OASIntegrationLog();
        OASIntegrationLog integrationLog3;

        System.assertEquals(false, integrationLog1.equals(integrationLog3));
        System.assertEquals(false, integrationLog2.equals(integrationLog3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASIntegrationLog integrationLog1 = OASIntegrationLog.getExample();
        OASIntegrationLog integrationLog2 = new OASIntegrationLog();

        System.assertEquals(integrationLog1.hashCode(), integrationLog1.hashCode());
        System.assertEquals(integrationLog2.hashCode(), integrationLog2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASIntegrationLog integrationLog1 = OASIntegrationLog.getExample();
        OASIntegrationLog integrationLog2 = OASIntegrationLog.getExample();
        OASIntegrationLog integrationLog3 = new OASIntegrationLog();
        OASIntegrationLog integrationLog4 = new OASIntegrationLog();

        System.assert(integrationLog1.equals(integrationLog2));
        System.assert(integrationLog3.equals(integrationLog4));
        System.assertEquals(integrationLog1.hashCode(), integrationLog2.hashCode());
        System.assertEquals(integrationLog3.hashCode(), integrationLog4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASIntegrationLog integrationLog = new OASIntegrationLog();
        Map<String, String> x-property-mappings = integrationLog.getx-property-mappings();
        System.assertEquals('clientTimestamp', x-property-mappings.get('client_timestamp'));
        System.assertEquals('eventType', x-property-mappings.get('event_type'));
        System.assertEquals('logLevel', x-property-mappings.get('log_level'));
        System.assertEquals('externalBusinessId', x-property-mappings.get('external_business_id'));
        System.assertEquals('advertiserId', x-property-mappings.get('advertiser_id'));
        System.assertEquals('merchantId', x-property-mappings.get('merchant_id'));
        System.assertEquals('tagId', x-property-mappings.get('tag_id'));
        System.assertEquals('feedProfileId', x-property-mappings.get('feed_profile_id'));
        System.assertEquals('appVersionNumber', x-property-mappings.get('app_version_number'));
        System.assertEquals('platformVersionNumber', x-property-mappings.get('platform_version_number'));
    }
}
