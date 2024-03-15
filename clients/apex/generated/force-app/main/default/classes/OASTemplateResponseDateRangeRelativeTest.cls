@isTest
private class OASTemplateResponseDateRangeRelativeTest {
    @isTest
    private static void equalsSameInstance() {
        OASTemplateResponseDateRangeRelative templateResponseDateRangeRelativeDateRange1 = OASTemplateResponseDateRangeRelative.getExample();
        OASTemplateResponseDateRangeRelative templateResponseDateRangeRelativeDateRange2 = templateResponseDateRangeRelativeDateRange1;
        OASTemplateResponseDateRangeRelative templateResponseDateRangeRelativeDateRange3 = new OASTemplateResponseDateRangeRelative();
        OASTemplateResponseDateRangeRelative templateResponseDateRangeRelativeDateRange4 = templateResponseDateRangeRelativeDateRange3;

        System.assert(templateResponseDateRangeRelativeDateRange1.equals(templateResponseDateRangeRelativeDateRange2));
        System.assert(templateResponseDateRangeRelativeDateRange2.equals(templateResponseDateRangeRelativeDateRange1));
        System.assert(templateResponseDateRangeRelativeDateRange1.equals(templateResponseDateRangeRelativeDateRange1));
        System.assert(templateResponseDateRangeRelativeDateRange3.equals(templateResponseDateRangeRelativeDateRange4));
        System.assert(templateResponseDateRangeRelativeDateRange4.equals(templateResponseDateRangeRelativeDateRange3));
        System.assert(templateResponseDateRangeRelativeDateRange3.equals(templateResponseDateRangeRelativeDateRange3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTemplateResponseDateRangeRelative templateResponseDateRangeRelativeDateRange1 = OASTemplateResponseDateRangeRelative.getExample();
        OASTemplateResponseDateRangeRelative templateResponseDateRangeRelativeDateRange2 = OASTemplateResponseDateRangeRelative.getExample();
        OASTemplateResponseDateRangeRelative templateResponseDateRangeRelativeDateRange3 = new OASTemplateResponseDateRangeRelative();
        OASTemplateResponseDateRangeRelative templateResponseDateRangeRelativeDateRange4 = new OASTemplateResponseDateRangeRelative();

        System.assert(templateResponseDateRangeRelativeDateRange1.equals(templateResponseDateRangeRelativeDateRange2));
        System.assert(templateResponseDateRangeRelativeDateRange2.equals(templateResponseDateRangeRelativeDateRange1));
        System.assert(templateResponseDateRangeRelativeDateRange3.equals(templateResponseDateRangeRelativeDateRange4));
        System.assert(templateResponseDateRangeRelativeDateRange4.equals(templateResponseDateRangeRelativeDateRange3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTemplateResponseDateRangeRelative templateResponseDateRangeRelativeDateRange1 = OASTemplateResponseDateRangeRelative.getExample();
        OASTemplateResponseDateRangeRelative templateResponseDateRangeRelativeDateRange2 = new OASTemplateResponseDateRangeRelative();

        System.assertEquals(false, templateResponseDateRangeRelativeDateRange1.equals('foo'));
        System.assertEquals(false, templateResponseDateRangeRelativeDateRange2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTemplateResponseDateRangeRelative templateResponseDateRangeRelativeDateRange1 = OASTemplateResponseDateRangeRelative.getExample();
        OASTemplateResponseDateRangeRelative templateResponseDateRangeRelativeDateRange2 = new OASTemplateResponseDateRangeRelative();
        OASTemplateResponseDateRangeRelative templateResponseDateRangeRelativeDateRange3;

        System.assertEquals(false, templateResponseDateRangeRelativeDateRange1.equals(templateResponseDateRangeRelativeDateRange3));
        System.assertEquals(false, templateResponseDateRangeRelativeDateRange2.equals(templateResponseDateRangeRelativeDateRange3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTemplateResponseDateRangeRelative templateResponseDateRangeRelativeDateRange1 = OASTemplateResponseDateRangeRelative.getExample();
        OASTemplateResponseDateRangeRelative templateResponseDateRangeRelativeDateRange2 = new OASTemplateResponseDateRangeRelative();

        System.assertEquals(templateResponseDateRangeRelativeDateRange1.hashCode(), templateResponseDateRangeRelativeDateRange1.hashCode());
        System.assertEquals(templateResponseDateRangeRelativeDateRange2.hashCode(), templateResponseDateRangeRelativeDateRange2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTemplateResponseDateRangeRelative templateResponseDateRangeRelativeDateRange1 = OASTemplateResponseDateRangeRelative.getExample();
        OASTemplateResponseDateRangeRelative templateResponseDateRangeRelativeDateRange2 = OASTemplateResponseDateRangeRelative.getExample();
        OASTemplateResponseDateRangeRelative templateResponseDateRangeRelativeDateRange3 = new OASTemplateResponseDateRangeRelative();
        OASTemplateResponseDateRangeRelative templateResponseDateRangeRelativeDateRange4 = new OASTemplateResponseDateRangeRelative();

        System.assert(templateResponseDateRangeRelativeDateRange1.equals(templateResponseDateRangeRelativeDateRange2));
        System.assert(templateResponseDateRangeRelativeDateRange3.equals(templateResponseDateRangeRelativeDateRange4));
        System.assertEquals(templateResponseDateRangeRelativeDateRange1.hashCode(), templateResponseDateRangeRelativeDateRange2.hashCode());
        System.assertEquals(templateResponseDateRangeRelativeDateRange3.hashCode(), templateResponseDateRangeRelativeDateRange4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASTemplateResponseDateRangeRelative templateResponseDateRangeRelativeDateRange = new OASTemplateResponseDateRangeRelative();
        Map<String, String> x-property-mappings = templateResponseDateRangeRelativeDateRange.getx-property-mappings();
        System.assertEquals('startDaysInPast', x-property-mappings.get('start_days_in_past'));
        System.assertEquals('endDaysInPast', x-property-mappings.get('end_days_in_past'));
    }
}
