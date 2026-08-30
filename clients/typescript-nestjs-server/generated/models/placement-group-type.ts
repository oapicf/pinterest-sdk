

/**
 * Campaign placement group type
 */
export const PlacementGroupType = {
    All: 'ALL',
    Search: 'SEARCH',
    Browse: 'BROWSE',
    Other: 'OTHER'
} as const;
export type PlacementGroupType = typeof PlacementGroupType[keyof typeof PlacementGroupType];

