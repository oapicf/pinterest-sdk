@isTest
private class OASAnyOfTest {
    @isTest
    private static void equalsSameInstance() {
        OASAnyOf anyOf1 = OASAnyOf.getExample();
        OASAnyOf anyOf2 = anyOf1;
        OASAnyOf anyOf3 = new OASAnyOf();
        OASAnyOf anyOf4 = anyOf3;

        System.assert(anyOf1.equals(anyOf2));
        System.assert(anyOf2.equals(anyOf1));
        System.assert(anyOf1.equals(anyOf1));
        System.assert(anyOf3.equals(anyOf4));
        System.assert(anyOf4.equals(anyOf3));
        System.assert(anyOf3.equals(anyOf3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAnyOf anyOf1 = OASAnyOf.getExample();
        OASAnyOf anyOf2 = OASAnyOf.getExample();
        OASAnyOf anyOf3 = new OASAnyOf();
        OASAnyOf anyOf4 = new OASAnyOf();

        System.assert(anyOf1.equals(anyOf2));
        System.assert(anyOf2.equals(anyOf1));
        System.assert(anyOf3.equals(anyOf4));
        System.assert(anyOf4.equals(anyOf3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAnyOf anyOf1 = OASAnyOf.getExample();
        OASAnyOf anyOf2 = new OASAnyOf();

        System.assertEquals(false, anyOf1.equals('foo'));
        System.assertEquals(false, anyOf2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAnyOf anyOf1 = OASAnyOf.getExample();
        OASAnyOf anyOf2 = new OASAnyOf();
        OASAnyOf anyOf3;

        System.assertEquals(false, anyOf1.equals(anyOf3));
        System.assertEquals(false, anyOf2.equals(anyOf3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAnyOf anyOf1 = OASAnyOf.getExample();
        OASAnyOf anyOf2 = new OASAnyOf();

        System.assertEquals(anyOf1.hashCode(), anyOf1.hashCode());
        System.assertEquals(anyOf2.hashCode(), anyOf2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAnyOf anyOf1 = OASAnyOf.getExample();
        OASAnyOf anyOf2 = OASAnyOf.getExample();
        OASAnyOf anyOf3 = new OASAnyOf();
        OASAnyOf anyOf4 = new OASAnyOf();

        System.assert(anyOf1.equals(anyOf2));
        System.assert(anyOf3.equals(anyOf4));
        System.assertEquals(anyOf1.hashCode(), anyOf2.hashCode());
        System.assertEquals(anyOf3.hashCode(), anyOf4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAnyOf anyOf = new OASAnyOf();
        Map<String, String> x-property-mappings = anyOf.getx-property-mappings();
        System.assertEquals('anyOf', x-property-mappings.get('any_of'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAnyOf anyOf = new OASAnyOf();
        System.assertEquals(new List<OASCatalogsProductGroupFilterKeys>(), anyOf.anyOf);
    }
}
