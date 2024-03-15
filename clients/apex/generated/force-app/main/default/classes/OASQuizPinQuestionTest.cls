@isTest
private class OASQuizPinQuestionTest {
    @isTest
    private static void equalsSameInstance() {
        OASQuizPinQuestion quizPinQuestion1 = OASQuizPinQuestion.getExample();
        OASQuizPinQuestion quizPinQuestion2 = quizPinQuestion1;
        OASQuizPinQuestion quizPinQuestion3 = new OASQuizPinQuestion();
        OASQuizPinQuestion quizPinQuestion4 = quizPinQuestion3;

        System.assert(quizPinQuestion1.equals(quizPinQuestion2));
        System.assert(quizPinQuestion2.equals(quizPinQuestion1));
        System.assert(quizPinQuestion1.equals(quizPinQuestion1));
        System.assert(quizPinQuestion3.equals(quizPinQuestion4));
        System.assert(quizPinQuestion4.equals(quizPinQuestion3));
        System.assert(quizPinQuestion3.equals(quizPinQuestion3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASQuizPinQuestion quizPinQuestion1 = OASQuizPinQuestion.getExample();
        OASQuizPinQuestion quizPinQuestion2 = OASQuizPinQuestion.getExample();
        OASQuizPinQuestion quizPinQuestion3 = new OASQuizPinQuestion();
        OASQuizPinQuestion quizPinQuestion4 = new OASQuizPinQuestion();

        System.assert(quizPinQuestion1.equals(quizPinQuestion2));
        System.assert(quizPinQuestion2.equals(quizPinQuestion1));
        System.assert(quizPinQuestion3.equals(quizPinQuestion4));
        System.assert(quizPinQuestion4.equals(quizPinQuestion3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASQuizPinQuestion quizPinQuestion1 = OASQuizPinQuestion.getExample();
        OASQuizPinQuestion quizPinQuestion2 = new OASQuizPinQuestion();

        System.assertEquals(false, quizPinQuestion1.equals('foo'));
        System.assertEquals(false, quizPinQuestion2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASQuizPinQuestion quizPinQuestion1 = OASQuizPinQuestion.getExample();
        OASQuizPinQuestion quizPinQuestion2 = new OASQuizPinQuestion();
        OASQuizPinQuestion quizPinQuestion3;

        System.assertEquals(false, quizPinQuestion1.equals(quizPinQuestion3));
        System.assertEquals(false, quizPinQuestion2.equals(quizPinQuestion3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASQuizPinQuestion quizPinQuestion1 = OASQuizPinQuestion.getExample();
        OASQuizPinQuestion quizPinQuestion2 = new OASQuizPinQuestion();

        System.assertEquals(quizPinQuestion1.hashCode(), quizPinQuestion1.hashCode());
        System.assertEquals(quizPinQuestion2.hashCode(), quizPinQuestion2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASQuizPinQuestion quizPinQuestion1 = OASQuizPinQuestion.getExample();
        OASQuizPinQuestion quizPinQuestion2 = OASQuizPinQuestion.getExample();
        OASQuizPinQuestion quizPinQuestion3 = new OASQuizPinQuestion();
        OASQuizPinQuestion quizPinQuestion4 = new OASQuizPinQuestion();

        System.assert(quizPinQuestion1.equals(quizPinQuestion2));
        System.assert(quizPinQuestion3.equals(quizPinQuestion4));
        System.assertEquals(quizPinQuestion1.hashCode(), quizPinQuestion2.hashCode());
        System.assertEquals(quizPinQuestion3.hashCode(), quizPinQuestion4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASQuizPinQuestion quizPinQuestion = new OASQuizPinQuestion();
        Map<String, String> x-property-mappings = quizPinQuestion.getx-property-mappings();
        System.assertEquals('questionId', x-property-mappings.get('question_id'));
        System.assertEquals('questionText', x-property-mappings.get('question_text'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASQuizPinQuestion quizPinQuestion = new OASQuizPinQuestion();
        System.assertEquals(new List<OASQuizPinOption>(), quizPinQuestion.options);
        System.assertEquals(null, quizPinQuestion.questionId);
        System.assertEquals(null, quizPinQuestion.questionText);
    }
}
