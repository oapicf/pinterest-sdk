@isTest
private class OASCatalogsHotelAttributesTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsHotelAttributes catalogsHotelAttributes1 = OASCatalogsHotelAttributes.getExample();
        OASCatalogsHotelAttributes catalogsHotelAttributes2 = catalogsHotelAttributes1;
        OASCatalogsHotelAttributes catalogsHotelAttributes3 = new OASCatalogsHotelAttributes();
        OASCatalogsHotelAttributes catalogsHotelAttributes4 = catalogsHotelAttributes3;

        System.assert(catalogsHotelAttributes1.equals(catalogsHotelAttributes2));
        System.assert(catalogsHotelAttributes2.equals(catalogsHotelAttributes1));
        System.assert(catalogsHotelAttributes1.equals(catalogsHotelAttributes1));
        System.assert(catalogsHotelAttributes3.equals(catalogsHotelAttributes4));
        System.assert(catalogsHotelAttributes4.equals(catalogsHotelAttributes3));
        System.assert(catalogsHotelAttributes3.equals(catalogsHotelAttributes3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsHotelAttributes catalogsHotelAttributes1 = OASCatalogsHotelAttributes.getExample();
        OASCatalogsHotelAttributes catalogsHotelAttributes2 = OASCatalogsHotelAttributes.getExample();
        OASCatalogsHotelAttributes catalogsHotelAttributes3 = new OASCatalogsHotelAttributes();
        OASCatalogsHotelAttributes catalogsHotelAttributes4 = new OASCatalogsHotelAttributes();

        System.assert(catalogsHotelAttributes1.equals(catalogsHotelAttributes2));
        System.assert(catalogsHotelAttributes2.equals(catalogsHotelAttributes1));
        System.assert(catalogsHotelAttributes3.equals(catalogsHotelAttributes4));
        System.assert(catalogsHotelAttributes4.equals(catalogsHotelAttributes3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsHotelAttributes catalogsHotelAttributes1 = OASCatalogsHotelAttributes.getExample();
        OASCatalogsHotelAttributes catalogsHotelAttributes2 = new OASCatalogsHotelAttributes();

        System.assertEquals(false, catalogsHotelAttributes1.equals('foo'));
        System.assertEquals(false, catalogsHotelAttributes2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsHotelAttributes catalogsHotelAttributes1 = OASCatalogsHotelAttributes.getExample();
        OASCatalogsHotelAttributes catalogsHotelAttributes2 = new OASCatalogsHotelAttributes();
        OASCatalogsHotelAttributes catalogsHotelAttributes3;

        System.assertEquals(false, catalogsHotelAttributes1.equals(catalogsHotelAttributes3));
        System.assertEquals(false, catalogsHotelAttributes2.equals(catalogsHotelAttributes3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsHotelAttributes catalogsHotelAttributes1 = OASCatalogsHotelAttributes.getExample();
        OASCatalogsHotelAttributes catalogsHotelAttributes2 = new OASCatalogsHotelAttributes();

        System.assertEquals(catalogsHotelAttributes1.hashCode(), catalogsHotelAttributes1.hashCode());
        System.assertEquals(catalogsHotelAttributes2.hashCode(), catalogsHotelAttributes2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsHotelAttributes catalogsHotelAttributes1 = OASCatalogsHotelAttributes.getExample();
        OASCatalogsHotelAttributes catalogsHotelAttributes2 = OASCatalogsHotelAttributes.getExample();
        OASCatalogsHotelAttributes catalogsHotelAttributes3 = new OASCatalogsHotelAttributes();
        OASCatalogsHotelAttributes catalogsHotelAttributes4 = new OASCatalogsHotelAttributes();

        System.assert(catalogsHotelAttributes1.equals(catalogsHotelAttributes2));
        System.assert(catalogsHotelAttributes3.equals(catalogsHotelAttributes4));
        System.assertEquals(catalogsHotelAttributes1.hashCode(), catalogsHotelAttributes2.hashCode());
        System.assertEquals(catalogsHotelAttributes3.hashCode(), catalogsHotelAttributes4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsHotelAttributes catalogsHotelAttributes = new OASCatalogsHotelAttributes();
        Map<String, String> x-property-mappings = catalogsHotelAttributes.getx-property-mappings();
        System.assertEquals('customLabel0', x-property-mappings.get('custom_label_0'));
        System.assertEquals('customLabel1', x-property-mappings.get('custom_label_1'));
        System.assertEquals('customLabel2', x-property-mappings.get('custom_label_2'));
        System.assertEquals('customLabel3', x-property-mappings.get('custom_label_3'));
        System.assertEquals('customLabel4', x-property-mappings.get('custom_label_4'));
        System.assertEquals('basePrice', x-property-mappings.get('base_price'));
        System.assertEquals('salePrice', x-property-mappings.get('sale_price'));
        System.assertEquals('guestRatings', x-property-mappings.get('guest_ratings'));
        System.assertEquals('mainImage', x-property-mappings.get('main_image'));
        System.assertEquals('additionalImageLink', x-property-mappings.get('additional_image_link'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCatalogsHotelAttributes catalogsHotelAttributes = new OASCatalogsHotelAttributes();
        System.assertEquals(new List<String>(), catalogsHotelAttributes.neighborhood);
        System.assertEquals(new List<String>(), catalogsHotelAttributes.additionalImageLink);
        System.assertEquals(null, catalogsHotelAttributes.name);
        System.assertEquals(null, catalogsHotelAttributes.link);
        System.assertEquals(null, catalogsHotelAttributes.description);
        System.assertEquals(null, catalogsHotelAttributes.brand);
        System.assertEquals(null, catalogsHotelAttributes.latitude);
        System.assertEquals(null, catalogsHotelAttributes.longitude);
        System.assertEquals(null, catalogsHotelAttributes.address);
        System.assertEquals(null, catalogsHotelAttributes.customLabel0);
        System.assertEquals(null, catalogsHotelAttributes.customLabel1);
        System.assertEquals(null, catalogsHotelAttributes.customLabel2);
        System.assertEquals(null, catalogsHotelAttributes.customLabel3);
        System.assertEquals(null, catalogsHotelAttributes.customLabel4);
        System.assertEquals(null, catalogsHotelAttributes.category);
        System.assertEquals(null, catalogsHotelAttributes.basePrice);
        System.assertEquals(null, catalogsHotelAttributes.salePrice);
        System.assertEquals(null, catalogsHotelAttributes.guestRatings);
        System.assertEquals(null, catalogsHotelAttributes.mainImage);
    }
}
