

/**
 * Status for catalogs entities. Present in catalogs_feed values. When a feed is deleted, the response will inform DELETED as status.
 */
export const CatalogsStatus = {
    Active: 'ACTIVE',
    Inactive: 'INACTIVE'
} as const;
export type CatalogsStatus = typeof CatalogsStatus[keyof typeof CatalogsStatus];

