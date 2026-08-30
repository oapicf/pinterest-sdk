

/**
 * Possible status for a bulk reporting job
 */
export const BulkReportingJobStatus = {
    DoesNotExist: 'DOES_NOT_EXIST',
    Finished: 'FINISHED',
    InProgress: 'IN_PROGRESS',
    Expired: 'EXPIRED',
    Failed: 'FAILED',
    Cancelled: 'CANCELLED'
} as const;
export type BulkReportingJobStatus = typeof BulkReportingJobStatus[keyof typeof BulkReportingJobStatus];

