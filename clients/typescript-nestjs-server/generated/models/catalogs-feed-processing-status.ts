

export const CatalogsFeedProcessingStatus = {
    Completed: 'COMPLETED',
    Failed: 'FAILED',
    Processing: 'PROCESSING'
} as const;
export type CatalogsFeedProcessingStatus = typeof CatalogsFeedProcessingStatus[keyof typeof CatalogsFeedProcessingStatus];

