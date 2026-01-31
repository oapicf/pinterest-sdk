@isTest
private class OASProductCategoriesMetricsHighlightTest {
    @isTest
    private static void equalsSameInstance() {
        OASProductCategoriesMetricsHighlight productCategoriesMetricsHighlights1 = OASProductCategoriesMetricsHighlight.getExample();
        OASProductCategoriesMetricsHighlight productCategoriesMetricsHighlights2 = productCategoriesMetricsHighlights1;
        OASProductCategoriesMetricsHighlight productCategoriesMetricsHighlights3 = new OASProductCategoriesMetricsHighlight();
        OASProductCategoriesMetricsHighlight productCategoriesMetricsHighlights4 = productCategoriesMetricsHighlights3;

        System.assert(productCategoriesMetricsHighlights1.equals(productCategoriesMetricsHighlights2));
        System.assert(productCategoriesMetricsHighlights2.equals(productCategoriesMetricsHighlights1));
        System.assert(productCategoriesMetricsHighlights1.equals(productCategoriesMetricsHighlights1));
        System.assert(productCategoriesMetricsHighlights3.equals(productCategoriesMetricsHighlights4));
        System.assert(productCategoriesMetricsHighlights4.equals(productCategoriesMetricsHighlights3));
        System.assert(productCategoriesMetricsHighlights3.equals(productCategoriesMetricsHighlights3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASProductCategoriesMetricsHighlight productCategoriesMetricsHighlights1 = OASProductCategoriesMetricsHighlight.getExample();
        OASProductCategoriesMetricsHighlight productCategoriesMetricsHighlights2 = OASProductCategoriesMetricsHighlight.getExample();
        OASProductCategoriesMetricsHighlight productCategoriesMetricsHighlights3 = new OASProductCategoriesMetricsHighlight();
        OASProductCategoriesMetricsHighlight productCategoriesMetricsHighlights4 = new OASProductCategoriesMetricsHighlight();

        System.assert(productCategoriesMetricsHighlights1.equals(productCategoriesMetricsHighlights2));
        System.assert(productCategoriesMetricsHighlights2.equals(productCategoriesMetricsHighlights1));
        System.assert(productCategoriesMetricsHighlights3.equals(productCategoriesMetricsHighlights4));
        System.assert(productCategoriesMetricsHighlights4.equals(productCategoriesMetricsHighlights3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASProductCategoriesMetricsHighlight productCategoriesMetricsHighlights1 = OASProductCategoriesMetricsHighlight.getExample();
        OASProductCategoriesMetricsHighlight productCategoriesMetricsHighlights2 = new OASProductCategoriesMetricsHighlight();

        System.assertEquals(false, productCategoriesMetricsHighlights1.equals('foo'));
        System.assertEquals(false, productCategoriesMetricsHighlights2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASProductCategoriesMetricsHighlight productCategoriesMetricsHighlights1 = OASProductCategoriesMetricsHighlight.getExample();
        OASProductCategoriesMetricsHighlight productCategoriesMetricsHighlights2 = new OASProductCategoriesMetricsHighlight();
        OASProductCategoriesMetricsHighlight productCategoriesMetricsHighlights3;

        System.assertEquals(false, productCategoriesMetricsHighlights1.equals(productCategoriesMetricsHighlights3));
        System.assertEquals(false, productCategoriesMetricsHighlights2.equals(productCategoriesMetricsHighlights3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASProductCategoriesMetricsHighlight productCategoriesMetricsHighlights1 = OASProductCategoriesMetricsHighlight.getExample();
        OASProductCategoriesMetricsHighlight productCategoriesMetricsHighlights2 = new OASProductCategoriesMetricsHighlight();

        System.assertEquals(productCategoriesMetricsHighlights1.hashCode(), productCategoriesMetricsHighlights1.hashCode());
        System.assertEquals(productCategoriesMetricsHighlights2.hashCode(), productCategoriesMetricsHighlights2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASProductCategoriesMetricsHighlight productCategoriesMetricsHighlights1 = OASProductCategoriesMetricsHighlight.getExample();
        OASProductCategoriesMetricsHighlight productCategoriesMetricsHighlights2 = OASProductCategoriesMetricsHighlight.getExample();
        OASProductCategoriesMetricsHighlight productCategoriesMetricsHighlights3 = new OASProductCategoriesMetricsHighlight();
        OASProductCategoriesMetricsHighlight productCategoriesMetricsHighlights4 = new OASProductCategoriesMetricsHighlight();

        System.assert(productCategoriesMetricsHighlights1.equals(productCategoriesMetricsHighlights2));
        System.assert(productCategoriesMetricsHighlights3.equals(productCategoriesMetricsHighlights4));
        System.assertEquals(productCategoriesMetricsHighlights1.hashCode(), productCategoriesMetricsHighlights2.hashCode());
        System.assertEquals(productCategoriesMetricsHighlights3.hashCode(), productCategoriesMetricsHighlights4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASProductCategoriesMetricsHighlight productCategoriesMetricsHighlights = new OASProductCategoriesMetricsHighlight();
        Map<String, String> x-property-mappings = productCategoriesMetricsHighlights.getx-property-mappings();
        System.assertEquals('outboundClicks', x-property-mappings.get('outbound_clicks'));
        System.assertEquals('pinSaves', x-property-mappings.get('pin_saves'));
    }
}
