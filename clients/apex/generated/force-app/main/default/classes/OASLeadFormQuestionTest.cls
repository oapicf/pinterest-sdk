@isTest
private class OASLeadFormQuestionTest {
    @isTest
    private static void equalsSameInstance() {
        OASLeadFormQuestion leadFormQuestion1 = OASLeadFormQuestion.getExample();
        OASLeadFormQuestion leadFormQuestion2 = leadFormQuestion1;
        OASLeadFormQuestion leadFormQuestion3 = new OASLeadFormQuestion();
        OASLeadFormQuestion leadFormQuestion4 = leadFormQuestion3;

        System.assert(leadFormQuestion1.equals(leadFormQuestion2));
        System.assert(leadFormQuestion2.equals(leadFormQuestion1));
        System.assert(leadFormQuestion1.equals(leadFormQuestion1));
        System.assert(leadFormQuestion3.equals(leadFormQuestion4));
        System.assert(leadFormQuestion4.equals(leadFormQuestion3));
        System.assert(leadFormQuestion3.equals(leadFormQuestion3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASLeadFormQuestion leadFormQuestion1 = OASLeadFormQuestion.getExample();
        OASLeadFormQuestion leadFormQuestion2 = OASLeadFormQuestion.getExample();
        OASLeadFormQuestion leadFormQuestion3 = new OASLeadFormQuestion();
        OASLeadFormQuestion leadFormQuestion4 = new OASLeadFormQuestion();

        System.assert(leadFormQuestion1.equals(leadFormQuestion2));
        System.assert(leadFormQuestion2.equals(leadFormQuestion1));
        System.assert(leadFormQuestion3.equals(leadFormQuestion4));
        System.assert(leadFormQuestion4.equals(leadFormQuestion3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASLeadFormQuestion leadFormQuestion1 = OASLeadFormQuestion.getExample();
        OASLeadFormQuestion leadFormQuestion2 = new OASLeadFormQuestion();

        System.assertEquals(false, leadFormQuestion1.equals('foo'));
        System.assertEquals(false, leadFormQuestion2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASLeadFormQuestion leadFormQuestion1 = OASLeadFormQuestion.getExample();
        OASLeadFormQuestion leadFormQuestion2 = new OASLeadFormQuestion();
        OASLeadFormQuestion leadFormQuestion3;

        System.assertEquals(false, leadFormQuestion1.equals(leadFormQuestion3));
        System.assertEquals(false, leadFormQuestion2.equals(leadFormQuestion3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASLeadFormQuestion leadFormQuestion1 = OASLeadFormQuestion.getExample();
        OASLeadFormQuestion leadFormQuestion2 = new OASLeadFormQuestion();

        System.assertEquals(leadFormQuestion1.hashCode(), leadFormQuestion1.hashCode());
        System.assertEquals(leadFormQuestion2.hashCode(), leadFormQuestion2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASLeadFormQuestion leadFormQuestion1 = OASLeadFormQuestion.getExample();
        OASLeadFormQuestion leadFormQuestion2 = OASLeadFormQuestion.getExample();
        OASLeadFormQuestion leadFormQuestion3 = new OASLeadFormQuestion();
        OASLeadFormQuestion leadFormQuestion4 = new OASLeadFormQuestion();

        System.assert(leadFormQuestion1.equals(leadFormQuestion2));
        System.assert(leadFormQuestion3.equals(leadFormQuestion4));
        System.assertEquals(leadFormQuestion1.hashCode(), leadFormQuestion2.hashCode());
        System.assertEquals(leadFormQuestion3.hashCode(), leadFormQuestion4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASLeadFormQuestion leadFormQuestion = new OASLeadFormQuestion();
        Map<String, String> x-property-mappings = leadFormQuestion.getx-property-mappings();
        System.assertEquals('questionType', x-property-mappings.get('question_type'));
        System.assertEquals('customQuestionFieldType', x-property-mappings.get('custom_question_field_type'));
        System.assertEquals('customQuestionLabel', x-property-mappings.get('custom_question_label'));
        System.assertEquals('customQuestionOptions', x-property-mappings.get('custom_question_options'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASLeadFormQuestion leadFormQuestion = new OASLeadFormQuestion();
        System.assertEquals(new List<String>(), leadFormQuestion.customQuestionOptions);
        System.assertEquals(null, leadFormQuestion.questionType);
        System.assertEquals(null, leadFormQuestion.customQuestionFieldType);
        System.assertEquals(null, leadFormQuestion.customQuestionLabel);
    }
}
