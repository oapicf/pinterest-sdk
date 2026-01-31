@isTest
private class OASTargetingSpecGenderTest {
    @isTest
    private static void allowableValues() {
        Set<OASTargetingSpecGender> expected = new Set<OASTargetingSpecGender>{
            OASTargetingSpecGender.UNKNOWN,
            OASTargetingSpecGender.MALE,
            OASTargetingSpecGender.FEMALE
        };
        Set<OASTargetingSpecGender> actual  = new Set<OASTargetingSpecGender>(OASTargetingSpecGender.values());
        System.assertEquals(expected, actual);
    }
}
