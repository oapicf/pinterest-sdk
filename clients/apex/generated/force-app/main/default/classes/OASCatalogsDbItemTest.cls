@isTest
private class OASCatalogsDbItemTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsDbItem catalogsDbItem1 = OASCatalogsDbItem.getExample();
        OASCatalogsDbItem catalogsDbItem2 = catalogsDbItem1;
        OASCatalogsDbItem catalogsDbItem3 = new OASCatalogsDbItem();
        OASCatalogsDbItem catalogsDbItem4 = catalogsDbItem3;

        System.assert(catalogsDbItem1.equals(catalogsDbItem2));
        System.assert(catalogsDbItem2.equals(catalogsDbItem1));
        System.assert(catalogsDbItem1.equals(catalogsDbItem1));
        System.assert(catalogsDbItem3.equals(catalogsDbItem4));
        System.assert(catalogsDbItem4.equals(catalogsDbItem3));
        System.assert(catalogsDbItem3.equals(catalogsDbItem3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsDbItem catalogsDbItem1 = OASCatalogsDbItem.getExample();
        OASCatalogsDbItem catalogsDbItem2 = OASCatalogsDbItem.getExample();
        OASCatalogsDbItem catalogsDbItem3 = new OASCatalogsDbItem();
        OASCatalogsDbItem catalogsDbItem4 = new OASCatalogsDbItem();

        System.assert(catalogsDbItem1.equals(catalogsDbItem2));
        System.assert(catalogsDbItem2.equals(catalogsDbItem1));
        System.assert(catalogsDbItem3.equals(catalogsDbItem4));
        System.assert(catalogsDbItem4.equals(catalogsDbItem3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsDbItem catalogsDbItem1 = OASCatalogsDbItem.getExample();
        OASCatalogsDbItem catalogsDbItem2 = new OASCatalogsDbItem();

        System.assertEquals(false, catalogsDbItem1.equals('foo'));
        System.assertEquals(false, catalogsDbItem2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsDbItem catalogsDbItem1 = OASCatalogsDbItem.getExample();
        OASCatalogsDbItem catalogsDbItem2 = new OASCatalogsDbItem();
        OASCatalogsDbItem catalogsDbItem3;

        System.assertEquals(false, catalogsDbItem1.equals(catalogsDbItem3));
        System.assertEquals(false, catalogsDbItem2.equals(catalogsDbItem3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsDbItem catalogsDbItem1 = OASCatalogsDbItem.getExample();
        OASCatalogsDbItem catalogsDbItem2 = new OASCatalogsDbItem();

        System.assertEquals(catalogsDbItem1.hashCode(), catalogsDbItem1.hashCode());
        System.assertEquals(catalogsDbItem2.hashCode(), catalogsDbItem2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsDbItem catalogsDbItem1 = OASCatalogsDbItem.getExample();
        OASCatalogsDbItem catalogsDbItem2 = OASCatalogsDbItem.getExample();
        OASCatalogsDbItem catalogsDbItem3 = new OASCatalogsDbItem();
        OASCatalogsDbItem catalogsDbItem4 = new OASCatalogsDbItem();

        System.assert(catalogsDbItem1.equals(catalogsDbItem2));
        System.assert(catalogsDbItem3.equals(catalogsDbItem4));
        System.assertEquals(catalogsDbItem1.hashCode(), catalogsDbItem2.hashCode());
        System.assertEquals(catalogsDbItem3.hashCode(), catalogsDbItem4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsDbItem catalogsDbItem = new OASCatalogsDbItem();
        Map<String, String> x-property-mappings = catalogsDbItem.getx-property-mappings();
        System.assertEquals('createdAt', x-property-mappings.get('created_at'));
        System.assertEquals('updatedAt', x-property-mappings.get('updated_at'));
    }
}
