@isTest
private class OASCatalogsHotelAttributesAllOfMainITest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsHotelAttributesAllOfMainI catalogsHotelAttributesAllOfMainImage1 = OASCatalogsHotelAttributesAllOfMainI.getExample();
        OASCatalogsHotelAttributesAllOfMainI catalogsHotelAttributesAllOfMainImage2 = catalogsHotelAttributesAllOfMainImage1;
        OASCatalogsHotelAttributesAllOfMainI catalogsHotelAttributesAllOfMainImage3 = new OASCatalogsHotelAttributesAllOfMainI();
        OASCatalogsHotelAttributesAllOfMainI catalogsHotelAttributesAllOfMainImage4 = catalogsHotelAttributesAllOfMainImage3;

        System.assert(catalogsHotelAttributesAllOfMainImage1.equals(catalogsHotelAttributesAllOfMainImage2));
        System.assert(catalogsHotelAttributesAllOfMainImage2.equals(catalogsHotelAttributesAllOfMainImage1));
        System.assert(catalogsHotelAttributesAllOfMainImage1.equals(catalogsHotelAttributesAllOfMainImage1));
        System.assert(catalogsHotelAttributesAllOfMainImage3.equals(catalogsHotelAttributesAllOfMainImage4));
        System.assert(catalogsHotelAttributesAllOfMainImage4.equals(catalogsHotelAttributesAllOfMainImage3));
        System.assert(catalogsHotelAttributesAllOfMainImage3.equals(catalogsHotelAttributesAllOfMainImage3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsHotelAttributesAllOfMainI catalogsHotelAttributesAllOfMainImage1 = OASCatalogsHotelAttributesAllOfMainI.getExample();
        OASCatalogsHotelAttributesAllOfMainI catalogsHotelAttributesAllOfMainImage2 = OASCatalogsHotelAttributesAllOfMainI.getExample();
        OASCatalogsHotelAttributesAllOfMainI catalogsHotelAttributesAllOfMainImage3 = new OASCatalogsHotelAttributesAllOfMainI();
        OASCatalogsHotelAttributesAllOfMainI catalogsHotelAttributesAllOfMainImage4 = new OASCatalogsHotelAttributesAllOfMainI();

        System.assert(catalogsHotelAttributesAllOfMainImage1.equals(catalogsHotelAttributesAllOfMainImage2));
        System.assert(catalogsHotelAttributesAllOfMainImage2.equals(catalogsHotelAttributesAllOfMainImage1));
        System.assert(catalogsHotelAttributesAllOfMainImage3.equals(catalogsHotelAttributesAllOfMainImage4));
        System.assert(catalogsHotelAttributesAllOfMainImage4.equals(catalogsHotelAttributesAllOfMainImage3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsHotelAttributesAllOfMainI catalogsHotelAttributesAllOfMainImage1 = OASCatalogsHotelAttributesAllOfMainI.getExample();
        OASCatalogsHotelAttributesAllOfMainI catalogsHotelAttributesAllOfMainImage2 = new OASCatalogsHotelAttributesAllOfMainI();

        System.assertEquals(false, catalogsHotelAttributesAllOfMainImage1.equals('foo'));
        System.assertEquals(false, catalogsHotelAttributesAllOfMainImage2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsHotelAttributesAllOfMainI catalogsHotelAttributesAllOfMainImage1 = OASCatalogsHotelAttributesAllOfMainI.getExample();
        OASCatalogsHotelAttributesAllOfMainI catalogsHotelAttributesAllOfMainImage2 = new OASCatalogsHotelAttributesAllOfMainI();
        OASCatalogsHotelAttributesAllOfMainI catalogsHotelAttributesAllOfMainImage3;

        System.assertEquals(false, catalogsHotelAttributesAllOfMainImage1.equals(catalogsHotelAttributesAllOfMainImage3));
        System.assertEquals(false, catalogsHotelAttributesAllOfMainImage2.equals(catalogsHotelAttributesAllOfMainImage3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsHotelAttributesAllOfMainI catalogsHotelAttributesAllOfMainImage1 = OASCatalogsHotelAttributesAllOfMainI.getExample();
        OASCatalogsHotelAttributesAllOfMainI catalogsHotelAttributesAllOfMainImage2 = new OASCatalogsHotelAttributesAllOfMainI();

        System.assertEquals(catalogsHotelAttributesAllOfMainImage1.hashCode(), catalogsHotelAttributesAllOfMainImage1.hashCode());
        System.assertEquals(catalogsHotelAttributesAllOfMainImage2.hashCode(), catalogsHotelAttributesAllOfMainImage2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsHotelAttributesAllOfMainI catalogsHotelAttributesAllOfMainImage1 = OASCatalogsHotelAttributesAllOfMainI.getExample();
        OASCatalogsHotelAttributesAllOfMainI catalogsHotelAttributesAllOfMainImage2 = OASCatalogsHotelAttributesAllOfMainI.getExample();
        OASCatalogsHotelAttributesAllOfMainI catalogsHotelAttributesAllOfMainImage3 = new OASCatalogsHotelAttributesAllOfMainI();
        OASCatalogsHotelAttributesAllOfMainI catalogsHotelAttributesAllOfMainImage4 = new OASCatalogsHotelAttributesAllOfMainI();

        System.assert(catalogsHotelAttributesAllOfMainImage1.equals(catalogsHotelAttributesAllOfMainImage2));
        System.assert(catalogsHotelAttributesAllOfMainImage3.equals(catalogsHotelAttributesAllOfMainImage4));
        System.assertEquals(catalogsHotelAttributesAllOfMainImage1.hashCode(), catalogsHotelAttributesAllOfMainImage2.hashCode());
        System.assertEquals(catalogsHotelAttributesAllOfMainImage3.hashCode(), catalogsHotelAttributesAllOfMainImage4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCatalogsHotelAttributesAllOfMainI catalogsHotelAttributesAllOfMainImage = new OASCatalogsHotelAttributesAllOfMainI();
        System.assertEquals(new List<String>(), catalogsHotelAttributesAllOfMainImage.tag);
        System.assertEquals(null, catalogsHotelAttributesAllOfMainImage.link);
    }
}
