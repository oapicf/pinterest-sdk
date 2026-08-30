

/**
 * Filter audiences by ownership type.
 */
export const AudienceOwnershipType = {
    Owned: 'OWNED',
    Received: 'RECEIVED'
} as const;
export type AudienceOwnershipType = typeof AudienceOwnershipType[keyof typeof AudienceOwnershipType];

