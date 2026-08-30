

export const ReportType = {
    Sync: 'SYNC',
    Async: 'ASYNC'
} as const;
export type ReportType = typeof ReportType[keyof typeof ReportType];

