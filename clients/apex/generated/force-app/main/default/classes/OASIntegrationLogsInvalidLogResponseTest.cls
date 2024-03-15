@isTest
private class OASIntegrationLogsInvalidLogResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASIntegrationLogsInvalidLogResponse integrationLogsInvalidLogResponseRejectedLogsInner1 = OASIntegrationLogsInvalidLogResponse.getExample();
        OASIntegrationLogsInvalidLogResponse integrationLogsInvalidLogResponseRejectedLogsInner2 = integrationLogsInvalidLogResponseRejectedLogsInner1;
        OASIntegrationLogsInvalidLogResponse integrationLogsInvalidLogResponseRejectedLogsInner3 = new OASIntegrationLogsInvalidLogResponse();
        OASIntegrationLogsInvalidLogResponse integrationLogsInvalidLogResponseRejectedLogsInner4 = integrationLogsInvalidLogResponseRejectedLogsInner3;

        System.assert(integrationLogsInvalidLogResponseRejectedLogsInner1.equals(integrationLogsInvalidLogResponseRejectedLogsInner2));
        System.assert(integrationLogsInvalidLogResponseRejectedLogsInner2.equals(integrationLogsInvalidLogResponseRejectedLogsInner1));
        System.assert(integrationLogsInvalidLogResponseRejectedLogsInner1.equals(integrationLogsInvalidLogResponseRejectedLogsInner1));
        System.assert(integrationLogsInvalidLogResponseRejectedLogsInner3.equals(integrationLogsInvalidLogResponseRejectedLogsInner4));
        System.assert(integrationLogsInvalidLogResponseRejectedLogsInner4.equals(integrationLogsInvalidLogResponseRejectedLogsInner3));
        System.assert(integrationLogsInvalidLogResponseRejectedLogsInner3.equals(integrationLogsInvalidLogResponseRejectedLogsInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASIntegrationLogsInvalidLogResponse integrationLogsInvalidLogResponseRejectedLogsInner1 = OASIntegrationLogsInvalidLogResponse.getExample();
        OASIntegrationLogsInvalidLogResponse integrationLogsInvalidLogResponseRejectedLogsInner2 = OASIntegrationLogsInvalidLogResponse.getExample();
        OASIntegrationLogsInvalidLogResponse integrationLogsInvalidLogResponseRejectedLogsInner3 = new OASIntegrationLogsInvalidLogResponse();
        OASIntegrationLogsInvalidLogResponse integrationLogsInvalidLogResponseRejectedLogsInner4 = new OASIntegrationLogsInvalidLogResponse();

        System.assert(integrationLogsInvalidLogResponseRejectedLogsInner1.equals(integrationLogsInvalidLogResponseRejectedLogsInner2));
        System.assert(integrationLogsInvalidLogResponseRejectedLogsInner2.equals(integrationLogsInvalidLogResponseRejectedLogsInner1));
        System.assert(integrationLogsInvalidLogResponseRejectedLogsInner3.equals(integrationLogsInvalidLogResponseRejectedLogsInner4));
        System.assert(integrationLogsInvalidLogResponseRejectedLogsInner4.equals(integrationLogsInvalidLogResponseRejectedLogsInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASIntegrationLogsInvalidLogResponse integrationLogsInvalidLogResponseRejectedLogsInner1 = OASIntegrationLogsInvalidLogResponse.getExample();
        OASIntegrationLogsInvalidLogResponse integrationLogsInvalidLogResponseRejectedLogsInner2 = new OASIntegrationLogsInvalidLogResponse();

        System.assertEquals(false, integrationLogsInvalidLogResponseRejectedLogsInner1.equals('foo'));
        System.assertEquals(false, integrationLogsInvalidLogResponseRejectedLogsInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASIntegrationLogsInvalidLogResponse integrationLogsInvalidLogResponseRejectedLogsInner1 = OASIntegrationLogsInvalidLogResponse.getExample();
        OASIntegrationLogsInvalidLogResponse integrationLogsInvalidLogResponseRejectedLogsInner2 = new OASIntegrationLogsInvalidLogResponse();
        OASIntegrationLogsInvalidLogResponse integrationLogsInvalidLogResponseRejectedLogsInner3;

        System.assertEquals(false, integrationLogsInvalidLogResponseRejectedLogsInner1.equals(integrationLogsInvalidLogResponseRejectedLogsInner3));
        System.assertEquals(false, integrationLogsInvalidLogResponseRejectedLogsInner2.equals(integrationLogsInvalidLogResponseRejectedLogsInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASIntegrationLogsInvalidLogResponse integrationLogsInvalidLogResponseRejectedLogsInner1 = OASIntegrationLogsInvalidLogResponse.getExample();
        OASIntegrationLogsInvalidLogResponse integrationLogsInvalidLogResponseRejectedLogsInner2 = new OASIntegrationLogsInvalidLogResponse();

        System.assertEquals(integrationLogsInvalidLogResponseRejectedLogsInner1.hashCode(), integrationLogsInvalidLogResponseRejectedLogsInner1.hashCode());
        System.assertEquals(integrationLogsInvalidLogResponseRejectedLogsInner2.hashCode(), integrationLogsInvalidLogResponseRejectedLogsInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASIntegrationLogsInvalidLogResponse integrationLogsInvalidLogResponseRejectedLogsInner1 = OASIntegrationLogsInvalidLogResponse.getExample();
        OASIntegrationLogsInvalidLogResponse integrationLogsInvalidLogResponseRejectedLogsInner2 = OASIntegrationLogsInvalidLogResponse.getExample();
        OASIntegrationLogsInvalidLogResponse integrationLogsInvalidLogResponseRejectedLogsInner3 = new OASIntegrationLogsInvalidLogResponse();
        OASIntegrationLogsInvalidLogResponse integrationLogsInvalidLogResponseRejectedLogsInner4 = new OASIntegrationLogsInvalidLogResponse();

        System.assert(integrationLogsInvalidLogResponseRejectedLogsInner1.equals(integrationLogsInvalidLogResponseRejectedLogsInner2));
        System.assert(integrationLogsInvalidLogResponseRejectedLogsInner3.equals(integrationLogsInvalidLogResponseRejectedLogsInner4));
        System.assertEquals(integrationLogsInvalidLogResponseRejectedLogsInner1.hashCode(), integrationLogsInvalidLogResponseRejectedLogsInner2.hashCode());
        System.assertEquals(integrationLogsInvalidLogResponseRejectedLogsInner3.hashCode(), integrationLogsInvalidLogResponseRejectedLogsInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASIntegrationLogsInvalidLogResponse integrationLogsInvalidLogResponseRejectedLogsInner = new OASIntegrationLogsInvalidLogResponse();
        Map<String, String> x-property-mappings = integrationLogsInvalidLogResponseRejectedLogsInner.getx-property-mappings();
        System.assertEquals('logIndex', x-property-mappings.get('log_index'));
    }
}
