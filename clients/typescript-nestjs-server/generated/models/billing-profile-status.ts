

/**
 * Billing profile status
 */
export const BillingProfileStatus = {
    Unspecified: 'UNSPECIFIED',
    Valid: 'VALID',
    Invalid: 'INVALID',
    Pending: 'PENDING',
    Deleted: 'DELETED',
    Secondary: 'SECONDARY',
    PendingSecondary: 'PENDING_SECONDARY'
} as const;
export type BillingProfileStatus = typeof BillingProfileStatus[keyof typeof BillingProfileStatus];

