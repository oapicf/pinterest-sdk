@isTest
private class OASTemplateBasedReportTest {
    @isTest
    private static void equalsSameInstance() {
        OASTemplateBasedReport templateBasedReport1 = OASTemplateBasedReport.getExample();
        OASTemplateBasedReport templateBasedReport2 = templateBasedReport1;
        OASTemplateBasedReport templateBasedReport3 = new OASTemplateBasedReport();
        OASTemplateBasedReport templateBasedReport4 = templateBasedReport3;

        System.assert(templateBasedReport1.equals(templateBasedReport2));
        System.assert(templateBasedReport2.equals(templateBasedReport1));
        System.assert(templateBasedReport1.equals(templateBasedReport1));
        System.assert(templateBasedReport3.equals(templateBasedReport4));
        System.assert(templateBasedReport4.equals(templateBasedReport3));
        System.assert(templateBasedReport3.equals(templateBasedReport3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTemplateBasedReport templateBasedReport1 = OASTemplateBasedReport.getExample();
        OASTemplateBasedReport templateBasedReport2 = OASTemplateBasedReport.getExample();
        OASTemplateBasedReport templateBasedReport3 = new OASTemplateBasedReport();
        OASTemplateBasedReport templateBasedReport4 = new OASTemplateBasedReport();

        System.assert(templateBasedReport1.equals(templateBasedReport2));
        System.assert(templateBasedReport2.equals(templateBasedReport1));
        System.assert(templateBasedReport3.equals(templateBasedReport4));
        System.assert(templateBasedReport4.equals(templateBasedReport3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTemplateBasedReport templateBasedReport1 = OASTemplateBasedReport.getExample();
        OASTemplateBasedReport templateBasedReport2 = new OASTemplateBasedReport();

        System.assertEquals(false, templateBasedReport1.equals('foo'));
        System.assertEquals(false, templateBasedReport2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTemplateBasedReport templateBasedReport1 = OASTemplateBasedReport.getExample();
        OASTemplateBasedReport templateBasedReport2 = new OASTemplateBasedReport();
        OASTemplateBasedReport templateBasedReport3;

        System.assertEquals(false, templateBasedReport1.equals(templateBasedReport3));
        System.assertEquals(false, templateBasedReport2.equals(templateBasedReport3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTemplateBasedReport templateBasedReport1 = OASTemplateBasedReport.getExample();
        OASTemplateBasedReport templateBasedReport2 = new OASTemplateBasedReport();

        System.assertEquals(templateBasedReport1.hashCode(), templateBasedReport1.hashCode());
        System.assertEquals(templateBasedReport2.hashCode(), templateBasedReport2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTemplateBasedReport templateBasedReport1 = OASTemplateBasedReport.getExample();
        OASTemplateBasedReport templateBasedReport2 = OASTemplateBasedReport.getExample();
        OASTemplateBasedReport templateBasedReport3 = new OASTemplateBasedReport();
        OASTemplateBasedReport templateBasedReport4 = new OASTemplateBasedReport();

        System.assert(templateBasedReport1.equals(templateBasedReport2));
        System.assert(templateBasedReport3.equals(templateBasedReport4));
        System.assertEquals(templateBasedReport1.hashCode(), templateBasedReport2.hashCode());
        System.assertEquals(templateBasedReport3.hashCode(), templateBasedReport4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASTemplateBasedReport templateBasedReport = new OASTemplateBasedReport();
        Map<String, String> x-property-mappings = templateBasedReport.getx-property-mappings();
        System.assertEquals('reportStatus', x-property-mappings.get('report_status'));
        System.assertEquals('templateId', x-property-mappings.get('template_id'));
    }
}
