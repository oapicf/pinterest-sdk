@isTest
private class OASAudienceDataPartyTest {
    @isTest
    private static void allowableValues() {
        Set<OASAudienceDataParty> expected = new Set<OASAudienceDataParty>{
            OASAudienceDataParty._1P,
            OASAudienceDataParty._3P
        };
        Set<OASAudienceDataParty> actual  = new Set<OASAudienceDataParty>(OASAudienceDataParty.values());
        System.assertEquals(expected, actual);
    }
}
