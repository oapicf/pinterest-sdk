

/**
 * Audience operation type (update or remove).
 */
export const AudienceUpdateOperationType = {
    Update: 'UPDATE',
    Remove: 'REMOVE'
} as const;
export type AudienceUpdateOperationType = typeof AudienceUpdateOperationType[keyof typeof AudienceUpdateOperationType];

