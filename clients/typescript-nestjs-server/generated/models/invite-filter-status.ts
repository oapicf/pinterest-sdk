

/**
 * Invite statuses used for filters.
 */
export const InviteFilterStatus = {
    Pending: 'PENDING',
    Expired: 'EXPIRED'
} as const;
export type InviteFilterStatus = typeof InviteFilterStatus[keyof typeof InviteFilterStatus];

