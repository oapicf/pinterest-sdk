@isTest
private class OASGenderBucketTest {
    @isTest
    private static void allowableValues() {
        Set<OASGenderBucket> expected = new Set<OASGenderBucket>{
            OASGenderBucket.MALE,
            OASGenderBucket.FEMALE,
            OASGenderBucket.UNSPECIFIED
        };
        Set<OASGenderBucket> actual  = new Set<OASGenderBucket>(OASGenderBucket.values());
        System.assertEquals(expected, actual);
    }
}
