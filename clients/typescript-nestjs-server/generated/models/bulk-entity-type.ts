

/**
 * Refers ads entity type.
 */
export const BulkEntityType = {
    Campaign: 'CAMPAIGN',
    AdGroup: 'AD_GROUP',
    ProductGroup: 'PRODUCT_GROUP',
    Ad: 'AD',
    Keyword: 'KEYWORD',
    Label: 'LABEL',
    Schedule: 'SCHEDULE',
    EntityHistory: 'ENTITY_HISTORY'
} as const;
export type BulkEntityType = typeof BulkEntityType[keyof typeof BulkEntityType];

