@isTest
private class OASAdArrayResponseElementTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdArrayResponseElement adArrayResponseElement1 = OASAdArrayResponseElement.getExample();
        OASAdArrayResponseElement adArrayResponseElement2 = adArrayResponseElement1;
        OASAdArrayResponseElement adArrayResponseElement3 = new OASAdArrayResponseElement();
        OASAdArrayResponseElement adArrayResponseElement4 = adArrayResponseElement3;

        System.assert(adArrayResponseElement1.equals(adArrayResponseElement2));
        System.assert(adArrayResponseElement2.equals(adArrayResponseElement1));
        System.assert(adArrayResponseElement1.equals(adArrayResponseElement1));
        System.assert(adArrayResponseElement3.equals(adArrayResponseElement4));
        System.assert(adArrayResponseElement4.equals(adArrayResponseElement3));
        System.assert(adArrayResponseElement3.equals(adArrayResponseElement3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdArrayResponseElement adArrayResponseElement1 = OASAdArrayResponseElement.getExample();
        OASAdArrayResponseElement adArrayResponseElement2 = OASAdArrayResponseElement.getExample();
        OASAdArrayResponseElement adArrayResponseElement3 = new OASAdArrayResponseElement();
        OASAdArrayResponseElement adArrayResponseElement4 = new OASAdArrayResponseElement();

        System.assert(adArrayResponseElement1.equals(adArrayResponseElement2));
        System.assert(adArrayResponseElement2.equals(adArrayResponseElement1));
        System.assert(adArrayResponseElement3.equals(adArrayResponseElement4));
        System.assert(adArrayResponseElement4.equals(adArrayResponseElement3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdArrayResponseElement adArrayResponseElement1 = OASAdArrayResponseElement.getExample();
        OASAdArrayResponseElement adArrayResponseElement2 = new OASAdArrayResponseElement();

        System.assertEquals(false, adArrayResponseElement1.equals('foo'));
        System.assertEquals(false, adArrayResponseElement2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdArrayResponseElement adArrayResponseElement1 = OASAdArrayResponseElement.getExample();
        OASAdArrayResponseElement adArrayResponseElement2 = new OASAdArrayResponseElement();
        OASAdArrayResponseElement adArrayResponseElement3;

        System.assertEquals(false, adArrayResponseElement1.equals(adArrayResponseElement3));
        System.assertEquals(false, adArrayResponseElement2.equals(adArrayResponseElement3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdArrayResponseElement adArrayResponseElement1 = OASAdArrayResponseElement.getExample();
        OASAdArrayResponseElement adArrayResponseElement2 = new OASAdArrayResponseElement();

        System.assertEquals(adArrayResponseElement1.hashCode(), adArrayResponseElement1.hashCode());
        System.assertEquals(adArrayResponseElement2.hashCode(), adArrayResponseElement2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdArrayResponseElement adArrayResponseElement1 = OASAdArrayResponseElement.getExample();
        OASAdArrayResponseElement adArrayResponseElement2 = OASAdArrayResponseElement.getExample();
        OASAdArrayResponseElement adArrayResponseElement3 = new OASAdArrayResponseElement();
        OASAdArrayResponseElement adArrayResponseElement4 = new OASAdArrayResponseElement();

        System.assert(adArrayResponseElement1.equals(adArrayResponseElement2));
        System.assert(adArrayResponseElement3.equals(adArrayResponseElement4));
        System.assertEquals(adArrayResponseElement1.hashCode(), adArrayResponseElement2.hashCode());
        System.assertEquals(adArrayResponseElement3.hashCode(), adArrayResponseElement4.hashCode());
    }
}
