

/**
 * Conversion event for which a conversion rate estimate is computed.
 */
export const CampaignPlanningConversionEvent = {
    Signup: 'SIGNUP',
    Checkout: 'CHECKOUT',
    AddToCart: 'ADD_TO_CART',
    Lead: 'LEAD'
} as const;
export type CampaignPlanningConversionEvent = typeof CampaignPlanningConversionEvent[keyof typeof CampaignPlanningConversionEvent];

