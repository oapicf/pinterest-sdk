@isTest
private class OASIntegrationsLogsPost400ResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASIntegrationsLogsPost400Response integrationsLogsPost400Response1 = OASIntegrationsLogsPost400Response.getExample();
        OASIntegrationsLogsPost400Response integrationsLogsPost400Response2 = integrationsLogsPost400Response1;
        OASIntegrationsLogsPost400Response integrationsLogsPost400Response3 = new OASIntegrationsLogsPost400Response();
        OASIntegrationsLogsPost400Response integrationsLogsPost400Response4 = integrationsLogsPost400Response3;

        System.assert(integrationsLogsPost400Response1.equals(integrationsLogsPost400Response2));
        System.assert(integrationsLogsPost400Response2.equals(integrationsLogsPost400Response1));
        System.assert(integrationsLogsPost400Response1.equals(integrationsLogsPost400Response1));
        System.assert(integrationsLogsPost400Response3.equals(integrationsLogsPost400Response4));
        System.assert(integrationsLogsPost400Response4.equals(integrationsLogsPost400Response3));
        System.assert(integrationsLogsPost400Response3.equals(integrationsLogsPost400Response3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASIntegrationsLogsPost400Response integrationsLogsPost400Response1 = OASIntegrationsLogsPost400Response.getExample();
        OASIntegrationsLogsPost400Response integrationsLogsPost400Response2 = OASIntegrationsLogsPost400Response.getExample();
        OASIntegrationsLogsPost400Response integrationsLogsPost400Response3 = new OASIntegrationsLogsPost400Response();
        OASIntegrationsLogsPost400Response integrationsLogsPost400Response4 = new OASIntegrationsLogsPost400Response();

        System.assert(integrationsLogsPost400Response1.equals(integrationsLogsPost400Response2));
        System.assert(integrationsLogsPost400Response2.equals(integrationsLogsPost400Response1));
        System.assert(integrationsLogsPost400Response3.equals(integrationsLogsPost400Response4));
        System.assert(integrationsLogsPost400Response4.equals(integrationsLogsPost400Response3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASIntegrationsLogsPost400Response integrationsLogsPost400Response1 = OASIntegrationsLogsPost400Response.getExample();
        OASIntegrationsLogsPost400Response integrationsLogsPost400Response2 = new OASIntegrationsLogsPost400Response();

        System.assertEquals(false, integrationsLogsPost400Response1.equals('foo'));
        System.assertEquals(false, integrationsLogsPost400Response2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASIntegrationsLogsPost400Response integrationsLogsPost400Response1 = OASIntegrationsLogsPost400Response.getExample();
        OASIntegrationsLogsPost400Response integrationsLogsPost400Response2 = new OASIntegrationsLogsPost400Response();
        OASIntegrationsLogsPost400Response integrationsLogsPost400Response3;

        System.assertEquals(false, integrationsLogsPost400Response1.equals(integrationsLogsPost400Response3));
        System.assertEquals(false, integrationsLogsPost400Response2.equals(integrationsLogsPost400Response3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASIntegrationsLogsPost400Response integrationsLogsPost400Response1 = OASIntegrationsLogsPost400Response.getExample();
        OASIntegrationsLogsPost400Response integrationsLogsPost400Response2 = new OASIntegrationsLogsPost400Response();

        System.assertEquals(integrationsLogsPost400Response1.hashCode(), integrationsLogsPost400Response1.hashCode());
        System.assertEquals(integrationsLogsPost400Response2.hashCode(), integrationsLogsPost400Response2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASIntegrationsLogsPost400Response integrationsLogsPost400Response1 = OASIntegrationsLogsPost400Response.getExample();
        OASIntegrationsLogsPost400Response integrationsLogsPost400Response2 = OASIntegrationsLogsPost400Response.getExample();
        OASIntegrationsLogsPost400Response integrationsLogsPost400Response3 = new OASIntegrationsLogsPost400Response();
        OASIntegrationsLogsPost400Response integrationsLogsPost400Response4 = new OASIntegrationsLogsPost400Response();

        System.assert(integrationsLogsPost400Response1.equals(integrationsLogsPost400Response2));
        System.assert(integrationsLogsPost400Response3.equals(integrationsLogsPost400Response4));
        System.assertEquals(integrationsLogsPost400Response1.hashCode(), integrationsLogsPost400Response2.hashCode());
        System.assertEquals(integrationsLogsPost400Response3.hashCode(), integrationsLogsPost400Response4.hashCode());
    }
}
