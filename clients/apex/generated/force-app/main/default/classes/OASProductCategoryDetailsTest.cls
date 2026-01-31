@isTest
private class OASProductCategoryDetailsTest {
    @isTest
    private static void equalsSameInstance() {
        OASProductCategoryDetails productCategoryDetails1 = OASProductCategoryDetails.getExample();
        OASProductCategoryDetails productCategoryDetails2 = productCategoryDetails1;
        OASProductCategoryDetails productCategoryDetails3 = new OASProductCategoryDetails();
        OASProductCategoryDetails productCategoryDetails4 = productCategoryDetails3;

        System.assert(productCategoryDetails1.equals(productCategoryDetails2));
        System.assert(productCategoryDetails2.equals(productCategoryDetails1));
        System.assert(productCategoryDetails1.equals(productCategoryDetails1));
        System.assert(productCategoryDetails3.equals(productCategoryDetails4));
        System.assert(productCategoryDetails4.equals(productCategoryDetails3));
        System.assert(productCategoryDetails3.equals(productCategoryDetails3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASProductCategoryDetails productCategoryDetails1 = OASProductCategoryDetails.getExample();
        OASProductCategoryDetails productCategoryDetails2 = OASProductCategoryDetails.getExample();
        OASProductCategoryDetails productCategoryDetails3 = new OASProductCategoryDetails();
        OASProductCategoryDetails productCategoryDetails4 = new OASProductCategoryDetails();

        System.assert(productCategoryDetails1.equals(productCategoryDetails2));
        System.assert(productCategoryDetails2.equals(productCategoryDetails1));
        System.assert(productCategoryDetails3.equals(productCategoryDetails4));
        System.assert(productCategoryDetails4.equals(productCategoryDetails3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASProductCategoryDetails productCategoryDetails1 = OASProductCategoryDetails.getExample();
        OASProductCategoryDetails productCategoryDetails2 = new OASProductCategoryDetails();

        System.assertEquals(false, productCategoryDetails1.equals('foo'));
        System.assertEquals(false, productCategoryDetails2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASProductCategoryDetails productCategoryDetails1 = OASProductCategoryDetails.getExample();
        OASProductCategoryDetails productCategoryDetails2 = new OASProductCategoryDetails();
        OASProductCategoryDetails productCategoryDetails3;

        System.assertEquals(false, productCategoryDetails1.equals(productCategoryDetails3));
        System.assertEquals(false, productCategoryDetails2.equals(productCategoryDetails3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASProductCategoryDetails productCategoryDetails1 = OASProductCategoryDetails.getExample();
        OASProductCategoryDetails productCategoryDetails2 = new OASProductCategoryDetails();

        System.assertEquals(productCategoryDetails1.hashCode(), productCategoryDetails1.hashCode());
        System.assertEquals(productCategoryDetails2.hashCode(), productCategoryDetails2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASProductCategoryDetails productCategoryDetails1 = OASProductCategoryDetails.getExample();
        OASProductCategoryDetails productCategoryDetails2 = OASProductCategoryDetails.getExample();
        OASProductCategoryDetails productCategoryDetails3 = new OASProductCategoryDetails();
        OASProductCategoryDetails productCategoryDetails4 = new OASProductCategoryDetails();

        System.assert(productCategoryDetails1.equals(productCategoryDetails2));
        System.assert(productCategoryDetails3.equals(productCategoryDetails4));
        System.assertEquals(productCategoryDetails1.hashCode(), productCategoryDetails2.hashCode());
        System.assertEquals(productCategoryDetails3.hashCode(), productCategoryDetails4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASProductCategoryDetails productCategoryDetails = new OASProductCategoryDetails();
        Map<String, String> x-property-mappings = productCategoryDetails.getx-property-mappings();
        System.assertEquals('hasPrediction', x-property-mappings.get('has_prediction'));
        System.assertEquals('metricsHighlights', x-property-mappings.get('metrics_highlights'));
        System.assertEquals('predictedTimeSeries', x-property-mappings.get('predicted_time_series'));
        System.assertEquals('productCategory', x-property-mappings.get('product_category'));
        System.assertEquals('relatedSearches', x-property-mappings.get('related_searches'));
        System.assertEquals('timeSeries', x-property-mappings.get('time_series'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASProductCategoryDetails productCategoryDetails = new OASProductCategoryDetails();
        System.assertEquals(new Map<String, Double>(), productCategoryDetails.predictedTimeSeries);
        System.assertEquals(new List<String>(), productCategoryDetails.relatedSearches);
        System.assertEquals(new Map<String, Double>(), productCategoryDetails.timeSeries);
        System.assertEquals(null, productCategoryDetails.demographics);
        System.assertEquals(null, productCategoryDetails.hasPrediction);
        System.assertEquals(null, productCategoryDetails.metricsHighlights);
        System.assertEquals(null, productCategoryDetails.productCategory);
    }
}
