

/**
 * The status of the item processing record
 */
export const ItemProcessingStatus = {
    Success: 'SUCCESS',
    Failure: 'FAILURE',
    Processing: 'PROCESSING'
} as const;
export type ItemProcessingStatus = typeof ItemProcessingStatus[keyof typeof ItemProcessingStatus];

