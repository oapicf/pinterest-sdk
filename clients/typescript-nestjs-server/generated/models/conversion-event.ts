

export const ConversionEvent = {
    PageVisit: 'PAGE_VISIT',
    Signup: 'SIGNUP',
    Checkout: 'CHECKOUT',
    Custom: 'CUSTOM',
    ViewCategory: 'VIEW_CATEGORY',
    Search: 'SEARCH',
    AddToCart: 'ADD_TO_CART',
    WatchVideo: 'WATCH_VIDEO',
    Lead: 'LEAD',
    AppInstall: 'APP_INSTALL'
} as const;
export type ConversionEvent = typeof ConversionEvent[keyof typeof ConversionEvent];

