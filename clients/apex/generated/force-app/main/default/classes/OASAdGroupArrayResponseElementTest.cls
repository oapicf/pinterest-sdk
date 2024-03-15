@isTest
private class OASAdGroupArrayResponseElementTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdGroupArrayResponseElement adGroupArrayResponseElement1 = OASAdGroupArrayResponseElement.getExample();
        OASAdGroupArrayResponseElement adGroupArrayResponseElement2 = adGroupArrayResponseElement1;
        OASAdGroupArrayResponseElement adGroupArrayResponseElement3 = new OASAdGroupArrayResponseElement();
        OASAdGroupArrayResponseElement adGroupArrayResponseElement4 = adGroupArrayResponseElement3;

        System.assert(adGroupArrayResponseElement1.equals(adGroupArrayResponseElement2));
        System.assert(adGroupArrayResponseElement2.equals(adGroupArrayResponseElement1));
        System.assert(adGroupArrayResponseElement1.equals(adGroupArrayResponseElement1));
        System.assert(adGroupArrayResponseElement3.equals(adGroupArrayResponseElement4));
        System.assert(adGroupArrayResponseElement4.equals(adGroupArrayResponseElement3));
        System.assert(adGroupArrayResponseElement3.equals(adGroupArrayResponseElement3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdGroupArrayResponseElement adGroupArrayResponseElement1 = OASAdGroupArrayResponseElement.getExample();
        OASAdGroupArrayResponseElement adGroupArrayResponseElement2 = OASAdGroupArrayResponseElement.getExample();
        OASAdGroupArrayResponseElement adGroupArrayResponseElement3 = new OASAdGroupArrayResponseElement();
        OASAdGroupArrayResponseElement adGroupArrayResponseElement4 = new OASAdGroupArrayResponseElement();

        System.assert(adGroupArrayResponseElement1.equals(adGroupArrayResponseElement2));
        System.assert(adGroupArrayResponseElement2.equals(adGroupArrayResponseElement1));
        System.assert(adGroupArrayResponseElement3.equals(adGroupArrayResponseElement4));
        System.assert(adGroupArrayResponseElement4.equals(adGroupArrayResponseElement3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdGroupArrayResponseElement adGroupArrayResponseElement1 = OASAdGroupArrayResponseElement.getExample();
        OASAdGroupArrayResponseElement adGroupArrayResponseElement2 = new OASAdGroupArrayResponseElement();

        System.assertEquals(false, adGroupArrayResponseElement1.equals('foo'));
        System.assertEquals(false, adGroupArrayResponseElement2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdGroupArrayResponseElement adGroupArrayResponseElement1 = OASAdGroupArrayResponseElement.getExample();
        OASAdGroupArrayResponseElement adGroupArrayResponseElement2 = new OASAdGroupArrayResponseElement();
        OASAdGroupArrayResponseElement adGroupArrayResponseElement3;

        System.assertEquals(false, adGroupArrayResponseElement1.equals(adGroupArrayResponseElement3));
        System.assertEquals(false, adGroupArrayResponseElement2.equals(adGroupArrayResponseElement3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdGroupArrayResponseElement adGroupArrayResponseElement1 = OASAdGroupArrayResponseElement.getExample();
        OASAdGroupArrayResponseElement adGroupArrayResponseElement2 = new OASAdGroupArrayResponseElement();

        System.assertEquals(adGroupArrayResponseElement1.hashCode(), adGroupArrayResponseElement1.hashCode());
        System.assertEquals(adGroupArrayResponseElement2.hashCode(), adGroupArrayResponseElement2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdGroupArrayResponseElement adGroupArrayResponseElement1 = OASAdGroupArrayResponseElement.getExample();
        OASAdGroupArrayResponseElement adGroupArrayResponseElement2 = OASAdGroupArrayResponseElement.getExample();
        OASAdGroupArrayResponseElement adGroupArrayResponseElement3 = new OASAdGroupArrayResponseElement();
        OASAdGroupArrayResponseElement adGroupArrayResponseElement4 = new OASAdGroupArrayResponseElement();

        System.assert(adGroupArrayResponseElement1.equals(adGroupArrayResponseElement2));
        System.assert(adGroupArrayResponseElement3.equals(adGroupArrayResponseElement4));
        System.assertEquals(adGroupArrayResponseElement1.hashCode(), adGroupArrayResponseElement2.hashCode());
        System.assertEquals(adGroupArrayResponseElement3.hashCode(), adGroupArrayResponseElement4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAdGroupArrayResponseElement adGroupArrayResponseElement = new OASAdGroupArrayResponseElement();
        System.assertEquals(new List<OASException>(), adGroupArrayResponseElement.exceptions);
        System.assertEquals(null, adGroupArrayResponseElement.data);
    }
}
