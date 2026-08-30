

/**
 * Conversion tag type
 */
export const ConversionTagTypeOptimal = {
    PageLoad: 'PAGE_LOAD',
    Unknown: 'UNKNOWN',
    Initialized: 'INITIALIZED',
    PageVisit: 'PAGE_VISIT',
    Signup: 'SIGNUP',
    Checkout: 'CHECKOUT',
    Custom: 'CUSTOM',
    ViewCategory: 'VIEW_CATEGORY',
    Search: 'SEARCH',
    AddToCart: 'ADD_TO_CART',
    WatchVideo: 'WATCH_VIDEO',
    Lead: 'LEAD',
    AppInstall: 'APP_INSTALL',
    WebSession: 'WEB_SESSION',
    ExternalMeasurement: 'EXTERNAL_MEASUREMENT',
    AddPaymentInfo: 'ADD_PAYMENT_INFO',
    AddToWishlist: 'ADD_TO_WISHLIST',
    InitiateCheckout: 'INITIATE_CHECKOUT',
    Subscribe: 'SUBSCRIBE',
    ViewContent: 'VIEW_CONTENT',
    AdvertiserDefinedEvent: 'ADVERTISER_DEFINED_EVENT',
    AppOpen: 'APP_OPEN',
    Contact: 'CONTACT',
    Schedule: 'SCHEDULE',
    FindLocation: 'FIND_LOCATION',
    CustomizeProduct: 'CUSTOMIZE_PRODUCT',
    SubmitApplication: 'SUBMIT_APPLICATION',
    StartTrial: 'START_TRIAL'
} as const;
export type ConversionTagTypeOptimal = typeof ConversionTagTypeOptimal[keyof typeof ConversionTagTypeOptimal];

