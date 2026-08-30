

/**
 * The current status of an invite or request.
 */
export const InviteStatus = {
    Pending: 'PENDING',
    Accepted: 'ACCEPTED',
    Declined: 'DECLINED',
    Cancelled: 'CANCELLED',
    Expired: 'EXPIRED'
} as const;
export type InviteStatus = typeof InviteStatus[keyof typeof InviteStatus];

