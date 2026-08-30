

/**
 * Entity status
 */
export const NullableEntityStatus = {
    Active: 'ACTIVE',
    Paused: 'PAUSED',
    Archived: 'ARCHIVED',
    Draft: 'DRAFT',
    DeletedDraft: 'DELETED_DRAFT'
} as const;
export type NullableEntityStatus = typeof NullableEntityStatus[keyof typeof NullableEntityStatus];

