@isTest
private class OASAllOfTest {
    @isTest
    private static void equalsSameInstance() {
        OASAllOf allOf1 = OASAllOf.getExample();
        OASAllOf allOf2 = allOf1;
        OASAllOf allOf3 = new OASAllOf();
        OASAllOf allOf4 = allOf3;

        System.assert(allOf1.equals(allOf2));
        System.assert(allOf2.equals(allOf1));
        System.assert(allOf1.equals(allOf1));
        System.assert(allOf3.equals(allOf4));
        System.assert(allOf4.equals(allOf3));
        System.assert(allOf3.equals(allOf3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAllOf allOf1 = OASAllOf.getExample();
        OASAllOf allOf2 = OASAllOf.getExample();
        OASAllOf allOf3 = new OASAllOf();
        OASAllOf allOf4 = new OASAllOf();

        System.assert(allOf1.equals(allOf2));
        System.assert(allOf2.equals(allOf1));
        System.assert(allOf3.equals(allOf4));
        System.assert(allOf4.equals(allOf3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAllOf allOf1 = OASAllOf.getExample();
        OASAllOf allOf2 = new OASAllOf();

        System.assertEquals(false, allOf1.equals('foo'));
        System.assertEquals(false, allOf2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAllOf allOf1 = OASAllOf.getExample();
        OASAllOf allOf2 = new OASAllOf();
        OASAllOf allOf3;

        System.assertEquals(false, allOf1.equals(allOf3));
        System.assertEquals(false, allOf2.equals(allOf3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAllOf allOf1 = OASAllOf.getExample();
        OASAllOf allOf2 = new OASAllOf();

        System.assertEquals(allOf1.hashCode(), allOf1.hashCode());
        System.assertEquals(allOf2.hashCode(), allOf2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAllOf allOf1 = OASAllOf.getExample();
        OASAllOf allOf2 = OASAllOf.getExample();
        OASAllOf allOf3 = new OASAllOf();
        OASAllOf allOf4 = new OASAllOf();

        System.assert(allOf1.equals(allOf2));
        System.assert(allOf3.equals(allOf4));
        System.assertEquals(allOf1.hashCode(), allOf2.hashCode());
        System.assertEquals(allOf3.hashCode(), allOf4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAllOf allOf = new OASAllOf();
        Map<String, String> x-property-mappings = allOf.getx-property-mappings();
        System.assertEquals('allOf', x-property-mappings.get('all_of'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAllOf allOf = new OASAllOf();
        System.assertEquals(new List<OASCatalogsProductGroupFilterKeys>(), allOf.allOf);
    }
}
