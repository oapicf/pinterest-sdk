

/**
 * Status of a leads export job
 */
export const LeadsExportStatus = {
    InProgress: 'IN_PROGRESS',
    Finished: 'FINISHED',
    Failed: 'FAILED'
} as const;
export type LeadsExportStatus = typeof LeadsExportStatus[keyof typeof LeadsExportStatus];

