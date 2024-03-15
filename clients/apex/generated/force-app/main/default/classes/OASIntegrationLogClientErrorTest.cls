@isTest
private class OASIntegrationLogClientErrorTest {
    @isTest
    private static void equalsSameInstance() {
        OASIntegrationLogClientError integrationLogClientError1 = OASIntegrationLogClientError.getExample();
        OASIntegrationLogClientError integrationLogClientError2 = integrationLogClientError1;
        OASIntegrationLogClientError integrationLogClientError3 = new OASIntegrationLogClientError();
        OASIntegrationLogClientError integrationLogClientError4 = integrationLogClientError3;

        System.assert(integrationLogClientError1.equals(integrationLogClientError2));
        System.assert(integrationLogClientError2.equals(integrationLogClientError1));
        System.assert(integrationLogClientError1.equals(integrationLogClientError1));
        System.assert(integrationLogClientError3.equals(integrationLogClientError4));
        System.assert(integrationLogClientError4.equals(integrationLogClientError3));
        System.assert(integrationLogClientError3.equals(integrationLogClientError3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASIntegrationLogClientError integrationLogClientError1 = OASIntegrationLogClientError.getExample();
        OASIntegrationLogClientError integrationLogClientError2 = OASIntegrationLogClientError.getExample();
        OASIntegrationLogClientError integrationLogClientError3 = new OASIntegrationLogClientError();
        OASIntegrationLogClientError integrationLogClientError4 = new OASIntegrationLogClientError();

        System.assert(integrationLogClientError1.equals(integrationLogClientError2));
        System.assert(integrationLogClientError2.equals(integrationLogClientError1));
        System.assert(integrationLogClientError3.equals(integrationLogClientError4));
        System.assert(integrationLogClientError4.equals(integrationLogClientError3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASIntegrationLogClientError integrationLogClientError1 = OASIntegrationLogClientError.getExample();
        OASIntegrationLogClientError integrationLogClientError2 = new OASIntegrationLogClientError();

        System.assertEquals(false, integrationLogClientError1.equals('foo'));
        System.assertEquals(false, integrationLogClientError2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASIntegrationLogClientError integrationLogClientError1 = OASIntegrationLogClientError.getExample();
        OASIntegrationLogClientError integrationLogClientError2 = new OASIntegrationLogClientError();
        OASIntegrationLogClientError integrationLogClientError3;

        System.assertEquals(false, integrationLogClientError1.equals(integrationLogClientError3));
        System.assertEquals(false, integrationLogClientError2.equals(integrationLogClientError3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASIntegrationLogClientError integrationLogClientError1 = OASIntegrationLogClientError.getExample();
        OASIntegrationLogClientError integrationLogClientError2 = new OASIntegrationLogClientError();

        System.assertEquals(integrationLogClientError1.hashCode(), integrationLogClientError1.hashCode());
        System.assertEquals(integrationLogClientError2.hashCode(), integrationLogClientError2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASIntegrationLogClientError integrationLogClientError1 = OASIntegrationLogClientError.getExample();
        OASIntegrationLogClientError integrationLogClientError2 = OASIntegrationLogClientError.getExample();
        OASIntegrationLogClientError integrationLogClientError3 = new OASIntegrationLogClientError();
        OASIntegrationLogClientError integrationLogClientError4 = new OASIntegrationLogClientError();

        System.assert(integrationLogClientError1.equals(integrationLogClientError2));
        System.assert(integrationLogClientError3.equals(integrationLogClientError4));
        System.assertEquals(integrationLogClientError1.hashCode(), integrationLogClientError2.hashCode());
        System.assertEquals(integrationLogClientError3.hashCode(), integrationLogClientError4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASIntegrationLogClientError integrationLogClientError = new OASIntegrationLogClientError();
        Map<String, String> x-property-mappings = integrationLogClientError.getx-property-mappings();
        System.assertEquals('columnNumber', x-property-mappings.get('column_number'));
        System.assertEquals('fileName', x-property-mappings.get('file_name'));
        System.assertEquals('lineNumber', x-property-mappings.get('line_number'));
        System.assertEquals('messageDetail', x-property-mappings.get('message_detail'));
        System.assertEquals('r_number', x-property-mappings.get('number'));
        System.assertEquals('stackTrace', x-property-mappings.get('stack_trace'));
    }
}
