@isTest
private class OASCatalogsProductGroupMultipleMediaTest {
    @isTest
    private static void equalsSameInstance() {
        OASCatalogsProductGroupMultipleMedia catalogsProductGroupMultipleMediaTypesCriteria1 = OASCatalogsProductGroupMultipleMedia.getExample();
        OASCatalogsProductGroupMultipleMedia catalogsProductGroupMultipleMediaTypesCriteria2 = catalogsProductGroupMultipleMediaTypesCriteria1;
        OASCatalogsProductGroupMultipleMedia catalogsProductGroupMultipleMediaTypesCriteria3 = new OASCatalogsProductGroupMultipleMedia();
        OASCatalogsProductGroupMultipleMedia catalogsProductGroupMultipleMediaTypesCriteria4 = catalogsProductGroupMultipleMediaTypesCriteria3;

        System.assert(catalogsProductGroupMultipleMediaTypesCriteria1.equals(catalogsProductGroupMultipleMediaTypesCriteria2));
        System.assert(catalogsProductGroupMultipleMediaTypesCriteria2.equals(catalogsProductGroupMultipleMediaTypesCriteria1));
        System.assert(catalogsProductGroupMultipleMediaTypesCriteria1.equals(catalogsProductGroupMultipleMediaTypesCriteria1));
        System.assert(catalogsProductGroupMultipleMediaTypesCriteria3.equals(catalogsProductGroupMultipleMediaTypesCriteria4));
        System.assert(catalogsProductGroupMultipleMediaTypesCriteria4.equals(catalogsProductGroupMultipleMediaTypesCriteria3));
        System.assert(catalogsProductGroupMultipleMediaTypesCriteria3.equals(catalogsProductGroupMultipleMediaTypesCriteria3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCatalogsProductGroupMultipleMedia catalogsProductGroupMultipleMediaTypesCriteria1 = OASCatalogsProductGroupMultipleMedia.getExample();
        OASCatalogsProductGroupMultipleMedia catalogsProductGroupMultipleMediaTypesCriteria2 = OASCatalogsProductGroupMultipleMedia.getExample();
        OASCatalogsProductGroupMultipleMedia catalogsProductGroupMultipleMediaTypesCriteria3 = new OASCatalogsProductGroupMultipleMedia();
        OASCatalogsProductGroupMultipleMedia catalogsProductGroupMultipleMediaTypesCriteria4 = new OASCatalogsProductGroupMultipleMedia();

        System.assert(catalogsProductGroupMultipleMediaTypesCriteria1.equals(catalogsProductGroupMultipleMediaTypesCriteria2));
        System.assert(catalogsProductGroupMultipleMediaTypesCriteria2.equals(catalogsProductGroupMultipleMediaTypesCriteria1));
        System.assert(catalogsProductGroupMultipleMediaTypesCriteria3.equals(catalogsProductGroupMultipleMediaTypesCriteria4));
        System.assert(catalogsProductGroupMultipleMediaTypesCriteria4.equals(catalogsProductGroupMultipleMediaTypesCriteria3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCatalogsProductGroupMultipleMedia catalogsProductGroupMultipleMediaTypesCriteria1 = OASCatalogsProductGroupMultipleMedia.getExample();
        OASCatalogsProductGroupMultipleMedia catalogsProductGroupMultipleMediaTypesCriteria2 = new OASCatalogsProductGroupMultipleMedia();

        System.assertEquals(false, catalogsProductGroupMultipleMediaTypesCriteria1.equals('foo'));
        System.assertEquals(false, catalogsProductGroupMultipleMediaTypesCriteria2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCatalogsProductGroupMultipleMedia catalogsProductGroupMultipleMediaTypesCriteria1 = OASCatalogsProductGroupMultipleMedia.getExample();
        OASCatalogsProductGroupMultipleMedia catalogsProductGroupMultipleMediaTypesCriteria2 = new OASCatalogsProductGroupMultipleMedia();
        OASCatalogsProductGroupMultipleMedia catalogsProductGroupMultipleMediaTypesCriteria3;

        System.assertEquals(false, catalogsProductGroupMultipleMediaTypesCriteria1.equals(catalogsProductGroupMultipleMediaTypesCriteria3));
        System.assertEquals(false, catalogsProductGroupMultipleMediaTypesCriteria2.equals(catalogsProductGroupMultipleMediaTypesCriteria3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCatalogsProductGroupMultipleMedia catalogsProductGroupMultipleMediaTypesCriteria1 = OASCatalogsProductGroupMultipleMedia.getExample();
        OASCatalogsProductGroupMultipleMedia catalogsProductGroupMultipleMediaTypesCriteria2 = new OASCatalogsProductGroupMultipleMedia();

        System.assertEquals(catalogsProductGroupMultipleMediaTypesCriteria1.hashCode(), catalogsProductGroupMultipleMediaTypesCriteria1.hashCode());
        System.assertEquals(catalogsProductGroupMultipleMediaTypesCriteria2.hashCode(), catalogsProductGroupMultipleMediaTypesCriteria2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCatalogsProductGroupMultipleMedia catalogsProductGroupMultipleMediaTypesCriteria1 = OASCatalogsProductGroupMultipleMedia.getExample();
        OASCatalogsProductGroupMultipleMedia catalogsProductGroupMultipleMediaTypesCriteria2 = OASCatalogsProductGroupMultipleMedia.getExample();
        OASCatalogsProductGroupMultipleMedia catalogsProductGroupMultipleMediaTypesCriteria3 = new OASCatalogsProductGroupMultipleMedia();
        OASCatalogsProductGroupMultipleMedia catalogsProductGroupMultipleMediaTypesCriteria4 = new OASCatalogsProductGroupMultipleMedia();

        System.assert(catalogsProductGroupMultipleMediaTypesCriteria1.equals(catalogsProductGroupMultipleMediaTypesCriteria2));
        System.assert(catalogsProductGroupMultipleMediaTypesCriteria3.equals(catalogsProductGroupMultipleMediaTypesCriteria4));
        System.assertEquals(catalogsProductGroupMultipleMediaTypesCriteria1.hashCode(), catalogsProductGroupMultipleMediaTypesCriteria2.hashCode());
        System.assertEquals(catalogsProductGroupMultipleMediaTypesCriteria3.hashCode(), catalogsProductGroupMultipleMediaTypesCriteria4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCatalogsProductGroupMultipleMedia catalogsProductGroupMultipleMediaTypesCriteria = new OASCatalogsProductGroupMultipleMedia();
        System.assertEquals(new List<OASMediaType>(), catalogsProductGroupMultipleMediaTypesCriteria.values);
        System.assertEquals(false, catalogsProductGroupMultipleMediaTypesCriteria.negated);
    }
}
