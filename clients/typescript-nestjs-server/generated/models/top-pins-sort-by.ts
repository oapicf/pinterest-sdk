

/**
 * Sort metric for top pins analytics.
 */
export const TopPinsSortBy = {
    Engagement: 'ENGAGEMENT',
    Save: 'SAVE',
    Impression: 'IMPRESSION',
    OutboundClick: 'OUTBOUND_CLICK',
    PinClick: 'PIN_CLICK'
} as const;
export type TopPinsSortBy = typeof TopPinsSortBy[keyof typeof TopPinsSortBy];

