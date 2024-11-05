@isTest
private class OASCatalogsItemsRequestLanguageTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsItemsRequestLanguage catalogsItemsRequestLanguage1 = OASCatalogsItemsRequestLanguage.getExample();
        OASCatalogsItemsRequestLanguage catalogsItemsRequestLanguage2 = catalogsItemsRequestLanguage1;
        OASCatalogsItemsRequestLanguage catalogsItemsRequestLanguage3 = new OASCatalogsItemsRequestLanguage();
        OASCatalogsItemsRequestLanguage catalogsItemsRequestLanguage4 = catalogsItemsRequestLanguage3;

        System.assert(catalogsItemsRequestLanguage1.equals(catalogsItemsRequestLanguage2));
        System.assert(catalogsItemsRequestLanguage2.equals(catalogsItemsRequestLanguage1));
        System.assert(catalogsItemsRequestLanguage1.equals(catalogsItemsRequestLanguage1));
        System.assert(catalogsItemsRequestLanguage3.equals(catalogsItemsRequestLanguage4));
        System.assert(catalogsItemsRequestLanguage4.equals(catalogsItemsRequestLanguage3));
        System.assert(catalogsItemsRequestLanguage3.equals(catalogsItemsRequestLanguage3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsItemsRequestLanguage catalogsItemsRequestLanguage1 = OASCatalogsItemsRequestLanguage.getExample();
        OASCatalogsItemsRequestLanguage catalogsItemsRequestLanguage2 = OASCatalogsItemsRequestLanguage.getExample();
        OASCatalogsItemsRequestLanguage catalogsItemsRequestLanguage3 = new OASCatalogsItemsRequestLanguage();
        OASCatalogsItemsRequestLanguage catalogsItemsRequestLanguage4 = new OASCatalogsItemsRequestLanguage();

        System.assert(catalogsItemsRequestLanguage1.equals(catalogsItemsRequestLanguage2));
        System.assert(catalogsItemsRequestLanguage2.equals(catalogsItemsRequestLanguage1));
        System.assert(catalogsItemsRequestLanguage3.equals(catalogsItemsRequestLanguage4));
        System.assert(catalogsItemsRequestLanguage4.equals(catalogsItemsRequestLanguage3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsItemsRequestLanguage catalogsItemsRequestLanguage1 = OASCatalogsItemsRequestLanguage.getExample();
        OASCatalogsItemsRequestLanguage catalogsItemsRequestLanguage2 = new OASCatalogsItemsRequestLanguage();

        System.assertEquals(false, catalogsItemsRequestLanguage1.equals('foo'));
        System.assertEquals(false, catalogsItemsRequestLanguage2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsItemsRequestLanguage catalogsItemsRequestLanguage1 = OASCatalogsItemsRequestLanguage.getExample();
        OASCatalogsItemsRequestLanguage catalogsItemsRequestLanguage2 = new OASCatalogsItemsRequestLanguage();
        OASCatalogsItemsRequestLanguage catalogsItemsRequestLanguage3;

        System.assertEquals(false, catalogsItemsRequestLanguage1.equals(catalogsItemsRequestLanguage3));
        System.assertEquals(false, catalogsItemsRequestLanguage2.equals(catalogsItemsRequestLanguage3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsItemsRequestLanguage catalogsItemsRequestLanguage1 = OASCatalogsItemsRequestLanguage.getExample();
        OASCatalogsItemsRequestLanguage catalogsItemsRequestLanguage2 = new OASCatalogsItemsRequestLanguage();

        System.assertEquals(catalogsItemsRequestLanguage1.hashCode(), catalogsItemsRequestLanguage1.hashCode());
        System.assertEquals(catalogsItemsRequestLanguage2.hashCode(), catalogsItemsRequestLanguage2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsItemsRequestLanguage catalogsItemsRequestLanguage1 = OASCatalogsItemsRequestLanguage.getExample();
        OASCatalogsItemsRequestLanguage catalogsItemsRequestLanguage2 = OASCatalogsItemsRequestLanguage.getExample();
        OASCatalogsItemsRequestLanguage catalogsItemsRequestLanguage3 = new OASCatalogsItemsRequestLanguage();
        OASCatalogsItemsRequestLanguage catalogsItemsRequestLanguage4 = new OASCatalogsItemsRequestLanguage();

        System.assert(catalogsItemsRequestLanguage1.equals(catalogsItemsRequestLanguage2));
        System.assert(catalogsItemsRequestLanguage3.equals(catalogsItemsRequestLanguage4));
        System.assertEquals(catalogsItemsRequestLanguage1.hashCode(), catalogsItemsRequestLanguage2.hashCode());
        System.assertEquals(catalogsItemsRequestLanguage3.hashCode(), catalogsItemsRequestLanguage4.hashCode());
    }
}
