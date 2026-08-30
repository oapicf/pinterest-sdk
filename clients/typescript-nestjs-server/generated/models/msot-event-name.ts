

/**
 * Type of user conversion event.
 */
export const MsotEventName = {
    AddToCart: 'add_to_cart',
    Checkout: 'checkout',
    Lead: 'lead',
    Signup: 'signup'
} as const;
export type MsotEventName = typeof MsotEventName[keyof typeof MsotEventName];

