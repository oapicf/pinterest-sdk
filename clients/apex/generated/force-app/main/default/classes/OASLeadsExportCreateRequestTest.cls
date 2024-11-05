@isTest
private class OASLeadsExportCreateRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASLeadsExportCreateRequest leadsExportCreateRequest1 = OASLeadsExportCreateRequest.getExample();
        OASLeadsExportCreateRequest leadsExportCreateRequest2 = leadsExportCreateRequest1;
        OASLeadsExportCreateRequest leadsExportCreateRequest3 = new OASLeadsExportCreateRequest();
        OASLeadsExportCreateRequest leadsExportCreateRequest4 = leadsExportCreateRequest3;

        System.assert(leadsExportCreateRequest1.equals(leadsExportCreateRequest2));
        System.assert(leadsExportCreateRequest2.equals(leadsExportCreateRequest1));
        System.assert(leadsExportCreateRequest1.equals(leadsExportCreateRequest1));
        System.assert(leadsExportCreateRequest3.equals(leadsExportCreateRequest4));
        System.assert(leadsExportCreateRequest4.equals(leadsExportCreateRequest3));
        System.assert(leadsExportCreateRequest3.equals(leadsExportCreateRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASLeadsExportCreateRequest leadsExportCreateRequest1 = OASLeadsExportCreateRequest.getExample();
        OASLeadsExportCreateRequest leadsExportCreateRequest2 = OASLeadsExportCreateRequest.getExample();
        OASLeadsExportCreateRequest leadsExportCreateRequest3 = new OASLeadsExportCreateRequest();
        OASLeadsExportCreateRequest leadsExportCreateRequest4 = new OASLeadsExportCreateRequest();

        System.assert(leadsExportCreateRequest1.equals(leadsExportCreateRequest2));
        System.assert(leadsExportCreateRequest2.equals(leadsExportCreateRequest1));
        System.assert(leadsExportCreateRequest3.equals(leadsExportCreateRequest4));
        System.assert(leadsExportCreateRequest4.equals(leadsExportCreateRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASLeadsExportCreateRequest leadsExportCreateRequest1 = OASLeadsExportCreateRequest.getExample();
        OASLeadsExportCreateRequest leadsExportCreateRequest2 = new OASLeadsExportCreateRequest();

        System.assertEquals(false, leadsExportCreateRequest1.equals('foo'));
        System.assertEquals(false, leadsExportCreateRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASLeadsExportCreateRequest leadsExportCreateRequest1 = OASLeadsExportCreateRequest.getExample();
        OASLeadsExportCreateRequest leadsExportCreateRequest2 = new OASLeadsExportCreateRequest();
        OASLeadsExportCreateRequest leadsExportCreateRequest3;

        System.assertEquals(false, leadsExportCreateRequest1.equals(leadsExportCreateRequest3));
        System.assertEquals(false, leadsExportCreateRequest2.equals(leadsExportCreateRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASLeadsExportCreateRequest leadsExportCreateRequest1 = OASLeadsExportCreateRequest.getExample();
        OASLeadsExportCreateRequest leadsExportCreateRequest2 = new OASLeadsExportCreateRequest();

        System.assertEquals(leadsExportCreateRequest1.hashCode(), leadsExportCreateRequest1.hashCode());
        System.assertEquals(leadsExportCreateRequest2.hashCode(), leadsExportCreateRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASLeadsExportCreateRequest leadsExportCreateRequest1 = OASLeadsExportCreateRequest.getExample();
        OASLeadsExportCreateRequest leadsExportCreateRequest2 = OASLeadsExportCreateRequest.getExample();
        OASLeadsExportCreateRequest leadsExportCreateRequest3 = new OASLeadsExportCreateRequest();
        OASLeadsExportCreateRequest leadsExportCreateRequest4 = new OASLeadsExportCreateRequest();

        System.assert(leadsExportCreateRequest1.equals(leadsExportCreateRequest2));
        System.assert(leadsExportCreateRequest3.equals(leadsExportCreateRequest4));
        System.assertEquals(leadsExportCreateRequest1.hashCode(), leadsExportCreateRequest2.hashCode());
        System.assertEquals(leadsExportCreateRequest3.hashCode(), leadsExportCreateRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASLeadsExportCreateRequest leadsExportCreateRequest = new OASLeadsExportCreateRequest();
        Map<String, String> x-property-mappings = leadsExportCreateRequest.getx-property-mappings();
        System.assertEquals('startDate', x-property-mappings.get('start_date'));
        System.assertEquals('endDate', x-property-mappings.get('end_date'));
        System.assertEquals('adId', x-property-mappings.get('ad_id'));
    }
}
