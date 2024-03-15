@isTest
private class OASAdPinIdTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdPinId adPinId1 = OASAdPinId.getExample();
        OASAdPinId adPinId2 = adPinId1;
        OASAdPinId adPinId3 = new OASAdPinId();
        OASAdPinId adPinId4 = adPinId3;

        System.assert(adPinId1.equals(adPinId2));
        System.assert(adPinId2.equals(adPinId1));
        System.assert(adPinId1.equals(adPinId1));
        System.assert(adPinId3.equals(adPinId4));
        System.assert(adPinId4.equals(adPinId3));
        System.assert(adPinId3.equals(adPinId3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdPinId adPinId1 = OASAdPinId.getExample();
        OASAdPinId adPinId2 = OASAdPinId.getExample();
        OASAdPinId adPinId3 = new OASAdPinId();
        OASAdPinId adPinId4 = new OASAdPinId();

        System.assert(adPinId1.equals(adPinId2));
        System.assert(adPinId2.equals(adPinId1));
        System.assert(adPinId3.equals(adPinId4));
        System.assert(adPinId4.equals(adPinId3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdPinId adPinId1 = OASAdPinId.getExample();
        OASAdPinId adPinId2 = new OASAdPinId();

        System.assertEquals(false, adPinId1.equals('foo'));
        System.assertEquals(false, adPinId2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdPinId adPinId1 = OASAdPinId.getExample();
        OASAdPinId adPinId2 = new OASAdPinId();
        OASAdPinId adPinId3;

        System.assertEquals(false, adPinId1.equals(adPinId3));
        System.assertEquals(false, adPinId2.equals(adPinId3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdPinId adPinId1 = OASAdPinId.getExample();
        OASAdPinId adPinId2 = new OASAdPinId();

        System.assertEquals(adPinId1.hashCode(), adPinId1.hashCode());
        System.assertEquals(adPinId2.hashCode(), adPinId2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdPinId adPinId1 = OASAdPinId.getExample();
        OASAdPinId adPinId2 = OASAdPinId.getExample();
        OASAdPinId adPinId3 = new OASAdPinId();
        OASAdPinId adPinId4 = new OASAdPinId();

        System.assert(adPinId1.equals(adPinId2));
        System.assert(adPinId3.equals(adPinId4));
        System.assertEquals(adPinId1.hashCode(), adPinId2.hashCode());
        System.assertEquals(adPinId3.hashCode(), adPinId4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAdPinId adPinId = new OASAdPinId();
        Map<String, String> x-property-mappings = adPinId.getx-property-mappings();
        System.assertEquals('pinId', x-property-mappings.get('pin_id'));
    }
}
