@isTest
private class OASLeadsExportCreateResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASLeadsExportCreateResponse leadsExportCreateResponse1 = OASLeadsExportCreateResponse.getExample();
        OASLeadsExportCreateResponse leadsExportCreateResponse2 = leadsExportCreateResponse1;
        OASLeadsExportCreateResponse leadsExportCreateResponse3 = new OASLeadsExportCreateResponse();
        OASLeadsExportCreateResponse leadsExportCreateResponse4 = leadsExportCreateResponse3;

        System.assert(leadsExportCreateResponse1.equals(leadsExportCreateResponse2));
        System.assert(leadsExportCreateResponse2.equals(leadsExportCreateResponse1));
        System.assert(leadsExportCreateResponse1.equals(leadsExportCreateResponse1));
        System.assert(leadsExportCreateResponse3.equals(leadsExportCreateResponse4));
        System.assert(leadsExportCreateResponse4.equals(leadsExportCreateResponse3));
        System.assert(leadsExportCreateResponse3.equals(leadsExportCreateResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASLeadsExportCreateResponse leadsExportCreateResponse1 = OASLeadsExportCreateResponse.getExample();
        OASLeadsExportCreateResponse leadsExportCreateResponse2 = OASLeadsExportCreateResponse.getExample();
        OASLeadsExportCreateResponse leadsExportCreateResponse3 = new OASLeadsExportCreateResponse();
        OASLeadsExportCreateResponse leadsExportCreateResponse4 = new OASLeadsExportCreateResponse();

        System.assert(leadsExportCreateResponse1.equals(leadsExportCreateResponse2));
        System.assert(leadsExportCreateResponse2.equals(leadsExportCreateResponse1));
        System.assert(leadsExportCreateResponse3.equals(leadsExportCreateResponse4));
        System.assert(leadsExportCreateResponse4.equals(leadsExportCreateResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASLeadsExportCreateResponse leadsExportCreateResponse1 = OASLeadsExportCreateResponse.getExample();
        OASLeadsExportCreateResponse leadsExportCreateResponse2 = new OASLeadsExportCreateResponse();

        System.assertEquals(false, leadsExportCreateResponse1.equals('foo'));
        System.assertEquals(false, leadsExportCreateResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASLeadsExportCreateResponse leadsExportCreateResponse1 = OASLeadsExportCreateResponse.getExample();
        OASLeadsExportCreateResponse leadsExportCreateResponse2 = new OASLeadsExportCreateResponse();
        OASLeadsExportCreateResponse leadsExportCreateResponse3;

        System.assertEquals(false, leadsExportCreateResponse1.equals(leadsExportCreateResponse3));
        System.assertEquals(false, leadsExportCreateResponse2.equals(leadsExportCreateResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASLeadsExportCreateResponse leadsExportCreateResponse1 = OASLeadsExportCreateResponse.getExample();
        OASLeadsExportCreateResponse leadsExportCreateResponse2 = new OASLeadsExportCreateResponse();

        System.assertEquals(leadsExportCreateResponse1.hashCode(), leadsExportCreateResponse1.hashCode());
        System.assertEquals(leadsExportCreateResponse2.hashCode(), leadsExportCreateResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASLeadsExportCreateResponse leadsExportCreateResponse1 = OASLeadsExportCreateResponse.getExample();
        OASLeadsExportCreateResponse leadsExportCreateResponse2 = OASLeadsExportCreateResponse.getExample();
        OASLeadsExportCreateResponse leadsExportCreateResponse3 = new OASLeadsExportCreateResponse();
        OASLeadsExportCreateResponse leadsExportCreateResponse4 = new OASLeadsExportCreateResponse();

        System.assert(leadsExportCreateResponse1.equals(leadsExportCreateResponse2));
        System.assert(leadsExportCreateResponse3.equals(leadsExportCreateResponse4));
        System.assertEquals(leadsExportCreateResponse1.hashCode(), leadsExportCreateResponse2.hashCode());
        System.assertEquals(leadsExportCreateResponse3.hashCode(), leadsExportCreateResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASLeadsExportCreateResponse leadsExportCreateResponse = new OASLeadsExportCreateResponse();
        Map<String, String> x-property-mappings = leadsExportCreateResponse.getx-property-mappings();
        System.assertEquals('leadsExportId', x-property-mappings.get('leads_export_id'));
    }
}
