@isTest
private class OASCatalogsHotelGuestRatingsTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsHotelGuestRatings catalogsHotelGuestRatings1 = OASCatalogsHotelGuestRatings.getExample();
        OASCatalogsHotelGuestRatings catalogsHotelGuestRatings2 = catalogsHotelGuestRatings1;
        OASCatalogsHotelGuestRatings catalogsHotelGuestRatings3 = new OASCatalogsHotelGuestRatings();
        OASCatalogsHotelGuestRatings catalogsHotelGuestRatings4 = catalogsHotelGuestRatings3;

        System.assert(catalogsHotelGuestRatings1.equals(catalogsHotelGuestRatings2));
        System.assert(catalogsHotelGuestRatings2.equals(catalogsHotelGuestRatings1));
        System.assert(catalogsHotelGuestRatings1.equals(catalogsHotelGuestRatings1));
        System.assert(catalogsHotelGuestRatings3.equals(catalogsHotelGuestRatings4));
        System.assert(catalogsHotelGuestRatings4.equals(catalogsHotelGuestRatings3));
        System.assert(catalogsHotelGuestRatings3.equals(catalogsHotelGuestRatings3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsHotelGuestRatings catalogsHotelGuestRatings1 = OASCatalogsHotelGuestRatings.getExample();
        OASCatalogsHotelGuestRatings catalogsHotelGuestRatings2 = OASCatalogsHotelGuestRatings.getExample();
        OASCatalogsHotelGuestRatings catalogsHotelGuestRatings3 = new OASCatalogsHotelGuestRatings();
        OASCatalogsHotelGuestRatings catalogsHotelGuestRatings4 = new OASCatalogsHotelGuestRatings();

        System.assert(catalogsHotelGuestRatings1.equals(catalogsHotelGuestRatings2));
        System.assert(catalogsHotelGuestRatings2.equals(catalogsHotelGuestRatings1));
        System.assert(catalogsHotelGuestRatings3.equals(catalogsHotelGuestRatings4));
        System.assert(catalogsHotelGuestRatings4.equals(catalogsHotelGuestRatings3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsHotelGuestRatings catalogsHotelGuestRatings1 = OASCatalogsHotelGuestRatings.getExample();
        OASCatalogsHotelGuestRatings catalogsHotelGuestRatings2 = new OASCatalogsHotelGuestRatings();

        System.assertEquals(false, catalogsHotelGuestRatings1.equals('foo'));
        System.assertEquals(false, catalogsHotelGuestRatings2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsHotelGuestRatings catalogsHotelGuestRatings1 = OASCatalogsHotelGuestRatings.getExample();
        OASCatalogsHotelGuestRatings catalogsHotelGuestRatings2 = new OASCatalogsHotelGuestRatings();
        OASCatalogsHotelGuestRatings catalogsHotelGuestRatings3;

        System.assertEquals(false, catalogsHotelGuestRatings1.equals(catalogsHotelGuestRatings3));
        System.assertEquals(false, catalogsHotelGuestRatings2.equals(catalogsHotelGuestRatings3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsHotelGuestRatings catalogsHotelGuestRatings1 = OASCatalogsHotelGuestRatings.getExample();
        OASCatalogsHotelGuestRatings catalogsHotelGuestRatings2 = new OASCatalogsHotelGuestRatings();

        System.assertEquals(catalogsHotelGuestRatings1.hashCode(), catalogsHotelGuestRatings1.hashCode());
        System.assertEquals(catalogsHotelGuestRatings2.hashCode(), catalogsHotelGuestRatings2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsHotelGuestRatings catalogsHotelGuestRatings1 = OASCatalogsHotelGuestRatings.getExample();
        OASCatalogsHotelGuestRatings catalogsHotelGuestRatings2 = OASCatalogsHotelGuestRatings.getExample();
        OASCatalogsHotelGuestRatings catalogsHotelGuestRatings3 = new OASCatalogsHotelGuestRatings();
        OASCatalogsHotelGuestRatings catalogsHotelGuestRatings4 = new OASCatalogsHotelGuestRatings();

        System.assert(catalogsHotelGuestRatings1.equals(catalogsHotelGuestRatings2));
        System.assert(catalogsHotelGuestRatings3.equals(catalogsHotelGuestRatings4));
        System.assertEquals(catalogsHotelGuestRatings1.hashCode(), catalogsHotelGuestRatings2.hashCode());
        System.assertEquals(catalogsHotelGuestRatings3.hashCode(), catalogsHotelGuestRatings4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsHotelGuestRatings catalogsHotelGuestRatings = new OASCatalogsHotelGuestRatings();
        Map<String, String> x-property-mappings = catalogsHotelGuestRatings.getx-property-mappings();
        System.assertEquals('numberOfReviewers', x-property-mappings.get('number_of_reviewers'));
        System.assertEquals('maxScore', x-property-mappings.get('max_score'));
        System.assertEquals('ratingSystem', x-property-mappings.get('rating_system'));
    }
}
