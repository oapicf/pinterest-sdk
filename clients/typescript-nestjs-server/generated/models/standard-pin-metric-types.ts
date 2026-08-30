

/**
 * Standard Pin metric types
 */
export const StandardPinMetricTypes = {
    Impression: 'IMPRESSION',
    OutboundClick: 'OUTBOUND_CLICK',
    PinClick: 'PIN_CLICK',
    Save: 'SAVE',
    SaveRate: 'SAVE_RATE',
    TotalComments: 'TOTAL_COMMENTS',
    TotalReactions: 'TOTAL_REACTIONS',
    UserFollow: 'USER_FOLLOW',
    ProfileVisit: 'PROFILE_VISIT'
} as const;
export type StandardPinMetricTypes = typeof StandardPinMetricTypes[keyof typeof StandardPinMetricTypes];

