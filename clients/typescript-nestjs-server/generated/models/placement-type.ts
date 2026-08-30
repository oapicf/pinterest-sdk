

/**
 * Placement type for bid multiplier targeting.
 */
export const PlacementType = {
    Search: 'SEARCH',
    Browse: 'BROWSE',
    RelatedPins: 'RELATED_PINS'
} as const;
export type PlacementType = typeof PlacementType[keyof typeof PlacementType];

