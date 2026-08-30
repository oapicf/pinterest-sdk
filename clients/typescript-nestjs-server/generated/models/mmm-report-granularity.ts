

export const MMMReportGranularity = {
    Day: 'DAY',
    Week: 'WEEK'
} as const;
export type MMMReportGranularity = typeof MMMReportGranularity[keyof typeof MMMReportGranularity];

