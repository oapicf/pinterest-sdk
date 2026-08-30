

/**
 * Represents the status of the conversion deletion request. \"PENDING\" or \"SUBMITTED\". \"PENDING\" meaning the Advertiser can cancel the request. The advertiser has a 7 day time window after the conversion deletion request was submitted to cancel it. \"SUBMITTED\" meaning that the Data Deletion process has begun and can no longer be canceled.
 */
export const ConversionDeletionRequestStatus = {
    Pending: 'PENDING',
    Submitted: 'SUBMITTED',
    Cancelled: 'CANCELLED'
} as const;
export type ConversionDeletionRequestStatus = typeof ConversionDeletionRequestStatus[keyof typeof ConversionDeletionRequestStatus];

