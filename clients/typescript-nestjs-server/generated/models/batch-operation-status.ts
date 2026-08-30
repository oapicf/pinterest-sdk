

/**
 * The status of the operation performed by the batch
 */
export const BatchOperationStatus = {
    Processing: 'PROCESSING',
    Completed: 'COMPLETED',
    Failed: 'FAILED'
} as const;
export type BatchOperationStatus = typeof BatchOperationStatus[keyof typeof BatchOperationStatus];

