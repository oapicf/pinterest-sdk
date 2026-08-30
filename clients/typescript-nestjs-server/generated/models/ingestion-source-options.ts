

/**
 * List of ingestion sources for a conversion event.
 */
export const IngestionSourceOptions = {
    Tag: 'TAG',
    Mmp: 'MMP',
    FileUpload: 'FILE_UPLOAD',
    ConversionsApi: 'CONVERSIONS_API',
    Native: 'NATIVE'
} as const;
export type IngestionSourceOptions = typeof IngestionSourceOptions[keyof typeof IngestionSourceOptions];

