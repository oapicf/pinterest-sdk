@isTest
private class OASTemplateResponseDateRangeTest {
    @isTest
    private static void equalsSameInstance() {
        OASTemplateResponseDateRange templateResponseDateRange1 = OASTemplateResponseDateRange.getExample();
        OASTemplateResponseDateRange templateResponseDateRange2 = templateResponseDateRange1;
        OASTemplateResponseDateRange templateResponseDateRange3 = new OASTemplateResponseDateRange();
        OASTemplateResponseDateRange templateResponseDateRange4 = templateResponseDateRange3;

        System.assert(templateResponseDateRange1.equals(templateResponseDateRange2));
        System.assert(templateResponseDateRange2.equals(templateResponseDateRange1));
        System.assert(templateResponseDateRange1.equals(templateResponseDateRange1));
        System.assert(templateResponseDateRange3.equals(templateResponseDateRange4));
        System.assert(templateResponseDateRange4.equals(templateResponseDateRange3));
        System.assert(templateResponseDateRange3.equals(templateResponseDateRange3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTemplateResponseDateRange templateResponseDateRange1 = OASTemplateResponseDateRange.getExample();
        OASTemplateResponseDateRange templateResponseDateRange2 = OASTemplateResponseDateRange.getExample();
        OASTemplateResponseDateRange templateResponseDateRange3 = new OASTemplateResponseDateRange();
        OASTemplateResponseDateRange templateResponseDateRange4 = new OASTemplateResponseDateRange();

        System.assert(templateResponseDateRange1.equals(templateResponseDateRange2));
        System.assert(templateResponseDateRange2.equals(templateResponseDateRange1));
        System.assert(templateResponseDateRange3.equals(templateResponseDateRange4));
        System.assert(templateResponseDateRange4.equals(templateResponseDateRange3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTemplateResponseDateRange templateResponseDateRange1 = OASTemplateResponseDateRange.getExample();
        OASTemplateResponseDateRange templateResponseDateRange2 = new OASTemplateResponseDateRange();

        System.assertEquals(false, templateResponseDateRange1.equals('foo'));
        System.assertEquals(false, templateResponseDateRange2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTemplateResponseDateRange templateResponseDateRange1 = OASTemplateResponseDateRange.getExample();
        OASTemplateResponseDateRange templateResponseDateRange2 = new OASTemplateResponseDateRange();
        OASTemplateResponseDateRange templateResponseDateRange3;

        System.assertEquals(false, templateResponseDateRange1.equals(templateResponseDateRange3));
        System.assertEquals(false, templateResponseDateRange2.equals(templateResponseDateRange3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTemplateResponseDateRange templateResponseDateRange1 = OASTemplateResponseDateRange.getExample();
        OASTemplateResponseDateRange templateResponseDateRange2 = new OASTemplateResponseDateRange();

        System.assertEquals(templateResponseDateRange1.hashCode(), templateResponseDateRange1.hashCode());
        System.assertEquals(templateResponseDateRange2.hashCode(), templateResponseDateRange2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTemplateResponseDateRange templateResponseDateRange1 = OASTemplateResponseDateRange.getExample();
        OASTemplateResponseDateRange templateResponseDateRange2 = OASTemplateResponseDateRange.getExample();
        OASTemplateResponseDateRange templateResponseDateRange3 = new OASTemplateResponseDateRange();
        OASTemplateResponseDateRange templateResponseDateRange4 = new OASTemplateResponseDateRange();

        System.assert(templateResponseDateRange1.equals(templateResponseDateRange2));
        System.assert(templateResponseDateRange3.equals(templateResponseDateRange4));
        System.assertEquals(templateResponseDateRange1.hashCode(), templateResponseDateRange2.hashCode());
        System.assertEquals(templateResponseDateRange3.hashCode(), templateResponseDateRange4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASTemplateResponseDateRange templateResponseDateRange = new OASTemplateResponseDateRange();
        Map<String, String> x-property-mappings = templateResponseDateRange.getx-property-mappings();
        System.assertEquals('dynamicDateRange', x-property-mappings.get('dynamic_date_range'));
        System.assertEquals('relativeDateRange', x-property-mappings.get('relative_date_range'));
        System.assertEquals('absoluteDateRange', x-property-mappings.get('absolute_date_range'));
    }
}
