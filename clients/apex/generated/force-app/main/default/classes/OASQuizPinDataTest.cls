@isTest
private class OASQuizPinDataTest {
    @isTest
    private static void equalsSameInstance() {
        OASQuizPinData quizPinData1 = OASQuizPinData.getExample();
        OASQuizPinData quizPinData2 = quizPinData1;
        OASQuizPinData quizPinData3 = new OASQuizPinData();
        OASQuizPinData quizPinData4 = quizPinData3;

        System.assert(quizPinData1.equals(quizPinData2));
        System.assert(quizPinData2.equals(quizPinData1));
        System.assert(quizPinData1.equals(quizPinData1));
        System.assert(quizPinData3.equals(quizPinData4));
        System.assert(quizPinData4.equals(quizPinData3));
        System.assert(quizPinData3.equals(quizPinData3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASQuizPinData quizPinData1 = OASQuizPinData.getExample();
        OASQuizPinData quizPinData2 = OASQuizPinData.getExample();
        OASQuizPinData quizPinData3 = new OASQuizPinData();
        OASQuizPinData quizPinData4 = new OASQuizPinData();

        System.assert(quizPinData1.equals(quizPinData2));
        System.assert(quizPinData2.equals(quizPinData1));
        System.assert(quizPinData3.equals(quizPinData4));
        System.assert(quizPinData4.equals(quizPinData3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASQuizPinData quizPinData1 = OASQuizPinData.getExample();
        OASQuizPinData quizPinData2 = new OASQuizPinData();

        System.assertEquals(false, quizPinData1.equals('foo'));
        System.assertEquals(false, quizPinData2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASQuizPinData quizPinData1 = OASQuizPinData.getExample();
        OASQuizPinData quizPinData2 = new OASQuizPinData();
        OASQuizPinData quizPinData3;

        System.assertEquals(false, quizPinData1.equals(quizPinData3));
        System.assertEquals(false, quizPinData2.equals(quizPinData3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASQuizPinData quizPinData1 = OASQuizPinData.getExample();
        OASQuizPinData quizPinData2 = new OASQuizPinData();

        System.assertEquals(quizPinData1.hashCode(), quizPinData1.hashCode());
        System.assertEquals(quizPinData2.hashCode(), quizPinData2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASQuizPinData quizPinData1 = OASQuizPinData.getExample();
        OASQuizPinData quizPinData2 = OASQuizPinData.getExample();
        OASQuizPinData quizPinData3 = new OASQuizPinData();
        OASQuizPinData quizPinData4 = new OASQuizPinData();

        System.assert(quizPinData1.equals(quizPinData2));
        System.assert(quizPinData3.equals(quizPinData4));
        System.assertEquals(quizPinData1.hashCode(), quizPinData2.hashCode());
        System.assertEquals(quizPinData3.hashCode(), quizPinData4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASQuizPinData quizPinData = new OASQuizPinData();
        Map<String, String> x-property-mappings = quizPinData.getx-property-mappings();
        System.assertEquals('tieBreakerType', x-property-mappings.get('tie_breaker_type'));
        System.assertEquals('tieBreakerCustomResult', x-property-mappings.get('tie_breaker_custom_result'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASQuizPinData quizPinData = new OASQuizPinData();
        System.assertEquals(new List<OASQuizPinQuestion>(), quizPinData.questions);
        System.assertEquals(new List<OASQuizPinResult>(), quizPinData.results);
        System.assertEquals(null, quizPinData.tieBreakerType);
        System.assertEquals(null, quizPinData.tieBreakerCustomResult);
    }
}
