@isTest
private class OASTemplateResponseDateRangeDynamicDTest {
    @isTest
    private static void equalsSameInstance() {
        OASTemplateResponseDateRangeDynamicD templateResponseDateRangeDynamicDateRange1 = OASTemplateResponseDateRangeDynamicD.getExample();
        OASTemplateResponseDateRangeDynamicD templateResponseDateRangeDynamicDateRange2 = templateResponseDateRangeDynamicDateRange1;
        OASTemplateResponseDateRangeDynamicD templateResponseDateRangeDynamicDateRange3 = new OASTemplateResponseDateRangeDynamicD();
        OASTemplateResponseDateRangeDynamicD templateResponseDateRangeDynamicDateRange4 = templateResponseDateRangeDynamicDateRange3;

        System.assert(templateResponseDateRangeDynamicDateRange1.equals(templateResponseDateRangeDynamicDateRange2));
        System.assert(templateResponseDateRangeDynamicDateRange2.equals(templateResponseDateRangeDynamicDateRange1));
        System.assert(templateResponseDateRangeDynamicDateRange1.equals(templateResponseDateRangeDynamicDateRange1));
        System.assert(templateResponseDateRangeDynamicDateRange3.equals(templateResponseDateRangeDynamicDateRange4));
        System.assert(templateResponseDateRangeDynamicDateRange4.equals(templateResponseDateRangeDynamicDateRange3));
        System.assert(templateResponseDateRangeDynamicDateRange3.equals(templateResponseDateRangeDynamicDateRange3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTemplateResponseDateRangeDynamicD templateResponseDateRangeDynamicDateRange1 = OASTemplateResponseDateRangeDynamicD.getExample();
        OASTemplateResponseDateRangeDynamicD templateResponseDateRangeDynamicDateRange2 = OASTemplateResponseDateRangeDynamicD.getExample();
        OASTemplateResponseDateRangeDynamicD templateResponseDateRangeDynamicDateRange3 = new OASTemplateResponseDateRangeDynamicD();
        OASTemplateResponseDateRangeDynamicD templateResponseDateRangeDynamicDateRange4 = new OASTemplateResponseDateRangeDynamicD();

        System.assert(templateResponseDateRangeDynamicDateRange1.equals(templateResponseDateRangeDynamicDateRange2));
        System.assert(templateResponseDateRangeDynamicDateRange2.equals(templateResponseDateRangeDynamicDateRange1));
        System.assert(templateResponseDateRangeDynamicDateRange3.equals(templateResponseDateRangeDynamicDateRange4));
        System.assert(templateResponseDateRangeDynamicDateRange4.equals(templateResponseDateRangeDynamicDateRange3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTemplateResponseDateRangeDynamicD templateResponseDateRangeDynamicDateRange1 = OASTemplateResponseDateRangeDynamicD.getExample();
        OASTemplateResponseDateRangeDynamicD templateResponseDateRangeDynamicDateRange2 = new OASTemplateResponseDateRangeDynamicD();

        System.assertEquals(false, templateResponseDateRangeDynamicDateRange1.equals('foo'));
        System.assertEquals(false, templateResponseDateRangeDynamicDateRange2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTemplateResponseDateRangeDynamicD templateResponseDateRangeDynamicDateRange1 = OASTemplateResponseDateRangeDynamicD.getExample();
        OASTemplateResponseDateRangeDynamicD templateResponseDateRangeDynamicDateRange2 = new OASTemplateResponseDateRangeDynamicD();
        OASTemplateResponseDateRangeDynamicD templateResponseDateRangeDynamicDateRange3;

        System.assertEquals(false, templateResponseDateRangeDynamicDateRange1.equals(templateResponseDateRangeDynamicDateRange3));
        System.assertEquals(false, templateResponseDateRangeDynamicDateRange2.equals(templateResponseDateRangeDynamicDateRange3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTemplateResponseDateRangeDynamicD templateResponseDateRangeDynamicDateRange1 = OASTemplateResponseDateRangeDynamicD.getExample();
        OASTemplateResponseDateRangeDynamicD templateResponseDateRangeDynamicDateRange2 = new OASTemplateResponseDateRangeDynamicD();

        System.assertEquals(templateResponseDateRangeDynamicDateRange1.hashCode(), templateResponseDateRangeDynamicDateRange1.hashCode());
        System.assertEquals(templateResponseDateRangeDynamicDateRange2.hashCode(), templateResponseDateRangeDynamicDateRange2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTemplateResponseDateRangeDynamicD templateResponseDateRangeDynamicDateRange1 = OASTemplateResponseDateRangeDynamicD.getExample();
        OASTemplateResponseDateRangeDynamicD templateResponseDateRangeDynamicDateRange2 = OASTemplateResponseDateRangeDynamicD.getExample();
        OASTemplateResponseDateRangeDynamicD templateResponseDateRangeDynamicDateRange3 = new OASTemplateResponseDateRangeDynamicD();
        OASTemplateResponseDateRangeDynamicD templateResponseDateRangeDynamicDateRange4 = new OASTemplateResponseDateRangeDynamicD();

        System.assert(templateResponseDateRangeDynamicDateRange1.equals(templateResponseDateRangeDynamicDateRange2));
        System.assert(templateResponseDateRangeDynamicDateRange3.equals(templateResponseDateRangeDynamicDateRange4));
        System.assertEquals(templateResponseDateRangeDynamicDateRange1.hashCode(), templateResponseDateRangeDynamicDateRange2.hashCode());
        System.assertEquals(templateResponseDateRangeDynamicDateRange3.hashCode(), templateResponseDateRangeDynamicDateRange4.hashCode());
    }
}
