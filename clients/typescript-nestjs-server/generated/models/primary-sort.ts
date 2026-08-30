

/**
 * Whether to first sort the report by date or by ID
 */
export const PrimarySort = {
    ById: 'BY_ID',
    ByDate: 'BY_DATE'
} as const;
export type PrimarySort = typeof PrimarySort[keyof typeof PrimarySort];

