

/**
 * Summary status for pin promotions
 */
export const PinPromotionSummaryStatus = {
    Approved: 'APPROVED',
    Paused: 'PAUSED',
    Pending: 'PENDING',
    Rejected: 'REJECTED',
    AdvertiserDisabled: 'ADVERTISER_DISABLED',
    Archived: 'ARCHIVED',
    Draft: 'DRAFT',
    DeletedDraft: 'DELETED_DRAFT'
} as const;
export type PinPromotionSummaryStatus = typeof PinPromotionSummaryStatus[keyof typeof PinPromotionSummaryStatus];

