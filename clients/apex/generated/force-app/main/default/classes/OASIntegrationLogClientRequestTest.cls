@isTest
private class OASIntegrationLogClientRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASIntegrationLogClientRequest integrationLogClientRequest1 = OASIntegrationLogClientRequest.getExample();
        OASIntegrationLogClientRequest integrationLogClientRequest2 = integrationLogClientRequest1;
        OASIntegrationLogClientRequest integrationLogClientRequest3 = new OASIntegrationLogClientRequest();
        OASIntegrationLogClientRequest integrationLogClientRequest4 = integrationLogClientRequest3;

        System.assert(integrationLogClientRequest1.equals(integrationLogClientRequest2));
        System.assert(integrationLogClientRequest2.equals(integrationLogClientRequest1));
        System.assert(integrationLogClientRequest1.equals(integrationLogClientRequest1));
        System.assert(integrationLogClientRequest3.equals(integrationLogClientRequest4));
        System.assert(integrationLogClientRequest4.equals(integrationLogClientRequest3));
        System.assert(integrationLogClientRequest3.equals(integrationLogClientRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASIntegrationLogClientRequest integrationLogClientRequest1 = OASIntegrationLogClientRequest.getExample();
        OASIntegrationLogClientRequest integrationLogClientRequest2 = OASIntegrationLogClientRequest.getExample();
        OASIntegrationLogClientRequest integrationLogClientRequest3 = new OASIntegrationLogClientRequest();
        OASIntegrationLogClientRequest integrationLogClientRequest4 = new OASIntegrationLogClientRequest();

        System.assert(integrationLogClientRequest1.equals(integrationLogClientRequest2));
        System.assert(integrationLogClientRequest2.equals(integrationLogClientRequest1));
        System.assert(integrationLogClientRequest3.equals(integrationLogClientRequest4));
        System.assert(integrationLogClientRequest4.equals(integrationLogClientRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASIntegrationLogClientRequest integrationLogClientRequest1 = OASIntegrationLogClientRequest.getExample();
        OASIntegrationLogClientRequest integrationLogClientRequest2 = new OASIntegrationLogClientRequest();

        System.assertEquals(false, integrationLogClientRequest1.equals('foo'));
        System.assertEquals(false, integrationLogClientRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASIntegrationLogClientRequest integrationLogClientRequest1 = OASIntegrationLogClientRequest.getExample();
        OASIntegrationLogClientRequest integrationLogClientRequest2 = new OASIntegrationLogClientRequest();
        OASIntegrationLogClientRequest integrationLogClientRequest3;

        System.assertEquals(false, integrationLogClientRequest1.equals(integrationLogClientRequest3));
        System.assertEquals(false, integrationLogClientRequest2.equals(integrationLogClientRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASIntegrationLogClientRequest integrationLogClientRequest1 = OASIntegrationLogClientRequest.getExample();
        OASIntegrationLogClientRequest integrationLogClientRequest2 = new OASIntegrationLogClientRequest();

        System.assertEquals(integrationLogClientRequest1.hashCode(), integrationLogClientRequest1.hashCode());
        System.assertEquals(integrationLogClientRequest2.hashCode(), integrationLogClientRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASIntegrationLogClientRequest integrationLogClientRequest1 = OASIntegrationLogClientRequest.getExample();
        OASIntegrationLogClientRequest integrationLogClientRequest2 = OASIntegrationLogClientRequest.getExample();
        OASIntegrationLogClientRequest integrationLogClientRequest3 = new OASIntegrationLogClientRequest();
        OASIntegrationLogClientRequest integrationLogClientRequest4 = new OASIntegrationLogClientRequest();

        System.assert(integrationLogClientRequest1.equals(integrationLogClientRequest2));
        System.assert(integrationLogClientRequest3.equals(integrationLogClientRequest4));
        System.assertEquals(integrationLogClientRequest1.hashCode(), integrationLogClientRequest2.hashCode());
        System.assertEquals(integrationLogClientRequest3.hashCode(), integrationLogClientRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASIntegrationLogClientRequest integrationLogClientRequest = new OASIntegrationLogClientRequest();
        Map<String, String> x-property-mappings = integrationLogClientRequest.getx-property-mappings();
        System.assertEquals('requestHeaders', x-property-mappings.get('request_headers'));
        System.assertEquals('responseHeaders', x-property-mappings.get('response_headers'));
        System.assertEquals('responseStatusCode', x-property-mappings.get('response_status_code'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASIntegrationLogClientRequest integrationLogClientRequest = new OASIntegrationLogClientRequest();
        System.assertEquals(new Map<String, String>(), integrationLogClientRequest.requestHeaders);
        System.assertEquals(new Map<String, String>(), integrationLogClientRequest.responseHeaders);
        System.assertEquals(null, integrationLogClientRequest.method);
        System.assertEquals(null, integrationLogClientRequest.host);
        System.assertEquals(null, integrationLogClientRequest.path);
        System.assertEquals(null, integrationLogClientRequest.responseStatusCode);
    }
}
