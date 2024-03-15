@isTest
private class OASCatalogsItemValidationWarningsTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsItemValidationWarnings catalogsItemValidationWarnings1 = OASCatalogsItemValidationWarnings.getExample();
        OASCatalogsItemValidationWarnings catalogsItemValidationWarnings2 = catalogsItemValidationWarnings1;
        OASCatalogsItemValidationWarnings catalogsItemValidationWarnings3 = new OASCatalogsItemValidationWarnings();
        OASCatalogsItemValidationWarnings catalogsItemValidationWarnings4 = catalogsItemValidationWarnings3;

        System.assert(catalogsItemValidationWarnings1.equals(catalogsItemValidationWarnings2));
        System.assert(catalogsItemValidationWarnings2.equals(catalogsItemValidationWarnings1));
        System.assert(catalogsItemValidationWarnings1.equals(catalogsItemValidationWarnings1));
        System.assert(catalogsItemValidationWarnings3.equals(catalogsItemValidationWarnings4));
        System.assert(catalogsItemValidationWarnings4.equals(catalogsItemValidationWarnings3));
        System.assert(catalogsItemValidationWarnings3.equals(catalogsItemValidationWarnings3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsItemValidationWarnings catalogsItemValidationWarnings1 = OASCatalogsItemValidationWarnings.getExample();
        OASCatalogsItemValidationWarnings catalogsItemValidationWarnings2 = OASCatalogsItemValidationWarnings.getExample();
        OASCatalogsItemValidationWarnings catalogsItemValidationWarnings3 = new OASCatalogsItemValidationWarnings();
        OASCatalogsItemValidationWarnings catalogsItemValidationWarnings4 = new OASCatalogsItemValidationWarnings();

        System.assert(catalogsItemValidationWarnings1.equals(catalogsItemValidationWarnings2));
        System.assert(catalogsItemValidationWarnings2.equals(catalogsItemValidationWarnings1));
        System.assert(catalogsItemValidationWarnings3.equals(catalogsItemValidationWarnings4));
        System.assert(catalogsItemValidationWarnings4.equals(catalogsItemValidationWarnings3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsItemValidationWarnings catalogsItemValidationWarnings1 = OASCatalogsItemValidationWarnings.getExample();
        OASCatalogsItemValidationWarnings catalogsItemValidationWarnings2 = new OASCatalogsItemValidationWarnings();

        System.assertEquals(false, catalogsItemValidationWarnings1.equals('foo'));
        System.assertEquals(false, catalogsItemValidationWarnings2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsItemValidationWarnings catalogsItemValidationWarnings1 = OASCatalogsItemValidationWarnings.getExample();
        OASCatalogsItemValidationWarnings catalogsItemValidationWarnings2 = new OASCatalogsItemValidationWarnings();
        OASCatalogsItemValidationWarnings catalogsItemValidationWarnings3;

        System.assertEquals(false, catalogsItemValidationWarnings1.equals(catalogsItemValidationWarnings3));
        System.assertEquals(false, catalogsItemValidationWarnings2.equals(catalogsItemValidationWarnings3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsItemValidationWarnings catalogsItemValidationWarnings1 = OASCatalogsItemValidationWarnings.getExample();
        OASCatalogsItemValidationWarnings catalogsItemValidationWarnings2 = new OASCatalogsItemValidationWarnings();

        System.assertEquals(catalogsItemValidationWarnings1.hashCode(), catalogsItemValidationWarnings1.hashCode());
        System.assertEquals(catalogsItemValidationWarnings2.hashCode(), catalogsItemValidationWarnings2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsItemValidationWarnings catalogsItemValidationWarnings1 = OASCatalogsItemValidationWarnings.getExample();
        OASCatalogsItemValidationWarnings catalogsItemValidationWarnings2 = OASCatalogsItemValidationWarnings.getExample();
        OASCatalogsItemValidationWarnings catalogsItemValidationWarnings3 = new OASCatalogsItemValidationWarnings();
        OASCatalogsItemValidationWarnings catalogsItemValidationWarnings4 = new OASCatalogsItemValidationWarnings();

        System.assert(catalogsItemValidationWarnings1.equals(catalogsItemValidationWarnings2));
        System.assert(catalogsItemValidationWarnings3.equals(catalogsItemValidationWarnings4));
        System.assertEquals(catalogsItemValidationWarnings1.hashCode(), catalogsItemValidationWarnings2.hashCode());
        System.assertEquals(catalogsItemValidationWarnings3.hashCode(), catalogsItemValidationWarnings4.hashCode());
    }
}
