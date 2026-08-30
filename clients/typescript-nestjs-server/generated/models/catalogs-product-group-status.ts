

export const CatalogsProductGroupStatus = {
    Active: 'ACTIVE',
    Inactive: 'INACTIVE'
} as const;
export type CatalogsProductGroupStatus = typeof CatalogsProductGroupStatus[keyof typeof CatalogsProductGroupStatus];

