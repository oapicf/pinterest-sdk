@isTest
private class OASPinsList200ResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASPinsList200Response pinsList200Response1 = OASPinsList200Response.getExample();
        OASPinsList200Response pinsList200Response2 = pinsList200Response1;
        OASPinsList200Response pinsList200Response3 = new OASPinsList200Response();
        OASPinsList200Response pinsList200Response4 = pinsList200Response3;

        System.assert(pinsList200Response1.equals(pinsList200Response2));
        System.assert(pinsList200Response2.equals(pinsList200Response1));
        System.assert(pinsList200Response1.equals(pinsList200Response1));
        System.assert(pinsList200Response3.equals(pinsList200Response4));
        System.assert(pinsList200Response4.equals(pinsList200Response3));
        System.assert(pinsList200Response3.equals(pinsList200Response3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPinsList200Response pinsList200Response1 = OASPinsList200Response.getExample();
        OASPinsList200Response pinsList200Response2 = OASPinsList200Response.getExample();
        OASPinsList200Response pinsList200Response3 = new OASPinsList200Response();
        OASPinsList200Response pinsList200Response4 = new OASPinsList200Response();

        System.assert(pinsList200Response1.equals(pinsList200Response2));
        System.assert(pinsList200Response2.equals(pinsList200Response1));
        System.assert(pinsList200Response3.equals(pinsList200Response4));
        System.assert(pinsList200Response4.equals(pinsList200Response3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPinsList200Response pinsList200Response1 = OASPinsList200Response.getExample();
        OASPinsList200Response pinsList200Response2 = new OASPinsList200Response();

        System.assertEquals(false, pinsList200Response1.equals('foo'));
        System.assertEquals(false, pinsList200Response2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPinsList200Response pinsList200Response1 = OASPinsList200Response.getExample();
        OASPinsList200Response pinsList200Response2 = new OASPinsList200Response();
        OASPinsList200Response pinsList200Response3;

        System.assertEquals(false, pinsList200Response1.equals(pinsList200Response3));
        System.assertEquals(false, pinsList200Response2.equals(pinsList200Response3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPinsList200Response pinsList200Response1 = OASPinsList200Response.getExample();
        OASPinsList200Response pinsList200Response2 = new OASPinsList200Response();

        System.assertEquals(pinsList200Response1.hashCode(), pinsList200Response1.hashCode());
        System.assertEquals(pinsList200Response2.hashCode(), pinsList200Response2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPinsList200Response pinsList200Response1 = OASPinsList200Response.getExample();
        OASPinsList200Response pinsList200Response2 = OASPinsList200Response.getExample();
        OASPinsList200Response pinsList200Response3 = new OASPinsList200Response();
        OASPinsList200Response pinsList200Response4 = new OASPinsList200Response();

        System.assert(pinsList200Response1.equals(pinsList200Response2));
        System.assert(pinsList200Response3.equals(pinsList200Response4));
        System.assertEquals(pinsList200Response1.hashCode(), pinsList200Response2.hashCode());
        System.assertEquals(pinsList200Response3.hashCode(), pinsList200Response4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPinsList200Response pinsList200Response = new OASPinsList200Response();
        System.assertEquals(new List<OASPin>(), pinsList200Response.items);
        System.assertEquals(null, pinsList200Response.bookmark);
    }
}
