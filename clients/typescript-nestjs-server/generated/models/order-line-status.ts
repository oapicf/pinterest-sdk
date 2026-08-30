

/**
 * Order Line Status
 */
export const OrderLineStatus = {
    Active: 'ACTIVE',
    Paused: 'PAUSED',
    Deleted: 'DELETED'
} as const;
export type OrderLineStatus = typeof OrderLineStatus[keyof typeof OrderLineStatus];

