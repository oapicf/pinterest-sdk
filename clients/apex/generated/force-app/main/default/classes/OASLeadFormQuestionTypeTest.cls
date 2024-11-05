@isTest
private class OASLeadFormQuestionTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASLeadFormQuestionType> expected = new Set<OASLeadFormQuestionType>{
            OASLeadFormQuestionType.CUSTOM,
            OASLeadFormQuestionType.FULL_NAME,
            OASLeadFormQuestionType.FIRST_NAME,
            OASLeadFormQuestionType.LAST_NAME,
            OASLeadFormQuestionType.EMAIL,
            OASLeadFormQuestionType.PHONE_NUMBER,
            OASLeadFormQuestionType.ZIP_CODE,
            OASLeadFormQuestionType.GENDER,
            OASLeadFormQuestionType.CITY,
            OASLeadFormQuestionType.COUNTRY,
            OASLeadFormQuestionType.STATE_PROVINCE,
            OASLeadFormQuestionType.ADDRESS,
            OASLeadFormQuestionType.DATE_OF_BIRTH,
            OASLeadFormQuestionType.AGE
        };
        Set<OASLeadFormQuestionType> actual  = new Set<OASLeadFormQuestionType>(OASLeadFormQuestionType.values());
        System.assertEquals(expected, actual);
    }
}
