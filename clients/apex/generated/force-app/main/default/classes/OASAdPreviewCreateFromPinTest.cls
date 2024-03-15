@isTest
private class OASAdPreviewCreateFromPinTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdPreviewCreateFromPin adPreviewCreateFromPin1 = OASAdPreviewCreateFromPin.getExample();
        OASAdPreviewCreateFromPin adPreviewCreateFromPin2 = adPreviewCreateFromPin1;
        OASAdPreviewCreateFromPin adPreviewCreateFromPin3 = new OASAdPreviewCreateFromPin();
        OASAdPreviewCreateFromPin adPreviewCreateFromPin4 = adPreviewCreateFromPin3;

        System.assert(adPreviewCreateFromPin1.equals(adPreviewCreateFromPin2));
        System.assert(adPreviewCreateFromPin2.equals(adPreviewCreateFromPin1));
        System.assert(adPreviewCreateFromPin1.equals(adPreviewCreateFromPin1));
        System.assert(adPreviewCreateFromPin3.equals(adPreviewCreateFromPin4));
        System.assert(adPreviewCreateFromPin4.equals(adPreviewCreateFromPin3));
        System.assert(adPreviewCreateFromPin3.equals(adPreviewCreateFromPin3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdPreviewCreateFromPin adPreviewCreateFromPin1 = OASAdPreviewCreateFromPin.getExample();
        OASAdPreviewCreateFromPin adPreviewCreateFromPin2 = OASAdPreviewCreateFromPin.getExample();
        OASAdPreviewCreateFromPin adPreviewCreateFromPin3 = new OASAdPreviewCreateFromPin();
        OASAdPreviewCreateFromPin adPreviewCreateFromPin4 = new OASAdPreviewCreateFromPin();

        System.assert(adPreviewCreateFromPin1.equals(adPreviewCreateFromPin2));
        System.assert(adPreviewCreateFromPin2.equals(adPreviewCreateFromPin1));
        System.assert(adPreviewCreateFromPin3.equals(adPreviewCreateFromPin4));
        System.assert(adPreviewCreateFromPin4.equals(adPreviewCreateFromPin3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdPreviewCreateFromPin adPreviewCreateFromPin1 = OASAdPreviewCreateFromPin.getExample();
        OASAdPreviewCreateFromPin adPreviewCreateFromPin2 = new OASAdPreviewCreateFromPin();

        System.assertEquals(false, adPreviewCreateFromPin1.equals('foo'));
        System.assertEquals(false, adPreviewCreateFromPin2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdPreviewCreateFromPin adPreviewCreateFromPin1 = OASAdPreviewCreateFromPin.getExample();
        OASAdPreviewCreateFromPin adPreviewCreateFromPin2 = new OASAdPreviewCreateFromPin();
        OASAdPreviewCreateFromPin adPreviewCreateFromPin3;

        System.assertEquals(false, adPreviewCreateFromPin1.equals(adPreviewCreateFromPin3));
        System.assertEquals(false, adPreviewCreateFromPin2.equals(adPreviewCreateFromPin3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdPreviewCreateFromPin adPreviewCreateFromPin1 = OASAdPreviewCreateFromPin.getExample();
        OASAdPreviewCreateFromPin adPreviewCreateFromPin2 = new OASAdPreviewCreateFromPin();

        System.assertEquals(adPreviewCreateFromPin1.hashCode(), adPreviewCreateFromPin1.hashCode());
        System.assertEquals(adPreviewCreateFromPin2.hashCode(), adPreviewCreateFromPin2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdPreviewCreateFromPin adPreviewCreateFromPin1 = OASAdPreviewCreateFromPin.getExample();
        OASAdPreviewCreateFromPin adPreviewCreateFromPin2 = OASAdPreviewCreateFromPin.getExample();
        OASAdPreviewCreateFromPin adPreviewCreateFromPin3 = new OASAdPreviewCreateFromPin();
        OASAdPreviewCreateFromPin adPreviewCreateFromPin4 = new OASAdPreviewCreateFromPin();

        System.assert(adPreviewCreateFromPin1.equals(adPreviewCreateFromPin2));
        System.assert(adPreviewCreateFromPin3.equals(adPreviewCreateFromPin4));
        System.assertEquals(adPreviewCreateFromPin1.hashCode(), adPreviewCreateFromPin2.hashCode());
        System.assertEquals(adPreviewCreateFromPin3.hashCode(), adPreviewCreateFromPin4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAdPreviewCreateFromPin adPreviewCreateFromPin = new OASAdPreviewCreateFromPin();
        Map<String, String> x-property-mappings = adPreviewCreateFromPin.getx-property-mappings();
        System.assertEquals('pinId', x-property-mappings.get('pin_id'));
    }
}
