

/**
 * Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_SITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only)
 */
export const CustomizableCTAType = {
    GetOffer: 'GET_OFFER',
    LearnMore: 'LEARN_MORE',
    OrderNow: 'ORDER_NOW',
    ShopNow: 'SHOP_NOW',
    SignUp: 'SIGN_UP',
    Subscribe: 'SUBSCRIBE',
    BuyNow: 'BUY_NOW',
    ContactUs: 'CONTACT_US',
    GetQuote: 'GET_QUOTE',
    VisitSite: 'VISIT_SITE',
    ApplyNow: 'APPLY_NOW',
    BookNow: 'BOOK_NOW',
    RequestDemo: 'REQUEST_DEMO',
    RegisterNow: 'REGISTER_NOW',
    FindADealer: 'FIND_A_DEALER',
    AddToCart: 'ADD_TO_CART',
    WatchNow: 'WATCH_NOW',
    ReadMore: 'READ_MORE',
    BuyTickets: 'BUY_TICKETS',
    DonateNow: 'DONATE_NOW',
    Download: 'DOWNLOAD',
    ExploreMore: 'EXPLORE_MORE',
    FindALocation: 'FIND_A_LOCATION',
    FindRetailers: 'FIND_RETAILERS',
    GetDeal: 'GET_DEAL',
    GetRecipe: 'GET_RECIPE',
    GetShowtimes: 'GET_SHOWTIMES',
    OnSale: 'ON_SALE',
    PlayGame: 'PLAY_GAME',
    TryIt: 'TRY_IT',
    TakeAPeek: 'TAKE_A_PEEK'
} as const;
export type CustomizableCTAType = typeof CustomizableCTAType[keyof typeof CustomizableCTAType];

