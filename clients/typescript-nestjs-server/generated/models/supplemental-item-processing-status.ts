

/**
 * The status of the item processing record
 */
export const SupplementalItemProcessingStatus = {
    Success: 'SUCCESS',
    Failure: 'FAILURE',
    Processing: 'PROCESSING'
} as const;
export type SupplementalItemProcessingStatus = typeof SupplementalItemProcessingStatus[keyof typeof SupplementalItemProcessingStatus];

