@isTest
private class OASLeadFormQuestionFieldTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASLeadFormQuestionFieldType> expected = new Set<OASLeadFormQuestionFieldType>{
            OASLeadFormQuestionFieldType.TEXT_FIELD,
            OASLeadFormQuestionFieldType.TEXT_AREA,
            OASLeadFormQuestionFieldType.RADIO_LIST,
            OASLeadFormQuestionFieldType.CHECKBOX
        };
        Set<OASLeadFormQuestionFieldType> actual  = new Set<OASLeadFormQuestionFieldType>(OASLeadFormQuestionFieldType.values());
        System.assertEquals(expected, actual);
    }
}
