@isTest
private class OASTemplateResponseDateRangeAbsoluteTest {
    @isTest
    private static void equalsSameInstance() {
        OASTemplateResponseDateRangeAbsolute templateResponseDateRangeAbsoluteDateRange1 = OASTemplateResponseDateRangeAbsolute.getExample();
        OASTemplateResponseDateRangeAbsolute templateResponseDateRangeAbsoluteDateRange2 = templateResponseDateRangeAbsoluteDateRange1;
        OASTemplateResponseDateRangeAbsolute templateResponseDateRangeAbsoluteDateRange3 = new OASTemplateResponseDateRangeAbsolute();
        OASTemplateResponseDateRangeAbsolute templateResponseDateRangeAbsoluteDateRange4 = templateResponseDateRangeAbsoluteDateRange3;

        System.assert(templateResponseDateRangeAbsoluteDateRange1.equals(templateResponseDateRangeAbsoluteDateRange2));
        System.assert(templateResponseDateRangeAbsoluteDateRange2.equals(templateResponseDateRangeAbsoluteDateRange1));
        System.assert(templateResponseDateRangeAbsoluteDateRange1.equals(templateResponseDateRangeAbsoluteDateRange1));
        System.assert(templateResponseDateRangeAbsoluteDateRange3.equals(templateResponseDateRangeAbsoluteDateRange4));
        System.assert(templateResponseDateRangeAbsoluteDateRange4.equals(templateResponseDateRangeAbsoluteDateRange3));
        System.assert(templateResponseDateRangeAbsoluteDateRange3.equals(templateResponseDateRangeAbsoluteDateRange3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTemplateResponseDateRangeAbsolute templateResponseDateRangeAbsoluteDateRange1 = OASTemplateResponseDateRangeAbsolute.getExample();
        OASTemplateResponseDateRangeAbsolute templateResponseDateRangeAbsoluteDateRange2 = OASTemplateResponseDateRangeAbsolute.getExample();
        OASTemplateResponseDateRangeAbsolute templateResponseDateRangeAbsoluteDateRange3 = new OASTemplateResponseDateRangeAbsolute();
        OASTemplateResponseDateRangeAbsolute templateResponseDateRangeAbsoluteDateRange4 = new OASTemplateResponseDateRangeAbsolute();

        System.assert(templateResponseDateRangeAbsoluteDateRange1.equals(templateResponseDateRangeAbsoluteDateRange2));
        System.assert(templateResponseDateRangeAbsoluteDateRange2.equals(templateResponseDateRangeAbsoluteDateRange1));
        System.assert(templateResponseDateRangeAbsoluteDateRange3.equals(templateResponseDateRangeAbsoluteDateRange4));
        System.assert(templateResponseDateRangeAbsoluteDateRange4.equals(templateResponseDateRangeAbsoluteDateRange3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTemplateResponseDateRangeAbsolute templateResponseDateRangeAbsoluteDateRange1 = OASTemplateResponseDateRangeAbsolute.getExample();
        OASTemplateResponseDateRangeAbsolute templateResponseDateRangeAbsoluteDateRange2 = new OASTemplateResponseDateRangeAbsolute();

        System.assertEquals(false, templateResponseDateRangeAbsoluteDateRange1.equals('foo'));
        System.assertEquals(false, templateResponseDateRangeAbsoluteDateRange2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTemplateResponseDateRangeAbsolute templateResponseDateRangeAbsoluteDateRange1 = OASTemplateResponseDateRangeAbsolute.getExample();
        OASTemplateResponseDateRangeAbsolute templateResponseDateRangeAbsoluteDateRange2 = new OASTemplateResponseDateRangeAbsolute();
        OASTemplateResponseDateRangeAbsolute templateResponseDateRangeAbsoluteDateRange3;

        System.assertEquals(false, templateResponseDateRangeAbsoluteDateRange1.equals(templateResponseDateRangeAbsoluteDateRange3));
        System.assertEquals(false, templateResponseDateRangeAbsoluteDateRange2.equals(templateResponseDateRangeAbsoluteDateRange3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTemplateResponseDateRangeAbsolute templateResponseDateRangeAbsoluteDateRange1 = OASTemplateResponseDateRangeAbsolute.getExample();
        OASTemplateResponseDateRangeAbsolute templateResponseDateRangeAbsoluteDateRange2 = new OASTemplateResponseDateRangeAbsolute();

        System.assertEquals(templateResponseDateRangeAbsoluteDateRange1.hashCode(), templateResponseDateRangeAbsoluteDateRange1.hashCode());
        System.assertEquals(templateResponseDateRangeAbsoluteDateRange2.hashCode(), templateResponseDateRangeAbsoluteDateRange2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTemplateResponseDateRangeAbsolute templateResponseDateRangeAbsoluteDateRange1 = OASTemplateResponseDateRangeAbsolute.getExample();
        OASTemplateResponseDateRangeAbsolute templateResponseDateRangeAbsoluteDateRange2 = OASTemplateResponseDateRangeAbsolute.getExample();
        OASTemplateResponseDateRangeAbsolute templateResponseDateRangeAbsoluteDateRange3 = new OASTemplateResponseDateRangeAbsolute();
        OASTemplateResponseDateRangeAbsolute templateResponseDateRangeAbsoluteDateRange4 = new OASTemplateResponseDateRangeAbsolute();

        System.assert(templateResponseDateRangeAbsoluteDateRange1.equals(templateResponseDateRangeAbsoluteDateRange2));
        System.assert(templateResponseDateRangeAbsoluteDateRange3.equals(templateResponseDateRangeAbsoluteDateRange4));
        System.assertEquals(templateResponseDateRangeAbsoluteDateRange1.hashCode(), templateResponseDateRangeAbsoluteDateRange2.hashCode());
        System.assertEquals(templateResponseDateRangeAbsoluteDateRange3.hashCode(), templateResponseDateRangeAbsoluteDateRange4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASTemplateResponseDateRangeAbsolute templateResponseDateRangeAbsoluteDateRange = new OASTemplateResponseDateRangeAbsolute();
        Map<String, String> x-property-mappings = templateResponseDateRangeAbsoluteDateRange.getx-property-mappings();
        System.assertEquals('startDate', x-property-mappings.get('start_date'));
        System.assertEquals('endDate', x-property-mappings.get('end_date'));
    }
}
