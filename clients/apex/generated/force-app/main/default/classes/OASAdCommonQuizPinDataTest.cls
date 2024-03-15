@isTest
private class OASAdCommonQuizPinDataTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdCommonQuizPinData adCommonQuizPinData1 = OASAdCommonQuizPinData.getExample();
        OASAdCommonQuizPinData adCommonQuizPinData2 = adCommonQuizPinData1;
        OASAdCommonQuizPinData adCommonQuizPinData3 = new OASAdCommonQuizPinData();
        OASAdCommonQuizPinData adCommonQuizPinData4 = adCommonQuizPinData3;

        System.assert(adCommonQuizPinData1.equals(adCommonQuizPinData2));
        System.assert(adCommonQuizPinData2.equals(adCommonQuizPinData1));
        System.assert(adCommonQuizPinData1.equals(adCommonQuizPinData1));
        System.assert(adCommonQuizPinData3.equals(adCommonQuizPinData4));
        System.assert(adCommonQuizPinData4.equals(adCommonQuizPinData3));
        System.assert(adCommonQuizPinData3.equals(adCommonQuizPinData3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdCommonQuizPinData adCommonQuizPinData1 = OASAdCommonQuizPinData.getExample();
        OASAdCommonQuizPinData adCommonQuizPinData2 = OASAdCommonQuizPinData.getExample();
        OASAdCommonQuizPinData adCommonQuizPinData3 = new OASAdCommonQuizPinData();
        OASAdCommonQuizPinData adCommonQuizPinData4 = new OASAdCommonQuizPinData();

        System.assert(adCommonQuizPinData1.equals(adCommonQuizPinData2));
        System.assert(adCommonQuizPinData2.equals(adCommonQuizPinData1));
        System.assert(adCommonQuizPinData3.equals(adCommonQuizPinData4));
        System.assert(adCommonQuizPinData4.equals(adCommonQuizPinData3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdCommonQuizPinData adCommonQuizPinData1 = OASAdCommonQuizPinData.getExample();
        OASAdCommonQuizPinData adCommonQuizPinData2 = new OASAdCommonQuizPinData();

        System.assertEquals(false, adCommonQuizPinData1.equals('foo'));
        System.assertEquals(false, adCommonQuizPinData2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdCommonQuizPinData adCommonQuizPinData1 = OASAdCommonQuizPinData.getExample();
        OASAdCommonQuizPinData adCommonQuizPinData2 = new OASAdCommonQuizPinData();
        OASAdCommonQuizPinData adCommonQuizPinData3;

        System.assertEquals(false, adCommonQuizPinData1.equals(adCommonQuizPinData3));
        System.assertEquals(false, adCommonQuizPinData2.equals(adCommonQuizPinData3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdCommonQuizPinData adCommonQuizPinData1 = OASAdCommonQuizPinData.getExample();
        OASAdCommonQuizPinData adCommonQuizPinData2 = new OASAdCommonQuizPinData();

        System.assertEquals(adCommonQuizPinData1.hashCode(), adCommonQuizPinData1.hashCode());
        System.assertEquals(adCommonQuizPinData2.hashCode(), adCommonQuizPinData2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdCommonQuizPinData adCommonQuizPinData1 = OASAdCommonQuizPinData.getExample();
        OASAdCommonQuizPinData adCommonQuizPinData2 = OASAdCommonQuizPinData.getExample();
        OASAdCommonQuizPinData adCommonQuizPinData3 = new OASAdCommonQuizPinData();
        OASAdCommonQuizPinData adCommonQuizPinData4 = new OASAdCommonQuizPinData();

        System.assert(adCommonQuizPinData1.equals(adCommonQuizPinData2));
        System.assert(adCommonQuizPinData3.equals(adCommonQuizPinData4));
        System.assertEquals(adCommonQuizPinData1.hashCode(), adCommonQuizPinData2.hashCode());
        System.assertEquals(adCommonQuizPinData3.hashCode(), adCommonQuizPinData4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAdCommonQuizPinData adCommonQuizPinData = new OASAdCommonQuizPinData();
        System.assertEquals(new List<OASQuizPinQuestion>(), adCommonQuizPinData.questions);
        System.assertEquals(new List<OASQuizPinResult>(), adCommonQuizPinData.results);
    }
}
