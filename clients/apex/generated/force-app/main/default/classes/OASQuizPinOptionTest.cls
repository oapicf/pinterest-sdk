@isTest
private class OASQuizPinOptionTest {
    @isTest
    private static void equalsSameInstance() {
        OASQuizPinOption quizPinOption1 = OASQuizPinOption.getExample();
        OASQuizPinOption quizPinOption2 = quizPinOption1;
        OASQuizPinOption quizPinOption3 = new OASQuizPinOption();
        OASQuizPinOption quizPinOption4 = quizPinOption3;

        System.assert(quizPinOption1.equals(quizPinOption2));
        System.assert(quizPinOption2.equals(quizPinOption1));
        System.assert(quizPinOption1.equals(quizPinOption1));
        System.assert(quizPinOption3.equals(quizPinOption4));
        System.assert(quizPinOption4.equals(quizPinOption3));
        System.assert(quizPinOption3.equals(quizPinOption3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASQuizPinOption quizPinOption1 = OASQuizPinOption.getExample();
        OASQuizPinOption quizPinOption2 = OASQuizPinOption.getExample();
        OASQuizPinOption quizPinOption3 = new OASQuizPinOption();
        OASQuizPinOption quizPinOption4 = new OASQuizPinOption();

        System.assert(quizPinOption1.equals(quizPinOption2));
        System.assert(quizPinOption2.equals(quizPinOption1));
        System.assert(quizPinOption3.equals(quizPinOption4));
        System.assert(quizPinOption4.equals(quizPinOption3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASQuizPinOption quizPinOption1 = OASQuizPinOption.getExample();
        OASQuizPinOption quizPinOption2 = new OASQuizPinOption();

        System.assertEquals(false, quizPinOption1.equals('foo'));
        System.assertEquals(false, quizPinOption2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASQuizPinOption quizPinOption1 = OASQuizPinOption.getExample();
        OASQuizPinOption quizPinOption2 = new OASQuizPinOption();
        OASQuizPinOption quizPinOption3;

        System.assertEquals(false, quizPinOption1.equals(quizPinOption3));
        System.assertEquals(false, quizPinOption2.equals(quizPinOption3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASQuizPinOption quizPinOption1 = OASQuizPinOption.getExample();
        OASQuizPinOption quizPinOption2 = new OASQuizPinOption();

        System.assertEquals(quizPinOption1.hashCode(), quizPinOption1.hashCode());
        System.assertEquals(quizPinOption2.hashCode(), quizPinOption2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASQuizPinOption quizPinOption1 = OASQuizPinOption.getExample();
        OASQuizPinOption quizPinOption2 = OASQuizPinOption.getExample();
        OASQuizPinOption quizPinOption3 = new OASQuizPinOption();
        OASQuizPinOption quizPinOption4 = new OASQuizPinOption();

        System.assert(quizPinOption1.equals(quizPinOption2));
        System.assert(quizPinOption3.equals(quizPinOption4));
        System.assertEquals(quizPinOption1.hashCode(), quizPinOption2.hashCode());
        System.assertEquals(quizPinOption3.hashCode(), quizPinOption4.hashCode());
    }
}
