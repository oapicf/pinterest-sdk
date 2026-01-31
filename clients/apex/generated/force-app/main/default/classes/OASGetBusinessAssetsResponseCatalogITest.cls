@isTest
private class OASGetBusinessAssetsResponseCatalogITest {
    @isTest
    private static void equalsSameInstance() {
        OASGetBusinessAssetsResponseCatalogI getBusinessAssetsResponseCatalogInfo1 = OASGetBusinessAssetsResponseCatalogI.getExample();
        OASGetBusinessAssetsResponseCatalogI getBusinessAssetsResponseCatalogInfo2 = getBusinessAssetsResponseCatalogInfo1;
        OASGetBusinessAssetsResponseCatalogI getBusinessAssetsResponseCatalogInfo3 = new OASGetBusinessAssetsResponseCatalogI();
        OASGetBusinessAssetsResponseCatalogI getBusinessAssetsResponseCatalogInfo4 = getBusinessAssetsResponseCatalogInfo3;

        System.assert(getBusinessAssetsResponseCatalogInfo1.equals(getBusinessAssetsResponseCatalogInfo2));
        System.assert(getBusinessAssetsResponseCatalogInfo2.equals(getBusinessAssetsResponseCatalogInfo1));
        System.assert(getBusinessAssetsResponseCatalogInfo1.equals(getBusinessAssetsResponseCatalogInfo1));
        System.assert(getBusinessAssetsResponseCatalogInfo3.equals(getBusinessAssetsResponseCatalogInfo4));
        System.assert(getBusinessAssetsResponseCatalogInfo4.equals(getBusinessAssetsResponseCatalogInfo3));
        System.assert(getBusinessAssetsResponseCatalogInfo3.equals(getBusinessAssetsResponseCatalogInfo3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetBusinessAssetsResponseCatalogI getBusinessAssetsResponseCatalogInfo1 = OASGetBusinessAssetsResponseCatalogI.getExample();
        OASGetBusinessAssetsResponseCatalogI getBusinessAssetsResponseCatalogInfo2 = OASGetBusinessAssetsResponseCatalogI.getExample();
        OASGetBusinessAssetsResponseCatalogI getBusinessAssetsResponseCatalogInfo3 = new OASGetBusinessAssetsResponseCatalogI();
        OASGetBusinessAssetsResponseCatalogI getBusinessAssetsResponseCatalogInfo4 = new OASGetBusinessAssetsResponseCatalogI();

        System.assert(getBusinessAssetsResponseCatalogInfo1.equals(getBusinessAssetsResponseCatalogInfo2));
        System.assert(getBusinessAssetsResponseCatalogInfo2.equals(getBusinessAssetsResponseCatalogInfo1));
        System.assert(getBusinessAssetsResponseCatalogInfo3.equals(getBusinessAssetsResponseCatalogInfo4));
        System.assert(getBusinessAssetsResponseCatalogInfo4.equals(getBusinessAssetsResponseCatalogInfo3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetBusinessAssetsResponseCatalogI getBusinessAssetsResponseCatalogInfo1 = OASGetBusinessAssetsResponseCatalogI.getExample();
        OASGetBusinessAssetsResponseCatalogI getBusinessAssetsResponseCatalogInfo2 = new OASGetBusinessAssetsResponseCatalogI();

        System.assertEquals(false, getBusinessAssetsResponseCatalogInfo1.equals('foo'));
        System.assertEquals(false, getBusinessAssetsResponseCatalogInfo2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetBusinessAssetsResponseCatalogI getBusinessAssetsResponseCatalogInfo1 = OASGetBusinessAssetsResponseCatalogI.getExample();
        OASGetBusinessAssetsResponseCatalogI getBusinessAssetsResponseCatalogInfo2 = new OASGetBusinessAssetsResponseCatalogI();
        OASGetBusinessAssetsResponseCatalogI getBusinessAssetsResponseCatalogInfo3;

        System.assertEquals(false, getBusinessAssetsResponseCatalogInfo1.equals(getBusinessAssetsResponseCatalogInfo3));
        System.assertEquals(false, getBusinessAssetsResponseCatalogInfo2.equals(getBusinessAssetsResponseCatalogInfo3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetBusinessAssetsResponseCatalogI getBusinessAssetsResponseCatalogInfo1 = OASGetBusinessAssetsResponseCatalogI.getExample();
        OASGetBusinessAssetsResponseCatalogI getBusinessAssetsResponseCatalogInfo2 = new OASGetBusinessAssetsResponseCatalogI();

        System.assertEquals(getBusinessAssetsResponseCatalogInfo1.hashCode(), getBusinessAssetsResponseCatalogInfo1.hashCode());
        System.assertEquals(getBusinessAssetsResponseCatalogInfo2.hashCode(), getBusinessAssetsResponseCatalogInfo2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetBusinessAssetsResponseCatalogI getBusinessAssetsResponseCatalogInfo1 = OASGetBusinessAssetsResponseCatalogI.getExample();
        OASGetBusinessAssetsResponseCatalogI getBusinessAssetsResponseCatalogInfo2 = OASGetBusinessAssetsResponseCatalogI.getExample();
        OASGetBusinessAssetsResponseCatalogI getBusinessAssetsResponseCatalogInfo3 = new OASGetBusinessAssetsResponseCatalogI();
        OASGetBusinessAssetsResponseCatalogI getBusinessAssetsResponseCatalogInfo4 = new OASGetBusinessAssetsResponseCatalogI();

        System.assert(getBusinessAssetsResponseCatalogInfo1.equals(getBusinessAssetsResponseCatalogInfo2));
        System.assert(getBusinessAssetsResponseCatalogInfo3.equals(getBusinessAssetsResponseCatalogInfo4));
        System.assertEquals(getBusinessAssetsResponseCatalogInfo1.hashCode(), getBusinessAssetsResponseCatalogInfo2.hashCode());
        System.assertEquals(getBusinessAssetsResponseCatalogInfo3.hashCode(), getBusinessAssetsResponseCatalogInfo4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASGetBusinessAssetsResponseCatalogI getBusinessAssetsResponseCatalogInfo = new OASGetBusinessAssetsResponseCatalogI();
        Map<String, String> x-property-mappings = getBusinessAssetsResponseCatalogInfo.getx-property-mappings();
        System.assertEquals('catalogType', x-property-mappings.get('catalog_type'));
    }
}
