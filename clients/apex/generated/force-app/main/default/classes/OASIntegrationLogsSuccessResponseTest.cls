@isTest
private class OASIntegrationLogsSuccessResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASIntegrationLogsSuccessResponse integrationLogsSuccessResponse1 = OASIntegrationLogsSuccessResponse.getExample();
        OASIntegrationLogsSuccessResponse integrationLogsSuccessResponse2 = integrationLogsSuccessResponse1;
        OASIntegrationLogsSuccessResponse integrationLogsSuccessResponse3 = new OASIntegrationLogsSuccessResponse();
        OASIntegrationLogsSuccessResponse integrationLogsSuccessResponse4 = integrationLogsSuccessResponse3;

        System.assert(integrationLogsSuccessResponse1.equals(integrationLogsSuccessResponse2));
        System.assert(integrationLogsSuccessResponse2.equals(integrationLogsSuccessResponse1));
        System.assert(integrationLogsSuccessResponse1.equals(integrationLogsSuccessResponse1));
        System.assert(integrationLogsSuccessResponse3.equals(integrationLogsSuccessResponse4));
        System.assert(integrationLogsSuccessResponse4.equals(integrationLogsSuccessResponse3));
        System.assert(integrationLogsSuccessResponse3.equals(integrationLogsSuccessResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASIntegrationLogsSuccessResponse integrationLogsSuccessResponse1 = OASIntegrationLogsSuccessResponse.getExample();
        OASIntegrationLogsSuccessResponse integrationLogsSuccessResponse2 = OASIntegrationLogsSuccessResponse.getExample();
        OASIntegrationLogsSuccessResponse integrationLogsSuccessResponse3 = new OASIntegrationLogsSuccessResponse();
        OASIntegrationLogsSuccessResponse integrationLogsSuccessResponse4 = new OASIntegrationLogsSuccessResponse();

        System.assert(integrationLogsSuccessResponse1.equals(integrationLogsSuccessResponse2));
        System.assert(integrationLogsSuccessResponse2.equals(integrationLogsSuccessResponse1));
        System.assert(integrationLogsSuccessResponse3.equals(integrationLogsSuccessResponse4));
        System.assert(integrationLogsSuccessResponse4.equals(integrationLogsSuccessResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASIntegrationLogsSuccessResponse integrationLogsSuccessResponse1 = OASIntegrationLogsSuccessResponse.getExample();
        OASIntegrationLogsSuccessResponse integrationLogsSuccessResponse2 = new OASIntegrationLogsSuccessResponse();

        System.assertEquals(false, integrationLogsSuccessResponse1.equals('foo'));
        System.assertEquals(false, integrationLogsSuccessResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASIntegrationLogsSuccessResponse integrationLogsSuccessResponse1 = OASIntegrationLogsSuccessResponse.getExample();
        OASIntegrationLogsSuccessResponse integrationLogsSuccessResponse2 = new OASIntegrationLogsSuccessResponse();
        OASIntegrationLogsSuccessResponse integrationLogsSuccessResponse3;

        System.assertEquals(false, integrationLogsSuccessResponse1.equals(integrationLogsSuccessResponse3));
        System.assertEquals(false, integrationLogsSuccessResponse2.equals(integrationLogsSuccessResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASIntegrationLogsSuccessResponse integrationLogsSuccessResponse1 = OASIntegrationLogsSuccessResponse.getExample();
        OASIntegrationLogsSuccessResponse integrationLogsSuccessResponse2 = new OASIntegrationLogsSuccessResponse();

        System.assertEquals(integrationLogsSuccessResponse1.hashCode(), integrationLogsSuccessResponse1.hashCode());
        System.assertEquals(integrationLogsSuccessResponse2.hashCode(), integrationLogsSuccessResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASIntegrationLogsSuccessResponse integrationLogsSuccessResponse1 = OASIntegrationLogsSuccessResponse.getExample();
        OASIntegrationLogsSuccessResponse integrationLogsSuccessResponse2 = OASIntegrationLogsSuccessResponse.getExample();
        OASIntegrationLogsSuccessResponse integrationLogsSuccessResponse3 = new OASIntegrationLogsSuccessResponse();
        OASIntegrationLogsSuccessResponse integrationLogsSuccessResponse4 = new OASIntegrationLogsSuccessResponse();

        System.assert(integrationLogsSuccessResponse1.equals(integrationLogsSuccessResponse2));
        System.assert(integrationLogsSuccessResponse3.equals(integrationLogsSuccessResponse4));
        System.assertEquals(integrationLogsSuccessResponse1.hashCode(), integrationLogsSuccessResponse2.hashCode());
        System.assertEquals(integrationLogsSuccessResponse3.hashCode(), integrationLogsSuccessResponse4.hashCode());
    }
}
