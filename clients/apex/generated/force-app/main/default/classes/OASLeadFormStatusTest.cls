@isTest
private class OASLeadFormStatusTest {
    @isTest
    private static void allowableValues() {
        Set<OASLeadFormStatus> expected = new Set<OASLeadFormStatus>{
            OASLeadFormStatus.DRAFT,
            OASLeadFormStatus.ACTIVE
        };
        Set<OASLeadFormStatus> actual  = new Set<OASLeadFormStatus>(OASLeadFormStatus.values());
        System.assertEquals(expected, actual);
    }
}
