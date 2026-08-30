

export const MediaUploadStatus = {
    Registered: 'registered',
    Processing: 'processing',
    Succeeded: 'succeeded',
    Failed: 'failed'
} as const;
export type MediaUploadStatus = typeof MediaUploadStatus[keyof typeof MediaUploadStatus];

