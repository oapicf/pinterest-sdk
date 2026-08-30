

/**
 * Format of generated report
 */
export const DataOutputFormat = {
    Json: 'JSON',
    Csv: 'CSV'
} as const;
export type DataOutputFormat = typeof DataOutputFormat[keyof typeof DataOutputFormat];

