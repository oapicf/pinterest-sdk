@isTest
private class OASTargetingSpecAgeBucketTest {
    @isTest
    private static void allowableValues() {
        Set<OASTargetingSpecAgeBucket> expected = new Set<OASTargetingSpecAgeBucket>{
            OASTargetingSpecAgeBucket._18_24,
            OASTargetingSpecAgeBucket._19_,
            OASTargetingSpecAgeBucket._20_,
            OASTargetingSpecAgeBucket._21_,
            OASTargetingSpecAgeBucket._25_34,
            OASTargetingSpecAgeBucket._35_44,
            OASTargetingSpecAgeBucket._45_49,
            OASTargetingSpecAgeBucket._50_54,
            OASTargetingSpecAgeBucket._55_64,
            OASTargetingSpecAgeBucket._65_
        };
        Set<OASTargetingSpecAgeBucket> actual  = new Set<OASTargetingSpecAgeBucket>(OASTargetingSpecAgeBucket.values());
        System.assertEquals(expected, actual);
    }
}
