

/**
 * Campaign placement group type
 */
export const AdgroupPlacementGroupType = {
    All: 'ALL',
    Search: 'SEARCH',
    Browse: 'BROWSE',
    Other: 'OTHER'
} as const;
export type AdgroupPlacementGroupType = typeof AdgroupPlacementGroupType[keyof typeof AdgroupPlacementGroupType];

