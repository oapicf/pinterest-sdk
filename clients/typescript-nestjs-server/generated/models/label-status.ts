

/**
 * Label status values.
 */
export const LabelStatus = {
    Active: 'ACTIVE',
    Archived: 'ARCHIVED'
} as const;
export type LabelStatus = typeof LabelStatus[keyof typeof LabelStatus];

