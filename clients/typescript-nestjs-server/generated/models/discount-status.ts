

/**
 * Discount status based on the current time and start and end time of discount
 */
export const DiscountStatus = {
    Other: 'OTHER',
    Active: 'ACTIVE',
    Paused: 'PAUSED',
    Scheduled: 'SCHEDULED',
    Expired: 'EXPIRED'
} as const;
export type DiscountStatus = typeof DiscountStatus[keyof typeof DiscountStatus];

