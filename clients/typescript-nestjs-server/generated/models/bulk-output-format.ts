

/**
 * Bulk file output format
 */
export const BulkOutputFormat = {
    Csv: 'CSV',
    Json: 'JSON'
} as const;
export type BulkOutputFormat = typeof BulkOutputFormat[keyof typeof BulkOutputFormat];

