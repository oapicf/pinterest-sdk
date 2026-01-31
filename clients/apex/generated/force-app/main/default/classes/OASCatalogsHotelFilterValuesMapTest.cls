@isTest
private class OASCatalogsHotelFilterValuesMapTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsHotelFilterValuesMap catalogsHotelFilterValuesMap1 = OASCatalogsHotelFilterValuesMap.getExample();
        OASCatalogsHotelFilterValuesMap catalogsHotelFilterValuesMap2 = catalogsHotelFilterValuesMap1;
        OASCatalogsHotelFilterValuesMap catalogsHotelFilterValuesMap3 = new OASCatalogsHotelFilterValuesMap();
        OASCatalogsHotelFilterValuesMap catalogsHotelFilterValuesMap4 = catalogsHotelFilterValuesMap3;

        System.assert(catalogsHotelFilterValuesMap1.equals(catalogsHotelFilterValuesMap2));
        System.assert(catalogsHotelFilterValuesMap2.equals(catalogsHotelFilterValuesMap1));
        System.assert(catalogsHotelFilterValuesMap1.equals(catalogsHotelFilterValuesMap1));
        System.assert(catalogsHotelFilterValuesMap3.equals(catalogsHotelFilterValuesMap4));
        System.assert(catalogsHotelFilterValuesMap4.equals(catalogsHotelFilterValuesMap3));
        System.assert(catalogsHotelFilterValuesMap3.equals(catalogsHotelFilterValuesMap3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsHotelFilterValuesMap catalogsHotelFilterValuesMap1 = OASCatalogsHotelFilterValuesMap.getExample();
        OASCatalogsHotelFilterValuesMap catalogsHotelFilterValuesMap2 = OASCatalogsHotelFilterValuesMap.getExample();
        OASCatalogsHotelFilterValuesMap catalogsHotelFilterValuesMap3 = new OASCatalogsHotelFilterValuesMap();
        OASCatalogsHotelFilterValuesMap catalogsHotelFilterValuesMap4 = new OASCatalogsHotelFilterValuesMap();

        System.assert(catalogsHotelFilterValuesMap1.equals(catalogsHotelFilterValuesMap2));
        System.assert(catalogsHotelFilterValuesMap2.equals(catalogsHotelFilterValuesMap1));
        System.assert(catalogsHotelFilterValuesMap3.equals(catalogsHotelFilterValuesMap4));
        System.assert(catalogsHotelFilterValuesMap4.equals(catalogsHotelFilterValuesMap3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsHotelFilterValuesMap catalogsHotelFilterValuesMap1 = OASCatalogsHotelFilterValuesMap.getExample();
        OASCatalogsHotelFilterValuesMap catalogsHotelFilterValuesMap2 = new OASCatalogsHotelFilterValuesMap();

        System.assertEquals(false, catalogsHotelFilterValuesMap1.equals('foo'));
        System.assertEquals(false, catalogsHotelFilterValuesMap2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsHotelFilterValuesMap catalogsHotelFilterValuesMap1 = OASCatalogsHotelFilterValuesMap.getExample();
        OASCatalogsHotelFilterValuesMap catalogsHotelFilterValuesMap2 = new OASCatalogsHotelFilterValuesMap();
        OASCatalogsHotelFilterValuesMap catalogsHotelFilterValuesMap3;

        System.assertEquals(false, catalogsHotelFilterValuesMap1.equals(catalogsHotelFilterValuesMap3));
        System.assertEquals(false, catalogsHotelFilterValuesMap2.equals(catalogsHotelFilterValuesMap3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsHotelFilterValuesMap catalogsHotelFilterValuesMap1 = OASCatalogsHotelFilterValuesMap.getExample();
        OASCatalogsHotelFilterValuesMap catalogsHotelFilterValuesMap2 = new OASCatalogsHotelFilterValuesMap();

        System.assertEquals(catalogsHotelFilterValuesMap1.hashCode(), catalogsHotelFilterValuesMap1.hashCode());
        System.assertEquals(catalogsHotelFilterValuesMap2.hashCode(), catalogsHotelFilterValuesMap2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsHotelFilterValuesMap catalogsHotelFilterValuesMap1 = OASCatalogsHotelFilterValuesMap.getExample();
        OASCatalogsHotelFilterValuesMap catalogsHotelFilterValuesMap2 = OASCatalogsHotelFilterValuesMap.getExample();
        OASCatalogsHotelFilterValuesMap catalogsHotelFilterValuesMap3 = new OASCatalogsHotelFilterValuesMap();
        OASCatalogsHotelFilterValuesMap catalogsHotelFilterValuesMap4 = new OASCatalogsHotelFilterValuesMap();

        System.assert(catalogsHotelFilterValuesMap1.equals(catalogsHotelFilterValuesMap2));
        System.assert(catalogsHotelFilterValuesMap3.equals(catalogsHotelFilterValuesMap4));
        System.assertEquals(catalogsHotelFilterValuesMap1.hashCode(), catalogsHotelFilterValuesMap2.hashCode());
        System.assertEquals(catalogsHotelFilterValuesMap3.hashCode(), catalogsHotelFilterValuesMap4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsHotelFilterValuesMap catalogsHotelFilterValuesMap = new OASCatalogsHotelFilterValuesMap();
        Map<String, String> x-property-mappings = catalogsHotelFilterValuesMap.getx-property-mappings();
        System.assertEquals('customLabel0', x-property-mappings.get('custom_label_0'));
        System.assertEquals('customLabel1', x-property-mappings.get('custom_label_1'));
        System.assertEquals('customLabel2', x-property-mappings.get('custom_label_2'));
        System.assertEquals('customLabel3', x-property-mappings.get('custom_label_3'));
        System.assertEquals('customLabel4', x-property-mappings.get('custom_label_4'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCatalogsHotelFilterValuesMap catalogsHotelFilterValuesMap = new OASCatalogsHotelFilterValuesMap();
        System.assertEquals(new List<String>(), catalogsHotelFilterValuesMap.brand);
        System.assertEquals(new List<String>(), catalogsHotelFilterValuesMap.customLabel0);
        System.assertEquals(new List<String>(), catalogsHotelFilterValuesMap.customLabel1);
        System.assertEquals(new List<String>(), catalogsHotelFilterValuesMap.customLabel2);
        System.assertEquals(new List<String>(), catalogsHotelFilterValuesMap.customLabel3);
        System.assertEquals(new List<String>(), catalogsHotelFilterValuesMap.customLabel4);
    }
}
