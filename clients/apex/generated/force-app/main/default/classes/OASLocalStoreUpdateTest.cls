@isTest
private class OASLocalStoreUpdateTest {
    @isTest
    private static void equalsSameInstance() {
        OASLocalStoreUpdate localStoreUpdate1 = OASLocalStoreUpdate.getExample();
        OASLocalStoreUpdate localStoreUpdate2 = localStoreUpdate1;
        OASLocalStoreUpdate localStoreUpdate3 = new OASLocalStoreUpdate();
        OASLocalStoreUpdate localStoreUpdate4 = localStoreUpdate3;

        System.assert(localStoreUpdate1.equals(localStoreUpdate2));
        System.assert(localStoreUpdate2.equals(localStoreUpdate1));
        System.assert(localStoreUpdate1.equals(localStoreUpdate1));
        System.assert(localStoreUpdate3.equals(localStoreUpdate4));
        System.assert(localStoreUpdate4.equals(localStoreUpdate3));
        System.assert(localStoreUpdate3.equals(localStoreUpdate3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASLocalStoreUpdate localStoreUpdate1 = OASLocalStoreUpdate.getExample();
        OASLocalStoreUpdate localStoreUpdate2 = OASLocalStoreUpdate.getExample();
        OASLocalStoreUpdate localStoreUpdate3 = new OASLocalStoreUpdate();
        OASLocalStoreUpdate localStoreUpdate4 = new OASLocalStoreUpdate();

        System.assert(localStoreUpdate1.equals(localStoreUpdate2));
        System.assert(localStoreUpdate2.equals(localStoreUpdate1));
        System.assert(localStoreUpdate3.equals(localStoreUpdate4));
        System.assert(localStoreUpdate4.equals(localStoreUpdate3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASLocalStoreUpdate localStoreUpdate1 = OASLocalStoreUpdate.getExample();
        OASLocalStoreUpdate localStoreUpdate2 = new OASLocalStoreUpdate();

        System.assertEquals(false, localStoreUpdate1.equals('foo'));
        System.assertEquals(false, localStoreUpdate2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASLocalStoreUpdate localStoreUpdate1 = OASLocalStoreUpdate.getExample();
        OASLocalStoreUpdate localStoreUpdate2 = new OASLocalStoreUpdate();
        OASLocalStoreUpdate localStoreUpdate3;

        System.assertEquals(false, localStoreUpdate1.equals(localStoreUpdate3));
        System.assertEquals(false, localStoreUpdate2.equals(localStoreUpdate3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASLocalStoreUpdate localStoreUpdate1 = OASLocalStoreUpdate.getExample();
        OASLocalStoreUpdate localStoreUpdate2 = new OASLocalStoreUpdate();

        System.assertEquals(localStoreUpdate1.hashCode(), localStoreUpdate1.hashCode());
        System.assertEquals(localStoreUpdate2.hashCode(), localStoreUpdate2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASLocalStoreUpdate localStoreUpdate1 = OASLocalStoreUpdate.getExample();
        OASLocalStoreUpdate localStoreUpdate2 = OASLocalStoreUpdate.getExample();
        OASLocalStoreUpdate localStoreUpdate3 = new OASLocalStoreUpdate();
        OASLocalStoreUpdate localStoreUpdate4 = new OASLocalStoreUpdate();

        System.assert(localStoreUpdate1.equals(localStoreUpdate2));
        System.assert(localStoreUpdate3.equals(localStoreUpdate4));
        System.assertEquals(localStoreUpdate1.hashCode(), localStoreUpdate2.hashCode());
        System.assertEquals(localStoreUpdate3.hashCode(), localStoreUpdate4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASLocalStoreUpdate localStoreUpdate = new OASLocalStoreUpdate();
        Map<String, String> x-property-mappings = localStoreUpdate.getx-property-mappings();
        System.assertEquals('addressPrimary', x-property-mappings.get('address_primary'));
        System.assertEquals('addressSecondary', x-property-mappings.get('address_secondary'));
        System.assertEquals('postalCode', x-property-mappings.get('postal_code'));
        System.assertEquals('storeCode', x-property-mappings.get('store_code'));
    }
}
