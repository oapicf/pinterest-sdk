

/**
 * Bulk request status
 */
export const BulkRequestStatus = {
    Running: 'RUNNING',
    Succeeded: 'SUCCEEDED',
    Failed: 'FAILED'
} as const;
export type BulkRequestStatus = typeof BulkRequestStatus[keyof typeof BulkRequestStatus];

