

/**
 * The source of conversion events ingestion
 */
export const ConversionEventIngestionSource = {
    Tag: 'TAG',
    Mmp: 'MMP',
    FileUpload: 'FILE_UPLOAD',
    ConversionsApi: 'CONVERSIONS_API',
    Native: 'NATIVE'
} as const;
export type ConversionEventIngestionSource = typeof ConversionEventIngestionSource[keyof typeof ConversionEventIngestionSource];

