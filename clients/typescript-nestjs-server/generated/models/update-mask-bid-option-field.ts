

/**
 * bid option field to apply operation updates to
 */
export const UpdateMaskBidOptionField = {
    Bid: 'BID',
    AppTypeBidMultiplierSet: 'APP_TYPE_BID_MULTIPLIER_SET',
    PlacementBidMultiplierSet: 'PLACEMENT_BID_MULTIPLIER_SET'
} as const;
export type UpdateMaskBidOptionField = typeof UpdateMaskBidOptionField[keyof typeof UpdateMaskBidOptionField];

