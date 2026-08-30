

export const QueryLabelTypesItems = {
    Brand: 'BRAND',
    Custom: 'CUSTOM'
} as const;
export type QueryLabelTypesItems = typeof QueryLabelTypesItems[keyof typeof QueryLabelTypesItems];

