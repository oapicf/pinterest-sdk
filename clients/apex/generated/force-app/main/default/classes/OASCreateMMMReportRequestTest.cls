@isTest
private class OASCreateMMMReportRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateMMMReportRequest createMMMReportRequest1 = OASCreateMMMReportRequest.getExample();
        OASCreateMMMReportRequest createMMMReportRequest2 = createMMMReportRequest1;
        OASCreateMMMReportRequest createMMMReportRequest3 = new OASCreateMMMReportRequest();
        OASCreateMMMReportRequest createMMMReportRequest4 = createMMMReportRequest3;

        System.assert(createMMMReportRequest1.equals(createMMMReportRequest2));
        System.assert(createMMMReportRequest2.equals(createMMMReportRequest1));
        System.assert(createMMMReportRequest1.equals(createMMMReportRequest1));
        System.assert(createMMMReportRequest3.equals(createMMMReportRequest4));
        System.assert(createMMMReportRequest4.equals(createMMMReportRequest3));
        System.assert(createMMMReportRequest3.equals(createMMMReportRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateMMMReportRequest createMMMReportRequest1 = OASCreateMMMReportRequest.getExample();
        OASCreateMMMReportRequest createMMMReportRequest2 = OASCreateMMMReportRequest.getExample();
        OASCreateMMMReportRequest createMMMReportRequest3 = new OASCreateMMMReportRequest();
        OASCreateMMMReportRequest createMMMReportRequest4 = new OASCreateMMMReportRequest();

        System.assert(createMMMReportRequest1.equals(createMMMReportRequest2));
        System.assert(createMMMReportRequest2.equals(createMMMReportRequest1));
        System.assert(createMMMReportRequest3.equals(createMMMReportRequest4));
        System.assert(createMMMReportRequest4.equals(createMMMReportRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateMMMReportRequest createMMMReportRequest1 = OASCreateMMMReportRequest.getExample();
        OASCreateMMMReportRequest createMMMReportRequest2 = new OASCreateMMMReportRequest();

        System.assertEquals(false, createMMMReportRequest1.equals('foo'));
        System.assertEquals(false, createMMMReportRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateMMMReportRequest createMMMReportRequest1 = OASCreateMMMReportRequest.getExample();
        OASCreateMMMReportRequest createMMMReportRequest2 = new OASCreateMMMReportRequest();
        OASCreateMMMReportRequest createMMMReportRequest3;

        System.assertEquals(false, createMMMReportRequest1.equals(createMMMReportRequest3));
        System.assertEquals(false, createMMMReportRequest2.equals(createMMMReportRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateMMMReportRequest createMMMReportRequest1 = OASCreateMMMReportRequest.getExample();
        OASCreateMMMReportRequest createMMMReportRequest2 = new OASCreateMMMReportRequest();

        System.assertEquals(createMMMReportRequest1.hashCode(), createMMMReportRequest1.hashCode());
        System.assertEquals(createMMMReportRequest2.hashCode(), createMMMReportRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateMMMReportRequest createMMMReportRequest1 = OASCreateMMMReportRequest.getExample();
        OASCreateMMMReportRequest createMMMReportRequest2 = OASCreateMMMReportRequest.getExample();
        OASCreateMMMReportRequest createMMMReportRequest3 = new OASCreateMMMReportRequest();
        OASCreateMMMReportRequest createMMMReportRequest4 = new OASCreateMMMReportRequest();

        System.assert(createMMMReportRequest1.equals(createMMMReportRequest2));
        System.assert(createMMMReportRequest3.equals(createMMMReportRequest4));
        System.assertEquals(createMMMReportRequest1.hashCode(), createMMMReportRequest2.hashCode());
        System.assertEquals(createMMMReportRequest3.hashCode(), createMMMReportRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCreateMMMReportRequest createMMMReportRequest = new OASCreateMMMReportRequest();
        Map<String, String> x-property-mappings = createMMMReportRequest.getx-property-mappings();
        System.assertEquals('reportName', x-property-mappings.get('report_name'));
        System.assertEquals('startDate', x-property-mappings.get('start_date'));
        System.assertEquals('endDate', x-property-mappings.get('end_date'));
        System.assertEquals('targetingTypes', x-property-mappings.get('targeting_types'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCreateMMMReportRequest createMMMReportRequest = new OASCreateMMMReportRequest();
        System.assertEquals(new List<OASMMMReportingTargetingType>(), createMMMReportRequest.targetingTypes);
        System.assertEquals(new List<OASMMMReportingColumn>(), createMMMReportRequest.columns);
        System.assertEquals(new List<OASTargetingAdvertiserCountry>(), createMMMReportRequest.countries);
        System.assertEquals(null, createMMMReportRequest.reportName);
        System.assertEquals(null, createMMMReportRequest.startDate);
        System.assertEquals(null, createMMMReportRequest.endDate);
        System.assertEquals(null, createMMMReportRequest.granularity);
        System.assertEquals(null, createMMMReportRequest.level);
    }
}
