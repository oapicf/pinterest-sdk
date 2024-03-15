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
            OASLeadFormQuestionType.AGE,
            OASLeadFormQuestionType.GENDER,
            OASLeadFormQuestionType.CITY,
            OASLeadFormQuestionType.COUNTRY,
            OASLeadFormQuestionType.PREFERRED_CONTACT_METHOD,
            OASLeadFormQuestionType.STATE_PROVINCE,
            OASLeadFormQuestionType.ADDRESS,
            OASLeadFormQuestionType.DATE_OF_BIRTH
        };
        Set<OASLeadFormQuestionType> actual  = new Set<OASLeadFormQuestionType>(OASLeadFormQuestionType.values());
        System.assertEquals(expected, actual);
    }
}
