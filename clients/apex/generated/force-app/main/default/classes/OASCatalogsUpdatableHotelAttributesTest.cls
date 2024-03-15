@isTest
private class OASCatalogsUpdatableHotelAttributesTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsUpdatableHotelAttributes catalogsUpdatableHotelAttributes1 = OASCatalogsUpdatableHotelAttributes.getExample();
        OASCatalogsUpdatableHotelAttributes catalogsUpdatableHotelAttributes2 = catalogsUpdatableHotelAttributes1;
        OASCatalogsUpdatableHotelAttributes catalogsUpdatableHotelAttributes3 = new OASCatalogsUpdatableHotelAttributes();
        OASCatalogsUpdatableHotelAttributes catalogsUpdatableHotelAttributes4 = catalogsUpdatableHotelAttributes3;

        System.assert(catalogsUpdatableHotelAttributes1.equals(catalogsUpdatableHotelAttributes2));
        System.assert(catalogsUpdatableHotelAttributes2.equals(catalogsUpdatableHotelAttributes1));
        System.assert(catalogsUpdatableHotelAttributes1.equals(catalogsUpdatableHotelAttributes1));
        System.assert(catalogsUpdatableHotelAttributes3.equals(catalogsUpdatableHotelAttributes4));
        System.assert(catalogsUpdatableHotelAttributes4.equals(catalogsUpdatableHotelAttributes3));
        System.assert(catalogsUpdatableHotelAttributes3.equals(catalogsUpdatableHotelAttributes3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsUpdatableHotelAttributes catalogsUpdatableHotelAttributes1 = OASCatalogsUpdatableHotelAttributes.getExample();
        OASCatalogsUpdatableHotelAttributes catalogsUpdatableHotelAttributes2 = OASCatalogsUpdatableHotelAttributes.getExample();
        OASCatalogsUpdatableHotelAttributes catalogsUpdatableHotelAttributes3 = new OASCatalogsUpdatableHotelAttributes();
        OASCatalogsUpdatableHotelAttributes catalogsUpdatableHotelAttributes4 = new OASCatalogsUpdatableHotelAttributes();

        System.assert(catalogsUpdatableHotelAttributes1.equals(catalogsUpdatableHotelAttributes2));
        System.assert(catalogsUpdatableHotelAttributes2.equals(catalogsUpdatableHotelAttributes1));
        System.assert(catalogsUpdatableHotelAttributes3.equals(catalogsUpdatableHotelAttributes4));
        System.assert(catalogsUpdatableHotelAttributes4.equals(catalogsUpdatableHotelAttributes3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsUpdatableHotelAttributes catalogsUpdatableHotelAttributes1 = OASCatalogsUpdatableHotelAttributes.getExample();
        OASCatalogsUpdatableHotelAttributes catalogsUpdatableHotelAttributes2 = new OASCatalogsUpdatableHotelAttributes();

        System.assertEquals(false, catalogsUpdatableHotelAttributes1.equals('foo'));
        System.assertEquals(false, catalogsUpdatableHotelAttributes2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsUpdatableHotelAttributes catalogsUpdatableHotelAttributes1 = OASCatalogsUpdatableHotelAttributes.getExample();
        OASCatalogsUpdatableHotelAttributes catalogsUpdatableHotelAttributes2 = new OASCatalogsUpdatableHotelAttributes();
        OASCatalogsUpdatableHotelAttributes catalogsUpdatableHotelAttributes3;

        System.assertEquals(false, catalogsUpdatableHotelAttributes1.equals(catalogsUpdatableHotelAttributes3));
        System.assertEquals(false, catalogsUpdatableHotelAttributes2.equals(catalogsUpdatableHotelAttributes3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsUpdatableHotelAttributes catalogsUpdatableHotelAttributes1 = OASCatalogsUpdatableHotelAttributes.getExample();
        OASCatalogsUpdatableHotelAttributes catalogsUpdatableHotelAttributes2 = new OASCatalogsUpdatableHotelAttributes();

        System.assertEquals(catalogsUpdatableHotelAttributes1.hashCode(), catalogsUpdatableHotelAttributes1.hashCode());
        System.assertEquals(catalogsUpdatableHotelAttributes2.hashCode(), catalogsUpdatableHotelAttributes2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsUpdatableHotelAttributes catalogsUpdatableHotelAttributes1 = OASCatalogsUpdatableHotelAttributes.getExample();
        OASCatalogsUpdatableHotelAttributes catalogsUpdatableHotelAttributes2 = OASCatalogsUpdatableHotelAttributes.getExample();
        OASCatalogsUpdatableHotelAttributes catalogsUpdatableHotelAttributes3 = new OASCatalogsUpdatableHotelAttributes();
        OASCatalogsUpdatableHotelAttributes catalogsUpdatableHotelAttributes4 = new OASCatalogsUpdatableHotelAttributes();

        System.assert(catalogsUpdatableHotelAttributes1.equals(catalogsUpdatableHotelAttributes2));
        System.assert(catalogsUpdatableHotelAttributes3.equals(catalogsUpdatableHotelAttributes4));
        System.assertEquals(catalogsUpdatableHotelAttributes1.hashCode(), catalogsUpdatableHotelAttributes2.hashCode());
        System.assertEquals(catalogsUpdatableHotelAttributes3.hashCode(), catalogsUpdatableHotelAttributes4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsUpdatableHotelAttributes catalogsUpdatableHotelAttributes = new OASCatalogsUpdatableHotelAttributes();
        Map<String, String> x-property-mappings = catalogsUpdatableHotelAttributes.getx-property-mappings();
        System.assertEquals('customLabel0', x-property-mappings.get('custom_label_0'));
        System.assertEquals('customLabel1', x-property-mappings.get('custom_label_1'));
        System.assertEquals('customLabel2', x-property-mappings.get('custom_label_2'));
        System.assertEquals('customLabel3', x-property-mappings.get('custom_label_3'));
        System.assertEquals('customLabel4', x-property-mappings.get('custom_label_4'));
        System.assertEquals('basePrice', x-property-mappings.get('base_price'));
        System.assertEquals('salePrice', x-property-mappings.get('sale_price'));
        System.assertEquals('guestRatings', x-property-mappings.get('guest_ratings'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCatalogsUpdatableHotelAttributes catalogsUpdatableHotelAttributes = new OASCatalogsUpdatableHotelAttributes();
        System.assertEquals(new List<String>(), catalogsUpdatableHotelAttributes.neighborhood);
        System.assertEquals(null, catalogsUpdatableHotelAttributes.name);
        System.assertEquals(null, catalogsUpdatableHotelAttributes.link);
        System.assertEquals(null, catalogsUpdatableHotelAttributes.description);
        System.assertEquals(null, catalogsUpdatableHotelAttributes.brand);
        System.assertEquals(null, catalogsUpdatableHotelAttributes.latitude);
        System.assertEquals(null, catalogsUpdatableHotelAttributes.longitude);
        System.assertEquals(null, catalogsUpdatableHotelAttributes.address);
        System.assertEquals(null, catalogsUpdatableHotelAttributes.customLabel0);
        System.assertEquals(null, catalogsUpdatableHotelAttributes.customLabel1);
        System.assertEquals(null, catalogsUpdatableHotelAttributes.customLabel2);
        System.assertEquals(null, catalogsUpdatableHotelAttributes.customLabel3);
        System.assertEquals(null, catalogsUpdatableHotelAttributes.customLabel4);
        System.assertEquals(null, catalogsUpdatableHotelAttributes.category);
        System.assertEquals(null, catalogsUpdatableHotelAttributes.basePrice);
        System.assertEquals(null, catalogsUpdatableHotelAttributes.salePrice);
        System.assertEquals(null, catalogsUpdatableHotelAttributes.guestRatings);
    }
}
