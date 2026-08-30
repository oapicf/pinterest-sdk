

export const QueryLabelEntityStatusesItems = {
    Active: 'ACTIVE',
    Archived: 'ARCHIVED'
} as const;
export type QueryLabelEntityStatusesItems = typeof QueryLabelEntityStatusesItems[keyof typeof QueryLabelEntityStatusesItems];

