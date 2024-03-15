@isTest
private class OASConversionEventsDataInnerCustomDaTest {
    @isTest
    private static void equalsSameInstance() {
        OASConversionEventsDataInnerCustomDa conversionEventsDataInnerCustomData1 = OASConversionEventsDataInnerCustomDa.getExample();
        OASConversionEventsDataInnerCustomDa conversionEventsDataInnerCustomData2 = conversionEventsDataInnerCustomData1;
        OASConversionEventsDataInnerCustomDa conversionEventsDataInnerCustomData3 = new OASConversionEventsDataInnerCustomDa();
        OASConversionEventsDataInnerCustomDa conversionEventsDataInnerCustomData4 = conversionEventsDataInnerCustomData3;

        System.assert(conversionEventsDataInnerCustomData1.equals(conversionEventsDataInnerCustomData2));
        System.assert(conversionEventsDataInnerCustomData2.equals(conversionEventsDataInnerCustomData1));
        System.assert(conversionEventsDataInnerCustomData1.equals(conversionEventsDataInnerCustomData1));
        System.assert(conversionEventsDataInnerCustomData3.equals(conversionEventsDataInnerCustomData4));
        System.assert(conversionEventsDataInnerCustomData4.equals(conversionEventsDataInnerCustomData3));
        System.assert(conversionEventsDataInnerCustomData3.equals(conversionEventsDataInnerCustomData3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASConversionEventsDataInnerCustomDa conversionEventsDataInnerCustomData1 = OASConversionEventsDataInnerCustomDa.getExample();
        OASConversionEventsDataInnerCustomDa conversionEventsDataInnerCustomData2 = OASConversionEventsDataInnerCustomDa.getExample();
        OASConversionEventsDataInnerCustomDa conversionEventsDataInnerCustomData3 = new OASConversionEventsDataInnerCustomDa();
        OASConversionEventsDataInnerCustomDa conversionEventsDataInnerCustomData4 = new OASConversionEventsDataInnerCustomDa();

        System.assert(conversionEventsDataInnerCustomData1.equals(conversionEventsDataInnerCustomData2));
        System.assert(conversionEventsDataInnerCustomData2.equals(conversionEventsDataInnerCustomData1));
        System.assert(conversionEventsDataInnerCustomData3.equals(conversionEventsDataInnerCustomData4));
        System.assert(conversionEventsDataInnerCustomData4.equals(conversionEventsDataInnerCustomData3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASConversionEventsDataInnerCustomDa conversionEventsDataInnerCustomData1 = OASConversionEventsDataInnerCustomDa.getExample();
        OASConversionEventsDataInnerCustomDa conversionEventsDataInnerCustomData2 = new OASConversionEventsDataInnerCustomDa();

        System.assertEquals(false, conversionEventsDataInnerCustomData1.equals('foo'));
        System.assertEquals(false, conversionEventsDataInnerCustomData2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASConversionEventsDataInnerCustomDa conversionEventsDataInnerCustomData1 = OASConversionEventsDataInnerCustomDa.getExample();
        OASConversionEventsDataInnerCustomDa conversionEventsDataInnerCustomData2 = new OASConversionEventsDataInnerCustomDa();
        OASConversionEventsDataInnerCustomDa conversionEventsDataInnerCustomData3;

        System.assertEquals(false, conversionEventsDataInnerCustomData1.equals(conversionEventsDataInnerCustomData3));
        System.assertEquals(false, conversionEventsDataInnerCustomData2.equals(conversionEventsDataInnerCustomData3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASConversionEventsDataInnerCustomDa conversionEventsDataInnerCustomData1 = OASConversionEventsDataInnerCustomDa.getExample();
        OASConversionEventsDataInnerCustomDa conversionEventsDataInnerCustomData2 = new OASConversionEventsDataInnerCustomDa();

        System.assertEquals(conversionEventsDataInnerCustomData1.hashCode(), conversionEventsDataInnerCustomData1.hashCode());
        System.assertEquals(conversionEventsDataInnerCustomData2.hashCode(), conversionEventsDataInnerCustomData2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASConversionEventsDataInnerCustomDa conversionEventsDataInnerCustomData1 = OASConversionEventsDataInnerCustomDa.getExample();
        OASConversionEventsDataInnerCustomDa conversionEventsDataInnerCustomData2 = OASConversionEventsDataInnerCustomDa.getExample();
        OASConversionEventsDataInnerCustomDa conversionEventsDataInnerCustomData3 = new OASConversionEventsDataInnerCustomDa();
        OASConversionEventsDataInnerCustomDa conversionEventsDataInnerCustomData4 = new OASConversionEventsDataInnerCustomDa();

        System.assert(conversionEventsDataInnerCustomData1.equals(conversionEventsDataInnerCustomData2));
        System.assert(conversionEventsDataInnerCustomData3.equals(conversionEventsDataInnerCustomData4));
        System.assertEquals(conversionEventsDataInnerCustomData1.hashCode(), conversionEventsDataInnerCustomData2.hashCode());
        System.assertEquals(conversionEventsDataInnerCustomData3.hashCode(), conversionEventsDataInnerCustomData4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASConversionEventsDataInnerCustomDa conversionEventsDataInnerCustomData = new OASConversionEventsDataInnerCustomDa();
        Map<String, String> x-property-mappings = conversionEventsDataInnerCustomData.getx-property-mappings();
        System.assertEquals('r_currency', x-property-mappings.get('currency'));
        System.assertEquals('contentIds', x-property-mappings.get('content_ids'));
        System.assertEquals('contentName', x-property-mappings.get('content_name'));
        System.assertEquals('contentCategory', x-property-mappings.get('content_category'));
        System.assertEquals('contentBrand', x-property-mappings.get('content_brand'));
        System.assertEquals('numItems', x-property-mappings.get('num_items'));
        System.assertEquals('orderId', x-property-mappings.get('order_id'));
        System.assertEquals('searchString', x-property-mappings.get('search_string'));
        System.assertEquals('optOutType', x-property-mappings.get('opt_out_type'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASConversionEventsDataInnerCustomDa conversionEventsDataInnerCustomData = new OASConversionEventsDataInnerCustomDa();
        System.assertEquals(new List<String>(), conversionEventsDataInnerCustomData.contentIds);
        System.assertEquals(new List<OASConversionEventsDataInnerCustomDa>(), conversionEventsDataInnerCustomData.contents);
        System.assertEquals(null, conversionEventsDataInnerCustomData.r_currency);
        System.assertEquals(null, conversionEventsDataInnerCustomData.value);
        System.assertEquals(null, conversionEventsDataInnerCustomData.contentName);
        System.assertEquals(null, conversionEventsDataInnerCustomData.contentCategory);
        System.assertEquals(null, conversionEventsDataInnerCustomData.contentBrand);
        System.assertEquals(null, conversionEventsDataInnerCustomData.numItems);
        System.assertEquals(null, conversionEventsDataInnerCustomData.orderId);
        System.assertEquals(null, conversionEventsDataInnerCustomData.searchString);
        System.assertEquals(null, conversionEventsDataInnerCustomData.optOutType);
        System.assertEquals(null, conversionEventsDataInnerCustomData.np);
    }
}
