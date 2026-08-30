

/**
 * The status of the batch operation
 */
export const SupplementalItemBatchOperationStatus = {
    Processing: 'PROCESSING',
    Completed: 'COMPLETED',
    Failed: 'FAILED'
} as const;
export type SupplementalItemBatchOperationStatus = typeof SupplementalItemBatchOperationStatus[keyof typeof SupplementalItemBatchOperationStatus];

