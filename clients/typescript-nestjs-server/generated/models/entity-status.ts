

/**
 * Entity status
 */
export const EntityStatus = {
    Active: 'ACTIVE',
    Paused: 'PAUSED',
    Archived: 'ARCHIVED',
    Draft: 'DRAFT',
    DeletedDraft: 'DELETED_DRAFT'
} as const;
export type EntityStatus = typeof EntityStatus[keyof typeof EntityStatus];

