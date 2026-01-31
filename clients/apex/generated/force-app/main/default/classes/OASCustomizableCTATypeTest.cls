@isTest
private class OASCustomizableCTATypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASCustomizableCTAType> expected = new Set<OASCustomizableCTAType>{
            OASCustomizableCTAType.GET_OFFER,
            OASCustomizableCTAType.LEARN_MORE,
            OASCustomizableCTAType.ORDER_NOW,
            OASCustomizableCTAType.SHOP_NOW,
            OASCustomizableCTAType.SIGN_UP,
            OASCustomizableCTAType.SUBSCRIBE,
            OASCustomizableCTAType.BUY_NOW,
            OASCustomizableCTAType.CONTACT_US,
            OASCustomizableCTAType.GET_QUOTE,
            OASCustomizableCTAType.VISIT_SITE,
            OASCustomizableCTAType.APPLY_NOW,
            OASCustomizableCTAType.BOOK_NOW,
            OASCustomizableCTAType.REQUEST_DEMO,
            OASCustomizableCTAType.REGISTER_NOW,
            OASCustomizableCTAType.FIND_A_DEALER,
            OASCustomizableCTAType.ADD_TO_CART,
            OASCustomizableCTAType.WATCH_NOW,
            OASCustomizableCTAType.READ_MORE,
            OASCustomizableCTAType.BUY_TICKETS,
            OASCustomizableCTAType.DONATE_NOW,
            OASCustomizableCTAType.DOWNLOAD,
            OASCustomizableCTAType.EXPLORE_MORE,
            OASCustomizableCTAType.FIND_A_LOCATION,
            OASCustomizableCTAType.GET_DEAL,
            OASCustomizableCTAType.GET_RECIPE,
            OASCustomizableCTAType.GET_SHOWTIMES,
            OASCustomizableCTAType.ON_SALE,
            OASCustomizableCTAType.PLAY_GAME,
            OASCustomizableCTAType.TRY_IT
        };
        Set<OASCustomizableCTAType> actual  = new Set<OASCustomizableCTAType>(OASCustomizableCTAType.values());
        System.assertEquals(expected, actual);
    }
}
