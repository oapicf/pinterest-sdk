

/**
 * Specify the entity type to get summary information
 */
export const AdAccountEntityType = {
    Advertiser: 'ADVERTISER',
    Campaign: 'CAMPAIGN',
    AdGroup: 'AD_GROUP',
    Ad: 'AD'
} as const;
export type AdAccountEntityType = typeof AdAccountEntityType[keyof typeof AdAccountEntityType];

