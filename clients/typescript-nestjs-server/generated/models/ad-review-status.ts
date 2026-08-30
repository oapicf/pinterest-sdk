

/**
 * Ad review status
 */
export const AdReviewStatus = {
    Other: 'OTHER',
    Pending: 'PENDING',
    Rejected: 'REJECTED',
    Approved: 'APPROVED'
} as const;
export type AdReviewStatus = typeof AdReviewStatus[keyof typeof AdReviewStatus];

