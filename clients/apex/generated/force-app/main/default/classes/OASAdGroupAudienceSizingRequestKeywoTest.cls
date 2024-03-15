@isTest
private class OASAdGroupAudienceSizingRequestKeywoTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdGroupAudienceSizingRequestKeywo adGroupAudienceSizingRequestKeywordsInner1 = OASAdGroupAudienceSizingRequestKeywo.getExample();
        OASAdGroupAudienceSizingRequestKeywo adGroupAudienceSizingRequestKeywordsInner2 = adGroupAudienceSizingRequestKeywordsInner1;
        OASAdGroupAudienceSizingRequestKeywo adGroupAudienceSizingRequestKeywordsInner3 = new OASAdGroupAudienceSizingRequestKeywo();
        OASAdGroupAudienceSizingRequestKeywo adGroupAudienceSizingRequestKeywordsInner4 = adGroupAudienceSizingRequestKeywordsInner3;

        System.assert(adGroupAudienceSizingRequestKeywordsInner1.equals(adGroupAudienceSizingRequestKeywordsInner2));
        System.assert(adGroupAudienceSizingRequestKeywordsInner2.equals(adGroupAudienceSizingRequestKeywordsInner1));
        System.assert(adGroupAudienceSizingRequestKeywordsInner1.equals(adGroupAudienceSizingRequestKeywordsInner1));
        System.assert(adGroupAudienceSizingRequestKeywordsInner3.equals(adGroupAudienceSizingRequestKeywordsInner4));
        System.assert(adGroupAudienceSizingRequestKeywordsInner4.equals(adGroupAudienceSizingRequestKeywordsInner3));
        System.assert(adGroupAudienceSizingRequestKeywordsInner3.equals(adGroupAudienceSizingRequestKeywordsInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdGroupAudienceSizingRequestKeywo adGroupAudienceSizingRequestKeywordsInner1 = OASAdGroupAudienceSizingRequestKeywo.getExample();
        OASAdGroupAudienceSizingRequestKeywo adGroupAudienceSizingRequestKeywordsInner2 = OASAdGroupAudienceSizingRequestKeywo.getExample();
        OASAdGroupAudienceSizingRequestKeywo adGroupAudienceSizingRequestKeywordsInner3 = new OASAdGroupAudienceSizingRequestKeywo();
        OASAdGroupAudienceSizingRequestKeywo adGroupAudienceSizingRequestKeywordsInner4 = new OASAdGroupAudienceSizingRequestKeywo();

        System.assert(adGroupAudienceSizingRequestKeywordsInner1.equals(adGroupAudienceSizingRequestKeywordsInner2));
        System.assert(adGroupAudienceSizingRequestKeywordsInner2.equals(adGroupAudienceSizingRequestKeywordsInner1));
        System.assert(adGroupAudienceSizingRequestKeywordsInner3.equals(adGroupAudienceSizingRequestKeywordsInner4));
        System.assert(adGroupAudienceSizingRequestKeywordsInner4.equals(adGroupAudienceSizingRequestKeywordsInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdGroupAudienceSizingRequestKeywo adGroupAudienceSizingRequestKeywordsInner1 = OASAdGroupAudienceSizingRequestKeywo.getExample();
        OASAdGroupAudienceSizingRequestKeywo adGroupAudienceSizingRequestKeywordsInner2 = new OASAdGroupAudienceSizingRequestKeywo();

        System.assertEquals(false, adGroupAudienceSizingRequestKeywordsInner1.equals('foo'));
        System.assertEquals(false, adGroupAudienceSizingRequestKeywordsInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdGroupAudienceSizingRequestKeywo adGroupAudienceSizingRequestKeywordsInner1 = OASAdGroupAudienceSizingRequestKeywo.getExample();
        OASAdGroupAudienceSizingRequestKeywo adGroupAudienceSizingRequestKeywordsInner2 = new OASAdGroupAudienceSizingRequestKeywo();
        OASAdGroupAudienceSizingRequestKeywo adGroupAudienceSizingRequestKeywordsInner3;

        System.assertEquals(false, adGroupAudienceSizingRequestKeywordsInner1.equals(adGroupAudienceSizingRequestKeywordsInner3));
        System.assertEquals(false, adGroupAudienceSizingRequestKeywordsInner2.equals(adGroupAudienceSizingRequestKeywordsInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdGroupAudienceSizingRequestKeywo adGroupAudienceSizingRequestKeywordsInner1 = OASAdGroupAudienceSizingRequestKeywo.getExample();
        OASAdGroupAudienceSizingRequestKeywo adGroupAudienceSizingRequestKeywordsInner2 = new OASAdGroupAudienceSizingRequestKeywo();

        System.assertEquals(adGroupAudienceSizingRequestKeywordsInner1.hashCode(), adGroupAudienceSizingRequestKeywordsInner1.hashCode());
        System.assertEquals(adGroupAudienceSizingRequestKeywordsInner2.hashCode(), adGroupAudienceSizingRequestKeywordsInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdGroupAudienceSizingRequestKeywo adGroupAudienceSizingRequestKeywordsInner1 = OASAdGroupAudienceSizingRequestKeywo.getExample();
        OASAdGroupAudienceSizingRequestKeywo adGroupAudienceSizingRequestKeywordsInner2 = OASAdGroupAudienceSizingRequestKeywo.getExample();
        OASAdGroupAudienceSizingRequestKeywo adGroupAudienceSizingRequestKeywordsInner3 = new OASAdGroupAudienceSizingRequestKeywo();
        OASAdGroupAudienceSizingRequestKeywo adGroupAudienceSizingRequestKeywordsInner4 = new OASAdGroupAudienceSizingRequestKeywo();

        System.assert(adGroupAudienceSizingRequestKeywordsInner1.equals(adGroupAudienceSizingRequestKeywordsInner2));
        System.assert(adGroupAudienceSizingRequestKeywordsInner3.equals(adGroupAudienceSizingRequestKeywordsInner4));
        System.assertEquals(adGroupAudienceSizingRequestKeywordsInner1.hashCode(), adGroupAudienceSizingRequestKeywordsInner2.hashCode());
        System.assertEquals(adGroupAudienceSizingRequestKeywordsInner3.hashCode(), adGroupAudienceSizingRequestKeywordsInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAdGroupAudienceSizingRequestKeywo adGroupAudienceSizingRequestKeywordsInner = new OASAdGroupAudienceSizingRequestKeywo();
        Map<String, String> x-property-mappings = adGroupAudienceSizingRequestKeywordsInner.getx-property-mappings();
        System.assertEquals('matchType', x-property-mappings.get('match_type'));
    }
}
