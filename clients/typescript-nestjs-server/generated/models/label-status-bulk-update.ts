

/**
 * Set status to `ARCHIVED` to remove the label from the parent entity.
 */
export const LabelStatusBulkUpdate = {
    Archived: 'ARCHIVED'
} as const;
export type LabelStatusBulkUpdate = typeof LabelStatusBulkUpdate[keyof typeof LabelStatusBulkUpdate];

