@isTest
private class OASInterestsEnumTest {
    @isTest
    private static void allowableValues() {
        Set<OASInterestsEnum> expected = new Set<OASInterestsEnum>{
            OASInterestsEnum.ALL,
            OASInterestsEnum.ANIMALS,
            OASInterestsEnum.ARCHITECTURE,
            OASInterestsEnum.ART,
            OASInterestsEnum.BEAUTY,
            OASInterestsEnum.DIY_AND_CRAFTS,
            OASInterestsEnum.EDUCATION,
            OASInterestsEnum.EVENT_PLANNING,
            OASInterestsEnum.FASHION,
            OASInterestsEnum.FOOD_AND_DRINKS,
            OASInterestsEnum.GARDENING,
            OASInterestsEnum.HEALTH,
            OASInterestsEnum.HOME_DECOR,
            OASInterestsEnum.PARENTING,
            OASInterestsEnum.TRAVEL,
            OASInterestsEnum.WEDDING
        };
        Set<OASInterestsEnum> actual  = new Set<OASInterestsEnum>(OASInterestsEnum.values());
        System.assertEquals(expected, actual);
    }
}
