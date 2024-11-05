@isTest
private class OASMultipleProductGroupsInnerTest {
    @isTest
    private static void equalsSameInstance() {
        OASMultipleProductGroupsInner multipleProductGroupsInner1 = OASMultipleProductGroupsInner.getExample();
        OASMultipleProductGroupsInner multipleProductGroupsInner2 = multipleProductGroupsInner1;
        OASMultipleProductGroupsInner multipleProductGroupsInner3 = new OASMultipleProductGroupsInner();
        OASMultipleProductGroupsInner multipleProductGroupsInner4 = multipleProductGroupsInner3;

        System.assert(multipleProductGroupsInner1.equals(multipleProductGroupsInner2));
        System.assert(multipleProductGroupsInner2.equals(multipleProductGroupsInner1));
        System.assert(multipleProductGroupsInner1.equals(multipleProductGroupsInner1));
        System.assert(multipleProductGroupsInner3.equals(multipleProductGroupsInner4));
        System.assert(multipleProductGroupsInner4.equals(multipleProductGroupsInner3));
        System.assert(multipleProductGroupsInner3.equals(multipleProductGroupsInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMultipleProductGroupsInner multipleProductGroupsInner1 = OASMultipleProductGroupsInner.getExample();
        OASMultipleProductGroupsInner multipleProductGroupsInner2 = OASMultipleProductGroupsInner.getExample();
        OASMultipleProductGroupsInner multipleProductGroupsInner3 = new OASMultipleProductGroupsInner();
        OASMultipleProductGroupsInner multipleProductGroupsInner4 = new OASMultipleProductGroupsInner();

        System.assert(multipleProductGroupsInner1.equals(multipleProductGroupsInner2));
        System.assert(multipleProductGroupsInner2.equals(multipleProductGroupsInner1));
        System.assert(multipleProductGroupsInner3.equals(multipleProductGroupsInner4));
        System.assert(multipleProductGroupsInner4.equals(multipleProductGroupsInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMultipleProductGroupsInner multipleProductGroupsInner1 = OASMultipleProductGroupsInner.getExample();
        OASMultipleProductGroupsInner multipleProductGroupsInner2 = new OASMultipleProductGroupsInner();

        System.assertEquals(false, multipleProductGroupsInner1.equals('foo'));
        System.assertEquals(false, multipleProductGroupsInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMultipleProductGroupsInner multipleProductGroupsInner1 = OASMultipleProductGroupsInner.getExample();
        OASMultipleProductGroupsInner multipleProductGroupsInner2 = new OASMultipleProductGroupsInner();
        OASMultipleProductGroupsInner multipleProductGroupsInner3;

        System.assertEquals(false, multipleProductGroupsInner1.equals(multipleProductGroupsInner3));
        System.assertEquals(false, multipleProductGroupsInner2.equals(multipleProductGroupsInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMultipleProductGroupsInner multipleProductGroupsInner1 = OASMultipleProductGroupsInner.getExample();
        OASMultipleProductGroupsInner multipleProductGroupsInner2 = new OASMultipleProductGroupsInner();

        System.assertEquals(multipleProductGroupsInner1.hashCode(), multipleProductGroupsInner1.hashCode());
        System.assertEquals(multipleProductGroupsInner2.hashCode(), multipleProductGroupsInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMultipleProductGroupsInner multipleProductGroupsInner1 = OASMultipleProductGroupsInner.getExample();
        OASMultipleProductGroupsInner multipleProductGroupsInner2 = OASMultipleProductGroupsInner.getExample();
        OASMultipleProductGroupsInner multipleProductGroupsInner3 = new OASMultipleProductGroupsInner();
        OASMultipleProductGroupsInner multipleProductGroupsInner4 = new OASMultipleProductGroupsInner();

        System.assert(multipleProductGroupsInner1.equals(multipleProductGroupsInner2));
        System.assert(multipleProductGroupsInner3.equals(multipleProductGroupsInner4));
        System.assertEquals(multipleProductGroupsInner1.hashCode(), multipleProductGroupsInner2.hashCode());
        System.assertEquals(multipleProductGroupsInner3.hashCode(), multipleProductGroupsInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASMultipleProductGroupsInner multipleProductGroupsInner = new OASMultipleProductGroupsInner();
        Map<String, String> x-property-mappings = multipleProductGroupsInner.getx-property-mappings();
        System.assertEquals('isFeatured', x-property-mappings.get('is_featured'));
        System.assertEquals('feedId', x-property-mappings.get('feed_id'));
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
        System.assertEquals('catalogId', x-property-mappings.get('catalog_id'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASMultipleProductGroupsInner multipleProductGroupsInner = new OASMultipleProductGroupsInner();
        System.assertEquals(false, multipleProductGroupsInner.isFeatured);
        System.assertEquals(null, multipleProductGroupsInner.name);
        System.assertEquals(null, multipleProductGroupsInner.description);
        System.assertEquals(null, multipleProductGroupsInner.filters);
        System.assertEquals(null, multipleProductGroupsInner.feedId);
        System.assertEquals(null, multipleProductGroupsInner.catalogType);
        System.assertEquals(null, multipleProductGroupsInner.catalogId);
        System.assertEquals(null, multipleProductGroupsInner.country);
        System.assertEquals(null, multipleProductGroupsInner.locale);
    }
}
