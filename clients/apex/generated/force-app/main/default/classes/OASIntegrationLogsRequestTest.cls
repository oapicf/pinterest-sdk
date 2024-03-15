@isTest
private class OASIntegrationLogsRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASIntegrationLogsRequest integrationLogsRequest1 = OASIntegrationLogsRequest.getExample();
        OASIntegrationLogsRequest integrationLogsRequest2 = integrationLogsRequest1;
        OASIntegrationLogsRequest integrationLogsRequest3 = new OASIntegrationLogsRequest();
        OASIntegrationLogsRequest integrationLogsRequest4 = integrationLogsRequest3;

        System.assert(integrationLogsRequest1.equals(integrationLogsRequest2));
        System.assert(integrationLogsRequest2.equals(integrationLogsRequest1));
        System.assert(integrationLogsRequest1.equals(integrationLogsRequest1));
        System.assert(integrationLogsRequest3.equals(integrationLogsRequest4));
        System.assert(integrationLogsRequest4.equals(integrationLogsRequest3));
        System.assert(integrationLogsRequest3.equals(integrationLogsRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASIntegrationLogsRequest integrationLogsRequest1 = OASIntegrationLogsRequest.getExample();
        OASIntegrationLogsRequest integrationLogsRequest2 = OASIntegrationLogsRequest.getExample();
        OASIntegrationLogsRequest integrationLogsRequest3 = new OASIntegrationLogsRequest();
        OASIntegrationLogsRequest integrationLogsRequest4 = new OASIntegrationLogsRequest();

        System.assert(integrationLogsRequest1.equals(integrationLogsRequest2));
        System.assert(integrationLogsRequest2.equals(integrationLogsRequest1));
        System.assert(integrationLogsRequest3.equals(integrationLogsRequest4));
        System.assert(integrationLogsRequest4.equals(integrationLogsRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASIntegrationLogsRequest integrationLogsRequest1 = OASIntegrationLogsRequest.getExample();
        OASIntegrationLogsRequest integrationLogsRequest2 = new OASIntegrationLogsRequest();

        System.assertEquals(false, integrationLogsRequest1.equals('foo'));
        System.assertEquals(false, integrationLogsRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASIntegrationLogsRequest integrationLogsRequest1 = OASIntegrationLogsRequest.getExample();
        OASIntegrationLogsRequest integrationLogsRequest2 = new OASIntegrationLogsRequest();
        OASIntegrationLogsRequest integrationLogsRequest3;

        System.assertEquals(false, integrationLogsRequest1.equals(integrationLogsRequest3));
        System.assertEquals(false, integrationLogsRequest2.equals(integrationLogsRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASIntegrationLogsRequest integrationLogsRequest1 = OASIntegrationLogsRequest.getExample();
        OASIntegrationLogsRequest integrationLogsRequest2 = new OASIntegrationLogsRequest();

        System.assertEquals(integrationLogsRequest1.hashCode(), integrationLogsRequest1.hashCode());
        System.assertEquals(integrationLogsRequest2.hashCode(), integrationLogsRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASIntegrationLogsRequest integrationLogsRequest1 = OASIntegrationLogsRequest.getExample();
        OASIntegrationLogsRequest integrationLogsRequest2 = OASIntegrationLogsRequest.getExample();
        OASIntegrationLogsRequest integrationLogsRequest3 = new OASIntegrationLogsRequest();
        OASIntegrationLogsRequest integrationLogsRequest4 = new OASIntegrationLogsRequest();

        System.assert(integrationLogsRequest1.equals(integrationLogsRequest2));
        System.assert(integrationLogsRequest3.equals(integrationLogsRequest4));
        System.assertEquals(integrationLogsRequest1.hashCode(), integrationLogsRequest2.hashCode());
        System.assertEquals(integrationLogsRequest3.hashCode(), integrationLogsRequest4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASIntegrationLogsRequest integrationLogsRequest = new OASIntegrationLogsRequest();
        System.assertEquals(new List<OASIntegrationLog>(), integrationLogsRequest.logs);
    }
}
