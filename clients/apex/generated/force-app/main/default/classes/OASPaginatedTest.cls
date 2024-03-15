@isTest
private class OASPaginatedTest {
    @isTest
    private static void equalsSameInstance() {
        OASPaginated paginated1 = OASPaginated.getExample();
        OASPaginated paginated2 = paginated1;
        OASPaginated paginated3 = new OASPaginated();
        OASPaginated paginated4 = paginated3;

        System.assert(paginated1.equals(paginated2));
        System.assert(paginated2.equals(paginated1));
        System.assert(paginated1.equals(paginated1));
        System.assert(paginated3.equals(paginated4));
        System.assert(paginated4.equals(paginated3));
        System.assert(paginated3.equals(paginated3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPaginated paginated1 = OASPaginated.getExample();
        OASPaginated paginated2 = OASPaginated.getExample();
        OASPaginated paginated3 = new OASPaginated();
        OASPaginated paginated4 = new OASPaginated();

        System.assert(paginated1.equals(paginated2));
        System.assert(paginated2.equals(paginated1));
        System.assert(paginated3.equals(paginated4));
        System.assert(paginated4.equals(paginated3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPaginated paginated1 = OASPaginated.getExample();
        OASPaginated paginated2 = new OASPaginated();

        System.assertEquals(false, paginated1.equals('foo'));
        System.assertEquals(false, paginated2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPaginated paginated1 = OASPaginated.getExample();
        OASPaginated paginated2 = new OASPaginated();
        OASPaginated paginated3;

        System.assertEquals(false, paginated1.equals(paginated3));
        System.assertEquals(false, paginated2.equals(paginated3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPaginated paginated1 = OASPaginated.getExample();
        OASPaginated paginated2 = new OASPaginated();

        System.assertEquals(paginated1.hashCode(), paginated1.hashCode());
        System.assertEquals(paginated2.hashCode(), paginated2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPaginated paginated1 = OASPaginated.getExample();
        OASPaginated paginated2 = OASPaginated.getExample();
        OASPaginated paginated3 = new OASPaginated();
        OASPaginated paginated4 = new OASPaginated();

        System.assert(paginated1.equals(paginated2));
        System.assert(paginated3.equals(paginated4));
        System.assertEquals(paginated1.hashCode(), paginated2.hashCode());
        System.assertEquals(paginated3.hashCode(), paginated4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPaginated paginated = new OASPaginated();
        System.assertEquals(new List<Object>(), paginated.items);
        System.assertEquals(null, paginated.bookmark);
    }
}
