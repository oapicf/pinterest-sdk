@isTest
private class OASCatalogsRetailProductGroupUpdateRTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsRetailProductGroupUpdateR catalogsRetailProductGroupUpdateRequest1 = OASCatalogsRetailProductGroupUpdateR.getExample();
        OASCatalogsRetailProductGroupUpdateR catalogsRetailProductGroupUpdateRequest2 = catalogsRetailProductGroupUpdateRequest1;
        OASCatalogsRetailProductGroupUpdateR catalogsRetailProductGroupUpdateRequest3 = new OASCatalogsRetailProductGroupUpdateR();
        OASCatalogsRetailProductGroupUpdateR catalogsRetailProductGroupUpdateRequest4 = catalogsRetailProductGroupUpdateRequest3;

        System.assert(catalogsRetailProductGroupUpdateRequest1.equals(catalogsRetailProductGroupUpdateRequest2));
        System.assert(catalogsRetailProductGroupUpdateRequest2.equals(catalogsRetailProductGroupUpdateRequest1));
        System.assert(catalogsRetailProductGroupUpdateRequest1.equals(catalogsRetailProductGroupUpdateRequest1));
        System.assert(catalogsRetailProductGroupUpdateRequest3.equals(catalogsRetailProductGroupUpdateRequest4));
        System.assert(catalogsRetailProductGroupUpdateRequest4.equals(catalogsRetailProductGroupUpdateRequest3));
        System.assert(catalogsRetailProductGroupUpdateRequest3.equals(catalogsRetailProductGroupUpdateRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsRetailProductGroupUpdateR catalogsRetailProductGroupUpdateRequest1 = OASCatalogsRetailProductGroupUpdateR.getExample();
        OASCatalogsRetailProductGroupUpdateR catalogsRetailProductGroupUpdateRequest2 = OASCatalogsRetailProductGroupUpdateR.getExample();
        OASCatalogsRetailProductGroupUpdateR catalogsRetailProductGroupUpdateRequest3 = new OASCatalogsRetailProductGroupUpdateR();
        OASCatalogsRetailProductGroupUpdateR catalogsRetailProductGroupUpdateRequest4 = new OASCatalogsRetailProductGroupUpdateR();

        System.assert(catalogsRetailProductGroupUpdateRequest1.equals(catalogsRetailProductGroupUpdateRequest2));
        System.assert(catalogsRetailProductGroupUpdateRequest2.equals(catalogsRetailProductGroupUpdateRequest1));
        System.assert(catalogsRetailProductGroupUpdateRequest3.equals(catalogsRetailProductGroupUpdateRequest4));
        System.assert(catalogsRetailProductGroupUpdateRequest4.equals(catalogsRetailProductGroupUpdateRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsRetailProductGroupUpdateR catalogsRetailProductGroupUpdateRequest1 = OASCatalogsRetailProductGroupUpdateR.getExample();
        OASCatalogsRetailProductGroupUpdateR catalogsRetailProductGroupUpdateRequest2 = new OASCatalogsRetailProductGroupUpdateR();

        System.assertEquals(false, catalogsRetailProductGroupUpdateRequest1.equals('foo'));
        System.assertEquals(false, catalogsRetailProductGroupUpdateRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsRetailProductGroupUpdateR catalogsRetailProductGroupUpdateRequest1 = OASCatalogsRetailProductGroupUpdateR.getExample();
        OASCatalogsRetailProductGroupUpdateR catalogsRetailProductGroupUpdateRequest2 = new OASCatalogsRetailProductGroupUpdateR();
        OASCatalogsRetailProductGroupUpdateR catalogsRetailProductGroupUpdateRequest3;

        System.assertEquals(false, catalogsRetailProductGroupUpdateRequest1.equals(catalogsRetailProductGroupUpdateRequest3));
        System.assertEquals(false, catalogsRetailProductGroupUpdateRequest2.equals(catalogsRetailProductGroupUpdateRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsRetailProductGroupUpdateR catalogsRetailProductGroupUpdateRequest1 = OASCatalogsRetailProductGroupUpdateR.getExample();
        OASCatalogsRetailProductGroupUpdateR catalogsRetailProductGroupUpdateRequest2 = new OASCatalogsRetailProductGroupUpdateR();

        System.assertEquals(catalogsRetailProductGroupUpdateRequest1.hashCode(), catalogsRetailProductGroupUpdateRequest1.hashCode());
        System.assertEquals(catalogsRetailProductGroupUpdateRequest2.hashCode(), catalogsRetailProductGroupUpdateRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsRetailProductGroupUpdateR catalogsRetailProductGroupUpdateRequest1 = OASCatalogsRetailProductGroupUpdateR.getExample();
        OASCatalogsRetailProductGroupUpdateR catalogsRetailProductGroupUpdateRequest2 = OASCatalogsRetailProductGroupUpdateR.getExample();
        OASCatalogsRetailProductGroupUpdateR catalogsRetailProductGroupUpdateRequest3 = new OASCatalogsRetailProductGroupUpdateR();
        OASCatalogsRetailProductGroupUpdateR catalogsRetailProductGroupUpdateRequest4 = new OASCatalogsRetailProductGroupUpdateR();

        System.assert(catalogsRetailProductGroupUpdateRequest1.equals(catalogsRetailProductGroupUpdateRequest2));
        System.assert(catalogsRetailProductGroupUpdateRequest3.equals(catalogsRetailProductGroupUpdateRequest4));
        System.assertEquals(catalogsRetailProductGroupUpdateRequest1.hashCode(), catalogsRetailProductGroupUpdateRequest2.hashCode());
        System.assertEquals(catalogsRetailProductGroupUpdateRequest3.hashCode(), catalogsRetailProductGroupUpdateRequest4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCatalogsRetailProductGroupUpdateR catalogsRetailProductGroupUpdateRequest = new OASCatalogsRetailProductGroupUpdateR();
        Map<String, String> x-property-mappings = catalogsRetailProductGroupUpdateRequest.getx-property-mappings();
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
    }
}
