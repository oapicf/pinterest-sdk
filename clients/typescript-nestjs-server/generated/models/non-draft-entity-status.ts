

/**
 * Entity status
 */
export const NonDraftEntityStatus = {
    Active: 'ACTIVE',
    Paused: 'PAUSED',
    Archived: 'ARCHIVED'
} as const;
export type NonDraftEntityStatus = typeof NonDraftEntityStatus[keyof typeof NonDraftEntityStatus];

