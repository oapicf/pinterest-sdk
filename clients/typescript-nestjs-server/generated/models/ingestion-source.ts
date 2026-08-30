

export const IngestionSource = {
    Tag: 'TAG',
    Mmp: 'MMP',
    FileUpload: 'FILE_UPLOAD',
    ConversionsApi: 'CONVERSIONS_API',
    Native: 'NATIVE'
} as const;
export type IngestionSource = typeof IngestionSource[keyof typeof IngestionSource];

