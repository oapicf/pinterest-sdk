@isTest
private class OASDisclosureTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASDisclosureType> expected = new Set<OASDisclosureType>{
            OASDisclosureType.NO_DISCLOSURE,
            OASDisclosureType.PRESCRIBING_INFORMATION,
            OASDisclosureType.PRESCRIBING_INFORMATION_BOX_WARNING,
            OASDisclosureType.IMPORTANT_SAFETY_INFO,
            OASDisclosureType.MED_GUIDE,
            OASDisclosureType.PATIENT_INFORMATION
        };
        Set<OASDisclosureType> actual  = new Set<OASDisclosureType>(OASDisclosureType.values());
        System.assertEquals(expected, actual);
    }
}
