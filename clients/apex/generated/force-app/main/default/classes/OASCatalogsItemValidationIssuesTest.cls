@isTest
private class OASCatalogsItemValidationIssuesTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsItemValidationIssues catalogsItemValidationIssues1 = OASCatalogsItemValidationIssues.getExample();
        OASCatalogsItemValidationIssues catalogsItemValidationIssues2 = catalogsItemValidationIssues1;
        OASCatalogsItemValidationIssues catalogsItemValidationIssues3 = new OASCatalogsItemValidationIssues();
        OASCatalogsItemValidationIssues catalogsItemValidationIssues4 = catalogsItemValidationIssues3;

        System.assert(catalogsItemValidationIssues1.equals(catalogsItemValidationIssues2));
        System.assert(catalogsItemValidationIssues2.equals(catalogsItemValidationIssues1));
        System.assert(catalogsItemValidationIssues1.equals(catalogsItemValidationIssues1));
        System.assert(catalogsItemValidationIssues3.equals(catalogsItemValidationIssues4));
        System.assert(catalogsItemValidationIssues4.equals(catalogsItemValidationIssues3));
        System.assert(catalogsItemValidationIssues3.equals(catalogsItemValidationIssues3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsItemValidationIssues catalogsItemValidationIssues1 = OASCatalogsItemValidationIssues.getExample();
        OASCatalogsItemValidationIssues catalogsItemValidationIssues2 = OASCatalogsItemValidationIssues.getExample();
        OASCatalogsItemValidationIssues catalogsItemValidationIssues3 = new OASCatalogsItemValidationIssues();
        OASCatalogsItemValidationIssues catalogsItemValidationIssues4 = new OASCatalogsItemValidationIssues();

        System.assert(catalogsItemValidationIssues1.equals(catalogsItemValidationIssues2));
        System.assert(catalogsItemValidationIssues2.equals(catalogsItemValidationIssues1));
        System.assert(catalogsItemValidationIssues3.equals(catalogsItemValidationIssues4));
        System.assert(catalogsItemValidationIssues4.equals(catalogsItemValidationIssues3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsItemValidationIssues catalogsItemValidationIssues1 = OASCatalogsItemValidationIssues.getExample();
        OASCatalogsItemValidationIssues catalogsItemValidationIssues2 = new OASCatalogsItemValidationIssues();

        System.assertEquals(false, catalogsItemValidationIssues1.equals('foo'));
        System.assertEquals(false, catalogsItemValidationIssues2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsItemValidationIssues catalogsItemValidationIssues1 = OASCatalogsItemValidationIssues.getExample();
        OASCatalogsItemValidationIssues catalogsItemValidationIssues2 = new OASCatalogsItemValidationIssues();
        OASCatalogsItemValidationIssues catalogsItemValidationIssues3;

        System.assertEquals(false, catalogsItemValidationIssues1.equals(catalogsItemValidationIssues3));
        System.assertEquals(false, catalogsItemValidationIssues2.equals(catalogsItemValidationIssues3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsItemValidationIssues catalogsItemValidationIssues1 = OASCatalogsItemValidationIssues.getExample();
        OASCatalogsItemValidationIssues catalogsItemValidationIssues2 = new OASCatalogsItemValidationIssues();

        System.assertEquals(catalogsItemValidationIssues1.hashCode(), catalogsItemValidationIssues1.hashCode());
        System.assertEquals(catalogsItemValidationIssues2.hashCode(), catalogsItemValidationIssues2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsItemValidationIssues catalogsItemValidationIssues1 = OASCatalogsItemValidationIssues.getExample();
        OASCatalogsItemValidationIssues catalogsItemValidationIssues2 = OASCatalogsItemValidationIssues.getExample();
        OASCatalogsItemValidationIssues catalogsItemValidationIssues3 = new OASCatalogsItemValidationIssues();
        OASCatalogsItemValidationIssues catalogsItemValidationIssues4 = new OASCatalogsItemValidationIssues();

        System.assert(catalogsItemValidationIssues1.equals(catalogsItemValidationIssues2));
        System.assert(catalogsItemValidationIssues3.equals(catalogsItemValidationIssues4));
        System.assertEquals(catalogsItemValidationIssues1.hashCode(), catalogsItemValidationIssues2.hashCode());
        System.assertEquals(catalogsItemValidationIssues3.hashCode(), catalogsItemValidationIssues4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsItemValidationIssues catalogsItemValidationIssues = new OASCatalogsItemValidationIssues();
        Map<String, String> x-property-mappings = catalogsItemValidationIssues.getx-property-mappings();
        System.assertEquals('itemNumber', x-property-mappings.get('item_number'));
        System.assertEquals('itemId', x-property-mappings.get('item_id'));
    }
}
