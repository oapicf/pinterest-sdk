@isTest
private class OASInnerProductCategoriesMetricsHighTest {
    @isTest
    private static void equalsSameInstance() {
        OASInnerProductCategoriesMetricsHigh innerProductCategoriesMetricsHighlights1 = OASInnerProductCategoriesMetricsHigh.getExample();
        OASInnerProductCategoriesMetricsHigh innerProductCategoriesMetricsHighlights2 = innerProductCategoriesMetricsHighlights1;
        OASInnerProductCategoriesMetricsHigh innerProductCategoriesMetricsHighlights3 = new OASInnerProductCategoriesMetricsHigh();
        OASInnerProductCategoriesMetricsHigh innerProductCategoriesMetricsHighlights4 = innerProductCategoriesMetricsHighlights3;

        System.assert(innerProductCategoriesMetricsHighlights1.equals(innerProductCategoriesMetricsHighlights2));
        System.assert(innerProductCategoriesMetricsHighlights2.equals(innerProductCategoriesMetricsHighlights1));
        System.assert(innerProductCategoriesMetricsHighlights1.equals(innerProductCategoriesMetricsHighlights1));
        System.assert(innerProductCategoriesMetricsHighlights3.equals(innerProductCategoriesMetricsHighlights4));
        System.assert(innerProductCategoriesMetricsHighlights4.equals(innerProductCategoriesMetricsHighlights3));
        System.assert(innerProductCategoriesMetricsHighlights3.equals(innerProductCategoriesMetricsHighlights3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASInnerProductCategoriesMetricsHigh innerProductCategoriesMetricsHighlights1 = OASInnerProductCategoriesMetricsHigh.getExample();
        OASInnerProductCategoriesMetricsHigh innerProductCategoriesMetricsHighlights2 = OASInnerProductCategoriesMetricsHigh.getExample();
        OASInnerProductCategoriesMetricsHigh innerProductCategoriesMetricsHighlights3 = new OASInnerProductCategoriesMetricsHigh();
        OASInnerProductCategoriesMetricsHigh innerProductCategoriesMetricsHighlights4 = new OASInnerProductCategoriesMetricsHigh();

        System.assert(innerProductCategoriesMetricsHighlights1.equals(innerProductCategoriesMetricsHighlights2));
        System.assert(innerProductCategoriesMetricsHighlights2.equals(innerProductCategoriesMetricsHighlights1));
        System.assert(innerProductCategoriesMetricsHighlights3.equals(innerProductCategoriesMetricsHighlights4));
        System.assert(innerProductCategoriesMetricsHighlights4.equals(innerProductCategoriesMetricsHighlights3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASInnerProductCategoriesMetricsHigh innerProductCategoriesMetricsHighlights1 = OASInnerProductCategoriesMetricsHigh.getExample();
        OASInnerProductCategoriesMetricsHigh innerProductCategoriesMetricsHighlights2 = new OASInnerProductCategoriesMetricsHigh();

        System.assertEquals(false, innerProductCategoriesMetricsHighlights1.equals('foo'));
        System.assertEquals(false, innerProductCategoriesMetricsHighlights2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASInnerProductCategoriesMetricsHigh innerProductCategoriesMetricsHighlights1 = OASInnerProductCategoriesMetricsHigh.getExample();
        OASInnerProductCategoriesMetricsHigh innerProductCategoriesMetricsHighlights2 = new OASInnerProductCategoriesMetricsHigh();
        OASInnerProductCategoriesMetricsHigh innerProductCategoriesMetricsHighlights3;

        System.assertEquals(false, innerProductCategoriesMetricsHighlights1.equals(innerProductCategoriesMetricsHighlights3));
        System.assertEquals(false, innerProductCategoriesMetricsHighlights2.equals(innerProductCategoriesMetricsHighlights3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASInnerProductCategoriesMetricsHigh innerProductCategoriesMetricsHighlights1 = OASInnerProductCategoriesMetricsHigh.getExample();
        OASInnerProductCategoriesMetricsHigh innerProductCategoriesMetricsHighlights2 = new OASInnerProductCategoriesMetricsHigh();

        System.assertEquals(innerProductCategoriesMetricsHighlights1.hashCode(), innerProductCategoriesMetricsHighlights1.hashCode());
        System.assertEquals(innerProductCategoriesMetricsHighlights2.hashCode(), innerProductCategoriesMetricsHighlights2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASInnerProductCategoriesMetricsHigh innerProductCategoriesMetricsHighlights1 = OASInnerProductCategoriesMetricsHigh.getExample();
        OASInnerProductCategoriesMetricsHigh innerProductCategoriesMetricsHighlights2 = OASInnerProductCategoriesMetricsHigh.getExample();
        OASInnerProductCategoriesMetricsHigh innerProductCategoriesMetricsHighlights3 = new OASInnerProductCategoriesMetricsHigh();
        OASInnerProductCategoriesMetricsHigh innerProductCategoriesMetricsHighlights4 = new OASInnerProductCategoriesMetricsHigh();

        System.assert(innerProductCategoriesMetricsHighlights1.equals(innerProductCategoriesMetricsHighlights2));
        System.assert(innerProductCategoriesMetricsHighlights3.equals(innerProductCategoriesMetricsHighlights4));
        System.assertEquals(innerProductCategoriesMetricsHighlights1.hashCode(), innerProductCategoriesMetricsHighlights2.hashCode());
        System.assertEquals(innerProductCategoriesMetricsHighlights3.hashCode(), innerProductCategoriesMetricsHighlights4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASInnerProductCategoriesMetricsHigh innerProductCategoriesMetricsHighlights = new OASInnerProductCategoriesMetricsHigh();
        Map<String, String> x-property-mappings = innerProductCategoriesMetricsHighlights.getx-property-mappings();
        System.assertEquals('pctChangeMom', x-property-mappings.get('pct_change_mom'));
    }
}
