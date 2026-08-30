

export const EntityLabelStatus = {
    Active: 'ACTIVE',
    Archived: 'ARCHIVED',
    Null: 'NULL'
} as const;
export type EntityLabelStatus = typeof EntityLabelStatus[keyof typeof EntityLabelStatus];

