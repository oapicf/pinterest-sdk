@isTest
private class OASIntegrationsGetList200ResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASIntegrationsGetList200Response integrationsGetList200Response1 = OASIntegrationsGetList200Response.getExample();
        OASIntegrationsGetList200Response integrationsGetList200Response2 = integrationsGetList200Response1;
        OASIntegrationsGetList200Response integrationsGetList200Response3 = new OASIntegrationsGetList200Response();
        OASIntegrationsGetList200Response integrationsGetList200Response4 = integrationsGetList200Response3;

        System.assert(integrationsGetList200Response1.equals(integrationsGetList200Response2));
        System.assert(integrationsGetList200Response2.equals(integrationsGetList200Response1));
        System.assert(integrationsGetList200Response1.equals(integrationsGetList200Response1));
        System.assert(integrationsGetList200Response3.equals(integrationsGetList200Response4));
        System.assert(integrationsGetList200Response4.equals(integrationsGetList200Response3));
        System.assert(integrationsGetList200Response3.equals(integrationsGetList200Response3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASIntegrationsGetList200Response integrationsGetList200Response1 = OASIntegrationsGetList200Response.getExample();
        OASIntegrationsGetList200Response integrationsGetList200Response2 = OASIntegrationsGetList200Response.getExample();
        OASIntegrationsGetList200Response integrationsGetList200Response3 = new OASIntegrationsGetList200Response();
        OASIntegrationsGetList200Response integrationsGetList200Response4 = new OASIntegrationsGetList200Response();

        System.assert(integrationsGetList200Response1.equals(integrationsGetList200Response2));
        System.assert(integrationsGetList200Response2.equals(integrationsGetList200Response1));
        System.assert(integrationsGetList200Response3.equals(integrationsGetList200Response4));
        System.assert(integrationsGetList200Response4.equals(integrationsGetList200Response3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASIntegrationsGetList200Response integrationsGetList200Response1 = OASIntegrationsGetList200Response.getExample();
        OASIntegrationsGetList200Response integrationsGetList200Response2 = new OASIntegrationsGetList200Response();

        System.assertEquals(false, integrationsGetList200Response1.equals('foo'));
        System.assertEquals(false, integrationsGetList200Response2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASIntegrationsGetList200Response integrationsGetList200Response1 = OASIntegrationsGetList200Response.getExample();
        OASIntegrationsGetList200Response integrationsGetList200Response2 = new OASIntegrationsGetList200Response();
        OASIntegrationsGetList200Response integrationsGetList200Response3;

        System.assertEquals(false, integrationsGetList200Response1.equals(integrationsGetList200Response3));
        System.assertEquals(false, integrationsGetList200Response2.equals(integrationsGetList200Response3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASIntegrationsGetList200Response integrationsGetList200Response1 = OASIntegrationsGetList200Response.getExample();
        OASIntegrationsGetList200Response integrationsGetList200Response2 = new OASIntegrationsGetList200Response();

        System.assertEquals(integrationsGetList200Response1.hashCode(), integrationsGetList200Response1.hashCode());
        System.assertEquals(integrationsGetList200Response2.hashCode(), integrationsGetList200Response2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASIntegrationsGetList200Response integrationsGetList200Response1 = OASIntegrationsGetList200Response.getExample();
        OASIntegrationsGetList200Response integrationsGetList200Response2 = OASIntegrationsGetList200Response.getExample();
        OASIntegrationsGetList200Response integrationsGetList200Response3 = new OASIntegrationsGetList200Response();
        OASIntegrationsGetList200Response integrationsGetList200Response4 = new OASIntegrationsGetList200Response();

        System.assert(integrationsGetList200Response1.equals(integrationsGetList200Response2));
        System.assert(integrationsGetList200Response3.equals(integrationsGetList200Response4));
        System.assertEquals(integrationsGetList200Response1.hashCode(), integrationsGetList200Response2.hashCode());
        System.assertEquals(integrationsGetList200Response3.hashCode(), integrationsGetList200Response4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASIntegrationsGetList200Response integrationsGetList200Response = new OASIntegrationsGetList200Response();
        System.assertEquals(new List<OASIntegrationRecord>(), integrationsGetList200Response.items);
        System.assertEquals(null, integrationsGetList200Response.bookmark);
    }
}
