

/**
 * The new status you want to give the label, either `ACTIVE` (in use) or no longer in use (`ARCHIVED`).
 */
export const NullableLabelStatus = {
    Active: 'ACTIVE',
    Archived: 'ARCHIVED'
} as const;
export type NullableLabelStatus = typeof NullableLabelStatus[keyof typeof NullableLabelStatus];

