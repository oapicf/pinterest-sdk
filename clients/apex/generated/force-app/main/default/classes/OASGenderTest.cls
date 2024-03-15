@isTest
private class OASGenderTest {
    @isTest
    private static void allowableValues() {
        Set<OASGender> expected = new Set<OASGender>{
            OASGender.FEMALE,
            OASGender.MALE,
            OASGender.UNISEX
        };
        Set<OASGender> actual  = new Set<OASGender>(OASGender.values());
        System.assertEquals(expected, actual);
    }
}
